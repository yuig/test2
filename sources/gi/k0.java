package gi;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class k0 extends z {

    /* renamed from: e, reason: collision with root package name */
    public static final k0 f65079e = new k0(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f65080c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f65081d;

    public k0(int i13, Object[] objArr) {
        this.f65080c = objArr;
        this.f65081d = i13;
    }

    @Override // gi.z, gi.u
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f65080c;
        int i13 = this.f65081d;
        System.arraycopy(objArr2, 0, objArr, 0, i13);
        return i13;
    }

    @Override // gi.u
    public final int c() {
        return this.f65081d;
    }

    @Override // gi.u
    public final int d() {
        return 0;
    }

    @Override // gi.u
    public final Object[] f() {
        return this.f65080c;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        kh2.b0.e2(i13, this.f65081d);
        Object obj = this.f65080c[i13];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f65081d;
    }
}
