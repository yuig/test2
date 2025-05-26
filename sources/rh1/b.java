package rh1;

import android.content.Context;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f108110a;

    public b(k kVar) {
        this.f108110a = kVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.c0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.f100055b) {
            k kVar = this.f108110a;
            if (kVar.C0 == null) {
                Intrinsics.r("pinReactionUtils");
                throw null;
            }
            RelativeLayout relativeLayout = kVar.T0;
            if (relativeLayout == null) {
                Intrinsics.r("reactionAnimationOverlay");
                throw null;
            }
            Context requireContext = kVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            d21.a.a(event.f100054a, relativeLayout, requireContext);
        }
    }
}
