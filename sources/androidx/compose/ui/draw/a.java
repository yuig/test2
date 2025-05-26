package androidx.compose.ui.draw;

import b3.p;
import b3.x0;
import g3.b;
import kotlin.jvm.functions.Function1;
import q3.n;
import u2.e;
import u2.q;

/* loaded from: classes.dex */
public abstract class a {
    public static final q a(q qVar, float f13) {
        return f13 == 1.0f ? qVar : androidx.compose.ui.graphics.a.o(qVar, 0.0f, 0.0f, f13, 0.0f, null, true, 126971);
    }

    public static final q b(q qVar, x0 x0Var) {
        return androidx.compose.ui.graphics.a.o(qVar, 0.0f, 0.0f, 0.0f, 0.0f, x0Var, true, 124927);
    }

    public static final q c(q qVar) {
        return androidx.compose.ui.graphics.a.o(qVar, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 126975);
    }

    public static final q d(q qVar, Function1 function1) {
        return qVar.j(new DrawBehindElement(function1));
    }

    public static final q e(q qVar, Function1 function1) {
        return qVar.j(new DrawWithCacheElement(function1));
    }

    public static final q f(q qVar, Function1 function1) {
        return qVar.j(new DrawWithContentElement(function1));
    }

    public static q g(q qVar, b bVar, e eVar, n nVar, float f13, p pVar, int i13) {
        if ((i13 & 4) != 0) {
            eVar = u2.b.f120017e;
        }
        e eVar2 = eVar;
        if ((i13 & 16) != 0) {
            f13 = 1.0f;
        }
        return qVar.j(new PainterElement(bVar, true, eVar2, nVar, f13, pVar));
    }

    public static final q h(q qVar, float f13) {
        return (f13 == 1.0f && f13 == 1.0f) ? qVar : androidx.compose.ui.graphics.a.o(qVar, f13, f13, 0.0f, 0.0f, null, false, 131068);
    }
}
