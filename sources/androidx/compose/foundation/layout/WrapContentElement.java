package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p1.d0;
import p1.p1;
import p1.q1;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Ls3/e1;", "Lp1/q1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class WrapContentElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final d0 f17175b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17176c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f17177d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f17178e;

    public WrapContentElement(d0 d0Var, boolean z13, p1 p1Var, Object obj) {
        this.f17175b = d0Var;
        this.f17176c = z13;
        this.f17177d = p1Var;
        this.f17178e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f17175b == wrapContentElement.f17175b && this.f17176c == wrapContentElement.f17176c && Intrinsics.d(this.f17178e, wrapContentElement.f17178e);
    }

    public final int hashCode() {
        return this.f17178e.hashCode() + ep.b.e(this.f17176c, this.f17175b.hashCode() * 31, 31);
    }

    @Override // s3.e1
    public final p l() {
        return new q1(this.f17175b, this.f17176c, this.f17177d);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        q1 q1Var = (q1) pVar;
        q1Var.N0(this.f17175b);
        q1Var.O0(this.f17176c);
        q1Var.M0(this.f17177d);
    }
}
