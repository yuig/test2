package dx0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final q f56447j = new q(0);

    /* renamed from: k, reason: collision with root package name */
    public static final q f56448k = new q(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56449i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i13) {
        super(2);
        this.f56449i = i13;
    }

    public final void b(l82.e createLens, c0 subResult) {
        switch (this.f56449i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                a.c.x(subResult, 13, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new bt0.r(subResult, 8));
                createLens.h(new bt0.r(subResult, 9));
                a.c.x(subResult, 14, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f56449i) {
            case 0:
                b((l82.e) obj, (c0) obj2);
                break;
            default:
                b((l82.e) obj, (c0) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
