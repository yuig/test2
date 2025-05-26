package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class jp0 extends sj0 {
    private static final jp0 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6905c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6906d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6907e = 3;
    private int bitField0_;
    private int keySize_;
    private qp0 params_;
    private int version_;

    static {
        jp0 jp0Var = new jp0();
        DEFAULT_INSTANCE = jp0Var;
        sj0.a(jp0.class, jp0Var);
    }

    public static a.u5 v() {
        return (a.u5) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "params_", "keySize_", "version_"});
        }
        if (c13 == 3) {
            return new jp0();
        }
        if (c13 == 4) {
            return new a.u5(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (jp0.class) {
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

    public static jp0 r() {
        return DEFAULT_INSTANCE;
    }

    public final int s() {
        return this.keySize_;
    }

    public final qp0 t() {
        qp0 qp0Var = this.params_;
        return qp0Var == null ? qp0.r() : qp0Var;
    }

    public final int u() {
        return this.version_;
    }

    public static jp0 a(il ilVar, jc0 jc0Var) {
        return (jp0) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
