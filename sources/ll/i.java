package ll;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class i implements uk.f {

    /* renamed from: g, reason: collision with root package name */
    public static final pd.d0 f83744g;

    /* renamed from: h, reason: collision with root package name */
    public static final pd.d0 f83745h;

    /* renamed from: a, reason: collision with root package name */
    public final j f83746a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83747b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f83748c;

    /* renamed from: d, reason: collision with root package name */
    public final p f83749d;

    /* renamed from: e, reason: collision with root package name */
    public final cl.a f83750e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f83751f;

    static {
        qq2.c a13 = pd.d0.a();
        a13.a(n.NIST_P256, bl.b.f23401b);
        a13.a(n.NIST_P384, bl.b.f23402c);
        a13.a(n.NIST_P521, bl.b.f23403d);
        f83744g = a13.b();
        qq2.c a14 = pd.d0.a();
        a14.a(p.UNCOMPRESSED, bl.d.f23413c);
        a14.a(p.COMPRESSED, bl.d.f23412b);
        a14.a(p.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, bl.d.f23414d);
        f83745h = a14.b();
    }

    public i(ECPublicKey eCPublicKey, byte[] bArr, String str, p pVar, cl.a aVar, byte[] bArr2) {
        el.f.b(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f83746a = new j(eCPublicKey, 1);
        this.f83748c = bArr;
        this.f83747b = str;
        this.f83749d = pVar;
        this.f83750e = aVar;
        this.f83751f = bArr2;
    }

    public static final String b(bl.c cVar) {
        if (cVar.equals(bl.c.f23406b)) {
            return "HmacSha1";
        }
        if (cVar.equals(bl.c.f23407c)) {
            return "HmacSha224";
        }
        if (cVar.equals(bl.c.f23408d)) {
            return "HmacSha256";
        }
        if (cVar.equals(bl.c.f23409e)) {
            return "HmacSha384";
        }
        if (cVar.equals(bl.c.f23410f)) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: " + cVar);
    }

    @Override // uk.f
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        cl.a aVar = this.f83750e;
        int h10 = aVar.h();
        j jVar = this.f83746a;
        KeyPair F = el.a.F(((ECPublicKey) jVar.f83754b).getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) F.getPublic();
        byte[] t13 = el.a.t((ECPrivateKey) F.getPrivate(), (ECPublicKey) jVar.f83754b);
        byte[] s22 = el.a.s2(eCPublicKey.getParams().getCurve(), this.f83749d, eCPublicKey.getW());
        byte[] u13 = kg.t.u(s22, t13);
        s sVar = s.f83769c;
        String str = this.f83747b;
        Mac mac = (Mac) sVar.a(str);
        if (h10 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = this.f83748c;
        if (bArr3 == null || bArr3.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr3, str));
        }
        byte[] bArr4 = new byte[h10];
        mac.init(new SecretKeySpec(mac.doFinal(u13), str));
        byte[] bArr5 = new byte[0];
        int i13 = 1;
        int i14 = 0;
        while (true) {
            mac.update(bArr5);
            mac.update(bArr2);
            mac.update((byte) i13);
            bArr5 = mac.doFinal();
            if (bArr5.length + i14 >= h10) {
                System.arraycopy(bArr5, 0, bArr4, i14, h10 - i14);
                return aVar.e(ml.a.a(bArr4).b(), this.f83751f, ml.a.a(s22).b(), bArr);
            }
            System.arraycopy(bArr5, 0, bArr4, i14, bArr5.length);
            i14 += bArr5.length;
            i13++;
        }
    }
}
