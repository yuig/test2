package oi;

/* loaded from: classes3.dex */
public final class s3 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f95142g = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f95143a;

    /* renamed from: b, reason: collision with root package name */
    public final r3 f95144b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f95145c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f95146d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f95147e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f95148f = null;

    public s3(String str, Object obj, Object obj2, r3 r3Var) {
        this.f95143a = str;
        this.f95145c = obj;
        this.f95146d = obj2;
        this.f95144b = r3Var;
    }

    public final Object a(Object obj) {
        synchronized (this.f95147e) {
        }
        if (obj != null) {
            return obj;
        }
        if (kh2.n.f79624a == null) {
            return this.f95145c;
        }
        synchronized (f95142g) {
            try {
                if (q8.m0.d()) {
                    return this.f95148f == null ? this.f95145c : this.f95148f;
                }
                try {
                    for (s3 s3Var : s.f95087a) {
                        if (q8.m0.d()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            r3 r3Var = s3Var.f95144b;
                            if (r3Var != null) {
                                obj2 = r3Var.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f95142g) {
                            s3Var.f95148f = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                r3 r3Var2 = this.f95144b;
                if (r3Var2 == null) {
                    return this.f95145c;
                }
                try {
                    return r3Var2.zza();
                } catch (IllegalStateException unused3) {
                    return this.f95145c;
                } catch (SecurityException unused4) {
                    return this.f95145c;
                }
            } finally {
            }
        }
    }
}
