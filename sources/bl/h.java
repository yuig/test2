package bl;

import el.i0;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* loaded from: classes3.dex */
public final class h extends w {

    /* renamed from: c, reason: collision with root package name */
    public final f f23430c;

    /* renamed from: d, reason: collision with root package name */
    public final ECPoint f23431d;

    /* renamed from: e, reason: collision with root package name */
    public final ml.a f23432e;

    /* renamed from: f, reason: collision with root package name */
    public final ml.a f23433f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f23434g;

    public h(f fVar, ECPoint eCPoint, ml.a aVar, ml.a aVar2, Integer num) {
        super(1);
        this.f23430c = fVar;
        this.f23431d = eCPoint;
        this.f23432e = aVar;
        this.f23433f = aVar2;
        this.f23434g = num;
    }

    public static h n(f fVar, ml.a aVar, Integer num) {
        if (!fVar.f23421a.equals(b.f23404e)) {
            throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        e eVar = fVar.f23424d;
        q(eVar, num);
        if (aVar.f87434a.length == 32) {
            return new h(fVar, null, aVar, p(eVar, num), num);
        }
        throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }

    public static h o(f fVar, ECPoint eCPoint, Integer num) {
        EllipticCurve curve;
        if (fVar.f23421a.equals(b.f23404e)) {
            throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
        }
        e eVar = fVar.f23424d;
        q(eVar, num);
        b bVar = b.f23401b;
        b bVar2 = fVar.f23421a;
        if (bVar2 == bVar) {
            curve = el.f.f59479a.getCurve();
        } else if (bVar2 == b.f23402c) {
            curve = el.f.f59480b.getCurve();
        } else {
            if (bVar2 != b.f23403d) {
                throw new IllegalArgumentException("Unable to determine NIST curve type for " + bVar2);
            }
            curve = el.f.f59481c.getCurve();
        }
        el.f.b(eCPoint, curve);
        return new h(fVar, eCPoint, null, p(eVar, num), num);
    }

    public static ml.a p(e eVar, Integer num) {
        if (eVar == e.f23418d) {
            return i0.f59494a;
        }
        if (num == null) {
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: " + eVar);
        }
        if (eVar == e.f23417c) {
            return i0.a(num.intValue());
        }
        if (eVar == e.f23416b) {
            return i0.b(num.intValue());
        }
        throw new IllegalStateException("Unknown EciesParameters.Variant: " + eVar);
    }

    public static void q(e eVar, Integer num) {
        e eVar2 = e.f23418d;
        if (eVar.equals(eVar2) || num != null) {
            if (eVar.equals(eVar2) && num != null) {
                throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
            }
        } else {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + eVar + " variant.");
        }
    }

    @Override // bl.w
    public final Integer j() {
        return this.f23434g;
    }

    @Override // bl.w
    public final ml.a k() {
        return this.f23433f;
    }
}
