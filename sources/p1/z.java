package p1;

import a.cb;
import androidx.compose.foundation.layout.LayoutWeightElement;

/* loaded from: classes.dex */
public interface z {
    static u2.q a(z zVar, u2.q qVar, float f13) {
        ((a0) zVar).getClass();
        if (f13 > 0.0d) {
            return qVar.j(new LayoutWeightElement(ql2.s.c(f13, Float.MAX_VALUE), true));
        }
        throw new IllegalArgumentException(cb.h("invalid weight ", f13, "; must be greater than zero").toString());
    }
}
