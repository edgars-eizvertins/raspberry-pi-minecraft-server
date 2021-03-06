package net.minecraft.server;

public class BlockFloorSign extends BlockSign {

    public static final BlockStateInteger ROTATION = BlockProperties.an;

    public BlockFloorSign(Block.Info block_info) {
        super(block_info);
        this.v((IBlockData) ((IBlockData) ((IBlockData) this.blockStateList.getBlockData()).set(BlockFloorSign.ROTATION, Integer.valueOf(0))).set(BlockFloorSign.a, Boolean.valueOf(false)));
    }

    public boolean canPlace(IBlockData iblockdata, IWorldReader iworldreader, BlockPosition blockposition) {
        return iworldreader.getType(blockposition.down()).getMaterial().isBuildable();
    }

    public IBlockData getPlacedState(BlockActionContext blockactioncontext) {
        Fluid fluid = blockactioncontext.getWorld().b(blockactioncontext.getClickPosition());

        return (IBlockData) ((IBlockData) this.getBlockData().set(BlockFloorSign.ROTATION, Integer.valueOf(MathHelper.floor((double) ((180.0F + blockactioncontext.h()) * 16.0F / 360.0F) + 0.5D) & 15))).set(BlockFloorSign.a, Boolean.valueOf(fluid.c() == FluidTypes.c));
    }

    public IBlockData updateState(IBlockData iblockdata, EnumDirection enumdirection, IBlockData iblockdata1, GeneratorAccess generatoraccess, BlockPosition blockposition, BlockPosition blockposition1) {
        return enumdirection == EnumDirection.DOWN && !this.canPlace(iblockdata, generatoraccess, blockposition) ? Blocks.AIR.getBlockData() : super.updateState(iblockdata, enumdirection, iblockdata1, generatoraccess, blockposition, blockposition1);
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
        return (IBlockData) iblockdata.set(BlockFloorSign.ROTATION, Integer.valueOf(enumblockrotation.a(((Integer) iblockdata.get(BlockFloorSign.ROTATION)).intValue(), 16)));
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockMirror enumblockmirror) {
        return (IBlockData) iblockdata.set(BlockFloorSign.ROTATION, Integer.valueOf(enumblockmirror.a(((Integer) iblockdata.get(BlockFloorSign.ROTATION)).intValue(), 16)));
    }

    protected void a(BlockStateList.a<Block, IBlockData> blockstatelist_a) {
        blockstatelist_a.a(new IBlockState[] { BlockFloorSign.ROTATION, BlockFloorSign.a});
    }
}
