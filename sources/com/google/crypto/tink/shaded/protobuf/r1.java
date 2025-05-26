package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;
import oi.u6;

/* loaded from: classes3.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f33688a;

    /* renamed from: b, reason: collision with root package name */
    public static final v1 f33689b;

    /* renamed from: c, reason: collision with root package name */
    public static final x1 f33690c;

    static {
        Class<?> cls;
        Class<?> cls2;
        v1 v1Var = null;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f33688a = cls;
        try {
            cls2 = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                v1Var = (v1) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f33689b = v1Var;
        f33690c = new x1();
    }

    public static void A(v1 v1Var, Object obj, Object obj2) {
        ((x1) v1Var).getClass();
        f0 f0Var = (f0) obj;
        w1 w1Var = f0Var.unknownFields;
        w1 w1Var2 = ((f0) obj2).unknownFields;
        w1 w1Var3 = w1.f33704f;
        if (!w1Var3.equals(w1Var2)) {
            if (w1Var3.equals(w1Var)) {
                int i13 = w1Var.f33705a + w1Var2.f33705a;
                int[] copyOf = Arrays.copyOf(w1Var.f33706b, i13);
                System.arraycopy(w1Var2.f33706b, 0, copyOf, w1Var.f33705a, w1Var2.f33705a);
                Object[] copyOf2 = Arrays.copyOf(w1Var.f33707c, i13);
                System.arraycopy(w1Var2.f33707c, 0, copyOf2, w1Var.f33705a, w1Var2.f33705a);
                w1Var = new w1(i13, copyOf, copyOf2, true);
            } else {
                w1Var.getClass();
                if (!w1Var2.equals(w1Var3)) {
                    if (!w1Var.f33709e) {
                        throw new UnsupportedOperationException();
                    }
                    int i14 = w1Var.f33705a + w1Var2.f33705a;
                    w1Var.a(i14);
                    System.arraycopy(w1Var2.f33706b, 0, w1Var.f33706b, w1Var.f33705a, w1Var2.f33705a);
                    System.arraycopy(w1Var2.f33707c, 0, w1Var.f33707c, w1Var.f33705a, w1Var2.f33705a);
                    w1Var.f33705a = i14;
                }
            }
        }
        f0Var.unknownFields = w1Var;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Object C(Object obj, int i13, int i14, Object obj2, v1 v1Var) {
        if (obj2 == null) {
            obj2 = v1Var.a(obj);
        }
        ((x1) v1Var).getClass();
        ((w1) obj2).d(i13 << 3, Long.valueOf(i14));
        return obj2;
    }

    public static void D(int i13, List list, u6 u6Var, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            u6Var.getClass();
            while (i14 < list.size()) {
                ((r) u6Var.f95225b).s0(i13, ((Boolean) list.get(i14)).booleanValue());
                i14++;
            }
            return;
        }
        ((r) u6Var.f95225b).C0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Boolean) list.get(i16)).getClass();
            Logger logger = r.f33683c;
            i15++;
        }
        ((r) u6Var.f95225b).E0(i15);
        while (i14 < list.size()) {
            ((r) u6Var.f95225b).r0(((Boolean) list.get(i14)).booleanValue() ? (byte) 1 : (byte) 0);
            i14++;
        }
    }

    public static void E(int i13, List list, u6 u6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u6Var.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((r) u6Var.f95225b).t0(i13, (k) list.get(i14));
        }
    }

    public static void F(int i13, List list, u6 u6Var, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            u6Var.getClass();
            while (i14 < list.size()) {
                r rVar = (r) u6Var.f95225b;
                double doubleValue = ((Double) list.get(i14)).doubleValue();
                rVar.getClass();
                rVar.w0(i13, Double.doubleToRawLongBits(doubleValue));
                i14++;
            }
            return;
        }
        ((r) u6Var.f95225b).C0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Double) list.get(i16)).getClass();
            Logger logger = r.f33683c;
            i15 += 8;
        }
        ((r) u6Var.f95225b).E0(i15);
        while (i14 < list.size()) {
            r rVar2 = (r) u6Var.f95225b;
            double doubleValue2 = ((Double) list.get(i14)).doubleValue();
            rVar2.getClass();
            rVar2.x0(Double.doubleToRawLongBits(doubleValue2));
            i14++;
        }
    }

    public static void G(int i13, List list, u6 u6Var, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            u6Var.getClass();
            while (i14 < list.size()) {
                ((r) u6Var.f95225b).y0(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        ((r) u6Var.f95225b).C0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += r.a0(((Integer) list.get(i16)).intValue());
        }
        ((r) u6Var.f95225b).E0(i15);
        while (i14 < list.size()) {
            ((r) u6Var.f95225b).z0(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void H(int i13, List list, u6 u6Var, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            u6Var.getClass();
            while (i14 < list.size()) {
                ((r) u6Var.f95225b).u0(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        ((r) u6Var.f95225b).C0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Integer) list.get(i16)).getClass();
            Logger logger = r.f33683c;
            i15 += 4;
        }
        ((r) u6Var.f95225b).E0(i15);
        while (i14 < list.size()) {
            ((r) u6Var.f95225b).v0(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void I(int i13, List list, u6 u6Var, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            u6Var.getClass();
            while (i14 < list.size()) {
                ((r) u6Var.f95225b).w0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        ((r) u6Var.f95225b).C0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Long) list.get(i16)).getClass();
            Logger logger = r.f33683c;
            i15 += 8;
        }
        ((r) u6Var.f95225b).E0(i15);
        while (i14 < list.size()) {
            ((r) u6Var.f95225b).x0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    public static void J(int i13, List list, u6 u6Var, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            u6Var.getClass();
            while (i14 < list.size()) {
                r rVar = (r) u6Var.f95225b;
                float floatValue = ((Float) list.get(i14)).floatValue();
                rVar.getClass();
                rVar.u0(i13, Float.floatToRawIntBits(floatValue));
                i14++;
            }
            return;
        }
        ((r) u6Var.f95225b).C0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Float) list.get(i16)).getClass();
            Logger logger = r.f33683c;
            i15 += 4;
        }
        ((r) u6Var.f95225b).E0(i15);
        while (i14 < list.size()) {
            r rVar2 = (r) u6Var.f95225b;
            float floatValue2 = ((Float) list.get(i14)).floatValue();
            rVar2.getClass();
            rVar2.v0(Float.floatToRawIntBits(floatValue2));
            i14++;
        }
    }

    public static void K(int i13, List list, u6 u6Var, q1 q1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u6Var.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            u6Var.v(i13, q1Var, list.get(i14));
        }
    }

    public static void L(int i13, List list, u6 u6Var, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            u6Var.getClass();
            while (i14 < list.size()) {
                ((r) u6Var.f95225b).y0(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        ((r) u6Var.f95225b).C0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += r.a0(((Integer) list.get(i16)).intValue());
        }
        ((r) u6Var.f95225b).E0(i15);
        while (i14 < list.size()) {
            ((r) u6Var.f95225b).z0(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void M(int i13, List list, u6 u6Var, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            u6Var.getClass();
            while (i14 < list.size()) {
                ((r) u6Var.f95225b).F0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        ((r) u6Var.f95225b).C0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += r.n0(((Long) list.get(i16)).longValue());
        }
        ((r) u6Var.f95225b).E0(i15);
        while (i14 < list.size()) {
            ((r) u6Var.f95225b).G0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    public static void N(int i13, List list, u6 u6Var, q1 q1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u6Var.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            u6Var.z(i13, q1Var, list.get(i14));
        }
    }

    public static void O(int i13, List list, u6 u6Var, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            u6Var.getClass();
            while (i14 < list.size()) {
                ((r) u6Var.f95225b).u0(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        ((r) u6Var.f95225b).C0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Integer) list.get(i16)).getClass();
            Logger logger = r.f33683c;
            i15 += 4;
        }
        ((r) u6Var.f95225b).E0(i15);
        while (i14 < list.size()) {
            ((r) u6Var.f95225b).v0(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void P(int i13, List list, u6 u6Var, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            u6Var.getClass();
            while (i14 < list.size()) {
                ((r) u6Var.f95225b).w0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        ((r) u6Var.f95225b).C0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Long) list.get(i16)).getClass();
            Logger logger = r.f33683c;
            i15 += 8;
        }
        ((r) u6Var.f95225b).E0(i15);
        while (i14 < list.size()) {
            ((r) u6Var.f95225b).x0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    public static void Q(int i13, List list, u6 u6Var, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            u6Var.getClass();
            while (i14 < list.size()) {
                r rVar = (r) u6Var.f95225b;
                int intValue = ((Integer) list.get(i14)).intValue();
                rVar.D0(i13, (intValue >> 31) ^ (intValue << 1));
                i14++;
            }
            return;
        }
        ((r) u6Var.f95225b).C0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            int intValue2 = ((Integer) list.get(i16)).intValue();
            i15 += r.l0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        ((r) u6Var.f95225b).E0(i15);
        while (i14 < list.size()) {
            r rVar2 = (r) u6Var.f95225b;
            int intValue3 = ((Integer) list.get(i14)).intValue();
            rVar2.E0((intValue3 >> 31) ^ (intValue3 << 1));
            i14++;
        }
    }

    public static void R(int i13, List list, u6 u6Var, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            u6Var.getClass();
            while (i14 < list.size()) {
                r rVar = (r) u6Var.f95225b;
                long longValue = ((Long) list.get(i14)).longValue();
                rVar.F0(i13, (longValue >> 63) ^ (longValue << 1));
                i14++;
            }
            return;
        }
        ((r) u6Var.f95225b).C0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            long longValue2 = ((Long) list.get(i16)).longValue();
            i15 += r.n0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        ((r) u6Var.f95225b).E0(i15);
        while (i14 < list.size()) {
            r rVar2 = (r) u6Var.f95225b;
            long longValue3 = ((Long) list.get(i14)).longValue();
            rVar2.G0((longValue3 >> 63) ^ (longValue3 << 1));
            i14++;
        }
    }

    public static void S(int i13, List list, u6 u6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u6Var.getClass();
        int i14 = 0;
        if (!(list instanceof o0)) {
            while (i14 < list.size()) {
                ((r) u6Var.f95225b).B0(i13, (String) list.get(i14));
                i14++;
            }
            return;
        }
        o0 o0Var = (o0) list;
        while (i14 < list.size()) {
            Object m13 = o0Var.m(i14);
            if (m13 instanceof String) {
                ((r) u6Var.f95225b).B0(i13, (String) m13);
            } else {
                ((r) u6Var.f95225b).t0(i13, (k) m13);
            }
            i14++;
        }
    }

    public static void T(int i13, List list, u6 u6Var, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            u6Var.getClass();
            while (i14 < list.size()) {
                ((r) u6Var.f95225b).D0(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        ((r) u6Var.f95225b).C0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += r.l0(((Integer) list.get(i16)).intValue());
        }
        ((r) u6Var.f95225b).E0(i15);
        while (i14 < list.size()) {
            ((r) u6Var.f95225b).E0(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void U(int i13, List list, u6 u6Var, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            u6Var.getClass();
            while (i14 < list.size()) {
                ((r) u6Var.f95225b).F0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        ((r) u6Var.f95225b).C0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += r.n0(((Long) list.get(i16)).longValue());
        }
        ((r) u6Var.f95225b).E0(i15);
        while (i14 < list.size()) {
            ((r) u6Var.f95225b).G0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    public static int a(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return r.Q(i13) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int j03 = r.j0(i13) * size;
        for (int i14 = 0; i14 < list.size(); i14++) {
            j03 += r.S((k) list.get(i14));
        }
        return j03;
    }

    public static int d(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r.j0(i13) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g0)) {
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                i13 += r.a0(((Integer) list.get(i14)).intValue());
            }
            return i13;
        }
        g0 g0Var = (g0) list;
        if (size <= 0) {
            return 0;
        }
        g0Var.e(0);
        g0Var.getClass();
        throw null;
    }

    public static int f(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return r.V(i13) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return r.W(i13) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i13, List list, q1 q1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            i14 += r.Y(i13, (b) list.get(i15), q1Var);
        }
        return i14;
    }

    public static int k(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r.j0(i13) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g0)) {
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                i13 += r.a0(((Integer) list.get(i14)).intValue());
            }
            return i13;
        }
        g0 g0Var = (g0) list;
        if (size <= 0) {
            return 0;
        }
        g0Var.e(0);
        g0Var.getClass();
        throw null;
    }

    public static int m(int i13, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (r.j0(i13) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof s0)) {
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                i13 += r.n0(((Long) list.get(i14)).longValue());
            }
            return i13;
        }
        s0 s0Var = (s0) list;
        if (size <= 0) {
            return 0;
        }
        s0Var.e(0);
        s0Var.getClass();
        throw null;
    }

    public static int o(int i13, q1 q1Var, Object obj) {
        int j03 = r.j0(i13);
        int a13 = ((b) obj).a(q1Var);
        return r.l0(a13) + a13 + j03;
    }

    public static int p(int i13, List list, q1 q1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int j03 = r.j0(i13) * size;
        for (int i14 = 0; i14 < size; i14++) {
            int a13 = ((b) list.get(i14)).a(q1Var);
            j03 += r.l0(a13) + a13;
        }
        return j03;
    }

    public static int q(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r.j0(i13) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            if (size <= 0) {
                return 0;
            }
            g0Var.e(0);
            g0Var.getClass();
            throw null;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            int intValue = ((Integer) list.get(i14)).intValue();
            i13 += r.l0((intValue >> 31) ^ (intValue << 1));
        }
        return i13;
    }

    public static int s(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r.j0(i13) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof s0) {
            s0 s0Var = (s0) list;
            if (size <= 0) {
                return 0;
            }
            s0Var.e(0);
            s0Var.getClass();
            throw null;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            long longValue = ((Long) list.get(i14)).longValue();
            i13 += r.n0((longValue >> 63) ^ (longValue << 1));
        }
        return i13;
    }

    public static int u(int i13, List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        int j03 = r.j0(i13) * size;
        if (list instanceof o0) {
            o0 o0Var = (o0) list;
            while (i14 < size) {
                Object m13 = o0Var.m(i14);
                j03 = (m13 instanceof k ? r.S((k) m13) : r.i0((String) m13)) + j03;
                i14++;
            }
        } else {
            while (i14 < size) {
                Object obj = list.get(i14);
                j03 = (obj instanceof k ? r.S((k) obj) : r.i0((String) obj)) + j03;
                i14++;
            }
        }
        return j03;
    }

    public static int v(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r.j0(i13) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g0)) {
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                i13 += r.l0(((Integer) list.get(i14)).intValue());
            }
            return i13;
        }
        g0 g0Var = (g0) list;
        if (size <= 0) {
            return 0;
        }
        g0Var.e(0);
        g0Var.getClass();
        throw null;
    }

    public static int x(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r.j0(i13) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof s0)) {
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                i13 += r.n0(((Long) list.get(i14)).longValue());
            }
            return i13;
        }
        s0 s0Var = (s0) list;
        if (size <= 0) {
            return 0;
        }
        s0Var.e(0);
        s0Var.getClass();
        throw null;
    }

    public static Object z(Object obj, int i13, List list, j0 j0Var, Object obj2, v1 v1Var) {
        if (j0Var == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                Integer num = (Integer) list.get(i15);
                int intValue = num.intValue();
                if (j0Var.a(intValue)) {
                    if (i15 != i14) {
                        list.set(i14, num);
                    }
                    i14++;
                } else {
                    obj2 = C(obj, i13, intValue, obj2, v1Var);
                }
            }
            if (i14 != size) {
                list.subList(i14, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!j0Var.a(intValue2)) {
                    obj2 = C(obj, i13, intValue2, obj2, v1Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}
