package zw0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final o f142914j = new o(0);

    /* renamed from: k, reason: collision with root package name */
    public static final o f142915k = new o(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142916i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i13) {
        super(2);
        this.f142916i = i13;
    }

    public final void b(l82.e createLens, c0 subResult) {
        switch (this.f142916i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                a.c.x(subResult, 11, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new bt0.r(subResult, 6));
                createLens.h(new bt0.r(subResult, 7));
                a.c.x(subResult, 12, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f142916i) {
            case 0:
                b((l82.e) obj, (c0) obj2);
                break;
            default:
                b((l82.e) obj, (c0) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
