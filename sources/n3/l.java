package n3;

import androidx.compose.foundation.lazy.layout.z0;
import kotlin.Unit;
import s3.f2;
import s3.j2;
import t3.b1;

/* loaded from: classes2.dex */
public final class l extends u2.p implements j2, f2, s3.l {

    /* renamed from: n, reason: collision with root package name */
    public n f89080n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f89081o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f89082p;

    public l(n nVar, boolean z13) {
        this.f89080n = nVar;
        this.f89081o = z13;
    }

    @Override // u2.p
    public final void E0() {
        O0();
    }

    public final void M0() {
        n nVar;
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        kh2.b0.W1(this, new z0(3, j0Var));
        l lVar = (l) j0Var.f80434a;
        if (lVar == null || (nVar = lVar.f89080n) == null) {
            nVar = this.f89080n;
        }
        t3.y yVar = (t3.y) com.bumptech.glide.c.w(this, t3.f2.f115996s);
        if (yVar != null) {
            if (nVar == null) {
                n.f89091a.getClass();
                nVar = o.f89094a;
            }
            b1.f115855a.a(yVar.f116277a, nVar);
        }
    }

    public final void N0() {
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f80424a = true;
        if (!this.f89081o) {
            kh2.b0.X1(this, new k1.c0(f0Var, 2));
        }
        if (f0Var.f80424a) {
            M0();
        }
    }

    public final void O0() {
        Unit unit;
        t3.y yVar;
        if (this.f89082p) {
            this.f89082p = false;
            if (this.f120054m) {
                kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
                kh2.b0.W1(this, new z0(1, j0Var));
                l lVar = (l) j0Var.f80434a;
                if (lVar != null) {
                    lVar.M0();
                    unit = Unit.f80348a;
                } else {
                    unit = null;
                }
                if (unit != null || (yVar = (t3.y) com.bumptech.glide.c.w(this, t3.f2.f115996s)) == null) {
                    return;
                }
                n.f89091a.getClass();
                b1.f115855a.a(yVar.f116277a, o.f89094a);
            }
        }
    }

    @Override // s3.f2
    public final void W(j jVar, k kVar, long j13) {
        if (kVar == k.Main) {
            if (o.a(jVar.f89073d, 4)) {
                this.f89082p = true;
                N0();
            } else if (o.a(jVar.f89073d, 5)) {
                O0();
            }
        }
    }

    @Override // s3.f2
    public final void c0() {
        O0();
    }

    @Override // s3.j2
    public final /* bridge */ /* synthetic */ Object l() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
