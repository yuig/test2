package jc1;

import androidx.recyclerview.widget.b2;
import ic1.q;
import ic1.u;
import ic1.v;
import ic1.x;
import kh2.r;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes5.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f75456a;

    public e(g gVar) {
        this.f75456a = gVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x event) {
        Intrinsics.checkNotNullParameter(event, "event");
        g gVar = this.f75456a;
        int i13 = 0;
        for (Object obj : CollectionsKt.F0(gVar.f75463f.f135191h)) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            v vVar = (v) obj;
            if ((vVar instanceof ic1.t) || (vVar instanceof q)) {
                String str = event.f72097a;
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                r.f79665f = str;
                String str2 = event.f72098b;
                Intrinsics.checkNotNullParameter(str2, "<set-?>");
                r.f79667h = str2;
                Object adapter = gVar.getAdapter();
                if (adapter != null) {
                    ((b2) adapter).i(i13);
                }
            }
            i13 = i14;
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        g gVar = this.f75456a;
        int i13 = 0;
        for (Object obj : CollectionsKt.F0(gVar.f75463f.f135191h)) {
            int i14 = i13 + 1;
            if (i13 >= 0) {
                v vVar = (v) obj;
                if (vVar instanceof u) {
                    u uVar = (u) vVar;
                    ia2.b bVar = event.f75451a;
                    uVar.getClass();
                    Intrinsics.checkNotNullParameter(bVar, "<set-?>");
                    uVar.f72090d = bVar;
                    Object adapter = gVar.getAdapter();
                    if (adapter != null) {
                        ((b2) adapter).i(i13);
                    }
                }
                i13 = i14;
            } else {
                f0.p();
                throw null;
            }
        }
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull yp.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        bq.b bVar = event.f139605a;
        Intrinsics.checkNotNullExpressionValue(bVar, "getSortOption(...)");
        g gVar = this.f75456a;
        gVar.f75465h = bVar;
        gVar.f75461d.d(bVar);
    }
}
