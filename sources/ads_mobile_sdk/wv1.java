package ads_mobile_sdk;

import a.h4;
import a.ta;

/* loaded from: classes2.dex */
public final class wv1 extends sj0 {
    private static final wv1 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13272c = 1;
    private h4 rules_ = sj0.i();

    static {
        wv1 wv1Var = new wv1();
        DEFAULT_INSTANCE = wv1Var;
        sj0.a(wv1.class, wv1Var);
    }

    public static wv1 r() {
        return DEFAULT_INSTANCE;
    }

    public static a.oe u() {
        return (a.oe) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", uv1.class});
        }
        if (c13 == 3) {
            return new wv1();
        }
        if (c13 == 4) {
            return new a.oe(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (wv1.class) {
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

    public static wv1 a(byte[] bArr) {
        return (wv1) sj0.a(sj0.a(DEFAULT_INSTANCE, bArr, bArr.length, jc0.a()));
    }
}
