package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class vx2 extends sj0 {
    private static final vx2 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12715c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12716d = 2;
    private int bitField0_;
    private int protocolNumber_;
    private int variant_;

    static {
        vx2 vx2Var = new vx2();
        DEFAULT_INSTANCE = vx2Var;
        sj0.a(vx2.class, vx2Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "protocolNumber_", "variant_"});
        }
        if (c13 == 3) {
            return new vx2();
        }
        if (c13 == 4) {
            return new a.i9(9);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (vx2.class) {
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
