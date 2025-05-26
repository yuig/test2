package androidx.compose.foundation;

import b3.s;
import b3.x0;
import k1.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Ls3/e1;", "Lk1/x;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final /* data */ class BorderModifierNodeElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final float f17075b;

    /* renamed from: c, reason: collision with root package name */
    public final s f17076c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f17077d;

    public BorderModifierNodeElement(float f13, s sVar, x0 x0Var) {
        this.f17075b = f13;
        this.f17076c = sVar;
        this.f17077d = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return n4.e.a(this.f17075b, borderModifierNodeElement.f17075b) && Intrinsics.d(this.f17076c, borderModifierNodeElement.f17076c) && Intrinsics.d(this.f17077d, borderModifierNodeElement.f17077d);
    }

    public final int hashCode() {
        return this.f17077d.hashCode() + ((this.f17076c.hashCode() + (Float.hashCode(this.f17075b) * 31)) * 31);
    }

    @Override // s3.e1
    public final p l() {
        return new x(this.f17075b, this.f17076c, this.f17077d);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        x xVar = (x) pVar;
        float f13 = xVar.f78076q;
        float f14 = this.f17075b;
        boolean a13 = n4.e.a(f13, f14);
        y2.b bVar = xVar.f78079t;
        if (!a13) {
            xVar.f78076q = f14;
            ((y2.c) bVar).M0();
        }
        s sVar = xVar.f78077r;
        s sVar2 = this.f17076c;
        if (!Intrinsics.d(sVar, sVar2)) {
            xVar.f78077r = sVar2;
            ((y2.c) bVar).M0();
        }
        x0 x0Var = xVar.f78078s;
        x0 x0Var2 = this.f17077d;
        if (Intrinsics.d(x0Var, x0Var2)) {
            return;
        }
        xVar.f78078s = x0Var2;
        ((y2.c) bVar).M0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) n4.e.b(this.f17075b)) + ", brush=" + this.f17076c + ", shape=" + this.f17077d + ')';
    }
}
