package net.minecraft.server;

import com.google.common.collect.Lists;

public final class BiomeTaigaHills extends BiomeBase {

    public BiomeTaigaHills() {
        super((new BiomeBase.a()).a(new WorldGenSurfaceComposite(BiomeTaigaHills.au, BiomeTaigaHills.ai)).a(BiomeBase.Precipitation.RAIN).a(BiomeBase.Geography.TAIGA).a(0.45F).b(0.3F).c(0.25F).d(0.8F).a(4159204).b(329011).a((String) null));
        this.a(WorldGenerator.f, (WorldGenFeatureConfiguration) (new WorldGenMineshaftConfiguration(0.004D, WorldGenMineshaft.Type.NORMAL)));
        this.a(WorldGenerator.m, (WorldGenFeatureConfiguration) (new WorldGenFeatureStrongholdConfiguration()));
        this.a(WorldGenStage.Features.AIR, a((WorldGenCarver) BiomeTaigaHills.b, (WorldGenFeatureConfiguration) (new WorldGenFeatureConfigurationChance(0.14285715F))));
        this.a(WorldGenStage.Features.AIR, a((WorldGenCarver) BiomeTaigaHills.d, (WorldGenFeatureConfiguration) (new WorldGenFeatureConfigurationChance(0.02F))));
        this.a();
        this.a(WorldGenStage.Decoration.LOCAL_MODIFICATIONS, a(WorldGenerator.am, new WorldGenFeatureLakeConfiguration(Blocks.WATER), BiomeTaigaHills.K, new WorldGenDecoratorLakeChanceConfiguration(4)));
        this.a(WorldGenStage.Decoration.LOCAL_MODIFICATIONS, a(WorldGenerator.am, new WorldGenFeatureLakeConfiguration(Blocks.LAVA), BiomeTaigaHills.J, new WorldGenDecoratorLakeChanceConfiguration(80)));
        this.a(WorldGenStage.Decoration.UNDERGROUND_STRUCTURES, a(WorldGenerator.ad, WorldGenFeatureConfiguration.e, BiomeTaigaHills.L, new WorldGenDecoratorDungeonConfiguration(8)));
        this.a(WorldGenStage.Decoration.VEGETAL_DECORATION, a(WorldGenerator.aj, new WorldGenFeatureDoublePlantConfiguration(Blocks.LARGE_FERN.getBlockData()), BiomeTaigaHills.i, new WorldGenDecoratorFrequencyConfiguration(7)));
        this.a(WorldGenStage.Decoration.UNDERGROUND_ORES, a(WorldGenerator.an, new WorldGenFeatureOreConfiguration(WorldGenFeatureOreConfiguration.a, Blocks.DIRT.getBlockData(), 33), BiomeTaigaHills.t, new WorldGenFeatureChanceDecoratorCountConfiguration(10, 0, 0, 256)));
        this.a(WorldGenStage.Decoration.UNDERGROUND_ORES, a(WorldGenerator.an, new WorldGenFeatureOreConfiguration(WorldGenFeatureOreConfiguration.a, Blocks.GRAVEL.getBlockData(), 33), BiomeTaigaHills.t, new WorldGenFeatureChanceDecoratorCountConfiguration(8, 0, 0, 256)));
        this.a(WorldGenStage.Decoration.UNDERGROUND_ORES, a(WorldGenerator.an, new WorldGenFeatureOreConfiguration(WorldGenFeatureOreConfiguration.a, Blocks.GRANITE.getBlockData(), 33), BiomeTaigaHills.t, new WorldGenFeatureChanceDecoratorCountConfiguration(10, 0, 0, 80)));
        this.a(WorldGenStage.Decoration.UNDERGROUND_ORES, a(WorldGenerator.an, new WorldGenFeatureOreConfiguration(WorldGenFeatureOreConfiguration.a, Blocks.DIORITE.getBlockData(), 33), BiomeTaigaHills.t, new WorldGenFeatureChanceDecoratorCountConfiguration(10, 0, 0, 80)));
        this.a(WorldGenStage.Decoration.UNDERGROUND_ORES, a(WorldGenerator.an, new WorldGenFeatureOreConfiguration(WorldGenFeatureOreConfiguration.a, Blocks.ANDESITE.getBlockData(), 33), BiomeTaigaHills.t, new WorldGenFeatureChanceDecoratorCountConfiguration(10, 0, 0, 80)));
        this.a(WorldGenStage.Decoration.UNDERGROUND_ORES, a(WorldGenerator.an, new WorldGenFeatureOreConfiguration(WorldGenFeatureOreConfiguration.a, Blocks.COAL_ORE.getBlockData(), 17), BiomeTaigaHills.t, new WorldGenFeatureChanceDecoratorCountConfiguration(20, 0, 0, 128)));
        this.a(WorldGenStage.Decoration.UNDERGROUND_ORES, a(WorldGenerator.an, new WorldGenFeatureOreConfiguration(WorldGenFeatureOreConfiguration.a, Blocks.IRON_ORE.getBlockData(), 9), BiomeTaigaHills.t, new WorldGenFeatureChanceDecoratorCountConfiguration(20, 0, 0, 64)));
        this.a(WorldGenStage.Decoration.UNDERGROUND_ORES, a(WorldGenerator.an, new WorldGenFeatureOreConfiguration(WorldGenFeatureOreConfiguration.a, Blocks.GOLD_ORE.getBlockData(), 9), BiomeTaigaHills.t, new WorldGenFeatureChanceDecoratorCountConfiguration(2, 0, 0, 32)));
        this.a(WorldGenStage.Decoration.UNDERGROUND_ORES, a(WorldGenerator.an, new WorldGenFeatureOreConfiguration(WorldGenFeatureOreConfiguration.a, Blocks.REDSTONE_ORE.getBlockData(), 8), BiomeTaigaHills.t, new WorldGenFeatureChanceDecoratorCountConfiguration(8, 0, 0, 16)));
        this.a(WorldGenStage.Decoration.UNDERGROUND_ORES, a(WorldGenerator.an, new WorldGenFeatureOreConfiguration(WorldGenFeatureOreConfiguration.a, Blocks.DIAMOND_ORE.getBlockData(), 8), BiomeTaigaHills.t, new WorldGenFeatureChanceDecoratorCountConfiguration(1, 0, 0, 16)));
        this.a(WorldGenStage.Decoration.UNDERGROUND_ORES, a(WorldGenerator.an, new WorldGenFeatureOreConfiguration(WorldGenFeatureOreConfiguration.a, Blocks.LAPIS_ORE.getBlockData(), 7), BiomeTaigaHills.A, new WorldGenDecoratorHeightAverageConfiguration(1, 16, 16)));
        this.a(WorldGenStage.Decoration.UNDERGROUND_ORES, a(WorldGenerator.ai, new WorldGenFeatureCircleConfiguration(Blocks.SAND, 7, 2, Lists.newArrayList(new Block[] { Blocks.DIRT, Blocks.GRASS_BLOCK})), BiomeTaigaHills.h, new WorldGenDecoratorFrequencyConfiguration(3)));
        this.a(WorldGenStage.Decoration.UNDERGROUND_ORES, a(WorldGenerator.ai, new WorldGenFeatureCircleConfiguration(Blocks.CLAY, 4, 1, Lists.newArrayList(new Block[] { Blocks.DIRT, Blocks.CLAY})), BiomeTaigaHills.h, new WorldGenDecoratorFrequencyConfiguration(1)));
        this.a(WorldGenStage.Decoration.UNDERGROUND_ORES, a(WorldGenerator.ai, new WorldGenFeatureCircleConfiguration(Blocks.GRAVEL, 6, 2, Lists.newArrayList(new Block[] { Blocks.DIRT, Blocks.GRASS_BLOCK})), BiomeTaigaHills.h, new WorldGenDecoratorFrequencyConfiguration(1)));
        this.a(WorldGenStage.Decoration.VEGETAL_DECORATION, a(WorldGenerator.ap, new WorldGenFeatureRandomChoiceConfiguration(new WorldGenerator[] { WorldGenerator.x}, new WorldGenFeatureConfiguration[] { WorldGenFeatureConfiguration.e}, new float[] { 0.33333334F}, WorldGenerator.A, WorldGenFeatureConfiguration.e), BiomeTaigaHills.s, new WorldGenDecoratorFrequencyExtraChanceConfiguration(10, 0.1F, 1)));
        this.a(WorldGenStage.Decoration.VEGETAL_DECORATION, (WorldGenFeatureComposite) a(WorldGenerator.G, BiomeTaigaHills.i, new WorldGenDecoratorFrequencyConfiguration(2)));
        this.a(WorldGenStage.Decoration.VEGETAL_DECORATION, a(WorldGenerator.L, WorldGenFeatureConfiguration.e, BiomeTaigaHills.j, new WorldGenDecoratorFrequencyConfiguration(1)));
        this.a(WorldGenStage.Decoration.VEGETAL_DECORATION, a(WorldGenerator.ah, new WorldGenFeatureMushroomConfiguration(Blocks.BROWN_MUSHROOM), BiomeTaigaHills.y, new WorldGenDecoratorFrequencyChanceConfiguration(1, 0.25F)));
        this.a(WorldGenStage.Decoration.VEGETAL_DECORATION, a(WorldGenerator.ah, new WorldGenFeatureMushroomConfiguration(Blocks.RED_MUSHROOM), BiomeTaigaHills.z, new WorldGenDecoratorFrequencyChanceConfiguration(1, 0.125F)));
        this.a(WorldGenStage.Decoration.VEGETAL_DECORATION, a(WorldGenerator.ah, new WorldGenFeatureMushroomConfiguration(Blocks.BROWN_MUSHROOM), BiomeTaigaHills.p, new WorldGenDecoratorChanceConfiguration(4)));
        this.a(WorldGenStage.Decoration.VEGETAL_DECORATION, a(WorldGenerator.ah, new WorldGenFeatureMushroomConfiguration(Blocks.RED_MUSHROOM), BiomeTaigaHills.p, new WorldGenDecoratorChanceConfiguration(8)));
        this.a(WorldGenStage.Decoration.VEGETAL_DECORATION, a(WorldGenerator.Z, WorldGenFeatureConfiguration.e, BiomeTaigaHills.j, new WorldGenDecoratorFrequencyConfiguration(10)));
        this.a(WorldGenStage.Decoration.VEGETAL_DECORATION, a(WorldGenerator.Y, WorldGenFeatureConfiguration.e, BiomeTaigaHills.p, new WorldGenDecoratorChanceConfiguration(32)));
        this.a(WorldGenStage.Decoration.VEGETAL_DECORATION, a(WorldGenerator.at, new WorldGenFeatureFlowingConfiguration(FluidTypes.c), BiomeTaigaHills.u, new WorldGenFeatureChanceDecoratorCountConfiguration(50, 8, 8, 256)));
        this.a(WorldGenStage.Decoration.VEGETAL_DECORATION, a(WorldGenerator.at, new WorldGenFeatureFlowingConfiguration(FluidTypes.e), BiomeTaigaHills.v, new WorldGenFeatureChanceDecoratorCountConfiguration(20, 8, 16, 256)));
        this.a(WorldGenStage.Decoration.TOP_LAYER_MODIFICATION, a(WorldGenerator.aa, WorldGenFeatureConfiguration.e, BiomeTaigaHills.n, WorldGenFeatureDecoratorConfiguration.e));
        this.a(EnumCreatureType.CREATURE, new BiomeBase.BiomeMeta(EntityTypes.SHEEP, 12, 4, 4));
        this.a(EnumCreatureType.CREATURE, new BiomeBase.BiomeMeta(EntityTypes.PIG, 10, 4, 4));
        this.a(EnumCreatureType.CREATURE, new BiomeBase.BiomeMeta(EntityTypes.CHICKEN, 10, 4, 4));
        this.a(EnumCreatureType.CREATURE, new BiomeBase.BiomeMeta(EntityTypes.COW, 8, 4, 4));
        this.a(EnumCreatureType.CREATURE, new BiomeBase.BiomeMeta(EntityTypes.WOLF, 8, 4, 4));
        this.a(EnumCreatureType.CREATURE, new BiomeBase.BiomeMeta(EntityTypes.RABBIT, 4, 2, 3));
        this.a(EnumCreatureType.AMBIENT, new BiomeBase.BiomeMeta(EntityTypes.BAT, 10, 8, 8));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.SPIDER, 100, 4, 4));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.ZOMBIE, 95, 4, 4));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.ZOMBIE_VILLAGER, 5, 1, 1));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.SKELETON, 100, 4, 4));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.CREEPER, 100, 4, 4));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.SLIME, 100, 4, 4));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.ENDERMAN, 10, 1, 4));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.WITCH, 5, 1, 1));
    }
}
