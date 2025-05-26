package e2;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i2.q1;
import i2.v3;
import k1.k1;
import k1.l1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class h implements k1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f56861a;

    /* renamed from: b, reason: collision with root package name */
    public final float f56862b;

    /* renamed from: c, reason: collision with root package name */
    public final v3 f56863c;

    public h(boolean z13, float f13, q1 q1Var) {
        this.f56861a = z13;
        this.f56862b = f13;
        this.f56863c = q1Var;
    }

    @Override // k1.k1
    public final l1 a(o1.k kVar, i2.o oVar) {
        long a13;
        i2.s sVar = (i2.s) oVar;
        sVar.W(988743187);
        a0 a0Var = (a0) sVar.m(c0.f56839a);
        v3 v3Var = this.f56863c;
        if (((b3.w) v3Var.getValue()).f21392a != 16) {
            sVar.W(-303571590);
            sVar.r(false);
            a13 = ((b3.w) v3Var.getValue()).f21392a;
        } else {
            sVar.W(-303521246);
            a13 = a0Var.a(sVar);
            sVar.r(false);
        }
        q1 K1 = bs1.c.K1(new b3.w(a13), sVar);
        q1 K12 = bs1.c.K1(a0Var.b(sVar), sVar);
        sVar.W(331259447);
        ViewGroup b13 = d0.b((View) sVar.m(AndroidCompositionLocals_androidKt.f17459f));
        boolean h10 = sVar.h((f) this) | sVar.h(kVar) | sVar.h(b13);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (h10 || J2 == dVar) {
            J2 = new a(this.f56861a, this.f56862b, K1, K12, b13);
            sVar.g0(J2);
        }
        a aVar = (a) J2;
        sVar.r(false);
        boolean h13 = sVar.h(kVar) | sVar.j(aVar);
        Object J3 = sVar.J();
        if (h13 || J3 == dVar) {
            J3 = new g(kVar, aVar, null);
            sVar.g0(J3);
        }
        i2.u.d(aVar, kVar, (Function2) J3, sVar);
        sVar.r(false);
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f56861a == hVar.f56861a && n4.e.a(this.f56862b, hVar.f56862b) && Intrinsics.d(this.f56863c, hVar.f56863c);
    }

    public final int hashCode() {
        return this.f56863c.hashCode() + a.a.a(this.f56862b, Boolean.hashCode(this.f56861a) * 31, 31);
    }
}
