package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f18114a;

    /* renamed from: b, reason: collision with root package name */
    public static final w1 f18115b;

    /* renamed from: c, reason: collision with root package name */
    public static final w1 f18116c;

    /* renamed from: d, reason: collision with root package name */
    public static final y1 f18117d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f18114a = cls;
        f18115b = A(false);
        f18116c = A(true);
        f18117d = new y1();
    }

    public static w1 A(boolean z13) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (w1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z13));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(w1 w1Var, Object obj, Object obj2) {
        ((y1) w1Var).getClass();
        g0 g0Var = (g0) obj;
        x1 x1Var = g0Var.unknownFields;
        x1 x1Var2 = ((g0) obj2).unknownFields;
        if (!x1Var2.equals(x1.f18165f)) {
            int i13 = x1Var.f18166a + x1Var2.f18166a;
            int[] copyOf = Arrays.copyOf(x1Var.f18167b, i13);
            System.arraycopy(x1Var2.f18167b, 0, copyOf, x1Var.f18166a, x1Var2.f18166a);
            Object[] copyOf2 = Arrays.copyOf(x1Var.f18168c, i13);
            System.arraycopy(x1Var2.f18168c, 0, copyOf2, x1Var.f18166a, x1Var2.f18166a);
            x1Var = new x1(i13, copyOf, copyOf2, true);
        }
        g0Var.unknownFields = x1Var;
    }

    public static w1 C() {
        return f18115b;
    }

    public static w1 D() {
        return f18116c;
    }

    public static boolean E(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void F(int i13, List list, h1.b bVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            bVar.getClass();
            while (i14 < list.size()) {
                ((q) bVar.f66449b).K(i13, ((Boolean) list.get(i14)).booleanValue());
                i14++;
            }
            return;
        }
        ((q) bVar.f66449b).i0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Boolean) list.get(i16)).getClass();
            Logger logger = q.f18129d;
            i15++;
        }
        ((q) bVar.f66449b).k0(i15);
        while (i14 < list.size()) {
            ((q) bVar.f66449b).J(((Boolean) list.get(i14)).booleanValue() ? (byte) 1 : (byte) 0);
            i14++;
        }
    }

    public static void G(int i13, List list, h1.b bVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bVar.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((q) bVar.f66449b).O(i13, (i) list.get(i14));
        }
    }

    public static void H(int i13, List list, h1.b bVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            bVar.getClass();
            while (i14 < list.size()) {
                q qVar = (q) bVar.f66449b;
                double doubleValue = ((Double) list.get(i14)).doubleValue();
                qVar.getClass();
                qVar.U(i13, Double.doubleToRawLongBits(doubleValue));
                i14++;
            }
            return;
        }
        ((q) bVar.f66449b).i0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Double) list.get(i16)).getClass();
            Logger logger = q.f18129d;
            i15 += 8;
        }
        ((q) bVar.f66449b).k0(i15);
        while (i14 < list.size()) {
            ((q) bVar.f66449b).Q(((Double) list.get(i14)).doubleValue());
            i14++;
        }
    }

    public static void I(int i13, List list, h1.b bVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            bVar.getClass();
            while (i14 < list.size()) {
                ((q) bVar.f66449b).X(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        ((q) bVar.f66449b).i0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += q.s(((Integer) list.get(i16)).intValue());
        }
        ((q) bVar.f66449b).k0(i15);
        while (i14 < list.size()) {
            ((q) bVar.f66449b).Y(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void J(int i13, List list, h1.b bVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            bVar.getClass();
            while (i14 < list.size()) {
                ((q) bVar.f66449b).S(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        ((q) bVar.f66449b).i0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Integer) list.get(i16)).getClass();
            Logger logger = q.f18129d;
            i15 += 4;
        }
        ((q) bVar.f66449b).k0(i15);
        while (i14 < list.size()) {
            ((q) bVar.f66449b).T(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void K(int i13, List list, h1.b bVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            bVar.getClass();
            while (i14 < list.size()) {
                ((q) bVar.f66449b).U(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        ((q) bVar.f66449b).i0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Long) list.get(i16)).getClass();
            Logger logger = q.f18129d;
            i15 += 8;
        }
        ((q) bVar.f66449b).k0(i15);
        while (i14 < list.size()) {
            ((q) bVar.f66449b).V(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    public static void L(int i13, List list, h1.b bVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            bVar.getClass();
            while (i14 < list.size()) {
                q qVar = (q) bVar.f66449b;
                float floatValue = ((Float) list.get(i14)).floatValue();
                qVar.getClass();
                qVar.S(i13, Float.floatToRawIntBits(floatValue));
                i14++;
            }
            return;
        }
        ((q) bVar.f66449b).i0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Float) list.get(i16)).getClass();
            Logger logger = q.f18129d;
            i15 += 4;
        }
        ((q) bVar.f66449b).k0(i15);
        while (i14 < list.size()) {
            ((q) bVar.f66449b).W(((Float) list.get(i14)).floatValue());
            i14++;
        }
    }

    public static void M(int i13, List list, h1.b bVar, n1 n1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bVar.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            bVar.u(i13, n1Var, list.get(i14));
        }
    }

    public static void N(int i13, List list, h1.b bVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            bVar.getClass();
            while (i14 < list.size()) {
                ((q) bVar.f66449b).X(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        ((q) bVar.f66449b).i0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += q.s(((Integer) list.get(i16)).intValue());
        }
        ((q) bVar.f66449b).k0(i15);
        while (i14 < list.size()) {
            ((q) bVar.f66449b).Y(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void O(int i13, List list, h1.b bVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            bVar.getClass();
            while (i14 < list.size()) {
                ((q) bVar.f66449b).l0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        ((q) bVar.f66449b).i0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += q.H(((Long) list.get(i16)).longValue());
        }
        ((q) bVar.f66449b).k0(i15);
        while (i14 < list.size()) {
            ((q) bVar.f66449b).m0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    public static void P(int i13, List list, h1.b bVar, n1 n1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bVar.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            bVar.x(i13, n1Var, list.get(i14));
        }
    }

    public static void Q(int i13, List list, h1.b bVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            bVar.getClass();
            while (i14 < list.size()) {
                ((q) bVar.f66449b).S(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        ((q) bVar.f66449b).i0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Integer) list.get(i16)).getClass();
            Logger logger = q.f18129d;
            i15 += 4;
        }
        ((q) bVar.f66449b).k0(i15);
        while (i14 < list.size()) {
            ((q) bVar.f66449b).T(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void R(int i13, List list, h1.b bVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            bVar.getClass();
            while (i14 < list.size()) {
                ((q) bVar.f66449b).U(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        ((q) bVar.f66449b).i0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Long) list.get(i16)).getClass();
            Logger logger = q.f18129d;
            i15 += 8;
        }
        ((q) bVar.f66449b).k0(i15);
        while (i14 < list.size()) {
            ((q) bVar.f66449b).V(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    public static void S(int i13, List list, h1.b bVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            bVar.getClass();
            while (i14 < list.size()) {
                q qVar = (q) bVar.f66449b;
                int intValue = ((Integer) list.get(i14)).intValue();
                qVar.j0(i13, (intValue >> 31) ^ (intValue << 1));
                i14++;
            }
            return;
        }
        ((q) bVar.f66449b).i0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += q.y(((Integer) list.get(i16)).intValue());
        }
        ((q) bVar.f66449b).k0(i15);
        while (i14 < list.size()) {
            ((q) bVar.f66449b).e0(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void T(int i13, List list, h1.b bVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            bVar.getClass();
            while (i14 < list.size()) {
                q qVar = (q) bVar.f66449b;
                long longValue = ((Long) list.get(i14)).longValue();
                qVar.l0(i13, (longValue >> 63) ^ (longValue << 1));
                i14++;
            }
            return;
        }
        ((q) bVar.f66449b).i0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += q.A(((Long) list.get(i16)).longValue());
        }
        ((q) bVar.f66449b).k0(i15);
        while (i14 < list.size()) {
            ((q) bVar.f66449b).f0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    public static void U(int i13, List list, h1.b bVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bVar.getClass();
        int i14 = 0;
        if (!(list instanceof n0)) {
            while (i14 < list.size()) {
                ((q) bVar.f66449b).g0(i13, (String) list.get(i14));
                i14++;
            }
            return;
        }
        n0 n0Var = (n0) list;
        while (i14 < list.size()) {
            Object m13 = n0Var.m(i14);
            if (m13 instanceof String) {
                ((q) bVar.f66449b).g0(i13, (String) m13);
            } else {
                ((q) bVar.f66449b).O(i13, (i) m13);
            }
            i14++;
        }
    }

    public static void V(int i13, List list, h1.b bVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            bVar.getClass();
            while (i14 < list.size()) {
                ((q) bVar.f66449b).j0(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        ((q) bVar.f66449b).i0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += q.F(((Integer) list.get(i16)).intValue());
        }
        ((q) bVar.f66449b).k0(i15);
        while (i14 < list.size()) {
            ((q) bVar.f66449b).k0(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    public static void W(int i13, List list, h1.b bVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i14 = 0;
        if (!z13) {
            bVar.getClass();
            while (i14 < list.size()) {
                ((q) bVar.f66449b).l0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        ((q) bVar.f66449b).i0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            i15 += q.H(((Long) list.get(i16)).longValue());
        }
        ((q) bVar.f66449b).k0(i15);
        while (i14 < list.size()) {
            ((q) bVar.f66449b).m0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    public static int a(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return q.g(i13) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = q.D(i13) * size;
        for (int i14 = 0; i14 < list.size(); i14++) {
            D += q.j((i) list.get(i14));
        }
        return D;
    }

    public static int d(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q.D(i13) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            i13 += q.s(((Integer) list.get(i14)).intValue());
        }
        return i13;
    }

    public static int f(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return q.n(i13) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return q.o(i13) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i13, List list, n1 n1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            i14 += q.q(i13, (b) list.get(i15), n1Var);
        }
        return i14;
    }

    public static int k(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q.D(i13) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            i13 += q.s(((Integer) list.get(i14)).intValue());
        }
        return i13;
    }

    public static int m(int i13, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (q.D(i13) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof r0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            i13 += q.H(((Long) list.get(i14)).longValue());
        }
        return i13;
    }

    public static int o(int i13, n1 n1Var, Object obj) {
        int D = q.D(i13);
        int b13 = ((b) obj).b(n1Var);
        return q.F(b13) + b13 + D;
    }

    public static int p(int i13, List list, n1 n1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = q.D(i13) * size;
        for (int i14 = 0; i14 < size; i14++) {
            int b13 = ((b) list.get(i14)).b(n1Var);
            D += q.F(b13) + b13;
        }
        return D;
    }

    public static int q(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q.D(i13) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            i13 += q.y(((Integer) list.get(i14)).intValue());
        }
        return i13;
    }

    public static int s(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q.D(i13) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof r0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            i13 += q.A(((Long) list.get(i14)).longValue());
        }
        return i13;
    }

    public static int u(int i13, List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        int D = q.D(i13) * size;
        if (list instanceof n0) {
            n0 n0Var = (n0) list;
            while (i14 < size) {
                Object m13 = n0Var.m(i14);
                D = (m13 instanceof i ? q.j((i) m13) : q.C((String) m13)) + D;
                i14++;
            }
        } else {
            while (i14 < size) {
                Object obj = list.get(i14);
                D = (obj instanceof i ? q.j((i) obj) : q.C((String) obj)) + D;
                i14++;
            }
        }
        return D;
    }

    public static int v(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q.D(i13) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            i13 += q.F(((Integer) list.get(i14)).intValue());
        }
        return i13;
    }

    public static int x(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q.D(i13) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof r0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            i13 += q.H(((Long) list.get(i14)).longValue());
        }
        return i13;
    }

    public static Object z(int i13, List list, Object obj, w1 w1Var) {
        return obj;
    }
}
