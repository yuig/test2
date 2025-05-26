package zl2;

import am2.d0;
import dm2.i0;
import i2.j2;
import java.util.Collection;
import kotlin.collections.g1;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;

/* loaded from: classes2.dex */
public final class g implements cm2.c {

    /* renamed from: d, reason: collision with root package name */
    public static final re2.f f142122d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f142123e;

    /* renamed from: f, reason: collision with root package name */
    public static final ym2.c f142124f;

    /* renamed from: g, reason: collision with root package name */
    public static final ym2.g f142125g;

    /* renamed from: h, reason: collision with root package name */
    public static final ym2.b f142126h;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f142127a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f142128b;

    /* renamed from: c, reason: collision with root package name */
    public final on2.l f142129c;

    static {
        l0 l0Var = k0.f80436a;
        f142123e = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(g.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        f142122d = new re2.f(8, 0);
        f142124f = xl2.r.f135332l;
        ym2.e eVar = xl2.q.f135296c;
        ym2.g f13 = eVar.f();
        Intrinsics.checkNotNullExpressionValue(f13, "shortName(...)");
        f142125g = f13;
        ym2.b j13 = ym2.b.j(eVar.g());
        Intrinsics.checkNotNullExpressionValue(j13, "topLevel(...)");
        f142126h = j13;
    }

    public g(on2.u storageManager, i0 moduleDescriptor) {
        f computeContainingDeclaration = f.f142121i;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(computeContainingDeclaration, "computeContainingDeclaration");
        this.f142127a = moduleDescriptor;
        this.f142128b = computeContainingDeclaration;
        this.f142129c = new on2.l((on2.q) storageManager, new j2(18, this, storageManager));
    }

    @Override // cm2.c
    public final Collection a(ym2.c packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return Intrinsics.d(packageFqName, f142124f) ? g1.b(d()) : s0.f80394a;
    }

    @Override // cm2.c
    public final boolean b(ym2.c packageFqName, ym2.g name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.d(name, f142125g) && Intrinsics.d(packageFqName, f142124f);
    }

    @Override // cm2.c
    public final am2.g c(ym2.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (Intrinsics.d(classId, f142126h)) {
            return d();
        }
        return null;
    }

    public final dm2.m d() {
        return (dm2.m) lb.l0.B0(this.f142129c, f142123e[0]);
    }
}
