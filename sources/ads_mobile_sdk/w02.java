package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class w02 implements a.a2 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f12796e = {0};

    /* renamed from: a, reason: collision with root package name */
    public final a.wa f12797a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12798b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f12799c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f12800d;

    public w02(z7 z7Var) {
        this.f12797a = new t02(z7Var.c().b());
        this.f12798b = z7Var.d().b();
        this.f12799c = z7Var.b().a();
        if (z7Var.d().d().equals(d8.f4193d)) {
            this.f12800d = Arrays.copyOf(f12796e, 1);
        } else {
            this.f12800d = new byte[0];
        }
    }

    @Override // a.a2
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] d2;
        byte[] bArr3 = this.f12800d;
        if (bArr3.length > 0) {
            d2 = jk.r.d(this.f12799c, this.f12797a.a(this.f12798b, jk.r.d(bArr2, bArr3)));
        } else {
            d2 = jk.r.d(this.f12799c, this.f12797a.a(this.f12798b, bArr2));
        }
        if (!MessageDigest.isEqual(d2, bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public w02(hp0 hp0Var) {
        this.f12797a = new v02("HMAC" + hp0Var.d().c(), new SecretKeySpec(hp0Var.c().b(), "HMAC"));
        this.f12798b = hp0Var.d().b();
        this.f12799c = hp0Var.b().a();
        if (hp0Var.d().e().equals(np0.f8908d)) {
            this.f12800d = Arrays.copyOf(f12796e, 1);
        } else {
            this.f12800d = new byte[0];
        }
    }

    public static a.a2 a(hp0 hp0Var) {
        return new w02(hp0Var);
    }

    public w02(v02 v02Var, int i13) {
        this.f12797a = v02Var;
        this.f12798b = i13;
        this.f12799c = new byte[0];
        this.f12800d = new byte[0];
        if (i13 >= 10) {
            v02Var.a(i13, new byte[0]);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }
}
