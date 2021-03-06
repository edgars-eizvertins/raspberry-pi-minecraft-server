package net.minecraft.server;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChunkMap extends Long2ObjectOpenHashMap<Chunk> {

    private static final Logger a = LogManager.getLogger();

    public ChunkMap(int i) {
        super(i);
    }

    public Chunk a(long i, Chunk chunk) {
        Chunk chunk1 = (Chunk) super.put(i, chunk);
        ChunkCoordIntPair chunkcoordintpair = new ChunkCoordIntPair(i);

        for (int j = chunkcoordintpair.x - 1; j <= chunkcoordintpair.x + 1; ++j) {
            for (int k = chunkcoordintpair.z - 1; k <= chunkcoordintpair.z + 1; ++k) {
                if (j != chunkcoordintpair.x || k != chunkcoordintpair.z) {
                    long l = ChunkCoordIntPair.a(j, k);
                    Chunk chunk2 = (Chunk) this.get(l);

                    if (chunk2 != null) {
                        chunk.H();
                        chunk2.H();
                    }
                }
            }
        }

        // CraftBukkit start
        // Update neighbor counts
        for (int x = -2; x < 3; x++) {
            for (int z = -2; z < 3; z++) {
                if (x == 0 && z == 0) {
                    continue;
                }

                Chunk neighbor = this.get(ChunkCoordIntPair.a(chunkcoordintpair.x + x, chunkcoordintpair.z + z));
                if (neighbor != null) {
                    neighbor.setNeighborLoaded(-x, -z);
                    chunk.setNeighborLoaded(x, z);
                }
            }
        }
        // CraftBukkit end

        return chunk1;
    }

    public Chunk a(Long olong, Chunk chunk) {
        return this.a(olong.longValue(), chunk);
    }

    public Chunk a(long i) {
        Chunk chunk = (Chunk) super.remove(i);
        ChunkCoordIntPair chunkcoordintpair = new ChunkCoordIntPair(i);

        for (int j = chunkcoordintpair.x - 1; j <= chunkcoordintpair.x + 1; ++j) {
            for (int k = chunkcoordintpair.z - 1; k <= chunkcoordintpair.z + 1; ++k) {
                if (j != chunkcoordintpair.x || k != chunkcoordintpair.z) {
                    Chunk chunk1 = (Chunk) this.get(ChunkCoordIntPair.a(j, k));

                    if (chunk1 != null) {
                        chunk1.I();
                    }
                }
            }
        }

        return chunk;
    }

    public Chunk a(Object object) {
        return this.a(((Long) object).longValue());
    }

    public void putAll(Map<? extends Long, ? extends Chunk> map) {
        throw new RuntimeException("Not yet implemented");
    }

    public boolean remove(Object object, Object object1) {
        throw new RuntimeException("Not yet implemented");
    }

    // CraftBukkit start - decompile errors
    public Chunk remove(long i) {
        return this.a(i);
    }

    public Chunk put(long i, Chunk object) {
        return this.a(i, (Chunk) object);
    }

    public Chunk remove(Object object) {
        return this.a(object);
    }

    public Chunk put(Long olong, Chunk object) {
        return this.a(olong, (Chunk) object);
    }

    public Object put(Object object, Chunk object1) {
        return this.a((Long) object, (Chunk) object1);
    }
    // CraftBukkit end
}
