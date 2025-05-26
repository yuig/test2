package androidx.compose.foundation;

import k1.t2;
import k1.w2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Ls3/e1;", "Lk1/w2;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final t2 f17112b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17113c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17114d;

    public ScrollingLayoutElement(t2 t2Var, boolean z13, boolean z14) {
        this.f17112b = t2Var;
        this.f17113c = z13;
        this.f17114d = z14;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return Intrinsics.d(this.f17112b, scrollingLayoutElement.f17112b) && this.f17113c == scrollingLayoutElement.f17113c && this.f17114d == scrollingLayoutElement.f17114d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17114d) + ep.b.e(this.f17113c, this.f17112b.hashCode() * 31, 31);
    }

    @Override // s3.e1
    public final p l() {
        w2 w2Var = new w2();
        w2Var.f78072n = this.f17112b;
        w2Var.f78073o = this.f17113c;
        w2Var.f78074p = this.f17114d;
        return w2Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        w2 w2Var = (w2) pVar;
        w2Var.f78072n = this.f17112b;
        w2Var.f78073o = this.f17113c;
        w2Var.f78074p = this.f17114d;
    }
}
