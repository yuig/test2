package k1;

/* loaded from: classes2.dex */
public final class w0 extends u2.p implements s3.l, s3.u1 {

    /* renamed from: n, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.h0 f78068n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f78069o;

    @Override // u2.p
    public final boolean A0() {
        return false;
    }

    @Override // u2.p
    public final void F0() {
        androidx.compose.foundation.lazy.layout.h0 h0Var = this.f78068n;
        if (h0Var != null) {
            h0Var.b();
        }
        this.f78068n = null;
    }

    @Override // s3.u1
    public final void P() {
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        com.bumptech.glide.c.L0(this, new v0(0, j0Var, this));
        androidx.compose.foundation.lazy.layout.h0 h0Var = (androidx.compose.foundation.lazy.layout.h0) j0Var.f80434a;
        if (this.f78069o) {
            androidx.compose.foundation.lazy.layout.h0 h0Var2 = this.f78068n;
            if (h0Var2 != null) {
                h0Var2.b();
            }
            if (h0Var != null) {
                h0Var.a();
            } else {
                h0Var = null;
            }
            this.f78068n = h0Var;
        }
    }
}
