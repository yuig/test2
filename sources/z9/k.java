package z9;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.g1;
import androidx.lifecycle.j1;
import androidx.lifecycle.o1;
import androidx.lifecycle.p1;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k implements androidx.lifecycle.z, u1, androidx.lifecycle.k, ma.i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f141210a;

    /* renamed from: b, reason: collision with root package name */
    public z f141211b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f141212c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.r f141213d;

    /* renamed from: e, reason: collision with root package name */
    public final p0 f141214e;

    /* renamed from: f, reason: collision with root package name */
    public final String f141215f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f141216g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.b0 f141217h = new androidx.lifecycle.b0(this);

    /* renamed from: i, reason: collision with root package name */
    public final ma.h f141218i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f141219j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.lifecycle.r f141220k;

    /* renamed from: l, reason: collision with root package name */
    public final j1 f141221l;

    public k(Context context, z zVar, Bundle bundle, androidx.lifecycle.r rVar, p0 p0Var, String str, Bundle bundle2) {
        this.f141210a = context;
        this.f141211b = zVar;
        this.f141212c = bundle;
        this.f141213d = rVar;
        this.f141214e = p0Var;
        this.f141215f = str;
        this.f141216g = bundle2;
        Intrinsics.checkNotNullParameter(this, "owner");
        this.f141218i = new ma.h(this);
        xk2.v b13 = xk2.m.b(new j(this, 0));
        xk2.m.b(new j(this, 1));
        this.f141220k = androidx.lifecycle.r.INITIALIZED;
        this.f141221l = (j1) b13.getValue();
    }

    public final Bundle a() {
        Bundle bundle = this.f141212c;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void b(androidx.lifecycle.r maxState) {
        Intrinsics.checkNotNullParameter(maxState, "maxState");
        this.f141220k = maxState;
        c();
    }

    public final void c() {
        if (!this.f141219j) {
            ma.h hVar = this.f141218i;
            hVar.a();
            this.f141219j = true;
            if (this.f141214e != null) {
                g1.b(this);
            }
            hVar.b(this.f141216g);
        }
        int ordinal = this.f141213d.ordinal();
        int ordinal2 = this.f141220k.ordinal();
        androidx.lifecycle.b0 b0Var = this.f141217h;
        if (ordinal < ordinal2) {
            b0Var.g(this.f141213d);
        } else {
            b0Var.g(this.f141220k);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!Intrinsics.d(this.f141215f, kVar.f141215f) || !Intrinsics.d(this.f141211b, kVar.f141211b) || !Intrinsics.d(this.f141217h, kVar.f141217h) || !Intrinsics.d(this.f141218i.f86760b, kVar.f141218i.f86760b)) {
            return false;
        }
        Bundle bundle = this.f141212c;
        Bundle bundle2 = kVar.f141212c;
        if (!Intrinsics.d(bundle, bundle2)) {
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = keySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    if (!Intrinsics.d(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.k
    public final u6.c getDefaultViewModelCreationExtras() {
        u6.e eVar = new u6.e(0);
        Context context = this.f141210a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            eVar.b(o1.f18669d, application);
        }
        eVar.b(g1.f18625a, this);
        eVar.b(g1.f18626b, this);
        Bundle a13 = a();
        if (a13 != null) {
            eVar.b(g1.f18627c, a13);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return this.f141221l;
    }

    @Override // androidx.lifecycle.z
    public final androidx.lifecycle.s getLifecycle() {
        return this.f141217h;
    }

    @Override // ma.i
    public final ma.g getSavedStateRegistry() {
        return this.f141218i.f86760b;
    }

    @Override // androidx.lifecycle.u1
    public final t1 getViewModelStore() {
        if (!this.f141219j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (this.f141217h.f18588d == androidx.lifecycle.r.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        p0 p0Var = this.f141214e;
        if (p0Var == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
        }
        String backStackEntryId = this.f141215f;
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = ((r) p0Var).f141281b;
        t1 t1Var = (t1) linkedHashMap.get(backStackEntryId);
        if (t1Var != null) {
            return t1Var;
        }
        t1 t1Var2 = new t1();
        linkedHashMap.put(backStackEntryId, t1Var2);
        return t1Var2;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f141211b.hashCode() + (this.f141215f.hashCode() * 31);
        Bundle bundle = this.f141212c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i13 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i13 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f141218i.f86760b.hashCode() + ((this.f141217h.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(k.class.getSimpleName());
        sb3.append("(" + this.f141215f + ')');
        sb3.append(" destination=");
        sb3.append(this.f141211b);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "sb.toString()");
        return sb4;
    }
}
