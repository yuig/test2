package b4;

import android.graphics.RectF;
import android.text.Layout;
import java.text.BreakIterator;
import java.util.ArrayList;
import kh2.k3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import w1.x0;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f21615a;

    /* renamed from: b, reason: collision with root package name */
    public final o f21616b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21617c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21618d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21619e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f21620f;

    public m0(l0 l0Var, o oVar, long j13) {
        this.f21615a = l0Var;
        this.f21616b = oVar;
        this.f21617c = j13;
        ArrayList arrayList = oVar.f21632h;
        float f13 = 0.0f;
        this.f21618d = arrayList.isEmpty() ? 0.0f : ((b) ((s) arrayList.get(0)).f21652a).f21510d.d(0);
        ArrayList arrayList2 = oVar.f21632h;
        if (!arrayList2.isEmpty()) {
            s sVar = (s) CollectionsKt.b0(arrayList2);
            f13 = ((b) sVar.f21652a).f21510d.d(r3.f25691g - 1) + sVar.f21657f;
        }
        this.f21619e = f13;
        this.f21620f = oVar.f21631g;
    }

    public final m4.h a(int i13) {
        o oVar = this.f21616b;
        oVar.j(i13);
        int length = oVar.f21625a.f21642a.f21571a.length();
        ArrayList arrayList = oVar.f21632h;
        s sVar = (s) arrayList.get(i13 == length ? kotlin.collections.f0.i(arrayList) : k3.S(i13, arrayList));
        return ((b) sVar.f21652a).f21510d.f25690f.isRtlCharAt(sVar.b(i13)) ? m4.h.Rtl : m4.h.Ltr;
    }

    public final a3.d b(int i13) {
        float i14;
        float i15;
        float h10;
        float h13;
        o oVar = this.f21616b;
        oVar.i(i13);
        ArrayList arrayList = oVar.f21632h;
        s sVar = (s) arrayList.get(k3.S(i13, arrayList));
        r rVar = sVar.f21652a;
        int b13 = sVar.b(i13);
        b bVar = (b) rVar;
        CharSequence charSequence = bVar.f21511e;
        if (b13 < 0 || b13 >= charSequence.length()) {
            StringBuilder s13 = a.a.s("offset(", b13, ") is out of bounds [0,");
            s13.append(charSequence.length());
            s13.append(')');
            throw new IllegalArgumentException(s13.toString().toString());
        }
        c4.z zVar = bVar.f21510d;
        Layout layout = zVar.f25690f;
        int lineForOffset = layout.getLineForOffset(b13);
        float g13 = zVar.g(lineForOffset);
        float e13 = zVar.e(lineForOffset);
        boolean z13 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(b13);
        if (!z13 || isRtlCharAt) {
            if (z13 && isRtlCharAt) {
                h10 = zVar.i(b13, false);
                h13 = zVar.i(b13 + 1, true);
            } else if (isRtlCharAt) {
                h10 = zVar.h(b13, false);
                h13 = zVar.h(b13 + 1, true);
            } else {
                i14 = zVar.i(b13, false);
                i15 = zVar.i(b13 + 1, true);
            }
            float f13 = h10;
            i14 = h13;
            i15 = f13;
        } else {
            i14 = zVar.h(b13, false);
            i15 = zVar.h(b13 + 1, true);
        }
        RectF rectF = new RectF(i14, g13, i15, e13);
        float f14 = rectF.left;
        float f15 = rectF.top;
        float f16 = rectF.right;
        float f17 = rectF.bottom;
        long d2 = com.bumptech.glide.c.d(0.0f, sVar.f21657f);
        return new a3.d(a3.c.d(d2) + f14, a3.c.e(d2) + f15, a3.c.d(d2) + f16, a3.c.e(d2) + f17);
    }

    public final a3.d c(int i13) {
        o oVar = this.f21616b;
        oVar.j(i13);
        int length = oVar.f21625a.f21642a.f21571a.length();
        ArrayList arrayList = oVar.f21632h;
        s sVar = (s) arrayList.get(i13 == length ? kotlin.collections.f0.i(arrayList) : k3.S(i13, arrayList));
        r rVar = sVar.f21652a;
        int b13 = sVar.b(i13);
        b bVar = (b) rVar;
        CharSequence charSequence = bVar.f21511e;
        if (b13 < 0 || b13 > charSequence.length()) {
            StringBuilder s13 = a.a.s("offset(", b13, ") is out of bounds [0,");
            s13.append(charSequence.length());
            s13.append(']');
            throw new IllegalArgumentException(s13.toString().toString());
        }
        c4.z zVar = bVar.f21510d;
        float h10 = zVar.h(b13, false);
        int lineForOffset = zVar.f25690f.getLineForOffset(b13);
        float g13 = zVar.g(lineForOffset);
        float e13 = zVar.e(lineForOffset);
        long d2 = com.bumptech.glide.c.d(0.0f, sVar.f21657f);
        return new a3.d(a3.c.d(d2) + h10, a3.c.e(d2) + g13, a3.c.d(d2) + h10, a3.c.e(d2) + e13);
    }

    public final l0 d() {
        return this.f21615a;
    }

    public final int e(int i13, boolean z13) {
        int f13;
        o oVar = this.f21616b;
        oVar.k(i13);
        ArrayList arrayList = oVar.f21632h;
        s sVar = (s) arrayList.get(k3.T(i13, arrayList));
        r rVar = sVar.f21652a;
        int i14 = i13 - sVar.f21655d;
        c4.z zVar = ((b) rVar).f21510d;
        if (z13) {
            Layout layout = zVar.f25690f;
            if (layout.getEllipsisStart(i14) == 0) {
                c4.n c13 = zVar.c();
                Layout layout2 = c13.f25648a;
                f13 = c13.f(layout2.getLineEnd(i14), layout2.getLineStart(i14));
            } else {
                f13 = layout.getEllipsisStart(i14) + layout.getLineStart(i14);
            }
        } else {
            f13 = zVar.f(i14);
        }
        return f13 + sVar.f21653b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.f21615a, m0Var.f21615a) && Intrinsics.d(this.f21616b, m0Var.f21616b) && n4.j.a(this.f21617c, m0Var.f21617c) && this.f21618d == m0Var.f21618d && this.f21619e == m0Var.f21619e && Intrinsics.d(this.f21620f, m0Var.f21620f);
    }

    public final int f(int i13) {
        o oVar = this.f21616b;
        int length = oVar.f21625a.f21642a.f21571a.length();
        ArrayList arrayList = oVar.f21632h;
        s sVar = (s) arrayList.get(i13 >= length ? kotlin.collections.f0.i(arrayList) : i13 < 0 ? 0 : k3.S(i13, arrayList));
        return ((b) sVar.f21652a).f21510d.f25690f.getLineForOffset(sVar.b(i13)) + sVar.f21655d;
    }

    public final float g(int i13) {
        o oVar = this.f21616b;
        oVar.k(i13);
        ArrayList arrayList = oVar.f21632h;
        s sVar = (s) arrayList.get(k3.T(i13, arrayList));
        r rVar = sVar.f21652a;
        int i14 = i13 - sVar.f21655d;
        c4.z zVar = ((b) rVar).f21510d;
        return zVar.f25690f.getLineLeft(i14) + (i14 == zVar.f25691g + (-1) ? zVar.f25694j : 0.0f);
    }

    public final float h(int i13) {
        o oVar = this.f21616b;
        oVar.k(i13);
        ArrayList arrayList = oVar.f21632h;
        s sVar = (s) arrayList.get(k3.T(i13, arrayList));
        r rVar = sVar.f21652a;
        int i14 = i13 - sVar.f21655d;
        c4.z zVar = ((b) rVar).f21510d;
        return zVar.f25690f.getLineRight(i14) + (i14 == zVar.f25691g + (-1) ? zVar.f25695k : 0.0f);
    }

    public final int hashCode() {
        return this.f21620f.hashCode() + a.a.a(this.f21619e, a.a.a(this.f21618d, a.a.c(this.f21617c, (this.f21616b.hashCode() + (this.f21615a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final int i(int i13) {
        o oVar = this.f21616b;
        oVar.k(i13);
        ArrayList arrayList = oVar.f21632h;
        s sVar = (s) arrayList.get(k3.T(i13, arrayList));
        r rVar = sVar.f21652a;
        return ((b) rVar).f21510d.f25690f.getLineStart(i13 - sVar.f21655d) + sVar.f21653b;
    }

    public final m4.h j(int i13) {
        o oVar = this.f21616b;
        oVar.j(i13);
        int length = oVar.f21625a.f21642a.f21571a.length();
        ArrayList arrayList = oVar.f21632h;
        s sVar = (s) arrayList.get(i13 == length ? kotlin.collections.f0.i(arrayList) : k3.S(i13, arrayList));
        r rVar = sVar.f21652a;
        int b13 = sVar.b(i13);
        c4.z zVar = ((b) rVar).f21510d;
        return zVar.f25690f.getParagraphDirection(zVar.f25690f.getLineForOffset(b13)) == 1 ? m4.h.Ltr : m4.h.Rtl;
    }

    public final b3.k k(int i13, int i14) {
        o oVar = this.f21616b;
        q qVar = oVar.f21625a;
        if (i13 < 0 || i13 > i14 || i14 > qVar.f21642a.f21571a.length()) {
            StringBuilder t13 = a.a.t("Start(", i13, ") or End(", i14, ") is out of range [0..");
            t13.append(qVar.f21642a.f21571a.length());
            t13.append("), or start > end!");
            throw new IllegalArgumentException(t13.toString().toString());
        }
        if (i13 == i14) {
            return androidx.compose.ui.graphics.a.h();
        }
        b3.k h10 = androidx.compose.ui.graphics.a.h();
        k3.V(oVar.f21632h, b7.c.h(i13, i14), new x0(h10, i13, i14, 1));
        return h10;
    }

    public final long l(int i13) {
        int preceding;
        int i14;
        int following;
        o oVar = this.f21616b;
        oVar.j(i13);
        int length = oVar.f21625a.f21642a.f21571a.length();
        ArrayList arrayList = oVar.f21632h;
        s sVar = (s) arrayList.get(i13 == length ? kotlin.collections.f0.i(arrayList) : k3.S(i13, arrayList));
        r rVar = sVar.f21652a;
        int b13 = sVar.b(i13);
        d4.g j13 = ((b) rVar).f21510d.j();
        j13.a(b13);
        BreakIterator breakIterator = j13.f53675d;
        if (j13.e(breakIterator.preceding(b13))) {
            j13.a(b13);
            preceding = b13;
            while (preceding != -1 && (!j13.e(preceding) || j13.c(preceding))) {
                j13.a(preceding);
                preceding = breakIterator.preceding(preceding);
            }
        } else {
            j13.a(b13);
            preceding = j13.d(b13) ? (!breakIterator.isBoundary(b13) || j13.b(b13)) ? breakIterator.preceding(b13) : b13 : j13.b(b13) ? breakIterator.preceding(b13) : -1;
        }
        if (preceding == -1) {
            preceding = b13;
        }
        j13.a(b13);
        if (j13.c(breakIterator.following(b13))) {
            j13.a(b13);
            i14 = b13;
            while (i14 != -1 && (j13.e(i14) || !j13.c(i14))) {
                j13.a(i14);
                i14 = breakIterator.following(i14);
            }
        } else {
            j13.a(b13);
            if (j13.b(b13)) {
                following = (!breakIterator.isBoundary(b13) || j13.d(b13)) ? breakIterator.following(b13) : b13;
            } else if (j13.d(b13)) {
                following = breakIterator.following(b13);
            } else {
                i14 = -1;
            }
            i14 = following;
        }
        if (i14 != -1) {
            b13 = i14;
        }
        return sVar.a(b7.c.h(preceding, b13), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f21615a + ", multiParagraph=" + this.f21616b + ", size=" + ((Object) n4.j.d(this.f21617c)) + ", firstBaseline=" + this.f21618d + ", lastBaseline=" + this.f21619e + ", placeholderRects=" + this.f21620f + ')';
    }
}
