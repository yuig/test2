package td;

/* loaded from: classes.dex */
public final class k implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117410a;

    /* renamed from: b, reason: collision with root package name */
    public final rd.j f117411b;

    public k(int i13) {
        this.f117410a = i13;
        if (i13 != 1) {
            this.f117411b = new rd.j(this, 2);
        } else {
            this.f117411b = new rd.j();
        }
    }

    @Override // td.d0
    public final c0 a(i0 i0Var) {
        int i13 = this.f117410a;
        rd.j jVar = this.f117411b;
        switch (i13) {
            case 0:
                return new g(jVar, 1);
            default:
                return new ud.a(jVar);
        }
    }
}
