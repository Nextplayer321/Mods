// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelToucan extends EntityModel<Entity> {
	private final ModelRenderer Corpotodo;
	private final ModelRenderer peitoral;
	private final ModelRenderer pernas;
	private final ModelRenderer cabeca;
	private final ModelRenderer calda;
	private final ModelRenderer cube_r1;
	private final ModelRenderer asas;
	private final ModelRenderer asas2_r1;

	public ModelToucan() {
		textureWidth = 32;
		textureHeight = 32;

		Corpotodo = new ModelRenderer(this);
		Corpotodo.setRotationPoint(0.0F, 25.0F, 2.0F);
		setRotationAngle(Corpotodo, 0.0F, -1.5708F, 0.0F);

		peitoral = new ModelRenderer(this);
		peitoral.setRotationPoint(3.0F, 0.0F, 0.0F);
		Corpotodo.addChild(peitoral);
		setRotationAngle(peitoral, 0.0F, 0.0F, -0.6109F);
		peitoral.setTextureOffset(0, 7).addBox(-1.0F, -11.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		pernas = new ModelRenderer(this);
		pernas.setRotationPoint(0.0F, 0.0F, 1.0F);
		Corpotodo.addChild(pernas);
		pernas.setTextureOffset(2, 19).addBox(1.0F, -4.0F, -0.6F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		pernas.setTextureOffset(2, 23).addBox(0.0F, -1.0F, -0.6F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		pernas.setTextureOffset(0, 23).addBox(0.0F, -1.0F, -2.3F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		pernas.setTextureOffset(0, 19).addBox(1.0F, -4.0F, -2.3F, 0.0F, 3.0F, 1.0F, 0.0F, false);

		cabeca = new ModelRenderer(this);
		cabeca.setRotationPoint(0.0F, -1.0F, 0.0F);
		Corpotodo.addChild(cabeca);
		cabeca.setTextureOffset(0, 0).addBox(-9.6F, -11.1F, -1.5F, 8.0F, 3.0F, 3.0F, 0.0F, false);

		calda = new ModelRenderer(this);
		calda.setRotationPoint(0.0F, -1.0F, 0.0F);
		Corpotodo.addChild(calda);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		calda.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.2618F);
		cube_r1.setTextureOffset(17, 7).addBox(1.0F, -4.5F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);

		asas = new ModelRenderer(this);
		asas.setRotationPoint(-2.0F, -1.0F, 0.0F);
		Corpotodo.addChild(asas);
		setRotationAngle(asas, 0.0F, 1.5708F, 0.0F);

		asas2_r1 = new ModelRenderer(this);
		asas2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		asas.addChild(asas2_r1);
		setRotationAngle(asas2_r1, 0.6981F, 0.0F, 0.0F);
		asas2_r1.setTextureOffset(15, 19).addBox(-3.0F, -6.32F, 3.54F, 1.0F, 6.0F, 4.0F, 0.0F, false);
		asas2_r1.setTextureOffset(5, 19).addBox(2.0F, -6.32F, 3.54F, 1.0F, 6.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Corpotodo.render(matrixStack, buffer, packedLight, packedOverlay);
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