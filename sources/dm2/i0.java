package dm2;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i0 extends o implements am2.d0 {

    /* renamed from: c, reason: collision with root package name */
    public final on2.u f55431c;

    /* renamed from: d, reason: collision with root package name */
    public final xl2.l f55432d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f55433e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f55434f;

    /* renamed from: g, reason: collision with root package name */
    public g0 f55435g;

    /* renamed from: h, reason: collision with root package name */
    public am2.j0 f55436h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f55437i;

    /* renamed from: j, reason: collision with root package name */
    public final on2.n f55438j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f55439k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ym2.g moduleName, on2.u storageManager, xl2.l builtIns, int i13) {
        super(bm2.h.f23540a, moduleName);
        kotlin.collections.r0 capabilities = kotlin.collections.z0.d();
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        this.f55431c = storageManager;
        this.f55432d = builtIns;
        if (!moduleName.f139479b) {
            throw new IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.f55433e = capabilities;
        n0.f55470a.getClass();
        n0 n0Var = (n0) g0(l0.f55460b);
        this.f55434f = n0Var == null ? m0.f55467b : n0Var;
        this.f55437i = true;
        this.f55438j = ((on2.q) storageManager).d(new h0(this));
        this.f55439k = xk2.m.b(new b0(this, 3));
    }

    @Override // am2.d0
    public final am2.o0 H(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (this.f55437i) {
            return (am2.o0) this.f55438j.invoke(fqName);
        }
        am2.z.a(this);
        throw null;
    }

    @Override // am2.d0
    public final boolean O(am2.d0 targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        if (Intrinsics.d(this, targetModule)) {
            return true;
        }
        g0 g0Var = this.f55435g;
        Intrinsics.f(g0Var);
        return CollectionsKt.L(g0Var.f55423b, targetModule) || k0().contains(targetModule) || targetModule.k0().contains(this);
    }

    @Override // am2.d0
    public final xl2.l f() {
        return this.f55432d;
    }

    @Override // am2.m
    public final am2.m g() {
        return null;
    }

    @Override // am2.d0
    public final Object g0(fi.b capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        Object obj = this.f55433e.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // am2.d0
    public final Collection i(ym2.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        boolean z13 = this.f55437i;
        if (!z13) {
            am2.z.a(this);
            throw null;
        }
        if (z13) {
            return ((n) this.f55439k.getValue()).i(fqName, nameFilter);
        }
        am2.z.a(this);
        throw null;
    }

    @Override // am2.d0
    public final List k0() {
        g0 g0Var = this.f55435g;
        if (g0Var != null) {
            return g0Var.f55424c;
        }
        StringBuilder sb3 = new StringBuilder("Dependencies of module ");
        String str = getName().f139478a;
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        sb3.append(str);
        sb3.append(" were not set");
        throw new AssertionError(sb3.toString());
    }

    @Override // am2.m
    public final Object l0(ul2.e visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        switch (visitor.f122512a) {
            case 0:
                return null;
            default:
                StringBuilder builder = (StringBuilder) obj;
                Intrinsics.checkNotNullParameter(this, "descriptor");
                Intrinsics.checkNotNullParameter(builder, "builder");
                an2.y yVar = (an2.y) visitor.f122513b;
                an2.y yVar2 = an2.y.f15818c;
                yVar.U(this, builder, true);
                return Unit.f80348a;
        }
    }

    public final void o0(i0... descriptors) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        List descriptors2 = kotlin.collections.c0.b0(descriptors);
        Intrinsics.checkNotNullParameter(descriptors2, "descriptors");
        kotlin.collections.s0 friends = kotlin.collections.s0.f80394a;
        Intrinsics.checkNotNullParameter(descriptors2, "descriptors");
        Intrinsics.checkNotNullParameter(friends, "friends");
        g0 dependencies = new g0(descriptors2, friends, kotlin.collections.q0.f80391a, friends);
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.f55435g = dependencies;
    }

    @Override // dm2.o
    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(o.a0(this));
        if (!this.f55437i) {
            sb3.append(" !isValid");
        }
        sb3.append(" packageFragmentProvider: ");
        am2.j0 j0Var = this.f55436h;
        sb3.append(j0Var != null ? j0Var.getClass().getSimpleName() : null);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }
}
