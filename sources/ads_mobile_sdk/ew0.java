package ads_mobile_sdk;

import java.util.AbstractList;
import kp.n;

/* loaded from: classes2.dex */
public final class ew0 extends AbstractList {

    /* renamed from: a, reason: collision with root package name */
    public final a.g1 f4972a;

    /* renamed from: b, reason: collision with root package name */
    public final a.u1 f4973b;

    public ew0(a.g1 g1Var, a.u1 u1Var) {
        this.f4972a = g1Var;
        this.f4973b = u1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        a.u1 u1Var = this.f4973b;
        zv0 zv0Var = (zv0) this.f4972a;
        zv0Var.d(i13);
        int i14 = zv0Var.f14947b[i13];
        switch (((n) u1Var).f80561a) {
            case 4:
                r2 = i14 == 0 ? pl0.TAG_UNKNOWN : null;
                if (r2 == null) {
                    return pl0.UNRECOGNIZED;
                }
                break;
            case 5:
                dx1 a13 = dx1.a(i14);
                return a13 == null ? dx1.USER_POPULATION_UNSPECIFIED : a13;
            case 6:
                if (i14 == 0) {
                    r2 = pv.UNSPECIFIED;
                } else if (i14 == 1) {
                    r2 = pv.TAILORED_WARNING_CT_BASE;
                } else if (i14 == 2) {
                    r2 = pv.TAILORED_WARNING_CT;
                } else if (i14 == 3) {
                    r2 = pv.TAILORED_WARNING_CT_ACCOUNT_INFO;
                } else if (i14 == 4) {
                    r2 = pv.TAILORED_WARNING_SUSPICIOUS_BASE;
                } else if (i14 == 5) {
                    r2 = pv.TAILORED_WARNING_SUSPICIOUS;
                }
                if (r2 == null) {
                    return pv.UNSPECIFIED;
                }
                break;
            case 7:
            default:
                aq a14 = aq.a(i14);
                return a14 == null ? aq.UNRECOGNIZED : a14;
            case 8:
                if (i14 == 0) {
                    r2 = mk.UNKNOWN;
                } else if (i14 == 1) {
                    r2 = mk.COLLECTED_BIDDING_SIGNAL;
                }
                if (r2 == null) {
                    return mk.UNKNOWN;
                }
                break;
        }
        return r2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((zv0) this.f4972a).f14948c;
    }
}
