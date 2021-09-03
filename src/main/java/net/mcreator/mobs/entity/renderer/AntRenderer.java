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

import net.mcreator.mobs.entity.AntEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AntRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AntEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelAnt(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("mobs:textures/anttexture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelAnt extends EntityModel<Entity> {
		private final ModelRenderer Corpotodo;
		private final ModelRenderer Garras1;
		private final ModelRenderer Garras2;
		private final ModelRenderer Antenas;
		private final ModelRenderer Patas;
		private final ModelRenderer pata1_r1;
		private final ModelRenderer Pata2;
		private final ModelRenderer pata2_r1;
		private final ModelRenderer Pata3;
		private final ModelRenderer pata3_r1;
		private final ModelRenderer Patas2;
		private final ModelRenderer pata1_r2;
		private final ModelRenderer Pata4;
		private final ModelRenderer pata2_r2;
		private final ModelRenderer Pata5;
		private final ModelRenderer pata3_r2;
		private final ModelRenderer Pescoco;
		private final ModelRenderer Peitoral;
		private final ModelRenderer cabeca;
		public ModelAnt() {
			textureWidth = 64;
			textureHeight = 64;
			Corpotodo = new ModelRenderer(this);
			Corpotodo.setRotationPoint(0.0F, 32.0F, -2.0F);
			Garras1 = new ModelRenderer(this);
			Garras1.setRotationPoint(3.0F, 0.0F, -1.0F);
			Corpotodo.addChild(Garras1);
			setRotationAngle(Garras1, 0.0F, 0.5672F, 0.0F);
			Garras1.setTextureOffset(20, 0).addBox(-4.0F, -10.7F, -10.0F, 2.0F, 0.0F, 6.0F, 0.0F, false);
			Garras1.setTextureOffset(27, 8).addBox(-2.0F, -10.7F, -10.0F, 2.0F, 0.0F, 2.0F, 0.0F, false);
			Garras2 = new ModelRenderer(this);
			Garras2.setRotationPoint(-3.0F, 0.0F, -1.0F);
			Corpotodo.addChild(Garras2);
			setRotationAngle(Garras2, 0.0F, -0.5672F, 0.0F);
			Garras2.setTextureOffset(19, 14).addBox(2.0F, -10.7F, -10.0F, 2.0F, 0.0F, 6.0F, 0.0F, false);
			Garras2.setTextureOffset(11, 27).addBox(0.0F, -10.7F, -10.0F, 2.0F, 0.0F, 2.0F, 0.0F, false);
			Antenas = new ModelRenderer(this);
			Antenas.setRotationPoint(0.0F, -6.0F, 1.0F);
			Corpotodo.addChild(Antenas);
			Antenas.setTextureOffset(19, 14).addBox(-2.0F, -13.7F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			Antenas.setTextureOffset(20, 0).addBox(2.0F, -13.7F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			Antenas.setTextureOffset(0, 14).addBox(-2.0F, -13.7F, -2.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Antenas.setTextureOffset(3, 14).addBox(2.0F, -13.7F, -2.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Patas = new ModelRenderer(this);
			Patas.setRotationPoint(-2.0F, -1.0F, 0.0F);
			Corpotodo.addChild(Patas);
			pata1_r1 = new ModelRenderer(this);
			pata1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Patas.addChild(pata1_r1);
			setRotationAngle(pata1_r1, 0.0F, 0.0F, 0.6404F);
			pata1_r1.setTextureOffset(27, 6).addBox(-3.63F, -9.7F, -1.0F, 5.0F, 0.0F, 1.0F, 0.0F, false);
			Pata2 = new ModelRenderer(this);
			Pata2.setRotationPoint(0.0F, 0.0F, 0.0F);
			Patas.addChild(Pata2);
			pata2_r1 = new ModelRenderer(this);
			pata2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Pata2.addChild(pata2_r1);
			setRotationAngle(pata2_r1, -0.2058F, -0.3491F, 0.6404F);
			pata2_r1.setTextureOffset(0, 27).addBox(-3.11F, -9.7F, -1.0F, 5.0F, 0.0F, 1.0F, 0.0F, false);
			Pata3 = new ModelRenderer(this);
			Pata3.setRotationPoint(0.0F, 0.0F, 0.0F);
			Patas.addChild(Pata3);
			pata3_r1 = new ModelRenderer(this);
			pata3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Pata3.addChild(pata3_r1);
			setRotationAngle(pata3_r1, 0.2093F, 0.3918F, 0.65F);
			pata3_r1.setTextureOffset(24, 26).addBox(-3.11F, -9.7F, -1.0F, 5.0F, 0.0F, 1.0F, 0.0F, false);
			Patas2 = new ModelRenderer(this);
			Patas2.setRotationPoint(2.0F, -1.0F, 0.0F);
			Corpotodo.addChild(Patas2);
			setRotationAngle(Patas2, -3.1416F, 0.3491F, 3.1416F);
			pata1_r2 = new ModelRenderer(this);
			pata1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			Patas2.addChild(pata1_r2);
			setRotationAngle(pata1_r2, 0.0F, 0.0F, 0.6404F);
			pata1_r2.setTextureOffset(25, 24).addBox(-3.63F, -9.7F, -1.0F, 5.0F, 0.0F, 1.0F, 0.0F, false);
			Pata4 = new ModelRenderer(this);
			Pata4.setRotationPoint(0.0F, 0.0F, 0.0F);
			Patas2.addChild(Pata4);
			pata2_r2 = new ModelRenderer(this);
			pata2_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			Pata4.addChild(pata2_r2);
			setRotationAngle(pata2_r2, -0.2093F, -0.3918F, 0.65F);
			pata2_r2.setTextureOffset(25, 22).addBox(-3.18F, -9.7F, -1.0F, 5.0F, 0.0F, 1.0F, 0.0F, false);
			Pata5 = new ModelRenderer(this);
			Pata5.setRotationPoint(0.0F, 0.0F, 0.0F);
			Patas2.addChild(Pata5);
			pata3_r2 = new ModelRenderer(this);
			pata3_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			Pata5.addChild(pata3_r2);
			setRotationAngle(pata3_r2, 0.2058F, 0.3491F, 0.6404F);
			pata3_r2.setTextureOffset(25, 20).addBox(-3.18F, -9.7F, -1.0F, 5.0F, 0.0F, 1.0F, 0.0F, false);
			Pescoco = new ModelRenderer(this);
			Pescoco.setRotationPoint(0.0F, -1.0F, 0.0F);
			Corpotodo.addChild(Pescoco);
			Pescoco.setTextureOffset(0, 0).addBox(-1.0F, -11.7F, 2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			Peitoral = new ModelRenderer(this);
			Peitoral.setRotationPoint(0.0F, -7.0F, 2.0F);
			Corpotodo.addChild(Peitoral);
			Peitoral.setTextureOffset(0, 0).addBox(-3.0F, -7.7F, 1.0F, 6.0F, 6.0F, 7.0F, 0.0F, false);
			cabeca = new ModelRenderer(this);
			cabeca.setRotationPoint(0.0F, -7.0F, 2.0F);
			Corpotodo.addChild(cabeca);
			cabeca.setTextureOffset(0, 14).addBox(-3.0F, -8.7F, -6.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Corpotodo.render(matrixStack, buffer, packedLight, packedOverlay);
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
