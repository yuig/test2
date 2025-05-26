package ec1;

import dc1.n;
import dl1.s;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes5.dex */
public final class i implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f58422a;

    public i(j jVar) {
        this.f58422a = jVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ap.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        j jVar = this.f58422a;
        int i13 = 0;
        for (Object obj : CollectionsKt.F0(jVar.f58432j.f135191h)) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            s sVar = (s) obj;
            if (sVar instanceof n) {
                ((n) sVar).f125210e = false;
                jVar.f58430h.post(new v.k(jVar, i13, 15));
            }
            i13 = i14;
        }
    }
}
