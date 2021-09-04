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

import net.mcreator.mobs.entity.DodoEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DodoRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DodoEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelDodo(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("mobs:textures/dodotexture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelDodo extends EntityModel<Entity> {
		private final ModelRenderer Corpo;
		private final ModelRenderer cube_r1;
		public ModelDodo() {
			textureWidth = 128;
			textureHeight = 128;
			Corpo = new ModelRenderer(this);
			Corpo.setRotationPoint(1.0F, 21.0F, 0.0F);
			setRotationAngle(Corpo, 0.0F, 3.1416F, 0.0F);
			Corpo.setTextureOffset(0, 0).addBox(-5.0F, -14.0F, -7.0F, 12.0F, 12.0F, 13.0F, 0.0F, false);
			Corpo.setTextureOffset(0, 26).addBox(-2.0F, -21.0F, 6.0F, 6.0F, 16.0F, 6.0F, 0.0F, false);
			Corpo.setTextureOffset(38, 0).addBox(-2.0F, -17.0F, 12.0F, 6.0F, 3.0F, 5.0F, 0.0F, false);
			Corpo.setTextureOffset(47, 41).addBox(-2.0F, -14.0F, 14.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
			Corpo.setTextureOffset(36, 41).addBox(-6.0F, -13.0F, -4.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
			Corpo.setTextureOffset(17, 41).addBox(7.0F, -13.0F, -4.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
			Corpo.setTextureOffset(28, 41).addBox(-2.0F, -2.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			Corpo.setTextureOffset(25, 26).addBox(3.0F, -2.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			Corpo.setTextureOffset(0, 4).addBox(-3.0F, 2.0F, 1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			Corpo.setTextureOffset(0, 0).addBox(2.0F, 2.0F, 1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			Corpo.setTextureOffset(48, 26).addBox(-1.0F, 2.0F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Corpo.setTextureOffset(45, 9).addBox(-1.0F, 2.0F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Corpo.setTextureOffset(33, 45).addBox(-1.0F, 2.0F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Corpo.setTextureOffset(38, 9).addBox(4.0F, 2.0F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Corpo.setTextureOffset(33, 41).addBox(-3.0F, 2.0F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Corpo.setTextureOffset(0, 8).addBox(2.0F, 2.0F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(2.0F, -17.0F, -11.0F);
			Corpo.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.8727F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(25, 26).addBox(-4.52F, -3.0F, 2.0F, 7.0F, 6.0F, 8.0F, 0.0F, false);
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
