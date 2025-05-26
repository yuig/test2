package qa2;

import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class v extends kotlin.jvm.internal.a implements Function0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f103358h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Object obj, int i13) {
        super(0, obj, LegoPinGridCellImpl.class, "navigateToCloseupComprehensive", "navigateToCloseupComprehensive()Z", 8);
        this.f103358h = i13;
        if (i13 == 1) {
            super(0, obj, qg2.j.class, "scheduleApiCallsDelivery", "scheduleApiCallsDelivery(J)V", 0);
        } else if (i13 != 2) {
        } else {
            super(0, obj, qg2.j.class, "scheduleApiCallsDelivery", "scheduleApiCallsDelivery(J)V", 0);
        }
    }

    public final void b() {
        int i13 = this.f103358h;
        Object obj = this.f80413a;
        switch (i13) {
            case 0:
                ((LegoPinGridCellImpl) obj).f2();
                break;
            case 1:
                ((qg2.j) obj).c(0L);
                break;
            default:
                ((qg2.j) obj).c(0L);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f103358h) {
            case 0:
                b();
                break;
            case 1:
                b();
                break;
            default:
                b();
                break;
        }
        return Unit.f80348a;
    }
}
