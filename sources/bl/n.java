package bl;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class n extends w {

    /* renamed from: c, reason: collision with root package name */
    public final p f23453c;

    /* renamed from: d, reason: collision with root package name */
    public final ll.j f23454d;

    public n(p pVar, ll.j jVar) {
        super(0);
        this.f23453c = pVar;
        this.f23454d = jVar;
    }

    public static n n(p pVar, ll.j jVar) {
        ECParameterSpec eCParameterSpec;
        m mVar = pVar.f23465c;
        k kVar = mVar.f23449a;
        int I = jVar.I();
        String str = "Encoded private key byte length for " + kVar + " must be %d, not " + I;
        k kVar2 = k.f23441d;
        k kVar3 = k.f23444g;
        k kVar4 = k.f23443f;
        k kVar5 = k.f23442e;
        if (kVar == kVar2) {
            if (I != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (kVar == kVar5) {
            if (I != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (kVar == kVar4) {
            if (I != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (kVar != kVar3) {
                throw new GeneralSecurityException("Unable to validate private key length for " + kVar);
            }
            if (I != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        byte[] b13 = pVar.f23466d.b();
        byte[] b14 = ((ml.a) jVar.f83754b).b();
        k kVar6 = mVar.f23449a;
        if (kVar6 == kVar2 || kVar6 == kVar5 || kVar6 == kVar4) {
            if (kVar6 == kVar2) {
                eCParameterSpec = el.f.f59479a;
            } else if (kVar6 == kVar5) {
                eCParameterSpec = el.f.f59480b;
            } else {
                if (kVar6 != kVar4) {
                    throw new IllegalArgumentException("Unable to determine NIST curve params for " + kVar6);
                }
                eCParameterSpec = el.f.f59481c;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger Q = c0.d.Q(b14);
            if (Q.signum() <= 0 || Q.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private key.");
            }
            if (!el.f.g(Q, eCParameterSpec).equals(el.a.r2(eCParameterSpec.getCurve(), ll.p.UNCOMPRESSED, b13))) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            if (kVar6 != kVar3) {
                throw new IllegalArgumentException("Unable to validate key pair for " + kVar6);
            }
            if (!Arrays.equals(kh2.r.i1(b14), b13)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        }
        return new n(pVar, jVar);
    }

    @Override // bl.w
    public final w l() {
        return this.f23453c;
    }
}
