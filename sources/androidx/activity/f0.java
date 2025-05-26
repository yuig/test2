package androidx.activity;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f0 implements androidx.lifecycle.x, c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.s f15890a;

    /* renamed from: b, reason: collision with root package name */
    public final x f15891b;

    /* renamed from: c, reason: collision with root package name */
    public g0 f15892c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f15893d;

    public f0(i0 i0Var, androidx.lifecycle.s lifecycle, x onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f15893d = i0Var;
        this.f15890a = lifecycle;
        this.f15891b = onBackPressedCallback;
        lifecycle.a(this);
    }

    @Override // androidx.lifecycle.x
    public final void c(androidx.lifecycle.z source, androidx.lifecycle.q event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != androidx.lifecycle.q.ON_START) {
            if (event != androidx.lifecycle.q.ON_STOP) {
                if (event == androidx.lifecycle.q.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                g0 g0Var = this.f15892c;
                if (g0Var != null) {
                    g0Var.cancel();
                    return;
                }
                return;
            }
        }
        i0 i0Var = this.f15893d;
        i0Var.getClass();
        x onBackPressedCallback = this.f15891b;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        i0Var.f15903b.addLast(onBackPressedCallback);
        g0 g0Var2 = new g0(i0Var, onBackPressedCallback);
        onBackPressedCallback.addCancellable(g0Var2);
        i0Var.d();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new h0(i0Var, 1));
        this.f15892c = g0Var2;
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.f15890a.b(this);
        this.f15891b.removeCancellable(this);
        g0 g0Var = this.f15892c;
        if (g0Var != null) {
            g0Var.cancel();
        }
        this.f15892c = null;
    }
}
