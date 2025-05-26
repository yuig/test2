package c6;

import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.f0;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.g1;
import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.k1;
import androidx.datastore.preferences.protobuf.l1;

/* loaded from: classes.dex */
public final class f extends g0 {
    private static final f DEFAULT_INSTANCE;
    private static volatile g1 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private i0 strings_ = k1.d();

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        g0.i(f.class, fVar);
    }

    public static void k(f fVar, Iterable iterable) {
        if (!((androidx.datastore.preferences.protobuf.c) fVar.strings_).c()) {
            i0 i0Var = fVar.strings_;
            int size = i0Var.size();
            fVar.strings_ = i0Var.g(size == 0 ? 10 : size * 2);
        }
        androidx.datastore.preferences.protobuf.a.a(iterable, fVar.strings_);
    }

    public static f l() {
        return DEFAULT_INSTANCE;
    }

    public static e n() {
        f fVar = DEFAULT_INSTANCE;
        fVar.getClass();
        return (e) ((d0) fVar.d(f0.NEW_BUILDER));
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final Object d(f0 f0Var) {
        switch (a.f26505a[f0Var.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new e();
            case 3:
                return new l1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                g1 g1Var = PARSER;
                if (g1Var == null) {
                    synchronized (f.class) {
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

    public final i0 m() {
        return this.strings_;
    }
}
