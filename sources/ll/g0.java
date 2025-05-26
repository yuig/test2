package ll;

/* loaded from: classes3.dex */
public abstract class g0 implements uk.s {

    /* renamed from: a, reason: collision with root package name */
    public static final pd.d0 f83728a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f83729b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f83730c;

    static {
        yk.d dVar = yk.d.ALGORITHM_NOT_FIPS;
        qq2.c a13 = pd.d0.a();
        a13.a(u.SHA256, jl.a0.f76793b);
        a13.a(u.SHA384, jl.a0.f76794c);
        a13.a(u.SHA512, jl.a0.f76795d);
        f83728a = a13.b();
        f83729b = new byte[0];
        f83730c = new byte[]{0};
    }
}
