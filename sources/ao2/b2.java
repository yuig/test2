package ao2;

/* loaded from: classes2.dex */
public abstract class b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final fi.b f20116a = new fi.b("COMPLETING_ALREADY", 4);

    /* renamed from: b, reason: collision with root package name */
    public static final fi.b f20117b = new fi.b("COMPLETING_WAITING_CHILDREN", 4);

    /* renamed from: c, reason: collision with root package name */
    public static final fi.b f20118c = new fi.b("COMPLETING_RETRY", 4);

    /* renamed from: d, reason: collision with root package name */
    public static final fi.b f20119d = new fi.b("TOO_LATE_TO_CANCEL", 4);

    /* renamed from: e, reason: collision with root package name */
    public static final fi.b f20120e = new fi.b("SEALED", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final z0 f20121f = new z0(false);

    /* renamed from: g, reason: collision with root package name */
    public static final z0 f20122g = new z0(true);

    public static final Object b(Object obj) {
        l1 l1Var;
        m1 m1Var = obj instanceof m1 ? (m1) obj : null;
        return (m1Var == null || (l1Var = m1Var.f20175a) == null) ? obj : l1Var;
    }
}
