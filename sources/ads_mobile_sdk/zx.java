package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class zx extends sj0 {
    private static final zx DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14974c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14975d = 2;
    private int bitField0_;
    private String regionCode_ = "";
    private il userId_ = il.f6431b;

    static {
        zx zxVar = new zx();
        DEFAULT_INSTANCE = zxVar;
        sj0.a(zx.class, zxVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"bitField0_", "regionCode_", "userId_"});
        }
        if (c13 == 3) {
            return new zx();
        }
        if (c13 == 4) {
            return new a.i9(18);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (zx.class) {
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
}
