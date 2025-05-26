package androidx.compose.foundation;

import k1.e0;
import k1.q1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o1.l;
import s3.e1;
import u2.p;
import z3.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Ls3/e1;", "Lk1/e0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class ClickableElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final l f17078b;

    /* renamed from: c, reason: collision with root package name */
    public final q1 f17079c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17080d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17081e;

    /* renamed from: f, reason: collision with root package name */
    public final g f17082f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f17083g;

    public ClickableElement(l lVar, q1 q1Var, boolean z13, String str, g gVar, Function0 function0) {
        this.f17078b = lVar;
        this.f17079c = q1Var;
        this.f17080d = z13;
        this.f17081e = str;
        this.f17082f = gVar;
        this.f17083g = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return Intrinsics.d(this.f17078b, clickableElement.f17078b) && Intrinsics.d(this.f17079c, clickableElement.f17079c) && this.f17080d == clickableElement.f17080d && Intrinsics.d(this.f17081e, clickableElement.f17081e) && Intrinsics.d(this.f17082f, clickableElement.f17082f) && this.f17083g == clickableElement.f17083g;
    }

    public final int hashCode() {
        l lVar = this.f17078b;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        q1 q1Var = this.f17079c;
        int e13 = ep.b.e(this.f17080d, (hashCode + (q1Var != null ? q1Var.hashCode() : 0)) * 31, 31);
        String str = this.f17081e;
        int hashCode2 = (e13 + (str != null ? str.hashCode() : 0)) * 31;
        g gVar = this.f17082f;
        return this.f17083g.hashCode() + ((hashCode2 + (gVar != null ? Integer.hashCode(gVar.f140670a) : 0)) * 31);
    }

    @Override // s3.e1
    public final p l() {
        return new e0(this.f17078b, this.f17079c, this.f17080d, this.f17081e, this.f17082f, this.f17083g);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        ((e0) pVar).T0(this.f17078b, this.f17079c, this.f17080d, this.f17081e, this.f17082f, this.f17083g);
    }
}
