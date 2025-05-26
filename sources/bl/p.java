package bl;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import el.i0;
import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* loaded from: classes3.dex */
public final class p extends w {

    /* renamed from: c, reason: collision with root package name */
    public final m f23465c;

    /* renamed from: d, reason: collision with root package name */
    public final ml.a f23466d;

    /* renamed from: e, reason: collision with root package name */
    public final ml.a f23467e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f23468f;

    public p(m mVar, ml.a aVar, ml.a aVar2, Integer num) {
        super(1);
        this.f23465c = mVar;
        this.f23466d = aVar;
        this.f23467e = aVar2;
        this.f23468f = num;
    }

    public static p n(m mVar, ml.a aVar, Integer num) {
        EllipticCurve curve;
        ml.a b13;
        l lVar = mVar.f23452d;
        l lVar2 = l.f23447d;
        if (!lVar.equals(lVar2) && num == null) {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + lVar + " variant.");
        }
        if (lVar.equals(lVar2) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        int length = aVar.f87434a.length;
        StringBuilder sb3 = new StringBuilder("Encoded public key byte length for ");
        k kVar = mVar.f23449a;
        sb3.append(kVar);
        sb3.append(" must be %d, not ");
        sb3.append(length);
        String sb4 = sb3.toString();
        k kVar2 = k.f23441d;
        k kVar3 = k.f23443f;
        k kVar4 = k.f23442e;
        if (kVar == kVar2) {
            if (length != 65) {
                throw new GeneralSecurityException(String.format(sb4, 65));
            }
        } else if (kVar == kVar4) {
            if (length != 97) {
                throw new GeneralSecurityException(String.format(sb4, 97));
            }
        } else if (kVar == kVar3) {
            if (length != 133) {
                throw new GeneralSecurityException(String.format(sb4, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL)));
            }
        } else {
            if (kVar != k.f23444g) {
                throw new GeneralSecurityException("Unable to validate public key length for " + kVar);
            }
            if (length != 32) {
                throw new GeneralSecurityException(String.format(sb4, 32));
            }
        }
        if (kVar == kVar2 || kVar == kVar4 || kVar == kVar3) {
            if (kVar == kVar2) {
                curve = el.f.f59479a.getCurve();
            } else if (kVar == kVar4) {
                curve = el.f.f59480b.getCurve();
            } else {
                if (kVar != kVar3) {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for " + kVar);
                }
                curve = el.f.f59481c.getCurve();
            }
            el.f.b(el.a.r2(curve, ll.p.UNCOMPRESSED, aVar.b()), curve);
        }
        l lVar3 = mVar.f23452d;
        if (lVar3 == lVar2) {
            b13 = i0.f59494a;
        } else {
            if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant " + lVar3);
            }
            if (lVar3 == l.f23446c) {
                b13 = i0.a(num.intValue());
            } else {
                if (lVar3 != l.f23445b) {
                    throw new IllegalStateException("Unknown HpkeParameters.Variant: " + lVar3);
                }
                b13 = i0.b(num.intValue());
            }
        }
        return new p(mVar, aVar, b13, num);
    }

    @Override // bl.w
    public final Integer j() {
        return this.f23468f;
    }

    @Override // bl.w
    public final ml.a k() {
        return this.f23467e;
    }
}
