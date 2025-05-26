package ir;

import com.pinterest.activity.task.activity.MainActivity;
import ey.l2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q implements com.pinterest.framework.screens.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f73474a;

    public /* synthetic */ q(MainActivity mainActivity) {
        this.f73474a = mainActivity;
    }

    @Override // com.pinterest.framework.screens.v
    public void J(String nextScreen) {
        Intrinsics.checkNotNullParameter(nextScreen, "nextScreen");
        this.f73474a.getEventManager().d(new l2(nextScreen));
    }

    @Override // com.pinterest.framework.screens.v
    public void g() {
        this.f73474a.getEventManager().d(new l2("BACK_KEY"));
    }

    @Override // com.pinterest.framework.screens.v
    public void h(String nextTabScreen) {
        Intrinsics.checkNotNullParameter(nextTabScreen, "nextTabScreen");
        this.f73474a.getEventManager().d(new l2(a.a.j("TAB_", nextTabScreen)));
    }
}
