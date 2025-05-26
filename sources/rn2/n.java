package rn2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n extends h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i kind, String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
    }

    @Override // rn2.h, in2.n
    public final /* bridge */ /* synthetic */ Collection a(ym2.g gVar, hm2.e eVar) {
        a(gVar, eVar);
        throw null;
    }

    @Override // rn2.h, in2.n
    public final Set b() {
        throw new IllegalStateException();
    }

    @Override // rn2.h, in2.n
    public final Set c() {
        throw new IllegalStateException();
    }

    @Override // rn2.h, in2.n
    public final /* bridge */ /* synthetic */ Collection d(ym2.g gVar, hm2.e eVar) {
        d(gVar, eVar);
        throw null;
    }

    @Override // rn2.h, in2.p
    public final am2.j e(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(this.f108916b + ", required name: " + name);
    }

    @Override // rn2.h, in2.n
    public final Set f() {
        throw new IllegalStateException();
    }

    @Override // rn2.h, in2.p
    public final Collection g(in2.g kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        throw new IllegalStateException(this.f108916b);
    }

    @Override // rn2.h
    /* renamed from: h */
    public final Set a(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(this.f108916b + ", required name: " + name);
    }

    @Override // rn2.h
    /* renamed from: i */
    public final Set d(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(this.f108916b + ", required name: " + name);
    }

    @Override // rn2.h
    public final String toString() {
        return ep.b.k(new StringBuilder("ThrowingScope{"), this.f108916b, '}');
    }
}
