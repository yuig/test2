package oi;

import com.google.android.gms.internal.measurement.ua;

/* loaded from: classes3.dex */
public final class v5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95231a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f95232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f95233c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f95234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f95235e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k2 f95236f;

    public v5(k5 k5Var, g5 g5Var, long j13, boolean z13, g5 g5Var2) {
        this.f95236f = k5Var;
        this.f95234d = g5Var;
        this.f95232b = j13;
        this.f95233c = z13;
        this.f95235e = g5Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f95231a;
        Object obj = this.f95235e;
        Object obj2 = this.f95234d;
        k2 k2Var = this.f95236f;
        switch (i13) {
            case 0:
                k5 k5Var = (k5) k2Var;
                g5 g5Var = (g5) obj2;
                k5Var.M(g5Var);
                k5.O(k5Var, g5Var, this.f95232b, false, this.f95233c);
                ua.a();
                if (k5Var.l().x(null, s.f95122r0)) {
                    k5.P(k5Var, g5Var, (g5) obj);
                    break;
                }
                break;
            default:
                ((a6) k2Var).D((b6) obj2, (b6) obj, this.f95232b, this.f95233c, null);
                break;
        }
    }

    public v5(a6 a6Var, b6 b6Var, b6 b6Var2, long j13, boolean z13) {
        this.f95236f = a6Var;
        this.f95234d = b6Var;
        this.f95235e = b6Var2;
        this.f95232b = j13;
        this.f95233c = z13;
    }
}
