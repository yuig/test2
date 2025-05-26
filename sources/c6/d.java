package c6;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.f0;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.g1;
import androidx.datastore.preferences.protobuf.j1;
import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.l1;
import androidx.datastore.preferences.protobuf.n1;
import androidx.datastore.preferences.protobuf.o;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.w0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends g0 {
    private static final d DEFAULT_INSTANCE;
    private static volatile g1 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private w0 preferences_ = w0.f18160b;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        g0.i(d.class, dVar);
    }

    public static w0 j(d dVar) {
        w0 w0Var = dVar.preferences_;
        if (!w0Var.f18161a) {
            dVar.preferences_ = w0Var.c();
        }
        return dVar.preferences_;
    }

    public static b l() {
        d dVar = DEFAULT_INSTANCE;
        dVar.getClass();
        return (b) ((d0) dVar.d(f0.NEW_BUILDER));
    }

    public static d m(FileInputStream fileInputStream) {
        d dVar = DEFAULT_INSTANCE;
        l lVar = new l(fileInputStream);
        t a13 = t.a();
        g0 g0Var = (g0) dVar.d(f0.NEW_MUTABLE_INSTANCE);
        try {
            j1 j1Var = j1.f18082c;
            j1Var.getClass();
            n1 a14 = j1Var.a(g0Var.getClass());
            o oVar = lVar.f18106d;
            if (oVar == null) {
                oVar = new o(lVar);
            }
            a14.h(g0Var, oVar, a13);
            a14.b(g0Var);
            if (g0Var.h()) {
                return (d) g0Var;
            }
            throw new UninitializedMessageException().a();
        } catch (IOException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw new InvalidProtocolBufferException(e13.getMessage());
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e14.getCause());
            }
            throw e14;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final Object d(f0 f0Var) {
        switch (a.f26505a[f0Var.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return new l1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", c.f26506a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                g1 g1Var = PARSER;
                if (g1Var == null) {
                    synchronized (d.class) {
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

    public final Map k() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
