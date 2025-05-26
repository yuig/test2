package an2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d0 extends nl2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f15767b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Object obj, f0 f0Var) {
        super(obj);
        this.f15767b = f0Var;
    }

    @Override // nl2.a
    public final void b(rl2.u property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (this.f15767b.f15771a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
    }
}
