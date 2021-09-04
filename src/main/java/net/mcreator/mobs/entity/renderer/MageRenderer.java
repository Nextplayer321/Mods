package net.mcreator.mobs.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.mobs.entity.MageEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MageRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MageEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelMage(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("mobs:textures/magetexture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelMage extends EntityModel<Entity> {
		private final ModelRenderer Corpo;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		public ModelMage() {
			textureWidth = 64;
			textureHeight = 64;
			Corpo = new ModelRenderer(this);
			Corpo.setRotationPoint(-2.0F, 18.0F, -3.0F);
			Corpo.setTextureOffset(0, 21).addBox(-1.0F, -6.0F, -1.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			Corpo.setTextureOffset(0, 0).addBox(-2.0F, -9.0F, -2.0F, 7.0F, 3.0F, 7.0F, 0.0F, false);
			Corpo.setTextureOffset(0, 11).addBox(-2.0F, -3.0F, 0.0F, 7.0F, 6.0F, 3.0F, 0.0F, false);
			Corpo.setTextureOffset(18, 34).addBox(-1.5F, 3.0F, 0.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			Corpo.setTextureOffset(32, 14).addBox(2.5F, 3.0F, 0.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			Corpo.setTextureOffset(21, 25).addBox(-1.0F, -3.0F, 3.0F, 5.0F, 5.0F, 3.0F, 0.0F, false);
			Corpo.setTextureOffset(21, 11).addBox(-1.0F, -2.0F, 6.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			Corpo.setTextureOffset(32, 0).addBox(0.0F, 1.0F, 6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Corpo.setTextureOffset(29, 7).addBox(0.0F, 2.0F, 3.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			Corpo.setTextureOffset(0, 21).addBox(1.0F, -5.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(5.0F, -3.0F, 1.0F);
			Corpo.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.6981F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 30).addBox(0.0F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(9, 30).addBox(-9.0F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			Corpo.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.5672F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 0).addBox(1.0F, -11.4F, 9.35F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			Corpo.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.48F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(27, 34).addBox(0.5F, -14.0F, -5.45F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			Corpo.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(22, 0).addBox(0.0F, -13.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			Corpo.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(16, 16).addBox(-1.0F, -11.0F, -3.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Corpo.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
