package ed1;

import android.content.ClipboardManager;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class l implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f58655a;

    public l(q qVar) {
        this.f58655a = qVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dr.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.f56181c) {
            return;
        }
        q qVar = this.f58655a;
        int i13 = k.f58653a[qVar.f58675c.ordinal()];
        if (i13 == 1) {
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            String d2 = qVar.f58677e.d();
            Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
            xj2.c F = qVar.f58697y.L(d2).I(1L).F(new g(2, new m(f0Var, event, qVar, 0)), new g(3, c.f58546r), ck2.i.f27923c, ck2.i.f27924d);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            qVar.addDisposable(F);
        } else if (i13 != 2) {
            q.p3(qVar, event);
        } else {
            q.p3(qVar, event);
        }
        event.f56181c = true;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull e82.q event) {
        Intrinsics.checkNotNullParameter(event, "event");
        q qVar = this.f58655a;
        ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener = (ClipboardManager.OnPrimaryClipChangedListener) qVar.R.getValue();
        if (onPrimaryClipChangedListener != null) {
            qVar.Q = event.f57891a;
            ClipboardManager clipboardManager = ((gs1.d) qVar.E).f66080a;
            if (clipboardManager != null) {
                clipboardManager.addPrimaryClipChangedListener(onPrimaryClipChangedListener);
            }
            qVar.r3(true);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull e82.r event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f58655a.r3(false);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((cd1.f) this.f58655a.getView()).d6(event.f58533a);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        q qVar = this.f58655a;
        if (qVar.isBound()) {
            int i13 = qVar.P;
            int i14 = event.f58608a;
            i91.c0 newConfig = event.f58609b;
            if (i13 != i14) {
                SendableObject sendableObject = qVar.f58677e;
                HashMap o13 = bs1.c.o(new Pair("invite_object", String.valueOf(sendableObject.b().value())));
                kh2.j.n(o13, newConfig);
                f1 f1Var = f1.SWIPE;
                h32.g0 contextLoggingComponentType = qVar.f58679g.getContextLoggingComponentType();
                qVar.f58674b.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0.SEND_SHARE_PREVIEW_CAROUSEL, (r18 & 4) != 0 ? null : contextLoggingComponentType, (r18 & 8) != 0 ? null : sendableObject.d(), (r18 & 32) != 0 ? null : o13, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            }
            qVar.O = newConfig;
            qVar.P = event.f58608a;
            cd1.f fVar = (cd1.f) qVar.getView();
            String string = qVar.f58673a.getString(newConfig.a());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            fVar.C0(string);
            Object obj = (cd1.f) qVar.getView();
            Intrinsics.g(obj, "null cannot be cast to non-null type android.view.ViewGroup");
            TransitionManager.beginDelayedTransition((ViewGroup) obj);
            ((cd1.f) qVar.getView()).L4(new pg0.a0(qVar.s3(), qVar.q3()));
            i iVar = qVar.N;
            if (iVar != null) {
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                if (iVar.isBound()) {
                    iVar.f58635m = newConfig;
                    iVar.f58642t.f71843d = newConfig;
                    iVar.G3();
                }
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i91.e event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.getClass();
        this.f58655a.M = true;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        q qVar = this.f58655a;
        if (qVar.f58677e.e() && event.f75438c == jc0.r.BTN_DONE) {
            i91.b bVar = qVar.f58684l;
            String str = bVar.f71798a ? bVar.f71799b : null;
            f1 f1Var = f1.DISMISS;
            SendableObject sendableObject = qVar.f58677e;
            String d2 = sendableObject.d();
            Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
            qVar.f58674b.U(kh2.b0.l0(d2, null), f1Var, null, null, kh2.b0.v0(sendableObject, str), false);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.z event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((cd1.f) this.f58655a.getView()).F2(event);
    }
}
