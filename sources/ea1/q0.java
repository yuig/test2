package ea1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58114i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v0 f58115j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f58116k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(v0 v0Var, int i13, int i14) {
        super(1);
        this.f58114i = i14;
        this.f58115j = v0Var;
        this.f58116k = i13;
    }

    public final void b(wm1.k0 bind) {
        int i13 = this.f58114i;
        int i14 = this.f58116k;
        v0 v0Var = this.f58115j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                wm1.v startItem = new wm1.v(v0.Y7(v0Var, i14));
                bind.getClass();
                Intrinsics.checkNotNullParameter(startItem, "startItem");
                bind.f130311b = startItem;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                wm1.v startItem2 = new wm1.v(v0.Y7(v0Var, i14));
                bind.getClass();
                Intrinsics.checkNotNullParameter(startItem2, "startItem");
                bind.f130311b = startItem2;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f58114i) {
            case 0:
                b((wm1.k0) obj);
                break;
            default:
                b((wm1.k0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
