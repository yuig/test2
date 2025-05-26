package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class f61 extends sj0 {
    private static final f61 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5066c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5067d = 2;
    private int bitField0_;
    private a51 dekTemplate_;
    private String kekUri_ = "";

    static {
        f61 f61Var = new f61();
        DEFAULT_INSTANCE = f61Var;
        sj0.a(f61.class, f61Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "kekUri_", "dekTemplate_"});
        }
        if (c13 == 3) {
            return new f61();
        }
        if (c13 == 4) {
            return new a.y1(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (f61.class) {
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

    public static f61 r() {
        return DEFAULT_INSTANCE;
    }

    public static a.y1 u() {
        return (a.y1) DEFAULT_INSTANCE.f();
    }

    public final a51 s() {
        a51 a51Var = this.dekTemplate_;
        return a51Var == null ? a51.r() : a51Var;
    }

    public final String t() {
        return this.kekUri_;
    }

    public static f61 a(il ilVar, jc0 jc0Var) {
        return (f61) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
