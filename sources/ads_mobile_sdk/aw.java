package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class aw extends sj0 {
    private static final aw DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2563c = 1;
    private int bitField0_;
    private il sha256_ = il.f6431b;

    static {
        aw awVar = new aw();
        DEFAULT_INSTANCE = awVar;
        sj0.a(aw.class, awVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"bitField0_", "sha256_"});
        }
        if (c13 == 3) {
            return new aw();
        }
        if (c13 == 4) {
            return new a.i9(19);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (aw.class) {
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
