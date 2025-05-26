package j1;

/* loaded from: classes.dex */
public final class t2 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74243a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f74244b;

    public t2(float f13, float f14) {
        this.f74244b = new k0(f13, f14, 0.01f);
    }

    @Override // j1.u
    public final i0 get(int i13) {
        int i14 = this.f74243a;
        i0 i0Var = this.f74244b;
        switch (i14) {
            case 0:
                return (k0) i0Var;
            default:
                return i0Var;
        }
    }

    public t2(i0 i0Var) {
        this.f74244b = i0Var;
    }
}
