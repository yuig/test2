package g;

import a.cb;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.b0;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f63171a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f63172b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f63173c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f63174d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient HashMap f63175e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f63176f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f63177g = new Bundle();

    public final boolean a(int i13, int i14, Intent intent) {
        String str = (String) this.f63171a.get(Integer.valueOf(i13));
        if (str == null) {
            return false;
        }
        b(str, i14, intent, (e) this.f63175e.get(str));
        return true;
    }

    public final void b(String str, int i13, Intent intent, e eVar) {
        a aVar;
        if (eVar == null || (aVar = eVar.f63167a) == null || !this.f63174d.contains(str)) {
            this.f63176f.remove(str);
            this.f63177g.putParcelable(str, new ActivityResult(intent, i13));
        } else {
            aVar.c(eVar.f63168b.c(intent, i13));
            this.f63174d.remove(str);
        }
    }

    public abstract void c(int i13, h.a aVar, Object obj);

    public final d d(String str, z zVar, h.a aVar, a aVar2) {
        s lifecycle = zVar.getLifecycle();
        b0 b0Var = (b0) lifecycle;
        if (b0Var.f18588d.isAtLeast(r.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + zVar + " is attempting to register while current state is " + b0Var.f18588d + ". LifecycleOwners must call register before they are STARTED.");
        }
        f(str);
        HashMap hashMap = this.f63173c;
        f fVar = (f) hashMap.get(str);
        if (fVar == null) {
            fVar = new f(lifecycle);
        }
        c cVar = new c(this, str, aVar2, aVar);
        fVar.f63169a.a(cVar);
        fVar.f63170b.add(cVar);
        hashMap.put(str, fVar);
        return new d(this, str, aVar, 0);
    }

    public final d e(String str, h.a aVar, a aVar2) {
        f(str);
        this.f63175e.put(str, new e(aVar, aVar2));
        HashMap hashMap = this.f63176f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            aVar2.c(obj);
        }
        Bundle bundle = this.f63177g;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            aVar2.c(aVar.c(activityResult.f15932b, activityResult.f15931a));
        }
        return new d(this, str, aVar, 1);
    }

    public final void f(String str) {
        HashMap hashMap = this.f63172b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        ol2.f.f96454a.getClass();
        int i13 = ol2.f.f96455b.i(2147418112);
        while (true) {
            int i14 = i13 + 65536;
            HashMap hashMap2 = this.f63171a;
            if (!hashMap2.containsKey(Integer.valueOf(i14))) {
                hashMap2.put(Integer.valueOf(i14), str);
                hashMap.put(str, Integer.valueOf(i14));
                return;
            } else {
                ol2.f.f96454a.getClass();
                i13 = ol2.f.f96455b.i(2147418112);
            }
        }
    }

    public final void g(String str) {
        Integer num;
        if (!this.f63174d.contains(str) && (num = (Integer) this.f63172b.remove(str)) != null) {
            this.f63171a.remove(num);
        }
        this.f63175e.remove(str);
        HashMap hashMap = this.f63176f;
        if (hashMap.containsKey(str)) {
            StringBuilder o13 = cb.o("Dropping pending result for request ", str, ": ");
            o13.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", o13.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f63177g;
        if (bundle.containsKey(str)) {
            StringBuilder o14 = cb.o("Dropping pending result for request ", str, ": ");
            o14.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", o14.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f63173c;
        f fVar = (f) hashMap2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.f63170b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar.f63169a.b((x) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
