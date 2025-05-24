package com.punchen.morecolorblocks.generator;

import com.punchen.morecolorblocks.colors.ConfigColor;
import com.punchen.morecolorblocks.items.ColorItems;
import com.punchen.morecolorblocks.utils.Reference;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.Optional;

import static com.punchen.morecolorblocks.block.ColorBlocks.colorBlockMap;

public class MCBSModelProvider extends FabricModelProvider {
    public MCBSModelProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    @Override
    public String getName() {
        return "MoreColorBlocksModelProvider";
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (ConfigColor color : colorBlockMap.keySet()) {
            blockStateModelGenerator.registerSingleton(colorBlockMap.get(color),
                    TextureMap.all(Identifier.ofVanilla("block/white_concrete")), LEAVES_MODEL);
        }
    }

    // 以树叶作为父类，手动修改颜色
    public static final Model LEAVES_MODEL = block("block/leaves", TextureKey.ALL);

    //helper method for creating Models
    private static Model block(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.ofVanilla(parent)), Optional.empty(), requiredTextureKeys);
    }

    //helper method for creating Models with variants
    private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(Reference.MOD_ID, "block/" + parent)), Optional.of(variant), requiredTextureKeys);
    }

}