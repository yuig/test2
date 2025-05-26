package ml0;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final h0 f87456j = new h0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h0 f87457k = new h0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h0 f87458l = new h0(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87459i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i13) {
        super(2);
        this.f87459i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        int i13 = 2;
        switch (this.f87459i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new il0.r(subResult, i13));
                createLens.h(new il0.r(subResult, 3));
                a.c.x(subResult, 1, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new il0.r(subResult, 4));
                createLens.h(new il0.r(subResult, 5));
                a.c.x(subResult, 2, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f87459i) {
            case 0:
                b((l82.e) obj, (l82.c0) obj2);
                return Unit.f80348a;
            case 1:
                b((l82.e) obj, (l82.c0) obj2);
                return Unit.f80348a;
            default:
                int intValue = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter((f30) obj2, "<anonymous parameter 1>");
                return Boolean.valueOf(intValue == 0);
        }
    }
}
