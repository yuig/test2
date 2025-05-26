package dm2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n implements am2.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f55468a;

    /* renamed from: b, reason: collision with root package name */
    public final String f55469b;

    public n(List providers, String debugName) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        this.f55468a = providers;
        this.f55469b = debugName;
        providers.size();
        CollectionsKt.J0(providers).size();
    }

    @Override // am2.n0
    public final void a(ym2.c fqName, ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        Iterator it = this.f55468a.iterator();
        while (it.hasNext()) {
            dl2.b.K((am2.j0) it.next(), fqName, packageFragments);
        }
    }

    @Override // am2.n0
    public final boolean b(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List list = this.f55468a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!dl2.b.H1((am2.j0) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // am2.j0
    public final List c(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f55468a.iterator();
        while (it.hasNext()) {
            dl2.b.K((am2.j0) it.next(), fqName, arrayList);
        }
        return CollectionsKt.F0(arrayList);
    }

    @Override // am2.j0
    public final Collection i(ym2.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it = this.f55468a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((am2.j0) it.next()).i(fqName, nameFilter));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f55469b;
    }
}
