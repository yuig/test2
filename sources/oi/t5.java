package oi;

import com.google.android.gms.internal.measurement.ua;

/* loaded from: classes3.dex */
public final class t5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g5 f95169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f95170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f95171c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f95172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g5 f95173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k5 f95174f;

    public t5(k5 k5Var, g5 g5Var, long j13, long j14, boolean z13, g5 g5Var2) {
        this.f95174f = k5Var;
        this.f95169a = g5Var;
        this.f95170b = j13;
        this.f95171c = j14;
        this.f95172d = z13;
        this.f95173e = g5Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k5 k5Var = this.f95174f;
        g5 g5Var = this.f95169a;
        k5Var.M(g5Var);
        k5Var.A(this.f95170b, false);
        k5.O(this.f95174f, this.f95169a, this.f95171c, true, this.f95172d);
        ua.a();
        if (k5Var.l().x(null, s.f95122r0)) {
            k5.P(k5Var, g5Var, this.f95173e);
        }
    }
}
