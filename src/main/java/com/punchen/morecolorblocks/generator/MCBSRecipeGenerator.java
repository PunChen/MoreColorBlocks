package com.punchen.morecolorblocks.generator;

import com.punchen.morecolorblocks.colors.ConfigColor;
import com.punchen.morecolorblocks.items.ColorItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.predicate.NumberRange;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.world.gen.feature.Feature.SIMPLE_BLOCK;

public class MCBSRecipeGenerator extends FabricRecipeProvider {

    public MCBSRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


    private void addRecipeForColor1(RecipeExporter exporter, Item gameItem, Item tgtItem) {
        ShapelessRecipeJsonBuilder
                .create(RecipeCategory.DECORATIONS, tgtItem, 1)
                .input(gameItem)
                .input(Items.POTION, 1)
                .criterion(FabricRecipeProvider.hasItem(gameItem),
                        FabricRecipeProvider.conditionsFromItem(gameItem))
                .offerTo(exporter);
    }

    private void addRecipeForColor2(RecipeExporter exporter, Item gameItem, Item tgtItem) {
        ShapelessRecipeJsonBuilder
                .create(RecipeCategory.DECORATIONS, tgtItem)
                .input(gameItem)
                .input(Items.POTION, 2)
                .criterion(FabricRecipeProvider.hasItem(gameItem),
                        FabricRecipeProvider.conditionsFromItem(gameItem))
                .criterion(FabricRecipeProvider.hasItem(Items.POTION),
                        FabricRecipeProvider.conditionsFromItem(NumberRange.IntRange.atLeast(2), Items.POTION))
                .offerTo(exporter);
    }

    private void addRecipeForColor3(RecipeExporter exporter, Item gameItem, Item tgtItem) {
        ShapelessRecipeJsonBuilder
                .create(RecipeCategory.DECORATIONS, tgtItem)
                .input(gameItem)
                .input(Items.POTION, 3)
                .criterion(FabricRecipeProvider.hasItem(gameItem),
                        FabricRecipeProvider.conditionsFromItem(gameItem))
                .criterion(FabricRecipeProvider.hasItem(Items.POTION),
                        FabricRecipeProvider.conditionsFromItem(NumberRange.IntRange.atLeast(3), Items.POTION))
                .offerTo(exporter);
    }

    private void addComplexRecipeForColor(RecipeExporter exporter, Item gameItem1, Item gameItem2, Item tgtItem) {
        ShapelessRecipeJsonBuilder
                .create(RecipeCategory.DECORATIONS, tgtItem, 2)
                .input(gameItem1)
                .input(gameItem2)
                .criterion(FabricRecipeProvider.hasItem(gameItem1),
                        FabricRecipeProvider.conditionsFromItem(gameItem2))
                .criterion(FabricRecipeProvider.hasItem(gameItem1),
                        FabricRecipeProvider.conditionsFromItem(gameItem2))
                .offerTo(exporter);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        // 染料配方 燃料+水瓶 进行稀释
        // 纯色稀释
        addRecipeForColor1(exporter, Items.RED_DYE, ColorItems.RED_1_DYE);
        addRecipeForColor2(exporter, Items.RED_DYE, ColorItems.RED_2_DYE);
        addRecipeForColor3(exporter, Items.RED_DYE, ColorItems.RED_3_DYE);

        addRecipeForColor1(exporter, Items.PURPLE_DYE, ColorItems.PURPLE_1_DYE);
        addRecipeForColor2(exporter, Items.PURPLE_DYE, ColorItems.PURPLE_2_DYE);
        addRecipeForColor3(exporter, Items.PURPLE_DYE, ColorItems.PURPLE_3_DYE);

        addRecipeForColor1(exporter, Items.BLUE_DYE, ColorItems.BLUE_1_DYE);
        addRecipeForColor2(exporter, Items.BLUE_DYE, ColorItems.BLUE_2_DYE);
        addRecipeForColor3(exporter, Items.BLUE_DYE, ColorItems.BLUE_3_DYE);

        addRecipeForColor1(exporter, Items.GREEN_DYE, ColorItems.GREEN_1_DYE);
        addRecipeForColor2(exporter, Items.GREEN_DYE, ColorItems.GREEN_2_DYE);
        addRecipeForColor3(exporter, Items.GREEN_DYE, ColorItems.GREEN_3_DYE);

        addRecipeForColor1(exporter, Items.YELLOW_DYE, ColorItems.YELLOW_1_DYE);
        addRecipeForColor2(exporter, Items.YELLOW_DYE, ColorItems.YELLOW_2_DYE);
        addRecipeForColor3(exporter, Items.YELLOW_DYE, ColorItems.YELLOW_3_DYE);

        addRecipeForColor1(exporter, Items.ORANGE_DYE, ColorItems.ORANGE_1_DYE);
        addRecipeForColor2(exporter, Items.ORANGE_DYE, ColorItems.ORANGE_2_DYE);
        addRecipeForColor3(exporter, Items.ORANGE_DYE, ColorItems.ORANGE_3_DYE);

        // 混合色
        addComplexRecipeForColor(exporter, ColorItems.RED_1_DYE, ColorItems.PURPLE_1_DYE, ColorItems.RED_PURPLE_1_DYE);
        addComplexRecipeForColor(exporter, ColorItems.RED_2_DYE, ColorItems.PURPLE_2_DYE, ColorItems.RED_PURPLE_2_DYE);
        addComplexRecipeForColor(exporter, ColorItems.RED_3_DYE, ColorItems.PURPLE_3_DYE, ColorItems.RED_PURPLE_3_DYE);

        addComplexRecipeForColor(exporter, ColorItems.PURPLE_1_DYE, ColorItems.BLUE_1_DYE, ColorItems.PURPLE_BLUE_1_DYE);
        addComplexRecipeForColor(exporter, ColorItems.PURPLE_2_DYE, ColorItems.BLUE_2_DYE, ColorItems.PURPLE_BLUE_2_DYE);
        addComplexRecipeForColor(exporter, ColorItems.PURPLE_3_DYE, ColorItems.BLUE_3_DYE, ColorItems.PURPLE_BLUE_3_DYE);

        addComplexRecipeForColor(exporter, ColorItems.BLUE_1_DYE, ColorItems.GREEN_1_DYE, ColorItems.BLUE_GREEN_1_DYE);
        addComplexRecipeForColor(exporter, ColorItems.BLUE_2_DYE, ColorItems.GREEN_2_DYE, ColorItems.BLUE_GREEN_2_DYE);
        addComplexRecipeForColor(exporter, ColorItems.BLUE_3_DYE, ColorItems.GREEN_3_DYE, ColorItems.BLUE_GREEN_3_DYE);

        addComplexRecipeForColor(exporter, ColorItems.YELLOW_1_DYE, ColorItems.GREEN_1_DYE, ColorItems.YELLOW_GREEN_1_DYE);
        addComplexRecipeForColor(exporter, ColorItems.YELLOW_2_DYE, ColorItems.GREEN_2_DYE, ColorItems.YELLOW_GREEN_2_DYE);
        addComplexRecipeForColor(exporter, ColorItems.YELLOW_3_DYE, ColorItems.GREEN_3_DYE, ColorItems.YELLOW_GREEN_3_DYE);

        addComplexRecipeForColor(exporter, ColorItems.ORANGE_1_DYE, ColorItems.YELLOW_1_DYE, ColorItems.ORANGE_YELLOW_1_DYE);
        addComplexRecipeForColor(exporter, ColorItems.ORANGE_2_DYE, ColorItems.YELLOW_2_DYE, ColorItems.ORANGE_YELLOW_2_DYE);
        addComplexRecipeForColor(exporter, ColorItems.ORANGE_3_DYE, ColorItems.YELLOW_3_DYE, ColorItems.ORANGE_YELLOW_3_DYE);

        addComplexRecipeForColor(exporter, ColorItems.ORANGE_1_DYE, ColorItems.RED_1_DYE, ColorItems.ORANGE_RED_1_DYE);
        addComplexRecipeForColor(exporter, ColorItems.ORANGE_2_DYE, ColorItems.RED_2_DYE, ColorItems.ORANGE_RED_2_DYE);
        addComplexRecipeForColor(exporter, ColorItems.ORANGE_3_DYE, ColorItems.RED_3_DYE, ColorItems.ORANGE_RED_3_DYE);

        // 混凝土粉末合成
        for (ConfigColor color : ConfigColor.values()) {
            Item powderItem = ColorItems.colorPowderItemMap.get(color);
            Item dyeItem = ColorItems.colorDyeItemMap.get(color);
            ShapelessRecipeJsonBuilder
                    .create(RecipeCategory.BUILDING_BLOCKS, powderItem, 8)
                    .input(dyeItem, 1)
                    .input(Items.SAND, 4)
                    .input(Items.GRAVEL, 4)
                    .criterion(FabricRecipeProvider.hasItem(dyeItem), FabricRecipeProvider.conditionsFromItem(NumberRange.IntRange.atLeast(1), dyeItem))
                    .criterion(FabricRecipeProvider.hasItem(Items.SAND), FabricRecipeProvider.conditionsFromItem(NumberRange.IntRange.atLeast(4), Items.SAND))
                    .criterion(FabricRecipeProvider.hasItem(Items.GRAVEL), FabricRecipeProvider.conditionsFromItem(NumberRange.IntRange.atLeast(4), Items.GRAVEL))
                    .offerTo(exporter);
        }
    }
}
