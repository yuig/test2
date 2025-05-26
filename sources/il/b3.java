package il;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class b3 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final b3 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.k encryptedKeyset_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;
    private a5 keysetInfo_;

    static {
        b3 b3Var = new b3();
        DEFAULT_INSTANCE = b3Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(b3.class, b3Var);
    }

    public static void A(b3 b3Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        b3Var.getClass();
        b3Var.encryptedKeyset_ = jVar;
    }

    public static void B(b3 b3Var, a5 a5Var) {
        b3Var.getClass();
        b3Var.keysetInfo_ = a5Var;
        b3Var.bitField0_ |= 1;
    }

    public static void C(b3 b3Var) {
        b3Var.keysetInfo_ = null;
        b3Var.bitField0_ &= -2;
    }

    public static a3 E() {
        return (a3) DEFAULT_INSTANCE.j();
    }

    public static b3 F(InputStream inputStream, com.google.crypto.tink.shaded.protobuf.u uVar) {
        com.google.crypto.tink.shaded.protobuf.n mVar;
        b3 b3Var = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = com.google.crypto.tink.shaded.protobuf.l0.f33647b;
            mVar = com.google.crypto.tink.shaded.protobuf.n.f(bArr, 0, bArr.length, false);
        } else {
            mVar = new com.google.crypto.tink.shaded.protobuf.m(inputStream);
        }
        com.google.crypto.tink.shaded.protobuf.f0 w13 = com.google.crypto.tink.shaded.protobuf.f0.w(b3Var, mVar, uVar);
        com.google.crypto.tink.shaded.protobuf.f0.g(w13);
        return (b3) w13;
    }

    public final com.google.crypto.tink.shaded.protobuf.k D() {
        return this.encryptedKeyset_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (z2.f72520a[e0Var.ordinal()]) {
            case 1:
                return new b3();
            case 2:
                return new a3(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (b3.class) {
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
