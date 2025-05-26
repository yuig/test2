package ads_mobile_sdk;

import a.ta;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class ae2 extends sj0 {
    private static final ae2 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2381c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2382d = 2;
    private int bitField0_;
    private String cachedSdkCore_ = "";
    private long lastUpdateTimeMs_;

    static {
        ae2 ae2Var = new ae2();
        DEFAULT_INSTANCE = ae2Var;
        sj0.a(ae2.class, ae2Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "cachedSdkCore_", "lastUpdateTimeMs_"});
        }
        if (c13 == 3) {
            return new ae2();
        }
        if (c13 == 4) {
            return new a.bh(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (ae2.class) {
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

    public static ae2 s() {
        return DEFAULT_INSTANCE;
    }

    public final String r() {
        return this.cachedSdkCore_;
    }

    public final long t() {
        return this.lastUpdateTimeMs_;
    }

    public static ae2 a(InputStream inputStream) {
        return (ae2) sj0.a(sj0.a(DEFAULT_INSTANCE, io.a(inputStream), jc0.a()));
    }
}
