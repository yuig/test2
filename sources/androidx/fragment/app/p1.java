package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p1 implements androidx.lifecycle.k, ma.i, androidx.lifecycle.u1 {

    /* renamed from: a, reason: collision with root package name */
    public final Fragment f18399a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.t1 f18400b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f18401c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.p1 f18402d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.b0 f18403e = null;

    /* renamed from: f, reason: collision with root package name */
    public ma.h f18404f = null;

    public p1(Fragment fragment, androidx.lifecycle.t1 t1Var, androidx.activity.d dVar) {
        this.f18399a = fragment;
        this.f18400b = t1Var;
        this.f18401c = dVar;
    }

    public final void a(androidx.lifecycle.q qVar) {
        this.f18403e.e(qVar);
    }

    public final void b() {
        if (this.f18403e == null) {
            this.f18403e = new androidx.lifecycle.b0(this);
            Intrinsics.checkNotNullParameter(this, "owner");
            ma.h hVar = new ma.h(this);
            this.f18404f = hVar;
            hVar.a();
            this.f18401c.run();
        }
    }

    public final boolean c() {
        return this.f18403e != null;
    }

    @Override // androidx.lifecycle.k
    public final u6.c getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f18399a;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        u6.e eVar = new u6.e(0);
        if (application != null) {
            eVar.b(androidx.lifecycle.o1.f18669d, application);
        }
        eVar.b(androidx.lifecycle.g1.f18625a, fragment);
        eVar.b(androidx.lifecycle.g1.f18626b, this);
        if (fragment.getArguments() != null) {
            eVar.b(androidx.lifecycle.g1.f18627c, fragment.getArguments());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.k
    public final androidx.lifecycle.p1 getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f18399a;
        androidx.lifecycle.p1 defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f18402d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f18402d == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f18402d = new androidx.lifecycle.j1(application, fragment, fragment.getArguments());
        }
        return this.f18402d;
    }

    @Override // androidx.lifecycle.z
    public final androidx.lifecycle.s getLifecycle() {
        b();
        return this.f18403e;
    }

    @Override // ma.i
    public final ma.g getSavedStateRegistry() {
        b();
        return this.f18404f.f86760b;
    }

    @Override // androidx.lifecycle.u1
    public final androidx.lifecycle.t1 getViewModelStore() {
        b();
        return this.f18400b;
    }
}
