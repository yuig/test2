package androidx.compose.foundation.selection;

import com.bumptech.glide.c;
import k1.q1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o1.l;
import s3.e1;
import u1.d;
import u2.p;
import z3.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "Ls3/e1;", "Lu1/d;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class SelectableElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17337b;

    /* renamed from: c, reason: collision with root package name */
    public final l f17338c;

    /* renamed from: d, reason: collision with root package name */
    public final q1 f17339d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17340e;

    /* renamed from: f, reason: collision with root package name */
    public final g f17341f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f17342g;

    public SelectableElement(boolean z13, l lVar, q1 q1Var, boolean z14, g gVar, Function0 function0) {
        this.f17337b = z13;
        this.f17338c = lVar;
        this.f17339d = q1Var;
        this.f17340e = z14;
        this.f17341f = gVar;
        this.f17342g = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f17337b == selectableElement.f17337b && Intrinsics.d(this.f17338c, selectableElement.f17338c) && Intrinsics.d(this.f17339d, selectableElement.f17339d) && this.f17340e == selectableElement.f17340e && Intrinsics.d(this.f17341f, selectableElement.f17341f) && this.f17342g == selectableElement.f17342g;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f17337b) * 31;
        l lVar = this.f17338c;
        int hashCode2 = (hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        q1 q1Var = this.f17339d;
        int e13 = ep.b.e(this.f17340e, (hashCode2 + (q1Var != null ? q1Var.hashCode() : 0)) * 31, 31);
        g gVar = this.f17341f;
        return this.f17342g.hashCode() + ((e13 + (gVar != null ? Integer.hashCode(gVar.f140670a) : 0)) * 31);
    }

    @Override // s3.e1
    public final p l() {
        d dVar = new d(this.f17338c, this.f17339d, this.f17340e, null, this.f17341f, this.f17342g);
        dVar.H = this.f17337b;
        return dVar;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        d dVar = (d) pVar;
        boolean z13 = dVar.H;
        boolean z14 = this.f17337b;
        if (z13 != z14) {
            dVar.H = z14;
            c.m0(dVar);
        }
        dVar.T0(this.f17338c, this.f17339d, this.f17340e, null, this.f17341f, this.f17342g);
    }
}
