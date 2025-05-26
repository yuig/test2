package s90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final j0 f111979j = new j0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j0 f111980k = new j0(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111981i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i13) {
        super(2);
        this.f111981i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        switch (this.f111981i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new ns.f0(subResult, 29));
                createLens.h(new i0(subResult, 0));
                d7.g.y(subResult, 15, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new i0(subResult, 1));
                createLens.h(new i0(subResult, 2));
                d7.g.y(subResult, 16, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f111981i) {
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
