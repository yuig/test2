package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f33863a = new f2(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f33864b;

    static {
        new c0(0);
    }

    public c0() {
    }

    public static int a(z2 z2Var, int i13, Object obj) {
        int B = u.B(i13);
        if (z2Var == z2.GROUP) {
            B *= 2;
        }
        return b(z2Var, obj) + B;
    }

    public static int b(z2 z2Var, Object obj) {
        switch (b0.f33857b[z2Var.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = u.f34000q;
                return 8;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = u.f34000q;
                return 4;
            case 3:
                return u.F(((Long) obj).longValue());
            case 4:
                return u.F(((Long) obj).longValue());
            case 5:
                return u.t(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                Logger logger3 = u.f34000q;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                Logger logger4 = u.f34000q;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger5 = u.f34000q;
                return 1;
            case 9:
                Logger logger6 = u.f34000q;
                return ((o1) obj).getSerializedSize();
            case 10:
                Logger logger7 = u.f34000q;
                int serializedSize = ((o1) obj).getSerializedSize();
                return u.D(serializedSize) + serializedSize;
            case 11:
                return obj instanceof l ? u.l((l) obj) : u.A((String) obj);
            case 12:
                if (obj instanceof l) {
                    return u.l((l) obj);
                }
                Logger logger8 = u.f34000q;
                int length = ((byte[]) obj).length;
                return u.D(length) + length;
            case 13:
                return u.D(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = u.f34000q;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = u.f34000q;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return u.D((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return u.F((longValue >> 63) ^ (longValue << 1));
            case 18:
                return u.t(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:5:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(com.google.protobuf.k0 r2, java.lang.Object r3) {
        /*
            com.google.protobuf.z2 r0 = r2.f33918b
            java.nio.charset.Charset r1 = com.google.protobuf.w0.f34008a
            r3.getClass()
            int[] r1 = com.google.protobuf.b0.f33856a
            com.google.protobuf.a3 r0 = r0.getJavaType()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L35;
                case 2: goto L32;
                case 3: goto L2f;
                case 4: goto L2c;
                case 5: goto L29;
                case 6: goto L26;
                case 7: goto L1d;
                case 8: goto L1a;
                case 9: goto L17;
                default: goto L16;
            }
        L16:
            goto L3a
        L17:
            boolean r0 = r3 instanceof com.google.protobuf.o1
            goto L37
        L1a:
            boolean r0 = r3 instanceof java.lang.Integer
            goto L37
        L1d:
            boolean r0 = r3 instanceof com.google.protobuf.l
            if (r0 != 0) goto L39
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L3a
            goto L39
        L26:
            boolean r0 = r3 instanceof java.lang.String
            goto L37
        L29:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L37
        L2c:
            boolean r0 = r3 instanceof java.lang.Double
            goto L37
        L2f:
            boolean r0 = r3 instanceof java.lang.Float
            goto L37
        L32:
            boolean r0 = r3 instanceof java.lang.Long
            goto L37
        L35:
            boolean r0 = r3 instanceof java.lang.Integer
        L37:
            if (r0 == 0) goto L3a
        L39:
            return
        L3a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.f33917a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.protobuf.z2 r2 = r2.f33918b
            com.google.protobuf.a3 r2 = r2.getJavaType()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.c0.e(com.google.protobuf.k0, java.lang.Object):void");
    }

    public static void f(u uVar, z2 z2Var, int i13, Object obj) {
        if (z2Var == z2.GROUP) {
            uVar.X(i13, 3);
            ((o1) obj).writeTo(uVar);
            uVar.X(i13, 4);
            return;
        }
        uVar.X(i13, z2Var.getWireType());
        switch (b0.f33857b[z2Var.ordinal()]) {
            case 1:
                uVar.Q(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                uVar.O(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                uVar.b0(((Long) obj).longValue());
                break;
            case 4:
                uVar.b0(((Long) obj).longValue());
                break;
            case 5:
                uVar.S(((Integer) obj).intValue());
                break;
            case 6:
                uVar.Q(((Long) obj).longValue());
                break;
            case 7:
                uVar.O(((Integer) obj).intValue());
                break;
            case 8:
                uVar.I(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((o1) obj).writeTo(uVar);
                break;
            case 10:
                uVar.U((o1) obj);
                break;
            case 11:
                if (!(obj instanceof l)) {
                    uVar.W((String) obj);
                    break;
                } else {
                    uVar.M((l) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof l)) {
                    byte[] bArr = (byte[]) obj;
                    uVar.K(bArr, bArr.length);
                    break;
                } else {
                    uVar.M((l) obj);
                    break;
                }
            case 13:
                uVar.Z(((Integer) obj).intValue());
                break;
            case 14:
                uVar.O(((Integer) obj).intValue());
                break;
            case 15:
                uVar.Q(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                uVar.Z((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                uVar.b0((longValue >> 63) ^ (longValue << 1));
                break;
            case 18:
                uVar.S(((Integer) obj).intValue());
                break;
        }
    }

    public final void c() {
        f2 f2Var;
        if (this.f33864b) {
            return;
        }
        int i13 = 0;
        while (true) {
            f2Var = this.f33863a;
            if (i13 >= f2Var.f33887b.size()) {
                break;
            }
            Map.Entry h10 = f2Var.h(i13);
            if (h10.getValue() instanceof n0) {
                ((n0) h10.getValue()).makeImmutable();
            }
            i13++;
        }
        if (!f2Var.f33889d) {
            for (int i14 = 0; i14 < f2Var.f33887b.size(); i14++) {
                Map.Entry h13 = f2Var.h(i14);
                if (((k0) h13.getKey()).f33919c) {
                    h13.setValue(Collections.unmodifiableList((List) h13.getValue()));
                }
            }
            for (Map.Entry entry : f2Var.i()) {
                if (((k0) entry.getKey()).f33919c) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!f2Var.f33889d) {
            f2Var.f33888c = f2Var.f33888c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(f2Var.f33888c);
            f2Var.f33891f = f2Var.f33891f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(f2Var.f33891f);
            f2Var.f33889d = true;
        }
        this.f33864b = true;
    }

    public final Object clone() {
        f2 f2Var;
        c0 c0Var = new c0();
        int i13 = 0;
        while (true) {
            f2Var = this.f33863a;
            if (i13 >= f2Var.f33887b.size()) {
                break;
            }
            Map.Entry h10 = f2Var.h(i13);
            c0Var.d((k0) h10.getKey(), h10.getValue());
            i13++;
        }
        for (Map.Entry entry : f2Var.i()) {
            c0Var.d((k0) entry.getKey(), entry.getValue());
        }
        return c0Var;
    }

    public final void d(k0 k0Var, Object obj) {
        if (!k0Var.f33919c) {
            e(k0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e(k0Var, it.next());
            }
            obj = arrayList;
        }
        this.f33863a.put(k0Var, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        return this.f33863a.equals(((c0) obj).f33863a);
    }

    public final int hashCode() {
        return this.f33863a.hashCode();
    }

    public c0(int i13) {
        c();
        c();
    }
}
