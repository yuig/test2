package el;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.appcompat.widget.c2;
import androidx.lifecycle.l1;
import androidx.lifecycle.u1;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.b90;
import com.pinterest.api.model.cc;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gf;
import com.pinterest.api.model.l30;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.wy0;
import com.pinterest.collagesCoreLibrary.model.CutoutPickerPage;
import com.pinterest.feature.account.view.AccountSwitcherRowView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingEditor;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingView;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.f1;
import h32.w1;
import i2.f2;
import i2.q1;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.KeyAgreement;
import kh2.c3;
import kh2.p2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.f3;
import lh0.n1;
import ni1.t2;
import nx.d1;
import qm0.j1;
import qm0.y1;
import s80.f4;
import so.a7;
import so.a8;
import so.b7;
import so.c6;
import so.k7;
import so.l7;
import so.q7;
import so.r8;
import so.s3;
import so.s5;
import so.z6;
import x02.i2;
import x02.l2;
import x02.u2;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f59441a = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[][] f59442b = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}};

    /* renamed from: c, reason: collision with root package name */
    public static final b f59443c = new b(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.x f59444d = new com.google.android.gms.internal.measurement.x(12, new gi.m(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 14, 0), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f59445e = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f59446f = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f59447g = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f59448h = {67108863, 33554431};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f59449i = {26, 25};

    /* renamed from: j, reason: collision with root package name */
    public static final c50.c1 f59450j = new c50.c1();

    public static int A(int i13, int i14) {
        int i15 = (~(i13 ^ i14)) & 255;
        int i16 = i15 & (i15 << 4);
        int i17 = i16 & (i16 << 2);
        return ((i17 & (i17 << 1)) >> 7) & 1;
    }

    public static void A0(ns.r rVar, ro1.c cVar) {
        rVar.N0 = cVar;
    }

    public static void A1(to0.g gVar, lb0.q qVar) {
        gVar.B0 = qVar;
    }

    public static void A2(b bVar, int i13, byte b13) {
        int i14 = (b13 & 255) >> 7;
        int i15 = b13 - (((-i14) & b13) << 1);
        b[][] bVarArr = d.f59467d;
        bVar.a(bVarArr[i13][0], A(i15, 1));
        bVar.a(bVarArr[i13][1], A(i15, 2));
        bVar.a(bVarArr[i13][2], A(i15, 3));
        bVar.a(bVarArr[i13][3], A(i15, 4));
        bVar.a(bVarArr[i13][4], A(i15, 5));
        bVar.a(bVarArr[i13][5], A(i15, 6));
        bVar.a(bVarArr[i13][6], A(i15, 7));
        bVar.a(bVarArr[i13][7], A(i15, 8));
        long[] jArr = bVar.f59458b;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        long[] jArr2 = bVar.f59457a;
        long[] copyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArr3 = bVar.f59459c;
        long[] copyOf3 = Arrays.copyOf(jArr3, 10);
        for (int i16 = 0; i16 < copyOf3.length; i16++) {
            copyOf3[i16] = -copyOf3[i16];
        }
        v(i14, jArr2, copyOf);
        v(i14, jArr, copyOf2);
        v(i14, jArr3, copyOf3);
    }

    public static final void B(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<this>");
    }

    public static void B0(ns.r rVar, ni1.d dVar) {
        rVar.O0 = dVar;
    }

    public static void B1(qv0.j jVar, so.m mVar) {
        jVar.f105187z0 = mVar;
    }

    public static byte[] B2(byte[] bArr) {
        int i13;
        byte[] bArr2 = new byte[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        for (int i14 = 0; i14 < 256; i14++) {
            bArr2[i14] = (byte) (1 & ((bArr[i14 >> 3] & 255) >> (i14 & 7)));
        }
        for (int i15 = 0; i15 < 256; i15++) {
            if (bArr2[i15] != 0) {
                for (int i16 = 1; i16 <= 6 && (i13 = i15 + i16) < 256; i16++) {
                    byte b13 = bArr2[i13];
                    if (b13 != 0) {
                        byte b14 = bArr2[i15];
                        if ((b13 << i16) + b14 <= 15) {
                            bArr2[i15] = (byte) (b14 + (b13 << i16));
                            bArr2[i13] = 0;
                        } else if (b14 - (b13 << i16) >= -15) {
                            bArr2[i15] = (byte) (b14 - (b13 << i16));
                            while (true) {
                                if (i13 >= 256) {
                                    break;
                                }
                                if (bArr2[i13] == 0) {
                                    bArr2[i13] = 1;
                                    break;
                                }
                                bArr2[i13] = 0;
                                i13++;
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static long[] C(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i13 = 0; i13 < 10; i13++) {
            int i14 = f59446f[i13];
            jArr[i13] = (((((bArr[i14] & 255) | ((bArr[i14 + 1] & 255) << 8)) | ((bArr[i14 + 2] & 255) << 16)) | ((bArr[i14 + 3] & 255) << 24)) >> f59447g[i13]) & f59448h[i13 & 1];
        }
        return jArr;
    }

    public static void C0(rl0.c cVar, m60.f0 f0Var) {
        cVar.f108518z0 = f0Var;
    }

    public static void C1(rl0.c cVar, q7 q7Var) {
        cVar.A0 = q7Var;
    }

    public static void C2(long[] jArr, long[] jArr2) {
        long j13 = jArr2[0];
        long j14 = j13 * 2;
        long j15 = jArr2[1];
        long j16 = jArr2[2];
        long j17 = jArr2[3];
        long j18 = jArr2[4];
        long j19 = jArr2[5];
        long j23 = jArr2[6];
        long j24 = jArr2[7];
        long j25 = jArr2[8];
        long j26 = jArr2[9];
        w2(new long[]{j13 * j13, j14 * j15, ((j13 * j16) + (j15 * j15)) * 2, ((j13 * j17) + (j15 * j16)) * 2, (j14 * j18) + (j15 * 4 * j17) + (j16 * j16), ((j13 * j19) + (j15 * j18) + (j16 * j17)) * 2, ((j15 * 2 * j19) + (j13 * j23) + (j16 * j18) + (j17 * j17)) * 2, ((j13 * j24) + (j15 * j23) + (j16 * j19) + (j17 * j18)) * 2, (((((j17 * j19) + (j15 * j24)) * 2) + (j13 * j25) + (j16 * j23)) * 2) + (j18 * j18), ((j13 * j26) + (j15 * j25) + (j16 * j24) + (j17 * j23) + (j18 * j19)) * 2, ((((j15 * j26) + (j17 * j24)) * 2) + (j16 * j25) + (j18 * j23) + (j19 * j19)) * 2, ((j16 * j26) + (j17 * j25) + (j18 * j24) + (j19 * j23)) * 2, (((((j17 * j26) + (j19 * j24)) * 2) + (j18 * j25)) * 2) + (j23 * j23), ((j18 * j26) + (j19 * j25) + (j23 * j24)) * 2, ((j19 * 2 * j26) + (j23 * j25) + (j24 * j24)) * 2, ((j23 * j26) + (j24 * j25)) * 2, (j24 * 4 * j26) + (j25 * j25), j25 * 2 * j26, 2 * j26 * j26}, jArr);
    }

    public static int D(EllipticCurve ellipticCurve) {
        return (f.d(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static void D0(tj0.m mVar, m60.f0 f0Var) {
        mVar.f117882b1 = f0Var;
    }

    public static void D1(iq0.e eVar, uk1.e eVar2) {
        eVar.f73402y0 = eVar2;
    }

    public static void D2(com.google.android.gms.internal.measurement.x xVar, bh.b bVar, b bVar2) {
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) ((gi.m) xVar.f31694b).f65093b;
        gi.m mVar = (gi.m) bVar.f22798b;
        F2(jArr2, (long[]) mVar.f65095d, (long[]) mVar.f65093b);
        long[] jArr3 = (long[]) ((gi.m) xVar.f31694b).f65095d;
        gi.m mVar2 = (gi.m) bVar.f22798b;
        E2(jArr3, (long[]) mVar2.f65095d, (long[]) mVar2.f65093b);
        Object obj = ((gi.m) xVar.f31694b).f65095d;
        q2((long[]) obj, (long[]) obj, bVar2.f59457a);
        gi.m mVar3 = (gi.m) xVar.f31694b;
        q2((long[]) mVar3.f65094c, (long[]) mVar3.f65093b, bVar2.f59458b);
        q2((long[]) xVar.f31695c, (long[]) bVar.f22799c, bVar2.f59459c);
        bVar2.b((long[]) ((gi.m) xVar.f31694b).f65093b, (long[]) ((gi.m) bVar.f22798b).f65094c);
        Object obj2 = ((gi.m) xVar.f31694b).f65093b;
        F2(jArr, (long[]) obj2, (long[]) obj2);
        gi.m mVar4 = (gi.m) xVar.f31694b;
        E2((long[]) mVar4.f65093b, (long[]) mVar4.f65094c, (long[]) mVar4.f65095d);
        gi.m mVar5 = (gi.m) xVar.f31694b;
        Object obj3 = mVar5.f65095d;
        F2((long[]) obj3, (long[]) mVar5.f65094c, (long[]) obj3);
        E2((long[]) ((gi.m) xVar.f31694b).f65094c, jArr, (long[]) xVar.f31695c);
        long[] jArr4 = (long[]) xVar.f31695c;
        F2(jArr4, jArr, jArr4);
    }

    public static int E(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i13 = Integer.MAX_VALUE;
        for (int i14 = 0; i14 < 6; i14++) {
            int ceil = (int) Math.ceil(fArr[i14]);
            iArr[i14] = ceil;
            if (i13 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i13 = ceil;
            }
            if (i13 == ceil) {
                bArr[i14] = (byte) (bArr[i14] + 1);
            }
        }
        return i13;
    }

    public static void E0(ms.e eVar, nr0.m mVar) {
        eVar.O0 = mVar;
    }

    public static void E1(iq0.g gVar, uk1.e eVar) {
        gVar.Z0 = eVar;
    }

    public static void E2(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i13 = 0; i13 < 10; i13++) {
            jArr[i13] = jArr2[i13] - jArr3[i13];
        }
    }

    public static KeyPair F(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) ll.s.f83773g.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static void F0(tj0.t tVar, zf0.f fVar) {
        tVar.f117889a1 = fVar;
    }

    public static void F1(ns.r rVar, uk1.e eVar) {
        rVar.F0 = eVar;
    }

    public static void F2(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i13 = 0; i13 < 10; i13++) {
            jArr[i13] = jArr2[i13] + jArr3[i13];
        }
    }

    public static Integer G() {
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }

    public static void G0(wn0.j jVar, zf0.f fVar) {
        jVar.f130481d1 = fVar;
    }

    public static void G1(tj0.m mVar, uk1.e eVar) {
        mVar.Z0 = eVar;
    }

    public static void G2(int i13, long[] jArr, long[] jArr2) {
        int i14 = -i13;
        for (int i15 = 0; i15 < 10; i15++) {
            int i16 = (((int) jArr2[i15]) ^ ((int) jArr[i15])) & i14;
            jArr[i15] = r1 ^ i16;
            jArr2[i15] = ((int) jArr2[i15]) ^ i16;
        }
    }

    public static final HashMap H(f30 pin, es.a adFormats, ur.a adsDependencies) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        HashMap hashMap = new HashMap();
        bs1.c.G1(SbaPinRep.AUX_DATA_VIDEO_ID, b40.i0(pin), hashMap);
        if (((es.c) adFormats).K(pin)) {
            String f03 = com.bumptech.glide.d.f0(pin);
            if (f03 == null) {
                f03 = "";
            }
            hashMap.put(SbaPinRep.AUXDATA_LEADAD_FORM_ID, f03);
            hashMap.put(SbaPinRep.AUXDATA_IS_LEAD_AD, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
        }
        ((vr.b) ((ur.b) adsDependencies).f123059b).c(pin, hashMap);
        return hashMap;
    }

    public static void H0(to0.g gVar, m60.w wVar) {
        gVar.f118670x0 = wVar;
    }

    public static void H1(tj0.t tVar, uk1.e eVar) {
        tVar.f117891c1 = eVar;
    }

    public static byte[] H2(byte[] bArr) {
        int i13 = 0;
        while (i13 < bArr.length && bArr[i13] == 0) {
            i13++;
        }
        if (i13 == bArr.length) {
            i13 = bArr.length - 1;
        }
        int i14 = (bArr[i13] & 128) == 128 ? 1 : 0;
        byte[] bArr2 = new byte[(bArr.length - i13) + i14];
        System.arraycopy(bArr, i13, bArr2, i14, bArr.length - i13);
        return bArr2;
    }

    public static ECParameterSpec I(ll.n nVar) {
        int i13 = ll.m.f83761b[nVar.ordinal()];
        if (i13 == 1) {
            return f.f59479a;
        }
        if (i13 == 2) {
            return f.f59480b;
        }
        if (i13 == 3) {
            return f.f59481c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + nVar);
    }

    public static void I0(mq.u uVar, rg0.s sVar) {
        uVar.D0 = sVar;
    }

    public static void I1(tv0.e eVar, uk1.e eVar2) {
        eVar.X = eVar2;
    }

    public static final t10.b I2(gf gfVar) {
        Intrinsics.checkNotNullParameter(gfVar, "<this>");
        Integer c13 = gfVar.c();
        Intrinsics.checkNotNullExpressionValue(c13, "getH(...)");
        int intValue = c13.intValue();
        Integer d2 = gfVar.d();
        Intrinsics.checkNotNullExpressionValue(d2, "getM(...)");
        return new t10.b(intValue, d2.intValue());
    }

    public static ECPrivateKey J(ll.n nVar, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) ll.s.f83774h.a("EC")).generatePrivate(new ECPrivateKeySpec(c0.d.Q(bArr), I(nVar)));
    }

    public static void J0(tj0.t tVar, rg0.s sVar) {
        tVar.Z0 = sVar;
    }

    public static void J1(wn0.j jVar, uk1.e eVar) {
        jVar.V0 = eVar;
    }

    public static j1 J2(l82.e eVar, h32.u0 u0Var, h32.g0 g0Var, String str, HashMap hashMap, int i13) {
        f1 eventType = f1.TAP;
        if ((i13 & 16) != 0) {
            g0Var = null;
        }
        String str2 = (i13 & 32) != 0 ? null : str;
        if ((i13 & 64) != 0) {
            y1 y1Var = (y1) eVar.f82219b;
            Intrinsics.checkNotNullParameter(y1Var, "<this>");
            hashMap = new HashMap();
            bs1.c.G1("board_id", y1Var.f104361a, hashMap);
        }
        HashMap auxData = hashMap;
        y1 y1Var2 = (y1) eVar.f82219b;
        Intrinsics.checkNotNullParameter(y1Var2, "<this>");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        return new j1(new zy.f0(c3.u0(y1Var2.f104370j, g0Var, u0Var, eventType, null, null, str2, auxData)));
    }

    public static ECPublicKey K(ll.n nVar, ll.p pVar, byte[] bArr) {
        ECParameterSpec I = I(nVar);
        return (ECPublicKey) ((KeyFactory) ll.s.f83774h.a("EC")).generatePublic(new ECPublicKeySpec(r2(I.getCurve(), pVar, bArr), I));
    }

    public static void K0(mq.u uVar, lh0.a0 a0Var) {
        uVar.f88038z0 = a0Var;
    }

    public static void K1(ns.r rVar, f3 f3Var) {
        rVar.S0 = f3Var;
    }

    public static void K2(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            if (f.f(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e13) {
            throw new GeneralSecurityException(e13);
        }
    }

    public static ECPublicKey L(ll.n nVar, byte[] bArr, byte[] bArr2) {
        ECParameterSpec I = I(nVar);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        f.b(eCPoint, I.getCurve());
        return (ECPublicKey) ((KeyFactory) ll.s.f83774h.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, I));
    }

    public static void L0(ms.e eVar, lh0.e eVar2) {
        eVar.S0 = eVar2;
    }

    public static void L1(to0.g gVar, c2 c2Var) {
        gVar.E0 = c2Var;
    }

    public static final h32.c1 M(int i13, int i14, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        cc J3 = pin.J3();
        List d2 = J3 != null ? J3.d() : null;
        if (J3 == null || d2 == null) {
            return null;
        }
        l30 l30Var = (l30) d2.get(i14);
        String f13 = J3.f();
        Long valueOf = Long.valueOf(f13 != null ? Long.parseLong(f13) : 0L);
        String y13 = l30Var.y();
        w1 w1Var = new w1(valueOf, Long.valueOf(y13 != null ? Long.parseLong(y13) : 0L), Short.valueOf((short) i13), l30Var.r(), Short.valueOf((short) i14), null);
        Boolean bool = Boolean.FALSE;
        return new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, w1Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static void M0(tj0.t tVar, lh0.q qVar) {
        tVar.f117893e1 = qVar;
    }

    public static void M1(wn0.j jVar, c2 c2Var) {
        jVar.f130485h1 = c2Var;
    }

    public static byte[] N(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) ll.s.f83771e.a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        byte b13 = (byte) (digest[31] & Byte.MAX_VALUE);
        digest[31] = b13;
        digest[31] = (byte) (b13 | 64);
        return digest;
    }

    public static void N0(to0.g gVar) {
        gVar.getClass();
    }

    public static void N1(ns.r rVar, vg1.a aVar) {
        rVar.I0 = aVar;
    }

    public static final String O(b90 b90Var) {
        Map e13;
        sr srVar;
        Intrinsics.checkNotNullParameter(b90Var, "<this>");
        if (!Intrinsics.d(b90Var.f(), "image") || (e13 = b90Var.e()) == null || (srVar = (sr) e13.get("1200x")) == null) {
            return null;
        }
        return srVar.j();
    }

    public static void O0(wn0.j jVar, x92.b bVar) {
        jVar.f130480c1 = bVar;
    }

    public static void O1(mq.u uVar, is1.h hVar) {
        uVar.F0 = hVar;
    }

    public static void P(r0 r0Var) {
        uk.i iVar;
        gi.m mVar = new gi.m(15);
        v vVar = r0Var.f59528e;
        if (((ArrayList) mVar.f65093b) == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        mVar.f65095d = vVar;
        Iterator it = r0Var.f59524a.values().iterator();
        while (it.hasNext()) {
            for (s0 s0Var : (List) it.next()) {
                int i13 = y.f59555a[s0Var.f59531b.ordinal()];
                if (i13 == 1) {
                    iVar = uk.i.f122360b;
                } else if (i13 == 2) {
                    iVar = uk.i.f122361c;
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    iVar = uk.i.f122362d;
                }
                String str = s0Var.f59534e;
                if (str.startsWith("type.googleapis.com/google.crypto.")) {
                    str = str.substring(34);
                }
                String name = s0Var.f59532c.name();
                ArrayList arrayList = (ArrayList) mVar.f65093b;
                if (arrayList == null) {
                    throw new IllegalStateException("addEntry cannot be called after build()");
                }
                arrayList.add(new w(iVar, s0Var.f59533d, str, name));
            }
        }
        s0 s0Var2 = r0Var.f59526c;
        if (s0Var2 != null) {
            if (((ArrayList) mVar.f65093b) == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            mVar.f65094c = Integer.valueOf(s0Var2.f59533d);
        }
        try {
            mVar.g();
        } catch (GeneralSecurityException e13) {
            throw new IllegalStateException(e13);
        }
    }

    public static void P0(wn0.j jVar, m60.d0 d0Var) {
        jVar.X0 = d0Var;
    }

    public static void P1(ms.e eVar, i92.k kVar) {
        eVar.U0 = kVar;
    }

    public static BigInteger Q(BigInteger bigInteger, boolean z13, EllipticCurve ellipticCurve) {
        BigInteger d2 = f.d(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(d2);
        if (d2.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger mod2 = mod.mod(d2);
        BigInteger bigInteger2 = BigInteger.ZERO;
        if (!mod2.equals(bigInteger2)) {
            if (d2.testBit(0) && d2.testBit(1)) {
                bigInteger2 = mod2.modPow(d2.add(BigInteger.ONE).shiftRight(2), d2);
            } else if (!d2.testBit(0) || d2.testBit(1)) {
                bigInteger2 = null;
            } else {
                bigInteger2 = BigInteger.ONE;
                BigInteger shiftRight = d2.subtract(bigInteger2).shiftRight(1);
                int i13 = 0;
                while (true) {
                    BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(d2);
                    if (mod3.equals(BigInteger.ZERO)) {
                        break;
                    }
                    BigInteger modPow = mod3.modPow(shiftRight, d2);
                    BigInteger bigInteger3 = BigInteger.ONE;
                    if (modPow.add(bigInteger3).equals(d2)) {
                        BigInteger shiftRight2 = d2.add(bigInteger3).shiftRight(1);
                        BigInteger bigInteger4 = bigInteger2;
                        for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                            BigInteger multiply = bigInteger4.multiply(bigInteger3);
                            bigInteger4 = bigInteger4.multiply(bigInteger4).add(bigInteger3.multiply(bigInteger3).mod(d2).multiply(mod3)).mod(d2);
                            BigInteger mod4 = multiply.add(multiply).mod(d2);
                            if (shiftRight2.testBit(bitLength)) {
                                BigInteger mod5 = bigInteger4.multiply(bigInteger2).add(mod4.multiply(mod3)).mod(d2);
                                bigInteger3 = bigInteger2.multiply(mod4).add(bigInteger4).mod(d2);
                                bigInteger4 = mod5;
                            } else {
                                bigInteger3 = mod4;
                            }
                        }
                        bigInteger2 = bigInteger4;
                    } else {
                        if (!modPow.equals(bigInteger3)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                        bigInteger2 = bigInteger2.add(bigInteger3);
                        i13++;
                        if (i13 == 128 && !d2.isProbablePrime(80)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                    }
                }
            }
            if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(d2).compareTo(mod2) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
        }
        return z13 != bigInteger2.testBit(0) ? d2.subtract(bigInteger2).mod(d2) : bigInteger2;
    }

    public static void Q0(ml0.w wVar) {
        wVar.getClass();
    }

    public static void Q1(tj0.t tVar, i92.k kVar) {
        tVar.Y0 = kVar;
    }

    public static void R(char c13) {
        String hexString = Integer.toHexString(c13);
        throw new IllegalArgumentException("Illegal character: " + c13 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static void R0(iq0.e eVar, n1 n1Var) {
        eVar.A0 = n1Var;
    }

    public static void R1(tv0.e eVar, l2 l2Var) {
        eVar.Y = l2Var;
    }

    public static void S(wu.d dVar, es.a aVar) {
        dVar.T0 = aVar;
    }

    public static void S0(hu0.e eVar, a8 a8Var) {
        eVar.B0 = a8Var;
    }

    public static void S1(to0.g gVar) {
        gVar.getClass();
    }

    public static void T(ms.e eVar, z02.a aVar) {
        eVar.T0 = aVar;
    }

    public static void T0(qv0.j jVar, ag1.h hVar) {
        jVar.B0 = hVar;
    }

    public static void T1(wn0.j jVar, ap.o oVar) {
        jVar.U0 = oVar;
    }

    public static void U(ms.e eVar, js.b bVar) {
        eVar.V0 = bVar;
    }

    public static void U0(kd0.b bVar, nu1.a aVar) {
        bVar.A0 = aVar;
    }

    public static void U1(com.pinterest.creatorHub.feature.creatorpathways.f fVar, ku1.l lVar) {
        fVar.f44786k0 = lVar;
    }

    public static void V(g90.n nVar, r8 r8Var) {
        nVar.f64538g0 = r8Var;
    }

    public static void V0(ns.r rVar, nu1.a aVar) {
        rVar.K0 = aVar;
    }

    public static void V1(kd0.b bVar, ku1.l lVar) {
        bVar.B0 = lVar;
    }

    public static void W(ka0.j jVar, r8 r8Var) {
        jVar.f78908c0 = r8Var;
    }

    public static void W0(vj0.b bVar) {
        bVar.getClass();
    }

    public static void W1(mq.u uVar, se2.a aVar) {
        uVar.B0 = aVar;
    }

    public static void X(mq.u uVar, r8 r8Var) {
        uVar.f88037y0 = r8Var;
    }

    public static void X0(to0.g gVar, so.v vVar) {
        gVar.f118669w0 = vVar;
    }

    public static void X1(wn0.j jVar, u2 u2Var) {
        jVar.f130483f1 = u2Var;
    }

    public static void Y(wu.d dVar, es.h hVar) {
        dVar.S0 = hVar;
    }

    public static void Y0(mq.u uVar, se2.a aVar) {
        uVar.G0 = aVar;
    }

    public static void Y1(ml0.w wVar, ni1.d0 d0Var) {
        wVar.N0 = d0Var;
    }

    public static void Z(ns.r rVar, ur.a aVar) {
        rVar.R0 = aVar;
    }

    public static void Z0(mq.u uVar, se2.a aVar) {
        uVar.f88036x0 = aVar;
    }

    public static void Z1(to0.g gVar, is1.k0 k0Var) {
        gVar.f118671y0 = k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(kotlin.jvm.functions.Function0 r17, u2.q r18, boolean r19, o1.l r20, k1.k1 r21, kotlin.jvm.functions.Function2 r22, i2.o r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: el.a.a(kotlin.jvm.functions.Function0, u2.q, boolean, o1.l, k1.k1, kotlin.jvm.functions.Function2, i2.o, int, int):void");
    }

    public static void a0(wu.d dVar, so.h0 h0Var) {
        dVar.R0 = h0Var;
    }

    public static void a1(g90.n nVar, hs.d dVar) {
        nVar.f64541j0 = dVar;
    }

    public static void a2(to0.g gVar, lu1.d dVar) {
        gVar.f118668v0 = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(u2.q r34, kotlin.jvm.functions.Function0 r35, i2.o r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: el.a.b(u2.q, kotlin.jvm.functions.Function0, i2.o, int, int):void");
    }

    public static void b0(wn0.j jVar, oc.c cVar) {
        jVar.f130478a1 = cVar;
    }

    public static void b1(tj0.m mVar, s3 s3Var) {
        mVar.f117881a1 = s3Var;
    }

    public static void b2(to0.g gVar, f30.b bVar) {
        gVar.C0 = bVar;
    }

    public static final void c(uc0.u uVar, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1068700478);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(uVar)) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = 8;
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i13 & 1) != 0 && !sVar.y()) {
                sVar.Q();
                int i17 = i14 & 1;
            } else if ((i14 & 1) != 0) {
                sVar.X(1890788296);
                u1 a13 = v6.b.a(sVar);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = p2.V(a13, sVar);
                sVar.X(1729797275);
                l1 v03 = c3.v0(uc0.u.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                uVar = (uc0.u) v03;
            }
            sVar.s();
            q1 z13 = bs1.c.z(uVar.f121825e, sVar);
            uVar.i(new uc0.i(new oc0.a(q2.i.c(-1596526710, new androidx.compose.foundation.lazy.layout.v(14, z13, uVar), sVar))));
            gh0.b.d(((uc0.t) z13.getValue()).f121862a, null, sVar, 8, 2);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(uVar, i13, i14, i16);
        }
    }

    public static void c0(ns.r rVar, xr.a aVar) {
        rVar.M0 = aVar;
    }

    public static void c1(tj0.t tVar, s3 s3Var) {
        tVar.f117892d1 = s3Var;
    }

    public static void c2(to0.g gVar, gp1.d dVar) {
        gVar.D0 = dVar;
    }

    public static final void d(uc0.w wVar, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1752292617);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(wVar)) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i13 & 1) != 0 && !sVar.y()) {
                sVar.Q();
                int i16 = i14 & 1;
            } else if ((i14 & 1) != 0) {
                sVar.X(1890788296);
                u1 a13 = v6.b.a(sVar);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = p2.V(a13, sVar);
                sVar.X(1729797275);
                l1 v03 = c3.v0(uc0.w.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                wVar = (uc0.w) v03;
            }
            sVar.s();
            q1 z13 = bs1.c.z(wVar.f121825e, sVar);
            wVar.i(new uc0.i(new oc0.a(q2.i.c(1156285761, new androidx.compose.foundation.lazy.layout.v(15, z13, wVar), sVar))));
            gh0.b.d(((uc0.v) z13.getValue()).f121870a, null, sVar, 8, 2);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(wVar, i13, i14, 9);
        }
    }

    public static void d0(to0.g gVar, lu1.b bVar) {
        gVar.f118666t0 = bVar;
    }

    public static void d1(ns.r rVar, bc2.e eVar) {
        rVar.G0 = eVar;
    }

    public static void d2(to0.g gVar, a80.a aVar) {
        gVar.A0 = aVar;
    }

    public static final void e(s80.j state, u2.q qVar, u2.q qVar2, float f13, Function1 function1, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-2054225943);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar3 = i15 != 0 ? nVar : qVar;
        u2.q qVar4 = (i14 & 4) != 0 ? nVar : qVar2;
        float f14 = (i14 & 8) != 0 ? 1.25f : f13;
        Function1 function12 = (i14 & 16) != 0 ? w80.g0.f128293i : function1;
        b7.c.c(state.f111600i.f111833c, qVar3, androidx.compose.animation.a.c(null, 3), androidx.compose.animation.a.d(null, 3), null, q2.i.c(-1187582959, new w80.j0(qVar4, f14, function12, state), sVar), sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 200064, 16);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w80.k0(state, qVar3, qVar4, f14, function12, i13, i14, 0);
        }
    }

    public static void e0(wn0.j jVar, gi.m mVar) {
        jVar.Z0 = mVar;
    }

    public static void e1(ms.e eVar, yk1.j jVar) {
        eVar.R0 = jVar;
    }

    public static void e2(to0.g gVar, d1 d1Var) {
        gVar.f118667u0 = d1Var;
    }

    public static final void f(s80.j state, u2.q qVar, u2.q qVar2, float f13, Function1 function1, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1381401858);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar3 = i15 != 0 ? nVar : qVar;
        u2.q qVar4 = (i14 & 4) != 0 ? nVar : qVar2;
        float f14 = (i14 & 8) != 0 ? 1.25f : f13;
        Function1 function12 = (i14 & 16) != 0 ? w80.l0.f128342i : function1;
        b7.c.c(state.f111600i.f111833c, qVar3, androidx.compose.animation.a.c(null, 3), androidx.compose.animation.a.d(null, 3), null, q2.i.c(710002138, new w80.j0(function12, qVar4, state, f14), sVar), sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 200064, 16);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w80.k0(state, qVar3, qVar4, f14, function12, i13, i14, 1);
        }
    }

    public static void f0(ns.r rVar, g70.h hVar) {
        rVar.T0 = hVar;
    }

    public static void f1(wn0.j jVar, yk1.j jVar2) {
        jVar.f130482e1 = jVar2;
    }

    public static void f2(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        C2(jArr3, jArr2);
        C2(jArr12, jArr3);
        C2(jArr11, jArr12);
        q2(jArr4, jArr11, jArr2);
        q2(jArr5, jArr4, jArr3);
        C2(jArr11, jArr5);
        q2(jArr6, jArr11, jArr4);
        C2(jArr11, jArr6);
        C2(jArr12, jArr11);
        C2(jArr11, jArr12);
        C2(jArr12, jArr11);
        C2(jArr11, jArr12);
        q2(jArr7, jArr11, jArr6);
        C2(jArr11, jArr7);
        C2(jArr12, jArr11);
        for (int i13 = 2; i13 < 10; i13 += 2) {
            C2(jArr11, jArr12);
            C2(jArr12, jArr11);
        }
        q2(jArr8, jArr12, jArr7);
        C2(jArr11, jArr8);
        C2(jArr12, jArr11);
        for (int i14 = 2; i14 < 20; i14 += 2) {
            C2(jArr11, jArr12);
            C2(jArr12, jArr11);
        }
        q2(jArr11, jArr12, jArr8);
        C2(jArr12, jArr11);
        C2(jArr11, jArr12);
        for (int i15 = 2; i15 < 10; i15 += 2) {
            C2(jArr12, jArr11);
            C2(jArr11, jArr12);
        }
        q2(jArr9, jArr11, jArr7);
        C2(jArr11, jArr9);
        C2(jArr12, jArr11);
        for (int i16 = 2; i16 < 50; i16 += 2) {
            C2(jArr11, jArr12);
            C2(jArr12, jArr11);
        }
        q2(jArr10, jArr12, jArr9);
        C2(jArr12, jArr10);
        C2(jArr11, jArr12);
        for (int i17 = 2; i17 < 100; i17 += 2) {
            C2(jArr12, jArr11);
            C2(jArr11, jArr12);
        }
        q2(jArr12, jArr11, jArr10);
        C2(jArr11, jArr12);
        C2(jArr12, jArr11);
        for (int i18 = 2; i18 < 50; i18 += 2) {
            C2(jArr11, jArr12);
            C2(jArr12, jArr11);
        }
        q2(jArr11, jArr12, jArr9);
        C2(jArr12, jArr11);
        C2(jArr11, jArr12);
        C2(jArr12, jArr11);
        C2(jArr11, jArr12);
        C2(jArr12, jArr11);
        q2(jArr, jArr12, jArr5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v13 */
    public static final void g(t90.o state, u2.q qVar, Function1 function1, float f13, wb0.c cVar, i2.o oVar, int i13, int i14) {
        wb0.c cVar2;
        int i15;
        u2.q qVar2;
        Function1 function12;
        long j13;
        int i16 = i13;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(915655219);
        u2.q qVar3 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        Function1 function13 = (i14 & 4) != 0 ? t90.m.f116813i : function1;
        float f14 = (i14 & 8) != 0 ? 66 : f13;
        boolean z13 = 0;
        if ((i14 & 16) != 0) {
            cVar2 = new wb0.c(0, com.bumptech.glide.d.A(eo1.c.space_400, sVar), 4);
            i15 = (-57345) & i16;
        } else {
            cVar2 = cVar;
            i15 = i16;
        }
        sVar.W(-248232106);
        List<t90.p> list = state.f116816a;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        for (t90.p pVar : list) {
            sVar.W(-1386118821);
            boolean z14 = ((((i16 & 896) ^ 384) <= 256 || !sVar.h(function13)) && (i16 & 384) != 256) ? z13 : true;
            Object J2 = sVar.J();
            if (z14 || J2 == i2.n.f71185a) {
                J2 = new t90.n(z13, function13);
                sVar.g0(J2);
            }
            sVar.r(z13);
            sVar.W(1152753998);
            wb0.j jVar = new wb0.j(pVar.f116817a.getDrawableRes(), dl2.b.u2(pVar.f116818b, sVar).toString(), new b10.z(9, (Function1) J2, pVar));
            wb0.i a13 = wb0.l.a(sVar);
            sVar.W(-1418642551);
            if (pVar.f116820d) {
                fc0.g gVar = (fc0.g) ((fc0.f) sVar.m(fc0.h.f61707g));
                int i17 = gVar.f61695a;
                qVar2 = qVar3;
                function12 = function13;
                j13 = gVar.f61699e;
            } else {
                qVar2 = qVar3;
                function12 = function13;
                j13 = b3.w.f21389m;
            }
            sVar.r(false);
            wb0.f iconBackgroundStyle = new wb0.f(f14, j13, com.bumptech.glide.d.A(eo1.c.rounding_300, sVar));
            Intrinsics.checkNotNullParameter(iconBackgroundStyle, "iconBackgroundStyle");
            wb0.g iconStyle = a13.f128997b;
            Intrinsics.checkNotNullParameter(iconStyle, "iconStyle");
            b4.q0 labelStyle = a13.f128998c;
            Intrinsics.checkNotNullParameter(labelStyle, "labelStyle");
            wb0.a aVar = new wb0.a(jVar, new wb0.i(iconBackgroundStyle, iconStyle, labelStyle, a13.f128999d));
            sVar.r(false);
            arrayList.add(aVar);
            qVar3 = qVar2;
            i16 = i13;
            z13 = 0;
            function13 = function12;
        }
        u2.q qVar4 = qVar3;
        Function1 function14 = function13;
        sVar.r(z13);
        f0.h.a(new wb0.d(arrayList), qVar4, cVar2, sVar, (i15 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8 | ((i15 >> 6) & 896), 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new f4(state, qVar4, function14, f14, cVar2, i13, i14, 2);
        }
    }

    public static void g0(ms.e eVar, x02.x0 x0Var) {
        eVar.Q0 = x0Var;
    }

    public static void g1(wn0.j jVar, tj0.b0 b0Var) {
        jVar.f130484g1 = b0Var;
    }

    public static boolean g2(char c13) {
        return c13 >= '0' && c13 <= '9';
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(w80.b1 r15, u2.q r16, i2.o r17, int r18, int r19) {
        /*
            r4 = r15
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = r17
            i2.s r0 = (i2.s) r0
            r1 = 1036668133(0x3dca4ce5, float:0.09877948)
            r0.Y(r1)
            r1 = r19 & 1
            if (r1 == 0) goto L17
            r1 = r18 | 6
            goto L29
        L17:
            r1 = r18 & 14
            if (r1 != 0) goto L27
            boolean r1 = r0.h(r15)
            if (r1 == 0) goto L23
            r1 = 4
            goto L24
        L23:
            r1 = 2
        L24:
            r1 = r18 | r1
            goto L29
        L27:
            r1 = r18
        L29:
            r2 = r19 & 2
            if (r2 == 0) goto L32
            r1 = r1 | 48
        L2f:
            r3 = r16
            goto L44
        L32:
            r3 = r18 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L2f
            r3 = r16
            boolean r5 = r0.h(r3)
            if (r5 == 0) goto L41
            r5 = 32
            goto L43
        L41:
            r5 = 16
        L43:
            r1 = r1 | r5
        L44:
            r1 = r1 & 91
            r5 = 18
            if (r1 != r5) goto L56
            boolean r1 = r0.z()
            if (r1 != 0) goto L51
            goto L56
        L51:
            r0.Q()
            r5 = r3
            goto L7c
        L56:
            if (r2 == 0) goto L5b
            u2.n r1 = u2.n.f120041b
            goto L5c
        L5b:
            r1 = r3
        L5c:
            int r2 = r4.f128260a
            g3.b r5 = com.bumptech.glide.c.M0(r2, r0)
            float r2 = r4.f128261b
            u2.q r2 = androidx.compose.foundation.layout.e.m(r1, r2)
            float r3 = r4.f128262c
            u2.q r7 = androidx.compose.foundation.layout.e.c(r2, r3)
            r10 = 0
            r11 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r13 = 56
            r14 = 120(0x78, float:1.68E-43)
            r12 = r0
            com.bumptech.glide.c.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r5 = r1
        L7c:
            i2.f2 r6 = r0.t()
            if (r6 == 0) goto L90
            q1.l r7 = new q1.l
            r3 = 5
            r0 = r7
            r1 = r18
            r2 = r19
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f71113d = r7
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el.a.h(w80.b1, u2.q, i2.o, int, int):void");
    }

    public static void h0(tj0.t tVar, x02.x0 x0Var) {
        tVar.f117894f1 = x0Var;
    }

    public static void h1(ns.r rVar, x10.b bVar) {
        rVar.H0 = bVar;
    }

    public static boolean h2(char c13) {
        return c13 >= 128 && c13 <= 255;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(u2.q r19, rm1.q r20, rm1.i r21, rm1.c r22, int r23, float r24, kotlin.jvm.functions.Function0 r25, i2.o r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: el.a.i(u2.q, rm1.q, rm1.i, rm1.c, int, float, kotlin.jvm.functions.Function0, i2.o, int, int):void");
    }

    public static void i0(wn0.j jVar, x02.x0 x0Var) {
        jVar.S0 = x0Var;
    }

    public static void i1(mq.u uVar, nx.b0 b0Var) {
        uVar.E0 = b0Var;
    }

    public static boolean i2(char c13) {
        if (c13 == '\r' || c13 == '*' || c13 == '>' || c13 == ' ') {
            return true;
        }
        if (c13 < '0' || c13 > '9') {
            return c13 >= 'A' && c13 <= 'Z';
        }
        return true;
    }

    public static final void j(uc0.r0 r0Var, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-276625832);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(r0Var)) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = 11;
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i13 & 1) != 0 && !sVar.y()) {
                sVar.Q();
                int i17 = i14 & 1;
            } else if ((i14 & 1) != 0) {
                sVar.X(1890788296);
                u1 a13 = v6.b.a(sVar);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = p2.V(a13, sVar);
                sVar.X(1729797275);
                l1 v03 = c3.v0(uc0.r0.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                r0Var = (uc0.r0) v03;
            }
            sVar.s();
            q1 z13 = bs1.c.z(r0Var.f121825e, sVar);
            r0Var.i(new uc0.i(new oc0.a(q2.i.c(-522071264, new xb0.a(r0Var, 7), sVar))));
            gh0.b.d(((uc0.q0) z13.getValue()).f121850a, null, sVar, 8, 2);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(r0Var, i13, i14, i16);
        }
    }

    public static void j0(wn0.j jVar, lh0.v vVar) {
        jVar.f130479b1 = vVar;
    }

    public static void j1(ns.r rVar, nx.b0 b0Var) {
        rVar.Q0 = b0Var;
    }

    public static final boolean j2(b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        wy0 f13 = ((b60.d) activeUserManager).f();
        if (f13 != null) {
            return Intrinsics.d(f13.q4(), Boolean.FALSE);
        }
        return false;
    }

    public static void k(String str, Exception exc) {
        Log.e("OMIDLIB", str, exc);
    }

    public static void k0(wn0.j jVar, s5 s5Var) {
        jVar.R0 = s5Var;
    }

    public static void k1(mq.u uVar, se2.a aVar) {
        uVar.A0 = aVar;
    }

    public static boolean k2(byte[] bArr) {
        int i13;
        int i14;
        int i15;
        int i16;
        if (bArr.length < 8 || bArr[0] != 48) {
            return false;
        }
        int i17 = bArr[1] & 255;
        if (i17 == 129) {
            i17 = bArr[2] & 255;
            if (i17 < 128) {
                return false;
            }
            i13 = 2;
        } else {
            if (i17 == 128 || i17 > 129) {
                return false;
            }
            i13 = 1;
        }
        if (i17 != (bArr.length - 1) - i13 || bArr[i13 + 1] != 2 || (i16 = (i15 = i13 + 3 + (i14 = bArr[i13 + 2] & 255)) + 1) >= bArr.length || i14 == 0) {
            return false;
        }
        int i18 = i13 + 3;
        byte b13 = bArr[i18];
        if ((b13 & 255) >= 128) {
            return false;
        }
        if ((i14 > 1 && b13 == 0 && (bArr[i13 + 4] & 255) < 128) || bArr[i18 + i14] != 2) {
            return false;
        }
        int i19 = bArr[i16] & 255;
        if (i15 + 2 + i19 != bArr.length || i19 == 0) {
            return false;
        }
        byte b14 = bArr[i13 + 5 + i14];
        if ((b14 & 255) >= 128) {
            return false;
        }
        return i19 <= 1 || b14 != 0 || (bArr[(i13 + 6) + i14] & 255) >= 128;
    }

    public static boolean l(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        x2(jArr2);
        byte[] u13 = u(jArr2);
        for (int i13 = 0; i13 < 32; i13++) {
            if (u13[i13] != 0) {
                return true;
            }
        }
        return false;
    }

    public static void l0(wn0.j jVar, j12.k kVar) {
        jVar.Y0 = kVar;
    }

    public static void l1(ml0.w wVar, qa2.d dVar) {
        wVar.L0 = dVar;
    }

    public static final void l2(nx.d0 pinalytics, Context context, ou1.e entryType) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        kg.t.M0(pinalytics, context, entryType, null, null, 0, 56);
    }

    public static final ha2.b0 m(ts0.b selectedOption, Function1 filterOptionSelectionHandler) {
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        Intrinsics.checkNotNullParameter(filterOptionSelectionHandler, "filterOptionSelectionHandler");
        ha2.x xVar = new ha2.x(xp1.d.homefeed_tuner_sorted_by_activity_label, null, null, null, null, 30);
        ha2.c0[] c0VarArr = new ha2.c0[3];
        ts0.b bVar = ts0.b.All;
        c0VarArr[0] = new ha2.c0(bVar.getTitle(), bVar.ordinal(), null, selectedOption == bVar, false, null, null, null, null, null, 4084);
        ts0.b bVar2 = ts0.b.Saved;
        c0VarArr[1] = new ha2.c0(bVar2.getTitle(), bVar2.ordinal(), null, selectedOption == bVar2, false, null, null, null, null, null, 4084);
        ts0.b bVar3 = ts0.b.Viewed;
        c0VarArr[2] = new ha2.c0(bVar3.getTitle(), bVar3.ordinal(), null, selectedOption == bVar3, false, null, null, null, null, null, 4084);
        return new ha2.b0(xVar, kotlin.collections.f0.j(c0VarArr), filterOptionSelectionHandler);
    }

    public static void m0(ws.o oVar, zs.a aVar) {
        oVar.f131070z0 = aVar;
    }

    public static void m1(ns.r rVar, c6 c6Var) {
        rVar.P0 = c6Var;
    }

    public static long m2(int i13, byte[] bArr) {
        return ((bArr[i13 + 2] & 255) << 16) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8);
    }

    public static void n(com.google.android.gms.internal.measurement.x xVar, bh.b bVar, b bVar2) {
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) ((gi.m) xVar.f31694b).f65093b;
        gi.m mVar = (gi.m) bVar.f22798b;
        F2(jArr2, (long[]) mVar.f65095d, (long[]) mVar.f65093b);
        long[] jArr3 = (long[]) ((gi.m) xVar.f31694b).f65095d;
        gi.m mVar2 = (gi.m) bVar.f22798b;
        E2(jArr3, (long[]) mVar2.f65095d, (long[]) mVar2.f65093b);
        Object obj = ((gi.m) xVar.f31694b).f65095d;
        q2((long[]) obj, (long[]) obj, bVar2.f59458b);
        gi.m mVar3 = (gi.m) xVar.f31694b;
        q2((long[]) mVar3.f65094c, (long[]) mVar3.f65093b, bVar2.f59457a);
        q2((long[]) xVar.f31695c, (long[]) bVar.f22799c, bVar2.f59459c);
        bVar2.b((long[]) ((gi.m) xVar.f31694b).f65093b, (long[]) ((gi.m) bVar.f22798b).f65094c);
        Object obj2 = ((gi.m) xVar.f31694b).f65093b;
        F2(jArr, (long[]) obj2, (long[]) obj2);
        gi.m mVar4 = (gi.m) xVar.f31694b;
        E2((long[]) mVar4.f65093b, (long[]) mVar4.f65094c, (long[]) mVar4.f65095d);
        gi.m mVar5 = (gi.m) xVar.f31694b;
        Object obj3 = mVar5.f65095d;
        F2((long[]) obj3, (long[]) mVar5.f65094c, (long[]) obj3);
        F2((long[]) ((gi.m) xVar.f31694b).f65094c, jArr, (long[]) xVar.f31695c);
        long[] jArr4 = (long[]) xVar.f31695c;
        E2(jArr4, jArr, jArr4);
    }

    public static void n0(to0.g gVar, bf2.d dVar) {
        gVar.f118672z0 = dVar;
    }

    public static void n1(mu.p0 p0Var, gs0.k kVar) {
        p0Var.f88224c0 = kVar;
    }

    public static long n2(int i13, byte[] bArr) {
        return ((bArr[i13 + 3] & 255) << 24) | m2(i13, bArr);
    }

    public static void o(x92.b bVar) {
        pk.a0.c(bVar);
        bVar.e("pin.board()");
        bVar.e("pin.section()");
        bVar.e("boardsection.id");
        bVar.e("boardsection.type");
        bVar.e("boardsection.title");
        sh.f.f112910e.getClass();
        if (bk.f.W()) {
            bVar.e("pin.is_quick_promotable");
        }
    }

    public static void o0(ns.r rVar, a11.d dVar) {
        rVar.J0 = dVar;
    }

    public static void o1(ml0.w wVar, t2 t2Var) {
        wVar.M0 = t2Var;
    }

    public static final void o2(String experienceIdentifier) {
        Intrinsics.checkNotNullParameter(experienceIdentifier, "experienceIdentifier");
    }

    public static void p(x92.b bVar) {
        com.bumptech.glide.d.e(bVar);
        bVar.e("user.image_medium_url");
        bVar.e("user.image_large_url");
        bVar.e("user.image_xlarge_url");
        bVar.e("user.website_url");
        n60.o.w(bVar, "user.is_primary_website_verified", "user.location", "user.explicitly_followed_by_me", "user.implicitly_followed_by_me");
        n60.o.w(bVar, "user.blocked_by_me", "user.pin_count", "user.follower_count", "user.pins_done_count");
        bVar.e("user.verified_identity");
        bVar.e("user.last_pin_save_time");
        bVar.h("user.recent_pin_images", "200x");
        n60.o.w(bVar, "user.board_count", "user.is_verified_merchant", "user.profile_cover()", "profilecoversource.images[1200x]");
    }

    public static void p0(g90.n nVar, pb0.a aVar) {
        nVar.f64539h0 = aVar;
    }

    public static void p1(iq0.g gVar, i2 i2Var) {
        gVar.f73405a1 = i2Var;
    }

    public static int p2(int i13, int i14, String str) {
        float[] fArr;
        int i15;
        int i16;
        char charAt;
        int i17 = 6;
        float f13 = 2.0f;
        float f14 = 1.0f;
        if (i13 >= str.length()) {
            return i14;
        }
        if (i14 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            float[] fArr2 = {1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr2[i14] = 0.0f;
            fArr = fArr2;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int i23 = i13 + i19;
            if (i23 == str.length()) {
                byte[] bArr = new byte[i17];
                int[] iArr = new int[i17];
                int E = E(fArr, iArr, bArr);
                int i24 = i18;
                int i25 = i24;
                while (i24 < i17) {
                    i25 += bArr[i24];
                    i24++;
                }
                if (iArr[i18] == E) {
                    return i18;
                }
                if (i25 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (i25 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (i25 != 1 || bArr[2] <= 0) {
                    return (i25 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt2 = str.charAt(i23);
            i19++;
            if (g2(charAt2)) {
                fArr[i18] = fArr[i18] + 0.5f;
            } else if (h2(charAt2)) {
                float ceil = (float) Math.ceil(fArr[i18]);
                fArr[i18] = ceil;
                fArr[i18] = ceil + f13;
            } else {
                float ceil2 = (float) Math.ceil(fArr[i18]);
                fArr[i18] = ceil2;
                fArr[i18] = ceil2 + f14;
            }
            if (charAt2 == ' ' || ((charAt2 >= '0' && charAt2 <= '9') || (charAt2 >= 'A' && charAt2 <= 'Z'))) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (h2(charAt2)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (charAt2 == ' ' || ((charAt2 >= '0' && charAt2 <= '9') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (h2(charAt2)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (i2(charAt2)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (h2(charAt2)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (charAt2 < ' ' || charAt2 > '^') {
                i15 = 4;
                if (h2(charAt2)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            } else {
                i15 = 4;
                fArr[4] = fArr[4] + 0.75f;
            }
            fArr[5] = fArr[5] + f14;
            if (i19 >= i15) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                E(fArr, iArr2, bArr2);
                int i26 = 0;
                for (int i27 = 0; i27 < 6; i27++) {
                    i26 += bArr2[i27];
                }
                i16 = 0;
                int i28 = iArr2[0];
                int i29 = iArr2[5];
                if (i28 < i29 && i28 < iArr2[1] && i28 < iArr2[2] && i28 < iArr2[3] && i28 < iArr2[4]) {
                    return 0;
                }
                if (i29 < i28) {
                    break;
                }
                byte b13 = bArr2[1];
                byte b14 = bArr2[2];
                byte b15 = bArr2[3];
                byte b16 = bArr2[4];
                if (b13 + b14 + b15 + b16 == 0) {
                    break;
                }
                if (i26 == 1 && b16 > 0) {
                    return 4;
                }
                if (i26 == 1 && b14 > 0) {
                    return 2;
                }
                if (i26 == 1 && b15 > 0) {
                    return 3;
                }
                int i33 = iArr2[1];
                int i34 = i33 + 1;
                if (i34 < i28 && i34 < i29 && i34 < iArr2[4] && i34 < iArr2[2]) {
                    int i35 = iArr2[3];
                    if (i33 < i35) {
                        return 1;
                    }
                    if (i33 == i35) {
                        int i36 = i13 + i19;
                        do {
                            i36++;
                            if (i36 >= str.length()) {
                                break;
                            }
                            charAt = str.charAt(i36);
                            if (charAt == '\r' || charAt == '*' || charAt == '>') {
                                return 3;
                            }
                        } while (i2(charAt));
                        return 1;
                    }
                }
            } else {
                i16 = 0;
            }
            i18 = i16;
            i17 = 6;
            f13 = 2.0f;
            f14 = 1.0f;
        }
        return 5;
    }

    public static void q(x92.b bVar) {
        n60.o.w(bVar, "merchantmetadata.id", "merchantmetadata.domain", "merchantmetadata.description", "merchantmetadata.display_name");
        n60.o.w(bVar, "merchantmetadata.merchant_img_link", "merchantmetadata.homepage", "merchantmetadata.user()", "user.id");
        n60.o.v(bVar, "user.about", "user.image_large_url", "user.location");
    }

    public static void q0(ws.o oVar) {
        oVar.getClass();
    }

    public static void q1(mq.u uVar, i2 i2Var) {
        uVar.f88035w0 = i2Var;
    }

    public static void q2(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        t2(jArr4, jArr2, jArr3);
        w2(jArr4, jArr);
    }

    public static void r(x92.b bVar) {
        n60.o.w(bVar, "boardsection.id", "boardsection.type", "boardsection.title", "boardsection.board()");
        pk.a0.b(bVar);
        bVar.e("board.owner()");
        bVar.e("boardsection.user()");
        df.j1.i(bVar);
        bVar.e("board.is_collaborative");
        n60.o.w(bVar, "board.collaborator_count", "board.followed_by_me", "board.collaborated_by_me", "board.archived_by_me_at");
    }

    public static void r0(mq.u uVar, se2.a aVar) {
        uVar.C0 = aVar;
    }

    public static void r1(ms.e eVar, i2 i2Var) {
        eVar.P0 = i2Var;
    }

    public static ECPoint r2(EllipticCurve ellipticCurve, ll.p pVar, byte[] bArr) {
        int D = D(ellipticCurve);
        int i13 = ll.m.f83760a[pVar.ordinal()];
        boolean z13 = false;
        if (i13 == 1) {
            if (bArr.length != (D * 2) + 1) {
                throw new GeneralSecurityException("invalid point size");
            }
            if (bArr[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i14 = D + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i14)), new BigInteger(1, Arrays.copyOfRange(bArr, i14, bArr.length)));
            f.b(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (i13 == 2) {
            if (bArr.length != D * 2) {
                throw new GeneralSecurityException("invalid point size");
            }
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, D)), new BigInteger(1, Arrays.copyOfRange(bArr, D, bArr.length)));
            f.b(eCPoint2, ellipticCurve);
            return eCPoint2;
        }
        if (i13 != 3) {
            throw new GeneralSecurityException("invalid format:" + pVar);
        }
        BigInteger d2 = f.d(ellipticCurve);
        if (bArr.length != D + 1) {
            throw new GeneralSecurityException("compressed point has wrong length");
        }
        byte b13 = bArr[0];
        if (b13 != 2) {
            if (b13 != 3) {
                throw new GeneralSecurityException("invalid format");
            }
            z13 = true;
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
        if (bigInteger.signum() == -1 || bigInteger.compareTo(d2) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        return new ECPoint(bigInteger, Q(bigInteger, z13, ellipticCurve));
    }

    public static void s(x92.b bVar) {
        pk.a0.c(bVar);
        pk.a0.b(bVar);
        bVar.h("board.cover_images", "60x60");
        bVar.e("board.has_custom_cover");
        bVar.h("board.images", "90x90");
        com.bumptech.glide.d.e(bVar);
        bVar.e("user.image_large_url");
        kh2.j.k(bVar);
        kh2.r.k(bVar);
        bVar.e("conversation.name");
        bVar.e("conversation.board()");
        bVar.e("conversation.read_times_ms");
        bVar.e("conversation.type");
        bVar.e("conversation.pinsub_topic_id");
    }

    public static void s0(g90.n nVar, nx.k kVar) {
        nVar.f64540i0 = kVar;
    }

    public static void s1(tj0.m mVar, i2 i2Var) {
        mVar.Y0 = i2Var;
    }

    public static byte[] s2(EllipticCurve ellipticCurve, ll.p pVar, ECPoint eCPoint) {
        f.b(eCPoint, ellipticCurve);
        int D = D(ellipticCurve);
        int i13 = ll.m.f83760a[pVar.ordinal()];
        if (i13 == 1) {
            int i14 = (D * 2) + 1;
            byte[] bArr = new byte[i14];
            byte[] P2 = c0.d.P2(eCPoint.getAffineX());
            byte[] P22 = c0.d.P2(eCPoint.getAffineY());
            System.arraycopy(P22, 0, bArr, i14 - P22.length, P22.length);
            System.arraycopy(P2, 0, bArr, (D + 1) - P2.length, P2.length);
            bArr[0] = 4;
            return bArr;
        }
        if (i13 != 2) {
            if (i13 != 3) {
                throw new GeneralSecurityException("invalid format:" + pVar);
            }
            int i15 = D + 1;
            byte[] bArr2 = new byte[i15];
            byte[] P23 = c0.d.P2(eCPoint.getAffineX());
            System.arraycopy(P23, 0, bArr2, i15 - P23.length, P23.length);
            bArr2[0] = (byte) (eCPoint.getAffineY().testBit(0) ? 3 : 2);
            return bArr2;
        }
        int i16 = D * 2;
        byte[] bArr3 = new byte[i16];
        byte[] P24 = c0.d.P2(eCPoint.getAffineX());
        if (P24.length > D) {
            P24 = Arrays.copyOfRange(P24, P24.length - D, P24.length);
        }
        byte[] P25 = c0.d.P2(eCPoint.getAffineY());
        if (P25.length > D) {
            P25 = Arrays.copyOfRange(P25, P25.length - D, P25.length);
        }
        System.arraycopy(P25, 0, bArr3, i16 - P25.length, P25.length);
        System.arraycopy(P24, 0, bArr3, D - P24.length, P24.length);
        return bArr3;
    }

    public static byte[] t(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        K2(eCPrivateKey, eCPublicKey);
        ECPoint w13 = eCPublicKey.getW();
        f.b(w13, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) ll.s.f83774h.a("EC")).generatePublic(new ECPublicKeySpec(w13, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) ll.s.f83772f.a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(f.d(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            Q(bigInteger, true, curve);
            return generateSecret;
        } catch (IllegalStateException e13) {
            throw new GeneralSecurityException(e13);
        }
    }

    public static void t0(iq0.e eVar, z6 z6Var) {
        eVar.f73400w0 = z6Var;
    }

    public static void t1(tj0.t tVar, i2 i2Var) {
        tVar.f117890b1 = i2Var;
    }

    public static void t2(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j13 = jArr2[0];
        long j14 = jArr3[1] * j13;
        long j15 = jArr2[1];
        long j16 = jArr3[0];
        jArr[1] = (j15 * j16) + j14;
        long j17 = jArr2[1];
        long j18 = jArr3[1];
        jArr[2] = (jArr2[2] * j16) + (jArr3[2] * j13) + (j17 * 2 * j18);
        long j19 = jArr3[2];
        long j23 = jArr2[2];
        jArr[3] = (jArr2[3] * j16) + (jArr3[3] * j13) + (j23 * j18) + (j17 * j19);
        long j24 = jArr3[3];
        long j25 = jArr2[3];
        jArr[4] = (jArr2[4] * j16) + (jArr3[4] * j13) + (((j25 * j18) + (j17 * j24)) * 2) + (j23 * j19);
        long j26 = jArr3[4];
        long j27 = (j17 * j26) + (j25 * j19) + (j23 * j24);
        long j28 = jArr2[4];
        jArr[5] = (jArr2[5] * j16) + (jArr3[5] * j13) + (j28 * j18) + j27;
        long j29 = jArr3[5];
        long j33 = jArr2[5];
        jArr[6] = (jArr2[6] * j16) + (jArr3[6] * j13) + (j28 * j19) + (j23 * j26) + (((j33 * j18) + (j17 * j29) + (j25 * j24)) * 2);
        long j34 = (j33 * j19) + (j23 * j29) + (j28 * j24) + (j25 * j26);
        long j35 = jArr3[6];
        long j36 = (j17 * j35) + j34;
        long j37 = jArr2[6];
        jArr[7] = (jArr2[7] * j16) + (jArr3[7] * j13) + (j37 * j18) + j36;
        long j38 = jArr3[7];
        long j39 = (j17 * j38) + (j33 * j24) + (j25 * j29);
        long j43 = jArr2[7];
        long j44 = (((j43 * j18) + j39) * 2) + (j28 * j26);
        jArr[8] = (jArr2[8] * j16) + (jArr3[8] * j13) + (j37 * j19) + (j23 * j35) + j44;
        long j45 = (j43 * j19) + (j23 * j38) + (j37 * j24) + (j25 * j35) + (j33 * j26) + (j28 * j29);
        long j46 = jArr3[8];
        long j47 = (j17 * j46) + j45;
        long j48 = jArr2[8];
        jArr[9] = (jArr2[9] * j16) + (j13 * jArr3[9]) + (j48 * j18) + j47;
        long j49 = (j43 * j24) + (j25 * j38) + (j33 * j29);
        long j53 = jArr3[9];
        long j54 = jArr2[9];
        long j55 = j28 * j35;
        jArr[10] = (j48 * j19) + (j23 * j46) + (j37 * j26) + j55 + (((j18 * j54) + (j17 * j53) + j49) * 2);
        long j56 = j23 * j53;
        long j57 = j19 * j54;
        jArr[11] = j57 + j56 + (j48 * j24) + (j25 * j46) + (j43 * j26) + (j28 * j38) + (j37 * j29) + (j33 * j35);
        long j58 = j25 * j53;
        long j59 = j24 * j54;
        long j63 = j48 * j26;
        jArr[12] = j63 + (j28 * j46) + ((j59 + j58 + (j43 * j29) + (j33 * j38)) * 2) + (j37 * j35);
        long j64 = j28 * j53;
        long j65 = j26 * j54;
        jArr[13] = j65 + j64 + (j48 * j29) + (j33 * j46) + (j43 * j35) + (j37 * j38);
        long j66 = j29 * j54;
        long j67 = j48 * j35;
        jArr[14] = j67 + (j37 * j46) + ((j66 + (j33 * j53) + (j43 * j38)) * 2);
        long j68 = j37 * j53;
        long j69 = j35 * j54;
        jArr[15] = j69 + j68 + (j48 * j38) + (j43 * j46);
        jArr[16] = (((j38 * j54) + (j43 * j53)) * 2) + (j48 * j46);
        jArr[17] = (j46 * j54) + (j48 * j53);
        jArr[18] = j54 * 2 * j53;
    }

    public static byte[] u(long[] jArr) {
        int[] iArr;
        int i13;
        int[] iArr2;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i14 = 0;
        while (true) {
            iArr = f59449i;
            i13 = 2;
            if (i14 >= 2) {
                break;
            }
            int i15 = 0;
            while (i15 < 9) {
                long j13 = copyOf[i15];
                int i16 = -((int) (((j13 >> 31) & j13) >> iArr[i15 & 1]));
                copyOf[i15] = j13 + (i16 << r15);
                i15++;
                copyOf[i15] = copyOf[i15] - i16;
            }
            long j14 = copyOf[9];
            copyOf[9] = j14 + (r4 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j14 >> 31) & j14) >> 25))) * 19);
            i14++;
        }
        long j15 = copyOf[0];
        copyOf[0] = j15 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j15 >> 31) & j15) >> 26)));
        int i17 = 0;
        while (true) {
            iArr2 = f59448h;
            if (i17 >= i13) {
                break;
            }
            int i18 = 0;
            while (i18 < 9) {
                long j16 = copyOf[i18];
                int i19 = (int) (j16 >> iArr[i18 & 1]);
                copyOf[i18] = iArr2[r16] & j16;
                i18++;
                copyOf[i18] = copyOf[i18] + i19;
            }
            i17++;
            i13 = 2;
        }
        copyOf[9] = copyOf[9] & 33554431;
        long j17 = (((int) (r3 >> 25)) * 19) + copyOf[0];
        copyOf[0] = j17;
        int i23 = ~((((int) j17) - 67108845) >> 31);
        for (int i24 = 1; i24 < 10; i24++) {
            int i25 = ~(((int) copyOf[i24]) ^ iArr2[i24 & 1]);
            int i26 = i25 & (i25 << 16);
            int i27 = i26 & (i26 << 8);
            int i28 = i27 & (i27 << 4);
            int i29 = i28 & (i28 << 2);
            i23 &= (i29 & (i29 << 1)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i23);
        long j18 = 33554431 & i23;
        copyOf[1] = copyOf[1] - j18;
        for (int i33 = 2; i33 < 10; i33 += 2) {
            copyOf[i33] = copyOf[i33] - (67108863 & i23);
            int i34 = i33 + 1;
            copyOf[i34] = copyOf[i34] - j18;
        }
        for (int i35 = 0; i35 < 10; i35++) {
            copyOf[i35] = copyOf[i35] << f59447g[i35];
        }
        byte[] bArr = new byte[32];
        for (int i36 = 0; i36 < 10; i36++) {
            int i37 = f59446f[i36];
            long j19 = bArr[i37];
            long j23 = copyOf[i36];
            bArr[i37] = (byte) (j19 | (j23 & 255));
            bArr[i37 + 1] = (byte) (bArr[r5] | ((j23 >> 8) & 255));
            bArr[i37 + 2] = (byte) (bArr[r5] | ((j23 >> 16) & 255));
            bArr[i37 + 3] = (byte) (bArr[r4] | ((j23 >> 24) & 255));
        }
        return bArr;
    }

    public static void u0(iq0.e eVar, a7 a7Var) {
        eVar.f73401x0 = a7Var;
    }

    public static void u1(wn0.j jVar, i2 i2Var) {
        jVar.T0 = i2Var;
    }

    public static Provider u2() {
        String[] strArr = f59441a;
        for (int i13 = 0; i13 < 3; i13++) {
            Provider provider = Security.getProvider(strArr[i13]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static void v(int i13, long[] jArr, long[] jArr2) {
        int i14 = -i13;
        for (int i15 = 0; i15 < 10; i15++) {
            long j13 = jArr[i15];
            jArr[i15] = ((int) j13) ^ ((((int) j13) ^ ((int) jArr2[i15])) & i14);
        }
    }

    public static void v0(iq0.g gVar, b7 b7Var) {
        gVar.f73406b1 = b7Var;
    }

    public static void v1(ws.o oVar) {
        oVar.getClass();
    }

    public static void v2(byte[] bArr) {
        long m23 = m2(0, bArr) & 2097151;
        long n23 = (n2(2, bArr) >> 5) & 2097151;
        long m24 = (m2(5, bArr) >> 2) & 2097151;
        long n24 = (n2(7, bArr) >> 7) & 2097151;
        long n25 = (n2(10, bArr) >> 4) & 2097151;
        long m25 = (m2(13, bArr) >> 1) & 2097151;
        long n26 = (n2(15, bArr) >> 6) & 2097151;
        long m26 = (m2(18, bArr) >> 3) & 2097151;
        long m27 = m2(21, bArr) & 2097151;
        long n27 = (n2(23, bArr) >> 5) & 2097151;
        long m28 = (m2(26, bArr) >> 2) & 2097151;
        long n28 = (n2(28, bArr) >> 7) & 2097151;
        long n29 = (n2(31, bArr) >> 4) & 2097151;
        long m29 = (m2(34, bArr) >> 1) & 2097151;
        long n210 = (n2(36, bArr) >> 6) & 2097151;
        long m210 = (m2(39, bArr) >> 3) & 2097151;
        long m211 = m2(42, bArr) & 2097151;
        long n211 = (n2(44, bArr) >> 5) & 2097151;
        long m212 = (m2(47, bArr) >> 2) & 2097151;
        long n212 = (n2(49, bArr) >> 7) & 2097151;
        long n213 = (n2(52, bArr) >> 4) & 2097151;
        long m213 = (m2(55, bArr) >> 1) & 2097151;
        long n214 = (n2(57, bArr) >> 6) & 2097151;
        long n215 = n2(60, bArr) >> 3;
        long j13 = (n215 * 666643) + n28;
        long j14 = (n215 * 470296) + n29;
        long j15 = (n215 * 654183) + m29;
        long j16 = n210 - (n215 * 997805);
        long j17 = (n215 * 136657) + m210;
        long j18 = m211 - (n215 * 683901);
        long j19 = (n214 * 666643) + m28;
        long j23 = (n214 * 470296) + j13;
        long j24 = (n214 * 654183) + j14;
        long j25 = j15 - (n214 * 997805);
        long j26 = (n214 * 136657) + j16;
        long j27 = j17 - (n214 * 683901);
        long j28 = (m213 * 666643) + n27;
        long j29 = (m213 * 470296) + j19;
        long j33 = (m213 * 654183) + j23;
        long j34 = j24 - (m213 * 997805);
        long j35 = (m213 * 136657) + j25;
        long j36 = j26 - (m213 * 683901);
        long j37 = (n213 * 666643) + m27;
        long j38 = (n213 * 470296) + j28;
        long j39 = (n213 * 654183) + j29;
        long j43 = j33 - (n213 * 997805);
        long j44 = (n213 * 136657) + j34;
        long j45 = j35 - (n213 * 683901);
        long j46 = (n212 * 666643) + m26;
        long j47 = (n212 * 470296) + j37;
        long j48 = (n212 * 654183) + j38;
        long j49 = j39 - (n212 * 997805);
        long j53 = (n212 * 136657) + j43;
        long j54 = j44 - (n212 * 683901);
        long j55 = (m212 * 666643) + n26;
        long j56 = (m212 * 470296) + j46;
        long j57 = (m212 * 654183) + j47;
        long j58 = j48 - (m212 * 997805);
        long j59 = (m212 * 136657) + j49;
        long j63 = j53 - (m212 * 683901);
        long j64 = (j55 + 1048576) >> 21;
        long j65 = j56 + j64;
        long j66 = j55 - (j64 << 21);
        long j67 = (j57 + 1048576) >> 21;
        long j68 = j58 + j67;
        long j69 = j57 - (j67 << 21);
        long j73 = (j59 + 1048576) >> 21;
        long j74 = j63 + j73;
        long j75 = j59 - (j73 << 21);
        long j76 = (j54 + 1048576) >> 21;
        long j77 = j45 + j76;
        long j78 = j54 - (j76 << 21);
        long j79 = (j36 + 1048576) >> 21;
        long j83 = j27 + j79;
        long j84 = j36 - (j79 << 21);
        long j85 = (j18 + 1048576) >> 21;
        long j86 = n211 + j85;
        long j87 = j18 - (j85 << 21);
        long j88 = (j65 + 1048576) >> 21;
        long j89 = j69 + j88;
        long j93 = j65 - (j88 << 21);
        long j94 = (j68 + 1048576) >> 21;
        long j95 = j75 + j94;
        long j96 = j68 - (j94 << 21);
        long j97 = (j74 + 1048576) >> 21;
        long j98 = j78 + j97;
        long j99 = j74 - (j97 << 21);
        long j100 = (j77 + 1048576) >> 21;
        long j101 = j84 + j100;
        long j102 = j77 - (j100 << 21);
        long j103 = (j83 + 1048576) >> 21;
        long j104 = j87 + j103;
        long j105 = j83 - (j103 << 21);
        long j106 = (j86 * 666643) + m25;
        long j107 = (j86 * 470296) + j66;
        long j108 = (j86 * 654183) + j93;
        long j109 = j89 - (j86 * 997805);
        long j110 = (j86 * 136657) + j96;
        long j111 = j95 - (j86 * 683901);
        long j112 = (j104 * 666643) + n25;
        long j113 = (j104 * 470296) + j106;
        long j114 = (j104 * 654183) + j107;
        long j115 = j108 - (j104 * 997805);
        long j116 = (j104 * 136657) + j109;
        long j117 = j110 - (j104 * 683901);
        long j118 = (j105 * 666643) + n24;
        long j119 = (j105 * 470296) + j112;
        long j120 = (j105 * 654183) + j113;
        long j121 = (j105 * 136657) + j115;
        long j122 = j116 - (j105 * 683901);
        long j123 = (j101 * 666643) + m24;
        long j124 = (j101 * 470296) + j118;
        long j125 = (j101 * 654183) + j119;
        long j126 = (j101 * 136657) + (j114 - (j105 * 997805));
        long j127 = (j102 * 666643) + n23;
        long j128 = (j102 * 470296) + j123;
        long j129 = (j102 * 654183) + j124;
        long j130 = j125 - (j102 * 997805);
        long j131 = (j102 * 136657) + (j120 - (j101 * 997805));
        long j132 = j126 - (j102 * 683901);
        long j133 = (j98 * 666643) + m23;
        long j134 = (j98 * 654183) + j128;
        long j135 = (j98 * 136657) + j130;
        long j136 = (j133 + 1048576) >> 21;
        long j137 = (j98 * 470296) + j127 + j136;
        long j138 = j133 - (j136 << 21);
        long j139 = (j134 + 1048576) >> 21;
        long j140 = (j129 - (j98 * 997805)) + j139;
        long j141 = j134 - (j139 << 21);
        long j142 = (j135 + 1048576) >> 21;
        long j143 = (j131 - (j98 * 683901)) + j142;
        long j144 = j135 - (j142 << 21);
        long j145 = (j132 + 1048576) >> 21;
        long j146 = (j121 - (j101 * 683901)) + j145;
        long j147 = j132 - (j145 << 21);
        long j148 = (j122 + 1048576) >> 21;
        long j149 = j117 + j148;
        long j150 = j122 - (j148 << 21);
        long j151 = (j111 + 1048576) >> 21;
        long j152 = j99 + j151;
        long j153 = j111 - (j151 << 21);
        long j154 = (j137 + 1048576) >> 21;
        long j155 = j141 + j154;
        long j156 = j137 - (j154 << 21);
        long j157 = (j140 + 1048576) >> 21;
        long j158 = j144 + j157;
        long j159 = j140 - (j157 << 21);
        long j160 = (j143 + 1048576) >> 21;
        long j161 = j147 + j160;
        long j162 = j143 - (j160 << 21);
        long j163 = (j146 + 1048576) >> 21;
        long j164 = j150 + j163;
        long j165 = j146 - (j163 << 21);
        long j166 = (j149 + 1048576) >> 21;
        long j167 = (j152 + 1048576) >> 21;
        long j168 = (j167 * 666643) + j138;
        long j169 = (j167 * 136657) + j158;
        long j170 = j168 >> 21;
        long j171 = (j167 * 470296) + j156 + j170;
        long j172 = j168 - (j170 << 21);
        long j173 = j171 >> 21;
        long j174 = (j167 * 654183) + j155 + j173;
        long j175 = j171 - (j173 << 21);
        long j176 = j174 >> 21;
        long j177 = (j159 - (j167 * 997805)) + j176;
        long j178 = j174 - (j176 << 21);
        long j179 = j177 >> 21;
        long j180 = j169 + j179;
        long j181 = j177 - (j179 << 21);
        long j182 = j180 >> 21;
        long j183 = (j162 - (j167 * 683901)) + j182;
        long j184 = j180 - (j182 << 21);
        long j185 = j183 >> 21;
        long j186 = j161 + j185;
        long j187 = j183 - (j185 << 21);
        long j188 = j186 >> 21;
        long j189 = j165 + j188;
        long j190 = j186 - (j188 << 21);
        long j191 = j189 >> 21;
        long j192 = j164 + j191;
        long j193 = j189 - (j191 << 21);
        long j194 = j192 >> 21;
        long j195 = (j149 - (j166 << 21)) + j194;
        long j196 = j192 - (j194 << 21);
        long j197 = j195 >> 21;
        long j198 = j153 + j166 + j197;
        long j199 = j195 - (j197 << 21);
        long j200 = j198 >> 21;
        long j201 = (j152 - (j167 << 21)) + j200;
        long j202 = j198 - (j200 << 21);
        long j203 = j201 >> 21;
        long j204 = j201 - (j203 << 21);
        long j205 = (666643 * j203) + j172;
        long j206 = (654183 * j203) + j178;
        long j207 = j181 - (997805 * j203);
        long j208 = (136657 * j203) + j184;
        long j209 = j187 - (j203 * 683901);
        long j210 = j205 >> 21;
        long j211 = (470296 * j203) + j175 + j210;
        long j212 = j211 >> 21;
        long j213 = j206 + j212;
        long j214 = j211 - (j212 << 21);
        long j215 = j213 >> 21;
        long j216 = j207 + j215;
        long j217 = j213 - (j215 << 21);
        long j218 = j216 >> 21;
        long j219 = j208 + j218;
        long j220 = j216 - (j218 << 21);
        long j221 = j219 >> 21;
        long j222 = j209 + j221;
        long j223 = j219 - (j221 << 21);
        long j224 = j222 >> 21;
        long j225 = j190 + j224;
        long j226 = j222 - (j224 << 21);
        long j227 = j225 >> 21;
        long j228 = j193 + j227;
        long j229 = j225 - (j227 << 21);
        long j230 = j228 >> 21;
        long j231 = j196 + j230;
        long j232 = j228 - (j230 << 21);
        long j233 = j231 >> 21;
        long j234 = j199 + j233;
        long j235 = j231 - (j233 << 21);
        long j236 = j234 >> 21;
        long j237 = j202 + j236;
        long j238 = j234 - (j236 << 21);
        long j239 = j237 >> 21;
        long j240 = j204 + j239;
        long j241 = j237 - (j239 << 21);
        bArr[0] = (byte) (j205 - (j210 << 21));
        bArr[1] = (byte) (r2 >> 8);
        bArr[2] = (byte) ((r2 >> 16) | (j214 << 5));
        bArr[3] = (byte) (j214 >> 3);
        bArr[4] = (byte) (j214 >> 11);
        bArr[5] = (byte) ((j214 >> 19) | (j217 << 2));
        bArr[6] = (byte) (j217 >> 6);
        bArr[7] = (byte) ((j217 >> 14) | (j220 << 7));
        bArr[8] = (byte) (j220 >> 1);
        bArr[9] = (byte) (j220 >> 9);
        bArr[10] = (byte) ((j220 >> 17) | (j223 << 4));
        bArr[11] = (byte) (j223 >> 4);
        bArr[12] = (byte) (j223 >> 12);
        bArr[13] = (byte) ((j223 >> 20) | (j226 << 1));
        bArr[14] = (byte) (j226 >> 7);
        bArr[15] = (byte) ((j226 >> 15) | (j229 << 6));
        bArr[16] = (byte) (j229 >> 2);
        bArr[17] = (byte) (j229 >> 10);
        bArr[18] = (byte) ((j229 >> 18) | (j232 << 3));
        bArr[19] = (byte) (j232 >> 5);
        bArr[20] = (byte) (j232 >> 13);
        bArr[21] = (byte) j235;
        bArr[22] = (byte) (j235 >> 8);
        bArr[23] = (byte) ((j235 >> 16) | (j238 << 5));
        bArr[24] = (byte) (j238 >> 3);
        bArr[25] = (byte) (j238 >> 11);
        bArr[26] = (byte) ((j238 >> 19) | (j241 << 2));
        bArr[27] = (byte) (j241 >> 6);
        bArr[28] = (byte) ((j241 >> 14) | (j240 << 7));
        bArr[29] = (byte) (j240 >> 1);
        bArr[30] = (byte) (j240 >> 9);
        bArr[31] = (byte) (j240 >> 17);
    }

    public static final IdeaPinHandDrawingEditor w(Context context, final IdeaPinHandDrawingView drawingCanvasView, boolean z13, final ao2.j0 j0Var, final Function1 function1, com.facebook.login.o listener) {
        IdeaPinHandDrawingEditor listener2 = new IdeaPinHandDrawingEditor(6, context, (AttributeSet) null);
        int i13 = eo1.a.sema_color_text_default;
        int i14 = 0;
        for (ImageView imageView : listener2.f46490h) {
            imageView.setColorFilter(dl2.b.y0(listener2, i13));
            imageView.setAlpha(0.7f);
            imageView.setSelected(false);
        }
        com.bumptech.glide.c.u1(listener2.f46492j);
        pk.a0.l0(listener2.f46491i);
        Intrinsics.checkNotNullParameter(drawingCanvasView, "drawingCanvasView");
        drawingCanvasView.getClass();
        Intrinsics.checkNotNullParameter(listener2, "listener");
        drawingCanvasView.f46518j = listener2;
        listener2.f46483a = drawingCanvasView;
        com.facebook.login.o listener3 = new com.facebook.login.o(function1);
        Intrinsics.checkNotNullParameter(listener3, "listener");
        listener2.f46505w = listener3;
        if (listener != null) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            listener2.f46506x = listener;
        }
        w80.e0 onTap = new w80.e0(i14, function1);
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        listener2.f46498p.setOnClickListener(onTap);
        ou0.k listener4 = new ou0.k() { // from class: w80.f0
            @Override // ou0.k
            public final void O(List paths) {
                Function1 onEvent = function1;
                Intrinsics.checkNotNullParameter(onEvent, "$onEvent");
                ao2.j0 scope = j0Var;
                Intrinsics.checkNotNullParameter(scope, "$scope");
                IdeaPinHandDrawingView drawingView = drawingCanvasView;
                Intrinsics.checkNotNullParameter(drawingView, "$drawingView");
                Intrinsics.checkNotNullParameter(paths, "paths");
                onEvent.invoke(new s80.u0(!paths.isEmpty()));
                kotlin.jvm.internal.j.z(scope, null, null, new n0(drawingView, onEvent, null), 3);
            }
        };
        Intrinsics.checkNotNullParameter(listener4, "listener");
        listener2.f46504v = listener4;
        listener2.f46508z = z13;
        return listener2;
    }

    public static void w0(kd0.b bVar, l7 l7Var) {
        bVar.C0 = l7Var;
    }

    public static void w1(AccountSwitcherRowView accountSwitcherRowView, nx.f0 f0Var) {
        accountSwitcherRowView.f45077j = f0Var;
    }

    public static void w2(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        y2(jArr);
        x2(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static final t90.p x(int i13, rm1.q icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        ArrayList arrayList = new ArrayList(formatArgs.length);
        for (String str : formatArgs) {
            arrayList.add(new u50.f0(str));
        }
        return new t90.p(icon, new u50.k0(i13, arrayList), icon.getDrawableRes(), false);
    }

    public static void x0(com.pinterest.creatorHub.feature.creatorpathways.f fVar, k7 k7Var) {
        fVar.f44785j0 = k7Var;
    }

    public static void x1(wn0.j jVar, nx.f0 f0Var) {
        jVar.W0 = f0Var;
    }

    public static void x2(long[] jArr) {
        jArr[10] = 0;
        int i13 = 0;
        while (i13 < 10) {
            long j13 = jArr[i13];
            long j14 = j13 / 67108864;
            jArr[i13] = j13 - (j14 << 26);
            int i14 = i13 + 1;
            long j15 = jArr[i14] + j14;
            jArr[i14] = j15;
            long j16 = j15 / 33554432;
            jArr[i14] = j15 - (j16 << 25);
            i13 += 2;
            jArr[i13] = jArr[i13] + j16;
        }
        long j17 = jArr[0];
        long j18 = jArr[10];
        long j19 = j17 + (j18 << 4);
        jArr[0] = j19;
        long j23 = j19 + (j18 << 1);
        jArr[0] = j23;
        long j24 = j23 + j18;
        jArr[0] = j24;
        jArr[10] = 0;
        long j25 = j24 / 67108864;
        jArr[0] = j24 - (j25 << 26);
        jArr[1] = jArr[1] + j25;
    }

    public static NavigationImpl y(boolean z13, boolean z14, String searchQuery, List pinIds, CutoutPickerPage cutoutPickerPage, int i13, ml1.b transition, int i14) {
        if ((i14 & 2) != 0) {
            z14 = false;
        }
        if ((i14 & 4) != 0) {
            searchQuery = "";
        }
        za0.b searchType = za0.b.All;
        if ((i14 & 16) != 0) {
            pinIds = kotlin.collections.q0.f80391a;
        }
        if ((i14 & 32) != 0) {
            cutoutPickerPage = null;
        }
        if ((i14 & 64) != 0) {
            i13 = 3;
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
            transition = ml1.b.UNSPECIFIED_TRANSITION;
        }
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        Intrinsics.checkNotNullParameter("", "id");
        Intrinsics.checkNotNullParameter(transition, "transition");
        NavigationImpl L = Navigation.L(z13 ? (ScreenLocation) com.pinterest.screens.s0.f51313b.getValue() : (ScreenLocation) com.pinterest.screens.s0.f51312a.getValue(), "", transition.getValue());
        L.Y1("CutoutPickerExtras.CUTOUT_PICKER_IS_ONBOARDING", z14);
        L.m0("CutoutPickerExtras.CUTOUT_PICKER_KEY_SEARCH_QUERY", searchQuery);
        L.z(searchType.ordinal(), "CutoutPickerExtras.CUTOUT_PICKER_KEY_SEARCH_TYPE");
        L.d("CutoutPickerExtras.CUTOUT_PICKER_KEY_PIN_IDS", new ArrayList(pinIds));
        L.z(i13, "CutoutPickerExtras.CUTOUT_PICKER_KEY_NUM_COLUMNS");
        if (cutoutPickerPage != null) {
            L.w0(cutoutPickerPage, "CutoutPickerExtras.CUTOUT_PICKER_KEY_PAGE");
        }
        Intrinsics.checkNotNullExpressionValue(L, "apply(...)");
        return L;
    }

    public static void y0(kd0.b bVar, lh0.r0 r0Var) {
        bVar.f79223z0 = r0Var;
    }

    public static void y1(ns.r rVar, nx.o0 o0Var) {
        rVar.L0 = o0Var;
    }

    public static void y2(long[] jArr) {
        long j13 = jArr[8];
        long j14 = jArr[18];
        long j15 = j13 + (j14 << 4);
        jArr[8] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[8] = j16;
        jArr[8] = j16 + j14;
        long j17 = jArr[7];
        long j18 = jArr[17];
        long j19 = j17 + (j18 << 4);
        jArr[7] = j19;
        long j23 = j19 + (j18 << 1);
        jArr[7] = j23;
        jArr[7] = j23 + j18;
        long j24 = jArr[6];
        long j25 = jArr[16];
        long j26 = j24 + (j25 << 4);
        jArr[6] = j26;
        long j27 = j26 + (j25 << 1);
        jArr[6] = j27;
        jArr[6] = j27 + j25;
        long j28 = jArr[5];
        long j29 = jArr[15];
        long j33 = j28 + (j29 << 4);
        jArr[5] = j33;
        long j34 = j33 + (j29 << 1);
        jArr[5] = j34;
        jArr[5] = j34 + j29;
        long j35 = jArr[4];
        long j36 = jArr[14];
        long j37 = j35 + (j36 << 4);
        jArr[4] = j37;
        long j38 = j37 + (j36 << 1);
        jArr[4] = j38;
        jArr[4] = j38 + j36;
        long j39 = jArr[3];
        long j43 = jArr[13];
        long j44 = j39 + (j43 << 4);
        jArr[3] = j44;
        long j45 = j44 + (j43 << 1);
        jArr[3] = j45;
        jArr[3] = j45 + j43;
        long j46 = jArr[2];
        long j47 = jArr[12];
        long j48 = j46 + (j47 << 4);
        jArr[2] = j48;
        long j49 = j48 + (j47 << 1);
        jArr[2] = j49;
        jArr[2] = j49 + j47;
        long j53 = jArr[1];
        long j54 = jArr[11];
        long j55 = j53 + (j54 << 4);
        jArr[1] = j55;
        long j56 = j55 + (j54 << 1);
        jArr[1] = j56;
        jArr[1] = j56 + j54;
        long j57 = jArr[0];
        long j58 = jArr[10];
        long j59 = j57 + (j58 << 4);
        jArr[0] = j59;
        long j63 = j59 + (j58 << 1);
        jArr[0] = j63;
        jArr[0] = j63 + j58;
    }

    public static void z(gi.m mVar, com.google.android.gms.internal.measurement.x xVar) {
        long[] jArr = new long[10];
        C2((long[]) ((gi.m) xVar.f31694b).f65093b, (long[]) mVar.f65093b);
        C2((long[]) ((gi.m) xVar.f31694b).f65094c, (long[]) mVar.f65095d);
        C2((long[]) xVar.f31695c, (long[]) mVar.f65094c);
        long[] jArr2 = (long[]) xVar.f31695c;
        F2(jArr2, jArr2, jArr2);
        F2((long[]) ((gi.m) xVar.f31694b).f65095d, (long[]) mVar.f65093b, (long[]) mVar.f65095d);
        C2(jArr, (long[]) ((gi.m) xVar.f31694b).f65095d);
        gi.m mVar2 = (gi.m) xVar.f31694b;
        F2((long[]) mVar2.f65095d, (long[]) mVar2.f65094c, (long[]) mVar2.f65093b);
        gi.m mVar3 = (gi.m) xVar.f31694b;
        Object obj = mVar3.f65094c;
        E2((long[]) obj, (long[]) obj, (long[]) mVar3.f65093b);
        gi.m mVar4 = (gi.m) xVar.f31694b;
        E2((long[]) mVar4.f65093b, jArr, (long[]) mVar4.f65095d);
        long[] jArr3 = (long[]) xVar.f31695c;
        E2(jArr3, jArr3, (long[]) ((gi.m) xVar.f31694b).f65094c);
    }

    public static void z0(qv0.j jVar, ag1.b bVar) {
        jVar.A0 = bVar;
    }

    public static void z1(iq0.e eVar, ip1.b bVar) {
        eVar.f73403z0 = bVar;
    }

    public static gi.m z2(byte[] bArr) {
        int i13;
        byte[] bArr2 = new byte[64];
        int i14 = 0;
        while (true) {
            if (i14 >= 32) {
                break;
            }
            int i15 = i14 * 2;
            bArr2[i15] = (byte) (bArr[i14] & 15);
            bArr2[i15 + 1] = (byte) (((bArr[i14] & 255) >> 4) & 15);
            i14++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < 63) {
            byte b13 = (byte) (bArr2[i16] + i17);
            bArr2[i16] = b13;
            int i18 = (b13 + 8) >> 4;
            bArr2[i16] = (byte) (b13 - (i18 << 4));
            i16++;
            i17 = i18;
        }
        bArr2[63] = (byte) (bArr2[63] + i17);
        com.google.android.gms.internal.measurement.x xVar = new com.google.android.gms.internal.measurement.x();
        bh.b bVar = new bh.b(15);
        for (i13 = 1; i13 < 64; i13 += 2) {
            b bVar2 = new b();
            A2(bVar2, i13 / 2, bArr2[i13]);
            bh.b.j(bVar, xVar);
            n(xVar, bVar, bVar2);
        }
        gi.m mVar = new gi.m(14);
        gi.m.w(mVar, xVar);
        z(mVar, xVar);
        gi.m.w(mVar, xVar);
        z(mVar, xVar);
        gi.m.w(mVar, xVar);
        z(mVar, xVar);
        gi.m.w(mVar, xVar);
        z(mVar, xVar);
        for (int i19 = 0; i19 < 64; i19 += 2) {
            b bVar3 = new b();
            A2(bVar3, i19 / 2, bArr2[i19]);
            bh.b.j(bVar, xVar);
            n(xVar, bVar, bVar3);
        }
        gi.m mVar2 = new gi.m(xVar);
        long[] jArr = new long[10];
        C2(jArr, (long[]) mVar2.f65093b);
        long[] jArr2 = new long[10];
        C2(jArr2, (long[]) mVar2.f65095d);
        long[] jArr3 = new long[10];
        C2(jArr3, (long[]) mVar2.f65094c);
        long[] jArr4 = new long[10];
        C2(jArr4, jArr3);
        long[] jArr5 = new long[10];
        E2(jArr5, jArr2, jArr);
        q2(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        q2(jArr6, jArr, jArr2);
        q2(jArr6, jArr6, d.f59464a);
        F2(jArr6, jArr6, jArr4);
        w2(jArr6, jArr6);
        if (MessageDigest.isEqual(u(jArr5), u(jArr6))) {
            return mVar2;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }
}
