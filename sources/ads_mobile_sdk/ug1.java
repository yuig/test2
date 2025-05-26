package ads_mobile_sdk;

import a.ta;
import a.ub;
import a.yc;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ug1 extends sj0 {
    private static final ug1 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12073c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12074d = 2;
    private w81 adUnitToUseMediaView_ = w81.a();
    private long appVersionCode_;

    static {
        ug1 ug1Var = new ug1();
        DEFAULT_INSTANCE = ug1Var;
        sj0.a(ug1.class, ug1Var);
    }

    public static yc u() {
        return (yc) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u00022", new Object[]{"appVersionCode_", "adUnitToUseMediaView_", ub.f173a});
        }
        if (c13 == 3) {
            return new ug1();
        }
        if (c13 == 4) {
            return new yc(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (ug1.class) {
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

    public static ug1 t() {
        return DEFAULT_INSTANCE;
    }

    public final Map r() {
        return Collections.unmodifiableMap(this.adUnitToUseMediaView_);
    }

    public final long s() {
        return this.appVersionCode_;
    }

    public static ug1 a(InputStream inputStream) {
        return (ug1) sj0.a(sj0.a(DEFAULT_INSTANCE, io.a(inputStream), jc0.a()));
    }
}
