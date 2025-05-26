package wt1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.lifecycle.l1;
import androidx.lifecycle.t1;
import ao2.j0;
import ao2.k2;
import java.util.HashSet;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements yk1.m {

    /* renamed from: a, reason: collision with root package name */
    public d f131097a;

    /* renamed from: b, reason: collision with root package name */
    public j0 f131098b;

    /* renamed from: c, reason: collision with root package name */
    public k2 f131099c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f131100d;

    /* renamed from: e, reason: collision with root package name */
    public u50.o f131101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f131102f;

    public e(f fVar) {
        this.f131102f = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ho2.c scope, t1 viewModelStore, View view) {
        Intrinsics.checkNotNullParameter(scope, "newScope");
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        Intrinsics.checkNotNullParameter(view, "view");
        k2 k2Var = this.f131099c;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        this.f131098b = scope;
        Intrinsics.checkNotNullParameter(scope, "scope");
        f fVar = this.f131102f;
        d b13 = fVar.b(scope);
        if (b13 instanceof l82.b) {
            viewModelStore.b(String.valueOf(b13.hashCode()), (l1) b13);
        }
        this.f131097a = b13;
        yk1.n view2 = view instanceof yk1.n ? (yk1.n) view : null;
        if (view2 != null) {
            u50.r eventIntake = b13.c();
            Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
            Intrinsics.checkNotNullParameter(view2, "view");
            fVar.i(eventIntake, view2);
        }
        if (view2 == null) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.k("SBABridgePresenter with a view that is not an ItemView", kotlin.collections.e0.b(new Pair("view", view.toString())));
        }
    }

    @Override // yk1.m
    public final /* bridge */ /* synthetic */ void activate() {
    }

    @Override // yk1.m
    public final /* bridge */ /* synthetic */ void activityResult(int i13, int i14, Intent intent) {
    }

    @Override // yk1.m
    public final void bind(yk1.n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f131100d = true;
        j0 j0Var = this.f131098b;
        d dVar = this.f131097a;
        if (dVar == null) {
            Intrinsics.r("viewModel");
            throw null;
        }
        if (j0Var != null) {
            k2 k2Var = this.f131099c;
            if (k2Var != null) {
                k2Var.cancel((CancellationException) null);
            }
            this.f131099c = kotlin.jvm.internal.j.z(j0Var, null, null, new h(view, dVar, this, null), 3);
        }
    }

    @Override // yk1.m
    public final /* bridge */ /* synthetic */ void create() {
    }

    @Override // yk1.m
    public final /* bridge */ /* synthetic */ void deactivate() {
    }

    @Override // yk1.m
    public final /* bridge */ /* synthetic */ void destroy() {
    }

    @Override // yk1.m
    public final boolean isBound() {
        return this.f131100d;
    }

    @Override // yk1.m
    public final /* bridge */ /* synthetic */ void restore() {
    }

    @Override // yk1.m
    public final void restoreInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // yk1.m
    public final void saveInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // yk1.m
    public final void unbind() {
        this.f131100d = false;
        k2 k2Var = this.f131099c;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
    }
}
