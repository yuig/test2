package dm2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0 f55428i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var) {
        super(1);
        this.f55428i = i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ym2.c fqName = (ym2.c) obj;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        i0 module = this.f55428i;
        ((m0) module.f55434f).getClass();
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        on2.u storageManager = module.f55431c;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        return new c0(module, fqName, storageManager);
    }
}
