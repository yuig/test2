package ip2;

import com.google.protobuf.i1;
import com.google.protobuf.j0;
import com.google.protobuf.m0;
import com.google.protobuf.n0;
import com.google.protobuf.p1;
import com.google.protobuf.w1;

/* loaded from: classes2.dex */
public final class f extends n0 implements p1 {
    private static final f DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile w1 PARSER;
    private int bitField0_;
    private boolean enabled_;
    private i1 params_ = i1.f33908b;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        n0.registerDefaultInstance(f.class, fVar);
    }

    public static i1 e(f fVar) {
        i1 i1Var = fVar.params_;
        if (!i1Var.f33909a) {
            fVar.params_ = i1Var.b();
        }
        return fVar.params_;
    }

    public static void f(f fVar, boolean z13) {
        fVar.bitField0_ |= 1;
        fVar.enabled_ = z13;
    }

    public static f h() {
        return DEFAULT_INSTANCE;
    }

    public static d i() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.n0
    public final Object dynamicMethod(m0 m0Var, Object obj, Object obj2) {
        switch (b.f73377a[m0Var.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new d();
            case 3:
                return n0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဇ\u0000\u00022", new Object[]{"bitField0_", "enabled_", "params_", e.f73378a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                w1 w1Var = PARSER;
                if (w1Var == null) {
                    synchronized (f.class) {
                        try {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new j0();
                                PARSER = w1Var;
                            }
                        } finally {
                        }
                    }
                }
                return w1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
