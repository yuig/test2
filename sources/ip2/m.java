package ip2;

import com.google.protobuf.j0;
import com.google.protobuf.m0;
import com.google.protobuf.n0;
import com.google.protobuf.p1;
import com.google.protobuf.v0;
import com.google.protobuf.w1;

/* loaded from: classes2.dex */
public final class m extends n0 implements p1 {
    public static final int CONSTRAINED_VALUES_FIELD_NUMBER = 8;
    private static final m DEFAULT_INSTANCE;
    private static volatile w1 PARSER;
    private v0 constrainedValues_ = n0.emptyProtobufList();

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        n0.registerDefaultInstance(m.class, mVar);
    }

    public static m g() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.n0
    public final Object dynamicMethod(m0 m0Var, Object obj, Object obj2) {
        switch (i.f73380a[m0Var.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new j();
            case 3:
                return n0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"constrainedValues_", l.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                w1 w1Var = PARSER;
                if (w1Var == null) {
                    synchronized (m.class) {
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

    public final v0 f() {
        return this.constrainedValues_;
    }
}
