package bl;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class g extends w {

    /* renamed from: c, reason: collision with root package name */
    public final h f23427c;

    /* renamed from: d, reason: collision with root package name */
    public final ll.j f23428d;

    /* renamed from: e, reason: collision with root package name */
    public final ll.j f23429e;

    public g(h hVar, ll.j jVar, ll.j jVar2) {
        super(0);
        this.f23427c = hVar;
        this.f23428d = jVar;
        this.f23429e = jVar2;
    }

    public static g n(h hVar, ll.j jVar) {
        ml.a aVar = hVar.f23432e;
        if (aVar == null) {
            throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        }
        byte[] b13 = ((ml.a) jVar.f83754b).b();
        byte[] b14 = aVar.b();
        if (b13.length != 32) {
            throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
        }
        if (Arrays.equals(kh2.r.i1(b13), b14)) {
            return new g(hVar, null, jVar);
        }
        throw new GeneralSecurityException("Invalid private key for public key.");
    }

    public static g o(h hVar, ll.j jVar) {
        ECPoint eCPoint = hVar.f23431d;
        if (eCPoint == null) {
            throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        }
        BigInteger bigInteger = (BigInteger) jVar.f83754b;
        b bVar = hVar.f23430c.f23421a;
        BigInteger order = p(bVar).getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (el.f.g(bigInteger, p(bVar)).equals(eCPoint)) {
            return new g(hVar, jVar, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    public static ECParameterSpec p(b bVar) {
        if (bVar == b.f23401b) {
            return el.f.f59479a;
        }
        if (bVar == b.f23402c) {
            return el.f.f59480b;
        }
        if (bVar == b.f23403d) {
            return el.f.f59481c;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for " + bVar);
    }

    @Override // bl.w
    public final w l() {
        return this.f23427c;
    }
}
