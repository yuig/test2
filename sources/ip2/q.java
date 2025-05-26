package ip2;

import com.google.protobuf.i1;
import com.google.protobuf.j0;
import com.google.protobuf.m0;
import com.google.protobuf.n0;
import com.google.protobuf.p1;
import com.google.protobuf.w1;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q extends n0 implements p1 {
    private static final q DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile w1 PARSER;
    private i1 flags_ = i1.f33908b;

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        n0.registerDefaultInstance(q.class, qVar);
    }

    public static o f() {
        return (o) DEFAULT_INSTANCE.createBuilder();
    }

    public static q g(FileInputStream fileInputStream) {
        return (q) n0.parseDelimitedFrom(DEFAULT_INSTANCE, fileInputStream);
    }

    @Override // com.google.protobuf.n0
    public final Object dynamicMethod(m0 m0Var, Object obj, Object obj2) {
        switch (n.f73381a[m0Var.ordinal()]) {
            case 1:
                return new q();
            case 2:
                return new o(DEFAULT_INSTANCE);
            case 3:
                return n0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"flags_", p.f73382a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                w1 w1Var = PARSER;
                if (w1Var == null) {
                    synchronized (q.class) {
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

    public final Map e() {
        return Collections.unmodifiableMap(this.flags_);
    }
}
