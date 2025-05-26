package androidx.compose.foundation.selection;

import com.bumptech.glide.c;
import k1.q1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o1.l;
import s3.e1;
import u1.e;
import u2.p;
import z3.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Ls3/e1;", "Lu1/e;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class ToggleableElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17343b;

    /* renamed from: c, reason: collision with root package name */
    public final l f17344c;

    /* renamed from: d, reason: collision with root package name */
    public final q1 f17345d = null;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17346e;

    /* renamed from: f, reason: collision with root package name */
    public final g f17347f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f17348g;

    public ToggleableElement(boolean z13, l lVar, boolean z14, g gVar, Function1 function1) {
        this.f17343b = z13;
        this.f17344c = lVar;
        this.f17346e = z14;
        this.f17347f = gVar;
        this.f17348g = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f17343b == toggleableElement.f17343b && Intrinsics.d(this.f17344c, toggleableElement.f17344c) && Intrinsics.d(this.f17345d, toggleableElement.f17345d) && this.f17346e == toggleableElement.f17346e && Intrinsics.d(this.f17347f, toggleableElement.f17347f) && this.f17348g == toggleableElement.f17348g;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f17343b) * 31;
        l lVar = this.f17344c;
        int hashCode2 = (hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        q1 q1Var = this.f17345d;
        int e13 = ep.b.e(this.f17346e, (hashCode2 + (q1Var != null ? q1Var.hashCode() : 0)) * 31, 31);
        g gVar = this.f17347f;
        return this.f17348g.hashCode() + ((e13 + (gVar != null ? Integer.hashCode(gVar.f140670a) : 0)) * 31);
    }

    @Override // s3.e1
    public final p l() {
        return new e(this.f17343b, this.f17344c, this.f17345d, this.f17346e, this.f17347f, this.f17348g);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        e eVar = (e) pVar;
        boolean z13 = eVar.H;
        boolean z14 = this.f17343b;
        if (z13 != z14) {
            eVar.H = z14;
            c.m0(eVar);
        }
        eVar.I = this.f17348g;
        eVar.T0(this.f17344c, this.f17345d, this.f17346e, null, this.f17347f, eVar.f119988J);
    }
}
