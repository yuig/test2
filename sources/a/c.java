package a;

import ads_mobile_sdk.gk0;
import ads_mobile_sdk.v81;
import android.content.Context;
import android.net.Uri;
import com.google.android.recaptcha.internal.zzln;
import com.pinterest.feature.ideaPinCreation.worker.CreateStoryPinWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ boolean A(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, ho2.v vVar, ho2.v vVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, vVar, vVar2)) {
            if (atomicReferenceFieldUpdater.get(obj) != vVar) {
                return false;
            }
        }
        return true;
    }

    public static int a(double d2, int i13, int i14) {
        return (Double.hashCode(d2) + i13) * i14;
    }

    public static int b(int i13, int i14, int i15) {
        return zzln.zzA(i13) + i14 + i15;
    }

    public static int c(b4.q0 q0Var, int i13, int i14) {
        return (q0Var.hashCode() + i13) * i14;
    }

    public static int d(HashMap hashMap, int i13, int i14) {
        return (hashMap.hashCode() + i13) * i14;
    }

    public static int e(Map map, int i13, int i14) {
        return (map.hashCode() + i13) * i14;
    }

    public static v81 f(LinkedHashMap linkedHashMap, String str, o8 o8Var, LinkedHashMap linkedHashMap2) {
        linkedHashMap.put(str, o8Var);
        return new v81(linkedHashMap2);
    }

    public static String g(String str, Uri uri) {
        return str + uri;
    }

    public static String h(StringBuilder sb3, Boolean bool, String str) {
        sb3.append(bool);
        sb3.append(str);
        return sb3.toString();
    }

    public static String i(StringBuilder sb3, Integer num, String str) {
        sb3.append(num);
        sb3.append(str);
        return sb3.toString();
    }

    public static String j(StringBuilder sb3, List list, String str) {
        sb3.append(list);
        sb3.append(str);
        return sb3.toString();
    }

    public static /* synthetic */ List k(String str) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{str}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }

    public static rl2.t l(Class cls, String str, String str2, int i13, kotlin.jvm.internal.l0 l0Var) {
        return l0Var.g(new kotlin.jvm.internal.d0(cls, str, str2, i13));
    }

    public static xk2.k m(CreateStoryPinWorker createStoryPinWorker, int i13, xk2.n nVar) {
        return xk2.m.a(nVar, new aw0.a(createStoryPinWorker, i13));
    }

    public static xk2.v n(Context context, int i13) {
        return xk2.m.b(new em1.k(context, i13));
    }

    public static void o(int i13, HashMap hashMap, String str, int i14, String str2) {
        hashMap.put(str, Integer.valueOf(i13));
        hashMap.put(str2, Integer.valueOf(i14));
    }

    public static /* synthetic */ void p(androidx.recyclerview.widget.y2 y2Var) {
        if (y2Var != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void q(com.google.android.gms.common.api.b bVar) {
        if (bVar != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void r(com.google.android.gms.internal.measurement.i6 i6Var) {
        if (i6Var != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void s(com.google.android.gms.internal.recaptcha.b0 b0Var) {
        throw new ClassCastException();
    }

    public static /* synthetic */ void t(Object obj) {
        throw new ClassCastException();
    }

    public static void u(String str, String str2, String str3, String str4, String str5) {
        gk0.c(str + str2 + str3 + str4 + str5, null);
    }

    public static void v(StringBuilder sb3, boolean z13, String str, boolean z14, String str2) {
        sb3.append(z13);
        sb3.append(str);
        sb3.append(z14);
        sb3.append(str2);
    }

    public static /* synthetic */ void w(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, ao2.l1 l1Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, l1Var) && atomicReferenceFieldUpdater.get(obj) == obj2) {
        }
    }

    public static void x(l82.c0 c0Var, int i13, l82.e eVar) {
        eVar.c(new cj0.b0(c0Var, i13));
    }

    public static void y(m60.w wVar) {
        wVar.d(new jc0.s());
    }

    public static /* synthetic */ boolean z(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, ho2.v vVar, co2.u uVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, vVar, uVar)) {
            if (atomicReferenceFieldUpdater.get(obj) != vVar) {
                return false;
            }
        }
        return true;
    }
}
