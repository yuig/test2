package qy1;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import df.j1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import lb0.q;
import m60.u;
import mf0.s;
import ny1.r;
import pk.a0;
import sh.f;
import tb0.g;
import tb0.h;
import tb0.p;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f105359a = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* renamed from: b, reason: collision with root package name */
    public static final int f105360b = py1.b.camera_permission_explanation;

    /* renamed from: c, reason: collision with root package name */
    public static final int f105361c = py1.b.location_permission_explanation;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f105362d;

    static {
        HashMap hashMap = new HashMap();
        f105362d = hashMap;
        hashMap.put(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, Integer.valueOf(py1.b.camera_and_storage_permission_combined_explanation));
        hashMap.put(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, Integer.valueOf(py1.b.lens_combined_permissions_prompt));
        hashMap.put(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, Integer.valueOf(py1.b.lens_and_virtual_try_on_permissions_prompt));
    }

    public static boolean a(Context context, String str) {
        return context != null && d5.a.a(context, str) == 0;
    }

    public static void b(q qVar, Activity activity, String str, int i13, c5.a aVar) {
        Integer num;
        String[] strArr = {str};
        int[] iArr = {i13};
        Resources resources = activity.getResources();
        LinkedList linkedList = new LinkedList();
        int[] iArr2 = new int[1];
        StringBuilder sb3 = null;
        for (int i14 = 0; i14 < 1; i14++) {
            if (d5.a.a(activity, strArr[i14]) == 0) {
                iArr2[i14] = 0;
            } else {
                linkedList.add(strArr[i14]);
                try {
                    if (c5.c.g(strArr[i14], activity)) {
                        if (sb3 == null) {
                            sb3 = new StringBuilder();
                            sb3.append(resources.getString(py1.b.permission_explanation_header));
                        }
                        sb3.append(" ");
                        sb3.append(resources.getString(iArr[i14]));
                    }
                } catch (Exception e13) {
                    HashSet hashSet = h.f117076w;
                    g.f117075a.q(e13, "Error showing permission rationale dialog", p.PERMISSIONS);
                }
            }
        }
        if (linkedList.isEmpty()) {
            aVar.onRequestPermissionsResult(1, strArr, iArr2);
            return;
        }
        j1.k1(f.a(), linkedList, "", null);
        String[] strArr2 = new String[linkedList.size()];
        linkedList.toArray(strArr2);
        if (sb3 == null) {
            f(qVar, activity, strArr2, aVar);
            return;
        }
        e(qVar, activity, strArr2, (linkedList.size() != 1 || (num = (Integer) f105362d.get(strArr)) == null) ? sb3.toString() : resources.getString(py1.b.permission_explanation_header) + " " + resources.getString(num.intValue()), null, aVar);
    }

    public static c c(q qVar, Activity activity) {
        return a(activity, "android.permission.ACCESS_FINE_LOCATION") ? c.AUTHORIZED : d(qVar, activity, "android.permission.ACCESS_FINE_LOCATION") ? c.DENIED : c.NOT_DETERMINED;
    }

    public static boolean d(q qVar, Activity activity, String str) {
        Set h10;
        return (a(activity, str) || c5.c.g(str, activity) || (h10 = qVar.h("PREF_APP_PERMISSION_REQUESTS", Collections.emptySet())) == null || !h10.contains(str)) ? false : true;
    }

    public static void e(final q qVar, final Activity activity, final String[] strArr, String str, String str2, final c5.a aVar) {
        s sVar = new s();
        if (a0.D0(str2)) {
            sVar.h7(str2);
        }
        sVar.p7(str);
        int i13 = py1.b.next;
        r rVar = new r(sVar, 1);
        sVar.K = i13;
        sVar.S = rVar;
        sVar.m7();
        sVar.T6(new mf0.b() { // from class: qy1.b
            @Override // mf0.b
            public final void onDismiss() {
                d.f(q.this, activity, strArr, aVar);
            }
        });
        u.f85943a.d(new of0.a(sVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(q qVar, Activity activity, String[] strArr, final c5.a aVar) {
        HashSet hashSet;
        if (activity instanceof oy1.a) {
            ((oy1.a) activity).setOnRequestPermissionsResultCallback(new c5.a() { // from class: qy1.a
                @Override // c5.a
                public final void onRequestPermissionsResult(int i13, String[] strArr2, int[] iArr) {
                    j1.l1(f.a(), Arrays.asList(strArr2), iArr, "");
                    c5.a.this.onRequestPermissionsResult(i13, strArr2, iArr);
                }
            }, Arrays.asList(strArr), "");
        }
        c5.c.f(activity, strArr, 1);
        List asList = Arrays.asList(strArr);
        Set h10 = qVar.h("PREF_APP_PERMISSION_REQUESTS", Collections.emptySet());
        if (h10 != null) {
            hashSet = new HashSet(h10);
            hashSet.addAll(asList);
        } else {
            hashSet = null;
        }
        qVar.j("PREF_APP_PERMISSION_REQUESTS", hashSet);
    }
}
