package ro2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.internal.JsonDecodingException;
import qo2.j1;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final qo2.b0 f109027a;

    static {
        f0.h.n0(o0.f80439a);
        f109027a = bp1.h.a("kotlinx.serialization.json.JsonUnquotedLiteral", j1.f104576a);
    }

    public static final h0 a(Number number) {
        return new v(number, false, null);
    }

    public static final h0 b(String str) {
        return str == null ? z.INSTANCE : new v(str, true, null);
    }

    public static final void c(String str, n nVar) {
        throw new IllegalArgumentException("Element " + k0.f80436a.b(nVar.getClass()) + " is not a " + str);
    }

    public static final Boolean d(h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        String b13 = h0Var.b();
        String[] strArr = so2.h0.f114795a;
        Intrinsics.checkNotNullParameter(b13, "<this>");
        if (kotlin.text.z.i(b13, "true", true)) {
            return Boolean.TRUE;
        }
        if (kotlin.text.z.i(b13, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int e(h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        try {
            long h10 = new so2.g0(h0Var.b()).h();
            if (-2147483648L <= h10 && h10 <= 2147483647L) {
                return (int) h10;
            }
            throw new NumberFormatException(h0Var.b() + " is not an Int");
        } catch (JsonDecodingException e13) {
            throw new NumberFormatException(e13.getMessage());
        }
    }

    public static final c0 f(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        c0 c0Var = nVar instanceof c0 ? (c0) nVar : null;
        if (c0Var != null) {
            return c0Var;
        }
        c("JsonObject", nVar);
        throw null;
    }

    public static final h0 g(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        h0 h0Var = nVar instanceof h0 ? (h0) nVar : null;
        if (h0Var != null) {
            return h0Var;
        }
        c("JsonPrimitive", nVar);
        throw null;
    }
}
