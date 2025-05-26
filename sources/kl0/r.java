package kl0;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class r implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f80111a;

    public r(z zVar) {
        this.f80111a = zVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull is1.w event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String lastPathSegment = event.f73653b.getLastPathSegment();
        if (lastPathSegment == null || !kotlin.text.z.p(lastPathSegment, ".pending", false)) {
            z zVar = this.f80111a;
            if (zVar.f80136e1 == null) {
                Intrinsics.r("mediaGalleryUtils");
                throw null;
            }
            m60.a0 h10 = rw0.f.h();
            Uri uri = event.f73653b;
            if (h10.containsKey(uri)) {
                return;
            }
            if (zVar.f80136e1 == null) {
                Intrinsics.r("mediaGalleryUtils");
                throw null;
            }
            m60.a0 h13 = rw0.f.h();
            V put = h13.put(uri.toString(), Long.valueOf(System.currentTimeMillis()));
            lb0.g.h("SILENCED_SCREENSHOT", h13);
            if (put == 0) {
                z this$0 = (z) zVar.f80130a2.f1465b;
                int i13 = z.f80128e2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                com.pinterest.feature.board.detail.b bVar = this$0.f80145n1;
                if (bVar != null) {
                    ((hl0.v) bVar).g4();
                }
            }
        }
    }
}
