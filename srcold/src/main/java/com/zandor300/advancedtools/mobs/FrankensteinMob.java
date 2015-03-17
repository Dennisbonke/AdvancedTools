package com.zandor300.advancedtools.mobs;

import java.util.Calendar;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeModContainer;

public class FrankensteinMob extends EntityMob {
	protected static final IAttribute field_110186_bp = (new RangedAttribute(
			"zombie.spawnReinforcements", 0.0D, 0.0D, 1.0D))
			.setDescription("Spawn Reinforcements Chance");
	private final EntityAIBreakDoor field_146075_bs = new EntityAIBreakDoor(
			this);
	private static final String __OBFID = "CL_00001699";
	private boolean field_146076_bu = false;
	private float field_146074_bv = -1.0F;
	private float field_146073_bw;

	public FrankensteinMob(World par1World) {
		super(par1World);
		this.getNavigator().setBreakDoors(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this,
				EntityPlayer.class, 1.0D, false));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this,
				EntityVillager.class, 1.0D, true));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
		this.tasks
				.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
		this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(8, new EntityAIWatchClosest(this,
				EntityPlayer.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this,
				EntityPlayer.class, 0, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this,
				EntityVillager.class, 0, false));
		this.setSize(0.6F, 1.8F);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.getDataWatcher().addObject(12, Byte.valueOf((byte) 0));
		this.getDataWatcher().addObject(13, Byte.valueOf((byte) 0));
		this.getDataWatcher().addObject(14, Byte.valueOf((byte) 0));
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate() {
		super.onUpdate();
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
				.setBaseValue(25.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed)
				.setBaseValue(0.800000011920929D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange)
				.setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed)
				.setBaseValue(0.23000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage)
				.setBaseValue(3.0D);
	}

	/**
	 * Finds the closest player within 16 blocks to attack, or null if this
	 * Entity isn't interested in attacking (Animals, Spiders at day, peaceful
	 * PigZombies).
	 */
	@Override
	protected Entity findPlayerToAttack() {
		float f = this.getBrightness(1.0F);

		if (f < 0.5F) {
			double d0 = 16.0D;
			return this.worldObj.getClosestVulnerablePlayerToEntity(this, d0);
		} else
			return null;
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	@Override
	protected String getLivingSound() {
		return "mob.zombie.say";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	@Override
	protected String getHurtSound() {
		return "mob.zombie.hurt";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	@Override
	protected String getDeathSound() {
		return "mob.zombie.death";
	}

	@Override
	protected void func_145780_a(int p_145780_1_, int p_145780_2_,
			int p_145780_3_, Block p_145780_4_) {
		this.playSound("mob.zombie.step", 0.15F, 1.0F);
	}

	/**
	 * Basic mob attack. Default to touch of death in EntityCreature. Overridden
	 * by each mob to define their attack.
	 */
	@Override
	protected void attackEntity(Entity par1Entity, float par2) {
		float f1 = this.getBrightness(1.0F);

		if (f1 > 0.5F && this.rand.nextInt(100) == 0)
			this.entityToAttack = null;
		else if (par2 > 2.0F && par2 < 6.0F && this.rand.nextInt(10) == 0) {
			if (this.onGround) {
				double d0 = par1Entity.posX - this.posX;
				double d1 = par1Entity.posZ - this.posZ;
				float f2 = MathHelper.sqrt_double(d0 * d0 + d1 * d1);
				this.motionX = d0 / f2 * 0.5D * 0.800000011920929D
						+ this.motionX * 0.20000000298023224D;
				this.motionZ = d1 / f2 * 0.5D * 0.800000011920929D
						+ this.motionZ * 0.20000000298023224D;
				this.motionY = 0.0000000059604645D;
			}
		} else
			super.attackEntity(par1Entity, par2);
	}

	@Override
	protected Item getDropItem() {
		return Items.apple;
	}

	/**
	 * Get this Entity's EnumCreatureAttribute
	 */
	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEAD;
	}

	@Override
	protected void dropRareDrop(int par1) {
		switch (this.rand.nextInt(3)) {
		case 0:
			this.dropItem(Items.iron_ingot, 1);
			break;
		case 1:
			this.dropItem(Items.carrot, 1);
			break;
		case 2:
			this.dropItem(Items.potato, 1);
		}
	}

	@Override
	public boolean isPotionApplicable(PotionEffect par1PotionEffect) {
		return par1PotionEffect.getPotionID() == Potion.poison.id ? false
				: super.isPotionApplicable(par1PotionEffect);
	}

	public boolean func_146072_bX() {
		return this.field_146076_bu;
	}

	public void func_146070_a(boolean p_146070_1_) {
		if (this.field_146076_bu != p_146070_1_) {
			this.field_146076_bu = p_146070_1_;

			if (p_146070_1_)
				this.tasks.addTask(1, this.field_146075_bs);
			else
				this.tasks.removeTask(this.field_146075_bs);
		}
	}

	private GroupData groupdata;

	@Override
	public IEntityLivingData onSpawnWithEgg(
			IEntityLivingData par1EntityLivingData) {
		Object par1EntityLivingData1 = super
				.onSpawnWithEgg(par1EntityLivingData);
		float f = this.worldObj.func_147462_b(this.posX, this.posY, this.posZ);
		this.setCanPickUpLoot(this.rand.nextFloat() < 0.55F * f);

		if (par1EntityLivingData1 == null)
			par1EntityLivingData1 = new FrankensteinMob.GroupData(
					this.worldObj.rand.nextFloat() < ForgeModContainer.zombieBabyChance,
					this.worldObj.rand.nextFloat() < 0.05F, null);

		if (par1EntityLivingData1 instanceof GroupData)
			groupdata = (GroupData) par1EntityLivingData1;

		this.func_146070_a(this.rand.nextFloat() < f * 0.1F);
		this.addRandomArmor();
		this.enchantEquipment();

		if (this.getEquipmentInSlot(4) == null) {
			Calendar calendar = this.worldObj.getCurrentDate();

			if (calendar.get(2) + 1 == 10 && calendar.get(5) == 31
					&& this.rand.nextFloat() < 0.25F) {
				this.setCurrentItemOrArmor(
						4,
						new ItemStack(
								this.rand.nextFloat() < 0.1F ? Blocks.lit_pumpkin
										: Blocks.pumpkin));
				this.equipmentDropChances[4] = 0.0F;
			}
		}

		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance)
				.applyModifier(
						new AttributeModifier("Random spawn bonus", this.rand
								.nextDouble() * 0.05000000074505806D, 0));
		double d0 = this.rand.nextDouble() * 1.5D
				* this.worldObj.func_147462_b(this.posX, this.posY, this.posZ);

		if (d0 > 1.0D)
			this.getEntityAttribute(SharedMonsterAttributes.followRange)
					.applyModifier(
							new AttributeModifier("Random zombie-spawn bonus",
									d0, 2));

		if (this.rand.nextFloat() < f * 0.05F) {
			this.getEntityAttribute(field_110186_bp).applyModifier(
					new AttributeModifier("Leader zombie bonus", this.rand
							.nextDouble() * 0.25D + 0.5D, 0));
			this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
					.applyModifier(
							new AttributeModifier("Leader zombie bonus",
									this.rand.nextDouble() * 3.0D + 1.0D, 2));
			this.func_146070_a(true);
		}

		return (IEntityLivingData) par1EntityLivingData1;
	}

	@Override
	protected final void setSize(float par1, float par2) {
		boolean flag = this.field_146074_bv > 0.0F
				&& this.field_146073_bw > 0.0F;
		this.field_146074_bv = par1;
		this.field_146073_bw = par2;

		if (!flag)
					this.func_146069_a(1.0F);
	}

	protected final void func_146069_a(float p_146069_1_) {
		super.setSize(this.field_146074_bv * p_146069_1_, this.field_146073_bw
				* p_146069_1_);
	}

	class GroupData implements IEntityLivingData {
		public boolean field_142048_a;
		public boolean field_142046_b;
		private static final String __OBFID = "CL_00001704";

		private GroupData(boolean par2, boolean par3) {
			this.field_142048_a = false;
			this.field_142046_b = false;
			this.field_142048_a = par2;
			this.field_142046_b = par3;
		}

		GroupData(boolean par2, boolean par3, Object par4EntityZombieINNER1) {
			this(par2, par3);
		}
	}

}