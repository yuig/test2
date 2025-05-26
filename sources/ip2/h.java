package ip2;

import com.google.protobuf.i1;
import com.google.protobuf.j0;
import com.google.protobuf.m0;
import com.google.protobuf.n0;
import com.google.protobuf.p1;
import com.google.protobuf.w1;

/* loaded from: classes2.dex */
public final class h extends n0 implements p1 {
    private static final h DEFAULT_INSTANCE;
    public static final int FEATURE_STATES_FIELD_NUMBER = 1;
    private static volatile w1 PARSER;
    private i1 featureStates_ = i1.f33908b;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        n0.registerDefaultInstance(h.class, hVar);
    }

    public static i1 e(h hVar) {
        i1 i1Var = hVar.featureStates_;
        if (!i1Var.f33909a) {
            hVar.featureStates_ = i1Var.b();
        }
        return hVar.featureStates_;
    }

    public static c f() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.n0
    public final Object dynamicMethod(m0 m0Var, Object obj, Object obj2) {
        switch (b.f73377a[m0Var.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new c(DEFAULT_INSTANCE);
            case 3:
                return n0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"featureStates_", g.f73379a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                w1 w1Var = PARSER;
                if (w1Var == null) {
                    synchronized (h.class) {
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
