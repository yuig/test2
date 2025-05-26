package nb0;

import com.pinterest.common.kit.datastore.DataStoreKibanaLogger$Log$Payload;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lh0.t2;

/* loaded from: classes.dex */
public final class p0 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final se2.a f90305a;

    /* renamed from: b, reason: collision with root package name */
    public final ao2.j0 f90306b;

    /* renamed from: c, reason: collision with root package name */
    public final se2.a f90307c;

    /* renamed from: d, reason: collision with root package name */
    public final se2.a f90308d;

    /* renamed from: e, reason: collision with root package name */
    public final t2 f90309e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f90310f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f90311g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f90312h;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.v f90313i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f90314j;

    public p0(se2.a dataStoreLogger, ao2.j0 scope, se2.a lazyDataStoreManager, se2.a lazySharedPrefsManager, t2 experiments) {
        Intrinsics.checkNotNullParameter(dataStoreLogger, "dataStoreLogger");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(lazyDataStoreManager, "lazyDataStoreManager");
        Intrinsics.checkNotNullParameter(lazySharedPrefsManager, "lazySharedPrefsManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f90305a = dataStoreLogger;
        this.f90306b = scope;
        this.f90307c = lazyDataStoreManager;
        this.f90308d = lazySharedPrefsManager;
        this.f90309e = experiments;
        this.f90310f = new HashSet();
        this.f90312h = new HashMap();
        this.f90313i = xk2.m.b(new z(this, 0));
        this.f90314j = xk2.m.b(new z(this, 1));
    }

    public static final e e(p0 p0Var) {
        Object value = p0Var.f90313i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (e) value;
    }

    public static final mo2.a f(p0 p0Var, String str) {
        HashMap hashMap = p0Var.f90312h;
        if (hashMap.containsKey(str)) {
            return (mo2.a) hashMap.get(str);
        }
        hashMap.put(str, mo2.d.a());
        return (mo2.a) hashMap.get(str);
    }

    public static final void g(p0 p0Var, String preferenceKey, Object obj, Object obj2) {
        p0Var.getClass();
        if (Intrinsics.d(obj, obj2)) {
            return;
        }
        HashSet hashSet = p0Var.f90310f;
        if (hashSet.contains(preferenceKey)) {
            return;
        }
        hashSet.add(preferenceKey);
        String preferenceDataType = obj == null ? null : kotlin.jvm.internal.k0.f80436a.b(obj.getClass()).f();
        d dVar = (d) ((bf2.b) p0Var.f90305a).get();
        if (preferenceDataType == null) {
            preferenceDataType = "";
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(preferenceKey, "key");
        Intrinsics.checkNotNullParameter(preferenceDataType, "valueType");
        String g13 = ((b60.d) dVar.f90180a).g();
        String userId = g13 != null ? g13 : "";
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        Intrinsics.checkNotNullParameter(preferenceDataType, "preferenceDataType");
        Intrinsics.checkNotNullParameter(userId, "userId");
        b metadata = new b(userId, null, 2, null);
        DataStoreKibanaLogger$Log$Payload payload = new DataStoreKibanaLogger$Log$Payload(preferenceKey, preferenceDataType);
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(payload, "payload");
        c cVar = new c("datastore_metrics", metadata, payload, null, null, 0L, 56, null);
        ms0.b bVar = ms0.b.f88099b;
        if (bVar == null) {
            bVar = new ms0.b();
        }
        bVar.b(cVar);
        ms0.b.f88099b = bVar;
        ox.b analyticsApi = dVar.f90181b;
        if (analyticsApi != null) {
            Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
            ms0.b bVar2 = ms0.b.f88099b;
            if (bVar2 == null) {
                return;
            }
            ((vy.m) analyticsApi).i(bVar2, new lr.v(bVar2, 26));
        }
    }

    @Override // nb0.x
    public final long a(String key, long j13) {
        Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.i0 i0Var = new kotlin.jvm.internal.i0();
        i0Var.f80432a = j13;
        if (this.f90309e.a()) {
            kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new d0(this, key, j13, i0Var, null));
        } else {
            m();
            i0Var.f80432a = ((lb0.b) j()).g(key, j13);
        }
        return i0Var.f80432a;
    }

    @Override // nb0.x
    public final void b(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f90309e.a()) {
            kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new m0(this, key, str, null));
            return;
        }
        lb0.m c13 = ((lb0.b) j()).c();
        c13.putString(key, str);
        c13.apply();
    }

    @Override // nb0.x
    public final void c(String key, long j13) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f90309e.a()) {
            kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new j0(this, key, j13, null));
            return;
        }
        lb0.m c13 = ((lb0.b) j()).c();
        c13.putLong(key, j13);
        c13.apply();
    }

    @Override // nb0.x
    public final String d(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        j0Var.f80434a = str;
        if (this.f90309e.a()) {
            kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new e0(this, key, str, j0Var, null));
        } else {
            m();
            j0Var.f80434a = ((lb0.b) j()).j(key, str);
        }
        return (String) j0Var.f80434a;
    }

    public final boolean h(String key, boolean z13) {
        Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f80424a = z13;
        if (this.f90309e.a()) {
            kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new b0(this, key, z13, f0Var, null));
        } else {
            m();
            f0Var.f80424a = ((lb0.b) j()).e(key, z13);
        }
        return f0Var.f80424a;
    }

    public final int i(String key, int i13) {
        Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f80426a = i13;
        if (this.f90309e.a()) {
            kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new c0(this, key, i13, h0Var, null));
        } else {
            m();
            h0Var.f80426a = ((lb0.b) j()).f(key, i13);
        }
        return h0Var.f80426a;
    }

    public final lb0.o j() {
        Object value = this.f90314j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (lb0.o) value;
    }

    public final Set k(String key, Set set) {
        Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        j0Var.f80434a = set;
        if (this.f90309e.a()) {
            kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new f0(this, key, set, j0Var, null));
        } else {
            m();
            lb0.b bVar = (lb0.b) j();
            bVar.getClass();
            lb0.b.q();
            Object obj = bVar.i().get(key);
            if (obj != lb0.j.f82711a) {
                set = obj != null ? (Set) obj : bVar.f82703b.getStringSet(key, set);
            }
            j0Var.f80434a = set;
        }
        return (Set) j0Var.f80434a;
    }

    public final void l() {
        if (this.f90311g) {
            return;
        }
        this.f90311g = true;
        kotlin.jvm.internal.j.z(this.f90306b, null, null, new i0(this, null), 3);
    }

    public final void m() {
        if (!((lb0.b) j()).e("ALREADY_MIGRATED", false) || this.f90309e.a()) {
            return;
        }
        l();
    }

    public final void n(String key, int i13) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f90309e.a()) {
            kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new k0(this, key, i13, null));
            return;
        }
        lb0.m c13 = ((lb0.b) j()).c();
        c13.putInt(key, i13);
        c13.apply();
    }

    public final void o(String key, Set set) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f90309e.a()) {
            kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new l0(this, key, set, null));
            return;
        }
        lb0.m c13 = ((lb0.b) j()).c();
        c13.putStringSet(key, set);
        c13.apply();
    }

    public final void p(String key, boolean z13) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f90309e.a()) {
            kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new n0(this, key, z13, null));
            return;
        }
        lb0.m c13 = ((lb0.b) j()).c();
        c13.putBoolean(key, z13);
        c13.apply();
    }

    @Override // nb0.x
    public final void remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f90309e.a()) {
            kotlin.jvm.internal.j.z(this.f90306b, null, null, new g0(this, key, null), 3);
        }
        lb0.m c13 = ((lb0.b) j()).c();
        c13.remove(key);
        c13.apply();
    }
}
