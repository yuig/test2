package pk;

import java.util.Objects;

/* loaded from: classes.dex */
public final class v2 extends c1 {

    /* renamed from: e */
    public static final v2 f100502e = new v2(0, new Object[0]);

    /* renamed from: c */
    public final transient Object[] f100503c;

    /* renamed from: d */
    public final transient int f100504d;

    public v2(int i13, Object[] objArr) {
        this.f100503c = objArr;
        this.f100504d = i13;
    }

    @Override // pk.c1, pk.v0
    public final int c(int i13, Object[] objArr) {
        Object[] objArr2 = this.f100503c;
        int i14 = this.f100504d;
        System.arraycopy(objArr2, 0, objArr, i13, i14);
        return i13 + i14;
    }

    @Override // pk.v0
    public final Object[] d() {
        return this.f100503c;
    }

    @Override // pk.v0
    public final int e() {
        return this.f100504d;
    }

    @Override // pk.v0
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        bf.b.l(i13, this.f100504d);
        Object obj = this.f100503c[i13];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // pk.v0
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f100504d;
    }

    @Override // pk.c1, pk.v0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
