package c61;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final e1 f26534j = new e1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e1 f26535k = new e1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e1 f26536l = new e1(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26537i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(int i13) {
        super(2);
        this.f26537i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        switch (this.f26537i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                a.c.x(subResult, 23, createLens);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new bt0.r(subResult, 25));
                createLens.h(new bt0.r(subResult, 26));
                a.c.x(subResult, 24, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new bt0.r(subResult, 27));
                createLens.h(new bt0.r(subResult, 28));
                a.c.x(subResult, 25, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26537i) {
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
