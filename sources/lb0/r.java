package lb0;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
import lh0.t2;
import nb0.a0;
import nb0.o0;
import nb0.p0;
import nb0.x;

/* loaded from: classes.dex */
public final class r implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f82732a;

    public r(se2.a dataStoreLogger, j0 scope, se2.a dataStoreManager, se2.a sharedPrefsManager, t2 preferencesExperiments) {
        Intrinsics.checkNotNullParameter(dataStoreLogger, "dataStoreLogger");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dataStoreManager, "dataStoreManager");
        Intrinsics.checkNotNullParameter(sharedPrefsManager, "sharedPrefsManager");
        Intrinsics.checkNotNullParameter(preferencesExperiments, "preferencesExperiments");
        this.f82732a = new p0(dataStoreLogger, scope, dataStoreManager, sharedPrefsManager, preferencesExperiments);
    }

    @Override // nb0.x
    public final long a(String key, long j13) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f82732a.a(key, 0L);
    }

    @Override // nb0.x
    public final void b(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f82732a.b(key, str);
    }

    @Override // nb0.x
    public final void c(String key, long j13) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f82732a.c(key, j13);
    }

    @Override // nb0.x
    public final String d(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f82732a.d(key, str);
    }

    public final String e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        p0 p0Var = this.f82732a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        j0Var.f80434a = null;
        if (p0Var.f90309e.a()) {
            kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new a0(p0Var, key, null, j0Var, null));
        } else {
            p0Var.m();
            j0Var.f80434a = ((b) p0Var.j()).d(key, null);
        }
        return (String) j0Var.f80434a;
    }

    public final boolean f(String key, boolean z13) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f82732a.h(key, z13);
    }

    public final int g(String key, int i13) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f82732a.i(key, i13);
    }

    public final void h(String key, int i13) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f82732a.n(key, i13);
    }

    public final void i(String key, boolean z13) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f82732a.p(key, z13);
    }

    public final boolean j(String key, String str, com.pinterest.encryption.dataEncryptionLibrary.a dataEncryptionUtils) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(dataEncryptionUtils, "dataEncryptionUtils");
        p0 p0Var = this.f82732a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(dataEncryptionUtils, "dataEncryptionUtils");
        f0 f0Var = new f0();
        if (p0Var.f90309e.a()) {
            kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new o0(p0Var, key, str, null, dataEncryptionUtils, f0Var, null));
        } else {
            f0Var.f80424a = ((b) p0Var.j()).p(key, str, null);
        }
        return f0Var.f80424a;
    }

    @Override // nb0.x
    public final void remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f82732a.remove(key);
    }
}
