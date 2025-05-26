package androidx.datastore.preferences.protobuf;

import a.cb;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class c1 implements n1 {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f18037o = new int[0];

    /* renamed from: p, reason: collision with root package name */
    public static final Unsafe f18038p = h2.m();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f18039a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f18040b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18041c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18042d;

    /* renamed from: e, reason: collision with root package name */
    public final b f18043e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18044f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18045g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f18046h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18047i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18048j;

    /* renamed from: k, reason: collision with root package name */
    public final e1 f18049k;

    /* renamed from: l, reason: collision with root package name */
    public final q0 f18050l;

    /* renamed from: m, reason: collision with root package name */
    public final w1 f18051m;

    /* renamed from: n, reason: collision with root package name */
    public final x0 f18052n;

    public c1(int[] iArr, Object[] objArr, int i13, int i14, b bVar, boolean z13, int[] iArr2, int i15, int i16, e1 e1Var, q0 q0Var, w1 w1Var, u uVar, x0 x0Var) {
        this.f18039a = iArr;
        this.f18040b = objArr;
        this.f18041c = i13;
        this.f18042d = i14;
        this.f18044f = bVar instanceof g0;
        this.f18045g = z13;
        this.f18046h = iArr2;
        this.f18047i = i15;
        this.f18048j = i16;
        this.f18049k = e1Var;
        this.f18050l = q0Var;
        this.f18051m = w1Var;
        this.f18043e = bVar;
        this.f18052n = x0Var;
    }

    public static int A(long j13, Object obj) {
        return ((Integer) h2.f18070d.i(j13, obj)).intValue();
    }

    public static long B(long j13, Object obj) {
        return ((Long) h2.f18070d.i(j13, obj)).longValue();
    }

    public static Field H(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder o13 = cb.o("Field ", str, " for ");
            o13.append(cls.getName());
            o13.append(" not found. Known fields are ");
            o13.append(Arrays.toString(declaredFields));
            throw new RuntimeException(o13.toString());
        }
    }

    public static int K(int i13) {
        return (i13 & 267386880) >>> 20;
    }

    public static void O(int i13, Object obj, h1.b bVar) {
        if (!(obj instanceof String)) {
            bVar.o(i13, (i) obj);
        } else {
            ((q) bVar.f66449b).g0(i13, (String) obj);
        }
    }

    public static List s(long j13, Object obj) {
        return (List) h2.f18070d.i(j13, obj);
    }

    public static c1 x(z0 z0Var, e1 e1Var, q0 q0Var, w1 w1Var, u uVar, x0 x0Var) {
        if (z0Var instanceof l1) {
            return y((l1) z0Var, e1Var, q0Var, w1Var, uVar, x0Var);
        }
        ep.b.A(z0Var);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.datastore.preferences.protobuf.c1 y(androidx.datastore.preferences.protobuf.l1 r34, androidx.datastore.preferences.protobuf.e1 r35, androidx.datastore.preferences.protobuf.q0 r36, androidx.datastore.preferences.protobuf.w1 r37, androidx.datastore.preferences.protobuf.u r38, androidx.datastore.preferences.protobuf.x0 r39) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.c1.y(androidx.datastore.preferences.protobuf.l1, androidx.datastore.preferences.protobuf.e1, androidx.datastore.preferences.protobuf.q0, androidx.datastore.preferences.protobuf.w1, androidx.datastore.preferences.protobuf.u, androidx.datastore.preferences.protobuf.x0):androidx.datastore.preferences.protobuf.c1");
    }

    public static long z(int i13) {
        return i13 & 1048575;
    }

    public final int C(int i13) {
        if (i13 < this.f18041c || i13 > this.f18042d) {
            return -1;
        }
        int[] iArr = this.f18039a;
        int length = (iArr.length / 3) - 1;
        int i14 = 0;
        while (i14 <= length) {
            int i15 = (length + i14) >>> 1;
            int i16 = i15 * 3;
            int i17 = iArr[i16];
            if (i13 == i17) {
                return i16;
            }
            if (i13 < i17) {
                length = i15 - 1;
            } else {
                i14 = i15 + 1;
            }
        }
        return -1;
    }

    public final void D(Object obj, long j13, m1 m1Var, n1 n1Var, t tVar) {
        m1Var.H(this.f18050l.c(j13, obj), n1Var, tVar);
    }

    public final void E(Object obj, int i13, m1 m1Var, n1 n1Var, t tVar) {
        m1Var.s(this.f18050l.c(i13 & 1048575, obj), n1Var, tVar);
    }

    public final void F(Object obj, int i13, m1 m1Var) {
        if ((536870912 & i13) != 0) {
            h2.s(i13 & 1048575, obj, m1Var.M());
        } else if (this.f18044f) {
            h2.s(i13 & 1048575, obj, m1Var.D());
        } else {
            h2.s(i13 & 1048575, obj, m1Var.q());
        }
    }

    public final void G(Object obj, int i13, m1 m1Var) {
        boolean z13 = (536870912 & i13) != 0;
        q0 q0Var = this.f18050l;
        if (z13) {
            m1Var.p(q0Var.c(i13 & 1048575, obj));
        } else {
            m1Var.F(q0Var.c(i13 & 1048575, obj));
        }
    }

    public final void I(int i13, Object obj) {
        if (this.f18045g) {
            return;
        }
        int i14 = this.f18039a[i13 + 2];
        long j13 = i14 & 1048575;
        h2.q(h2.f18070d.g(j13, obj) | (1 << (i14 >>> 20)), j13, obj);
    }

    public final void J(int i13, Object obj, int i14) {
        h2.q(i13, this.f18039a[i14 + 2] & 1048575, obj);
    }

    public final int L(int i13) {
        return this.f18039a[i13 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, h1.b bVar) {
        int i13;
        boolean z13;
        int[] iArr = this.f18039a;
        int length = iArr.length;
        int i14 = -1;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16 += 3) {
            int L = L(i16);
            int i17 = iArr[i16];
            int K = K(L);
            boolean z14 = this.f18045g;
            Unsafe unsafe = f18038p;
            if (z14 || K > 17) {
                i13 = 0;
            } else {
                int i18 = iArr[i16 + 2];
                int i19 = i18 & 1048575;
                if (i19 != i14) {
                    i15 = unsafe.getInt(obj, i19);
                    i14 = i19;
                }
                i13 = 1 << (i18 >>> 20);
            }
            long j13 = L & 1048575;
            switch (K) {
                case 0:
                    if ((i13 & i15) != 0) {
                        bVar.p(i17, h2.f18070d.e(j13, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i13 & i15) != 0) {
                        bVar.t(i17, h2.f18070d.f(j13, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i13 & i15) != 0) {
                        bVar.w(i17, unsafe.getLong(obj, j13));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i13 & i15) != 0) {
                        bVar.D(i17, unsafe.getLong(obj, j13));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i13 & i15) != 0) {
                        bVar.v(i17, unsafe.getInt(obj, j13));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i13 & i15) != 0) {
                        bVar.s(i17, unsafe.getLong(obj, j13));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i13 & i15) != 0) {
                        bVar.r(i17, unsafe.getInt(obj, j13));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i13 & i15) != 0) {
                        bVar.n(i17, h2.f18070d.c(j13, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i13 & i15) != 0) {
                        O(i17, unsafe.getObject(obj, j13), bVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i13 & i15) != 0) {
                        bVar.x(i17, n(i16), unsafe.getObject(obj, j13));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i13 & i15) != 0) {
                        bVar.o(i17, (i) unsafe.getObject(obj, j13));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i13 & i15) != 0) {
                        bVar.C(i17, unsafe.getInt(obj, j13));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i13 & i15) != 0) {
                        bVar.q(i17, unsafe.getInt(obj, j13));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i13 & i15) != 0) {
                        bVar.y(i17, unsafe.getInt(obj, j13));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i13 & i15) != 0) {
                        bVar.z(i17, unsafe.getLong(obj, j13));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i13 & i15) != 0) {
                        bVar.A(i17, unsafe.getInt(obj, j13));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i13 & i15) != 0) {
                        bVar.B(i17, unsafe.getLong(obj, j13));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i13 & i15) != 0) {
                        bVar.u(i17, n(i16), unsafe.getObject(obj, j13));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    o1.H(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, false);
                    break;
                case 19:
                    o1.L(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, false);
                    break;
                case 20:
                    o1.O(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, false);
                    break;
                case 21:
                    o1.W(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, false);
                    break;
                case 22:
                    o1.N(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, false);
                    break;
                case 23:
                    o1.K(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, false);
                    break;
                case 24:
                    o1.J(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, false);
                    break;
                case 25:
                    o1.F(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, false);
                    break;
                case 26:
                    o1.U(iArr[i16], (List) unsafe.getObject(obj, j13), bVar);
                    break;
                case 27:
                    o1.P(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, n(i16));
                    break;
                case 28:
                    o1.G(iArr[i16], (List) unsafe.getObject(obj, j13), bVar);
                    break;
                case 29:
                    z13 = false;
                    o1.V(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, false);
                    break;
                case 30:
                    z13 = false;
                    o1.I(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, false);
                    break;
                case 31:
                    z13 = false;
                    o1.Q(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, false);
                    break;
                case 32:
                    z13 = false;
                    o1.R(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, false);
                    break;
                case 33:
                    z13 = false;
                    o1.S(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, false);
                    break;
                case 34:
                    z13 = false;
                    o1.T(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, false);
                    break;
                case 35:
                    o1.H(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, true);
                    break;
                case 36:
                    o1.L(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, true);
                    break;
                case 37:
                    o1.O(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, true);
                    break;
                case 38:
                    o1.W(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, true);
                    break;
                case 39:
                    o1.N(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, true);
                    break;
                case 40:
                    o1.K(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, true);
                    break;
                case 41:
                    o1.J(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, true);
                    break;
                case 42:
                    o1.F(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, true);
                    break;
                case 43:
                    o1.V(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, true);
                    break;
                case 44:
                    o1.I(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, true);
                    break;
                case 45:
                    o1.Q(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, true);
                    break;
                case 46:
                    o1.R(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, true);
                    break;
                case 47:
                    o1.S(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, true);
                    break;
                case 48:
                    o1.T(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, true);
                    break;
                case 49:
                    o1.M(iArr[i16], (List) unsafe.getObject(obj, j13), bVar, n(i16));
                    break;
                case 50:
                    N(bVar, i17, unsafe.getObject(obj, j13), i16);
                    break;
                case 51:
                    if (r(i17, obj, i16)) {
                        bVar.p(i17, ((Double) h2.f18070d.i(j13, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (r(i17, obj, i16)) {
                        bVar.t(i17, ((Float) h2.f18070d.i(j13, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (r(i17, obj, i16)) {
                        bVar.w(i17, B(j13, obj));
                    }
                    break;
                case 54:
                    if (r(i17, obj, i16)) {
                        bVar.D(i17, B(j13, obj));
                    }
                    break;
                case 55:
                    if (r(i17, obj, i16)) {
                        bVar.v(i17, A(j13, obj));
                    }
                    break;
                case 56:
                    if (r(i17, obj, i16)) {
                        bVar.s(i17, B(j13, obj));
                    }
                    break;
                case 57:
                    if (r(i17, obj, i16)) {
                        bVar.r(i17, A(j13, obj));
                    }
                    break;
                case 58:
                    if (r(i17, obj, i16)) {
                        bVar.n(i17, ((Boolean) h2.f18070d.i(j13, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (r(i17, obj, i16)) {
                        O(i17, unsafe.getObject(obj, j13), bVar);
                    }
                    break;
                case 60:
                    if (r(i17, obj, i16)) {
                        bVar.x(i17, n(i16), unsafe.getObject(obj, j13));
                    }
                    break;
                case 61:
                    if (r(i17, obj, i16)) {
                        bVar.o(i17, (i) unsafe.getObject(obj, j13));
                    }
                    break;
                case 62:
                    if (r(i17, obj, i16)) {
                        bVar.C(i17, A(j13, obj));
                    }
                    break;
                case 63:
                    if (r(i17, obj, i16)) {
                        bVar.q(i17, A(j13, obj));
                    }
                    break;
                case 64:
                    if (r(i17, obj, i16)) {
                        bVar.y(i17, A(j13, obj));
                    }
                    break;
                case 65:
                    if (r(i17, obj, i16)) {
                        bVar.z(i17, B(j13, obj));
                    }
                    break;
                case 66:
                    if (r(i17, obj, i16)) {
                        bVar.A(i17, A(j13, obj));
                    }
                    break;
                case 67:
                    if (r(i17, obj, i16)) {
                        bVar.B(i17, B(j13, obj));
                    }
                    break;
                case 68:
                    if (r(i17, obj, i16)) {
                        bVar.u(i17, n(i16), unsafe.getObject(obj, j13));
                    }
                    break;
            }
        }
        ((y1) this.f18051m).getClass();
        ((g0) obj).unknownFields.d(bVar);
    }

    public final void N(h1.b bVar, int i13, Object obj, int i14) {
        if (obj != null) {
            Object m13 = m(i14);
            this.f18052n.getClass();
            com.google.firebase.messaging.q qVar = ((v0) m13).f18153a;
            ((q) bVar.f66449b).getClass();
            for (Map.Entry entry : ((w0) obj).entrySet()) {
                ((q) bVar.f66449b).i0(i13, 2);
                ((q) bVar.f66449b).k0(v0.a(qVar, entry.getKey(), entry.getValue()));
                v0.b((q) bVar.f66449b, qVar, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final void a(Object obj, Object obj2) {
        obj2.getClass();
        int i13 = 0;
        while (true) {
            int[] iArr = this.f18039a;
            if (i13 >= iArr.length) {
                if (this.f18045g) {
                    return;
                }
                o1.B(this.f18051m, obj, obj2);
                return;
            }
            int L = L(i13);
            long j13 = 1048575 & L;
            int i14 = iArr[i13];
            switch (K(L)) {
                case 0:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        g2 g2Var = h2.f18070d;
                        g2Var.m(obj, j13, g2Var.e(j13, obj2));
                        I(i13, obj);
                        break;
                    }
                case 1:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        g2 g2Var2 = h2.f18070d;
                        g2Var2.n(obj, j13, g2Var2.f(j13, obj2));
                        I(i13, obj);
                        break;
                    }
                case 2:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        h2.r(j13, obj, h2.f18070d.h(j13, obj2));
                        I(i13, obj);
                        break;
                    }
                case 3:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        h2.r(j13, obj, h2.f18070d.h(j13, obj2));
                        I(i13, obj);
                        break;
                    }
                case 4:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        h2.q(h2.f18070d.g(j13, obj2), j13, obj);
                        I(i13, obj);
                        break;
                    }
                case 5:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        h2.r(j13, obj, h2.f18070d.h(j13, obj2));
                        I(i13, obj);
                        break;
                    }
                case 6:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        h2.q(h2.f18070d.g(j13, obj2), j13, obj);
                        I(i13, obj);
                        break;
                    }
                case 7:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        g2 g2Var3 = h2.f18070d;
                        g2Var3.k(j13, obj, g2Var3.c(j13, obj2));
                        I(i13, obj);
                        break;
                    }
                case 8:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        h2.s(j13, obj, h2.f18070d.i(j13, obj2));
                        I(i13, obj);
                        break;
                    }
                case 9:
                    v(i13, obj, obj2);
                    break;
                case 10:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        h2.s(j13, obj, h2.f18070d.i(j13, obj2));
                        I(i13, obj);
                        break;
                    }
                case 11:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        h2.q(h2.f18070d.g(j13, obj2), j13, obj);
                        I(i13, obj);
                        break;
                    }
                case 12:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        h2.q(h2.f18070d.g(j13, obj2), j13, obj);
                        I(i13, obj);
                        break;
                    }
                case 13:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        h2.q(h2.f18070d.g(j13, obj2), j13, obj);
                        I(i13, obj);
                        break;
                    }
                case 14:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        h2.r(j13, obj, h2.f18070d.h(j13, obj2));
                        I(i13, obj);
                        break;
                    }
                case 15:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        h2.q(h2.f18070d.g(j13, obj2), j13, obj);
                        I(i13, obj);
                        break;
                    }
                case 16:
                    if (!q(i13, obj2)) {
                        break;
                    } else {
                        h2.r(j13, obj, h2.f18070d.h(j13, obj2));
                        I(i13, obj);
                        break;
                    }
                case 17:
                    v(i13, obj, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f18050l.b(j13, obj, obj2);
                    break;
                case 50:
                    Class cls = o1.f18114a;
                    g2 g2Var4 = h2.f18070d;
                    Object i15 = g2Var4.i(j13, obj);
                    Object i16 = g2Var4.i(j13, obj2);
                    this.f18052n.getClass();
                    w0 w0Var = (w0) i15;
                    w0 w0Var2 = (w0) i16;
                    if (!w0Var2.isEmpty()) {
                        if (!w0Var.f18161a) {
                            w0Var = w0Var.c();
                        }
                        w0Var.b(w0Var2);
                    }
                    h2.s(j13, obj, w0Var);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!r(i14, obj2, i13)) {
                        break;
                    } else {
                        h2.s(j13, obj, h2.f18070d.i(j13, obj2));
                        J(i14, obj, i13);
                        break;
                    }
                case 60:
                    w(i13, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!r(i14, obj2, i13)) {
                        break;
                    } else {
                        h2.s(j13, obj, h2.f18070d.i(j13, obj2));
                        J(i14, obj, i13);
                        break;
                    }
                case 68:
                    w(i13, obj, obj2);
                    break;
            }
            i13 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final void b(Object obj) {
        int[] iArr;
        int i13;
        int i14 = this.f18047i;
        while (true) {
            iArr = this.f18046h;
            i13 = this.f18048j;
            if (i14 >= i13) {
                break;
            }
            long L = L(iArr[i14]) & 1048575;
            Object i15 = h2.f18070d.i(L, obj);
            if (i15 != null) {
                this.f18052n.getClass();
                ((w0) i15).f18161a = false;
                h2.s(L, obj, i15);
            }
            i14++;
        }
        int length = iArr.length;
        while (i13 < length) {
            this.f18050l.a(iArr[i13], obj);
            i13++;
        }
        ((y1) this.f18051m).getClass();
        ((g0) obj).unknownFields.f18170e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0120 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.c1.c(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final int d(Object obj) {
        return this.f18045g ? p(obj) : o(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final Object e() {
        this.f18049k.getClass();
        return ((g0) this.f18043e).d(f0.NEW_MUTABLE_INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    @Override // androidx.datastore.preferences.protobuf.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.c1.f(java.lang.Object):int");
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final boolean g(Object obj, Object obj2) {
        boolean E;
        int[] iArr = this.f18039a;
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int L = L(i13);
            long j13 = L & 1048575;
            switch (K(L)) {
                case 0:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var = h2.f18070d;
                        if (Double.doubleToLongBits(g2Var.e(j13, obj)) == Double.doubleToLongBits(g2Var.e(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var2 = h2.f18070d;
                        if (Float.floatToIntBits(g2Var2.f(j13, obj)) == Float.floatToIntBits(g2Var2.f(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var3 = h2.f18070d;
                        if (g2Var3.h(j13, obj) == g2Var3.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 3:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var4 = h2.f18070d;
                        if (g2Var4.h(j13, obj) == g2Var4.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 4:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var5 = h2.f18070d;
                        if (g2Var5.g(j13, obj) == g2Var5.g(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 5:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var6 = h2.f18070d;
                        if (g2Var6.h(j13, obj) == g2Var6.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 6:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var7 = h2.f18070d;
                        if (g2Var7.g(j13, obj) == g2Var7.g(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 7:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var8 = h2.f18070d;
                        if (g2Var8.c(j13, obj) == g2Var8.c(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var9 = h2.f18070d;
                        if (o1.E(g2Var9.i(j13, obj), g2Var9.i(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var10 = h2.f18070d;
                        if (o1.E(g2Var10.i(j13, obj), g2Var10.i(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var11 = h2.f18070d;
                        if (o1.E(g2Var11.i(j13, obj), g2Var11.i(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var12 = h2.f18070d;
                        if (g2Var12.g(j13, obj) == g2Var12.g(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 12:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var13 = h2.f18070d;
                        if (g2Var13.g(j13, obj) == g2Var13.g(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 13:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var14 = h2.f18070d;
                        if (g2Var14.g(j13, obj) == g2Var14.g(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 14:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var15 = h2.f18070d;
                        if (g2Var15.h(j13, obj) == g2Var15.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 15:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var16 = h2.f18070d;
                        if (g2Var16.g(j13, obj) == g2Var16.g(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 16:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var17 = h2.f18070d;
                        if (g2Var17.h(j13, obj) == g2Var17.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 17:
                    if (j(i13, obj, obj2)) {
                        g2 g2Var18 = h2.f18070d;
                        if (o1.E(g2Var18.i(j13, obj), g2Var18.i(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    g2 g2Var19 = h2.f18070d;
                    E = o1.E(g2Var19.i(j13, obj), g2Var19.i(j13, obj2));
                    break;
                case 50:
                    g2 g2Var20 = h2.f18070d;
                    E = o1.E(g2Var20.i(j13, obj), g2Var20.i(j13, obj2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j14 = iArr[i13 + 2] & 1048575;
                    g2 g2Var21 = h2.f18070d;
                    if (g2Var21.g(j14, obj) == g2Var21.g(j14, obj2) && o1.E(g2Var21.i(j13, obj), g2Var21.i(j13, obj2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!E) {
                return false;
            }
        }
        y1 y1Var = (y1) this.f18051m;
        y1Var.getClass();
        x1 x1Var = ((g0) obj).unknownFields;
        y1Var.getClass();
        return x1Var.equals(((g0) obj2).unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final void h(Object obj, m1 m1Var, t tVar) {
        tVar.getClass();
        t(this.f18051m, obj, m1Var, tVar);
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final void i(Object obj, h1.b bVar) {
        bVar.getClass();
        s2 s2Var = s2.ASCENDING;
        s2 s2Var2 = s2.DESCENDING;
        int[] iArr = this.f18039a;
        w1 w1Var = this.f18051m;
        if (s2Var == s2Var2) {
            ((y1) w1Var).getClass();
            ((g0) obj).unknownFields.d(bVar);
            for (int length = iArr.length - 3; length >= 0; length -= 3) {
                int L = L(length);
                int i13 = iArr[length];
                switch (K(L)) {
                    case 0:
                        if (q(length, obj)) {
                            bVar.p(i13, h2.f18070d.e(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (q(length, obj)) {
                            bVar.t(i13, h2.f18070d.f(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (q(length, obj)) {
                            bVar.w(i13, h2.f18070d.h(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (q(length, obj)) {
                            bVar.D(i13, h2.f18070d.h(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (q(length, obj)) {
                            bVar.v(i13, h2.f18070d.g(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (q(length, obj)) {
                            bVar.s(i13, h2.f18070d.h(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (q(length, obj)) {
                            bVar.r(i13, h2.f18070d.g(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (q(length, obj)) {
                            bVar.n(i13, h2.f18070d.c(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (q(length, obj)) {
                            O(i13, h2.f18070d.i(L & 1048575, obj), bVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (q(length, obj)) {
                            bVar.x(i13, n(length), h2.f18070d.i(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (q(length, obj)) {
                            bVar.o(i13, (i) h2.f18070d.i(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (q(length, obj)) {
                            bVar.C(i13, h2.f18070d.g(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (q(length, obj)) {
                            bVar.q(i13, h2.f18070d.g(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (q(length, obj)) {
                            bVar.y(i13, h2.f18070d.g(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (q(length, obj)) {
                            bVar.z(i13, h2.f18070d.h(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (q(length, obj)) {
                            bVar.A(i13, h2.f18070d.g(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (q(length, obj)) {
                            bVar.B(i13, h2.f18070d.h(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (q(length, obj)) {
                            bVar.u(i13, n(length), h2.f18070d.i(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        o1.H(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, false);
                        break;
                    case 19:
                        o1.L(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, false);
                        break;
                    case 20:
                        o1.O(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, false);
                        break;
                    case 21:
                        o1.W(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, false);
                        break;
                    case 22:
                        o1.N(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, false);
                        break;
                    case 23:
                        o1.K(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, false);
                        break;
                    case 24:
                        o1.J(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, false);
                        break;
                    case 25:
                        o1.F(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, false);
                        break;
                    case 26:
                        o1.U(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar);
                        break;
                    case 27:
                        o1.P(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, n(length));
                        break;
                    case 28:
                        o1.G(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar);
                        break;
                    case 29:
                        o1.V(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, false);
                        break;
                    case 30:
                        o1.I(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, false);
                        break;
                    case 31:
                        o1.Q(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, false);
                        break;
                    case 32:
                        o1.R(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, false);
                        break;
                    case 33:
                        o1.S(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, false);
                        break;
                    case 34:
                        o1.T(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, false);
                        break;
                    case 35:
                        o1.H(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, true);
                        break;
                    case 36:
                        o1.L(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, true);
                        break;
                    case 37:
                        o1.O(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, true);
                        break;
                    case 38:
                        o1.W(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, true);
                        break;
                    case 39:
                        o1.N(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, true);
                        break;
                    case 40:
                        o1.K(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, true);
                        break;
                    case 41:
                        o1.J(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, true);
                        break;
                    case 42:
                        o1.F(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, true);
                        break;
                    case 43:
                        o1.V(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, true);
                        break;
                    case 44:
                        o1.I(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, true);
                        break;
                    case 45:
                        o1.Q(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, true);
                        break;
                    case 46:
                        o1.R(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, true);
                        break;
                    case 47:
                        o1.S(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, true);
                        break;
                    case 48:
                        o1.T(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, true);
                        break;
                    case 49:
                        o1.M(iArr[length], (List) h2.f18070d.i(L & 1048575, obj), bVar, n(length));
                        break;
                    case 50:
                        N(bVar, i13, h2.f18070d.i(L & 1048575, obj), length);
                        break;
                    case 51:
                        if (r(i13, obj, length)) {
                            bVar.p(i13, ((Double) h2.f18070d.i(L & 1048575, obj)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (r(i13, obj, length)) {
                            bVar.t(i13, ((Float) h2.f18070d.i(L & 1048575, obj)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (r(i13, obj, length)) {
                            bVar.w(i13, B(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (r(i13, obj, length)) {
                            bVar.D(i13, B(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (r(i13, obj, length)) {
                            bVar.v(i13, A(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (r(i13, obj, length)) {
                            bVar.s(i13, B(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (r(i13, obj, length)) {
                            bVar.r(i13, A(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (r(i13, obj, length)) {
                            bVar.n(i13, ((Boolean) h2.f18070d.i(L & 1048575, obj)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (r(i13, obj, length)) {
                            O(i13, h2.f18070d.i(L & 1048575, obj), bVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (r(i13, obj, length)) {
                            bVar.x(i13, n(length), h2.f18070d.i(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (r(i13, obj, length)) {
                            bVar.o(i13, (i) h2.f18070d.i(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (r(i13, obj, length)) {
                            bVar.C(i13, A(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (r(i13, obj, length)) {
                            bVar.q(i13, A(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (r(i13, obj, length)) {
                            bVar.y(i13, A(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (r(i13, obj, length)) {
                            bVar.z(i13, B(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (r(i13, obj, length)) {
                            bVar.A(i13, A(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (r(i13, obj, length)) {
                            bVar.B(i13, B(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (r(i13, obj, length)) {
                            bVar.u(i13, n(length), h2.f18070d.i(L & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                }
            }
            return;
        }
        if (!this.f18045g) {
            M(obj, bVar);
            return;
        }
        int length2 = iArr.length;
        for (int i14 = 0; i14 < length2; i14 += 3) {
            int L2 = L(i14);
            int i15 = iArr[i14];
            switch (K(L2)) {
                case 0:
                    if (q(i14, obj)) {
                        bVar.p(i15, h2.f18070d.e(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i14, obj)) {
                        bVar.t(i15, h2.f18070d.f(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(i14, obj)) {
                        bVar.w(i15, h2.f18070d.h(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(i14, obj)) {
                        bVar.D(i15, h2.f18070d.h(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(i14, obj)) {
                        bVar.v(i15, h2.f18070d.g(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(i14, obj)) {
                        bVar.s(i15, h2.f18070d.h(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(i14, obj)) {
                        bVar.r(i15, h2.f18070d.g(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (q(i14, obj)) {
                        bVar.n(i15, h2.f18070d.c(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (q(i14, obj)) {
                        O(i15, h2.f18070d.i(L2 & 1048575, obj), bVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (q(i14, obj)) {
                        bVar.x(i15, n(i14), h2.f18070d.i(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (q(i14, obj)) {
                        bVar.o(i15, (i) h2.f18070d.i(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(i14, obj)) {
                        bVar.C(i15, h2.f18070d.g(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i14, obj)) {
                        bVar.q(i15, h2.f18070d.g(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(i14, obj)) {
                        bVar.y(i15, h2.f18070d.g(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(i14, obj)) {
                        bVar.z(i15, h2.f18070d.h(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (q(i14, obj)) {
                        bVar.A(i15, h2.f18070d.g(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i14, obj)) {
                        bVar.B(i15, h2.f18070d.h(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i14, obj)) {
                        bVar.u(i15, n(i14), h2.f18070d.i(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    o1.H(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, false);
                    break;
                case 19:
                    o1.L(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, false);
                    break;
                case 20:
                    o1.O(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, false);
                    break;
                case 21:
                    o1.W(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, false);
                    break;
                case 22:
                    o1.N(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, false);
                    break;
                case 23:
                    o1.K(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, false);
                    break;
                case 24:
                    o1.J(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, false);
                    break;
                case 25:
                    o1.F(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, false);
                    break;
                case 26:
                    o1.U(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar);
                    break;
                case 27:
                    o1.P(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, n(i14));
                    break;
                case 28:
                    o1.G(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar);
                    break;
                case 29:
                    o1.V(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, false);
                    break;
                case 30:
                    o1.I(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, false);
                    break;
                case 31:
                    o1.Q(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, false);
                    break;
                case 32:
                    o1.R(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, false);
                    break;
                case 33:
                    o1.S(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, false);
                    break;
                case 34:
                    o1.T(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, false);
                    break;
                case 35:
                    o1.H(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, true);
                    break;
                case 36:
                    o1.L(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, true);
                    break;
                case 37:
                    o1.O(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, true);
                    break;
                case 38:
                    o1.W(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, true);
                    break;
                case 39:
                    o1.N(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, true);
                    break;
                case 40:
                    o1.K(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, true);
                    break;
                case 41:
                    o1.J(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, true);
                    break;
                case 42:
                    o1.F(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, true);
                    break;
                case 43:
                    o1.V(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, true);
                    break;
                case 44:
                    o1.I(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, true);
                    break;
                case 45:
                    o1.Q(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, true);
                    break;
                case 46:
                    o1.R(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, true);
                    break;
                case 47:
                    o1.S(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, true);
                    break;
                case 48:
                    o1.T(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, true);
                    break;
                case 49:
                    o1.M(iArr[i14], (List) h2.f18070d.i(L2 & 1048575, obj), bVar, n(i14));
                    break;
                case 50:
                    N(bVar, i15, h2.f18070d.i(L2 & 1048575, obj), i14);
                    break;
                case 51:
                    if (r(i15, obj, i14)) {
                        bVar.p(i15, ((Double) h2.f18070d.i(L2 & 1048575, obj)).doubleValue());
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i15, obj, i14)) {
                        bVar.t(i15, ((Float) h2.f18070d.i(L2 & 1048575, obj)).floatValue());
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i15, obj, i14)) {
                        bVar.w(i15, B(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i15, obj, i14)) {
                        bVar.D(i15, B(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i15, obj, i14)) {
                        bVar.v(i15, A(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i15, obj, i14)) {
                        bVar.s(i15, B(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i15, obj, i14)) {
                        bVar.r(i15, A(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i15, obj, i14)) {
                        bVar.n(i15, ((Boolean) h2.f18070d.i(L2 & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(i15, obj, i14)) {
                        O(i15, h2.f18070d.i(L2 & 1048575, obj), bVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (r(i15, obj, i14)) {
                        bVar.x(i15, n(i14), h2.f18070d.i(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i15, obj, i14)) {
                        bVar.o(i15, (i) h2.f18070d.i(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i15, obj, i14)) {
                        bVar.C(i15, A(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i15, obj, i14)) {
                        bVar.q(i15, A(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(i15, obj, i14)) {
                        bVar.y(i15, A(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (r(i15, obj, i14)) {
                        bVar.z(i15, B(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i15, obj, i14)) {
                        bVar.A(i15, A(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i15, obj, i14)) {
                        bVar.B(i15, B(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i15, obj, i14)) {
                        bVar.u(i15, n(i14), h2.f18070d.i(L2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((y1) w1Var).getClass();
        ((g0) obj).unknownFields.d(bVar);
    }

    public final boolean j(int i13, Object obj, Object obj2) {
        return q(i13, obj) == q(i13, obj2);
    }

    public final void k(Object obj, int i13, Object obj2) {
        int i14 = this.f18039a[i13];
        if (h2.f18070d.i(L(i13) & 1048575, obj) == null) {
            return;
        }
        l(i13);
    }

    public final void l(int i13) {
        ep.b.A(this.f18040b[cb.c(i13, 3, 2, 1)]);
    }

    public final Object m(int i13) {
        return this.f18040b[(i13 / 3) * 2];
    }

    public final n1 n(int i13) {
        int i14 = (i13 / 3) * 2;
        Object[] objArr = this.f18040b;
        n1 n1Var = (n1) objArr[i14];
        if (n1Var != null) {
            return n1Var;
        }
        n1 a13 = j1.f18082c.a((Class) objArr[i14 + 1]);
        objArr[i14] = a13;
        return a13;
    }

    public final int o(Object obj) {
        int i13;
        int k13;
        int i14;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr = this.f18039a;
            if (i16 >= iArr.length) {
                ((y1) this.f18051m).getClass();
                return ((g0) obj).unknownFields.a() + i17;
            }
            int L = L(i16);
            int i19 = iArr[i16];
            int K = K(L);
            Unsafe unsafe = f18038p;
            if (K <= 17) {
                int i23 = iArr[i16 + 2];
                int i24 = i23 & 1048575;
                i13 = 1 << (i23 >>> 20);
                if (i24 != i15) {
                    i18 = unsafe.getInt(obj, i24);
                    i15 = i24;
                }
            } else {
                i13 = 0;
            }
            long j13 = L & 1048575;
            switch (K) {
                case 0:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.k(i19);
                        i17 += k13;
                        break;
                    }
                case 1:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.p(i19);
                        i17 += k13;
                        break;
                    }
                case 2:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.t(i19, unsafe.getLong(obj, j13));
                        i17 += k13;
                        break;
                    }
                case 3:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.G(i19, unsafe.getLong(obj, j13));
                        i17 += k13;
                        break;
                    }
                case 4:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.r(i19, unsafe.getInt(obj, j13));
                        i17 += k13;
                        break;
                    }
                case 5:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.o(i19);
                        i17 += k13;
                        break;
                    }
                case 6:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.n(i19);
                        i17 += k13;
                        break;
                    }
                case 7:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.g(i19);
                        i17 += k13;
                        break;
                    }
                case 8:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j13);
                        i14 = object instanceof i ? q.i(i19, (i) object) : q.B(i19, (String) object);
                        i17 = i14 + i17;
                        break;
                    }
                case 9:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = o1.o(i19, n(i16), unsafe.getObject(obj, j13));
                        i17 += k13;
                        break;
                    }
                case 10:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.i(i19, (i) unsafe.getObject(obj, j13));
                        i17 += k13;
                        break;
                    }
                case 11:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.E(i19, unsafe.getInt(obj, j13));
                        i17 += k13;
                        break;
                    }
                case 12:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.l(i19, unsafe.getInt(obj, j13));
                        i17 += k13;
                        break;
                    }
                case 13:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.v(i19);
                        i17 += k13;
                        break;
                    }
                case 14:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.w(i19);
                        i17 += k13;
                        break;
                    }
                case 15:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.x(i19, unsafe.getInt(obj, j13));
                        i17 += k13;
                        break;
                    }
                case 16:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.z(i19, unsafe.getLong(obj, j13));
                        i17 += k13;
                        break;
                    }
                case 17:
                    if ((i13 & i18) == 0) {
                        break;
                    } else {
                        k13 = q.q(i19, (b) unsafe.getObject(obj, j13), n(i16));
                        i17 += k13;
                        break;
                    }
                case 18:
                    k13 = o1.h(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 19:
                    k13 = o1.f(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 20:
                    k13 = o1.m(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 21:
                    k13 = o1.x(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 22:
                    k13 = o1.k(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 23:
                    k13 = o1.h(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 24:
                    k13 = o1.f(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 25:
                    k13 = o1.a(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 26:
                    k13 = o1.u(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 27:
                    k13 = o1.p(i19, (List) unsafe.getObject(obj, j13), n(i16));
                    i17 += k13;
                    break;
                case 28:
                    k13 = o1.c(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 29:
                    k13 = o1.v(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 30:
                    k13 = o1.d(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 31:
                    k13 = o1.f(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 32:
                    k13 = o1.h(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 33:
                    k13 = o1.q(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 34:
                    k13 = o1.s(i19, (List) unsafe.getObject(obj, j13));
                    i17 += k13;
                    break;
                case 35:
                    int i25 = o1.i((List) unsafe.getObject(obj, j13));
                    if (i25 <= 0) {
                        break;
                    } else {
                        i17 = cb.A(i25, q.D(i19), i25, i17);
                        break;
                    }
                case 36:
                    int g13 = o1.g((List) unsafe.getObject(obj, j13));
                    if (g13 <= 0) {
                        break;
                    } else {
                        i17 = cb.A(g13, q.D(i19), g13, i17);
                        break;
                    }
                case 37:
                    int n13 = o1.n((List) unsafe.getObject(obj, j13));
                    if (n13 <= 0) {
                        break;
                    } else {
                        i17 = cb.A(n13, q.D(i19), n13, i17);
                        break;
                    }
                case 38:
                    int y13 = o1.y((List) unsafe.getObject(obj, j13));
                    if (y13 <= 0) {
                        break;
                    } else {
                        i17 = cb.A(y13, q.D(i19), y13, i17);
                        break;
                    }
                case 39:
                    int l13 = o1.l((List) unsafe.getObject(obj, j13));
                    if (l13 <= 0) {
                        break;
                    } else {
                        i17 = cb.A(l13, q.D(i19), l13, i17);
                        break;
                    }
                case 40:
                    int i26 = o1.i((List) unsafe.getObject(obj, j13));
                    if (i26 <= 0) {
                        break;
                    } else {
                        i17 = cb.A(i26, q.D(i19), i26, i17);
                        break;
                    }
                case 41:
                    int g14 = o1.g((List) unsafe.getObject(obj, j13));
                    if (g14 <= 0) {
                        break;
                    } else {
                        i17 = cb.A(g14, q.D(i19), g14, i17);
                        break;
                    }
                case 42:
                    int b13 = o1.b((List) unsafe.getObject(obj, j13));
                    if (b13 <= 0) {
                        break;
                    } else {
                        i17 = cb.A(b13, q.D(i19), b13, i17);
                        break;
                    }
                case 43:
                    int w13 = o1.w((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        i17 = cb.A(w13, q.D(i19), w13, i17);
                        break;
                    }
                case 44:
                    int e13 = o1.e((List) unsafe.getObject(obj, j13));
                    if (e13 <= 0) {
                        break;
                    } else {
                        i17 = cb.A(e13, q.D(i19), e13, i17);
                        break;
                    }
                case 45:
                    int g15 = o1.g((List) unsafe.getObject(obj, j13));
                    if (g15 <= 0) {
                        break;
                    } else {
                        i17 = cb.A(g15, q.D(i19), g15, i17);
                        break;
                    }
                case 46:
                    int i27 = o1.i((List) unsafe.getObject(obj, j13));
                    if (i27 <= 0) {
                        break;
                    } else {
                        i17 = cb.A(i27, q.D(i19), i27, i17);
                        break;
                    }
                case 47:
                    int r13 = o1.r((List) unsafe.getObject(obj, j13));
                    if (r13 <= 0) {
                        break;
                    } else {
                        i17 = cb.A(r13, q.D(i19), r13, i17);
                        break;
                    }
                case 48:
                    int t13 = o1.t((List) unsafe.getObject(obj, j13));
                    if (t13 <= 0) {
                        break;
                    } else {
                        i17 = cb.A(t13, q.D(i19), t13, i17);
                        break;
                    }
                case 49:
                    k13 = o1.j(i19, (List) unsafe.getObject(obj, j13), n(i16));
                    i17 += k13;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j13);
                    Object m13 = m(i16);
                    this.f18052n.getClass();
                    k13 = x0.a(i19, object2, m13);
                    i17 += k13;
                    break;
                case 51:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.k(i19);
                        i17 += k13;
                        break;
                    }
                case 52:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.p(i19);
                        i17 += k13;
                        break;
                    }
                case 53:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.t(i19, B(j13, obj));
                        i17 += k13;
                        break;
                    }
                case 54:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.G(i19, B(j13, obj));
                        i17 += k13;
                        break;
                    }
                case 55:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.r(i19, A(j13, obj));
                        i17 += k13;
                        break;
                    }
                case 56:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.o(i19);
                        i17 += k13;
                        break;
                    }
                case 57:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.n(i19);
                        i17 += k13;
                        break;
                    }
                case 58:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.g(i19);
                        i17 += k13;
                        break;
                    }
                case 59:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(obj, j13);
                        i14 = object3 instanceof i ? q.i(i19, (i) object3) : q.B(i19, (String) object3);
                        i17 = i14 + i17;
                        break;
                    }
                case 60:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = o1.o(i19, n(i16), unsafe.getObject(obj, j13));
                        i17 += k13;
                        break;
                    }
                case 61:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.i(i19, (i) unsafe.getObject(obj, j13));
                        i17 += k13;
                        break;
                    }
                case 62:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.E(i19, A(j13, obj));
                        i17 += k13;
                        break;
                    }
                case 63:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.l(i19, A(j13, obj));
                        i17 += k13;
                        break;
                    }
                case 64:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.v(i19);
                        i17 += k13;
                        break;
                    }
                case 65:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.w(i19);
                        i17 += k13;
                        break;
                    }
                case 66:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.x(i19, A(j13, obj));
                        i17 += k13;
                        break;
                    }
                case 67:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.z(i19, B(j13, obj));
                        i17 += k13;
                        break;
                    }
                case 68:
                    if (!r(i19, obj, i16)) {
                        break;
                    } else {
                        k13 = q.q(i19, (b) unsafe.getObject(obj, j13), n(i16));
                        i17 += k13;
                        break;
                    }
            }
            i16 += 3;
        }
    }

    public final int p(Object obj) {
        int k13;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f18039a;
            if (i13 >= iArr.length) {
                ((y1) this.f18051m).getClass();
                return ((g0) obj).unknownFields.a() + i14;
            }
            int L = L(i13);
            int K = K(L);
            int i15 = iArr[i13];
            long j13 = L & 1048575;
            if (K >= a0.DOUBLE_LIST_PACKED.id() && K <= a0.SINT64_LIST_PACKED.id()) {
                int i16 = iArr[i13 + 2];
            }
            Unsafe unsafe = f18038p;
            switch (K) {
                case 0:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.k(i15);
                        break;
                    }
                case 1:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.p(i15);
                        break;
                    }
                case 2:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.t(i15, h2.k(j13, obj));
                        break;
                    }
                case 3:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.G(i15, h2.k(j13, obj));
                        break;
                    }
                case 4:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.r(i15, h2.j(j13, obj));
                        break;
                    }
                case 5:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.o(i15);
                        break;
                    }
                case 6:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.n(i15);
                        break;
                    }
                case 7:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.g(i15);
                        break;
                    }
                case 8:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        Object l13 = h2.l(j13, obj);
                        if (!(l13 instanceof i)) {
                            k13 = q.B(i15, (String) l13);
                            break;
                        } else {
                            k13 = q.i(i15, (i) l13);
                            break;
                        }
                    }
                case 9:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = o1.o(i15, n(i13), h2.l(j13, obj));
                        break;
                    }
                case 10:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.i(i15, (i) h2.l(j13, obj));
                        break;
                    }
                case 11:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.E(i15, h2.j(j13, obj));
                        break;
                    }
                case 12:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.l(i15, h2.j(j13, obj));
                        break;
                    }
                case 13:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.v(i15);
                        break;
                    }
                case 14:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.w(i15);
                        break;
                    }
                case 15:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.x(i15, h2.j(j13, obj));
                        break;
                    }
                case 16:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.z(i15, h2.k(j13, obj));
                        break;
                    }
                case 17:
                    if (!q(i13, obj)) {
                        break;
                    } else {
                        k13 = q.q(i15, (b) h2.l(j13, obj), n(i13));
                        break;
                    }
                case 18:
                    k13 = o1.h(i15, s(j13, obj));
                    break;
                case 19:
                    k13 = o1.f(i15, s(j13, obj));
                    break;
                case 20:
                    k13 = o1.m(i15, s(j13, obj));
                    break;
                case 21:
                    k13 = o1.x(i15, s(j13, obj));
                    break;
                case 22:
                    k13 = o1.k(i15, s(j13, obj));
                    break;
                case 23:
                    k13 = o1.h(i15, s(j13, obj));
                    break;
                case 24:
                    k13 = o1.f(i15, s(j13, obj));
                    break;
                case 25:
                    k13 = o1.a(i15, s(j13, obj));
                    break;
                case 26:
                    k13 = o1.u(i15, s(j13, obj));
                    break;
                case 27:
                    k13 = o1.p(i15, s(j13, obj), n(i13));
                    break;
                case 28:
                    k13 = o1.c(i15, s(j13, obj));
                    break;
                case 29:
                    k13 = o1.v(i15, s(j13, obj));
                    break;
                case 30:
                    k13 = o1.d(i15, s(j13, obj));
                    break;
                case 31:
                    k13 = o1.f(i15, s(j13, obj));
                    break;
                case 32:
                    k13 = o1.h(i15, s(j13, obj));
                    break;
                case 33:
                    k13 = o1.q(i15, s(j13, obj));
                    break;
                case 34:
                    k13 = o1.s(i15, s(j13, obj));
                    break;
                case 35:
                    int i17 = o1.i((List) unsafe.getObject(obj, j13));
                    if (i17 > 0) {
                        i14 = cb.A(i17, q.D(i15), i17, i14);
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    int g13 = o1.g((List) unsafe.getObject(obj, j13));
                    if (g13 > 0) {
                        i14 = cb.A(g13, q.D(i15), g13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    int n13 = o1.n((List) unsafe.getObject(obj, j13));
                    if (n13 > 0) {
                        i14 = cb.A(n13, q.D(i15), n13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    int y13 = o1.y((List) unsafe.getObject(obj, j13));
                    if (y13 > 0) {
                        i14 = cb.A(y13, q.D(i15), y13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    int l14 = o1.l((List) unsafe.getObject(obj, j13));
                    if (l14 > 0) {
                        i14 = cb.A(l14, q.D(i15), l14, i14);
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    int i18 = o1.i((List) unsafe.getObject(obj, j13));
                    if (i18 > 0) {
                        i14 = cb.A(i18, q.D(i15), i18, i14);
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    int g14 = o1.g((List) unsafe.getObject(obj, j13));
                    if (g14 > 0) {
                        i14 = cb.A(g14, q.D(i15), g14, i14);
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    int b13 = o1.b((List) unsafe.getObject(obj, j13));
                    if (b13 > 0) {
                        i14 = cb.A(b13, q.D(i15), b13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    int w13 = o1.w((List) unsafe.getObject(obj, j13));
                    if (w13 > 0) {
                        i14 = cb.A(w13, q.D(i15), w13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    int e13 = o1.e((List) unsafe.getObject(obj, j13));
                    if (e13 > 0) {
                        i14 = cb.A(e13, q.D(i15), e13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    int g15 = o1.g((List) unsafe.getObject(obj, j13));
                    if (g15 > 0) {
                        i14 = cb.A(g15, q.D(i15), g15, i14);
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    int i19 = o1.i((List) unsafe.getObject(obj, j13));
                    if (i19 > 0) {
                        i14 = cb.A(i19, q.D(i15), i19, i14);
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    int r13 = o1.r((List) unsafe.getObject(obj, j13));
                    if (r13 > 0) {
                        i14 = cb.A(r13, q.D(i15), r13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    int t13 = o1.t((List) unsafe.getObject(obj, j13));
                    if (t13 > 0) {
                        i14 = cb.A(t13, q.D(i15), t13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    k13 = o1.j(i15, s(j13, obj), n(i13));
                    break;
                case 50:
                    Object l15 = h2.l(j13, obj);
                    Object m13 = m(i13);
                    this.f18052n.getClass();
                    k13 = x0.a(i15, l15, m13);
                    break;
                case 51:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.k(i15);
                        break;
                    }
                case 52:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.p(i15);
                        break;
                    }
                case 53:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.t(i15, B(j13, obj));
                        break;
                    }
                case 54:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.G(i15, B(j13, obj));
                        break;
                    }
                case 55:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.r(i15, A(j13, obj));
                        break;
                    }
                case 56:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.o(i15);
                        break;
                    }
                case 57:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.n(i15);
                        break;
                    }
                case 58:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.g(i15);
                        break;
                    }
                case 59:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        Object l16 = h2.l(j13, obj);
                        if (!(l16 instanceof i)) {
                            k13 = q.B(i15, (String) l16);
                            break;
                        } else {
                            k13 = q.i(i15, (i) l16);
                            break;
                        }
                    }
                case 60:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = o1.o(i15, n(i13), h2.l(j13, obj));
                        break;
                    }
                case 61:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.i(i15, (i) h2.l(j13, obj));
                        break;
                    }
                case 62:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.E(i15, A(j13, obj));
                        break;
                    }
                case 63:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.l(i15, A(j13, obj));
                        break;
                    }
                case 64:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.v(i15);
                        break;
                    }
                case 65:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.w(i15);
                        break;
                    }
                case 66:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.x(i15, A(j13, obj));
                        break;
                    }
                case 67:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.z(i15, B(j13, obj));
                        break;
                    }
                case 68:
                    if (!r(i15, obj, i13)) {
                        break;
                    } else {
                        k13 = q.q(i15, (b) h2.l(j13, obj), n(i13));
                        break;
                    }
            }
            i14 = k13 + i14;
            i13 += 3;
        }
    }

    public final boolean q(int i13, Object obj) {
        if (!this.f18045g) {
            int i14 = this.f18039a[i13 + 2];
            return (h2.f18070d.g((long) (i14 & 1048575), obj) & (1 << (i14 >>> 20))) != 0;
        }
        int L = L(i13);
        long j13 = L & 1048575;
        switch (K(L)) {
            case 0:
                return h2.f18070d.e(j13, obj) != 0.0d;
            case 1:
                return h2.f18070d.f(j13, obj) != 0.0f;
            case 2:
                return h2.f18070d.h(j13, obj) != 0;
            case 3:
                return h2.f18070d.h(j13, obj) != 0;
            case 4:
                return h2.f18070d.g(j13, obj) != 0;
            case 5:
                return h2.f18070d.h(j13, obj) != 0;
            case 6:
                return h2.f18070d.g(j13, obj) != 0;
            case 7:
                return h2.f18070d.c(j13, obj);
            case 8:
                Object i15 = h2.f18070d.i(j13, obj);
                if (i15 instanceof String) {
                    return !((String) i15).isEmpty();
                }
                if (i15 instanceof i) {
                    return !i.f18075b.equals(i15);
                }
                throw new IllegalArgumentException();
            case 9:
                return h2.f18070d.i(j13, obj) != null;
            case 10:
                return !i.f18075b.equals(h2.f18070d.i(j13, obj));
            case 11:
                return h2.f18070d.g(j13, obj) != 0;
            case 12:
                return h2.f18070d.g(j13, obj) != 0;
            case 13:
                return h2.f18070d.g(j13, obj) != 0;
            case 14:
                return h2.f18070d.h(j13, obj) != 0;
            case 15:
                return h2.f18070d.g(j13, obj) != 0;
            case 16:
                return h2.f18070d.h(j13, obj) != 0;
            case 17:
                return h2.f18070d.i(j13, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean r(int i13, Object obj, int i14) {
        return h2.f18070d.g((long) (this.f18039a[i14 + 2] & 1048575), obj) == i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x05f4 A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:56:0x05ef, B:58:0x05f4, B:60:0x05fb, B:62:0x0602, B:86:0x024b, B:89:0x0253, B:90:0x0263, B:91:0x0273, B:92:0x0283, B:93:0x0293, B:94:0x02a9, B:95:0x02b9, B:96:0x02c9, B:97:0x02d9, B:98:0x02e9, B:99:0x02f9, B:100:0x0309, B:101:0x0319, B:102:0x0329, B:103:0x0339, B:104:0x0349, B:105:0x0359, B:106:0x0369, B:107:0x0379, B:108:0x038f, B:109:0x039f, B:110:0x03af, B:111:0x03c3, B:112:0x03cb, B:113:0x03db, B:114:0x03eb, B:115:0x03fb, B:116:0x040b, B:117:0x041b, B:118:0x042b, B:119:0x043b, B:120:0x044b, B:122:0x0454, B:123:0x0471, B:124:0x0485, B:125:0x0498, B:126:0x04ab, B:127:0x04be, B:128:0x04d1, B:129:0x04e7, B:130:0x04fa, B:131:0x050d, B:133:0x0516, B:134:0x0533, B:135:0x0547, B:136:0x0552, B:137:0x0567, B:138:0x057a, B:139:0x058d, B:140:0x05a0, B:141:0x05b3, B:142:0x05c5, B:143:0x05d9), top: B:55:0x05ef }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0608 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(androidx.datastore.preferences.protobuf.w1 r18, java.lang.Object r19, androidx.datastore.preferences.protobuf.m1 r20, androidx.datastore.preferences.protobuf.t r21) {
        /*
            Method dump skipped, instructions count: 1736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.c1.t(androidx.datastore.preferences.protobuf.w1, java.lang.Object, androidx.datastore.preferences.protobuf.m1, androidx.datastore.preferences.protobuf.t):void");
    }

    public final void u(Object obj, int i13, Object obj2, t tVar, m1 m1Var) {
        Object obj3;
        long L = L(i13) & 1048575;
        Object i14 = h2.f18070d.i(L, obj);
        x0 x0Var = this.f18052n;
        if (i14 == null) {
            x0Var.getClass();
            Object c13 = w0.f18160b.c();
            h2.s(L, obj, c13);
            obj3 = c13;
        } else {
            x0Var.getClass();
            w0 w0Var = (w0) i14;
            obj3 = i14;
            if (!w0Var.f18161a) {
                w0 c14 = w0.f18160b.c();
                if (!w0Var.isEmpty()) {
                    (!c14.f18161a ? c14.c() : c14).b(w0Var);
                }
                h2.s(L, obj, c14);
                obj3 = c14;
            }
        }
        x0Var.getClass();
        m1Var.j((w0) obj3, ((v0) obj2).f18153a, tVar);
    }

    public final void v(int i13, Object obj, Object obj2) {
        long L = L(i13) & 1048575;
        if (q(i13, obj2)) {
            g2 g2Var = h2.f18070d;
            Object i14 = g2Var.i(L, obj);
            Object i15 = g2Var.i(L, obj2);
            if (i14 != null && i15 != null) {
                h2.s(L, obj, j0.c(i14, i15));
                I(i13, obj);
            } else if (i15 != null) {
                h2.s(L, obj, i15);
                I(i13, obj);
            }
        }
    }

    public final void w(int i13, Object obj, Object obj2) {
        int L = L(i13);
        int i14 = this.f18039a[i13];
        long j13 = L & 1048575;
        if (r(i14, obj2, i13)) {
            g2 g2Var = h2.f18070d;
            Object i15 = g2Var.i(j13, obj);
            Object i16 = g2Var.i(j13, obj2);
            if (i15 != null && i16 != null) {
                h2.s(j13, obj, j0.c(i15, i16));
                J(i14, obj, i13);
            } else if (i16 != null) {
                h2.s(j13, obj, i16);
                J(i14, obj, i13);
            }
        }
    }
}
