package ads_mobile_sdk;

import a.h4;
import a.ta;

/* loaded from: classes2.dex */
public final class tx1 extends sj0 {
    private static final tx1 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11729c = 1;
    private h4 rules_ = sj0.i();

    static {
        tx1 tx1Var = new tx1();
        DEFAULT_INSTANCE = tx1Var;
        sj0.a(tx1.class, tx1Var);
    }

    public static tx1 r() {
        return DEFAULT_INSTANCE;
    }

    public static a.ec u() {
        return (a.ec) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", rx1.class});
        }
        if (c13 == 3) {
            return new tx1();
        }
        if (c13 == 4) {
            return new a.ec(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (tx1.class) {
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

    public final int s() {
        return this.rules_.size();
    }

    public final h4 t() {
        return this.rules_;
    }

    public static tx1 a(byte[] bArr) {
        return (tx1) sj0.a(sj0.a(DEFAULT_INSTANCE, bArr, bArr.length, jc0.a()));
    }
}
