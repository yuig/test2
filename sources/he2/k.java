package he2;

import a.cb;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import e0.t;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kh2.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.collections.g0;
import kotlin.collections.k0;
import kotlin.collections.q0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pd2.r0;
import qo2.e1;
import qo2.l1;
import qo2.p0;
import rl2.u;
import ul2.c2;
import ul2.o1;
import ul2.q1;
import ul2.w1;

/* loaded from: classes4.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f68996a = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f68997b = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    public static void A(int[] iArr, int i13, int[] iArr2, int i14, int[] iArr3) {
        long j13 = (iArr[i13] & 4294967295L) - (iArr2[i14] & 4294967295L);
        iArr3[0] = (int) j13;
        long j14 = ((iArr[i13 + 1] & 4294967295L) - (iArr2[i14 + 1] & 4294967295L)) + (j13 >> 32);
        iArr3[1] = (int) j14;
        long j15 = ((iArr[i13 + 2] & 4294967295L) - (iArr2[i14 + 2] & 4294967295L)) + (j14 >> 32);
        iArr3[2] = (int) j15;
        long j16 = ((iArr[i13 + 3] & 4294967295L) - (iArr2[i14 + 3] & 4294967295L)) + (j15 >> 32);
        iArr3[3] = (int) j16;
        long j17 = ((iArr[i13 + 4] & 4294967295L) - (iArr2[i14 + 4] & 4294967295L)) + (j16 >> 32);
        iArr3[4] = (int) j17;
        long j18 = ((iArr[i13 + 5] & 4294967295L) - (iArr2[i14 + 5] & 4294967295L)) + (j17 >> 32);
        iArr3[5] = (int) j18;
        long j19 = ((iArr[i13 + 6] & 4294967295L) - (iArr2[i14 + 6] & 4294967295L)) + (j18 >> 32);
        iArr3[6] = (int) j19;
        iArr3[7] = (int) (((iArr[i13 + 7] & 4294967295L) - (iArr2[i14 + 7] & 4294967295L)) + (j19 >> 32));
    }

    public static void B(int[] iArr, int[] iArr2) {
        long j13 = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j13;
        long j14 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j13 >> 32);
        iArr2[1] = (int) j14;
        long j15 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j14 >> 32);
        iArr2[2] = (int) j15;
        long j16 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j15 >> 32);
        iArr2[3] = (int) j16;
        long j17 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j16 >> 32);
        iArr2[4] = (int) j17;
        long j18 = ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L)) + (j17 >> 32);
        iArr2[5] = (int) j18;
        long j19 = ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L)) + (j18 >> 32);
        iArr2[6] = (int) j19;
        iArr2[7] = (int) (((iArr2[7] & 4294967295L) - (4294967295L & iArr[7])) + (j19 >> 32));
    }

    public static BigInteger C(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = iArr[i13];
            if (i14 != 0) {
                t.K0(bArr, i14, (7 - i13) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger D(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i13 = 0; i13 < 4; i13++) {
            long j13 = jArr[i13];
            if (j13 != 0) {
                t.N0(j13, (3 - i13) << 3, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static final td2.a E(nd2.b bVar, Context context) {
        String str = bVar.f90426a;
        Map map = bVar.f90429d;
        LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), I((md2.a) entry.getValue(), context));
        }
        return new td2.a(str, bVar.f90427b, bVar.f90431f, linkedHashMap);
    }

    public static final ud2.a F(od2.a aVar, Context context) {
        String name = aVar.f94185a;
        Map map = aVar.f94187c;
        LinkedHashMap resources = new LinkedHashMap(y0.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            resources.put(entry.getKey(), I((md2.a) entry.getValue(), context));
        }
        Intrinsics.checkNotNullParameter(name, "name");
        String shader = aVar.f94186b;
        Intrinsics.checkNotNullParameter(shader, "shader");
        r0 settings = aVar.f94189e;
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ud2.a(name, shader, settings, resources);
    }

    public static final ud2.b G(od2.b bVar, Context context) {
        String name = bVar.f94185a;
        Map map = bVar.f94187c;
        LinkedHashMap resources = new LinkedHashMap(y0.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            resources.put(entry.getKey(), I((md2.a) entry.getValue(), context));
        }
        Intrinsics.checkNotNullParameter(name, "name");
        String shader = bVar.f94186b;
        Intrinsics.checkNotNullParameter(shader, "shader");
        r0 settings = bVar.f94189e;
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ud2.b(name, shader, settings, resources);
    }

    public static final ud2.c H(od2.c cVar, Context context) {
        Map map = cVar.f94187c;
        LinkedHashMap resources = new LinkedHashMap(y0.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            resources.put(entry.getKey(), I((md2.a) entry.getValue(), context));
        }
        String name = cVar.f94185a;
        Intrinsics.checkNotNullParameter(name, "name");
        String shader = cVar.f94186b;
        Intrinsics.checkNotNullParameter(shader, "shader");
        r0 settings = cVar.f94189e;
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ud2.c(name, shader, settings, resources);
    }

    public static final vd2.c I(md2.a aVar, Context context) {
        int parseInt = Integer.parseInt(aVar.f86966b);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inScaled = false;
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), parseInt, options);
        int i13 = i.f68992a[aVar.f86965a.ordinal()];
        if (i13 == 1) {
            Intrinsics.f(decodeResource);
            return new vd2.b(decodeResource);
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.f(decodeResource);
        return new vd2.a(decodeResource);
    }

    public static void J(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    public static final fe2.b a(ke2.i iVar, Context context) {
        Bitmap bitmap = iVar.f79338f;
        Intrinsics.f(bitmap);
        fe2.b bVar = new fe2.b(bitmap);
        bVar.f62088n = iVar.b();
        Bitmap bitmap2 = bVar.f62087m;
        bVar.f62089o = (bitmap2.getHeight() * bVar.f62088n) / bitmap2.getWidth();
        bVar.a(iVar.f79339g);
        gd2.c cVar = iVar.f79341i;
        ArrayList arrayList = new ArrayList(g0.q(cVar, 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(G((od2.b) it.next(), context));
        }
        k0.u(arrayList, bVar.f58821f);
        gd2.c cVar2 = iVar.f79342j;
        ArrayList arrayList2 = new ArrayList(g0.q(cVar2, 10));
        Iterator it2 = cVar2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(F((od2.a) it2.next(), context));
        }
        k0.u(arrayList2, bVar.f58822g);
        gd2.c cVar3 = iVar.f79340h;
        ArrayList arrayList3 = new ArrayList(g0.q(cVar3, 10));
        Iterator it3 = cVar3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(E((nd2.b) it3.next(), context));
        }
        k0.u(arrayList3, bVar.f58820e);
        od2.c cVar4 = iVar.f79343k;
        bVar.f58823h.d(bVar, ee2.d.f58814i[0], cVar4 != null ? H(cVar4, context) : null);
        return bVar;
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j13;
        long j14 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j13 >>> 32);
        iArr3[1] = (int) j14;
        long j15 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j14 >>> 32);
        iArr3[2] = (int) j15;
        long j16 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j15 >>> 32);
        iArr3[3] = (int) j16;
        long j17 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j16 >>> 32);
        iArr3[4] = (int) j17;
        long j18 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j17 >>> 32);
        iArr3[5] = (int) j18;
        long j19 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j18 >>> 32);
        iArr3[6] = (int) j19;
        long j23 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (j19 >>> 32);
        iArr3[7] = (int) j23;
        return (int) (j23 >>> 32);
    }

    public static int c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j13;
        long j14 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j13 >>> 32);
        iArr3[1] = (int) j14;
        long j15 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j14 >>> 32);
        iArr3[2] = (int) j15;
        long j16 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j15 >>> 32);
        iArr3[3] = (int) j16;
        long j17 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j16 >>> 32);
        iArr3[4] = (int) j17;
        long j18 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j17 >>> 32);
        iArr3[5] = (int) j18;
        long j19 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L) + (j18 >>> 32);
        iArr3[6] = (int) j19;
        long j23 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (iArr3[7] & 4294967295L) + (j19 >>> 32);
        iArr3[7] = (int) j23;
        return (int) (j23 >>> 32);
    }

    public static int d(int i13, int i14, int i15, int[] iArr, int[] iArr2) {
        long j13 = (iArr[i13] & 4294967295L) + (iArr2[i14] & 4294967295L) + (i15 & 4294967295L);
        iArr2[i14] = (int) j13;
        long j14 = (iArr[i13 + 1] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j13 >>> 32);
        iArr2[i14 + 1] = (int) j14;
        long j15 = (iArr[i13 + 2] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j14 >>> 32);
        iArr2[i14 + 2] = (int) j15;
        long j16 = (iArr[i13 + 3] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j15 >>> 32);
        iArr2[i14 + 3] = (int) j16;
        long j17 = (iArr[i13 + 4] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j16 >>> 32);
        iArr2[i14 + 4] = (int) j17;
        long j18 = (iArr[i13 + 5] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j17 >>> 32);
        iArr2[i14 + 5] = (int) j18;
        long j19 = (iArr[i13 + 6] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j18 >>> 32);
        iArr2[i14 + 6] = (int) j19;
        long j23 = (iArr[i13 + 7] & 4294967295L) + (4294967295L & iArr2[r10]) + (j19 >>> 32);
        iArr2[i14 + 7] = (int) j23;
        return (int) (j23 >>> 32);
    }

    public static int e(int[] iArr, int[] iArr2) {
        long j13 = (iArr[8] & 4294967295L) + (iArr2[16] & 4294967295L);
        int i13 = (int) j13;
        iArr[8] = i13;
        iArr2[16] = i13;
        long j14 = (iArr[9] & 4294967295L) + (iArr2[17] & 4294967295L) + (j13 >>> 32);
        int i14 = (int) j14;
        iArr[9] = i14;
        iArr2[17] = i14;
        long j15 = (iArr[10] & 4294967295L) + (iArr2[18] & 4294967295L) + (j14 >>> 32);
        int i15 = (int) j15;
        iArr[10] = i15;
        iArr2[18] = i15;
        long j16 = (iArr[11] & 4294967295L) + (iArr2[19] & 4294967295L) + (j15 >>> 32);
        int i16 = (int) j16;
        iArr[11] = i16;
        iArr2[19] = i16;
        long j17 = (iArr[12] & 4294967295L) + (iArr2[20] & 4294967295L) + (j16 >>> 32);
        int i17 = (int) j17;
        iArr[12] = i17;
        iArr2[20] = i17;
        long j18 = (iArr[13] & 4294967295L) + (iArr2[21] & 4294967295L) + (j17 >>> 32);
        int i18 = (int) j18;
        iArr[13] = i18;
        iArr2[21] = i18;
        long j19 = (iArr[14] & 4294967295L) + (iArr2[22] & 4294967295L) + (j18 >>> 32);
        int i19 = (int) j19;
        iArr[14] = i19;
        iArr2[22] = i19;
        long j23 = (iArr[15] & 4294967295L) + (4294967295L & iArr2[23]) + (j19 >>> 32);
        int i23 = (int) j23;
        iArr[15] = i23;
        iArr2[23] = i23;
        return (int) (j23 >>> 32);
    }

    public static boolean f(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z13;
        int i13 = 7;
        while (true) {
            z13 = true;
            if (i13 < 0) {
                break;
            }
            int i14 = iArr[8 + i13] ^ Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE ^ iArr2[i13];
            if (i14 < i15) {
                z13 = false;
                break;
            }
            if (i14 > i15) {
                break;
            }
            i13--;
        }
        if (z13) {
            A(iArr, 8, iArr2, 0, iArr3);
        } else {
            A(iArr2, 0, iArr, 8, iArr3);
        }
        return z13;
    }

    public static boolean g(int[] iArr, int[] iArr2) {
        for (int i13 = 7; i13 >= 0; i13--) {
            if (iArr[i13] != iArr2[i13]) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(long[] jArr, long[] jArr2) {
        for (int i13 = 3; i13 >= 0; i13--) {
            if (jArr[i13] != jArr2[i13]) {
                return false;
            }
        }
        return true;
    }

    public static int[] i(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[8];
        int i13 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i13] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i13++;
        }
        return iArr;
    }

    public static long[] j(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[4];
        int i13 = 0;
        while (bigInteger.signum() != 0) {
            jArr[i13] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i13++;
        }
        return jArr;
    }

    public static int k(int[] iArr) {
        return iArr[0] & 1;
    }

    public static final Field l(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        o1 c13 = c2.c(uVar);
        if (c13 != null) {
            return (Field) c13.f122571k.getValue();
        }
        return null;
    }

    public static final Method m(rl2.g gVar) {
        vl2.g i13;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        ul2.t a13 = c2.a(gVar);
        Member b13 = (a13 == null || (i13 = a13.i()) == null) ? null : i13.b();
        if (b13 instanceof Method) {
            return (Method) b13;
        }
        return null;
    }

    public static final Type n(q1 q1Var) {
        Intrinsics.checkNotNullParameter(q1Var, "<this>");
        w1 w1Var = q1Var.f122586b;
        Type type = w1Var != null ? (Type) w1Var.invoke() : null;
        if (type != null) {
            return type;
        }
        Intrinsics.checkNotNullParameter(q1Var, "<this>");
        Type type2 = w1Var != null ? (Type) w1Var.invoke() : null;
        return type2 != null ? type2 : rl2.g0.n(q1Var, false);
    }

    public static boolean o(int[] iArr, int[] iArr2) {
        for (int i13 = 7; i13 >= 0; i13--) {
            int i14 = iArr[i13] ^ Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE ^ iArr2[i13];
            if (i14 < i15) {
                return false;
            }
            if (i14 > i15) {
                return true;
            }
        }
        return true;
    }

    public static boolean p(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i13 = 1; i13 < 8; i13++) {
            if (iArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean q(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i13 = 1; i13 < 4; i13++) {
            if (jArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean r(int[] iArr) {
        for (int i13 = 0; i13 < 8; i13++) {
            if (iArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean s(long[] jArr) {
        for (int i13 = 0; i13 < 4; i13++) {
            if (jArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void t(int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = iArr2[0] & 4294967295L;
        long j14 = iArr2[1] & 4294967295L;
        long j15 = iArr2[2] & 4294967295L;
        long j16 = iArr2[3] & 4294967295L;
        long j17 = iArr2[4] & 4294967295L;
        long j18 = iArr2[5] & 4294967295L;
        long j19 = iArr2[6] & 4294967295L;
        long j23 = iArr2[7] & 4294967295L;
        long j24 = iArr[0] & 4294967295L;
        long j25 = j24 * j13;
        iArr3[0] = (int) j25;
        long j26 = (j24 * j14) + (j25 >>> 32);
        iArr3[1] = (int) j26;
        long j27 = (j24 * j15) + (j26 >>> 32);
        iArr3[2] = (int) j27;
        long j28 = (j24 * j16) + (j27 >>> 32);
        iArr3[3] = (int) j28;
        long j29 = (j24 * j17) + (j28 >>> 32);
        iArr3[4] = (int) j29;
        long j33 = (j24 * j18) + (j29 >>> 32);
        iArr3[5] = (int) j33;
        long j34 = (j24 * j19) + (j33 >>> 32);
        iArr3[6] = (int) j34;
        long j35 = (j24 * j23) + (j34 >>> 32);
        iArr3[7] = (int) j35;
        iArr3[8] = (int) (j35 >>> 32);
        int i13 = 1;
        for (int i14 = 8; i13 < i14; i14 = 8) {
            long j36 = iArr[i13] & 4294967295L;
            long j37 = j13;
            long j38 = (j36 * j13) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j38;
            int i15 = i13 + 1;
            long j39 = (j36 * j14) + (iArr3[i15] & 4294967295L) + (j38 >>> 32);
            iArr3[i15] = (int) j39;
            long j43 = j14;
            long j44 = (j36 * j15) + (iArr3[r18] & 4294967295L) + (j39 >>> 32);
            iArr3[i13 + 2] = (int) j44;
            long j45 = (j36 * j16) + (iArr3[r6] & 4294967295L) + (j44 >>> 32);
            iArr3[i13 + 3] = (int) j45;
            long j46 = (j36 * j17) + (iArr3[r6] & 4294967295L) + (j45 >>> 32);
            iArr3[i13 + 4] = (int) j46;
            long j47 = (j36 * j18) + (iArr3[r6] & 4294967295L) + (j46 >>> 32);
            iArr3[i13 + 5] = (int) j47;
            long j48 = (j36 * j19) + (iArr3[r6] & 4294967295L) + (j47 >>> 32);
            iArr3[i13 + 6] = (int) j48;
            long j49 = j48 >>> 32;
            long j53 = (j36 * j23) + (iArr3[r3] & 4294967295L) + j49;
            iArr3[i13 + 7] = (int) j53;
            iArr3[i13 + 8] = (int) (j53 >>> 32);
            j13 = j37;
            i13 = i15;
            j14 = j43;
        }
    }

    public static int u(int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = iArr2[0] & 4294967295L;
        long j14 = iArr2[1] & 4294967295L;
        long j15 = iArr2[2] & 4294967295L;
        long j16 = iArr2[3] & 4294967295L;
        long j17 = iArr2[4] & 4294967295L;
        long j18 = iArr2[5] & 4294967295L;
        long j19 = iArr2[6] & 4294967295L;
        long j23 = iArr2[7] & 4294967295L;
        long j24 = 0;
        int i13 = 0;
        while (i13 < 8) {
            long j25 = j23;
            long j26 = iArr[i13] & 4294967295L;
            long j27 = j18;
            long j28 = (iArr3[i13] & 4294967295L) + (j26 * j13);
            iArr3[i13] = (int) j28;
            int i14 = i13 + 1;
            long j29 = j14;
            long j33 = (j26 * j14) + (iArr3[i14] & 4294967295L) + (j28 >>> 32);
            iArr3[i14] = (int) j33;
            long j34 = (j26 * j15) + (iArr3[r27] & 4294967295L) + (j33 >>> 32);
            iArr3[i13 + 2] = (int) j34;
            long j35 = (j26 * j16) + (iArr3[r8] & 4294967295L) + (j34 >>> 32);
            iArr3[i13 + 3] = (int) j35;
            long j36 = (j26 * j17) + (iArr3[r8] & 4294967295L) + (j35 >>> 32);
            iArr3[i13 + 4] = (int) j36;
            long j37 = (j26 * j27) + (iArr3[r8] & 4294967295L) + (j36 >>> 32);
            iArr3[i13 + 5] = (int) j37;
            long j38 = (j26 * j19) + (iArr3[r8] & 4294967295L) + (j37 >>> 32);
            iArr3[i13 + 6] = (int) j38;
            long j39 = (j26 * j25) + (iArr3[r8] & 4294967295L) + (j38 >>> 32);
            iArr3[i13 + 7] = (int) j39;
            long j43 = j24 + (iArr3[r2] & 4294967295L) + (j39 >>> 32);
            iArr3[i13 + 8] = (int) j43;
            j24 = j43 >>> 32;
            i13 = i14;
            j23 = j25;
            j18 = j27;
            j14 = j29;
            j15 = j15;
        }
        return (int) j24;
    }

    public static final Class v(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
            return v(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            Object B = c0.B(upperBounds);
            Intrinsics.checkNotNullExpressionValue(B, "first(...)");
            return v((Type) B);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            Intrinsics.checkNotNullExpressionValue(genericComponentType, "getGenericComponentType(...)");
            return v(genericComponentType);
        }
        StringBuilder sb3 = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb3.append(type);
        sb3.append(" has type ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, type.getClass(), sb3));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:55|(1:(2:57|(1:60)(1:59))(2:119|120))|(9:108|109|110|111|112|113|114|(10:77|78|(1:(3:80|(1:103)(1:(1:86)(2:83|84))|85)(2:104|(1:106)))|87|(2:89|(7:91|92|93|94|(2:96|97)|99|97))|102|94|(0)|99|97)(1:67)|(3:69|(3:71|(1:73)|75)|76))|62|63|(1:65)|77|78|(2:(0)(0)|85)|87|(0)|102|94|(0)|99|97|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01de, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0147, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0151, code lost:
    
        if (r14 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0105, code lost:
    
        if (r14 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r5 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0220, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r3.b(r2), r3.b(no2.d.class)) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c7 A[Catch: NoSuchFieldException -> 0x01de, TryCatch #2 {NoSuchFieldException -> 0x01de, blocks: (B:78:0x01bb, B:80:0x01c7, B:89:0x01e5, B:85:0x01db), top: B:77:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5 A[Catch: NoSuchFieldException -> 0x01de, TRY_LEAVE, TryCatch #2 {NoSuchFieldException -> 0x01de, blocks: (B:78:0x01bb, B:80:0x01c7, B:89:0x01e5, B:85:0x01db), top: B:77:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f7 A[Catch: NoSuchFieldException -> 0x01fa, TRY_LEAVE, TryCatch #1 {NoSuchFieldException -> 0x01fa, blocks: (B:93:0x01ec, B:94:0x01f3, B:96:0x01f7), top: B:92:0x01ec }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final no2.b w(to2.d r17, java.lang.Class r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: he2.k.w(to2.d, java.lang.Class, java.util.List):no2.b");
    }

    public static final no2.b x(to2.d dVar, Type type, boolean z13) {
        ArrayList<no2.b> arrayList;
        no2.b elementSerializer;
        no2.b elementSerializer2;
        rl2.d kClass;
        if (type instanceof GenericArrayType) {
            Type type2 = ((GenericArrayType) type).getGenericComponentType();
            if (type2 instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                type2 = (Type) c0.B(upperBounds);
            }
            Intrinsics.f(type2);
            if (z13) {
                elementSerializer2 = w.w0(dVar, type2);
            } else {
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(type2, "type");
                elementSerializer2 = x(dVar, type2, false);
                if (elementSerializer2 == null) {
                    return null;
                }
            }
            if (type2 instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type2).getRawType();
                Intrinsics.g(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                kClass = l0.w0((Class) rawType);
            } else {
                if (!(type2 instanceof rl2.d)) {
                    throw new IllegalStateException(cb.n(kotlin.jvm.internal.k0.f80436a, type2.getClass(), new StringBuilder("unsupported type in GenericArray: ")));
                }
                kClass = (rl2.d) type2;
            }
            Intrinsics.g(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(elementSerializer2, "elementSerializer");
            return new e1(kClass, elementSerializer2);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return w(dVar, cls, q0.f80391a);
            }
            Class<?> type3 = cls.getComponentType();
            Intrinsics.checkNotNullExpressionValue(type3, "getComponentType(...)");
            if (z13) {
                elementSerializer = w.w0(dVar, type3);
            } else {
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(type3, "type");
                elementSerializer = x(dVar, type3, false);
                if (elementSerializer == null) {
                    return null;
                }
            }
            rl2.d kClass2 = l0.w0(type3);
            Intrinsics.checkNotNullParameter(kClass2, "kClass");
            Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
            return new e1(kClass2, elementSerializer);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
                Object B = c0.B(upperBounds2);
                Intrinsics.checkNotNullExpressionValue(B, "first(...)");
                return x(dVar, (Type) B, true);
            }
            StringBuilder sb3 = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
            sb3.append(type);
            sb3.append(" has type ");
            throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, type.getClass(), sb3));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType2 = parameterizedType.getRawType();
        Intrinsics.g(rawType2, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls2 = (Class) rawType2;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.f(actualTypeArguments);
        if (z13) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type4 : actualTypeArguments) {
                Intrinsics.f(type4);
                arrayList.add(w.w0(dVar, type4));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type5 : actualTypeArguments) {
                Intrinsics.f(type5);
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(type5, "type");
                no2.b x13 = x(dVar, type5, false);
                if (x13 == null) {
                    return null;
                }
                arrayList.add(x13);
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            no2.b elementSerializer3 = (no2.b) arrayList.get(0);
            Intrinsics.checkNotNullParameter(elementSerializer3, "elementSerializer");
            return new qo2.d(elementSerializer3, 1);
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            no2.b elementSerializer4 = (no2.b) arrayList.get(0);
            Intrinsics.checkNotNullParameter(elementSerializer4, "elementSerializer");
            return new qo2.d(elementSerializer4, 0);
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return f0.h.d((no2.b) arrayList.get(0), (no2.b) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            no2.b keySerializer = (no2.b) arrayList.get(0);
            no2.b valueSerializer = (no2.b) arrayList.get(1);
            Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
            Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
            return new p0(keySerializer, valueSerializer, 0);
        }
        if (Pair.class.isAssignableFrom(cls2)) {
            no2.b keySerializer2 = (no2.b) arrayList.get(0);
            no2.b valueSerializer2 = (no2.b) arrayList.get(1);
            Intrinsics.checkNotNullParameter(keySerializer2, "keySerializer");
            Intrinsics.checkNotNullParameter(valueSerializer2, "valueSerializer");
            return new p0(keySerializer2, valueSerializer2, 1);
        }
        if (xk2.w.class.isAssignableFrom(cls2)) {
            no2.b aSerializer = (no2.b) arrayList.get(0);
            no2.b bSerializer = (no2.b) arrayList.get(1);
            no2.b cSerializer = (no2.b) arrayList.get(2);
            Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
            Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
            Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
            return new l1(aSerializer, bSerializer, cSerializer);
        }
        ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
        for (no2.b bVar : arrayList) {
            Intrinsics.g(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(bVar);
        }
        return w(dVar, cls2, arrayList2);
    }

    public static void y(int[] iArr, int[] iArr2) {
        long j13 = iArr[0] & 4294967295L;
        int i13 = 16;
        int i14 = 0;
        int i15 = 7;
        while (true) {
            int i16 = i15 - 1;
            long j14 = iArr[i15] & 4294967295L;
            long j15 = j14 * j14;
            iArr2[i13 - 1] = (i14 << 31) | ((int) (j15 >>> 33));
            i13 -= 2;
            iArr2[i13] = (int) (j15 >>> 1);
            i14 = (int) j15;
            if (i16 <= 0) {
                long j16 = j13 * j13;
                long j17 = (j16 >>> 33) | ((i14 << 31) & 4294967295L);
                iArr2[0] = (int) j16;
                long j18 = iArr[1] & 4294967295L;
                long j19 = j17 + (j18 * j13);
                int i17 = (int) j19;
                iArr2[1] = (i17 << 1) | (((int) (j16 >>> 32)) & 1);
                int i18 = i17 >>> 31;
                long j23 = (iArr2[2] & 4294967295L) + (j19 >>> 32);
                long j24 = iArr[2] & 4294967295L;
                long j25 = j23 + (j24 * j13);
                int i19 = (int) j25;
                iArr2[2] = (i19 << 1) | i18;
                long f13 = d7.g.f(j24, j18, j25 >>> 32, iArr2[3] & 4294967295L);
                long j26 = (iArr2[4] & 4294967295L) + (f13 >>> 32);
                long j27 = iArr[3] & 4294967295L;
                long j28 = (iArr2[5] & 4294967295L) + (j26 >>> 32);
                long j29 = j26 & 4294967295L;
                long j33 = (iArr2[6] & 4294967295L) + (j28 >>> 32);
                long j34 = (j27 * j13) + (f13 & 4294967295L);
                int i23 = (int) j34;
                iArr2[3] = (i23 << 1) | (i19 >>> 31);
                long f14 = d7.g.f(j27, j18, j34 >>> 32, j29);
                long f15 = d7.g.f(j27, j24, f14 >>> 32, j28 & 4294967295L);
                long j35 = j33 + (f15 >>> 32);
                long j36 = f15 & 4294967295L;
                long j37 = iArr[4] & 4294967295L;
                long j38 = (iArr2[7] & 4294967295L) + (j35 >>> 32);
                long j39 = j35 & 4294967295L;
                long j43 = (iArr2[8] & 4294967295L) + (j38 >>> 32);
                long j44 = j38 & 4294967295L;
                long j45 = (j37 * j13) + (f14 & 4294967295L);
                int i24 = (int) j45;
                iArr2[4] = (i23 >>> 31) | (i24 << 1);
                int i25 = i24 >>> 31;
                long f16 = d7.g.f(j37, j18, j45 >>> 32, j36);
                long f17 = d7.g.f(j37, j24, f16 >>> 32, j39);
                long f18 = d7.g.f(j37, j27, f17 >>> 32, j44);
                long j46 = j43 + (f18 >>> 32);
                long j47 = iArr[5] & 4294967295L;
                long j48 = (iArr2[9] & 4294967295L) + (j46 >>> 32);
                long j49 = j46 & 4294967295L;
                long j53 = (iArr2[10] & 4294967295L) + (j48 >>> 32);
                long j54 = j48 & 4294967295L;
                long j55 = (j47 * j13) + (f16 & 4294967295L);
                int i26 = (int) j55;
                iArr2[5] = (i26 << 1) | i25;
                long f19 = d7.g.f(j47, j18, j55 >>> 32, f17 & 4294967295L);
                long f23 = d7.g.f(j47, j24, f19 >>> 32, f18 & 4294967295L);
                long f24 = d7.g.f(j47, j27, f23 >>> 32, j49);
                long j56 = f23 & 4294967295L;
                long f25 = d7.g.f(j47, j37, f24 >>> 32, j54);
                long j57 = j53 + (f25 >>> 32);
                long j58 = f25 & 4294967295L;
                long j59 = iArr[6] & 4294967295L;
                long j63 = (iArr2[11] & 4294967295L) + (j57 >>> 32);
                long j64 = j57 & 4294967295L;
                long j65 = (iArr2[12] & 4294967295L) + (j63 >>> 32);
                long j66 = j63 & 4294967295L;
                long j67 = (j59 * j13) + (f19 & 4294967295L);
                int i27 = (int) j67;
                iArr2[6] = (i26 >>> 31) | (i27 << 1);
                int i28 = i27 >>> 31;
                long f26 = d7.g.f(j59, j18, j67 >>> 32, j56);
                long f27 = d7.g.f(j59, j24, f26 >>> 32, f24 & 4294967295L);
                long f28 = d7.g.f(j59, j27, f27 >>> 32, j58);
                long j68 = f27 & 4294967295L;
                long f29 = d7.g.f(j59, j37, f28 >>> 32, j64);
                long j69 = f28 & 4294967295L;
                long f33 = d7.g.f(j59, j47, f29 >>> 32, j66);
                long j73 = f29 & 4294967295L;
                long j74 = j65 + (f33 >>> 32);
                long j75 = iArr[7] & 4294967295L;
                long j76 = (iArr2[13] & 4294967295L) + (j74 >>> 32);
                long j77 = j74 & 4294967295L;
                long j78 = (iArr2[14] & 4294967295L) + (j76 >>> 32);
                long j79 = 4294967295L & j76;
                long j83 = (j13 * j75) + (f26 & 4294967295L);
                int i29 = (int) j83;
                iArr2[7] = i28 | (i29 << 1);
                int i33 = i29 >>> 31;
                long f34 = d7.g.f(j75, j18, j83 >>> 32, j68);
                long f35 = d7.g.f(j75, j24, f34 >>> 32, j69);
                long f36 = d7.g.f(j75, j27, f35 >>> 32, j73);
                long f37 = d7.g.f(j75, j37, f36 >>> 32, f33 & 4294967295L);
                long f38 = d7.g.f(j75, j47, f37 >>> 32, j77);
                long f39 = d7.g.f(j75, j59, f38 >>> 32, j79);
                long j84 = j78 + (f39 >>> 32);
                int i34 = (int) f34;
                iArr2[8] = (i34 << 1) | i33;
                int i35 = (int) f35;
                iArr2[9] = (i34 >>> 31) | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) f36;
                iArr2[10] = i36 | (i37 << 1);
                int i38 = i37 >>> 31;
                int i39 = (int) f37;
                iArr2[11] = i38 | (i39 << 1);
                int i43 = i39 >>> 31;
                int i44 = (int) f38;
                iArr2[12] = i43 | (i44 << 1);
                int i45 = i44 >>> 31;
                int i46 = (int) f39;
                iArr2[13] = i45 | (i46 << 1);
                int i47 = i46 >>> 31;
                int i48 = (int) j84;
                iArr2[14] = i47 | (i48 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j84 >>> 32))) << 1) | (i48 >>> 31);
                return;
            }
            i15 = i16;
        }
    }

    public static int z(int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j13;
        long j14 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j13 >> 32);
        iArr3[1] = (int) j14;
        long j15 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j14 >> 32);
        iArr3[2] = (int) j15;
        long j16 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j15 >> 32);
        iArr3[3] = (int) j16;
        long j17 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j16 >> 32);
        iArr3[4] = (int) j17;
        long j18 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j17 >> 32);
        iArr3[5] = (int) j18;
        long j19 = ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L)) + (j18 >> 32);
        iArr3[6] = (int) j19;
        long j23 = ((iArr[7] & 4294967295L) - (iArr2[7] & 4294967295L)) + (j19 >> 32);
        iArr3[7] = (int) j23;
        return (int) (j23 >> 32);
    }
}
