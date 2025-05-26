package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a */
    public int f33659a;

    /* renamed from: b */
    public final int f33660b = 100;

    /* renamed from: c */
    public final int f33661c = Integer.MAX_VALUE;

    /* renamed from: d */
    public o f33662d;

    public static int b(int i13) {
        return (-(i13 & 1)) ^ (i13 >>> 1);
    }

    public static long c(long j13) {
        return (-(j13 & 1)) ^ (j13 >>> 1);
    }

    public static l f(byte[] bArr, int i13, int i14, boolean z13) {
        l lVar = new l(bArr, i13, i14, z13);
        try {
            lVar.h(i14);
            return lVar;
        } catch (InvalidProtocolBufferException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public abstract void a(int i13);

    public abstract int d();

    public abstract boolean e();

    public abstract void g(int i13);

    public abstract int h(int i13);

    public abstract boolean i();

    public abstract j j();

    public abstract double k();

    public abstract int l();

    public abstract int m();

    public abstract long n();

    public abstract float o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract String v();

    public abstract String w();

    public abstract int x();

    public abstract int y();

    public abstract long z();
}
