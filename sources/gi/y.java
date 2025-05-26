package gi;

/* loaded from: classes3.dex */
public final class y extends z {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f65133c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f65134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f65135e;

    public y(z zVar, int i13, int i14) {
        this.f65135e = zVar;
        this.f65133c = i13;
        this.f65134d = i14;
    }

    @Override // gi.u
    public final int c() {
        return this.f65135e.d() + this.f65133c + this.f65134d;
    }

    @Override // gi.u
    public final int d() {
        return this.f65135e.d() + this.f65133c;
    }

    @Override // gi.u
    public final Object[] f() {
        return this.f65135e.f();
    }

    @Override // java.util.List
    public final Object get(int i13) {
        kh2.b0.e2(i13, this.f65134d);
        return this.f65135e.get(i13 + this.f65133c);
    }

    @Override // gi.z, java.util.List
    /* renamed from: j */
    public final z subList(int i13, int i14) {
        kh2.b0.g2(i13, i14, this.f65134d);
        int i15 = this.f65133c;
        return this.f65135e.subList(i13 + i15, i14 + i15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f65134d;
    }
}
