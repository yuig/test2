package ads_mobile_sdk;

import a.na;
import a.ta;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class sf0 extends sj0 {
    private static final sf0 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11076c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11077d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11078e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11079f = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11080g = 7;
    private int bitField0_;
    private ds consentState_;
    private int sessionsSinceUpdate_;
    private w81 storedSdkCoreData_ = w81.a();
    private String flagJson_ = "";
    private String cachedUserAgent_ = "";

    static {
        sf0 sf0Var = new sf0();
        DEFAULT_INSTANCE = sf0Var;
        sj0.a(sf0.class, sf0Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0001\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u00052\u0006ဉ\u0002\u0007ለ\u0003", new Object[]{"bitField0_", "flagJson_", "sessionsSinceUpdate_", "storedSdkCoreData_", a.eb.f34a, "consentState_", "cachedUserAgent_"});
        }
        if (c13 == 3) {
            return new sf0();
        }
        if (c13 == 4) {
            return new na(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (sf0.class) {
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

    public static sf0 t() {
        return DEFAULT_INSTANCE;
    }

    public static na y() {
        return (na) DEFAULT_INSTANCE.f();
    }

    public final String r() {
        return this.cachedUserAgent_;
    }

    public final ds s() {
        ds dsVar = this.consentState_;
        return dsVar == null ? ds.v() : dsVar;
    }

    public final String u() {
        return this.flagJson_;
    }

    public final w81 v() {
        w81 w81Var = this.storedSdkCoreData_;
        if (!w81Var.f12897a) {
            this.storedSdkCoreData_ = w81Var.b();
        }
        return this.storedSdkCoreData_;
    }

    public final int w() {
        return this.sessionsSinceUpdate_;
    }

    public final Map x() {
        return Collections.unmodifiableMap(this.storedSdkCoreData_);
    }

    public static sf0 a(InputStream inputStream) {
        return (sf0) sj0.a(sj0.a(DEFAULT_INSTANCE, io.a(inputStream), jc0.a()));
    }
}
