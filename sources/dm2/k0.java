package dm2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class k0 extends p implements am2.i0 {

    /* renamed from: e, reason: collision with root package name */
    public final ym2.c f55454e;

    /* renamed from: f, reason: collision with root package name */
    public final String f55455f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(am2.d0 module, ym2.c fqName) {
        super(module, bm2.h.f23540a, fqName.g(), am2.w0.f15602a);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f55454e = fqName;
        this.f55455f = "package " + fqName + " of " + module;
    }

    @Override // dm2.p, am2.n
    public am2.w0 b() {
        am2.v0 NO_SOURCE = am2.w0.f15602a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
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
                yVar.getClass();
                yVar.Y(this.f55454e, "package-fragment", builder);
                if (yVar.f15821a.h()) {
                    builder.append(" in ");
                    yVar.U(g(), builder, false);
                }
                return Unit.f80348a;
        }
    }

    @Override // dm2.p, am2.m
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public final am2.d0 g() {
        am2.m g13 = super.g();
        Intrinsics.g(g13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (am2.d0) g13;
    }

    @Override // dm2.o
    public String toString() {
        return this.f55455f;
    }
}
