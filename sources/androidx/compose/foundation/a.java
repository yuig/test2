package androidx.compose.foundation;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao2.m0;
import b3.x0;
import i2.f2;
import i2.o;
import i2.s;
import k1.a0;
import k1.k1;
import k1.q1;
import k1.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import lb.l0;
import o1.l;
import t3.p;
import u2.n;
import u2.q;
import z3.g;

/* loaded from: classes2.dex */
public abstract class a {
    public static final void a(q qVar, Function1 function1, o oVar, int i13) {
        int i14;
        s sVar = (s) oVar;
        sVar.Y(-932836462);
        if ((i13 & 6) == 0) {
            i14 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.j(function1) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            androidx.compose.foundation.layout.a.a(androidx.compose.ui.draw.a.d(qVar, function1), sVar);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new z(qVar, function1, i13, 0);
        }
    }

    public static final q b(q qVar, long j13, x0 x0Var) {
        return qVar.j(new BackgroundElement(j13, x0Var));
    }

    public static final q c(q qVar, l lVar, k1 k1Var, boolean z13, String str, g gVar, Function0 function0) {
        q p13;
        if (k1Var instanceof q1) {
            p13 = new ClickableElement(lVar, (q1) k1Var, z13, str, gVar, function0);
        } else if (k1Var == null) {
            p13 = new ClickableElement(lVar, null, z13, str, gVar, function0);
        } else {
            n nVar = n.f120041b;
            if (lVar != null) {
                p13 = d.a(nVar, lVar, k1Var).j(new ClickableElement(lVar, null, z13, str, gVar, function0));
            } else {
                p13 = m0.p(nVar, p.f116119m, new b(k1Var, z13, str, gVar, function0));
            }
        }
        return qVar.j(p13);
    }

    public static /* synthetic */ q d(q qVar, l lVar, k1 k1Var, boolean z13, g gVar, Function0 function0, int i13) {
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        boolean z14 = z13;
        if ((i13 & 16) != 0) {
            gVar = null;
        }
        return c(qVar, lVar, k1Var, z14, null, gVar, function0);
    }

    public static q e(q qVar, boolean z13, String str, Function0 function0, int i13) {
        if ((i13 & 1) != 0) {
            z13 = true;
        }
        if ((i13 & 2) != 0) {
            str = null;
        }
        return m0.p(qVar, p.f116119m, new a0(z13, str, (g) null, function0));
    }

    public static q f(q qVar, l lVar, Function0 function0) {
        return qVar.j(new CombinedClickableElement(lVar, null, null, null, function0, null, null, true));
    }

    public static q g(l lVar, q qVar) {
        return qVar.j(new HoverableElement(lVar));
    }

    public static final boolean h(o oVar) {
        return (((Configuration) ((s) oVar).m(AndroidCompositionLocals_androidKt.f17454a)).uiMode & 48) == 32;
    }

    public static final long i(long j13, float f13) {
        return l0.c(Math.max(0.0f, a3.a.b(j13) - f13), Math.max(0.0f, a3.a.c(j13) - f13));
    }
}
