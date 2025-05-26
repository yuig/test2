package pk;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class z2 extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f100530c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f100531d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f100532e;

    public z2(int i13, int i14, Object[] objArr) {
        this.f100530c = objArr;
        this.f100531d = i13;
        this.f100532e = i14;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        bf.b.l(i13, this.f100532e);
        Object obj = this.f100530c[(i13 * 2) + this.f100531d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // pk.v0
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f100532e;
    }

    @Override // pk.c1, pk.v0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
