package ip2;

import com.google.protobuf.j0;
import com.google.protobuf.m0;
import com.google.protobuf.n0;
import com.google.protobuf.p1;
import com.google.protobuf.w1;

/* loaded from: classes4.dex */
public final class l extends n0 implements p1 {
    public static final int APP_ID_FIELD_NUMBER = 1;
    public static final int BOOL_VALUE_FIELD_NUMBER = 3;
    public static final int BYTES_VALUE_FIELD_NUMBER = 7;
    private static final l DEFAULT_INSTANCE;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 5;
    public static final int INT_VALUE_FIELD_NUMBER = 4;
    public static final int MIN_VERSION_FIELD_NUMBER = 2;
    private static volatile w1 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 6;
    private int bitField0_;
    private Object value_;
    private int valueCase_ = 0;
    private String appId_ = "";
    private String minVersion_ = "";

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        n0.registerDefaultInstance(l.class, lVar);
    }

    @Override // com.google.protobuf.n0
    public final Object dynamicMethod(m0 m0Var, Object obj, Object obj2) {
        switch (i.f73380a[m0Var.ordinal()]) {
            case 1:
                return new l();
            case 2:
                return new j(1);
            case 3:
                return n0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003်\u0000\u0004ဵ\u0000\u0005ဴ\u0000\u0006ျ\u0000\u0007ွ\u0000", new Object[]{"value_", "valueCase_", "bitField0_", "appId_", "minVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                w1 w1Var = PARSER;
                if (w1Var == null) {
                    synchronized (l.class) {
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

    public final String f() {
        return this.appId_;
    }

    public final boolean g() {
        if (this.valueCase_ == 3) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final com.google.protobuf.l h() {
        return this.valueCase_ == 7 ? (com.google.protobuf.l) this.value_ : com.google.protobuf.l.f33922b;
    }

    public final float i() {
        if (this.valueCase_ == 5) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final long j() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String k() {
        return this.minVersion_;
    }

    public final String l() {
        return this.valueCase_ == 6 ? (String) this.value_ : "";
    }

    public final k m() {
        return k.forNumber(this.valueCase_);
    }

    public final boolean n() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean o() {
        return (this.bitField0_ & 2) != 0;
    }
}
