package l62;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r72.u1;
import r72.z1;

/* loaded from: classes4.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81650i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z1 f81651j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i13, z1 z1Var) {
        super(1);
        this.f81650i = i13;
        this.f81651j = z1Var;
    }

    public final z1 b(z1 it) {
        switch (this.f81650i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return u1.f((u1) it, null, null, 0.0d, 0.0d, null, null, null, null, ((u1) this.f81651j).f106677i, null, null, null, null, 261887);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return kh2.w.v(this.f81651j, null, null, it.e(), 0.0d, null, 27);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f81650i) {
        }
        return b((z1) obj);
    }
}
