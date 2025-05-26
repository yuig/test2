package dev.shreyaspatil.capturable;

import df2.b;
import kotlin.jvm.internal.Intrinsics;
import u2.q;

/* loaded from: classes4.dex */
public abstract class a {
    public static final q a(q qVar, b controller) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(controller, "controller");
        return qVar.j(new CapturableModifierNodeElement(controller));
    }
}
