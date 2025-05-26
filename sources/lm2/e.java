package lm2;

import am2.n0;
import gm2.a0;
import i2.j2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mm2.r;
import on2.i;
import on2.q;
import wn2.k;

/* loaded from: classes2.dex */
public final class e implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final rg.a f83961a;

    /* renamed from: b, reason: collision with root package name */
    public final on2.f f83962b;

    public e(a components) {
        Intrinsics.checkNotNullParameter(components, "components");
        rg.a aVar = new rg.a(components, b.f83956b, new xk2.h(null));
        this.f83961a = aVar;
        q qVar = (q) aVar.c();
        qVar.getClass();
        this.f83962b = new on2.f(qVar, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // am2.n0
    public final void a(ym2.c fqName, ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        k.b(d(fqName), packageFragments);
    }

    @Override // am2.n0
    public final boolean b(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ((a) this.f83961a.f107929a).f83932b.getClass();
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return false;
    }

    @Override // am2.j0
    public final List c(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return f0.k(d(fqName));
    }

    public final r d(ym2.c fqName) {
        ((a) this.f83961a.f107929a).f83932b.getClass();
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        j2 j2Var = new j2(25, this, new a0(fqName));
        on2.f fVar = this.f83962b;
        fVar.getClass();
        Object invoke = fVar.invoke(new i(fqName, j2Var));
        if (invoke != null) {
            return (r) invoke;
        }
        on2.f.b(3);
        throw null;
    }

    @Override // am2.j0
    public final Collection i(ym2.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Collection collection = (List) d(fqName).f87727k.invoke();
        if (collection == null) {
            collection = q0.f80391a;
        }
        return collection;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((a) this.f83961a.f107929a).f83945o;
    }
}
