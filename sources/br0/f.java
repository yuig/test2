package br0;

import android.content.Context;
import android.widget.LinearLayout;
import i32.l;
import i32.y0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import rg0.n;
import xo.s;

/* loaded from: classes5.dex */
public final class f extends s implements yk1.d {

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f23746d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f23747e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f23748f;

    /* renamed from: g, reason: collision with root package name */
    public final w f23749g;

    /* renamed from: h, reason: collision with root package name */
    public rg0.s f23750h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, h onCreatePinTap, h onCreateBoardTap, h onCreateCollageTap, w eventManager) {
        super(context, 8);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onCreatePinTap, "onCreatePinTap");
        Intrinsics.checkNotNullParameter(onCreateBoardTap, "onCreateBoardTap");
        Intrinsics.checkNotNullParameter(onCreateCollageTap, "onCreateCollageTap");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f23746d = onCreatePinTap;
        this.f23747e = onCreateBoardTap;
        this.f23748f = onCreateCollageTap;
        this.f23749g = eventManager;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        setGravity(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rg0.s sVar = this.f23750h;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        n b13 = ((dh0.d) sVar).b(y0.ANDROID_CREATION_INTERSTITIAL);
        if (b13 == null) {
            return;
        }
        if (b13.f108060b == l.ANDROID_PIN_CREATION_PINS_TOOLTIP.getValue()) {
            this.f23749g.e(300L, new dg0.c(b13.f108071m));
        }
    }
}
