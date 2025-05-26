package androidx.compose.foundation.layout;

import kotlin.Metadata;
import p1.l1;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Ls3/e1;", "Lp1/l1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class UnspecifiedConstraintsElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final float f17173b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17174c;

    public UnspecifiedConstraintsElement(float f13, float f14) {
        this.f17173b = f13;
        this.f17174c = f14;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return n4.e.a(this.f17173b, unspecifiedConstraintsElement.f17173b) && n4.e.a(this.f17174c, unspecifiedConstraintsElement.f17174c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f17174c) + (Float.hashCode(this.f17173b) * 31);
    }

    @Override // s3.e1
    public final p l() {
        l1 l1Var = new l1();
        l1Var.f98551n = this.f17173b;
        l1Var.f98552o = this.f17174c;
        return l1Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        l1 l1Var = (l1) pVar;
        l1Var.f98551n = this.f17173b;
        l1Var.f98552o = this.f17174c;
    }
}
