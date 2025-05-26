package ads_mobile_sdk;

import a.cf;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import kh2.u2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ud2 implements a.rf {

    /* renamed from: a, reason: collision with root package name */
    public final a.rf f12042a;

    public ud2(ey2 ey2Var) {
        this.f12042a = ey2Var;
    }

    @Override // a.rf
    public final JSONObject a(View view) {
        JSONObject a13 = wr1.a(0, 0, 0, 0);
        try {
            a13.put("noOutputDevice", a.bb.c(hr1.a() != 1 ? 2 : u2.f79715a) == 0);
        } catch (JSONException e13) {
            Log.e("OMIDLIB", "Error with setting output device status", e13);
        }
        return a13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.rf
    public final void a(View view, JSONObject jSONObject, cf cfVar, boolean z13, boolean z14) {
        ArrayList arrayList = new ArrayList();
        u3 u3Var = u3.f11813c;
        if (u3Var != null) {
            Collection unmodifiableCollection = Collections.unmodifiableCollection(u3Var.f11815b);
            IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
            Iterator it = unmodifiableCollection.iterator();
            while (it.hasNext()) {
                View view2 = (View) ((t3) it.next()).f11328c.get();
                if (view2 != null && view2.isAttachedToWindow() && view2.isShown()) {
                    View view3 = view2;
                    while (true) {
                        if (view3 == null) {
                            View rootView = view2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z15 = rootView.getZ();
                                int size = arrayList.size();
                                while (size > 0 && ((View) arrayList.get(size - 1)).getZ() > z15) {
                                    size--;
                                }
                                arrayList.add(size, rootView);
                            }
                        } else {
                            if (view3.getAlpha() == 0.0f) {
                                break;
                            }
                            Object parent = view3.getParent();
                            view3 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((wt2) cfVar).a((View) it2.next(), this.f12042a, jSONObject, z14);
        }
    }
}
