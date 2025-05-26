package fa0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final f0 f61482j = new f0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f0 f61483k = new f0(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61484i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i13) {
        super(2);
        this.f61484i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        switch (this.f61484i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new s90.i0(subResult, 15));
                createLens.h(new s90.i0(subResult, 16));
                d7.g.y(subResult, 23, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new s90.i0(subResult, 17));
                createLens.h(new s90.i0(subResult, 18));
                d7.g.y(subResult, 24, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f61484i) {
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
