package androidx.compose.ui.platform;

import a3.c;
import a3.d;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import androidx.lifecycle.b0;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import b3.j0;
import b3.k0;
import b3.l0;
import b3.m0;
import b3.o0;
import b3.w;
import b3.w0;
import b4.e;
import b4.g;
import b4.g0;
import g4.j;
import g4.k;
import g4.l;
import java.util.Arrays;
import java.util.List;
import k1.v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m4.p;
import n4.m;
import t3.d4;
import t3.g2;
import u2.q;

/* loaded from: classes2.dex */
public abstract class a {
    public static final v0 a(AbstractComposeView abstractComposeView, s sVar) {
        if (((b0) sVar).f18588d.compareTo(r.DESTROYED) > 0) {
            d4 d4Var = new d4(abstractComposeView, 0);
            sVar.a(d4Var);
            return new v0(17, sVar, d4Var);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + sVar + "is already destroyed").toString());
    }

    public static final int b(float f13) {
        return ((int) (f13 >= 0.0f ? Math.ceil(f13) : Math.floor(f13))) * (-1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0092, code lost:
    
        r17 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final b4.g c(java.lang.CharSequence r43) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.a.c(java.lang.CharSequence):b4.g");
    }

    public static final CharSequence d(g gVar) {
        boolean isEmpty = gVar.b().isEmpty();
        String str = gVar.f21571a;
        if (isEmpty) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        g2 g2Var = new g2();
        g2Var.f116005a = Parcel.obtain();
        List b13 = gVar.b();
        int size = b13.size();
        for (int i13 = 0; i13 < size; i13++) {
            e eVar = (e) b13.get(i13);
            g0 g0Var = (g0) eVar.f21542a;
            g2Var.f116005a.recycle();
            g2Var.f116005a = Parcel.obtain();
            long b14 = g0Var.f21575a.b();
            long j13 = w.f21390n;
            if (!w.c(b14, j13)) {
                g2Var.b((byte) 1);
                g2Var.f116005a.writeLong(g0Var.f21575a.b());
            }
            long j14 = m.f89189c;
            long j15 = g0Var.f21576b;
            byte b15 = 2;
            if (!m.a(j15, j14)) {
                g2Var.b((byte) 2);
                g2Var.d(j15);
            }
            l lVar = g0Var.f21577c;
            if (lVar != null) {
                g2Var.b((byte) 3);
                g2Var.f116005a.writeInt(lVar.f63474a);
            }
            j jVar = g0Var.f21578d;
            if (jVar != null) {
                g2Var.b((byte) 4);
                int i14 = jVar.f63465a;
                g2Var.b((!j.a(i14, 0) && j.a(i14, 1)) ? (byte) 1 : (byte) 0);
            }
            k kVar = g0Var.f21579e;
            if (kVar != null) {
                g2Var.b((byte) 5);
                int i15 = kVar.f63466a;
                if (!k.a(i15, 0)) {
                    if (k.a(i15, 1)) {
                        b15 = 1;
                    } else if (!k.a(i15, 2)) {
                        if (k.a(i15, 3)) {
                            b15 = 3;
                        }
                    }
                    g2Var.b(b15);
                }
                b15 = 0;
                g2Var.b(b15);
            }
            String str2 = g0Var.f21581g;
            if (str2 != null) {
                g2Var.b((byte) 6);
                g2Var.f116005a.writeString(str2);
            }
            long j16 = g0Var.f21582h;
            if (!m.a(j16, j14)) {
                g2Var.b((byte) 7);
                g2Var.d(j16);
            }
            m4.a aVar = g0Var.f21583i;
            if (aVar != null) {
                g2Var.b((byte) 8);
                g2Var.c(aVar.f85783a);
            }
            p pVar = g0Var.f21584j;
            if (pVar != null) {
                g2Var.b((byte) 9);
                g2Var.c(pVar.f85807a);
                g2Var.c(pVar.f85808b);
            }
            long j17 = g0Var.f21586l;
            if (!w.c(j17, j13)) {
                g2Var.b((byte) 10);
                g2Var.f116005a.writeLong(j17);
            }
            m4.k kVar2 = g0Var.f21587m;
            if (kVar2 != null) {
                g2Var.b((byte) 11);
                g2Var.f116005a.writeInt(kVar2.f85801a);
            }
            w0 w0Var = g0Var.f21588n;
            if (w0Var != null) {
                g2Var.b((byte) 12);
                g2Var.f116005a.writeLong(w0Var.f21394a);
                long j18 = w0Var.f21395b;
                g2Var.c(c.d(j18));
                g2Var.c(c.e(j18));
                g2Var.c(w0Var.f21396c);
            }
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(g2Var.f116005a.marshall(), 0)), eVar.f21543b, eVar.f21544c, 33);
        }
        return spannableString;
    }

    public static final boolean e(m0 m0Var, float f13, float f14, o0 o0Var, o0 o0Var2) {
        boolean h10;
        if (!(m0Var instanceof k0)) {
            if (!(m0Var instanceof l0)) {
                if (m0Var instanceof j0) {
                    return g(((j0) m0Var).f21333a, f13, f14, o0Var, o0Var2);
                }
                throw new NoWhenBranchMatchedException();
            }
            a3.e eVar = ((l0) m0Var).f21340a;
            if (f13 < eVar.f488a) {
                return false;
            }
            float f15 = eVar.f490c;
            if (f13 >= f15) {
                return false;
            }
            float f16 = eVar.f489b;
            if (f14 < f16) {
                return false;
            }
            float f17 = eVar.f491d;
            if (f14 >= f17) {
                return false;
            }
            long j13 = eVar.f492e;
            float b13 = a3.a.b(j13);
            long j14 = eVar.f493f;
            if (a3.a.b(j14) + b13 <= eVar.b()) {
                long j15 = eVar.f495h;
                float b14 = a3.a.b(j15);
                long j16 = eVar.f494g;
                if (a3.a.b(j16) + b14 <= eVar.b()) {
                    if (a3.a.c(j15) + a3.a.c(j13) <= eVar.a()) {
                        if (a3.a.c(j16) + a3.a.c(j14) <= eVar.a()) {
                            float b15 = a3.a.b(j13);
                            float f18 = eVar.f488a;
                            float f19 = b15 + f18;
                            float c13 = a3.a.c(j13) + f16;
                            float b16 = f15 - a3.a.b(j14);
                            float c14 = a3.a.c(j14) + f16;
                            float b17 = f15 - a3.a.b(j16);
                            float c15 = f17 - a3.a.c(j16);
                            float c16 = f17 - a3.a.c(j15);
                            float b18 = f18 + a3.a.b(j15);
                            if (f13 < f19 && f14 < c13) {
                                h10 = h(f13, f14, f19, c13, eVar.f492e);
                            } else if (f13 < b18 && f14 > c16) {
                                h10 = h(f13, f14, b18, c16, eVar.f495h);
                            } else if (f13 > b16 && f14 < c14) {
                                h10 = h(f13, f14, b16, c14, eVar.f493f);
                            } else if (f13 > b17 && f14 > c15) {
                                h10 = h(f13, f14, b17, c15, eVar.f494g);
                            }
                            return h10;
                        }
                    }
                }
            }
            o0 h13 = o0Var2 == null ? androidx.compose.ui.graphics.a.h() : o0Var2;
            o0.b(h13, eVar);
            return g(h13, f13, f14, o0Var, o0Var2);
        }
        d dVar = ((k0) m0Var).f21338a;
        if (dVar.f484a > f13 || f13 >= dVar.f486c || dVar.f485b > f14 || f14 >= dVar.f487d) {
            return false;
        }
        return true;
    }

    public static final boolean g(o0 o0Var, float f13, float f14, o0 o0Var2, o0 o0Var3) {
        d dVar = new d(f13 - 0.005f, f14 - 0.005f, f13 + 0.005f, f14 + 0.005f);
        if (o0Var2 == null) {
            o0Var2 = androidx.compose.ui.graphics.a.h();
        }
        o0.a(o0Var2, dVar);
        if (o0Var3 == null) {
            o0Var3 = androidx.compose.ui.graphics.a.h();
        }
        b3.k kVar = (b3.k) o0Var3;
        kVar.e(o0Var, o0Var2, 1);
        boolean isEmpty = kVar.f21334a.isEmpty();
        kVar.h();
        ((b3.k) o0Var2).h();
        return !isEmpty;
    }

    public static final boolean h(float f13, float f14, float f15, float f16, long j13) {
        float f17 = f13 - f15;
        float f18 = f14 - f16;
        float b13 = a3.a.b(j13);
        float c13 = a3.a.c(j13);
        return ((f18 * f18) / (c13 * c13)) + ((f17 * f17) / (b13 * b13)) <= 1.0f;
    }

    public static final String i(Object obj) {
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(name);
        sb3.append('@');
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        sb3.append(format);
        return sb3.toString();
    }

    public static final q j(q qVar, String str) {
        return qVar.j(new TestTagElement(str));
    }
}
