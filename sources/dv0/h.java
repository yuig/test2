package dv0;

import dl1.s;
import java.util.Date;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class h implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f56338a;

    public h(k kVar) {
        this.f56338a = kVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull f11.j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        k kVar = this.f56338a;
        kVar.f56363v.setTime(event.f60782a);
        kVar.G3();
        bv0.l lVar = kVar.f56364w;
        Iterator it = CollectionsKt.F0(lVar.f135191h).iterator();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            } else if (((s) it.next()) instanceof cv0.g) {
                break;
            } else {
                i14++;
            }
        }
        k.H3(this.f56338a, new au0.f(event, 12), null, null, false, 14);
        int i15 = p22.b.idea_pin_schedule_publish_date_title;
        Date time = kVar.f56363v.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        lVar.u1(i14, new cv0.g(i15, kg.o.r(time, kVar.f56345d), new g(kVar, i13)));
    }
}
