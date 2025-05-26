package s80;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e6 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final e6 f111521j = new e6(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e6 f111522k = new e6(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111523i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6(int i13) {
        super(2);
        this.f111523i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        switch (this.f111523i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new ns.f0(subResult, 11));
                createLens.h(new ns.f0(subResult, 12));
                d7.g.y(subResult, 5, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new ns.f0(subResult, 13));
                createLens.h(new ns.f0(subResult, 14));
                d7.g.y(subResult, 6, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f111523i) {
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
