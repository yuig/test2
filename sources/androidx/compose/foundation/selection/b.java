package androidx.compose.foundation.selection;

import androidx.compose.foundation.d;
import ao2.m0;
import k1.k1;
import k1.q1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o1.l;
import t3.p;
import u2.n;
import u2.q;
import z3.g;

/* loaded from: classes2.dex */
public abstract class b {
    public static final q a(q qVar, boolean z13, l lVar, k1 k1Var, boolean z14, g gVar, Function0 function0) {
        q p13;
        if (k1Var instanceof q1) {
            p13 = new SelectableElement(z13, lVar, (q1) k1Var, z14, gVar, function0);
        } else if (k1Var == null) {
            p13 = new SelectableElement(z13, lVar, null, z14, gVar, function0);
        } else {
            n nVar = n.f120041b;
            if (lVar != null) {
                p13 = d.a(nVar, lVar, k1Var).j(new SelectableElement(z13, lVar, null, z14, gVar, function0));
            } else {
                p13 = m0.p(nVar, p.f116119m, new a(k1Var, z13, z14, gVar, function0, 0));
            }
        }
        return qVar.j(p13);
    }

    public static final q b(q qVar, boolean z13, l lVar, boolean z14, g gVar, Function1 function1) {
        return qVar.j(new ToggleableElement(z13, lVar, z14, gVar, function1));
    }
}
