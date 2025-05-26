package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import t3.t3;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/TestTagElement;", "Ls3/e1;", "Lt3/t3;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class TestTagElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f17463b;

    public TestTagElement(String str) {
        this.f17463b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return Intrinsics.d(this.f17463b, ((TestTagElement) obj).f17463b);
    }

    public final int hashCode() {
        return this.f17463b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        t3 t3Var = new t3();
        t3Var.f116200n = this.f17463b;
        return t3Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        ((t3) pVar).f116200n = this.f17463b;
    }
}
