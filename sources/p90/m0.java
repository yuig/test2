package p90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final m0 f99198j = new m0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final m0 f99199k = new m0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final m0 f99200l = new m0(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99201i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i13) {
        super(2);
        this.f99201i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        switch (this.f99201i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new ns.f0(subResult, 23));
                createLens.h(new ns.f0(subResult, 24));
                d7.g.y(subResult, 12, createLens);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new ns.f0(subResult, 25));
                createLens.h(new ns.f0(subResult, 26));
                d7.g.y(subResult, 13, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new ns.f0(subResult, 27));
                createLens.h(new ns.f0(subResult, 28));
                d7.g.y(subResult, 14, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f99201i) {
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
