package s3;

/* loaded from: classes.dex */
public final class g implements z2.n {

    /* renamed from: a, reason: collision with root package name */
    public static final g f110774a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f110775b;

    @Override // z2.n
    public final void b(boolean z13) {
        f110775b = Boolean.valueOf(z13);
    }

    @Override // z2.n
    public final boolean c() {
        Boolean bool = f110775b;
        if (bool != null) {
            return bool.booleanValue();
        }
        jk.r.z("canFocus is read before it is written");
        throw null;
    }
}
