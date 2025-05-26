package el;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f59464a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f59465b;

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f59466c;

    /* renamed from: d, reason: collision with root package name */
    public static final b[][] f59467d;

    /* renamed from: e, reason: collision with root package name */
    public static final b[] f59468e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f59469f;

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f59470g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f59471h;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f59469f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        f59470g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        f59471h = mod2;
        BigInteger valueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger modPow = valueOf.modPow(subtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), subtract);
        com.google.android.gms.internal.measurement.x xVar = new com.google.android.gms.internal.measurement.x((Object) null);
        BigInteger mod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        xVar.f31695c = mod3;
        BigInteger multiply = mod3.pow(2).subtract(bigInteger).multiply(mod.multiply(mod3.pow(2)).add(bigInteger).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        xVar.f31694b = modPow2;
        f59464a = a.C(c(mod));
        f59465b = a.C(c(mod2));
        f59466c = a.C(c(modPow));
        f59467d = (b[][]) Array.newInstance((Class<?>) b.class, 32, 8);
        com.google.android.gms.internal.measurement.x xVar2 = xVar;
        for (int i13 = 0; i13 < 32; i13++) {
            com.google.android.gms.internal.measurement.x xVar3 = xVar2;
            for (int i14 = 0; i14 < 8; i14++) {
                f59467d[i13][i14] = b(xVar3);
                xVar3 = a(xVar3, xVar2);
            }
            for (int i15 = 0; i15 < 8; i15++) {
                xVar2 = a(xVar2, xVar2);
            }
        }
        com.google.android.gms.internal.measurement.x a13 = a(xVar, xVar);
        f59468e = new b[8];
        for (int i16 = 0; i16 < 8; i16++) {
            f59468e[i16] = b(xVar);
            xVar = a(xVar, a13);
        }
    }

    public static com.google.android.gms.internal.measurement.x a(com.google.android.gms.internal.measurement.x xVar, com.google.android.gms.internal.measurement.x xVar2) {
        com.google.android.gms.internal.measurement.x xVar3 = new com.google.android.gms.internal.measurement.x((Object) null);
        BigInteger multiply = f59470g.multiply(((BigInteger) xVar.f31694b).multiply((BigInteger) xVar2.f31694b).multiply((BigInteger) xVar.f31695c).multiply((BigInteger) xVar2.f31695c));
        BigInteger bigInteger = f59469f;
        BigInteger mod = multiply.mod(bigInteger);
        BigInteger add = ((BigInteger) xVar.f31694b).multiply((BigInteger) xVar2.f31695c).add(((BigInteger) xVar2.f31694b).multiply((BigInteger) xVar.f31695c));
        BigInteger bigInteger2 = BigInteger.ONE;
        xVar3.f31694b = add.multiply(bigInteger2.add(mod).modInverse(bigInteger)).mod(bigInteger);
        xVar3.f31695c = ((BigInteger) xVar.f31695c).multiply((BigInteger) xVar2.f31695c).add(((BigInteger) xVar.f31694b).multiply((BigInteger) xVar2.f31694b)).multiply(bigInteger2.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return xVar3;
    }

    public static b b(com.google.android.gms.internal.measurement.x xVar) {
        BigInteger add = ((BigInteger) xVar.f31695c).add((BigInteger) xVar.f31694b);
        BigInteger bigInteger = f59469f;
        return new b(a.C(c(add.mod(bigInteger))), a.C(c(((BigInteger) xVar.f31695c).subtract((BigInteger) xVar.f31694b).mod(bigInteger))), a.C(c(f59471h.multiply((BigInteger) xVar.f31694b).multiply((BigInteger) xVar.f31695c).mod(bigInteger))));
    }

    public static byte[] c(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i13 = 0; i13 < 16; i13++) {
            byte b13 = bArr[i13];
            int i14 = 31 - i13;
            bArr[i13] = bArr[i14];
            bArr[i14] = b13;
        }
        return bArr;
    }
}
