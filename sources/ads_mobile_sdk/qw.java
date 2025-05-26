package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class qw extends sj0 {
    private static final qw DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10292c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10293d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f10294e = 3;
    private int bitField0_;
    private int code_;
    private il message_;
    private il version_;

    static {
        qw qwVar = new qw();
        DEFAULT_INSTANCE = qwVar;
        sj0.a(qw.class, qwVar);
    }

    public qw() {
        gl glVar = il.f6431b;
        this.message_ = glVar;
        this.version_ = glVar;
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"bitField0_", "code_", "message_", "version_"});
        }
        if (c13 == 3) {
            return new qw();
        }
        if (c13 == 4) {
            return new a.i9(4);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (qw.class) {
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
