// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelChapeu extends EntityModel<Entity> {
	private final ModelRenderer Tudo;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public ModelChapeu() {
		textureWidth = 128;
		textureHeight = 128;

		Tudo = new ModelRenderer(this);
		Tudo.setRotationPoint(0.0F, 16.0F, 0.0F);
		Tudo.setTextureOffset(29, 31).addBox(-4.0F, 2.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
		Tudo.setTextureOffset(0, 14).addBox(-5.0F, 5.0F, -5.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);
		Tudo.setTextureOffset(0, 7).addBox(-0.75F, -2.5F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Tudo.setTextureOffset(0, 28).addBox(-4.75F, 4.0F, -4.75F, 9.0F, 1.0F, 9.0F, 0.0F, false);
		Tudo.setTextureOffset(0, 0).addBox(-6.0F, 7.0F, -6.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(9.0F, 22.0F, -11.0F);
		Tudo.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(31, 14).addBox(-11.0F, -25.0F, 0.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(9.0F, 22.0F, -11.0F);
		Tudo.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 0).addBox(-10.0F, -9.0F, 23.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(9.0F, 22.0F, -11.0F);
		Tudo.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(48, 37).addBox(-9.46F, -27.25F, -7.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Tudo.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}