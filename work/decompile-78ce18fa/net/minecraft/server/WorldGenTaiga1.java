package net.minecraft.server;

import java.util.Random;
import java.util.Set;

public class WorldGenTaiga1 extends WorldGenTreeAbstract<WorldGenFeatureEmptyConfiguration> {

    private static final IBlockData a = Blocks.SPRUCE_LOG.getBlockData();
    private static final IBlockData b = Blocks.SPRUCE_LEAVES.getBlockData();

    public WorldGenTaiga1() {
        super(false);
    }

    public boolean a(Set<BlockPosition> set, GeneratorAccess generatoraccess, Random random, BlockPosition blockposition) {
        int i = random.nextInt(5) + 7;
        int j = i - random.nextInt(2) - 3;
        int k = i - j;
        int l = 1 + random.nextInt(k + 1);

        if (blockposition.getY() >= 1 && blockposition.getY() + i + 1 <= 256) {
            boolean flag = true;

            int i1;
            int j1;
            int k1;

            for (int l1 = blockposition.getY(); l1 <= blockposition.getY() + 1 + i && flag; ++l1) {
                boolean flag1 = true;

                if (l1 - blockposition.getY() < j) {
                    k1 = 0;
                } else {
                    k1 = l;
                }

                BlockPosition.MutableBlockPosition blockposition_mutableblockposition = new BlockPosition.MutableBlockPosition();

                for (i1 = blockposition.getX() - k1; i1 <= blockposition.getX() + k1 && flag; ++i1) {
                    for (j1 = blockposition.getZ() - k1; j1 <= blockposition.getZ() + k1 && flag; ++j1) {
                        if (l1 >= 0 && l1 < 256) {
                            if (!this.a(generatoraccess.getType(blockposition_mutableblockposition.c(i1, l1, j1)).getBlock())) {
                                flag = false;
                            }
                        } else {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag) {
                return false;
            } else {
                Block block = generatoraccess.getType(blockposition.down()).getBlock();

                if ((block == Blocks.GRASS_BLOCK || Block.d(block)) && blockposition.getY() < 256 - i - 1) {
                    this.a(generatoraccess, blockposition.down());
                    k1 = 0;

                    int i2;

                    for (i2 = blockposition.getY() + i; i2 >= blockposition.getY() + j; --i2) {
                        for (i1 = blockposition.getX() - k1; i1 <= blockposition.getX() + k1; ++i1) {
                            j1 = i1 - blockposition.getX();

                            for (int j2 = blockposition.getZ() - k1; j2 <= blockposition.getZ() + k1; ++j2) {
                                int k2 = j2 - blockposition.getZ();

                                if (Math.abs(j1) != k1 || Math.abs(k2) != k1 || k1 <= 0) {
                                    BlockPosition blockposition1 = new BlockPosition(i1, i2, j2);

                                    if (!generatoraccess.getType(blockposition1).f(generatoraccess, blockposition1)) {
                                        this.a(generatoraccess, blockposition1, WorldGenTaiga1.b);
                                    }
                                }
                            }
                        }

                        if (k1 >= 1 && i2 == blockposition.getY() + j + 1) {
                            --k1;
                        } else if (k1 < l) {
                            ++k1;
                        }
                    }

                    for (i2 = 0; i2 < i - 1; ++i2) {
                        IBlockData iblockdata = generatoraccess.getType(blockposition.up(i2));

                        if (iblockdata.isAir() || iblockdata.a(TagsBlock.LEAVES)) {
                            this.a(set, generatoraccess, blockposition.up(i2), WorldGenTaiga1.a);
                        }
                    }

                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }
}
