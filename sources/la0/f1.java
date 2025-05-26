package la0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f1 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final f1 f82392j = new f1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f1 f82393k = new f1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f1 f82394l = new f1(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82395i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(int i13) {
        super(2);
        this.f82395i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        switch (this.f82395i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                d7.g.y(subResult, 26, createLens);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new s90.i0(subResult, 20));
                createLens.h(new s90.i0(subResult, 21));
                d7.g.y(subResult, 27, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new s90.i0(subResult, 22));
                createLens.h(new s90.i0(subResult, 23));
                d7.g.y(subResult, 28, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f82395i) {
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
