package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class jj0 extends sj0 {
    private static final jj0 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6839c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6840d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6841e = 3;
    private int bitField0_;
    private il bytecode_;
    private y12 metadata_;
    private il vm_;

    static {
        jj0 jj0Var = new jj0();
        DEFAULT_INSTANCE = jj0Var;
        sj0.a(jj0.class, jj0Var);
    }

    public jj0() {
        gl glVar = il.f6431b;
        this.vm_ = glVar;
        this.bytecode_ = glVar;
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"bitField0_", "metadata_", "vm_", "bytecode_"});
        }
        if (c13 == 3) {
            return new jj0();
        }
        if (c13 == 4) {
            return new a.k(16);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (jj0.class) {
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
        return this.bytecode_;
    }

    public final y12 s() {
        y12 y12Var = this.metadata_;
        return y12Var == null ? y12.s() : y12Var;
    }

    public final il t() {
        return this.vm_;
    }

    public static jj0 a(byte[] bArr, jc0 jc0Var) {
        return (jj0) sj0.a(sj0.a(DEFAULT_INSTANCE, bArr, bArr.length, jc0Var));
    }
}
