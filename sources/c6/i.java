package c6;

import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.f0;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.g1;
import androidx.datastore.preferences.protobuf.l1;

/* loaded from: classes.dex */
public final class i extends g0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final i DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile g1 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        g0.i(i.class, iVar);
    }

    public static void j(i iVar, long j13) {
        iVar.valueCase_ = 4;
        iVar.value_ = Long.valueOf(j13);
    }

    public static void k(i iVar, String str) {
        iVar.getClass();
        str.getClass();
        iVar.valueCase_ = 5;
        iVar.value_ = str;
    }

    public static void l(i iVar, e eVar) {
        iVar.getClass();
        iVar.value_ = eVar.c();
        iVar.valueCase_ = 6;
    }

    public static void m(i iVar, double d2) {
        iVar.valueCase_ = 7;
        iVar.value_ = Double.valueOf(d2);
    }

    public static void n(i iVar, boolean z13) {
        iVar.valueCase_ = 1;
        iVar.value_ = Boolean.valueOf(z13);
    }

    public static void o(i iVar, float f13) {
        iVar.valueCase_ = 2;
        iVar.value_ = Float.valueOf(f13);
    }

    public static void p(i iVar, int i13) {
        iVar.valueCase_ = 3;
        iVar.value_ = Integer.valueOf(i13);
    }

    public static i r() {
        return DEFAULT_INSTANCE;
    }

    public static g z() {
        i iVar = DEFAULT_INSTANCE;
        iVar.getClass();
        return (g) ((d0) iVar.d(f0.NEW_BUILDER));
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final Object d(f0 f0Var) {
        switch (a.f26505a[f0Var.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new g(DEFAULT_INSTANCE);
            case 3:
                return new l1(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", f.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                g1 g1Var = PARSER;
                if (g1Var == null) {
                    synchronized (i.class) {
                        try {
                            g1Var = PARSER;
                            if (g1Var == null) {
                                g1Var = new e0();
                                PARSER = g1Var;
                            }
                        } finally {
                        }
                    }
                }
                return g1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean q() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double s() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float t() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int u() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long v() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String w() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final f x() {
        return this.valueCase_ == 6 ? (f) this.value_ : f.l();
    }

    public final h y() {
        return h.forNumber(this.valueCase_);
    }
}
