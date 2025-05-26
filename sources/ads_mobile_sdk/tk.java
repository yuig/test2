package ads_mobile_sdk;

import a.h4;
import a.ta;
import java.util.List;

/* loaded from: classes2.dex */
public final class tk extends sj0 {
    private static final tk DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11570c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11571d = 2;
    private h4 thirdPartySdk_ = sj0.i();
    private h4 thirdPartyJavascript_ = sj0.i();

    static {
        tk tkVar = new tk();
        DEFAULT_INSTANCE = tkVar;
        sj0.a(tk.class, tkVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"thirdPartySdk_", sk.class, "thirdPartyJavascript_", jk.class});
        }
        if (c13 == 3) {
            return new tk();
        }
        if (c13 == 4) {
            return new a.s1(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (tk.class) {
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

    public static a.s1 s() {
        return (a.s1) DEFAULT_INSTANCE.f();
    }

    public final List r() {
        return this.thirdPartySdk_;
    }
}
