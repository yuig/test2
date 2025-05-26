package ke1;

import android.view.View;
import com.pinterest.api.model.vh;
import ey.x;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;
import t3.s1;

/* loaded from: classes2.dex */
public final class d implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f79288a;

    public d(e eVar) {
        this.f79288a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [yk1.m] */
    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x event) {
        vh vhVar;
        Intrinsics.checkNotNullParameter(event, "event");
        e eVar = this.f79288a;
        Object obj = eVar.f79297i;
        if (obj == null || (vhVar = eVar.f79298j) == null) {
            return;
        }
        eVar.f79300l = true;
        View view = obj instanceof View ? (View) obj : null;
        if (view != null) {
            ?? j13 = s1.j(view);
            r3 = j13 instanceof ie1.a ? j13 : null;
        }
        if (r3 != null) {
            r3.q3(vhVar, eVar.f79299k);
        }
        eVar.f79292d.j(this);
    }
}
