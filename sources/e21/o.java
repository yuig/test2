package e21;

import android.graphics.drawable.Drawable;
import com.pinterest.feature.pin.reactions.view.PinReactionsDisplayView;
import com.pinterest.gestalt.text.GestaltText;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import rq.a0;

/* loaded from: classes5.dex */
public final class o implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinReactionsDisplayView f56984a;

    public o(PinReactionsDisplayView pinReactionsDisplayView) {
        this.f56984a = pinReactionsDisplayView;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.o event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map reactionsMap = event.f84704c;
        PinReactionsDisplayView pinReactionsDisplayView = this.f56984a;
        pinReactionsDisplayView.getClass();
        Intrinsics.checkNotNullParameter(reactionsMap, "reactionsMap");
        v32.c reactionByMe = event.f84705d;
        Intrinsics.checkNotNullParameter(reactionByMe, "reactionByMe");
        wa2.u.a(pinReactionsDisplayView.f47278f, reactionsMap, reactionByMe, false, 4);
        GestaltText gestaltText = pinReactionsDisplayView.f47279g;
        gestaltText.i(new a0(event.f84703b, gestaltText, reactionByMe, 6));
        gestaltText.setCompoundDrawablesRelativeWithIntrinsicBounds(pinReactionsDisplayView.f47278f, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
