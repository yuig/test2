package ir;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.feature.comment.reactions.view.CommentReactionsContextMenuView;
import com.pinterest.feature.conversationmessage.reactions.view.ConversationMessageReactionsContextMenuView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.reactions.view.ReactionsContextMenuView;
import com.pinterest.ui.menu.ContextMenuView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.b1;
import lh0.g1;
import lh0.o0;
import lh0.z3;
import nx.d0;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pg0.k0;
import pg0.l0;
import rg0.n0;
import so.f4;
import so.s8;

/* loaded from: classes.dex */
public final class k implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f73465a;

    public k(MainActivity mainActivity) {
        this.f73465a = mainActivity;
    }

    public final nl1.d a() {
        nl1.d V7;
        nl1.d f52740f = this.f73465a.getF52740f();
        vb0.j.f125466a.N(f52740f, "MainActivity.ShowPinContextMenuEvent fragment is null", new Object[0]);
        return (!(f52740f instanceof kr.a) || (V7 = ((kr.a) f52740f).V7()) == null) ? f52740f : V7;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull cb2.a0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        MainActivity mainActivity = this.f73465a;
        if (mainActivity.f35199s == null) {
            ViewStub viewStub = mainActivity.f35185l;
            if (viewStub == null) {
                Intrinsics.r("pinReactionsContextMenuViewStub");
                throw null;
            }
            View inflate = viewStub.inflate();
            Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.feature.pin.reactions.view.ReactionsContextMenuView");
            mainActivity.f35199s = (ReactionsContextMenuView) inflate;
        }
        ReactionsContextMenuView reactionsContextMenuView = mainActivity.f35199s;
        if (reactionsContextMenuView != null) {
            reactionsContextMenuView.post(new dp.a(10, mainActivity, event));
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.q e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ModalContainer modalContainer = this.f73465a.f35179i;
        if (modalContainer != null) {
            modalContainer.g(e13);
        } else {
            Intrinsics.r("modalContainer");
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.s e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ModalContainer modalContainer = this.f73465a.f35179i;
        if (modalContainer != null) {
            modalContainer.e(e13);
        } else {
            Intrinsics.r("modalContainer");
            throw null;
        }
    }

    @sp2.k(priority = RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull b1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        MainActivity mainActivity = this.f73465a;
        int i13 = 1;
        ((tb0.h) ((bf2.b) mainActivity.K()).get()).f117093q = true;
        boolean z13 = tb0.o.f117104k;
        ((lb0.b) lb0.n.a()).k("PREF_NUM_CRASH_PRE_EXP_INIT");
        int i14 = 0;
        if (((Boolean) mainActivity.V().f65941c.getValue()).booleanValue()) {
            xk2.k kVar = vb0.f.f125456e;
            if (vb0.e.d().b()) {
                kk2.m k13 = new kk2.m(new kk2.k(new le.t(mainActivity, i13), 1), new j(i14, new m(mainActivity, i13)), 0).k(new j(i13, t.f73480j));
                uj2.a0 a0Var = tk2.e.f118017c;
                kk2.t r13 = k13.r(a0Var);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                ck2.i.b(timeUnit, "unit is null");
                xj2.c o13 = new kk2.e(r13, 4L, timeUnit, a0Var).o(new mc.h(2, new m(mainActivity, 2)), new mc.h(3, t.f73481k));
                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                mainActivity.addDisposable(o13);
            }
        }
        if (mainActivity.f35169J.getAndSet(false)) {
            lh0.b x13 = mainActivity.x();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) x13.f83299a;
            if (g1Var.o("android_network_default_retry_off", "enabled", z3Var) || g1Var.l("android_network_default_retry_off")) {
                ((rz.c) ((bf2.b) mainActivity.L()).get()).d();
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.q event) {
        Intrinsics.checkNotNullParameter(event, "event");
        nl1.d a13 = a();
        if ((a13 != null ? a13.getContext() : null) != null) {
            MainActivity mainActivity = this.f73465a;
            wk2.a aVar = mainActivity.C;
            if (aVar != null) {
                cb2.x xVar = (cb2.x) aVar.get();
                xVar.n(a13);
                ContextMenuView contextMenuView = mainActivity.f35183k;
                if (contextMenuView != null) {
                    d0 pinalytics = a13.s7();
                    Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                    contextMenuView.f52620r = pinalytics;
                    int i13 = event.f84716g;
                    if (i13 > -1) {
                        ContextMenuView contextMenuView2 = mainActivity.f35183k;
                        if (contextMenuView2 != null) {
                            cb2.f fVar = contextMenuView2.f52607e;
                            fVar.f27309a.setColor(bs1.c.B(fVar, i13));
                        } else {
                            Intrinsics.r("contextMenu");
                            throw null;
                        }
                    }
                    vn1.c cVar = vn1.c.DEFAULT;
                    vn1.c color = event.f84717h;
                    if (color != cVar) {
                        ContextMenuView contextMenuView3 = mainActivity.f35183k;
                        if (contextMenuView3 != null) {
                            Intrinsics.f(color);
                            Intrinsics.checkNotNullParameter(color, "color");
                            contextMenuView3.f52606d.i(new sp.a(29, color));
                        } else {
                            Intrinsics.r("contextMenu");
                            throw null;
                        }
                    }
                    ContextMenuView contextMenuView4 = mainActivity.f35183k;
                    if (contextMenuView4 == null) {
                        Intrinsics.r("contextMenu");
                        throw null;
                    }
                    xVar.o(contextMenuView4, event, mainActivity.f35214z0);
                    return;
                }
                Intrinsics.r("contextMenu");
                throw null;
            }
            Intrinsics.r("pinContextMenuProvider");
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.r event) {
        Intrinsics.checkNotNullParameter(event, "event");
        nl1.d a13 = a();
        if ((a13 != null ? a13.getContext() : null) != null) {
            MainActivity mainActivity = this.f73465a;
            wk2.a aVar = mainActivity.C;
            if (aVar != null) {
                cb2.x xVar = (cb2.x) aVar.get();
                xVar.n(a13);
                ContextMenuView contextMenuView = mainActivity.f35183k;
                if (contextMenuView != null) {
                    d0 pinalytics = a13.s7();
                    Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                    contextMenuView.f52620r = pinalytics;
                    xVar.p(event);
                    return;
                }
                Intrinsics.r("contextMenu");
                throw null;
            }
            Intrinsics.r("pinContextMenuProvider");
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull m10.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        MainActivity mainActivity = this.f73465a;
        wk2.a aVar = mainActivity.f35170a0;
        if (aVar != null) {
            cb2.c cVar = (cb2.c) aVar.get();
            ContextMenuView contextMenuView = mainActivity.f35183k;
            if (contextMenuView != null) {
                cVar.d(contextMenuView, event, mainActivity.f35214z0);
                return;
            } else {
                Intrinsics.r("contextMenu");
                throw null;
            }
        }
        Intrinsics.r("boardContextMenuProvider");
        throw null;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull m10.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        MainActivity mainActivity = this.f73465a;
        f4 f4Var = mainActivity.f35182j0;
        if (f4Var != null) {
            d0 pinalytics = mainActivity.getPinalytics();
            m60.w eventManager = mainActivity.getEventManager();
            o0 experiments = s8.f(f4Var.f113414a.f114091b);
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            Intrinsics.checkNotNullParameter(experiments, "experiments");
            kv0.p pVar = new kv0.p();
            pVar.f80994a = pinalytics;
            pVar.f80995b = eventManager;
            pVar.f80996c = experiments;
            ContextMenuView contextMenuView = mainActivity.f35183k;
            if (contextMenuView != null) {
                pVar.k(contextMenuView, event, mainActivity.f35214z0);
                return;
            } else {
                Intrinsics.r("contextMenu");
                throw null;
            }
        }
        Intrinsics.r("boardSectionContextMenuFactory");
        throw null;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull nq0.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        MainActivity mainActivity = this.f73465a;
        if (mainActivity.f35203u == null) {
            ViewStub viewStub = mainActivity.f35189n;
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.feature.conversationmessage.reactions.view.ConversationMessageReactionsContextMenuView");
                mainActivity.f35203u = (ConversationMessageReactionsContextMenuView) inflate;
            } else {
                Intrinsics.r("converastionMessageReactionsContextMenuViewStub");
                throw null;
            }
        }
        ConversationMessageReactionsContextMenuView conversationMessageReactionsContextMenuView = mainActivity.f35203u;
        if (conversationMessageReactionsContextMenuView != null) {
            conversationMessageReactionsContextMenuView.post(new dp.a(7, mainActivity, event));
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull k0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        MainActivity mainActivity = this.f73465a;
        if (mainActivity.f35201t == null) {
            ViewStub viewStub = mainActivity.f35187m;
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.feature.comment.reactions.view.CommentReactionsContextMenuView");
                mainActivity.f35201t = (CommentReactionsContextMenuView) inflate;
            } else {
                Intrinsics.r("commentReactionsContextMenuViewStub");
                throw null;
            }
        }
        CommentReactionsContextMenuView commentReactionsContextMenuView = mainActivity.f35201t;
        if (commentReactionsContextMenuView != null) {
            commentReactionsContextMenuView.post(new dp.a(8, mainActivity, event));
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull l0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        MainActivity mainActivity = this.f73465a;
        if (mainActivity.f35201t == null) {
            ViewStub viewStub = mainActivity.f35187m;
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.feature.comment.reactions.view.CommentReactionsContextMenuView");
                mainActivity.f35201t = (CommentReactionsContextMenuView) inflate;
            } else {
                Intrinsics.r("commentReactionsContextMenuViewStub");
                throw null;
            }
        }
        CommentReactionsContextMenuView commentReactionsContextMenuView = mainActivity.f35201t;
        if (commentReactionsContextMenuView != null) {
            commentReactionsContextMenuView.post(new dp.a(9, mainActivity, event));
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pu1.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        bk.f fVar = MainActivity.N0;
        pd.s sVar = this.f73465a.f130612c;
        if (sVar != null) {
            Intrinsics.checkNotNullParameter(null, "badgeDisplay");
            if (((r70.a) sVar.f99747a).getView().isAttachedToWindow() && ((ViewGroup) sVar.f99749c).isAttachedToWindow()) {
                r70.b bVar = (r70.b) sVar.f99748b;
                bVar.f106352b = true;
                bVar.f106353c = true;
                ((r70.a) sVar.f99747a).c(false);
                throw null;
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pu1.b badgeTransitionDisplay) {
        Intrinsics.checkNotNullParameter(badgeTransitionDisplay, "event");
        bk.f fVar = MainActivity.N0;
        pd.s sVar = this.f73465a.f130612c;
        if (sVar != null) {
            Intrinsics.checkNotNullParameter(badgeTransitionDisplay, "badgeTransitionDisplay");
            if (!((r70.a) sVar.f99747a).getView().isAttachedToWindow()) {
                throw null;
            }
            if (((ViewGroup) sVar.f99749c).isAttachedToWindow()) {
                throw null;
            }
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull r70.h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        bk.f fVar = MainActivity.N0;
        r70.a aVar = this.f73465a.f130611b;
        if (aVar != null) {
            aVar.g(event.f106378a, event.f106379b);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull r70.j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        bk.f fVar = MainActivity.N0;
        r70.a aVar = this.f73465a.f130611b;
        if (aVar != null) {
            aVar.l(event.f106393a, event.f106394b, event.f106395c, true);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull r70.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        bk.f fVar = MainActivity.N0;
        r70.a aVar = this.f73465a.f130611b;
        LinearLayout view = aVar != null ? aVar.getView() : null;
        if (view == null) {
            return;
        }
        view.setTranslationY(0.0f);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull n0 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (org.chromium.net.y.T()) {
            return;
        }
        MainActivity mainActivity = this.f73465a;
        AlertContainer alertContainer = mainActivity.f35181j;
        if (alertContainer != null) {
            lu1.b bVar = mainActivity.P;
            if (bVar != null) {
                new zo1.b(alertContainer, bVar).a(e13.f108075a);
                return;
            } else {
                Intrinsics.r("baseActivityHelper");
                throw null;
            }
        }
        Intrinsics.r("alertContainer");
        throw null;
    }
}
