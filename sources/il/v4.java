package il;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class v4 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final v4 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.k0 key_ = com.google.crypto.tink.shaded.protobuf.n1.f33664d;
    private int primaryKeyId_;

    static {
        v4 v4Var = new v4();
        DEFAULT_INSTANCE = v4Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(v4.class, v4Var);
    }

    public static void A(v4 v4Var, int i13) {
        v4Var.primaryKeyId_ = i13;
    }

    public static void B(v4 v4Var, u4 u4Var) {
        v4Var.getClass();
        com.google.crypto.tink.shaded.protobuf.k0 k0Var = v4Var.key_;
        if (!((com.google.crypto.tink.shaded.protobuf.c) k0Var).f33594a) {
            int size = k0Var.size();
            v4Var.key_ = k0Var.g(size == 0 ? 10 : size * 2);
        }
        v4Var.key_.add(u4Var);
    }

    public static s4 G() {
        return (s4) DEFAULT_INSTANCE.j();
    }

    public static v4 H(InputStream inputStream, com.google.crypto.tink.shaded.protobuf.u uVar) {
        com.google.crypto.tink.shaded.protobuf.n mVar;
        v4 v4Var = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = com.google.crypto.tink.shaded.protobuf.l0.f33647b;
            mVar = com.google.crypto.tink.shaded.protobuf.n.f(bArr, 0, bArr.length, false);
        } else {
            mVar = new com.google.crypto.tink.shaded.protobuf.m(inputStream);
        }
        com.google.crypto.tink.shaded.protobuf.f0 w13 = com.google.crypto.tink.shaded.protobuf.f0.w(v4Var, mVar, uVar);
        com.google.crypto.tink.shaded.protobuf.f0.g(w13);
        return (v4) w13;
    }

    public static v4 I(byte[] bArr, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (v4) com.google.crypto.tink.shaded.protobuf.f0.v(DEFAULT_INSTANCE, bArr, uVar);
    }

    public final u4 C(int i13) {
        return (u4) this.key_.get(i13);
    }

    public final int D() {
        return this.key_.size();
    }

    public final com.google.crypto.tink.shaded.protobuf.k0 E() {
        return this.key_;
    }

    public final int F() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (r4.f72501a[e0Var.ordinal()]) {
            case 1:
                return new v4();
            case 2:
                return new s4(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", u4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (v4.class) {
                        try {
                            j1Var = PARSER;
                            if (j1Var == null) {
                                j1Var = new com.google.crypto.tink.shaded.protobuf.d0();
                                PARSER = j1Var;
                            }
                        } finally {
                        }
                    }
                }
                return j1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
