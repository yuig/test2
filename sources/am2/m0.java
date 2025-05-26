package am2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Collection f15564a;

    public m0(ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        this.f15564a = packageFragments;
    }

    @Override // am2.n0
    public final void a(ym2.c fqName, ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        for (Object obj : this.f15564a) {
            if (Intrinsics.d(((dm2.k0) ((i0) obj)).f55454e, fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // am2.n0
    public final boolean b(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Collection collection = this.f15564a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((dm2.k0) ((i0) it.next())).f55454e, fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // am2.j0
    public final List c(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Collection collection = this.f15564a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (Intrinsics.d(((dm2.k0) ((i0) obj)).f55454e, fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // am2.j0
    public final Collection i(ym2.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return yn2.c0.t(yn2.c0.j(yn2.c0.p(CollectionsKt.K(this.f15564a), k0.f15559i), new l0(fqName, 0)));
    }
}
