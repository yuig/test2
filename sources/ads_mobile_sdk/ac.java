package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class ac extends sj0 {
    private static final ac DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2348c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2349d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f2350e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2351f = 4;
    private int bitField0_;
    private il data_;
    private il hash_;
    private il osVersion_;
    private il timestamp_;

    static {
        ac acVar = new ac();
        DEFAULT_INSTANCE = acVar;
        sj0.a(ac.class, acVar);
    }

    public ac() {
        gl glVar = il.f6431b;
        this.data_ = glVar;
        this.hash_ = glVar;
        this.timestamp_ = glVar;
        this.osVersion_ = glVar;
    }

    public static a.zg v() {
        return (a.zg) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"bitField0_", "data_", "hash_", "timestamp_", "osVersion_"});
        }
        if (c13 == 3) {
            return new ac();
        }
        if (c13 == 4) {
            return new a.zg(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (ac.class) {
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

    public final il r() {
        return this.data_;
    }

    public final il s() {
        return this.hash_;
    }

    public final il t() {
        return this.osVersion_;
    }

    public final il u() {
        return this.timestamp_;
    }

    public static ac a(byte[] bArr, jc0 jc0Var) {
        return (ac) sj0.a(sj0.a(DEFAULT_INSTANCE, bArr, bArr.length, jc0Var));
    }
}
