package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class xm extends sj0 {
    private static final xm DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13721c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13722d = 3;
    private a.g1 variationId_ = sj0.g();
    private a.g1 triggerVariationId_ = sj0.g();

    static {
        xm xmVar = new xm();
        DEFAULT_INSTANCE = xmVar;
        sj0.a(xm.class, xmVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"variationId_", "triggerVariationId_"});
        }
        if (c13 == 3) {
            return new xm();
        }
        if (c13 == 4) {
            return new a.i9(13);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (xm.class) {
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

    public static xm a(byte[] bArr) {
        return (xm) sj0.a(sj0.a(DEFAULT_INSTANCE, bArr, bArr.length, jc0.a()));
    }
}
