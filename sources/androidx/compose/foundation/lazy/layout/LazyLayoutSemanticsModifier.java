package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "Ls3/e1;", "Landroidx/compose/foundation/lazy/layout/r0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class LazyLayoutSemanticsModifier extends s3.e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f17193b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f17194c;

    /* renamed from: d, reason: collision with root package name */
    public final m1.f1 f17195d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17196e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17197f;

    public LazyLayoutSemanticsModifier(rl2.r rVar, n0 n0Var, m1.f1 f1Var, boolean z13, boolean z14) {
        this.f17193b = rVar;
        this.f17194c = n0Var;
        this.f17195d = f1Var;
        this.f17196e = z13;
        this.f17197f = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f17193b == lazyLayoutSemanticsModifier.f17193b && Intrinsics.d(this.f17194c, lazyLayoutSemanticsModifier.f17194c) && this.f17195d == lazyLayoutSemanticsModifier.f17195d && this.f17196e == lazyLayoutSemanticsModifier.f17196e && this.f17197f == lazyLayoutSemanticsModifier.f17197f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17197f) + ep.b.e(this.f17196e, (this.f17195d.hashCode() + ((this.f17194c.hashCode() + (this.f17193b.hashCode() * 31)) * 31)) * 31, 31);
    }

    @Override // s3.e1
    public final u2.p l() {
        return new r0(this.f17193b, this.f17194c, this.f17195d, this.f17196e, this.f17197f);
    }

    @Override // s3.e1
    public final void m(u2.p pVar) {
        r0 r0Var = (r0) pVar;
        r0Var.f17280n = this.f17193b;
        r0Var.f17281o = this.f17194c;
        m1.f1 f1Var = r0Var.f17282p;
        m1.f1 f1Var2 = this.f17195d;
        if (f1Var != f1Var2) {
            r0Var.f17282p = f1Var2;
            com.bumptech.glide.c.m0(r0Var);
        }
        boolean z13 = r0Var.f17283q;
        boolean z14 = this.f17196e;
        boolean z15 = this.f17197f;
        if (z13 == z14 && r0Var.f17284r == z15) {
            return;
        }
        r0Var.f17283q = z14;
        r0Var.f17284r = z15;
        r0Var.M0();
        com.bumptech.glide.c.m0(r0Var);
    }
}
