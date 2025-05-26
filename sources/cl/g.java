package cl;

import c50.c1;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import kg.t;
import oi.u6;

/* loaded from: classes3.dex */
public final class g implements uk.f {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f27943f = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f27944a;

    /* renamed from: b, reason: collision with root package name */
    public final h f27945b;

    /* renamed from: c, reason: collision with root package name */
    public final z.a f27946c;

    /* renamed from: d, reason: collision with root package name */
    public final d f27947d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f27948e;

    public g(ml.a aVar, h hVar, z.a aVar2, d dVar, ml.a aVar3) {
        this.f27944a = aVar.b();
        this.f27945b = hVar;
        this.f27946c = aVar2;
        this.f27947d = dVar;
        this.f27948e = aVar3.b();
    }

    public static d b(bl.i iVar) {
        if (iVar.equals(bl.i.f23435d)) {
            return new hc.m(16);
        }
        if (iVar.equals(bl.i.f23436e)) {
            return new hc.m(32);
        }
        if (iVar.equals(bl.i.f23437f)) {
            return new c1(11);
        }
        throw new GeneralSecurityException("Unrecognized HPKE AEAD identifier");
    }

    public static z.a c(bl.j jVar) {
        if (jVar.equals(bl.j.f23438d)) {
            return new z.a("HmacSha256", 7, 0);
        }
        if (jVar.equals(bl.j.f23439e)) {
            return new z.a("HmacSha384", 7, 0);
        }
        if (jVar.equals(bl.j.f23440f)) {
            return new z.a("HmacSha512", 7, 0);
        }
        throw new GeneralSecurityException("Unrecognized HPKE KDF identifier");
    }

    public static h d(bl.k kVar) {
        if (kVar.equals(bl.k.f23444g)) {
            return new u6(new z.a("HmacSha256", 7, 0), 27);
        }
        if (kVar.equals(bl.k.f23441d)) {
            return bh.b.i(ll.n.NIST_P256);
        }
        if (kVar.equals(bl.k.f23442e)) {
            return bh.b.i(ll.n.NIST_P384);
        }
        if (kVar.equals(bl.k.f23443f)) {
            return bh.b.i(ll.n.NIST_P521);
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    @Override // uk.f
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] h13;
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArr4 = this.f27944a;
        h hVar = this.f27945b;
        z.a aVar = this.f27946c;
        d dVar = this.f27947d;
        i c13 = hVar.c(bArr4);
        byte[] bArr5 = c13.f27950b;
        byte[] bArr6 = k.f27956a;
        byte[] u13 = t.u(k.f27969n, hVar.e(), aVar.j(), dVar.g());
        byte[] bArr7 = k.f27967l;
        byte[] bArr8 = e.f27939d;
        Charset charset = el.c1.f59463a;
        byte[] bytes = "psk_id_hash".getBytes(charset);
        byte[] bArr9 = k.f27970o;
        byte[] u14 = t.u(bArr6, aVar.h(t.u(bArr9, u13, bytes, bArr8), bArr7), aVar.h(t.u(bArr9, u13, "info_hash".getBytes(charset), bArr3), bArr7));
        byte[] h10 = aVar.h(t.u(bArr9, u13, "secret".getBytes(charset), bArr8), c13.f27949a);
        int b13 = dVar.b();
        byte[] g13 = aVar.g(b13, h10, t.u(k.b(2, b13), bArr9, u13, "key".getBytes(charset), u14));
        byte[] g14 = aVar.g(12, h10, t.u(k.b(2, 12), bArr9, u13, "base_nonce".getBytes(charset), u14));
        BigInteger bigInteger = BigInteger.ONE;
        e eVar = new e(bArr5, g13, g14, bigInteger.shiftLeft(96).subtract(bigInteger), dVar);
        int length = this.f27948e.length + bArr5.length;
        byte[] bArr10 = f27943f;
        synchronized (eVar) {
            BigInteger bigInteger2 = eVar.f27942c;
            eVar.f27940a.getClass();
            h13 = t.h1(g14, c0.d.Q2(12, bigInteger2));
            if (eVar.f27942c.compareTo(eVar.f27941b) >= 0) {
                throw new GeneralSecurityException("message limit reached");
            }
            eVar.f27942c = eVar.f27942c.add(bigInteger);
        }
        byte[] i13 = eVar.f27940a.i(g13, h13, bArr, length, bArr10);
        byte[] bArr11 = this.f27948e;
        System.arraycopy(bArr11, 0, i13, 0, bArr11.length);
        System.arraycopy(bArr5, 0, i13, this.f27948e.length, bArr5.length);
        return i13;
    }
}
