package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z0 extends androidx.lifecycle.l1 {

    /* renamed from: h, reason: collision with root package name */
    public static final y0 f18501h = new y0();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18505e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18502b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18503c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f18504d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f18506f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18507g = false;

    public z0(boolean z13) {
        this.f18505e = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f18502b.equals(z0Var.f18502b) && this.f18503c.equals(z0Var.f18503c) && this.f18504d.equals(z0Var.f18504d);
    }

    @Override // androidx.lifecycle.l1
    public final void g() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f18506f = true;
    }

    public final void h(Fragment fragment) {
        if (this.f18507g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap hashMap = this.f18502b;
        if (hashMap.containsKey(fragment.mWho)) {
            return;
        }
        hashMap.put(fragment.mWho, fragment);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final int hashCode() {
        return this.f18504d.hashCode() + a.c.d(this.f18503c, this.f18502b.hashCode() * 31, 31);
    }

    public final void i(Fragment fragment, boolean z13) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        k(fragment.mWho, z13);
    }

    public final void j(String str, boolean z13) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        k(str, z13);
    }

    public final void k(String str, boolean z13) {
        HashMap hashMap = this.f18503c;
        z0 z0Var = (z0) hashMap.get(str);
        if (z0Var != null) {
            if (z13) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(z0Var.f18503c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    z0Var.j((String) it.next(), true);
                }
            }
            z0Var.g();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f18504d;
        androidx.lifecycle.t1 t1Var = (androidx.lifecycle.t1) hashMap2.get(str);
        if (t1Var != null) {
            t1Var.a();
            hashMap2.remove(str);
        }
    }

    public final void l(Fragment fragment) {
        if (this.f18507g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f18502b.remove(fragment.mWho) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final boolean m(Fragment fragment) {
        if (this.f18502b.containsKey(fragment.mWho) && this.f18505e) {
            return this.f18506f;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FragmentManagerViewModel{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append("} Fragments (");
        Iterator it = this.f18502b.values().iterator();
        while (it.hasNext()) {
            sb3.append(it.next());
            if (it.hasNext()) {
                sb3.append(", ");
            }
        }
        sb3.append(") Child Non Config (");
        Iterator it2 = this.f18503c.keySet().iterator();
        while (it2.hasNext()) {
            sb3.append((String) it2.next());
            if (it2.hasNext()) {
                sb3.append(", ");
            }
        }
        sb3.append(") ViewModelStores (");
        Iterator it3 = this.f18504d.keySet().iterator();
        while (it3.hasNext()) {
            sb3.append((String) it3.next());
            if (it3.hasNext()) {
                sb3.append(", ");
            }
        }
        sb3.append(')');
        return sb3.toString();
    }
}
