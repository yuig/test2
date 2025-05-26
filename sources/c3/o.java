package c3;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f25531b;

    public /* synthetic */ o(s sVar, int i13) {
        this.f25530a = i13;
        this.f25531b = sVar;
    }

    @Override // c3.k
    public final double i(double d2) {
        int i13 = this.f25530a;
        s sVar = this.f25531b;
        switch (i13) {
            case 0:
                return ql2.s.e(sVar.f25546k.i(d2), sVar.f25540e, sVar.f25541f);
            default:
                return sVar.f25549n.i(ql2.s.e(d2, sVar.f25540e, sVar.f25541f));
        }
    }
}
