package ads_mobile_sdk;

import a.j2;
import a.ta;

/* loaded from: classes2.dex */
public final class gp0 extends sj0 {
    private static final gp0 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5650c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5651d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5652e = 3;
    private int bitField0_;
    private il keyValue_ = il.f6431b;
    private qp0 params_;
    private int version_;

    static {
        gp0 gp0Var = new gp0();
        DEFAULT_INSTANCE = gp0Var;
        sj0.a(gp0.class, gp0Var);
    }

    public static j2 v() {
        return (j2) DEFAULT_INSTANCE.f();
    }

    public static ta w() {
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
            return new gp0();
        }
        if (c13 == 4) {
            return new j2(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (gp0.class) {
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

    public static gp0 r() {
        return DEFAULT_INSTANCE;
    }

    public final il s() {
        return this.keyValue_;
    }

    public final qp0 t() {
        qp0 qp0Var = this.params_;
        return qp0Var == null ? qp0.r() : qp0Var;
    }

    public final int u() {
        return this.version_;
    }

    public static gp0 a(il ilVar, jc0 jc0Var) {
        return (gp0) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
