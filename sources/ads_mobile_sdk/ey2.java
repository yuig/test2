package ads_mobile_sdk;

import a.cf;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ey2 implements a.rf {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4981a = new int[2];

    @Override // a.rf
    public final JSONObject a(View view) {
        if (view == null) {
            return wr1.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f4981a);
        int[] iArr = this.f4981a;
        return wr1.a(iArr[0], iArr[1], width, height);
    }

    @Override // a.rf
    public final void a(View view, JSONObject jSONObject, cf cfVar, boolean z13, boolean z14) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i13 = 0;
            if (z13) {
                HashMap hashMap = new HashMap();
                while (i13 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i13);
                    ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                    i13++;
                }
                ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                    while (it2.hasNext()) {
                        ((wt2) cfVar).a((View) it2.next(), this, jSONObject, z14);
                    }
                }
                return;
            }
            while (i13 < viewGroup.getChildCount()) {
                ((wt2) cfVar).a(viewGroup.getChildAt(i13), this, jSONObject, z14);
                i13++;
            }
        }
    }
}
