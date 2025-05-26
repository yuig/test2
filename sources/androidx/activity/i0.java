package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f15902a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.collections.v f15903b = new kotlin.collections.v();

    /* renamed from: c, reason: collision with root package name */
    public x f15904c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f15905d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f15906e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15907f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15908g;

    public i0(Runnable runnable) {
        OnBackInvokedCallback a13;
        this.f15902a = runnable;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            int i14 = 0;
            if (i13 >= 34) {
                int i15 = 1;
                a13 = e0.f15887a.a(new y(this, i14), new y(this, i15), new z(this, i14), new z(this, i15));
            } else {
                a13 = c0.f15878a.a(new a0(this, i14));
            }
            this.f15905d = a13;
        }
    }

    public final void a(androidx.lifecycle.z owner, x onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.s lifecycle = owner.getLifecycle();
        if (((androidx.lifecycle.b0) lifecycle).f18588d == androidx.lifecycle.r.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new f0(this, lifecycle, onBackPressedCallback));
        d();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new h0(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        x xVar;
        x xVar2 = this.f15904c;
        if (xVar2 == null) {
            kotlin.collections.v vVar = this.f15903b;
            ListIterator listIterator = vVar.listIterator(vVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    xVar = 0;
                    break;
                } else {
                    xVar = listIterator.previous();
                    if (((x) xVar).isEnabled()) {
                        break;
                    }
                }
            }
            xVar2 = xVar;
        }
        this.f15904c = null;
        if (xVar2 != null) {
            xVar2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f15902a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z13) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f15906e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f15905d) == null) {
            return;
        }
        c0 c0Var = c0.f15878a;
        if (z13 && !this.f15907f) {
            c0Var.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f15907f = true;
        } else {
            if (z13 || !this.f15907f) {
                return;
            }
            c0Var.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f15907f = false;
        }
    }

    public final void d() {
        boolean z13 = this.f15908g;
        kotlin.collections.v vVar = this.f15903b;
        boolean z14 = false;
        if (!(vVar instanceof Collection) || !vVar.isEmpty()) {
            Iterator it = vVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((x) it.next()).isEnabled()) {
                    z14 = true;
                    break;
                }
            }
        }
        this.f15908g = z14;
        if (z14 == z13 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z14);
    }
}
