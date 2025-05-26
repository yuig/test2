package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class q00 {

    /* renamed from: a, reason: collision with root package name */
    public final l00 f9886a;

    /* renamed from: b, reason: collision with root package name */
    public final q00 f9887b = this;

    /* renamed from: c, reason: collision with root package name */
    public a.o8 f9888c;

    /* renamed from: d, reason: collision with root package name */
    public a.o8 f9889d;

    public q00(l00 l00Var) {
        this.f9886a = l00Var;
        a();
    }

    public final void a() {
        a.o8 o8Var = a.l9.f105z;
        Object obj = u90.f11887c;
        a.o8 u90Var = o8Var instanceof u90 ? o8Var : new u90(o8Var);
        l00 l00Var = this.f9886a;
        a.o8 cb1Var = new cb1(l00Var.f7573c, l00Var.f7575e, l00Var.f7595y, u90Var, l00Var.A, l00Var.f7583m, l00Var.f7576f);
        if (!(cb1Var instanceof u90)) {
            cb1Var = new u90(cb1Var);
        }
        this.f9888c = cb1Var;
        a.o8 o8Var2 = a.l9.A;
        a.o8 u90Var2 = o8Var2 instanceof u90 ? o8Var2 : new u90(o8Var2);
        p00 p00Var = new p00(this);
        l00 l00Var2 = this.f9886a;
        a.o8 sc0Var = new sc0(l00Var2.f7575e, this.f9888c, l00Var2.f7595y, l00Var2.f7594x, u90Var2, p00Var, l00Var2.f7576f);
        if (!(sc0Var instanceof u90)) {
            sc0Var = new u90(sc0Var);
        }
        this.f9889d = sc0Var;
    }
}
