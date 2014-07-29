package com.insane.simpleachievements;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.insane.simpleachievements.client.gui.GuiSA;

/**
 * Created by Michael on 29/07/2014.
 */
public class BlockAchievementBlock extends Block {


    public BlockAchievementBlock(int par1) {
        super(par1, Material.wood);
        this.setUnlocalizedName("Achievement Station");
    }

    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9) {
        player.openGui(SimpleAchievements.instance, GuiSA.GUI_ID, par1World, par2, par3, par4);
        return true;
    }
}
