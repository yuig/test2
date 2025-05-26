package b4;

import b3.w0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a */
    public final m4.o f21575a;

    /* renamed from: b */
    public final long f21576b;

    /* renamed from: c */
    public final g4.l f21577c;

    /* renamed from: d */
    public final g4.j f21578d;

    /* renamed from: e */
    public final g4.k f21579e;

    /* renamed from: f */
    public final g4.e f21580f;

    /* renamed from: g */
    public final String f21581g;

    /* renamed from: h */
    public final long f21582h;

    /* renamed from: i */
    public final m4.a f21583i;

    /* renamed from: j */
    public final m4.p f21584j;

    /* renamed from: k */
    public final i4.c f21585k;

    /* renamed from: l */
    public final long f21586l;

    /* renamed from: m */
    public final m4.k f21587m;

    /* renamed from: n */
    public final w0 f21588n;

    /* renamed from: o */
    public final y f21589o;

    /* renamed from: p */
    public final d3.i f21590p;

    public g0(long j13, long j14, g4.l lVar, g4.j jVar, g4.k kVar, g4.e eVar, String str, long j15, m4.a aVar, m4.p pVar, i4.c cVar, long j16, m4.k kVar2, w0 w0Var, int i13) {
        this((i13 & 1) != 0 ? b3.w.f21390n : j13, (i13 & 2) != 0 ? n4.m.f89189c : j14, (i13 & 4) != 0 ? null : lVar, (i13 & 8) != 0 ? null : jVar, (i13 & 16) != 0 ? null : kVar, (i13 & 32) != 0 ? null : eVar, (i13 & 64) != 0 ? null : str, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? n4.m.f89189c : j15, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : aVar, (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : pVar, (i13 & 1024) != 0 ? null : cVar, (i13 & 2048) != 0 ? b3.w.f21390n : j16, (i13 & 4096) != 0 ? null : kVar2, (i13 & 8192) != 0 ? null : w0Var, (y) null, (d3.i) null);
    }

    public final boolean a(g0 g0Var) {
        if (this == g0Var) {
            return true;
        }
        return n4.m.a(this.f21576b, g0Var.f21576b) && Intrinsics.d(this.f21577c, g0Var.f21577c) && Intrinsics.d(this.f21578d, g0Var.f21578d) && Intrinsics.d(this.f21579e, g0Var.f21579e) && Intrinsics.d(this.f21580f, g0Var.f21580f) && Intrinsics.d(this.f21581g, g0Var.f21581g) && n4.m.a(this.f21582h, g0Var.f21582h) && Intrinsics.d(this.f21583i, g0Var.f21583i) && Intrinsics.d(this.f21584j, g0Var.f21584j) && Intrinsics.d(this.f21585k, g0Var.f21585k) && b3.w.c(this.f21586l, g0Var.f21586l) && Intrinsics.d(this.f21589o, g0Var.f21589o);
    }

    public final boolean b(g0 g0Var) {
        return Intrinsics.d(this.f21575a, g0Var.f21575a) && Intrinsics.d(this.f21587m, g0Var.f21587m) && Intrinsics.d(this.f21588n, g0Var.f21588n) && Intrinsics.d(this.f21590p, g0Var.f21590p);
    }

    public final g0 c(g0 g0Var) {
        if (g0Var == null) {
            return this;
        }
        m4.o oVar = g0Var.f21575a;
        return h0.a(this, oVar.b(), oVar.c(), oVar.a(), g0Var.f21576b, g0Var.f21577c, g0Var.f21578d, g0Var.f21579e, g0Var.f21580f, g0Var.f21581g, g0Var.f21582h, g0Var.f21583i, g0Var.f21584j, g0Var.f21585k, g0Var.f21586l, g0Var.f21587m, g0Var.f21588n, g0Var.f21589o, g0Var.f21590p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return a(g0Var) && b(g0Var);
    }

    public final int hashCode() {
        m4.o oVar = this.f21575a;
        long b13 = oVar.b();
        int i13 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        int hashCode = Long.hashCode(b13) * 31;
        b3.s c13 = oVar.c();
        int hashCode2 = (Float.hashCode(oVar.a()) + ((hashCode + (c13 != null ? c13.hashCode() : 0)) * 31)) * 31;
        n4.n[] nVarArr = n4.m.f89188b;
        int c14 = a.a.c(this.f21576b, hashCode2, 31);
        g4.l lVar = this.f21577c;
        int i14 = (c14 + (lVar != null ? lVar.f63474a : 0)) * 31;
        g4.j jVar = this.f21578d;
        int hashCode3 = (i14 + (jVar != null ? Integer.hashCode(jVar.f63465a) : 0)) * 31;
        g4.k kVar = this.f21579e;
        int hashCode4 = (hashCode3 + (kVar != null ? Integer.hashCode(kVar.f63466a) : 0)) * 31;
        g4.e eVar = this.f21580f;
        int hashCode5 = (hashCode4 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        String str = this.f21581g;
        int c15 = a.a.c(this.f21582h, (hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        m4.a aVar = this.f21583i;
        int hashCode6 = (c15 + (aVar != null ? Float.hashCode(aVar.f85783a) : 0)) * 31;
        m4.p pVar = this.f21584j;
        int hashCode7 = (hashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        i4.c cVar = this.f21585k;
        int c16 = a.a.c(this.f21586l, (hashCode7 + (cVar != null ? cVar.f71504a.hashCode() : 0)) * 31, 31);
        m4.k kVar2 = this.f21587m;
        int i15 = (c16 + (kVar2 != null ? kVar2.f85801a : 0)) * 31;
        w0 w0Var = this.f21588n;
        int hashCode8 = (i15 + (w0Var != null ? w0Var.hashCode() : 0)) * 31;
        y yVar = this.f21589o;
        int hashCode9 = (hashCode8 + (yVar != null ? yVar.hashCode() : 0)) * 31;
        d3.i iVar = this.f21590p;
        return hashCode9 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SpanStyle(color=");
        m4.o oVar = this.f21575a;
        sb3.append((Object) b3.w.i(oVar.b()));
        sb3.append(", brush=");
        sb3.append(oVar.c());
        sb3.append(", alpha=");
        sb3.append(oVar.a());
        sb3.append(", fontSize=");
        sb3.append((Object) n4.m.d(this.f21576b));
        sb3.append(", fontWeight=");
        sb3.append(this.f21577c);
        sb3.append(", fontStyle=");
        sb3.append(this.f21578d);
        sb3.append(", fontSynthesis=");
        sb3.append(this.f21579e);
        sb3.append(", fontFamily=");
        sb3.append(this.f21580f);
        sb3.append(", fontFeatureSettings=");
        sb3.append(this.f21581g);
        sb3.append(", letterSpacing=");
        sb3.append((Object) n4.m.d(this.f21582h));
        sb3.append(", baselineShift=");
        sb3.append(this.f21583i);
        sb3.append(", textGeometricTransform=");
        sb3.append(this.f21584j);
        sb3.append(", localeList=");
        sb3.append(this.f21585k);
        sb3.append(", background=");
        jq.b.t(this.f21586l, sb3, ", textDecoration=");
        sb3.append(this.f21587m);
        sb3.append(", shadow=");
        sb3.append(this.f21588n);
        sb3.append(", platformStyle=");
        sb3.append(this.f21589o);
        sb3.append(", drawStyle=");
        sb3.append(this.f21590p);
        sb3.append(')');
        return sb3.toString();
    }

    public g0(long j13, long j14, g4.l lVar, g4.j jVar, g4.k kVar, g4.e eVar, String str, long j15, m4.a aVar, m4.p pVar, i4.c cVar, long j16, m4.k kVar2, w0 w0Var, y yVar, d3.i iVar) {
        this(j13 != 16 ? new m4.c(j13) : m4.m.f85803a, j14, lVar, jVar, kVar, eVar, str, j15, aVar, pVar, cVar, j16, kVar2, w0Var, yVar, iVar);
    }

    public g0(m4.o oVar, long j13, g4.l lVar, g4.j jVar, g4.k kVar, g4.e eVar, String str, long j14, m4.a aVar, m4.p pVar, i4.c cVar, long j15, m4.k kVar2, w0 w0Var, y yVar, d3.i iVar) {
        this.f21575a = oVar;
        this.f21576b = j13;
        this.f21577c = lVar;
        this.f21578d = jVar;
        this.f21579e = kVar;
        this.f21580f = eVar;
        this.f21581g = str;
        this.f21582h = j14;
        this.f21583i = aVar;
        this.f21584j = pVar;
        this.f21585k = cVar;
        this.f21586l = j15;
        this.f21587m = kVar2;
        this.f21588n = w0Var;
        this.f21589o = yVar;
        this.f21590p = iVar;
    }
}
