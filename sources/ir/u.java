package ir;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.pinterest.activity.task.activity.MainActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f73485a;

    public u(MainActivity mainActivity) {
        this.f73485a = mainActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        MainActivity mainActivity = this.f73485a;
        com.pinterest.framework.screens.s sVar = mainActivity.A0;
        if (sVar == null) {
            Intrinsics.r("mainScreenManager");
            throw null;
        }
        ViewGroup viewGroup = sVar.f49226a;
        viewGroup.getWindowVisibleDisplayFrame(rect);
        int height = viewGroup.getRootView().getHeight();
        boolean z13 = ((float) (height - rect.bottom)) > ((float) height) * 0.15f;
        if (mainActivity.f35206v0 != z13) {
            if (z13) {
                MainActivity.A(mainActivity);
            } else {
                MainActivity.z(mainActivity);
            }
            mainActivity.getEventManager().d(new pg0.x(z13));
        }
        mainActivity.f35206v0 = z13;
    }
}
