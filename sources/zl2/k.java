package zl2;

import dm2.i0;
import i2.j2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;

/* loaded from: classes2.dex */
public final class k extends xl2.l {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f142133h;

    /* renamed from: f, reason: collision with root package name */
    public Function0 f142134f;

    /* renamed from: g, reason: collision with root package name */
    public final on2.l f142135g;

    static {
        l0 l0Var = k0.f80436a;
        f142133h = new rl2.u[]{l0Var.g(new d0(l0Var.b(k.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(on2.q storageManager, h kind) {
        super(storageManager);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f142135g = new on2.l(storageManager, new j2(19, this, storageManager));
        int i13 = j.f142132a[kind.ordinal()];
        if (i13 == 2) {
            c(false);
        } else {
            if (i13 != 3) {
                return;
            }
            c(true);
        }
    }

    public final r L() {
        return (r) lb.l0.B0(this.f142135g, f142133h[0]);
    }

    @Override // xl2.l
    public final cm2.b d() {
        return L();
    }

    @Override // xl2.l
    public final Iterable l() {
        Iterable l13 = super.l();
        Intrinsics.checkNotNullExpressionValue(l13, "getClassDescriptorFactories(...)");
        on2.u uVar = this.f135283d;
        if (uVar == null) {
            xl2.l.a(6);
            throw null;
        }
        Intrinsics.checkNotNullExpressionValue(uVar, "getStorageManager(...)");
        i0 k13 = k();
        Intrinsics.checkNotNullExpressionValue(k13, "getBuiltInsModule(...)");
        return CollectionsKt.k0(l13, new g(uVar, k13));
    }

    @Override // xl2.l
    public final cm2.e q() {
        return L();
    }
}
