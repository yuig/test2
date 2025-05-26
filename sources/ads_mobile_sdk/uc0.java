package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class uc0 extends sj0 {
    private static final uc0 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12016c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12017d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f12018e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f12019f = 4;
    private int bitField0_;
    private il bytecode_;
    private x12 metadata_;
    private int status_;
    private il vm_;

    static {
        uc0 uc0Var = new uc0();
        DEFAULT_INSTANCE = uc0Var;
        sj0.a(uc0.class, uc0Var);
    }

    public uc0() {
        gl glVar = il.f6431b;
        this.bytecode_ = glVar;
        this.vm_ = glVar;
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "metadata_", "bytecode_", "vm_", "status_", kn2.f7416a});
        }
        if (c13 == 3) {
            return new uc0();
        }
        if (c13 == 4) {
            return new a.vc(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (uc0.class) {
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

    public static a.vc v() {
        return (a.vc) DEFAULT_INSTANCE.f();
    }

    public final il r() {
        return this.bytecode_;
    }

    public final x12 s() {
        x12 x12Var = this.metadata_;
        return x12Var == null ? x12.s() : x12Var;
    }

    public final mn2 t() {
        mn2 a13 = mn2.a(this.status_);
        return a13 == null ? mn2.STATUS_UNKNOWN : a13;
    }

    public final il u() {
        return this.vm_;
    }
}
