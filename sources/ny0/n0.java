package ny0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final n0 f92606j = new n0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final n0 f92607k = new n0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final n0 f92608l = new n0(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92609i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i13) {
        super(2);
        this.f92609i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        switch (this.f92609i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                a.c.x(subResult, 16, createLens);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new bt0.r(subResult, 12));
                createLens.h(new bt0.r(subResult, 13));
                a.c.x(subResult, 17, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new bt0.r(subResult, 14));
                createLens.h(new bt0.r(subResult, 15));
                a.c.x(subResult, 18, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f92609i) {
            case 0:
                b((l82.e) obj, (l82.c0) obj2);
                break;
            case 1:
                b((l82.e) obj, (l82.c0) obj2);
                break;
            default:
                b((l82.e) obj, (l82.c0) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
