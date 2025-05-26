package ads_mobile_sdk;

import a.f9;
import a.h4;
import a.ta;

/* loaded from: classes2.dex */
public final class p4 extends sj0 {
    private static final p4 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c */
    public static final int f9532c = 1;

    /* renamed from: d */
    public static final int f9533d = 2;
    private int bitField0_;
    private nn clientPingMetadata_;
    private h4 payloads_ = sj0.i();

    static {
        p4 p4Var = new p4();
        DEFAULT_INSTANCE = p4Var;
        sj0.a(p4.class, p4Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "payloads_", n4.class, "clientPingMetadata_"});
        }
        if (c13 == 3) {
            return new p4();
        }
        if (c13 == 4) {
            return new f9(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (p4.class) {
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

    public static f9 r() {
        return (f9) DEFAULT_INSTANCE.f();
    }
}
