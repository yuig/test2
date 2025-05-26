package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.layout.b;
import kotlin.jvm.functions.Function0;
import u2.n;
import u2.q;
import x1.e;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final float f17356a = 40;

    /* renamed from: b, reason: collision with root package name */
    public static final float f17357b = 10;

    public static final q a(Function0 function0, boolean z13) {
        n nVar = n.f120041b;
        return (z13 && e.f131562a) ? b.o(new StylusHandwritingElementWithNegativePadding(function0), f17357b, f17356a) : nVar;
    }
}
