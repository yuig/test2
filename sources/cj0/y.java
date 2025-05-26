package cj0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final y f27878j = new y(0);

    /* renamed from: k, reason: collision with root package name */
    public static final y f27879k = new y(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27880i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i13) {
        super(2);
        this.f27880i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        switch (this.f27880i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new s90.i0(subResult, 24));
                createLens.h(new s90.i0(subResult, 25));
                d7.g.y(subResult, 29, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new s90.i0(subResult, 26));
                createLens.h(new s90.i0(subResult, 27));
                a.c.x(subResult, 0, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f27880i) {
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
