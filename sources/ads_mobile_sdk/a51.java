package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class a51 extends sj0 {
    private static final a51 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c */
    public static final int f2277c = 1;

    /* renamed from: d */
    public static final int f2278d = 2;

    /* renamed from: e */
    public static final int f2279e = 3;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private il value_ = il.f6431b;

    static {
        a51 a51Var = new a51();
        DEFAULT_INSTANCE = a51Var;
        sj0.a(a51.class, a51Var);
    }

    public static a.sg v() {
        return (a.sg) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
        }
        if (c13 == 3) {
            return new a51();
        }
        if (c13 == 4) {
            return new a.sg(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (a51.class) {
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

    public final il u() {
        return this.value_;
    }

    public static a51 r() {
        return DEFAULT_INSTANCE;
    }

    public final ju1 s() {
        int i13 = this.outputPrefixType_;
        ju1 ju1Var = i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? i13 != 5 ? null : ju1.WITH_ID_REQUIREMENT : ju1.CRUNCHY : ju1.RAW : ju1.LEGACY : ju1.TINK : ju1.UNKNOWN_PREFIX;
        return ju1Var == null ? ju1.UNRECOGNIZED : ju1Var;
    }

    public final String t() {
        return this.typeUrl_;
    }

    public static a51 a(byte[] bArr, jc0 jc0Var) {
        return (a51) sj0.a(sj0.a(DEFAULT_INSTANCE, bArr, bArr.length, jc0Var));
    }
}
