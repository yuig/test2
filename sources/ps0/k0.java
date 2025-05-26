package ps0;

import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import i32.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class k0 extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101277a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Object obj, int i13) {
        super(1, obj, r0.class, "addDisposable", "addDisposable(Lio/reactivex/disposables/Disposable;)V", 0);
        this.f101277a = i13;
        if (i13 != 1) {
        } else {
            super(1, obj, e.class, "loadTakeoverEducation", "loadTakeoverEducation(Lcom/pinterest/schemas/experiences/Placement;)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f101277a) {
            case 0:
                xj2.c p03 = (xj2.c) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((r0) this.receiver).addDisposable(p03);
                break;
            default:
                y0 p04 = (y0) obj;
                Intrinsics.checkNotNullParameter(p04, "p0");
                ((HomeFeedFragment) ((e) this.receiver)).r9(p04);
                break;
        }
        return Unit.f80348a;
    }
}
