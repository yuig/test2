package kw1;

import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final fy1.e f81040a = new fy1.e(fy1.d.PERCENTAGE, 2);

    public static final void a(GestaltText gestaltText, Double d2) {
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        if (d2 == null) {
            a0.p(gestaltText, "");
            return;
        }
        String t03 = f81040a.t0(d2.doubleValue());
        if (d2.doubleValue() > 0.0d) {
            gestaltText.i(new c(t03, 0));
        } else if (Intrinsics.b(d2, 0.0d)) {
            gestaltText.i(new c(t03, 1));
        } else {
            gestaltText.i(new c(t03, 2));
        }
    }
}
