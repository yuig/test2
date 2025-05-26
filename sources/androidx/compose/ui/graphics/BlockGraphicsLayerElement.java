package androidx.compose.ui.graphics;

import b3.r;
import com.bumptech.glide.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import s3.q1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Ls3/e1;", "Lb3/r;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class BlockGraphicsLayerElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f17414b;

    public BlockGraphicsLayerElement(Function1 function1) {
        this.f17414b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && Intrinsics.d(this.f17414b, ((BlockGraphicsLayerElement) obj).f17414b);
    }

    public final int hashCode() {
        return this.f17414b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        return new r(this.f17414b);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        r rVar = (r) pVar;
        rVar.f21348n = this.f17414b;
        q1 q1Var = c.S0(rVar, 2).f110900n;
        if (q1Var != null) {
            q1Var.t1(rVar.f21348n, true);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f17414b + ')';
    }
}
