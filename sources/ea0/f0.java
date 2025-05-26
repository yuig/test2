package ea0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final f0 f57954j = new f0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f0 f57955k = new f0(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57956i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i13) {
        super(2);
        this.f57956i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        switch (this.f57956i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new s90.i0(subResult, 11));
                createLens.h(new s90.i0(subResult, 12));
                d7.g.y(subResult, 21, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new s90.i0(subResult, 13));
                createLens.h(new s90.i0(subResult, 14));
                d7.g.y(subResult, 22, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f57956i) {
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
