package ll;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class z implements uk.p {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f83787e = {0};

    /* renamed from: a, reason: collision with root package name */
    public final hl.a f83788a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83789b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f83790c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f83791d;

    public z(y yVar, int i13) {
        this.f83788a = yVar;
        this.f83789b = i13;
        this.f83790c = new byte[0];
        this.f83791d = new byte[0];
        if (i13 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        yVar.a(i13, new byte[0]);
    }

    @Override // uk.p
    public final void a(byte[] bArr, byte[] bArr2) {
        if (!MessageDigest.isEqual(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // uk.p
    public final byte[] b(byte[] bArr) {
        byte[] bArr2 = this.f83791d;
        int length = bArr2.length;
        int i13 = this.f83789b;
        hl.a aVar = this.f83788a;
        byte[] bArr3 = this.f83790c;
        return length > 0 ? kg.t.u(bArr3, aVar.a(i13, kg.t.u(bArr, bArr2))) : kg.t.u(bArr3, aVar.a(i13, bArr));
    }

    public z(fl.a aVar) {
        this.f83788a = new w(((ml.a) aVar.f62497c.f83754b).b());
        fl.d dVar = aVar.f62496b;
        this.f83789b = dVar.f62510b;
        this.f83790c = aVar.f62498d.b();
        if (dVar.f62511c.equals(fl.c.f62506d)) {
            this.f83791d = Arrays.copyOf(f83787e, 1);
        } else {
            this.f83791d = new byte[0];
        }
    }

    public z(fl.h hVar) {
        this.f83788a = new y("HMAC" + hVar.f62513b.f62537d, new SecretKeySpec(((ml.a) hVar.f62514c.f83754b).b(), "HMAC"));
        fl.l lVar = hVar.f62513b;
        this.f83789b = lVar.f62535b;
        this.f83790c = hVar.f62515d.b();
        if (lVar.f62536c.equals(fl.k.f62531d)) {
            this.f83791d = Arrays.copyOf(f83787e, 1);
        } else {
            this.f83791d = new byte[0];
        }
    }
}
