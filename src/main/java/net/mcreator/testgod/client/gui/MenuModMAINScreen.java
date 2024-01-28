package net.mcreator.testgod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.testgod.world.inventory.MenuModMAINMenu;
import net.mcreator.testgod.network.MenuModMAINButtonMessage;
import net.mcreator.testgod.TestgodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MenuModMAINScreen extends AbstractContainerScreen<MenuModMAINMenu> {
	private final static HashMap<String, Object> guistate = MenuModMAINMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_one_for_all;
	Button button_halfcold_halfhot;

	public MenuModMAINScreen(MenuModMAINMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 234;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("testgod:textures/screens/quirk_selector_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.testgod.quirk_selector_gui.label_quirk_selection"), 80, 7, -16777216, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_one_for_all = Button.builder(Component.translatable("gui.testgod.quirk_selector_gui.button_one_for_all"), e -> {
			if (true) {
				TestgodMod.PACKET_HANDLER.sendToServer(new MenuModMAINButtonMessage(0, x, y, z));
				MenuModMAINButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 8, this.topPos + 25, 82, 20).build();
		guistate.put("button:button_one_for_all", button_one_for_all);
		this.addRenderableWidget(button_one_for_all);
		button_halfcold_halfhot = Button.builder(Component.translatable("gui.testgod.quirk_selector_gui.button_halfcold_halfhot"), e -> {
			if (true) {
				TestgodMod.PACKET_HANDLER.sendToServer(new MenuModMAINButtonMessage(1, x, y, z));
				MenuModMAINButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 8, this.topPos + 52, 108, 20).build();
		guistate.put("button:button_halfcold_halfhot", button_halfcold_halfhot);
		this.addRenderableWidget(button_halfcold_halfhot);
	}
}
