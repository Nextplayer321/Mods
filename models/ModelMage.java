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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Corpo.render(matrixStack, buffer, packedLight, packedOverlay);
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