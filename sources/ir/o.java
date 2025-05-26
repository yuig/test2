package ir;

import com.pinterest.activity.task.activity.MainActivity;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class o implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f73471a;

    public o(MainActivity mainActivity) {
        this.f73471a = mainActivity;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull sb0.a e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        boolean z13 = e13.f112235a;
        bk.f fVar = MainActivity.N0;
        MainActivity mainActivity = this.f73471a;
        if (z13) {
            hb2.t tVar = mainActivity.f35208w0;
            if (tVar != null) {
                tVar.b();
                return;
            }
            return;
        }
        if (mainActivity.f35208w0 == null) {
            mainActivity.a0();
        }
        hb2.t tVar2 = mainActivity.f35208w0;
        if (tVar2 != null) {
            tVar2.c();
        }
    }
}
