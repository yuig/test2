package c71;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26772a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Object obj, int i13) {
        super(0, obj, m.class, "loadData", "loadData()V", 0);
        this.f26772a = i13;
        if (i13 == 1) {
            super(0, obj, m.class, "onActivate", "onActivate()V", 0);
            return;
        }
        if (i13 == 2) {
            super(0, obj, m.class, "onFinishedLoadingEmptyInitialPage", "onFinishedLoadingEmptyInitialPage()V", 0);
            return;
        }
        if (i13 == 3) {
            super(0, obj, m.class, "provideModelObservation", "provideModelObservation()Lcom/pinterest/framework/multisection/datasource/pagedlist/GraphQLPagedList$ModelObservation;", 0);
            return;
        }
        if (i13 == 4) {
            super(0, obj, m.class, "updatePinalytics", "updatePinalytics()V", 0);
        } else if (i13 != 5) {
        } else {
            super(0, obj, m.class, "updatePinalytics", "updatePinalytics()V", 0);
        }
    }

    public final void h() {
        switch (this.f26772a) {
            case 0:
                ((m) this.receiver).loadData();
                break;
            case 1:
                ((m) this.receiver).onActivate();
                break;
            case 2:
                ((m) this.receiver).M3();
                break;
            case 3:
            default:
                ((m) this.receiver).Q3();
                break;
            case 4:
                ((m) this.receiver).Q3();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26772a) {
            case 0:
                h();
                break;
            case 1:
                h();
                break;
            case 2:
                h();
                break;
            case 3:
                break;
            case 4:
                h();
                break;
            default:
                h();
                break;
        }
        return Unit.f80348a;
    }
}
