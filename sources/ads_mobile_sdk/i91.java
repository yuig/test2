package ads_mobile_sdk;

import a.h4;
import a.ta;
import a.w4;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i91 extends sj0 {
    private static final i91 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6284c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6285d = 2;
    private w81 data_ = w81.a();
    private h4 adapters_ = sj0.i();

    static {
        i91 i91Var = new i91();
        DEFAULT_INSTANCE = i91Var;
        sj0.a(i91.class, i91Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0000\u0001Ț\u00022", new Object[]{"adapters_", "data_", w4.f175a});
        }
        if (c13 == 3) {
            return new i91();
        }
        if (c13 == 4) {
            return new a.s3(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (i91.class) {
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

    public static a.s3 t() {
        return (a.s3) DEFAULT_INSTANCE.f();
    }

    public final List r() {
        return this.adapters_;
    }

    public final Map s() {
        return Collections.unmodifiableMap(this.data_);
    }
}
