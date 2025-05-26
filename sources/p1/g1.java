package p1;

import a.cb;
import androidx.compose.foundation.layout.LayoutWeightElement;

/* loaded from: classes2.dex */
public final class g1 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g1 f98514a = new g1();

    public final u2.q b(u2.q qVar, float f13, boolean z13) {
        if (f13 > 0.0d) {
            return qVar.j(new LayoutWeightElement(ql2.s.c(f13, Float.MAX_VALUE), z13));
        }
        throw new IllegalArgumentException(cb.h("invalid weight ", f13, "; must be greater than zero").toString());
    }
}
