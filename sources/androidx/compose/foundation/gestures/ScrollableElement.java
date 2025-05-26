package androidx.compose.foundation.gestures;

import com.bumptech.glide.c;
import ep.b;
import k1.e2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1.c1;
import m1.e;
import m1.f1;
import m1.g2;
import m1.h2;
import m1.o;
import m1.o1;
import m1.o2;
import m1.q1;
import o1.l;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Ls3/e1;", "Lm1/g2;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ScrollableElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final h2 f17134b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f17135c;

    /* renamed from: d, reason: collision with root package name */
    public final e2 f17136d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17137e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17138f;

    /* renamed from: g, reason: collision with root package name */
    public final c1 f17139g;

    /* renamed from: h, reason: collision with root package name */
    public final l f17140h;

    /* renamed from: i, reason: collision with root package name */
    public final e f17141i;

    public ScrollableElement(e2 e2Var, e eVar, c1 c1Var, f1 f1Var, h2 h2Var, l lVar, boolean z13, boolean z14) {
        this.f17134b = h2Var;
        this.f17135c = f1Var;
        this.f17136d = e2Var;
        this.f17137e = z13;
        this.f17138f = z14;
        this.f17139g = c1Var;
        this.f17140h = lVar;
        this.f17141i = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return Intrinsics.d(this.f17134b, scrollableElement.f17134b) && this.f17135c == scrollableElement.f17135c && Intrinsics.d(this.f17136d, scrollableElement.f17136d) && this.f17137e == scrollableElement.f17137e && this.f17138f == scrollableElement.f17138f && Intrinsics.d(this.f17139g, scrollableElement.f17139g) && Intrinsics.d(this.f17140h, scrollableElement.f17140h) && Intrinsics.d(this.f17141i, scrollableElement.f17141i);
    }

    public final int hashCode() {
        int hashCode = (this.f17135c.hashCode() + (this.f17134b.hashCode() * 31)) * 31;
        e2 e2Var = this.f17136d;
        int e13 = b.e(this.f17138f, b.e(this.f17137e, (hashCode + (e2Var != null ? e2Var.hashCode() : 0)) * 31, 31), 31);
        c1 c1Var = this.f17139g;
        int hashCode2 = (e13 + (c1Var != null ? c1Var.hashCode() : 0)) * 31;
        l lVar = this.f17140h;
        int hashCode3 = (hashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        e eVar = this.f17141i;
        return hashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }

    @Override // s3.e1
    public final p l() {
        return new g2(this.f17136d, this.f17141i, this.f17139g, this.f17135c, this.f17134b, this.f17140h, this.f17137e, this.f17138f);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        boolean z13;
        boolean z14;
        g2 g2Var = (g2) pVar;
        boolean z15 = g2Var.f85580r;
        boolean z16 = this.f17137e;
        boolean z17 = false;
        if (z15 != z16) {
            g2Var.D.f85616b = z16;
            g2Var.A.f85472n = z16;
            z13 = true;
        } else {
            z13 = false;
        }
        c1 c1Var = this.f17139g;
        c1 c1Var2 = c1Var == null ? g2Var.B : c1Var;
        o2 o2Var = g2Var.C;
        h2 h2Var = o2Var.f85493a;
        h2 h2Var2 = this.f17134b;
        if (!Intrinsics.d(h2Var, h2Var2)) {
            o2Var.f85493a = h2Var2;
            z17 = true;
        }
        e2 e2Var = this.f17136d;
        o2Var.f85494b = e2Var;
        f1 f1Var = o2Var.f85496d;
        f1 f1Var2 = this.f17135c;
        if (f1Var != f1Var2) {
            o2Var.f85496d = f1Var2;
            z17 = true;
        }
        boolean z18 = o2Var.f85497e;
        boolean z19 = this.f17138f;
        if (z18 != z19) {
            o2Var.f85497e = z19;
            z14 = true;
        } else {
            z14 = z17;
        }
        o2Var.f85495c = c1Var2;
        o2Var.f85498f = g2Var.f85354z;
        o oVar = g2Var.E;
        oVar.f85478n = f1Var2;
        oVar.f85480p = z19;
        oVar.f85481q = this.f17141i;
        g2Var.f85352x = e2Var;
        g2Var.f85353y = c1Var;
        q1 q1Var = a.f17142a;
        o1 o1Var = o1.f85492i;
        f1 f1Var3 = o2Var.f85496d;
        f1 f1Var4 = f1.Vertical;
        g2Var.X0(o1Var, z16, this.f17140h, f1Var3 == f1Var4 ? f1Var4 : f1.Horizontal, z14);
        if (z13) {
            g2Var.G = null;
            g2Var.H = null;
            c.m0(g2Var);
        }
    }
}
