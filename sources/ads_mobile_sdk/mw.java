package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class mw extends sj0 {
    private static final mw DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8403c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8404d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8405e = 3;
    private int bitField0_;
    private il uri_;
    private il verb_;
    private il version_;

    static {
        mw mwVar = new mw();
        DEFAULT_INSTANCE = mwVar;
        sj0.a(mw.class, mwVar);
    }

    public mw() {
        gl glVar = il.f6431b;
        this.verb_ = glVar;
        this.uri_ = glVar;
        this.version_ = glVar;
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"bitField0_", "verb_", "uri_", "version_"});
        }
        if (c13 == 3) {
            return new mw();
        }
        if (c13 == 4) {
            return new a.k(23);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (mw.class) {
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
