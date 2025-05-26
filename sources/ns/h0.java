package ns;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final h0 f91916j = new h0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h0 f91917k = new h0(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91918i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i13) {
        super(2);
        this.f91918i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        switch (this.f91918i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new f0(subResult, 0));
                createLens.h(new f0(subResult, 1));
                d7.g.y(subResult, 0, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new f0(subResult, 2));
                createLens.h(new f0(subResult, 3));
                d7.g.y(subResult, 1, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f91918i) {
            case 0:
                b((l82.e) obj, (l82.c0) obj2);
                break;
            default:
                b((l82.e) obj, (l82.c0) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
