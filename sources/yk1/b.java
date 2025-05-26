package yk1;

import android.content.Intent;
import android.os.Bundle;
import ao2.h0;
import ao2.j0;
import ao2.m0;
import com.pinterest.api.model.iw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import org.jetbrains.annotations.NotNull;
import rq.l2;

/* loaded from: classes2.dex */
public abstract class b implements m, e {
    private final /* synthetic */ e $$delegate_0;

    @NotNull
    private xj2.b disposables;
    private n viewIfBound;

    public b() {
        this(0);
    }

    @Override // yk1.m
    public void activate() {
        onActivate();
    }

    @Override // yk1.m
    public void activityResult(int i13, int i14, Intent intent) {
        onActivityResult(i13, i14, intent);
    }

    public final void addDisposable(@NotNull xj2.c disposable) {
        String str;
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        n nVar = this.viewIfBound;
        tb0.p productFlow = tb0.p.PLATFORM;
        f0 classLocation = new f0();
        Object[] args = new Object[0];
        f0 f0Var = vb0.j.f125466a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter("addDisposable() must be called between onBind() and onUnbind(), called from: %s", "errorMessage");
        Intrinsics.checkNotNullParameter(productFlow, "productFlow");
        Intrinsics.checkNotNullParameter(classLocation, "classLocation");
        String str2 = "BasePresenter";
        Intrinsics.checkNotNullParameter("BasePresenter", "nonRootClass");
        Intrinsics.checkNotNullParameter(args, "args");
        if (nVar == null) {
            Optional findFirst = Arrays.stream(Thread.currentThread().getStackTrace()).filter(new iw(2, new l2(str2, 27))).findFirst();
            if (findFirst.isPresent()) {
                str = ((StackTraceElement) findFirst.get()).getClassName();
                Intrinsics.f(str);
            } else {
                str = "";
            }
            ArrayList l13 = kotlin.collections.f0.l(Arrays.copyOf(args, 0));
            l13.add(0, str);
            Object[] array = l13.toArray(new Object[0]);
            f0Var.M(null, "addDisposable() must be called between onBind() and onUnbind(), called from: %s", productFlow, Arrays.copyOf(array, array.length));
        }
        this.disposables.a(disposable);
    }

    @Override // yk1.m
    public void bind(@NotNull n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        r3(view);
    }

    public void clearDisposables() {
        vb0.j.f125466a.M(this.viewIfBound, "clearDisposable() must be called between onBind() and onUnbind()", tb0.p.PLATFORM, new Object[0]);
        this.disposables.d();
    }

    @Override // yk1.m
    public void create() {
        onCreate();
    }

    @Override // yk1.m
    public void deactivate() {
        onDeactivate();
    }

    @Override // yk1.m
    public void destroy() {
        onDestroy();
    }

    @Override // yk1.e
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // yk1.e
    @NotNull
    public h0 getExceptionHandler() {
        return this.$$delegate_0.getExceptionHandler();
    }

    @Override // yk1.e
    @NotNull
    public j0 getScope() {
        return this.$$delegate_0.getScope();
    }

    @NotNull
    public final n getView() {
        n nVar = this.viewIfBound;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("view is currently null, getView() should only be called between bind() and unbind()".toString());
    }

    public final n getViewIfBound() {
        return this.viewIfBound;
    }

    @Override // yk1.m
    public boolean isBound() {
        return this.viewIfBound != null;
    }

    public void onActivate() {
    }

    public void onActivityResult(int i13, int i14, Intent intent) {
    }

    /* renamed from: onBind */
    public void r3(n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.viewIfBound = view;
        this.disposables = new xj2.b();
        try {
            m0.t(getScope().getCoroutineContext());
        } catch (CancellationException e13) {
            vb0.j.f125466a.I(e13, "Presenter scope is currently inactive. Please ensure that any changes made did not break the typical flow.", tb0.p.PLATFORM);
        }
    }

    public void onCreate() {
    }

    public void onDeactivate() {
    }

    public void onDestroy() {
    }

    public void onRestore() {
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onSaveInstance(Bundle bundle) {
    }

    public void onUnbind() {
        this.disposables.dispose();
        this.disposables = new xj2.b();
        this.viewIfBound = null;
        m0.l(getScope().getCoroutineContext());
    }

    @Override // yk1.m
    public void restore() {
        onRestore();
    }

    @Override // yk1.m
    public void restoreInstanceState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        onRestoreInstanceState(bundle);
    }

    @Override // yk1.m
    public void saveInstanceState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        onSaveInstance(bundle);
    }

    @Override // yk1.m
    public void unbind() {
        onUnbind();
    }

    public b(int i13) {
        f0 coroutineProvider = new f0();
        Intrinsics.checkNotNullParameter(coroutineProvider, "coroutineProvider");
        this.$$delegate_0 = coroutineProvider;
        this.disposables = new xj2.b();
    }
}
