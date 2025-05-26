package rn2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.g1;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b1;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f108927a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final f f108928b = f.f108911a;

    /* renamed from: c, reason: collision with root package name */
    public static final a f108929c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f108930d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f108931e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set f108932f;

    static {
        String format = String.format(b.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        ym2.g g13 = ym2.g.g(format);
        Intrinsics.checkNotNullExpressionValue(g13, "special(...)");
        f108929c = new a(g13);
        f108930d = d(l.CYCLIC_SUPERTYPES, new String[0]);
        f108931e = d(l.ERROR_PROPERTY_TYPE, new String[0]);
        f108932f = g1.b(new g());
    }

    public static final h a(i kind, boolean z13, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return z13 ? new n(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new h(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final h b(i kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return a(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static j c(l kind, b1 typeConstructor, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return f(kind, q0.f80391a, typeConstructor, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final j d(l kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        q0 arguments = q0.f80391a;
        String[] formatParams2 = (String[]) Arrays.copyOf(formatParams, formatParams.length);
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(formatParams2, "formatParams");
        return f(kind, arguments, e(kind, (String[]) Arrays.copyOf(formatParams2, formatParams2.length)), (String[]) Arrays.copyOf(formatParams2, formatParams2.length));
    }

    public static k e(l kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return new k(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static j f(l kind, List arguments, b1 typeConstructor, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return new j(typeConstructor, b(i.ERROR_TYPE_SCOPE, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean g(am2.m mVar) {
        return mVar != null && ((mVar instanceof a) || (mVar.g() instanceof a) || mVar == f108928b);
    }
}
