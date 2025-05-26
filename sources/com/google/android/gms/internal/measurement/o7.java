package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class o7 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f31571a;

    /* renamed from: b, reason: collision with root package name */
    public static final t7 f31572b;

    /* renamed from: c, reason: collision with root package name */
    public static final t7 f31573c;

    static {
        Class<?> cls;
        Class<?> cls2;
        t7 t7Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f31571a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                t7Var = (t7) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f31572b = t7Var;
        f31573c = new t7();
    }

    public static void A(int i13, List list, bb.p pVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            pVar.getClass();
            while (i14 < list.size()) {
                q5 q5Var = (q5) pVar.f22464b;
                long longValue = ((Long) list.get(i14)).longValue();
                q5Var.s(i13, 1);
                q5Var.e(longValue);
                i14++;
            }
            return;
        }
        ((q5) pVar.f22464b).s(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Long) list.get(i16)).getClass();
            Logger logger = q5.f31596g;
            i15 += 8;
        }
        ((q5) pVar.f22464b).r(i15);
        while (i14 < list.size()) {
            ((q5) pVar.f22464b).e(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    public static int B(int i13, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (q5.E(i13) * list.size()) + C(list);
    }

    public static int C(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r6) {
            r6 r6Var = (r6) list;
            i13 = 0;
            while (i14 < size) {
                r6Var.d(i14);
                i13 += q5.C(r6Var.f31623b[i14]);
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += q5.C(((Long) list.get(i14)).longValue());
                i14++;
            }
        }
        return i13;
    }

    public static void D(int i13, List list, bb.p pVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            pVar.getClass();
            while (i14 < list.size()) {
                q5 q5Var = (q5) pVar.f22464b;
                float floatValue = ((Float) list.get(i14)).floatValue();
                q5Var.getClass();
                int floatToRawIntBits = Float.floatToRawIntBits(floatValue);
                q5Var.s(i13, 5);
                q5Var.d(floatToRawIntBits);
                i14++;
            }
            return;
        }
        ((q5) pVar.f22464b).s(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Float) list.get(i16)).getClass();
            Logger logger = q5.f31596g;
            i15 += 4;
        }
        ((q5) pVar.f22464b).r(i15);
        while (i14 < list.size()) {
            q5 q5Var2 = (q5) pVar.f22464b;
            float floatValue2 = ((Float) list.get(i14)).floatValue();
            q5Var2.getClass();
            q5Var2.d(Float.floatToRawIntBits(floatValue2));
            i14++;
        }
    }

    public static int E(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q5.E(i13) * size) + F(list);
    }

    public static int F(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d6) {
            d6 d6Var = (d6) list;
            i13 = 0;
            while (i14 < size) {
                d6Var.d(i14);
                int i15 = d6Var.f31358b[i14];
                i13 += q5.G((i15 >> 31) ^ (i15 << 1));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                int intValue = ((Integer) list.get(i14)).intValue();
                i13 += q5.G((intValue >> 31) ^ (intValue << 1));
                i14++;
            }
        }
        return i13;
    }

    public static void G(int i13, List list, bb.p pVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (!z13) {
            pVar.getClass();
            for (int i14 = 0; i14 < list.size(); i14++) {
                q5 q5Var = (q5) pVar.f22464b;
                int intValue = ((Integer) list.get(i14)).intValue();
                q5Var.s(i13, 0);
                q5Var.n(intValue);
            }
            return;
        }
        ((q5) pVar.f22464b).s(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += q5.x(((Integer) list.get(i16)).intValue());
        }
        ((q5) pVar.f22464b).r(i15);
        for (int i17 = 0; i17 < list.size(); i17++) {
            ((q5) pVar.f22464b).n(((Integer) list.get(i17)).intValue());
        }
    }

    public static int H(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q5.E(i13) * size) + I(list);
    }

    public static int I(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r6) {
            r6 r6Var = (r6) list;
            i13 = 0;
            while (i14 < size) {
                r6Var.d(i14);
                long j13 = r6Var.f31623b[i14];
                i13 += q5.C((j13 >> 63) ^ (j13 << 1));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                long longValue = ((Long) list.get(i14)).longValue();
                i13 += q5.C((longValue >> 63) ^ (longValue << 1));
                i14++;
            }
        }
        return i13;
    }

    public static void J(int i13, List list, bb.p pVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (!z13) {
            pVar.getClass();
            for (int i14 = 0; i14 < list.size(); i14++) {
                q5 q5Var = (q5) pVar.f22464b;
                long longValue = ((Long) list.get(i14)).longValue();
                q5Var.s(i13, 0);
                q5Var.o(longValue);
            }
            return;
        }
        ((q5) pVar.f22464b).s(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += q5.C(((Long) list.get(i16)).longValue());
        }
        ((q5) pVar.f22464b).r(i15);
        for (int i17 = 0; i17 < list.size(); i17++) {
            ((q5) pVar.f22464b).o(((Long) list.get(i17)).longValue());
        }
    }

    public static int K(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q5.E(i13) * size) + L(list);
    }

    public static int L(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d6) {
            d6 d6Var = (d6) list;
            i13 = 0;
            while (i14 < size) {
                d6Var.d(i14);
                i13 += q5.G(d6Var.f31358b[i14]);
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += q5.G(((Integer) list.get(i14)).intValue());
                i14++;
            }
        }
        return i13;
    }

    public static void M(int i13, List list, bb.p pVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            pVar.getClass();
            while (i14 < list.size()) {
                q5 q5Var = (q5) pVar.f22464b;
                int intValue = ((Integer) list.get(i14)).intValue();
                q5Var.s(i13, 5);
                q5Var.d(intValue);
                i14++;
            }
            return;
        }
        ((q5) pVar.f22464b).s(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Integer) list.get(i16)).getClass();
            Logger logger = q5.f31596g;
            i15 += 4;
        }
        ((q5) pVar.f22464b).r(i15);
        while (i14 < list.size()) {
            ((q5) pVar.f22464b).d(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static int N(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q5.E(i13) * size) + O(list);
    }

    public static int O(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r6) {
            r6 r6Var = (r6) list;
            i13 = 0;
            while (i14 < size) {
                r6Var.d(i14);
                i13 += q5.C(r6Var.f31623b[i14]);
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += q5.C(((Long) list.get(i14)).longValue());
                i14++;
            }
        }
        return i13;
    }

    public static void P(int i13, List list, bb.p pVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            pVar.getClass();
            while (i14 < list.size()) {
                q5 q5Var = (q5) pVar.f22464b;
                long longValue = ((Long) list.get(i14)).longValue();
                q5Var.s(i13, 1);
                q5Var.e(longValue);
                i14++;
            }
            return;
        }
        ((q5) pVar.f22464b).s(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Long) list.get(i16)).getClass();
            Logger logger = q5.f31596g;
            i15 += 8;
        }
        ((q5) pVar.f22464b).r(i15);
        while (i14 < list.size()) {
            ((q5) pVar.f22464b).e(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    public static void Q(int i13, List list, bb.p pVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (!z13) {
            pVar.getClass();
            for (int i14 = 0; i14 < list.size(); i14++) {
                q5 q5Var = (q5) pVar.f22464b;
                int intValue = ((Integer) list.get(i14)).intValue();
                q5Var.s(i13, 0);
                q5Var.r((intValue >> 31) ^ (intValue << 1));
            }
            return;
        }
        ((q5) pVar.f22464b).s(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            int intValue2 = ((Integer) list.get(i16)).intValue();
            i15 += q5.G((intValue2 >> 31) ^ (intValue2 << 1));
        }
        ((q5) pVar.f22464b).r(i15);
        for (int i17 = 0; i17 < list.size(); i17++) {
            q5 q5Var2 = (q5) pVar.f22464b;
            int intValue3 = ((Integer) list.get(i17)).intValue();
            q5Var2.r((intValue3 >> 31) ^ (intValue3 << 1));
        }
    }

    public static void R(int i13, List list, bb.p pVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (!z13) {
            pVar.getClass();
            for (int i14 = 0; i14 < list.size(); i14++) {
                q5 q5Var = (q5) pVar.f22464b;
                long longValue = ((Long) list.get(i14)).longValue();
                q5Var.s(i13, 0);
                q5Var.o((longValue >> 63) ^ (longValue << 1));
            }
            return;
        }
        ((q5) pVar.f22464b).s(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            long longValue2 = ((Long) list.get(i16)).longValue();
            i15 += q5.C((longValue2 >> 63) ^ (longValue2 << 1));
        }
        ((q5) pVar.f22464b).r(i15);
        for (int i17 = 0; i17 < list.size(); i17++) {
            q5 q5Var2 = (q5) pVar.f22464b;
            long longValue3 = ((Long) list.get(i17)).longValue();
            q5Var2.o((longValue3 >> 63) ^ (longValue3 << 1));
        }
    }

    public static void S(int i13, List list, bb.p pVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (!z13) {
            pVar.getClass();
            for (int i14 = 0; i14 < list.size(); i14++) {
                q5 q5Var = (q5) pVar.f22464b;
                int intValue = ((Integer) list.get(i14)).intValue();
                q5Var.s(i13, 0);
                q5Var.r(intValue);
            }
            return;
        }
        ((q5) pVar.f22464b).s(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += q5.G(((Integer) list.get(i16)).intValue());
        }
        ((q5) pVar.f22464b).r(i15);
        for (int i17 = 0; i17 < list.size(); i17++) {
            ((q5) pVar.f22464b).r(((Integer) list.get(i17)).intValue());
        }
    }

    public static void T(int i13, List list, bb.p pVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (!z13) {
            pVar.getClass();
            for (int i14 = 0; i14 < list.size(); i14++) {
                q5 q5Var = (q5) pVar.f22464b;
                long longValue = ((Long) list.get(i14)).longValue();
                q5Var.s(i13, 0);
                q5Var.o(longValue);
            }
            return;
        }
        ((q5) pVar.f22464b).s(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += q5.C(((Long) list.get(i16)).longValue());
        }
        ((q5) pVar.f22464b).r(i15);
        for (int i17 = 0; i17 < list.size(); i17++) {
            ((q5) pVar.f22464b).o(((Long) list.get(i17)).longValue());
        }
    }

    public static int a(int i13, n7 n7Var, Object obj) {
        int G = q5.G(i13 << 3);
        int a13 = ((g5) ((a7) obj)).a(n7Var);
        return q5.G(a13) + a13 + G;
    }

    public static int b(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return q5.j(i13) * size;
    }

    public static int c(int i13, List list, n7 n7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            i14 += q5.k(i13, (a7) list.get(i15), n7Var);
        }
        return i14;
    }

    public static int d(List list) {
        return list.size();
    }

    public static void e(int i13, List list, bb.p pVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pVar.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            q5 q5Var = (q5) pVar.f22464b;
            o5 o5Var = (o5) list.get(i14);
            q5Var.s(i13, 2);
            q5Var.f(o5Var);
        }
    }

    public static void f(int i13, List list, bb.p pVar, n7 n7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pVar.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            pVar.p(i13, n7Var, list.get(i14));
        }
    }

    public static void g(int i13, List list, bb.p pVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (!z13) {
            pVar.getClass();
            for (int i14 = 0; i14 < list.size(); i14++) {
                q5 q5Var = (q5) pVar.f22464b;
                boolean booleanValue = ((Boolean) list.get(i14)).booleanValue();
                q5Var.s(i13, 0);
                q5Var.c(booleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        ((q5) pVar.f22464b).s(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Boolean) list.get(i16)).getClass();
            Logger logger = q5.f31596g;
            i15++;
        }
        ((q5) pVar.f22464b).r(i15);
        for (int i17 = 0; i17 < list.size(); i17++) {
            ((q5) pVar.f22464b).c(((Boolean) list.get(i17)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void h(t7 t7Var, Object obj, Object obj2) {
        t7Var.getClass();
        a6 a6Var = (a6) obj;
        q7 q7Var = a6Var.zzb;
        q7 q7Var2 = ((a6) obj2).zzb;
        q7 q7Var3 = q7.f31604f;
        if (!q7Var3.equals(q7Var2)) {
            if (q7Var3.equals(q7Var)) {
                int i13 = q7Var.f31605a + q7Var2.f31605a;
                int[] copyOf = Arrays.copyOf(q7Var.f31606b, i13);
                System.arraycopy(q7Var2.f31606b, 0, copyOf, q7Var.f31605a, q7Var2.f31605a);
                Object[] copyOf2 = Arrays.copyOf(q7Var.f31607c, i13);
                System.arraycopy(q7Var2.f31607c, 0, copyOf2, q7Var.f31605a, q7Var2.f31605a);
                q7Var = new q7(i13, copyOf, copyOf2, true);
            } else {
                q7Var.getClass();
                if (!q7Var2.equals(q7Var3)) {
                    if (!q7Var.f31609e) {
                        throw new UnsupportedOperationException();
                    }
                    int i14 = q7Var.f31605a + q7Var2.f31605a;
                    q7Var.b(i14);
                    System.arraycopy(q7Var2.f31606b, 0, q7Var.f31606b, q7Var.f31605a, q7Var2.f31605a);
                    System.arraycopy(q7Var2.f31607c, 0, q7Var.f31607c, q7Var.f31605a, q7Var2.f31605a);
                    q7Var.f31605a = i14;
                }
            }
        }
        a6Var.zzb = q7Var;
    }

    public static void i(Object obj, int i13, i6 i6Var, h6 h6Var, t7 t7Var) {
        if (h6Var == null) {
            return;
        }
        boolean z13 = i6Var instanceof RandomAccess;
        q7 q7Var = q7.f31604f;
        q7 q7Var2 = null;
        if (!z13) {
            Iterator it = i6Var.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!h6Var.zza(intValue)) {
                    if (q7Var2 == null) {
                        t7Var.getClass();
                        a6 a6Var = (a6) obj;
                        q7 q7Var3 = a6Var.zzb;
                        if (q7Var3 == q7Var) {
                            q7Var3 = q7.f();
                            a6Var.zzb = q7Var3;
                        }
                        q7Var2 = q7Var3;
                    }
                    t7Var.getClass();
                    q7Var2.c(i13 << 3, Long.valueOf(intValue));
                    it.remove();
                }
            }
            return;
        }
        int size = i6Var.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            Integer num = (Integer) i6Var.get(i15);
            int intValue2 = num.intValue();
            if (h6Var.zza(intValue2)) {
                if (i15 != i14) {
                    i6Var.set(i14, num);
                }
                i14++;
            } else {
                if (q7Var2 == null) {
                    t7Var.getClass();
                    a6 a6Var2 = (a6) obj;
                    q7 q7Var4 = a6Var2.zzb;
                    if (q7Var4 == q7Var) {
                        q7Var4 = q7.f();
                        a6Var2.zzb = q7Var4;
                    }
                    q7Var2 = q7Var4;
                }
                t7Var.getClass();
                q7Var2.c(i13 << 3, Long.valueOf(intValue2));
            }
        }
        if (i14 != size) {
            i6Var.subList(i14, size).clear();
        }
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int k(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int E = q5.E(i13) * size;
        for (int i14 = 0; i14 < list.size(); i14++) {
            int j13 = ((o5) list.get(i14)).j();
            E += q5.G(j13) + j13;
        }
        return E;
    }

    public static int l(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q5.E(i13) * size) + n(list);
    }

    public static int m(int i13, List list, n7 n7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int E = q5.E(i13) * size;
        for (int i14 = 0; i14 < size; i14++) {
            int a13 = ((g5) ((a7) list.get(i14))).a(n7Var);
            E += q5.G(a13) + a13;
        }
        return E;
    }

    public static int n(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d6) {
            d6 d6Var = (d6) list;
            i13 = 0;
            while (i14 < size) {
                d6Var.d(i14);
                i13 += q5.x(d6Var.f31358b[i14]);
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += q5.x(((Integer) list.get(i14)).intValue());
                i14++;
            }
        }
        return i13;
    }

    public static void o(int i13, List list, bb.p pVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pVar.getClass();
        int i14 = 0;
        if (!(list instanceof l6)) {
            while (i14 < list.size()) {
                q5 q5Var = (q5) pVar.f22464b;
                String str = (String) list.get(i14);
                q5Var.s(i13, 2);
                q5Var.g(str);
                i14++;
            }
            return;
        }
        l6 l6Var = (l6) list;
        while (i14 < list.size()) {
            Object o13 = l6Var.o(i14);
            if (o13 instanceof String) {
                q5 q5Var2 = (q5) pVar.f22464b;
                q5Var2.s(i13, 2);
                q5Var2.g((String) o13);
            } else {
                q5 q5Var3 = (q5) pVar.f22464b;
                q5Var3.s(i13, 2);
                q5Var3.f((o5) o13);
            }
            i14++;
        }
    }

    public static void p(int i13, List list, bb.p pVar, n7 n7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pVar.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            pVar.w(i13, n7Var, list.get(i14));
        }
    }

    public static void q(int i13, List list, bb.p pVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            pVar.getClass();
            while (i14 < list.size()) {
                q5 q5Var = (q5) pVar.f22464b;
                double doubleValue = ((Double) list.get(i14)).doubleValue();
                q5Var.getClass();
                long doubleToRawLongBits = Double.doubleToRawLongBits(doubleValue);
                q5Var.s(i13, 1);
                q5Var.e(doubleToRawLongBits);
                i14++;
            }
            return;
        }
        ((q5) pVar.f22464b).s(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Double) list.get(i16)).getClass();
            Logger logger = q5.f31596g;
            i15 += 8;
        }
        ((q5) pVar.f22464b).r(i15);
        while (i14 < list.size()) {
            q5 q5Var2 = (q5) pVar.f22464b;
            double doubleValue2 = ((Double) list.get(i14)).doubleValue();
            q5Var2.getClass();
            q5Var2.e(Double.doubleToRawLongBits(doubleValue2));
            i14++;
        }
    }

    public static int r(int i13, List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        int E = q5.E(i13) * size;
        if (list instanceof l6) {
            l6 l6Var = (l6) list;
            while (i14 < size) {
                Object o13 = l6Var.o(i14);
                if (o13 instanceof o5) {
                    int j13 = ((o5) o13).j();
                    E = q5.G(j13) + j13 + E;
                } else {
                    E = q5.m((String) o13) + E;
                }
                i14++;
            }
        } else {
            while (i14 < size) {
                Object obj = list.get(i14);
                if (obj instanceof o5) {
                    int j14 = ((o5) obj).j();
                    E = q5.G(j14) + j14 + E;
                } else {
                    E = q5.m((String) obj) + E;
                }
                i14++;
            }
        }
        return E;
    }

    public static int s(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return q5.z(i13) * size;
    }

    public static int t(List list) {
        return list.size() << 2;
    }

    public static void u(int i13, List list, bb.p pVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (!z13) {
            pVar.getClass();
            for (int i14 = 0; i14 < list.size(); i14++) {
                q5 q5Var = (q5) pVar.f22464b;
                int intValue = ((Integer) list.get(i14)).intValue();
                q5Var.s(i13, 0);
                q5Var.n(intValue);
            }
            return;
        }
        ((q5) pVar.f22464b).s(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += q5.x(((Integer) list.get(i16)).intValue());
        }
        ((q5) pVar.f22464b).r(i15);
        for (int i17 = 0; i17 < list.size(); i17++) {
            ((q5) pVar.f22464b).n(((Integer) list.get(i17)).intValue());
        }
    }

    public static int v(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return q5.p(i13) * size;
    }

    public static int w(List list) {
        return list.size() << 3;
    }

    public static void x(int i13, List list, bb.p pVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            pVar.getClass();
            while (i14 < list.size()) {
                q5 q5Var = (q5) pVar.f22464b;
                int intValue = ((Integer) list.get(i14)).intValue();
                q5Var.s(i13, 5);
                q5Var.d(intValue);
                i14++;
            }
            return;
        }
        ((q5) pVar.f22464b).s(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Integer) list.get(i16)).getClass();
            Logger logger = q5.f31596g;
            i15 += 4;
        }
        ((q5) pVar.f22464b).r(i15);
        while (i14 < list.size()) {
            ((q5) pVar.f22464b).d(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static int y(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q5.E(i13) * size) + z(list);
    }

    public static int z(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d6) {
            d6 d6Var = (d6) list;
            i13 = 0;
            while (i14 < size) {
                d6Var.d(i14);
                i13 += q5.x(d6Var.f31358b[i14]);
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += q5.x(((Integer) list.get(i14)).intValue());
                i14++;
            }
        }
        return i13;
    }
}
