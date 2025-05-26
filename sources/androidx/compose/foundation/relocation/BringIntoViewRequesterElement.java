package androidx.compose.foundation.relocation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import t1.b;
import t1.d;
import t1.e;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Ls3/e1;", "Lt1/e;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class BringIntoViewRequesterElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final b f17336b;

    public BringIntoViewRequesterElement(b bVar) {
        this.f17336b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewRequesterElement) {
                if (Intrinsics.d(this.f17336b, ((BringIntoViewRequesterElement) obj).f17336b)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17336b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        e eVar = new e();
        eVar.f115744n = this.f17336b;
        return eVar;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        e eVar = (e) pVar;
        b bVar = eVar.f115744n;
        if (bVar instanceof d) {
            Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((d) bVar).f115743a.n(eVar);
        }
        b bVar2 = this.f17336b;
        if (bVar2 instanceof d) {
            ((d) bVar2).f115743a.b(eVar);
        }
        eVar.f115744n = bVar2;
    }
}
