package nm;

/* loaded from: classes.dex */
public final class k extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91314a;

    public k(int i13) {
        this.f91314a = i13;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        switch (this.f91314a) {
            case 0:
                if (aVar.K() != um.b.NULL) {
                    return Double.valueOf(aVar.s1());
                }
                aVar.B1();
                return null;
            default:
                if (aVar.K() != um.b.NULL) {
                    return Float.valueOf((float) aVar.s1());
                }
                aVar.B1();
                return null;
        }
    }

    @Override // nm.i0
    public final /* bridge */ /* synthetic */ void e(um.c cVar, Object obj) {
        switch (this.f91314a) {
            case 0:
                f(cVar, (Number) obj);
                break;
            default:
                f(cVar, (Number) obj);
                break;
        }
    }

    public final void f(um.c cVar, Number number) {
        switch (this.f91314a) {
            case 0:
                if (number != null) {
                    double doubleValue = number.doubleValue();
                    o.a(doubleValue);
                    cVar.A(doubleValue);
                    break;
                } else {
                    cVar.m();
                    break;
                }
            default:
                if (number != null) {
                    float floatValue = number.floatValue();
                    o.a(floatValue);
                    if (!(number instanceof Float)) {
                        number = Float.valueOf(floatValue);
                    }
                    cVar.L(number);
                    break;
                } else {
                    cVar.m();
                    break;
                }
        }
    }
}
