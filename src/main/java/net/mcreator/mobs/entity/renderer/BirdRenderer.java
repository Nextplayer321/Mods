package net.mcreator.mobs.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.mobs.entity.BirdEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BirdRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BirdEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBird(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("mobs:textures/birdtexture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBird extends EntityModel<Entity> {
		private final ModelRenderer Tudo;
		private final ModelRenderer Peitoral;
		private final ModelRenderer Calda;
		private final ModelRenderer Calda_r1;
		private final ModelRenderer AsaDir;
		private final ModelRenderer AsaEsq;
		private final ModelRenderer PataDir;
		private final ModelRenderer PataEsq;
		private final ModelRenderer Cabecaebico;
		private final ModelRenderer Cabeca;
		private final ModelRenderer Bico;
		public ModelBird() {
			textureWidth = 32;
			textureHeight = 32;
			Tudo = new ModelRenderer(this);
			Tudo.setRotationPoint(-2.0F, 27.0F, 0.0F);
			Peitoral = new ModelRenderer(this);
			Peitoral.setRotationPoint(2.0F, -3.0F, 0.0F);
			Tudo.addChild(Peitoral);
			Peitoral.setTextureOffset(0, 0).addBox(-2.5F, -7.0F, -2.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			Calda = new ModelRenderer(this);
			Calda.setRotationPoint(2.0F, -3.0F, 0.0F);
			Tudo.addChild(Calda);
			Calda_r1 = new ModelRenderer(this);
			Calda_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Calda.addChild(Calda_r1);
			setRotationAngle(Calda_r1, 0.3927F, 0.0F, 0.0F);
			Calda_r1.setTextureOffset(16, 0).addBox(-1.5F, -3.0F, 4.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			AsaDir = new ModelRenderer(this);
			AsaDir.setRotationPoint(-1.0F, -9.0F, 1.0F);
			Tudo.addChild(AsaDir);
			AsaDir.setTextureOffset(12, 15).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 4.0F, 5.0F, 0.0F, false);
			AsaEsq = new ModelRenderer(this);
			AsaEsq.setRotationPoint(0.0F, 0.0F, 0.0F);
			Tudo.addChild(AsaEsq);
			AsaEsq.setTextureOffset(0, 20).addBox(4.5F, -10.0F, -1.0F, 1.0F, 4.0F, 5.0F, 0.0F, false);
			PataDir = new ModelRenderer(this);
			PataDir.setRotationPoint(3.0F, -5.0F, 1.0F);
			Tudo.addChild(PataDir);
			PataDir.setTextureOffset(16, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			PataDir.setTextureOffset(13, 13).addBox(-0.5F, 2.0F, -1.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			PataEsq = new ModelRenderer(this);
			PataEsq.setRotationPoint(1.0F, -5.0F, 1.0F);
			Tudo.addChild(PataEsq);
			PataEsq.setTextureOffset(0, 11).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			PataEsq.setTextureOffset(13, 11).addBox(-0.5F, 2.0F, -1.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			Cabecaebico = new ModelRenderer(this);
			Cabecaebico.setRotationPoint(2.0F, -8.0F, -1.0F);
			Tudo.addChild(Cabecaebico);
			Cabeca = new ModelRenderer(this);
			Cabeca.setRotationPoint(0.0F, 0.0F, 0.0F);
			Cabecaebico.addChild(Cabeca);
			Cabeca.setTextureOffset(0, 11).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			Bico = new ModelRenderer(this);
			Bico.setRotationPoint(0.0F, 5.0F, 1.0F);
			Cabecaebico.addChild(Bico);
			Bico.setTextureOffset(0, 0).addBox(0.0F, -7.0F, -7.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Tudo.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.PataDir.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.PataEsq.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.Cabecaebico.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Cabecaebico.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
