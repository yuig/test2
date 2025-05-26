package lb0;

import ao2.j0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lh0.t2;
import nb0.p0;
import nb0.x;
import nb0.y;

/* loaded from: classes.dex */
public final class q implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f82731a;

    public q(se2.a dataStoreLogger, j0 scope, se2.a dataStoreManager, se2.a sharedPrefsManager, t2 preferencesExperiments) {
        Intrinsics.checkNotNullParameter(dataStoreLogger, "dataStoreLogger");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dataStoreManager, "dataStoreManager");
        Intrinsics.checkNotNullParameter(sharedPrefsManager, "sharedPrefsManager");
        Intrinsics.checkNotNullParameter(preferencesExperiments, "preferencesExperiments");
        this.f82731a = new p0(dataStoreLogger, scope, dataStoreManager, sharedPrefsManager, preferencesExperiments);
    }

    @Override // nb0.x
    public final long a(String key, long j13) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f82731a.a(key, j13);
    }

    @Override // nb0.x
    public final void b(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f82731a.b(key, str);
    }

    @Override // nb0.x
    public final void c(String key, long j13) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f82731a.c(key, j13);
    }

    @Override // nb0.x
    public final String d(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f82731a.d(key, str);
    }

    public final boolean e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        p0 p0Var = this.f82731a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        if (!p0Var.f90309e.a()) {
            return ((b) p0Var.j()).b(key);
        }
        return ((Boolean) kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new y(p0Var, key, null))).booleanValue();
    }

    public final boolean f(String key, boolean z13) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f82731a.h(key, z13);
    }

    public final int g(String key, int i13) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f82731a.i(key, i13);
    }

    public final Set h(String key, Set set) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f82731a.k(key, set);
    }

    public final void i(String key, int i13) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f82731a.n(key, i13);
    }

    public final void j(String key, Set set) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f82731a.o(key, set);
    }

    public final void k(String key, boolean z13) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f82731a.p(key, z13);
    }

    @Override // nb0.x
    public final void remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f82731a.remove(key);
    }
}
