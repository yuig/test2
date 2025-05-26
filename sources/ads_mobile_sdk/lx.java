package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class lx extends sj0 {
    private static final lx DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8016c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8017d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8018e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f8019f = 4;
    private int bitField0_;
    private il imageDigest_;
    private il image_;
    private String mimeType_ = "";
    private int type_;

    static {
        lx lxVar = new lx();
        DEFAULT_INSTANCE = lxVar;
        sj0.a(lx.class, lxVar);
    }

    public lx() {
        gl glVar = il.f6431b;
        this.image_ = glVar;
        this.imageDigest_ = glVar;
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"bitField0_", "type_", jx.f7005a, "mimeType_", "image_", "imageDigest_"});
        }
        if (c13 == 3) {
            return new lx();
        }
        if (c13 == 4) {
            return new a.k(18);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (lx.class) {
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
