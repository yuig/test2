package ads_mobile_sdk;

import a.ta;
import a.y2;

/* loaded from: classes2.dex */
public final class h9 extends sj0 {
    private static final h9 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5888c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5889d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5890e = 3;
    private int bitField0_;
    private il keyValue_ = il.f6431b;
    private q9 params_;
    private int version_;

    static {
        h9 h9Var = new h9();
        DEFAULT_INSTANCE = h9Var;
        sj0.a(h9.class, h9Var);
    }

    public static ta v() {
        return DEFAULT_INSTANCE.k();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
        }
        if (c13 == 3) {
            return new h9();
        }
        if (c13 == 4) {
            return new y2(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (h9.class) {
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

    public static y2 u() {
        return (y2) DEFAULT_INSTANCE.f();
    }

    public final il r() {
        return this.keyValue_;
    }

    public final q9 s() {
        q9 q9Var = this.params_;
        return q9Var == null ? q9.r() : q9Var;
    }

    public final int t() {
        return this.version_;
    }

    public static h9 a(il ilVar, jc0 jc0Var) {
        return (h9) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
