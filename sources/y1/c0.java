package y1;

import t3.f2;
import t3.h2;
import t3.s3;

/* loaded from: classes2.dex */
public abstract class c0 implements h4.a0 {

    /* renamed from: a, reason: collision with root package name */
    public b0 f136540a;

    @Override // h4.a0
    public final void d() {
        s3 s3Var;
        b0 b0Var = this.f136540a;
        if (b0Var == null || (s3Var = (s3) com.bumptech.glide.c.w((z) b0Var, f2.f115991n)) == null) {
            return;
        }
        ((h2) s3Var).a();
    }

    @Override // h4.a0
    public final void g() {
        s3 s3Var;
        b0 b0Var = this.f136540a;
        if (b0Var == null || (s3Var = (s3) com.bumptech.glide.c.w((z) b0Var, f2.f115991n)) == null) {
            return;
        }
        ((h2) s3Var).b();
    }

    public final void i(b0 b0Var) {
        if (this.f136540a == b0Var) {
            this.f136540a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + b0Var + " but was " + this.f136540a).toString());
    }
}
