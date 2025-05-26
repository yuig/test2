package ny1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import et1.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.g0;
import kotlin.collections.s0;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import pk.a0;
import sw0.f0;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a */
    public final m60.w f92711a;

    /* renamed from: b */
    public final lb0.q f92712b;

    /* renamed from: c */
    public final d0 f92713c;

    public w(m60.w eventManager, lb0.q prefsManagerPersisted, d0 pinalytics) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f92711a = eventManager;
        this.f92712b = prefsManagerPersisted;
        this.f92713c = pinalytics;
    }

    public static void b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", activity.getPackageName(), null));
        intent.addFlags(268435456);
        activity.startActivity(intent);
    }

    public static void e(w wVar, FragmentActivity activity, f permissionRequest, String feature, f0 f0Var, Function0 onPermissionsRequestComplete, int i13) {
        v beforeOSRequestShownNoExplanation = v.f92710i;
        Function0 function0 = f0Var;
        if ((i13 & 16) != 0) {
            function0 = o.f92680k;
        }
        Function0 onPermissionsDenied = function0;
        Function0 onAllPermissionsGranted = o.f92681l;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissionRequest, "permissionRequest");
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(beforeOSRequestShownNoExplanation, "beforeOSRequestShownNoExplanation");
        Intrinsics.checkNotNullParameter(onPermissionsDenied, "onPermissionsDenied");
        Intrinsics.checkNotNullParameter(onPermissionsRequestComplete, "onPermissionsRequestComplete");
        Intrinsics.checkNotNullParameter(onAllPermissionsGranted, "onAllPermissionsGranted");
        if (!(activity instanceof oy1.a)) {
            throw new IllegalArgumentException("Activity must be OnRequestPermissionsResultCallbackHolder");
        }
        List list = permissionRequest.f92674a;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        boolean z13 = false;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                Set h10 = wVar.f92712b.h("PREF_APP_PERMISSION_REQUESTS", s0.f80394a);
                if (h10 == null || h10.contains(str)) {
                    z13 = true;
                    break;
                }
            }
        }
        beforeOSRequestShownNoExplanation.invoke(Boolean.valueOf(!z13));
        wVar.a(activity, arrayList, feature, onPermissionsDenied, onAllPermissionsGranted, onPermissionsRequestComplete);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.app.Activity] */
    public final void a(Activity activity, List list, final String str, final Function0 function0, final Function0 function02, final Function0 function03) {
        if (activity instanceof oy1.a) {
            ((oy1.a) activity).setOnRequestPermissionsResultCallback(new c5.a() { // from class: ny1.s
                @Override // c5.a
                public final void onRequestPermissionsResult(int i13, String[] permissionIds, int[] grantResults) {
                    w this$0 = w.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    String feature = str;
                    Intrinsics.checkNotNullParameter(feature, "$feature");
                    Function0 onPermissionsDenied = function0;
                    Intrinsics.checkNotNullParameter(onPermissionsDenied, "$onPermissionsDenied");
                    Function0 onPermissionsGranted = function02;
                    Intrinsics.checkNotNullParameter(onPermissionsGranted, "$onPermissionsGranted");
                    Function0 onPermissionsRequestComplete = function03;
                    Intrinsics.checkNotNullParameter(onPermissionsRequestComplete, "$onPermissionsRequestComplete");
                    Intrinsics.checkNotNullParameter(permissionIds, "resultsIds");
                    Intrinsics.checkNotNullParameter(grantResults, "grantResults");
                    this$0.getClass();
                    Intrinsics.checkNotNullParameter(permissionIds, "permissionIds");
                    Intrinsics.checkNotNullParameter(grantResults, "grantResults");
                    Intrinsics.checkNotNullParameter(feature, "feature");
                    Intrinsics.checkNotNullParameter(onPermissionsDenied, "onPermissionsDenied");
                    Intrinsics.checkNotNullParameter(onPermissionsGranted, "onPermissionsGranted");
                    Intrinsics.checkNotNullParameter(onPermissionsRequestComplete, "onPermissionsRequestComplete");
                    if (i13 == 123) {
                        boolean z13 = !(grantResults.length == 0);
                        d0 pinalytics = this$0.f92713c;
                        if (z13) {
                            for (int i14 : grantResults) {
                                if (i14 == 0) {
                                }
                            }
                            List permissionIds2 = c0.b0(permissionIds);
                            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                            Intrinsics.checkNotNullParameter(permissionIds2, "permissionIds");
                            Intrinsics.checkNotNullParameter(feature, "feature");
                            List<String> list2 = permissionIds2;
                            ArrayList arrayList = new ArrayList(g0.q(list2, 10));
                            for (String str2 : list2) {
                                arrayList.add(0);
                            }
                            j1.l1(pinalytics, permissionIds2, CollectionsKt.E0(arrayList), feature);
                            onPermissionsGranted.invoke();
                            onPermissionsRequestComplete.invoke();
                            return;
                        }
                        j1.l1(pinalytics, c0.b0(permissionIds), grantResults, feature);
                        onPermissionsDenied.invoke();
                        onPermissionsRequestComplete.invoke();
                    }
                }
            }, list, str);
        }
        List list2 = list;
        c5.c.f(activity, (String[]) list2.toArray(new String[0]), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
        s0 s0Var = s0.f80394a;
        lb0.q qVar = this.f92712b;
        ?? h10 = qVar.h("PREF_APP_PERMISSION_REQUESTS", s0Var);
        if (h10 != 0) {
            s0Var = h10;
        }
        LinkedHashSet I0 = CollectionsKt.I0(s0Var);
        I0.addAll(list2);
        qVar.j("PREF_APP_PERMISSION_REQUESTS", I0);
    }

    public final void c(Activity activity, n permissionRequest, String feature, HashMap hashMap, Function0 beforeExplanationShown, Function1 beforeOSRequestShownNoExplanation, Function0 onExplanationRejected, Function0 onPermissionsDenied, Function0 onPermissionsPermanentlyDenied, Function0 onPermissionsRequestComplete, Function0 onAllPermissionsGranted) {
        boolean z13;
        lb0.q qVar;
        boolean z14;
        boolean z15;
        String str = "activity";
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissionRequest, "permissionRequest");
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(beforeExplanationShown, "beforeExplanationShown");
        Intrinsics.checkNotNullParameter(beforeOSRequestShownNoExplanation, "beforeOSRequestShownNoExplanation");
        Intrinsics.checkNotNullParameter(onExplanationRejected, "onExplanationRejected");
        Intrinsics.checkNotNullParameter(onPermissionsDenied, "onPermissionsDenied");
        Intrinsics.checkNotNullParameter(onPermissionsPermanentlyDenied, "onPermissionsPermanentlyDenied");
        Intrinsics.checkNotNullParameter(onPermissionsRequestComplete, "onPermissionsRequestComplete");
        Intrinsics.checkNotNullParameter(onAllPermissionsGranted, "onAllPermissionsGranted");
        if (!(activity instanceof oy1.a)) {
            throw new IllegalArgumentException("Activity must be OnRequestPermissionsResultCallbackHolder");
        }
        List list = permissionRequest.f92674a;
        int a13 = y0.a(g0.q(list, 10));
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (Object obj : list) {
            linkedHashMap.put(obj, Boolean.valueOf(a0.G0(activity, (String) obj)));
        }
        Iterator it = linkedHashMap.values().iterator();
        boolean z16 = true;
        while (it.hasNext()) {
            z16 = z16 && ((Boolean) it.next()).booleanValue();
        }
        List list2 = permissionRequest.f92677d;
        int a14 = y0.a(g0.q(list2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a14 >= 16 ? a14 : 16);
        for (Object obj2 : list2) {
            linkedHashMap2.put(obj2, Boolean.valueOf(a0.G0(activity, (String) obj2)));
        }
        if (!linkedHashMap2.isEmpty()) {
            Iterator it2 = linkedHashMap2.values().iterator();
            loop3: while (true) {
                while (it2.hasNext()) {
                    z15 = z15 && ((Boolean) it2.next()).booleanValue();
                }
            }
            if (z15 && Build.VERSION.SDK_INT >= 34) {
                z13 = true;
                if (!z16 || z13) {
                    onAllPermissionsGranted.invoke();
                    onPermissionsRequestComplete.invoke();
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (!((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap3.size());
                Iterator it3 = linkedHashMap3.entrySet().iterator();
                while (it3.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it3.next()).getKey());
                }
                d0 d0Var = this.f92713c;
                j1.k1(d0Var, arrayList, feature, hashMap);
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it4.hasNext();
                    qVar = this.f92712b;
                    if (!hasNext) {
                        break;
                    }
                    Object next = it4.next();
                    Iterator it5 = it4;
                    String permissionId = (String) next;
                    Intrinsics.checkNotNullParameter(activity, str);
                    String str2 = str;
                    Intrinsics.checkNotNullParameter(permissionId, "permissionId");
                    if (m60.f0.n0(activity, permissionId, false, qVar)) {
                        arrayList2.add(next);
                    }
                    it4 = it5;
                    str = str2;
                }
                boolean z17 = false;
                ArrayList arrayList3 = arrayList2;
                u uVar = new u(this, arrayList, feature, onExplanationRejected, onPermissionsRequestComplete);
                boolean z18 = !arrayList3.isEmpty();
                boolean z19 = permissionRequest.f92678e;
                if (z18) {
                    ArrayList arrayList4 = new ArrayList(g0.q(arrayList, 10));
                    Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        ArrayList arrayList5 = arrayList3;
                        arrayList4.add(Integer.valueOf(arrayList5.contains((String) it6.next()) ? -2 : -1));
                        arrayList3 = arrayList5;
                    }
                    boolean booleanValue = ((Boolean) onPermissionsPermanentlyDenied.invoke()).booleanValue();
                    onPermissionsRequestComplete.invoke();
                    if (booleanValue || z19) {
                        j1.l1(d0Var, arrayList, CollectionsKt.E0(arrayList4), feature);
                        return;
                    } else {
                        beforeExplanationShown.invoke();
                        f(activity, permissionRequest, uVar, new r0(6, this, activity));
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it7 = arrayList.iterator();
                    while (it7.hasNext()) {
                        if (c5.c.g((String) it7.next(), activity)) {
                            z14 = true;
                            break;
                        }
                    }
                }
                z14 = false;
                if (!z19 && z14) {
                    beforeExplanationShown.invoke();
                    f(activity, permissionRequest, uVar, new w01.t(this, activity, arrayList, feature, onPermissionsDenied, onAllPermissionsGranted, onPermissionsRequestComplete, 3));
                    return;
                }
                if (!arrayList.isEmpty()) {
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        String str3 = (String) it8.next();
                        Set h10 = qVar.h("PREF_APP_PERMISSION_REQUESTS", s0.f80394a);
                        if (h10 == null || h10.contains(str3)) {
                            z17 = true;
                            break;
                        }
                    }
                }
                beforeOSRequestShownNoExplanation.invoke(Boolean.valueOf(!z17));
                a(activity, arrayList, feature, onPermissionsDenied, onAllPermissionsGranted, onPermissionsRequestComplete);
                return;
            }
        }
        z13 = false;
        if (z16) {
        }
        onAllPermissionsGranted.invoke();
        onPermissionsRequestComplete.invoke();
    }

    public final void f(Activity context, n nVar, u onExplanationRejected, Function0 onExplanationAccepted) {
        m60.w wVar = this.f92711a;
        int i13 = 0;
        if (!wVar.b(yb0.e.class)) {
            mf0.s sVar = new mf0.s();
            sVar.p7(p.a(nVar, context));
            int i14 = py1.b.next;
            r rVar = new r(sVar, i13);
            sVar.K = i14;
            sVar.S = rVar;
            sVar.m7();
            sVar.T6(new eh0.h(onExplanationAccepted, 1));
            wVar.d(new of0.a(sVar));
            return;
        }
        String explanationText = p.a(nVar, context);
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(explanationText, "explanationText");
        Intrinsics.checkNotNullParameter(onExplanationRejected, "onExplanationRejected");
        Intrinsics.checkNotNullParameter(onExplanationAccepted, "onExplanationAccepted");
        vr1.j jVar = null;
        vr1.j c13 = nVar.f92678e ? null : nVar.c(context, explanationText);
        if (c13 != null) {
            c13.f138513j = new kq1.a(3, onExplanationAccepted);
            c13.f138514k = new kq1.a(4, onExplanationRejected);
            c13.f138517n = false;
            jVar = c13;
        }
        if (jVar != null) {
            wVar.d(new yb0.e(jVar));
        }
    }
}
