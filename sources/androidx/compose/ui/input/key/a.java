package androidx.compose.ui.input.key;

import j1.x0;
import kotlin.jvm.functions.Function1;
import u2.q;

/* loaded from: classes.dex */
public abstract class a {
    public static final q a(q qVar, Function1 function1) {
        return qVar.j(new KeyInputElement(function1, null));
    }

    public static final q b(q qVar, x0 x0Var) {
        return qVar.j(new KeyInputElement(null, x0Var));
    }
}
