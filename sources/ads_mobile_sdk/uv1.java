package ads_mobile_sdk;

import a.h4;
import a.ta;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class uv1 extends sj0 {
    private static final uv1 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12216c = 9;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12217d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f12218e = 11;

    /* renamed from: f, reason: collision with root package name */
    public static final int f12219f = 12;

    /* renamed from: g, reason: collision with root package name */
    public static final int f12220g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f12221h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static final int f12222i = 4;

    /* renamed from: j, reason: collision with root package name */
    public static final int f12223j = 13;

    /* renamed from: k, reason: collision with root package name */
    public static final int f12224k = 5;

    /* renamed from: l, reason: collision with root package name */
    public static final int f12225l = 6;

    /* renamed from: m, reason: collision with root package name */
    public static final int f12226m = 7;

    /* renamed from: n, reason: collision with root package name */
    public static final int f12227n = 8;

    /* renamed from: o, reason: collision with root package name */
    public static final int f12228o = 10;

    /* renamed from: p, reason: collision with root package name */
    public static final int f12229p = 14;
    private boolean allowCompression_;
    private boolean allowCookies_;
    private int bitField0_;
    private int errorCode_;
    private c81 pattern_;
    private w81 include_ = w81.a();
    private String ruleLabel_ = "";
    private h4 andRules_ = sj0.i();
    private h4 elseRules_ = sj0.i();
    private h4 includeSignals_ = sj0.i();
    private h4 blobUrlKeys_ = sj0.i();
    private h4 allowedKeys_ = sj0.i();
    private h4 consoleLogs_ = sj0.i();
    private String errorString_ = "";
    private String baseUrl_ = "";

    static {
        uv1 uv1Var = new uv1();
        DEFAULT_INSTANCE = uv1Var;
        sj0.a(uv1.class, uv1Var);
    }

    public final Map A() {
        return Collections.unmodifiableMap(this.include_);
    }

    public final h4 B() {
        return this.includeSignals_;
    }

    public final c81 C() {
        c81 c81Var = this.pattern_;
        return c81Var == null ? c81.s() : c81Var;
    }

    public final String D() {
        return this.ruleLabel_;
    }

    public final boolean E() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean G() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0001\u0006\u0000\u0001ဉ\u0001\u00022\u0003\u001b\u0004Ț\u0005Ț\u0006ለ\u0002\u0007င\u0003\bለ\u0004\tለ\u0000\nဇ\u0005\u000b\u001b\f\u001b\rȚ\u000eဇ\u0006", new Object[]{"bitField0_", "pattern_", "include_", a.id.f61a, "includeSignals_", nr0.class, "blobUrlKeys_", "consoleLogs_", "errorString_", "errorCode_", "baseUrl_", "ruleLabel_", "allowCookies_", "andRules_", uv1.class, "elseRules_", uv1.class, "allowedKeys_", "allowCompression_"});
        }
        if (c13 == 3) {
            return new uv1();
        }
        if (c13 == 4) {
            return new a.i9(7);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (uv1.class) {
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

    public final boolean r() {
        return this.allowCookies_;
    }

    public final h4 s() {
        return this.allowedKeys_;
    }

    public final h4 t() {
        return this.andRules_;
    }

    public final String u() {
        return this.baseUrl_;
    }

    public final h4 v() {
        return this.blobUrlKeys_;
    }

    public final h4 w() {
        return this.consoleLogs_;
    }

    public final h4 x() {
        return this.elseRules_;
    }

    public final int y() {
        return this.errorCode_;
    }

    public final String z() {
        return this.errorString_;
    }
}
