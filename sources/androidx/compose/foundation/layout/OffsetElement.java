package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p1.r0;
import p1.s0;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Ls3/e1;", "Lp1/s0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class OffsetElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final float f17156b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17157c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f17158d;

    public OffsetElement(float f13, float f14, r0 r0Var) {
        this.f17156b = f13;
        this.f17157c = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return n4.e.a(this.f17156b, offsetElement.f17156b) && n4.e.a(this.f17157c, offsetElement.f17157c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + a.a.a(this.f17157c, Float.hashCode(this.f17156b) * 31, 31);
    }

    @Override // s3.e1
    public final p l() {
        s0 s0Var = new s0();
        s0Var.f98592n = this.f17156b;
        s0Var.f98593o = this.f17157c;
        s0Var.f98594p = true;
        return s0Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        s0 s0Var = (s0) pVar;
        s0Var.f98592n = this.f17156b;
        s0Var.f98593o = this.f17157c;
        s0Var.f98594p = true;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) n4.e.b(this.f17156b)) + ", y=" + ((Object) n4.e.b(this.f17157c)) + ", rtlAware=true)";
    }
}
