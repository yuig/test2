package h90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final a0 f68234j = new a0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a0 f68235k = new a0(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68236i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i13) {
        super(2);
        this.f68236i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        switch (this.f68236i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new ns.f0(subResult, 17));
                createLens.h(new z(subResult));
                d7.g.y(subResult, 8, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new ns.f0(subResult, 18));
                createLens.h(new d0(subResult));
                d7.g.y(subResult, 9, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f68236i) {
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
