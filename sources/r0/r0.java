package r0;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class r0 implements g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.c0 f105638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f105639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f105640c;

    public r0(v0 v0Var, r4.l lVar, boolean z13) {
        this.f105640c = v0Var;
        this.f105638a = lVar;
        this.f105639b = z13;
    }

    @Override // g0.c
    public final void onFailure(Throwable th3) {
        if (th3 instanceof CancellationException) {
            return;
        }
        kh2.m0.t("VideoCapture", "Surface update completed with unexpected exception", th3);
    }

    @Override // g0.c
    public final void onSuccess(Object obj) {
        b1 b1Var;
        v0 v0Var = this.f105640c;
        if (this.f105638a != v0Var.f105662s || (b1Var = v0Var.f105664u) == b1.INACTIVE) {
            return;
        }
        b1 b1Var2 = this.f105639b ? b1.ACTIVE_STREAMING : b1.ACTIVE_NON_STREAMING;
        if (b1Var2 != b1Var) {
            v0Var.f105664u = b1Var2;
            v0Var.H().g(b1Var2);
        }
    }
}
