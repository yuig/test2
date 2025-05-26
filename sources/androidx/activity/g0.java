package androidx.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g0 implements c {

    /* renamed from: a, reason: collision with root package name */
    public final x f15896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f15897b;

    public g0(i0 i0Var, x onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f15897b = i0Var;
        this.f15896a = onBackPressedCallback;
    }

    @Override // androidx.activity.c
    public final void cancel() {
        i0 i0Var = this.f15897b;
        kotlin.collections.v vVar = i0Var.f15903b;
        x xVar = this.f15896a;
        vVar.remove(xVar);
        if (Intrinsics.d(i0Var.f15904c, xVar)) {
            xVar.handleOnBackCancelled();
            i0Var.f15904c = null;
        }
        xVar.removeCancellable(this);
        Function0<Unit> enabledChangedCallback$activity_release = xVar.getEnabledChangedCallback$activity_release();
        if (enabledChangedCallback$activity_release != null) {
            enabledChangedCallback$activity_release.invoke();
        }
        xVar.setEnabledChangedCallback$activity_release(null);
    }
}
