package lq0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class j1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final j1 f84341j = new j1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j1 f84342k = new j1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final j1 f84343l = new j1(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84344i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(int i13) {
        super(0);
        this.f84344i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f84344i) {
            case 0:
                return "GifReactionTrayView";
            case 1:
                return new t1();
            default:
                return Unit.f80348a;
        }
    }
}
