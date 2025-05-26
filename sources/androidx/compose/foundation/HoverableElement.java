package androidx.compose.foundation;

import k1.f1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o1.l;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "Ls3/e1;", "Lk1/f1;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class HoverableElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final l f17094b;

    public HoverableElement(l lVar) {
        this.f17094b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && Intrinsics.d(((HoverableElement) obj).f17094b, this.f17094b);
    }

    public final int hashCode() {
        return this.f17094b.hashCode() * 31;
    }

    @Override // s3.e1
    public final p l() {
        f1 f1Var = new f1();
        f1Var.f77862n = this.f17094b;
        return f1Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        f1 f1Var = (f1) pVar;
        l lVar = f1Var.f77862n;
        l lVar2 = this.f17094b;
        if (Intrinsics.d(lVar, lVar2)) {
            return;
        }
        f1Var.O0();
        f1Var.f77862n = lVar2;
    }
}
