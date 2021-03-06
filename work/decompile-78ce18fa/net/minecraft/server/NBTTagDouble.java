package net.minecraft.server;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class NBTTagDouble extends NBTNumber {

    private double data;

    NBTTagDouble() {}

    public NBTTagDouble(double d0) {
        this.data = d0;
    }

    public void write(DataOutput dataoutput) throws IOException {
        dataoutput.writeDouble(this.data);
    }

    public void load(DataInput datainput, int i, NBTReadLimiter nbtreadlimiter) throws IOException {
        nbtreadlimiter.a(128L);
        this.data = datainput.readDouble();
    }

    public byte getTypeId() {
        return (byte) 6;
    }

    public String toString() {
        return this.data + "d";
    }

    public NBTTagDouble c() {
        return new NBTTagDouble(this.data);
    }

    public boolean equals(Object object) {
        return this == object ? true : object instanceof NBTTagDouble && this.data == ((NBTTagDouble) object).data;
    }

    public int hashCode() {
        long i = Double.doubleToLongBits(this.data);

        return (int) (i ^ i >>> 32);
    }

    public IChatBaseComponent a(String s, int i) {
        IChatBaseComponent ichatbasecomponent = (new ChatComponentText("d")).a(NBTTagDouble.e);

        return (new ChatComponentText(String.valueOf(this.data))).addSibling(ichatbasecomponent).a(NBTTagDouble.d);
    }

    public long d() {
        return (long) Math.floor(this.data);
    }

    public int e() {
        return MathHelper.floor(this.data);
    }

    public short f() {
        return (short) (MathHelper.floor(this.data) & '\uffff');
    }

    public byte g() {
        return (byte) (MathHelper.floor(this.data) & 255);
    }

    public double asDouble() {
        return this.data;
    }

    public float i() {
        return (float) this.data;
    }

    public Number j() {
        return Double.valueOf(this.data);
    }

    public NBTBase clone() {
        return this.c();
    }
}
