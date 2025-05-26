package t3;

import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class b4 implements c4 {

    /* renamed from: b, reason: collision with root package name */
    public static final b4 f115859b = new b4();

    public final Function0 a(AbstractComposeView abstractComposeView) {
        if (!abstractComposeView.isAttachedToWindow()) {
            kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
            a4 a4Var = new a4(0, abstractComposeView, j0Var);
            abstractComposeView.addOnAttachStateChangeListener(a4Var);
            j0Var.f80434a = new k1.v0(16, abstractComposeView, a4Var);
            return new z3(0, j0Var);
        }
        androidx.lifecycle.z r13 = b7.c.r(abstractComposeView);
        if (r13 != null) {
            return androidx.compose.ui.platform.a.a(abstractComposeView, r13.getLifecycle());
        }
        jk.r.z("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
        throw null;
    }
}
