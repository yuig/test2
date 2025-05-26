package com.pinterest.framework.ui;

import kotlin.jvm.internal.Intrinsics;
import u2.n;
import u2.q;
import yy0.y;

/* loaded from: classes5.dex */
public abstract class a {
    public static final q a(y visibleEvent) {
        Intrinsics.checkNotNullParameter(n.f120041b, "<this>");
        Intrinsics.checkNotNullParameter(visibleEvent, "visibleEvent");
        return new VisibilityAwareModifierElement(visibleEvent);
    }
}
