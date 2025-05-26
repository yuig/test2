package rn2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.g1;
import kotlin.collections.q0;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t3.s1;

/* loaded from: classes2.dex */
public class h implements in2.n {

    /* renamed from: b, reason: collision with root package name */
    public final String f108916b;

    public h(i kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        String debugMessage = kind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f108916b = s1.d(copyOf, copyOf.length, debugMessage, "format(...)");
    }

    @Override // in2.n
    public Set b() {
        return s0.f80394a;
    }

    @Override // in2.n
    public Set c() {
        return s0.f80394a;
    }

    @Override // in2.p
    public am2.j e(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        String format = String.format(b.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{name}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        ym2.g g13 = ym2.g.g(format);
        Intrinsics.checkNotNullExpressionValue(g13, "special(...)");
        return new a(g13);
    }

    @Override // in2.n
    public Set f() {
        return s0.f80394a;
    }

    @Override // in2.p
    public Collection g(in2.g kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return q0.f80391a;
    }

    @Override // in2.n
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set a(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return g1.b(new d(m.f108929c));
    }

    @Override // in2.n
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set d(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return m.f108932f;
    }

    public String toString() {
        return ep.b.k(new StringBuilder("ErrorScope{"), this.f108916b, '}');
    }
}
