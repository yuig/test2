package androidx.compose.ui.layout;

import a3.d;
import com.bumptech.glide.c;
import kl2.l;
import kotlin.jvm.functions.Function1;
import q3.j1;
import q3.x;
import s3.q1;
import u2.q;

/* loaded from: classes.dex */
public abstract class b {
    public static final long a(float f13, float f14) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
        int i13 = j1.f102224b;
        return floatToRawIntBits;
    }

    public static final d b(x xVar) {
        x V = xVar.V();
        return V != null ? V.J(xVar, true) : new d(0.0f, 0.0f, (int) (xVar.j() >> 32), (int) (xVar.j() & 4294967295L));
    }

    public static final d c(x xVar) {
        return e(xVar).J(xVar, true);
    }

    public static final d d(x xVar) {
        x e13 = e(xVar);
        float j13 = (int) (e13.j() >> 32);
        float j14 = (int) (e13.j() & 4294967295L);
        d J2 = e(xVar).J(xVar, true);
        float f13 = J2.f484a;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > j13) {
            f13 = j13;
        }
        float f14 = J2.f485b;
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > j14) {
            f14 = j14;
        }
        float f15 = J2.f486c;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        if (f15 <= j13) {
            j13 = f15;
        }
        float f16 = J2.f487d;
        float f17 = f16 >= 0.0f ? f16 : 0.0f;
        if (f17 <= j14) {
            j14 = f17;
        }
        if (f13 == j13 || f14 == j14) {
            return d.f483e;
        }
        long E = e13.E(c.d(f13, f14));
        long E2 = e13.E(c.d(j13, f14));
        long E3 = e13.E(c.d(j13, j14));
        long E4 = e13.E(c.d(f13, j14));
        float d2 = a3.c.d(E);
        float d13 = a3.c.d(E2);
        float d14 = a3.c.d(E4);
        float d15 = a3.c.d(E3);
        float min = Math.min(d2, Math.min(d13, Math.min(d14, d15)));
        float max = Math.max(d2, Math.max(d13, Math.max(d14, d15)));
        float e14 = a3.c.e(E);
        float e15 = a3.c.e(E2);
        float e16 = a3.c.e(E4);
        float e17 = a3.c.e(E3);
        return new d(min, Math.min(e14, Math.min(e15, Math.min(e16, e17))), max, Math.max(e14, Math.max(e15, Math.max(e16, e17))));
    }

    public static final x e(x xVar) {
        x xVar2;
        x V = xVar.V();
        while (true) {
            x xVar3 = V;
            xVar2 = xVar;
            xVar = xVar3;
            if (xVar == null) {
                break;
            }
            V = xVar.V();
        }
        q1 q1Var = xVar2 instanceof q1 ? (q1) xVar2 : null;
        if (q1Var == null) {
            return xVar2;
        }
        q1 q1Var2 = q1Var.f110901o;
        while (true) {
            q1 q1Var3 = q1Var2;
            q1 q1Var4 = q1Var;
            q1Var = q1Var3;
            if (q1Var == null) {
                return q1Var4;
            }
            q1Var2 = q1Var.f110901o;
        }
    }

    public static final q f(q qVar, l lVar) {
        return qVar.j(new LayoutElement(lVar));
    }

    public static final q g(q qVar, Function1 function1) {
        return qVar.j(new OnGloballyPositionedElement(function1));
    }

    public static final q h(q qVar, Function1 function1) {
        return qVar.j(new OnSizeChangedModifier(function1));
    }
}
