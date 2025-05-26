package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public final lu1 f9917a;

    /* renamed from: b, reason: collision with root package name */
    public final lu1 f9918b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9919c;

    /* renamed from: d, reason: collision with root package name */
    public final ts f9920d;

    /* renamed from: e, reason: collision with root package name */
    public final fr0 f9921e;

    public q3(ts tsVar, fr0 fr0Var, lu1 lu1Var, lu1 lu1Var2, boolean z13) {
        this.f9920d = tsVar;
        this.f9921e = fr0Var;
        this.f9917a = lu1Var;
        if (lu1Var2 == null) {
            this.f9918b = lu1.f7985d;
        } else {
            this.f9918b = lu1Var2;
        }
        this.f9919c = z13;
    }

    public static q3 a(ts tsVar, fr0 fr0Var, lu1 lu1Var, lu1 lu1Var2, boolean z13) {
        if (tsVar == null) {
            throw new IllegalArgumentException("CreativeType is null");
        }
        if (fr0Var == null) {
            throw new IllegalArgumentException("ImpressionType is null");
        }
        if (lu1Var == null) {
            throw new IllegalArgumentException("Impression owner is null");
        }
        if (lu1Var == lu1.f7985d) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (tsVar == ts.f11652b && lu1Var == lu1.f7983b) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (fr0Var == fr0.f5246b && lu1Var == lu1.f7983b) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new q3(tsVar, fr0Var, lu1Var, lu1Var2, z13);
    }
}
