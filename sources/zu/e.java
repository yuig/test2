package zu;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes3.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f142795a;

    public e(f fVar) {
        this.f142795a = fVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull m10.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f fVar = this.f142795a;
        fVar.getClass();
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Context context = fVar.getContext();
        Object obj = d5.a.f53679a;
        ObjectAnimator ofObject = ObjectAnimator.ofObject(fVar.f142802f, "backgroundColor", argbEvaluator, Integer.valueOf(context.getColor(fVar.f142801e)), Integer.valueOf(fVar.getContext().getColor(eo1.b.sema_color_background_transparent)));
        Intrinsics.checkNotNullExpressionValue(ofObject, "ofObject(...)");
        ofObject.setDuration(100L);
        ofObject.start();
    }
}
