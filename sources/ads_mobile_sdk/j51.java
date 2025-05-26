package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class j51 extends sj0 {
    private static final j51 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6696c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6697d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6698e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6699f = 4;
    private int bitField0_;
    private o41 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        j51 j51Var = new j51();
        DEFAULT_INSTANCE = j51Var;
        sj0.a(j51.class, j51Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
        }
        if (c13 == 3) {
            return new j51();
        }
        if (c13 == 4) {
            return new a.l5(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (j51.class) {
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

    public static a.l5 w() {
        return (a.l5) DEFAULT_INSTANCE.f();
    }

    public final o41 r() {
        o41 o41Var = this.keyData_;
        return o41Var == null ? o41.r() : o41Var;
    }

    public final int s() {
        return this.keyId_;
    }

    public final ju1 t() {
        int i13 = this.outputPrefixType_;
        ju1 ju1Var = i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? i13 != 5 ? null : ju1.WITH_ID_REQUIREMENT : ju1.CRUNCHY : ju1.RAW : ju1.LEGACY : ju1.TINK : ju1.UNKNOWN_PREFIX;
        return ju1Var == null ? ju1.UNRECOGNIZED : ju1Var;
    }

    public final y41 u() {
        int i13 = this.status_;
        y41 y41Var = i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? null : y41.DESTROYED : y41.DISABLED : y41.ENABLED : y41.UNKNOWN_STATUS;
        return y41Var == null ? y41.UNRECOGNIZED : y41Var;
    }

    public final boolean v() {
        return (this.bitField0_ & 1) != 0;
    }
}
