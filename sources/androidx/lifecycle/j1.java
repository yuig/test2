package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j1 extends r1 implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f18650a;

    /* renamed from: b, reason: collision with root package name */
    public final o1 f18651b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f18652c;

    /* renamed from: d, reason: collision with root package name */
    public final s f18653d;

    /* renamed from: e, reason: collision with root package name */
    public final ma.g f18654e;

    public j1(Application application, ma.i owner, Bundle bundle) {
        o1 o1Var;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f18654e = owner.getSavedStateRegistry();
        this.f18653d = owner.getLifecycle();
        this.f18652c = bundle;
        this.f18650a = application;
        if (application != null) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (o1.f18668c == null) {
                Intrinsics.checkNotNullParameter(application, "application");
                o1.f18668c = new o1(application);
            }
            o1Var = o1.f18668c;
            Intrinsics.f(o1Var);
        } else {
            o1Var = new o1(null);
        }
        this.f18651b = o1Var;
    }

    @Override // androidx.lifecycle.p1
    public final l1 b(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return e(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.p1
    public final l1 c(Class modelClass, u6.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(w6.c.f128111a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(g1.f18625a) == null || extras.a(g1.f18626b) == null) {
            if (this.f18653d != null) {
                return e(modelClass, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(o1.f18669d);
        boolean isAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor a13 = (!isAssignableFrom || application == null) ? k1.a(modelClass, k1.f18657b) : k1.a(modelClass, k1.f18656a);
        return a13 == null ? this.f18651b.c(modelClass, extras) : (!isAssignableFrom || application == null) ? k1.b(modelClass, a13, g1.a(extras)) : k1.b(modelClass, a13, application, g1.a(extras));
    }

    @Override // androidx.lifecycle.r1
    public final void d(l1 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        s sVar = this.f18653d;
        if (sVar != null) {
            ma.g gVar = this.f18654e;
            Intrinsics.f(gVar);
            jk.r.e(viewModel, gVar, sVar);
        }
    }

    public final l1 e(Class modelClass, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        s sVar = this.f18653d;
        if (sVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = a.class.isAssignableFrom(modelClass);
        Application application = this.f18650a;
        Constructor a13 = (!isAssignableFrom || application == null) ? k1.a(modelClass, k1.f18657b) : k1.a(modelClass, k1.f18656a);
        if (a13 == null) {
            if (application != null) {
                return this.f18651b.b(modelClass);
            }
            if (q1.f18672a == null) {
                q1.f18672a = new q1();
            }
            q1 q1Var = q1.f18672a;
            Intrinsics.f(q1Var);
            return q1Var.b(modelClass);
        }
        ma.g gVar = this.f18654e;
        Intrinsics.f(gVar);
        e1 f13 = jk.r.f(gVar, sVar, key, this.f18652c);
        c1 c1Var = f13.f18616b;
        l1 b13 = (!isAssignableFrom || application == null) ? k1.b(modelClass, a13, c1Var) : k1.b(modelClass, a13, application, c1Var);
        b13.d(f13);
        return b13;
    }
}
