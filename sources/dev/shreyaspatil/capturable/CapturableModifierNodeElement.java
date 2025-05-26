package dev.shreyaspatil.capturable;

import cf2.f;
import df2.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldev/shreyaspatil/capturable/CapturableModifierNodeElement;", "Ls3/e1;", "Lcf2/f;", "capturable_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final /* data */ class CapturableModifierNodeElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final b f54695b;

    public CapturableModifierNodeElement(b controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f54695b = controller;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CapturableModifierNodeElement) && Intrinsics.d(this.f54695b, ((CapturableModifierNodeElement) obj).f54695b);
    }

    public final int hashCode() {
        return this.f54695b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        return new f(this.f54695b);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        f node = (f) pVar;
        Intrinsics.checkNotNullParameter(node, "node");
        node.getClass();
        b newController = this.f54695b;
        Intrinsics.checkNotNullParameter(newController, "newController");
        node.f27666p.i(newController);
    }

    public final String toString() {
        return "CapturableModifierNodeElement(controller=" + this.f54695b + ')';
    }
}
