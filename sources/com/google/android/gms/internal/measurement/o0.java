package com.google.android.gms.internal.measurement;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f31562a = {1, 2, 3, 4, 5, 6, 7};

    public static int A(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2) || d2 == 0.0d) {
            return 0;
        }
        return (int) ((Math.floor(Math.abs(d2)) * (d2 > 0.0d ? 1 : -1)) % 4.294967296E9d);
    }

    public static int B(byte[] bArr, int i13, l7.v vVar) {
        int G = G(bArr, i13, vVar);
        int i14 = vVar.f81884a;
        if (i14 < 0) {
            throw zzji.b();
        }
        if (i14 == 0) {
            vVar.f81886c = "";
            return G;
        }
        y7.f31712a.getClass();
        if ((G | i14 | ((bArr.length - G) - i14)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(G), Integer.valueOf(i14)));
        }
        int i15 = G + i14;
        char[] cArr = new char[i14];
        int i16 = 0;
        while (G < i15) {
            byte b13 = bArr[G];
            if (b13 < 0) {
                break;
            }
            G++;
            cArr[i16] = (char) b13;
            i16++;
        }
        while (G < i15) {
            int i17 = G + 1;
            byte b14 = bArr[G];
            if (b14 >= 0) {
                int i18 = i16 + 1;
                cArr[i16] = (char) b14;
                while (i17 < i15) {
                    byte b15 = bArr[i17];
                    if (b15 < 0) {
                        break;
                    }
                    i17++;
                    cArr[i18] = (char) b15;
                    i18++;
                }
                i16 = i18;
                G = i17;
            } else if (b14 < -32) {
                if (i17 >= i15) {
                    throw zzji.a();
                }
                G += 2;
                byte b16 = bArr[i17];
                int i19 = i16 + 1;
                if (b14 < -62 || x(b16)) {
                    throw zzji.a();
                }
                cArr[i16] = (char) ((b16 & 63) | ((b14 & 31) << 6));
                i16 = i19;
            } else {
                if (b14 >= -16) {
                    if (i17 >= i15 - 2) {
                        throw zzji.a();
                    }
                    byte b17 = bArr[i17];
                    int i23 = G + 3;
                    byte b18 = bArr[G + 2];
                    G += 4;
                    byte b19 = bArr[i23];
                    int i24 = i16 + 1;
                    if (!x(b17)) {
                        if ((((b17 + 112) + (b14 << 28)) >> 30) == 0 && !x(b18) && !x(b19)) {
                            int i25 = ((b17 & 63) << 12) | ((b14 & 7) << 18) | ((b18 & 63) << 6) | (b19 & 63);
                            cArr[i16] = (char) ((i25 >>> 10) + 55232);
                            cArr[i24] = (char) ((i25 & 1023) + 56320);
                            i16 += 2;
                        }
                    }
                    throw zzji.a();
                }
                if (i17 >= i15 - 1) {
                    throw zzji.a();
                }
                int i26 = G + 2;
                byte b23 = bArr[i17];
                G += 3;
                byte b24 = bArr[i26];
                int i27 = i16 + 1;
                if (x(b23) || ((b14 == -32 && b23 < -96) || ((b14 == -19 && b23 >= -96) || x(b24)))) {
                    throw zzji.a();
                }
                cArr[i16] = (char) (((b23 & 63) << 6) | ((b14 & 15) << 12) | (b24 & 63));
                i16 = i27;
            }
        }
        vVar.f81886c = new String(cArr, 0, i16);
        return i15;
    }

    public static void C(int i13, String str, List list) {
        if (list.size() >= i13) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i13 + " parameters found " + list.size());
    }

    public static void D(g0 g0Var, int i13, ArrayList arrayList) {
        C(i13, g0Var.name(), arrayList);
    }

    public static boolean E(n nVar) {
        if (nVar == null) {
            return false;
        }
        Double zze = nVar.zze();
        return !zze.isNaN() && zze.doubleValue() >= 0.0d && zze.equals(Double.valueOf(Math.floor(zze.doubleValue())));
    }

    public static int F(int i13, byte[] bArr) {
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    public static int G(byte[] bArr, int i13, l7.v vVar) {
        int i14 = i13 + 1;
        byte b13 = bArr[i13];
        if (b13 < 0) {
            return e(b13, bArr, i14, vVar);
        }
        vVar.f81884a = b13;
        return i14;
    }

    public static void H(int i13, String str, ArrayList arrayList) {
        if (arrayList.size() <= i13) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i13 + " parameters found " + arrayList.size());
    }

    public static int I(byte[] bArr, int i13, l7.v vVar) {
        int i14 = i13 + 1;
        long j13 = bArr[i13];
        if (j13 >= 0) {
            vVar.f81885b = j13;
            return i14;
        }
        int i15 = i13 + 2;
        byte b13 = bArr[i14];
        long j14 = (j13 & 127) | ((b13 & Byte.MAX_VALUE) << 7);
        int i16 = 7;
        while (b13 < 0) {
            int i17 = i15 + 1;
            i16 += 7;
            j14 |= (r10 & Byte.MAX_VALUE) << i16;
            b13 = bArr[i15];
            i15 = i17;
        }
        vVar.f81885b = j14;
        return i15;
    }

    public static long J(int i13, byte[] bArr) {
        return ((bArr[i13 + 7] & 255) << 56) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48);
    }

    public static double a(double d2) {
        if (Double.isNaN(d2)) {
            return 0.0d;
        }
        if (Double.isInfinite(d2) || d2 == 0.0d || d2 == -0.0d) {
            return d2;
        }
        return Math.floor(Math.abs(d2)) * (d2 > 0.0d ? 1 : -1);
    }

    public static double b(int i13, byte[] bArr) {
        return Double.longBitsToDouble(J(i13, bArr));
    }

    public static int c(int i13, byte[] bArr, int i14, int i15, i6 i6Var, l7.v vVar) {
        d6 d6Var = (d6) i6Var;
        int G = G(bArr, i14, vVar);
        d6Var.c(vVar.f81884a);
        while (G < i15) {
            int G2 = G(bArr, G, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            G = G(bArr, G2, vVar);
            d6Var.c(vVar.f81884a);
        }
        return G;
    }

    public static int d(int i13, byte[] bArr, int i14, int i15, q7 q7Var, l7.v vVar) {
        if ((i13 >>> 3) == 0) {
            throw new zzji("Protocol message contained an invalid tag (zero).");
        }
        int i16 = i13 & 7;
        if (i16 == 0) {
            int I = I(bArr, i14, vVar);
            q7Var.c(i13, Long.valueOf(vVar.f81885b));
            return I;
        }
        if (i16 == 1) {
            q7Var.c(i13, Long.valueOf(J(i14, bArr)));
            return i14 + 8;
        }
        if (i16 == 2) {
            int G = G(bArr, i14, vVar);
            int i17 = vVar.f81884a;
            if (i17 < 0) {
                throw zzji.b();
            }
            if (i17 > bArr.length - G) {
                throw zzji.d();
            }
            if (i17 == 0) {
                q7Var.c(i13, o5.f31566b);
            } else {
                q7Var.c(i13, o5.f(bArr, G, i17));
            }
            return G + i17;
        }
        if (i16 != 3) {
            if (i16 != 5) {
                throw new zzji("Protocol message contained an invalid tag (zero).");
            }
            q7Var.c(i13, Integer.valueOf(F(i14, bArr)));
            return i14 + 4;
        }
        q7 f13 = q7.f();
        int i18 = (i13 & (-8)) | 4;
        int i19 = 0;
        while (true) {
            if (i14 >= i15) {
                break;
            }
            int G2 = G(bArr, i14, vVar);
            int i23 = vVar.f81884a;
            i19 = i23;
            if (i23 == i18) {
                i14 = G2;
                break;
            }
            int d2 = d(i19, bArr, G2, i15, f13, vVar);
            i19 = i23;
            i14 = d2;
        }
        if (i14 > i15 || i19 != i18) {
            throw zzji.c();
        }
        q7Var.c(i13, f13);
        return i14;
    }

    public static int e(int i13, byte[] bArr, int i14, l7.v vVar) {
        int i15 = i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i16 = i14 + 1;
        byte b13 = bArr[i14];
        if (b13 >= 0) {
            vVar.f81884a = i15 | (b13 << 7);
            return i16;
        }
        int i17 = i15 | ((b13 & Byte.MAX_VALUE) << 7);
        int i18 = i14 + 2;
        byte b14 = bArr[i16];
        if (b14 >= 0) {
            vVar.f81884a = i17 | (b14 << 14);
            return i18;
        }
        int i19 = i17 | ((b14 & Byte.MAX_VALUE) << 14);
        int i23 = i14 + 3;
        byte b15 = bArr[i18];
        if (b15 >= 0) {
            vVar.f81884a = i19 | (b15 << 21);
            return i23;
        }
        int i24 = i19 | ((b15 & Byte.MAX_VALUE) << 21);
        int i25 = i14 + 4;
        byte b16 = bArr[i23];
        if (b16 >= 0) {
            vVar.f81884a = i24 | (b16 << 28);
            return i25;
        }
        int i26 = i24 | ((b16 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i27 = i25 + 1;
            if (bArr[i25] >= 0) {
                vVar.f81884a = i26;
                return i27;
            }
            i25 = i27;
        }
    }

    public static int f(n7 n7Var, int i13, byte[] bArr, int i14, int i15, i6 i6Var, l7.v vVar) {
        a6 zza = n7Var.zza();
        int i16 = i(zza, n7Var, bArr, i14, i15, vVar);
        n7Var.d(zza);
        vVar.f81886c = zza;
        i6Var.add(zza);
        while (i16 < i15) {
            int G = G(bArr, i16, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            a6 zza2 = n7Var.zza();
            int i17 = i(zza2, n7Var, bArr, G, i15, vVar);
            n7Var.d(zza2);
            vVar.f81886c = zza2;
            i6Var.add(zza2);
            i16 = i17;
        }
        return i16;
    }

    public static int g(n7 n7Var, byte[] bArr, int i13, int i14, int i15, l7.v vVar) {
        a6 zza = n7Var.zza();
        int h10 = h(zza, n7Var, bArr, i13, i14, i15, vVar);
        n7Var.d(zza);
        vVar.f81886c = zza;
        return h10;
    }

    public static int h(Object obj, n7 n7Var, byte[] bArr, int i13, int i14, int i15, l7.v vVar) {
        int h10 = ((c7) n7Var).h(obj, bArr, i13, i14, i15, vVar);
        vVar.f81886c = obj;
        return h10;
    }

    public static int i(Object obj, n7 n7Var, byte[] bArr, int i13, int i14, l7.v vVar) {
        int i15 = i13 + 1;
        int i16 = bArr[i13];
        if (i16 < 0) {
            i15 = e(i16, bArr, i15, vVar);
            i16 = vVar.f81884a;
        }
        int i17 = i15;
        if (i16 < 0 || i16 > i14 - i17) {
            throw zzji.d();
        }
        int i18 = i16 + i17;
        n7Var.e(obj, bArr, i17, i18, vVar);
        vVar.f81886c = obj;
        return i18;
    }

    public static int j(byte[] bArr, int i13, i6 i6Var, l7.v vVar) {
        d6 d6Var = (d6) i6Var;
        int G = G(bArr, i13, vVar);
        int i14 = vVar.f81884a + G;
        while (G < i14) {
            G = G(bArr, G, vVar);
            d6Var.c(vVar.f81884a);
        }
        if (G == i14) {
            return G;
        }
        throw zzji.d();
    }

    public static int k(byte[] bArr, int i13, l7.v vVar) {
        int G = G(bArr, i13, vVar);
        int i14 = vVar.f81884a;
        if (i14 < 0) {
            throw zzji.b();
        }
        if (i14 > bArr.length - G) {
            throw zzji.d();
        }
        if (i14 == 0) {
            vVar.f81886c = o5.f31566b;
            return G;
        }
        vVar.f81886c = o5.f(bArr, G, i14);
        return G + i14;
    }

    public static e l(e eVar, m.h hVar, o oVar, Boolean bool, Boolean bool2) {
        e eVar2 = new e();
        Iterator r13 = eVar.r();
        while (r13.hasNext()) {
            int intValue = ((Integer) r13.next()).intValue();
            if (eVar.p(intValue)) {
                n a13 = oVar.a(hVar, Arrays.asList(eVar.e(intValue), new g(Double.valueOf(intValue)), eVar));
                if (a13.zzd().equals(bool)) {
                    return eVar2;
                }
                if (bool2 == null || a13.zzd().equals(bool2)) {
                    eVar2.n(intValue, a13);
                }
            }
        }
        return eVar2;
    }

    public static n m(e eVar, m.h hVar, ArrayList arrayList, boolean z13) {
        n nVar;
        C(1, "reduce", arrayList);
        H(2, "reduce", arrayList);
        n P = hVar.P((n) arrayList.get(0));
        if (!(P instanceof j)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            nVar = hVar.P((n) arrayList.get(1));
            if (nVar instanceof h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (eVar.i() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            nVar = null;
        }
        j jVar = (j) P;
        int i13 = eVar.i();
        int i14 = z13 ? 0 : i13 - 1;
        int i15 = z13 ? i13 - 1 : 0;
        int i16 = z13 ? 1 : -1;
        if (nVar == null) {
            nVar = eVar.e(i14);
            i14 += i16;
        }
        while ((i15 - i14) * i16 >= 0) {
            if (eVar.p(i14)) {
                nVar = jVar.a(hVar, Arrays.asList(nVar, eVar.e(i14), new g(Double.valueOf(i14)), eVar));
                if (nVar instanceof h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i14 += i16;
            } else {
                i14 += i16;
            }
        }
        return nVar;
    }

    public static n n(i iVar, p pVar, m.h hVar, ArrayList arrayList) {
        String str = pVar.f31578a;
        if (iVar.b(str)) {
            n zza = iVar.zza(str);
            if (zza instanceof j) {
                return ((j) zza).a(hVar, arrayList);
            }
            throw new IllegalArgumentException(a.a.C(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(a.a.j("Object has no function ", str));
        }
        u(1, "hasOwnProperty", arrayList);
        return iVar.b(hVar.P((n) arrayList.get(0)).zzf()) ? n.Kn : n.Ln;
    }

    public static n o(h4 h4Var) {
        if (h4Var == null) {
            return n.Fn;
        }
        int i13 = p5.f31583a[h4Var.s().ordinal()];
        if (i13 == 1) {
            return h4Var.A() ? new p(h4Var.v()) : n.Mn;
        }
        if (i13 == 2) {
            return h4Var.z() ? new g(Double.valueOf(h4Var.r())) : new g(null);
        }
        if (i13 == 3) {
            return h4Var.y() ? new f(Boolean.valueOf(h4Var.x())) : new f(null);
        }
        if (i13 != 4) {
            if (i13 != 5) {
                throw new IllegalStateException("Invalid entity: ".concat(String.valueOf(h4Var)));
            }
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List w13 = h4Var.w();
        ArrayList arrayList = new ArrayList();
        Iterator it = w13.iterator();
        while (it.hasNext()) {
            arrayList.add(o((h4) it.next()));
        }
        return new q(h4Var.u(), arrayList);
    }

    public static n p(Object obj) {
        if (obj == null) {
            return n.Gn;
        }
        if (obj instanceof String) {
            return new p((String) obj);
        }
        if (obj instanceof Double) {
            return new g((Double) obj);
        }
        if (obj instanceof Long) {
            return new g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new f((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            e eVar = new e();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                eVar.f(p(it.next()));
            }
            return eVar;
        }
        m mVar = new m();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            n p13 = p(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                mVar.c((String) obj2, p13);
            }
        }
        return mVar;
    }

    public static g0 q(String str) {
        g0 zza = (str == null || str.isEmpty()) ? null : g0.zza(Integer.parseInt(str));
        if (zza != null) {
            return zza;
        }
        throw new IllegalArgumentException(a.a.j("Unsupported commandId ", str));
    }

    public static Object r(n nVar) {
        if (n.Gn.equals(nVar)) {
            return null;
        }
        if (n.Fn.equals(nVar)) {
            return "";
        }
        if (nVar instanceof m) {
            return t((m) nVar);
        }
        if (!(nVar instanceof e)) {
            return !nVar.zze().isNaN() ? nVar.zze() : nVar.zzf();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((e) nVar).iterator();
        while (true) {
            r rVar = (r) it;
            if (!rVar.hasNext()) {
                return arrayList;
            }
            Object r13 = r((n) rVar.next());
            if (r13 != null) {
                arrayList.add(r13);
            }
        }
    }

    public static String s(o5 o5Var) {
        StringBuilder sb3 = new StringBuilder(o5Var.j());
        for (int i13 = 0; i13 < o5Var.j(); i13++) {
            byte d2 = o5Var.d(i13);
            if (d2 == 34) {
                sb3.append("\\\"");
            } else if (d2 == 39) {
                sb3.append("\\'");
            } else if (d2 != 92) {
                switch (d2) {
                    case 7:
                        sb3.append("\\a");
                        break;
                    case 8:
                        sb3.append("\\b");
                        break;
                    case 9:
                        sb3.append("\\t");
                        break;
                    case 10:
                        sb3.append("\\n");
                        break;
                    case 11:
                        sb3.append("\\v");
                        break;
                    case 12:
                        sb3.append("\\f");
                        break;
                    case 13:
                        sb3.append("\\r");
                        break;
                    default:
                        if (d2 < 32 || d2 > 126) {
                            sb3.append('\\');
                            sb3.append((char) (((d2 >>> 6) & 3) + 48));
                            sb3.append((char) (((d2 >>> 3) & 7) + 48));
                            sb3.append((char) ((d2 & 7) + 48));
                            break;
                        } else {
                            sb3.append((char) d2);
                            break;
                        }
                        break;
                }
            } else {
                sb3.append("\\\\");
            }
        }
        return sb3.toString();
    }

    public static HashMap t(m mVar) {
        HashMap hashMap = new HashMap();
        mVar.getClass();
        Iterator it = new ArrayList(mVar.f31516a.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object r13 = r(mVar.zza(str));
            if (r13 != null) {
                hashMap.put(str, r13);
            }
        }
        return hashMap;
    }

    public static void u(int i13, String str, List list) {
        if (list.size() == i13) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i13 + " parameters found " + list.size());
    }

    public static void v(g0 g0Var, int i13, ArrayList arrayList) {
        u(i13, g0Var.name(), arrayList);
    }

    public static void w(m.h hVar) {
        int A = A(hVar.Q("runtime.counter").zze().doubleValue() + 1.0d);
        if (A > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        hVar.W("runtime.counter", new g(Double.valueOf(A)));
    }

    public static boolean x(byte b13) {
        return b13 > -65;
    }

    public static boolean y(n nVar, n nVar2) {
        if (!nVar.getClass().equals(nVar2.getClass())) {
            return false;
        }
        if ((nVar instanceof t) || (nVar instanceof l)) {
            return true;
        }
        if (!(nVar instanceof g)) {
            return nVar instanceof p ? nVar.zzf().equals(nVar2.zzf()) : nVar instanceof f ? nVar.zzd().equals(nVar2.zzd()) : nVar == nVar2;
        }
        if (Double.isNaN(nVar.zze().doubleValue()) || Double.isNaN(nVar2.zze().doubleValue())) {
            return false;
        }
        return nVar.zze().equals(nVar2.zze());
    }

    public static float z(int i13, byte[] bArr) {
        return Float.intBitsToFloat(F(i13, bArr));
    }
}
