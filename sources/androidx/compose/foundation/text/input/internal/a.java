package androidx.compose.foundation.text.input.internal;

import a3.d;
import android.view.inputmethod.ExtractedText;
import b2.t0;
import b4.i0;
import b4.m0;
import b4.o;
import b4.p0;
import b7.c;
import h4.f0;
import kotlin.text.StringsKt;
import q3.x;
import t3.e4;
import u2.q;
import w1.l1;
import w1.r2;
import y1.c0;

/* loaded from: classes2.dex */
public abstract class a {
    public static final long a(l1 l1Var, d dVar, d dVar2, int i13) {
        long f13 = f(l1Var, dVar, i13);
        if (p0.b(f13)) {
            return p0.f21639b;
        }
        long f14 = f(l1Var, dVar2, i13);
        if (p0.b(f14)) {
            return p0.f21639b;
        }
        int i14 = (int) (f13 >> 32);
        int i15 = (int) (f14 & 4294967295L);
        return c.h(Math.min(i14, i14), Math.max(i15, i15));
    }

    public static final boolean b(m0 m0Var, int i13) {
        int f13 = m0Var.f(i13);
        if (i13 == m0Var.i(f13) || i13 == m0Var.e(f13, false)) {
            if (m0Var.j(i13) == m0Var.a(i13)) {
                return false;
            }
        } else if (m0Var.a(i13) == m0Var.a(i13 - 1)) {
            return false;
        }
        return true;
    }

    public static final ExtractedText c(f0 f0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = f0Var.f67559a.f21571a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j13 = f0Var.f67560b;
        extractedText.selectionStart = p0.e(j13);
        extractedText.selectionEnd = p0.d(j13);
        extractedText.flags = !StringsKt.F(f0Var.f67559a.f21571a, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final boolean d(d dVar, float f13, float f14) {
        return f13 <= dVar.f486c && dVar.f484a <= f13 && f14 <= dVar.f487d && dVar.f485b <= f14;
    }

    public static final int e(o oVar, long j13, e4 e4Var) {
        float g13 = e4Var != null ? e4Var.g() : 0.0f;
        int c13 = oVar.c(a3.c.e(j13));
        if (a3.c.e(j13) < oVar.d(c13) - g13 || a3.c.e(j13) > oVar.b(c13) + g13 || a3.c.d(j13) < (-g13) || a3.c.d(j13) > oVar.f21628d + g13) {
            return -1;
        }
        return c13;
    }

    public static final long f(l1 l1Var, d dVar, int i13) {
        m0 m0Var;
        r2 d2 = l1Var.d();
        o oVar = (d2 == null || (m0Var = d2.f127471a) == null) ? null : m0Var.f21616b;
        x c13 = l1Var.c();
        return (oVar == null || c13 == null) ? p0.f21639b : oVar.f(dVar.h(c13.B(0L)), i13, i0.f21597b);
    }

    public static final boolean g(int i13) {
        int type = Character.getType(i13);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean h(int i13) {
        return Character.isWhitespace(i13) || i13 == 160;
    }

    public static final boolean i(int i13) {
        int type;
        return (!h(i13) || (type = Character.getType(i13)) == 14 || type == 13 || i13 == 10) ? false : true;
    }

    public static final q j(q qVar, c0 c0Var, l1 l1Var, t0 t0Var) {
        return qVar.j(new LegacyAdaptingPlatformTextInputModifier(c0Var, l1Var, t0Var));
    }
}
