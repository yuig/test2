package i2;

/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f71093a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f71094b;

    /* renamed from: c, reason: collision with root package name */
    public final j3 f71095c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f71096d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f71097e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f71098f = true;

    public d2(b0 b0Var, Object obj, boolean z13, j3 j3Var, boolean z14) {
        this.f71093a = b0Var;
        this.f71094b = z13;
        this.f71095c = j3Var;
        this.f71096d = z14;
        this.f71097e = obj;
    }

    public final Object a() {
        if (this.f71094b) {
            return null;
        }
        Object obj = this.f71097e;
        if (obj != null) {
            return obj;
        }
        u.j("Unexpected form of a provided value");
        throw null;
    }

    public final boolean b() {
        return (this.f71094b || this.f71097e != null) && !this.f71096d;
    }
}
