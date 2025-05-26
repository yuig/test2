package h4;

import android.view.inputmethod.CursorAnchorInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class c {
    @NotNull
    public static final CursorAnchorInfo.Builder a(@NotNull CursorAnchorInfo.Builder builder, @NotNull b4.m0 m0Var, @NotNull a3.d dVar) {
        int c13;
        b4.o oVar;
        int c14;
        if (dVar.f484a < dVar.f486c) {
            float f13 = dVar.f485b;
            float f14 = dVar.f487d;
            if (f13 < f14 && (c13 = m0Var.f21616b.c(f13)) <= (c14 = (oVar = m0Var.f21616b).c(f14))) {
                while (true) {
                    builder.addVisibleLineBounds(m0Var.g(c13), oVar.d(c13), m0Var.h(c13), oVar.b(c13));
                    if (c13 == c14) {
                        break;
                    }
                    c13++;
                }
            }
        }
        return builder;
    }
}
