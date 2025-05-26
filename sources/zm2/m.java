package zm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final m f142237d = new m(0);

    /* renamed from: b, reason: collision with root package name */
    public boolean f142239b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f142240c = false;

    /* renamed from: a, reason: collision with root package name */
    public final e0 f142238a = new e0(16);

    public m() {
    }

    public static int c(q0 q0Var, Object obj) {
        switch (l.f142236b[q0Var.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                return 8;
            case 2:
                ((Float) obj).getClass();
                return 4;
            case 3:
                return i.h(((Long) obj).longValue());
            case 4:
                return i.s(((Long) obj).longValue());
            case 5:
                return i.g(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                return 8;
            case 7:
                ((Integer) obj).getClass();
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                return 1;
            case 9:
                return i.p((String) obj);
            case 10:
                return obj instanceof g ? i.b((g) obj) : i.a((byte[]) obj);
            case 11:
                return i.r(((Integer) obj).intValue());
            case 12:
                ((Integer) obj).getClass();
                return 4;
            case 13:
                ((Long) obj).getClass();
                return 8;
            case 14:
                return i.m(((Integer) obj).intValue());
            case 15:
                return i.o(((Long) obj).longValue());
            case 16:
                return ((c) obj).a();
            case 17:
                return i.j((c) obj);
            case 18:
                return obj instanceof u ? i.g(((u) obj).getNumber()) : i.g(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(r rVar, Object obj) {
        q0 q0Var = rVar.f142248c;
        boolean z13 = rVar.f142249d;
        int i13 = rVar.f142247b;
        if (!z13) {
            int q13 = i.q(i13);
            if (q0Var == q0.GROUP) {
                q13 *= 2;
            }
            return c(q0Var, obj) + q13;
        }
        int i14 = 0;
        if (rVar.f142250e) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i14 += c(q0Var, it.next());
            }
            return i.k(i14) + i.q(i13) + i14;
        }
        for (Object obj2 : (List) obj) {
            int q14 = i.q(i13);
            if (q0Var == q0.GROUP) {
                q14 *= 2;
            }
            i14 += c(q0Var, obj2) + q14;
        }
        return i14;
    }

    public static boolean e(Map.Entry entry) {
        r rVar = (r) entry.getKey();
        if (rVar.f142248c.getJavaType() != r0.MESSAGE) {
            return true;
        }
        if (!rVar.f142249d) {
            Object value = entry.getValue();
            if (value instanceof c) {
                return ((c) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((c) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public static Object h(h hVar, q0 q0Var) {
        switch (l.f142236b[q0Var.ordinal()]) {
            case 1:
                return Double.valueOf(Double.longBitsToDouble(hVar.i()));
            case 2:
                return Float.valueOf(Float.intBitsToFloat(hVar.h()));
            case 3:
                return Long.valueOf(hVar.k());
            case 4:
                return Long.valueOf(hVar.k());
            case 5:
                return Integer.valueOf(hVar.j());
            case 6:
                return Long.valueOf(hVar.i());
            case 7:
                return Integer.valueOf(hVar.h());
            case 8:
                return Boolean.valueOf(hVar.k() != 0);
            case 9:
                return hVar.n();
            case 10:
                return hVar.d();
            case 11:
                return Integer.valueOf(hVar.j());
            case 12:
                return Integer.valueOf(hVar.h());
            case 13:
                return Long.valueOf(hVar.i());
            case 14:
                return Integer.valueOf(hVar.m());
            case 15:
                long k13 = hVar.k();
                return Long.valueOf((-(k13 & 1)) ^ (k13 >>> 1));
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j(zm2.q0 r1, java.lang.Object r2) {
        /*
            r2.getClass()
            int[] r0 = zm2.l.f142235a
            zm2.r0 r1 = r1.getJavaType()
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L39;
                case 2: goto L36;
                case 3: goto L33;
                case 4: goto L30;
                case 5: goto L2d;
                case 6: goto L2a;
                case 7: goto L21;
                case 8: goto L18;
                case 9: goto L13;
                default: goto L12;
            }
        L12:
            goto L3e
        L13:
            boolean r1 = r2 instanceof zm2.c
            if (r1 == 0) goto L3e
            goto L3d
        L18:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L3d
            boolean r1 = r2 instanceof zm2.u
            if (r1 == 0) goto L3e
            goto L3d
        L21:
            boolean r1 = r2 instanceof zm2.g
            if (r1 != 0) goto L3d
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L3e
            goto L3d
        L2a:
            boolean r1 = r2 instanceof java.lang.String
            goto L3b
        L2d:
            boolean r1 = r2 instanceof java.lang.Boolean
            goto L3b
        L30:
            boolean r1 = r2 instanceof java.lang.Double
            goto L3b
        L33:
            boolean r1 = r2 instanceof java.lang.Float
            goto L3b
        L36:
            boolean r1 = r2 instanceof java.lang.Long
            goto L3b
        L39:
            boolean r1 = r2 instanceof java.lang.Integer
        L3b:
            if (r1 == 0) goto L3e
        L3d:
            return
        L3e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zm2.m.j(zm2.q0, java.lang.Object):void");
    }

    public static void k(i iVar, q0 q0Var, int i13, Object obj) {
        if (q0Var != q0.GROUP) {
            iVar.X(i13, q0Var.getWireType());
            l(iVar, q0Var, obj);
        } else {
            iVar.X(i13, 3);
            ((c) obj).d(iVar);
            iVar.X(i13, 4);
        }
    }

    public static void l(i iVar, q0 q0Var, Object obj) {
        switch (l.f142236b[q0Var.ordinal()]) {
            case 1:
                iVar.z(((Double) obj).doubleValue());
                break;
            case 2:
                iVar.E(((Float) obj).floatValue());
                break;
            case 3:
                iVar.H(((Long) obj).longValue());
                break;
            case 4:
                iVar.Z(((Long) obj).longValue());
                break;
            case 5:
                iVar.G(((Integer) obj).intValue());
                break;
            case 6:
                iVar.C(((Long) obj).longValue());
                break;
            case 7:
                iVar.B(((Integer) obj).intValue());
                break;
            case 8:
                iVar.K(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 9:
                iVar.W((String) obj);
                break;
            case 10:
                if (!(obj instanceof g)) {
                    iVar.w((byte[]) obj);
                    break;
                } else {
                    iVar.x((g) obj);
                    break;
                }
            case 11:
                iVar.Y(((Integer) obj).intValue());
                break;
            case 12:
                iVar.R(((Integer) obj).intValue());
                break;
            case 13:
                iVar.S(((Long) obj).longValue());
                break;
            case 14:
                iVar.T(((Integer) obj).intValue());
                break;
            case 15:
                iVar.V(((Long) obj).longValue());
                break;
            case 16:
                iVar.getClass();
                ((c) obj).d(iVar);
                break;
            case 17:
                iVar.J((c) obj);
                break;
            case 18:
                if (!(obj instanceof u)) {
                    iVar.G(((Integer) obj).intValue());
                    break;
                } else {
                    iVar.G(((u) obj).getNumber());
                    break;
                }
        }
    }

    public final void a(r rVar, Object obj) {
        List list;
        if (!rVar.f142249d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(rVar.f142248c, obj);
        e0 e0Var = this.f142238a;
        Object obj2 = e0Var.get(rVar);
        if (obj2 == null) {
            list = new ArrayList();
            e0Var.put(rVar, list);
        } else {
            list = (List) obj2;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        e0 e0Var;
        m mVar = new m();
        int i13 = 0;
        while (true) {
            e0Var = this.f142238a;
            if (i13 >= e0Var.f142197b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) e0Var.f142197b.get(i13);
            mVar.i((r) entry.getKey(), entry.getValue());
            i13++;
        }
        for (Map.Entry entry2 : e0Var.g()) {
            mVar.i((r) entry2.getKey(), entry2.getValue());
        }
        mVar.f142240c = this.f142240c;
        return mVar;
    }

    public final void f() {
        if (this.f142239b) {
            return;
        }
        e0 e0Var = this.f142238a;
        if (!e0Var.f142199d) {
            for (int i13 = 0; i13 < e0Var.f142197b.size(); i13++) {
                Map.Entry entry = (Map.Entry) e0Var.f142197b.get(i13);
                if (((r) entry.getKey()).f142249d) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : e0Var.g()) {
                if (((r) entry2.getKey()).f142249d) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!e0Var.f142199d) {
            e0Var.f142198c = e0Var.f142198c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(e0Var.f142198c);
            e0Var.f142199d = true;
        }
        this.f142239b = true;
    }

    public final void g(Map.Entry entry) {
        r rVar = (r) entry.getKey();
        Object value = entry.getValue();
        boolean z13 = rVar.f142249d;
        e0 e0Var = this.f142238a;
        if (z13) {
            Object obj = e0Var.get(rVar);
            if (obj == null) {
                obj = new ArrayList();
            }
            for (Object obj2 : (List) value) {
                List list = (List) obj;
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj2 = bArr2;
                }
                list.add(obj2);
            }
            e0Var.put(rVar, obj);
            return;
        }
        if (rVar.f142248c.getJavaType() != r0.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            e0Var.put(rVar, value);
            return;
        }
        Object obj3 = e0Var.get(rVar);
        if (obj3 != null) {
            e0Var.put(rVar, ((o) ((c) obj3).c()).c((t) ((c) value)).a());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        e0Var.put(rVar, value);
    }

    public final void i(r rVar, Object obj) {
        boolean z13 = rVar.f142249d;
        q0 q0Var = rVar.f142248c;
        if (!z13) {
            j(q0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(q0Var, it.next());
            }
            obj = arrayList;
        }
        this.f142238a.put(rVar, obj);
    }

    public m(int i13) {
        f();
    }
}
