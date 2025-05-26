package v;

import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f123609a = new androidx.camera.core.impl.c(Long.TYPE, null, "camera2.streamSpec.streamUseCase");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f123610b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f123611c;

    static {
        HashMap hashMap = new HashMap();
        f123610b = hashMap;
        HashMap hashMap2 = new HashMap();
        f123611c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            androidx.camera.core.impl.b3 b3Var = androidx.camera.core.impl.b3.PREVIEW;
            hashSet.add(b3Var);
            androidx.camera.core.impl.b3 b3Var2 = androidx.camera.core.impl.b3.METERING_REPEATING;
            hashSet.add(b3Var2);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(b3Var);
            hashSet2.add(b3Var2);
            hashSet2.add(androidx.camera.core.impl.b3.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            androidx.camera.core.impl.b3 b3Var3 = androidx.camera.core.impl.b3.IMAGE_CAPTURE;
            hashSet3.add(b3Var3);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            androidx.camera.core.impl.b3 b3Var4 = androidx.camera.core.impl.b3.VIDEO_CAPTURE;
            hashSet4.add(b3Var4);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(b3Var);
            hashSet5.add(b3Var3);
            hashSet5.add(b3Var4);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(b3Var);
            hashSet6.add(b3Var4);
            hashMap2.put(3L, hashSet6);
        }
    }

    public static u.b a(androidx.camera.core.impl.v0 v0Var, long j13) {
        androidx.camera.core.impl.c cVar = f123609a;
        if (v0Var.d(cVar) && ((Long) v0Var.f(cVar)).longValue() == j13) {
            return null;
        }
        androidx.camera.core.impl.q1 k13 = androidx.camera.core.impl.q1.k(v0Var);
        k13.s(cVar, Long.valueOf(j13));
        return new u.b(k13);
    }

    public static boolean b(androidx.camera.core.impl.b3 b3Var, long j13, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (b3Var != androidx.camera.core.impl.b3.STREAM_SHARING) {
            HashMap hashMap = f123610b;
            return hashMap.containsKey(Long.valueOf(j13)) && ((Set) hashMap.get(Long.valueOf(j13))).contains(b3Var);
        }
        HashMap hashMap2 = f123611c;
        if (!hashMap2.containsKey(Long.valueOf(j13))) {
            return false;
        }
        Set set = (Set) hashMap2.get(Long.valueOf(j13));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((androidx.camera.core.impl.b3) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(androidx.camera.core.impl.v0 v0Var, androidx.camera.core.impl.b3 b3Var) {
        if (((Boolean) v0Var.j(androidx.camera.core.impl.z2.f17022tn, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        androidx.camera.core.impl.c cVar = androidx.camera.core.impl.h1.f16850b;
        if (v0Var.d(cVar)) {
            return x2.f123743a[b3Var.ordinal()] == 1 && ((Integer) v0Var.f(cVar)).intValue() == 2;
        }
        return false;
    }
}
