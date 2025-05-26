package ln2;

import am2.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final on2.u f84054a;

    /* renamed from: b, reason: collision with root package name */
    public final rm2.b0 f84055b;

    /* renamed from: c, reason: collision with root package name */
    public final am2.d0 f84056c;

    /* renamed from: d, reason: collision with root package name */
    public o f84057d;

    /* renamed from: e, reason: collision with root package name */
    public final on2.m f84058e;

    public a(on2.q storageManager, fm2.d finder, dm2.i0 moduleDescriptor) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        this.f84054a = storageManager;
        this.f84055b = finder;
        this.f84056c = moduleDescriptor;
        this.f84058e = storageManager.e(new e82.l(this, 24));
    }

    @Override // am2.n0
    public final void a(ym2.c fqName, ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        wn2.k.b(this.f84058e.invoke(fqName), packageFragments);
    }

    @Override // am2.n0
    public final boolean b(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        on2.m mVar = this.f84058e;
        Object obj = mVar.f96780b.get(fqName);
        return ((obj == null || obj == on2.o.COMPUTING) ? d(fqName) : (am2.i0) mVar.invoke(fqName)) == null;
    }

    @Override // am2.j0
    public final List c(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return kotlin.collections.f0.k(this.f84058e.invoke(fqName));
    }

    public abstract mn2.d d(ym2.c cVar);

    @Override // am2.j0
    public final Collection i(ym2.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return s0.f80394a;
    }
}
