package ads_mobile_sdk;

import a.h4;
import a.ta;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class k51 extends sj0 {
    private static final k51 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7132c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7133d = 2;
    private h4 key_ = sj0.i();
    private int primaryKeyId_;

    static {
        k51 k51Var = new k51();
        DEFAULT_INSTANCE = k51Var;
        sj0.a(k51.class, k51Var);
    }

    public static a.s4 u() {
        return (a.s4) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", j51.class});
        }
        if (c13 == 3) {
            return new k51();
        }
        if (c13 == 4) {
            return new a.s4(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (k51.class) {
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

    public final j51 b(int i13) {
        return (j51) this.key_.get(i13);
    }

    public final int r() {
        return this.key_.size();
    }

    public final h4 s() {
        return this.key_;
    }

    public final int t() {
        return this.primaryKeyId_;
    }

    public static k51 a(InputStream inputStream, jc0 jc0Var) {
        return (k51) sj0.a(sj0.a(DEFAULT_INSTANCE, io.a(inputStream), jc0Var));
    }
}
