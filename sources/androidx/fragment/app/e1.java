package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18314a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18315b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18316c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public z0 f18317d;

    public final void a(Fragment fragment) {
        if (this.f18314a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f18314a) {
            this.f18314a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        d1 d1Var = (d1) this.f18315b.get(str);
        if (d1Var != null) {
            return d1Var.f18305c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment findFragmentByWho;
        for (d1 d1Var : this.f18315b.values()) {
            if (d1Var != null && (findFragmentByWho = d1Var.f18305c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (d1 d1Var : this.f18315b.values()) {
            if (d1Var != null) {
                arrayList.add(d1Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (d1 d1Var : this.f18315b.values()) {
            if (d1Var != null) {
                arrayList.add(d1Var.f18305c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f18314a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f18314a) {
            arrayList = new ArrayList(this.f18314a);
        }
        return arrayList;
    }

    public final Bundle g(String str) {
        return (Bundle) this.f18316c.get(str);
    }

    public final void h(d1 d1Var) {
        Fragment fragment = d1Var.f18305c;
        String str = fragment.mWho;
        HashMap hashMap = this.f18315b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(fragment.mWho, d1Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f18317d.h(fragment);
            } else {
                this.f18317d.l(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void i(d1 d1Var) {
        Fragment fragment = d1Var.f18305c;
        if (fragment.mRetainInstance) {
            this.f18317d.l(fragment);
        }
        HashMap hashMap = this.f18315b;
        if (hashMap.get(fragment.mWho) == d1Var && ((d1) hashMap.put(fragment.mWho, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final Bundle j(String str, Bundle bundle) {
        HashMap hashMap = this.f18316c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }
}
