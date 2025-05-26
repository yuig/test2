package com.google.protobuf;

import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f33876a;

    /* renamed from: b, reason: collision with root package name */
    public static final i2 f33877b;

    /* renamed from: c, reason: collision with root package name */
    public static final i2 f33878c;

    /* renamed from: d, reason: collision with root package name */
    public static final k2 f33879d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f33876a = cls;
        f33877b = A(false);
        f33878c = A(true);
        f33879d = new k2();
    }

    public static i2 A(boolean z13) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (i2) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z13));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(i2 i2Var, Object obj, Object obj2) {
        ((k2) i2Var).getClass();
        n0 n0Var = (n0) obj;
        j2 j2Var = n0Var.unknownFields;
        j2 j2Var2 = ((n0) obj2).unknownFields;
        j2 j2Var3 = j2.f33911f;
        if (!j2Var3.equals(j2Var2)) {
            if (j2Var3.equals(j2Var)) {
                j2Var = j2.e(j2Var, j2Var2);
            } else {
                j2Var.getClass();
                if (!j2Var2.equals(j2Var3)) {
                    j2Var.a();
                    int i13 = j2Var.f33912a + j2Var2.f33912a;
                    j2Var.b(i13);
                    System.arraycopy(j2Var2.f33913b, 0, j2Var.f33913b, j2Var.f33912a, j2Var2.f33912a);
                    System.arraycopy(j2Var2.f33914c, 0, j2Var.f33914c, j2Var.f33912a, j2Var2.f33912a);
                    j2Var.f33912a = i13;
                }
            }
        }
        n0Var.unknownFields = j2Var;
    }

    public static i2 C() {
        return f33877b;
    }

    public static i2 D() {
        return f33878c;
    }

    public static boolean E(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void F(int i13, List list, rd.j jVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Object obj = jVar.f107506b;
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                ((u) obj).J(i13, ((Boolean) list.get(i14)).booleanValue());
                i14++;
            }
            return;
        }
        u uVar = (u) obj;
        uVar.X(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Boolean) list.get(i16)).getClass();
            Logger logger = u.f34000q;
            i15++;
        }
        uVar.Z(i15);
        while (i14 < list.size()) {
            uVar.I(((Boolean) list.get(i14)).booleanValue() ? (byte) 1 : (byte) 0);
            i14++;
        }
    }

    public static void G(int i13, List list, rd.j jVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jVar.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((u) jVar.f107506b).L(i13, (l) list.get(i14));
        }
    }

    public static void H(int i13, List list, rd.j jVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Object obj = jVar.f107506b;
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                u uVar = (u) obj;
                double doubleValue = ((Double) list.get(i14)).doubleValue();
                uVar.getClass();
                uVar.P(i13, Double.doubleToRawLongBits(doubleValue));
                i14++;
            }
            return;
        }
        u uVar2 = (u) obj;
        uVar2.X(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Double) list.get(i16)).getClass();
            Logger logger = u.f34000q;
            i15 += 8;
        }
        uVar2.Z(i15);
        while (i14 < list.size()) {
            uVar2.Q(Double.doubleToRawLongBits(((Double) list.get(i14)).doubleValue()));
            i14++;
        }
    }

    public static void I(int i13, List list, rd.j jVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Object obj = jVar.f107506b;
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                ((u) obj).R(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        u uVar = (u) obj;
        uVar.X(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += u.t(((Integer) list.get(i16)).intValue());
        }
        uVar.Z(i15);
        while (i14 < list.size()) {
            uVar.S(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void J(int i13, List list, rd.j jVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Object obj = jVar.f107506b;
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                ((u) obj).N(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        u uVar = (u) obj;
        uVar.X(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Integer) list.get(i16)).getClass();
            Logger logger = u.f34000q;
            i15 += 4;
        }
        uVar.Z(i15);
        while (i14 < list.size()) {
            uVar.O(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void K(int i13, List list, rd.j jVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Object obj = jVar.f107506b;
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                ((u) obj).P(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        u uVar = (u) obj;
        uVar.X(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Long) list.get(i16)).getClass();
            Logger logger = u.f34000q;
            i15 += 8;
        }
        uVar.Z(i15);
        while (i14 < list.size()) {
            uVar.Q(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    public static void L(int i13, List list, rd.j jVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Object obj = jVar.f107506b;
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                u uVar = (u) obj;
                float floatValue = ((Float) list.get(i14)).floatValue();
                uVar.getClass();
                uVar.N(i13, Float.floatToRawIntBits(floatValue));
                i14++;
            }
            return;
        }
        u uVar2 = (u) obj;
        uVar2.X(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Float) list.get(i16)).getClass();
            Logger logger = u.f34000q;
            i15 += 4;
        }
        uVar2.Z(i15);
        while (i14 < list.size()) {
            uVar2.O(Float.floatToRawIntBits(((Float) list.get(i14)).floatValue()));
            i14++;
        }
    }

    public static void M(int i13, List list, rd.j jVar, d2 d2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jVar.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            jVar.y(i13, d2Var, list.get(i14));
        }
    }

    public static void N(int i13, List list, rd.j jVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Object obj = jVar.f107506b;
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                ((u) obj).R(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        u uVar = (u) obj;
        uVar.X(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += u.t(((Integer) list.get(i16)).intValue());
        }
        uVar.Z(i15);
        while (i14 < list.size()) {
            uVar.S(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void O(int i13, List list, rd.j jVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Object obj = jVar.f107506b;
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                ((u) obj).a0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        u uVar = (u) obj;
        uVar.X(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += u.F(((Long) list.get(i16)).longValue());
        }
        uVar.Z(i15);
        while (i14 < list.size()) {
            uVar.b0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    public static void P(int i13, List list, rd.j jVar, d2 d2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jVar.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            jVar.B(i13, d2Var, list.get(i14));
        }
    }

    public static void Q(int i13, List list, rd.j jVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Object obj = jVar.f107506b;
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                ((u) obj).N(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        u uVar = (u) obj;
        uVar.X(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Integer) list.get(i16)).getClass();
            Logger logger = u.f34000q;
            i15 += 4;
        }
        uVar.Z(i15);
        while (i14 < list.size()) {
            uVar.O(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void R(int i13, List list, rd.j jVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Object obj = jVar.f107506b;
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                ((u) obj).P(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        u uVar = (u) obj;
        uVar.X(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Long) list.get(i16)).getClass();
            Logger logger = u.f34000q;
            i15 += 8;
        }
        uVar.Z(i15);
        while (i14 < list.size()) {
            uVar.Q(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    public static void S(int i13, List list, rd.j jVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Object obj = jVar.f107506b;
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                int intValue = ((Integer) list.get(i14)).intValue();
                ((u) obj).Y(i13, (intValue >> 31) ^ (intValue << 1));
                i14++;
            }
            return;
        }
        u uVar = (u) obj;
        uVar.X(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            int intValue2 = ((Integer) list.get(i16)).intValue();
            i15 += u.D((intValue2 >> 31) ^ (intValue2 << 1));
        }
        uVar.Z(i15);
        while (i14 < list.size()) {
            int intValue3 = ((Integer) list.get(i14)).intValue();
            uVar.Z((intValue3 >> 31) ^ (intValue3 << 1));
            i14++;
        }
    }

    public static void T(int i13, List list, rd.j jVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Object obj = jVar.f107506b;
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                long longValue = ((Long) list.get(i14)).longValue();
                ((u) obj).a0(i13, (longValue >> 63) ^ (longValue << 1));
                i14++;
            }
            return;
        }
        u uVar = (u) obj;
        uVar.X(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            long longValue2 = ((Long) list.get(i16)).longValue();
            i15 += u.F((longValue2 >> 63) ^ (longValue2 << 1));
        }
        uVar.Z(i15);
        while (i14 < list.size()) {
            long longValue3 = ((Long) list.get(i14)).longValue();
            uVar.b0((longValue3 >> 63) ^ (longValue3 << 1));
            i14++;
        }
    }

    public static void U(int i13, List list, rd.j jVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jVar.getClass();
        boolean z13 = list instanceof z0;
        Object obj = jVar.f107506b;
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                ((u) obj).V(i13, (String) list.get(i14));
                i14++;
            }
            return;
        }
        z0 z0Var = (z0) list;
        while (i14 < list.size()) {
            Object m13 = z0Var.m(i14);
            if (m13 instanceof String) {
                ((u) obj).V(i13, (String) m13);
            } else {
                ((u) obj).L(i13, (l) m13);
            }
            i14++;
        }
    }

    public static void V(int i13, List list, rd.j jVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Object obj = jVar.f107506b;
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                ((u) obj).Y(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        u uVar = (u) obj;
        uVar.X(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += u.D(((Integer) list.get(i16)).intValue());
        }
        uVar.Z(i15);
        while (i14 < list.size()) {
            uVar.Z(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void W(int i13, List list, rd.j jVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Object obj = jVar.f107506b;
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                ((u) obj).a0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        u uVar = (u) obj;
        uVar.X(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += u.F(((Long) list.get(i16)).longValue());
        }
        uVar.Z(i15);
        while (i14 < list.size()) {
            uVar.b0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    public static int a(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u.j(i13) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B = u.B(i13) * size;
        for (int i14 = 0; i14 < list.size(); i14++) {
            B += u.l((l) list.get(i14));
        }
        return B;
    }

    public static int d(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u.B(i13) * size) + e(list);
    }

    public static int e(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0) {
            o0 o0Var = (o0) list;
            i13 = 0;
            while (i14 < size) {
                i13 += u.t(o0Var.i(i14));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += u.t(((Integer) list.get(i14)).intValue());
                i14++;
            }
        }
        return i13;
    }

    public static int f(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u.o(i13) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u.p(i13) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i13, List list, d2 d2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            i14 += u.r(i13, (o1) list.get(i15), d2Var);
        }
        return i14;
    }

    public static int k(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u.B(i13) * size) + l(list);
    }

    public static int l(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0) {
            o0 o0Var = (o0) list;
            i13 = 0;
            while (i14 < size) {
                i13 += u.t(o0Var.i(i14));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += u.t(((Integer) list.get(i14)).intValue());
                i14++;
            }
        }
        return i13;
    }

    public static int m(int i13, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (u.B(i13) * list.size()) + n(list);
    }

    public static int n(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            i13 = 0;
            while (i14 < size) {
                i13 += u.F(d1Var.i(i14));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += u.F(((Long) list.get(i14)).longValue());
                i14++;
            }
        }
        return i13;
    }

    public static int o(int i13, d2 d2Var, Object obj) {
        int B = u.B(i13);
        int serializedSize = ((b) ((o1) obj)).getSerializedSize(d2Var);
        return u.D(serializedSize) + serializedSize + B;
    }

    public static int p(int i13, List list, d2 d2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B = u.B(i13) * size;
        for (int i14 = 0; i14 < size; i14++) {
            int serializedSize = ((b) ((o1) list.get(i14))).getSerializedSize(d2Var);
            B += u.D(serializedSize) + serializedSize;
        }
        return B;
    }

    public static int q(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u.B(i13) * size) + r(list);
    }

    public static int r(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0) {
            o0 o0Var = (o0) list;
            i13 = 0;
            while (i14 < size) {
                int i15 = o0Var.i(i14);
                i13 += u.D((i15 >> 31) ^ (i15 << 1));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                int intValue = ((Integer) list.get(i14)).intValue();
                i13 += u.D((intValue >> 31) ^ (intValue << 1));
                i14++;
            }
        }
        return i13;
    }

    public static int s(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u.B(i13) * size) + t(list);
    }

    public static int t(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            i13 = 0;
            while (i14 < size) {
                long i15 = d1Var.i(i14);
                i13 += u.F((i15 >> 63) ^ (i15 << 1));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                long longValue = ((Long) list.get(i14)).longValue();
                i13 += u.F((longValue >> 63) ^ (longValue << 1));
                i14++;
            }
        }
        return i13;
    }

    public static int u(int i13, List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        int B = u.B(i13) * size;
        if (list instanceof z0) {
            z0 z0Var = (z0) list;
            while (i14 < size) {
                Object m13 = z0Var.m(i14);
                B = (m13 instanceof l ? u.l((l) m13) : u.A((String) m13)) + B;
                i14++;
            }
        } else {
            while (i14 < size) {
                Object obj = list.get(i14);
                B = (obj instanceof l ? u.l((l) obj) : u.A((String) obj)) + B;
                i14++;
            }
        }
        return B;
    }

    public static int v(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u.B(i13) * size) + w(list);
    }

    public static int w(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0) {
            o0 o0Var = (o0) list;
            i13 = 0;
            while (i14 < size) {
                i13 += u.D(o0Var.i(i14));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += u.D(((Integer) list.get(i14)).intValue());
                i14++;
            }
        }
        return i13;
    }

    public static int x(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u.B(i13) * size) + y(list);
    }

    public static int y(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            i13 = 0;
            while (i14 < size) {
                i13 += u.F(d1Var.i(i14));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += u.F(((Long) list.get(i14)).longValue());
                i14++;
            }
        }
        return i13;
    }

    public static Object z(Object obj, int i13, List list, Object obj2, i2 i2Var) {
        return obj2;
    }
}
