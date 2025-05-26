package ads_mobile_sdk;

import a.p0;
import a.ta;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ds extends sj0 {
    private static final ds DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4420c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4421d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f4422e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f4423f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f4424g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f4425h = 6;
    private int bitField0_;
    private cq consentAllowlist_;
    private wv1 patternMatchingFlag_;
    private tx1 preProcessingFlag_;
    private w81 concatenatedSignalsMap_ = w81.a();
    private String consentStringJson_ = "";
    private String consentStateJson_ = "";

    static {
        ds dsVar = new ds();
        DEFAULT_INSTANCE = dsVar;
        sj0.a(ds.class, dsVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u00052\u0006ဉ\u0004", new Object[]{"bitField0_", "consentStringJson_", "consentStateJson_", "patternMatchingFlag_", "preProcessingFlag_", "concatenatedSignalsMap_", a.f1.f38a, "consentAllowlist_"});
        }
        if (c13 == 3) {
            return new ds();
        }
        if (c13 == 4) {
            return new p0(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (ds.class) {
                try {
                    taVar = PARSER;
                    if (taVar == null) {
                        taVar = new rj0(DEFAULT_INSTANCE);
                        PARSER = taVar;
                    }
                } finally {
                }
            }
        }
        return taVar;
    }

    public static ds v() {
        return DEFAULT_INSTANCE;
    }

    public static p0 y() {
        return (p0) DEFAULT_INSTANCE.f();
    }

    public final Map r() {
        return Collections.unmodifiableMap(this.concatenatedSignalsMap_);
    }

    public final cq s() {
        cq cqVar = this.consentAllowlist_;
        return cqVar == null ? cq.u() : cqVar;
    }

    public final String t() {
        return this.consentStateJson_;
    }

    public final String u() {
        return this.consentStringJson_;
    }

    public final wv1 w() {
        wv1 wv1Var = this.patternMatchingFlag_;
        return wv1Var == null ? wv1.r() : wv1Var;
    }

    public final tx1 x() {
        tx1 tx1Var = this.preProcessingFlag_;
        return tx1Var == null ? tx1.r() : tx1Var;
    }
}
