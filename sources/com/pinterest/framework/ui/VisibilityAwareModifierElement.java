package com.pinterest.framework.ui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nl1.h;
import s3.e1;
import u2.p;
import yy0.y;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/pinterest/framework/ui/VisibilityAwareModifierElement;", "Ls3/e1;", "Lnl1/h;", "nux_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final /* data */ class VisibilityAwareModifierElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f49240b;

    public VisibilityAwareModifierElement(y visibleEventCallback) {
        Intrinsics.checkNotNullParameter(visibleEventCallback, "visibleEventCallback");
        this.f49240b = visibleEventCallback;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VisibilityAwareModifierElement) && Intrinsics.d(this.f49240b, ((VisibilityAwareModifierElement) obj).f49240b);
    }

    public final int hashCode() {
        return this.f49240b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        Function1 visibleEventCallback = this.f49240b;
        Intrinsics.checkNotNullParameter(visibleEventCallback, "visibleEventCallback");
        h hVar = new h();
        hVar.f91302n = visibleEventCallback;
        return hVar;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        h node = (h) pVar;
        Intrinsics.checkNotNullParameter(node, "node");
        node.getClass();
        Function1 function1 = this.f49240b;
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        node.f91302n = function1;
    }

    public final String toString() {
        return "VisibilityAwareModifierElement(visibleEventCallback=" + this.f49240b + ")";
    }
}
