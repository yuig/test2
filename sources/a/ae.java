package a;

import ads_mobile_sdk.an2;
import ads_mobile_sdk.ey2;
import ads_mobile_sdk.ud2;
import ads_mobile_sdk.wr1;
import ads_mobile_sdk.wt2;
import ads_mobile_sdk.yd2;
import android.util.Log;
import android.view.View;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ae implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Throwable th3;
        wt2 wt2Var = wt2.f13249g;
        wt2Var.getClass();
        wt2Var.f13255b.clear();
        Iterator it = Collections.unmodifiableCollection(ads_mobile_sdk.u3.f11813c.f11815b).iterator();
        while (it.hasNext()) {
            ((ads_mobile_sdk.t3) it.next()).getClass();
        }
        wt2Var.f13259f = System.nanoTime();
        wt2Var.f13257d.a();
        long nanoTime = System.nanoTime();
        ud2 ud2Var = wt2Var.f13256c.f7616b;
        if (wt2Var.f13257d.f5455f.size() > 0) {
            Iterator it2 = wt2Var.f13257d.f5455f.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                JSONObject a13 = ud2Var.a(null);
                View view = (View) wt2Var.f13257d.f5452c.get(str);
                ey2 ey2Var = wt2Var.f13256c.f7615a;
                String str2 = (String) wt2Var.f13257d.f5456g.get(str);
                if (str2 != null) {
                    JSONObject a14 = ey2Var.a(view);
                    try {
                        a14.put("adSessionId", str);
                    } catch (JSONException e13) {
                        Log.e("OMIDLIB", "Error with setting ad session id", e13);
                    }
                    try {
                        a14.put("notVisibleReason", str2);
                    } catch (JSONException e14) {
                        Log.e("OMIDLIB", "Error with setting not visible reason", e14);
                    }
                    wr1.a(a13, a14);
                }
                wr1.a(a13);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                an2 an2Var = wt2Var.f13258e;
                an2Var.f2449b.a(new v(an2Var, hashSet, a13, nanoTime, 1));
            }
        }
        if (wt2Var.f13257d.f5454e.size() > 0) {
            JSONObject a15 = ud2Var.a(null);
            th3 = null;
            ud2Var.a(null, a15, wt2Var, true, false);
            wr1.a(a15);
            an2 an2Var2 = wt2Var.f13258e;
            an2Var2.f2449b.a(new v(an2Var2, wt2Var.f13257d.f5454e, a15, nanoTime, 0));
        } else {
            th3 = null;
            an2 an2Var3 = wt2Var.f13258e;
            an2Var3.f2449b.a(new d4(an2Var3));
        }
        ads_mobile_sdk.g6 g6Var = wt2Var.f13257d;
        g6Var.f5450a.clear();
        g6Var.f5451b.clear();
        g6Var.f5452c.clear();
        g6Var.f5453d.clear();
        g6Var.f5454e.clear();
        g6Var.f5455f.clear();
        g6Var.f5456g.clear();
        g6Var.f5459j = false;
        g6Var.f5457h.clear();
        long nanoTime2 = System.nanoTime() - wt2Var.f13259f;
        if (wt2Var.f13254a.size() > 0) {
            Iterator it3 = wt2Var.f13254a.iterator();
            if (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                throw th3;
            }
        }
        yd2.f14206d.a();
    }
}
