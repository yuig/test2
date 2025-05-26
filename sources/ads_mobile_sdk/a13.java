package ads_mobile_sdk;

import a.qg;
import a.ta;

/* loaded from: classes2.dex */
public final class a13 extends sj0 {
    private static final a13 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2200c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2201d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f2202e = 3;
    private int bitField0_;
    private il keyValue_ = il.f6431b;
    private i13 params_;
    private int version_;

    static {
        a13 a13Var = new a13();
        DEFAULT_INSTANCE = a13Var;
        sj0.a(a13.class, a13Var);
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
            return new a13();
        }
        if (c13 == 4) {
            return new qg(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (a13.class) {
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

    public static qg u() {
        return (qg) DEFAULT_INSTANCE.f();
    }

    public final il r() {
        return this.keyValue_;
    }

    public final i13 s() {
        i13 i13Var = this.params_;
        return i13Var == null ? i13.r() : i13Var;
    }

    public final int t() {
        return this.version_;
    }

    public static a13 a(il ilVar, jc0 jc0Var) {
        return (a13) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
