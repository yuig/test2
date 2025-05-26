package in2;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a implements n {
    @Override // in2.n
    public Collection a(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i().a(name, location);
    }

    @Override // in2.n
    public final Set b() {
        return i().b();
    }

    @Override // in2.n
    public final Set c() {
        return i().c();
    }

    @Override // in2.n
    public Collection d(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i().d(name, location);
    }

    @Override // in2.p
    public final am2.j e(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i().e(name, location);
    }

    @Override // in2.n
    public final Set f() {
        return i().f();
    }

    @Override // in2.p
    public Collection g(g kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return i().g(kindFilter, nameFilter);
    }

    public final n h() {
        if (!(i() instanceof a)) {
            return i();
        }
        n i13 = i();
        Intrinsics.g(i13, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((a) i13).h();
    }

    public abstract n i();
}
