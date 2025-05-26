package ir;

import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.component.alert.AlertContainer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73469i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MainActivity f73470j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(MainActivity mainActivity, int i13) {
        super(0);
        this.f73469i = i13;
        this.f73470j = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f73469i;
        MainActivity mainActivity = this.f73470j;
        switch (i13) {
            case 0:
                AlertContainer alertContainer = mainActivity.f35181j;
                if (alertContainer != null) {
                    return alertContainer;
                }
                Intrinsics.r("alertContainer");
                throw null;
            case 1:
                return new o(mainActivity);
            case 2:
                se2.a aVar = mainActivity.D;
                if (aVar != null) {
                    return (j22.b) ((bf2.b) aVar).get();
                }
                Intrinsics.r("lazySearchService");
                throw null;
            default:
                se2.a aVar2 = mainActivity.H;
                if (aVar2 != null) {
                    return (k22.m) ((bf2.b) aVar2).get();
                }
                Intrinsics.r("lazyUserService");
                throw null;
        }
    }
}
