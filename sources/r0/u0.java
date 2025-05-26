package r0;

import androidx.camera.core.impl.t1;

/* loaded from: classes2.dex */
public final class u0 implements t1 {

    /* renamed from: a, reason: collision with root package name */
    public androidx.camera.core.impl.g0 f105651a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f105652b;

    @Override // androidx.camera.core.impl.t1
    public final void a(Object obj) {
        com.bumptech.glide.d.v("SourceStreamRequirementObserver can be updated from main thread only", f0.h.b0());
        boolean equals = Boolean.TRUE.equals((Boolean) obj);
        if (this.f105652b == equals) {
            return;
        }
        this.f105652b = equals;
        androidx.camera.core.impl.g0 g0Var = this.f105651a;
        if (g0Var == null) {
            kh2.m0.p("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
        } else if (equals) {
            g0Var.g();
        } else {
            g0Var.a();
        }
    }

    public final void b() {
        com.bumptech.glide.d.v("SourceStreamRequirementObserver can be closed from main thread only", f0.h.b0());
        kh2.m0.p("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.f105652b);
        androidx.camera.core.impl.g0 g0Var = this.f105651a;
        if (g0Var == null) {
            kh2.m0.p("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
            return;
        }
        if (this.f105652b) {
            this.f105652b = false;
            if (g0Var != null) {
                g0Var.a();
            } else {
                kh2.m0.p("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            }
        }
        this.f105651a = null;
    }

    @Override // androidx.camera.core.impl.t1
    public final void onError(Throwable th3) {
        kh2.m0.Y0("VideoCapture", "SourceStreamRequirementObserver#onError", th3);
    }
}
