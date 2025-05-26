package ll;

import el.c1;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l implements uk.s {

    /* renamed from: d, reason: collision with root package name */
    public static final yk.d f83756d = yk.d.ALGORITHM_NOT_FIPS;

    /* renamed from: a, reason: collision with root package name */
    public final ml.a f83757a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f83758b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f83759c;

    public l(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!f83756d.isCompatible()) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        this.f83757a = ml.a.a(bArr);
        this.f83758b = bArr2;
        this.f83759c = bArr3;
        if (el.d.f59464a == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    @Override // uk.s
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f83758b;
        int length = bArr3.length;
        byte[] bArr4 = this.f83759c;
        if (length == 0 && bArr4.length == 0) {
            b(bArr, bArr2);
        } else {
            if (!c1.b(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            if (bArr4.length != 0) {
                bArr2 = kg.t.u(bArr2, bArr4);
            }
            b(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        if (bArr3.length != 64) {
            throw new GeneralSecurityException("The length of the signature is not 64.");
        }
        byte[] b13 = this.f83757a.b();
        if (bArr3.length == 64) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i13 = 31;
            while (true) {
                if (i13 < 0) {
                    break;
                }
                int i14 = copyOfRange[i13] & 255;
                int i15 = el.a.f59445e[i13] & 255;
                if (i14 == i15) {
                    i13--;
                    bArr3 = bArr;
                    copyOfRange = copyOfRange;
                } else if (i14 < i15) {
                    MessageDigest messageDigest = (MessageDigest) s.f83771e.a("SHA-512");
                    messageDigest.update(bArr3, 0, 32);
                    messageDigest.update(b13);
                    messageDigest.update(bArr2);
                    byte[] digest = messageDigest.digest();
                    el.a.v2(digest);
                    long[] jArr = new long[10];
                    long[] C = el.a.C(b13);
                    long[] jArr2 = new long[10];
                    jArr2[0] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    el.a.C2(jArr4, C);
                    el.a.q2(jArr5, jArr4, el.d.f59464a);
                    el.a.E2(jArr4, jArr4, jArr2);
                    el.a.F2(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    el.a.C2(jArr8, jArr5);
                    el.a.q2(jArr8, jArr8, jArr5);
                    el.a.C2(jArr, jArr8);
                    el.a.q2(jArr, jArr, jArr5);
                    el.a.q2(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    el.a.C2(jArr9, jArr);
                    el.a.C2(jArr10, jArr9);
                    el.a.C2(jArr10, jArr10);
                    el.a.q2(jArr10, jArr, jArr10);
                    el.a.q2(jArr9, jArr9, jArr10);
                    el.a.C2(jArr9, jArr9);
                    el.a.q2(jArr9, jArr10, jArr9);
                    el.a.C2(jArr10, jArr9);
                    byte[] bArr4 = copyOfRange;
                    for (int i16 = 1; i16 < 5; i16++) {
                        el.a.C2(jArr10, jArr10);
                    }
                    el.a.q2(jArr9, jArr10, jArr9);
                    el.a.C2(jArr10, jArr9);
                    for (int i17 = 1; i17 < 10; i17++) {
                        el.a.C2(jArr10, jArr10);
                    }
                    el.a.q2(jArr10, jArr10, jArr9);
                    el.a.C2(jArr11, jArr10);
                    for (int i18 = 1; i18 < 20; i18++) {
                        el.a.C2(jArr11, jArr11);
                    }
                    el.a.q2(jArr10, jArr11, jArr10);
                    el.a.C2(jArr10, jArr10);
                    for (int i19 = 1; i19 < 10; i19++) {
                        el.a.C2(jArr10, jArr10);
                    }
                    el.a.q2(jArr9, jArr10, jArr9);
                    el.a.C2(jArr10, jArr9);
                    for (int i23 = 1; i23 < 50; i23++) {
                        el.a.C2(jArr10, jArr10);
                    }
                    el.a.q2(jArr10, jArr10, jArr9);
                    el.a.C2(jArr11, jArr10);
                    for (int i24 = 1; i24 < 100; i24++) {
                        el.a.C2(jArr11, jArr11);
                    }
                    el.a.q2(jArr10, jArr11, jArr10);
                    el.a.C2(jArr10, jArr10);
                    for (int i25 = 1; i25 < 50; i25++) {
                        el.a.C2(jArr10, jArr10);
                    }
                    el.a.q2(jArr9, jArr10, jArr9);
                    el.a.C2(jArr9, jArr9);
                    el.a.C2(jArr9, jArr9);
                    el.a.q2(jArr, jArr9, jArr);
                    el.a.q2(jArr, jArr, jArr8);
                    el.a.q2(jArr, jArr, jArr4);
                    el.a.C2(jArr6, jArr);
                    el.a.q2(jArr6, jArr6, jArr5);
                    el.a.E2(jArr7, jArr6, jArr4);
                    if (el.a.l(jArr7)) {
                        el.a.F2(jArr7, jArr6, jArr4);
                        if (el.a.l(jArr7)) {
                            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                        }
                        el.a.q2(jArr, jArr, el.d.f59466c);
                    }
                    if (!el.a.l(jArr) && ((b13[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                    if ((el.a.u(jArr)[0] & 1) == ((b13[31] & 255) >> 7)) {
                        for (int i26 = 0; i26 < 10; i26++) {
                            jArr[i26] = -jArr[i26];
                        }
                    }
                    el.a.q2(jArr3, jArr, C);
                    bh.b bVar = new bh.b(15, new gi.m(jArr, C, jArr2, 14, 0), jArr3);
                    el.c[] cVarArr = new el.c[8];
                    cVarArr[0] = new el.c(bVar);
                    com.google.android.gms.internal.measurement.x xVar = new com.google.android.gms.internal.measurement.x(12);
                    el.a.z((gi.m) bVar.f22798b, xVar);
                    bh.b bVar2 = new bh.b(xVar);
                    for (int i27 = 1; i27 < 8; i27++) {
                        el.a.n(xVar, bVar2, cVarArr[i27 - 1]);
                        cVarArr[i27] = new el.c(new bh.b(xVar));
                    }
                    byte[] B2 = el.a.B2(digest);
                    byte[] B22 = el.a.B2(bArr4);
                    com.google.android.gms.internal.measurement.x xVar2 = new com.google.android.gms.internal.measurement.x();
                    bh.b bVar3 = new bh.b(15);
                    int i28 = 255;
                    while (i28 >= 0 && B2[i28] == 0 && B22[i28] == 0) {
                        i28--;
                    }
                    while (i28 >= 0) {
                        el.a.z(new gi.m(xVar2), xVar2);
                        byte b14 = B2[i28];
                        if (b14 > 0) {
                            bh.b.j(bVar3, xVar2);
                            el.a.n(xVar2, bVar3, cVarArr[B2[i28] / 2]);
                        } else if (b14 < 0) {
                            bh.b.j(bVar3, xVar2);
                            el.a.D2(xVar2, bVar3, cVarArr[(-B2[i28]) / 2]);
                        }
                        byte b15 = B22[i28];
                        if (b15 > 0) {
                            bh.b.j(bVar3, xVar2);
                            el.a.n(xVar2, bVar3, el.d.f59468e[B22[i28] / 2]);
                        } else if (b15 < 0) {
                            bh.b.j(bVar3, xVar2);
                            el.a.D2(xVar2, bVar3, el.d.f59468e[(-B22[i28]) / 2]);
                        }
                        i28--;
                    }
                    byte[] H = new gi.m(xVar2).H();
                    for (int i29 = 0; i29 < 32; i29++) {
                        if (H[i29] == bArr[i29]) {
                        }
                    }
                    return;
                }
            }
        }
        throw new GeneralSecurityException("Signature check failed.");
    }
}
