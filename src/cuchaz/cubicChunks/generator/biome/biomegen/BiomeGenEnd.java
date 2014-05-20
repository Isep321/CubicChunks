package cuchaz.cubicChunks.generator.biome.biomegen;

import cuchaz.cubicChunks.generator.biome.biomegen.CubeBiomeGenBase.SpawnListEntry;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Blocks;

public class BiomeGenEnd extends CubeBiomeGenBase
{
    public BiomeGenEnd(int par1)
    {
        super(par1);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableMonsterList.add(new CubeBiomeGenBase.SpawnListEntry(EntityEnderman.class, 10, 4, 4));
        this.topBlock = Blocks.dirt;
        this.fillerBlock = Blocks.dirt;
        this.theBiomeDecorator = new BiomeEndDecorator();
    }

    /**
     * takes temperature, returns color
     */
    public int getSkyColorByTemp(float par1)
    {
        return 0;
    }
}
