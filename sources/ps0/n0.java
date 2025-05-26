package ps0;

import android.view.View;
import android.view.ViewStub;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import df.j1;
import h32.f1;
import i32.y0;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import jk2.l1;
import kotlin.jvm.internal.Intrinsics;
import m60.u0;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import x02.a2;

/* loaded from: classes.dex */
public final class n0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f101286a;

    public n0(r0 r0Var) {
        this.f101286a = r0Var;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull iq.a nuxCompletedEvent) {
        Intrinsics.checkNotNullParameter(nuxCompletedEvent, "nuxCompletedEvent");
        r0 r0Var = this.f101286a;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(nuxCompletedEvent, "nuxCompletedEvent");
        r0Var.Q3(nuxCompletedEvent);
        r0Var.S = true;
        r0Var.T = nuxCompletedEvent.f73385a;
        r0Var.f4(false);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.y takeoverExperienceEvent) {
        e W3;
        Intrinsics.checkNotNullParameter(takeoverExperienceEvent, "nuxExperienceEvent");
        r0 r0Var = this.f101286a;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(takeoverExperienceEvent, "takeoverExperienceEvent");
        r0Var.Q3(takeoverExperienceEvent);
        String placementId = takeoverExperienceEvent.f100091a;
        if (placementId != null) {
            y0 placement = y0.ANDROID_HOME_FEED_TAKEOVER_AFTER_SCROLL;
            r0Var.F.getClass();
            Intrinsics.checkNotNullParameter(placement, "placement");
            Intrinsics.checkNotNullParameter(placementId, "placementId");
            if (j1.d1(placementId) && placement.value() == Integer.parseInt(placementId) && (W3 = r0Var.W3()) != null) {
                HomeFeedFragment homeFeedFragment = (HomeFeedFragment) W3;
                ns0.a aVar = homeFeedFragment.D1;
                if (aVar != null) {
                    homeFeedFragment.A8(aVar);
                }
                ns0.a aVar2 = new ns0.a(homeFeedFragment, new j(homeFeedFragment));
                homeFeedFragment.b8(aVar2);
                homeFeedFragment.D1 = aVar2;
            }
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.e0 refreshEvent) {
        Intrinsics.checkNotNullParameter(refreshEvent, "refreshEvent");
        r0 r0Var = this.f101286a;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(refreshEvent, "refreshEvent");
        r0Var.Q3(refreshEvent);
        r0Var.f4(false);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.m0 homeFeedRefreshUpsellEvent) {
        View view;
        Intrinsics.checkNotNullParameter(homeFeedRefreshUpsellEvent, "showHomeFeedRefreshUpsellEvent");
        r0 r0Var = this.f101286a;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(homeFeedRefreshUpsellEvent, "homeFeedRefreshUpsellEvent");
        r0Var.Q3(homeFeedRefreshUpsellEvent);
        if (r0Var.isBound()) {
            final Long l13 = homeFeedRefreshUpsellEvent.f100081a;
            e W3 = r0Var.W3();
            if (W3 != null) {
                final HomeFeedFragment homeFeedFragment = (HomeFeedFragment) W3;
                if (homeFeedFragment.C1 == null) {
                    View view2 = homeFeedFragment.getView();
                    ViewStub viewStub = view2 != null ? (ViewStub) view2.findViewById(wp1.d.stub_refresh_prompt) : null;
                    if (viewStub != null) {
                        homeFeedFragment.C1 = viewStub.inflate();
                    }
                }
                View view3 = homeFeedFragment.C1;
                if ((view3 == null || !bs1.c.o1(view3)) && (view = homeFeedFragment.C1) != null) {
                    view.setAlpha(0.0f);
                    view.setTranslationY(bs1.c.b0(view, eo1.c.space_600) * (-1.0f));
                    bs1.c.U1(view);
                    view.animate().alpha(1.0f).translationY(0.0f).setDuration(400L).start();
                    final long currentTimeMillis = System.currentTimeMillis();
                    view.setOnClickListener(new View.OnClickListener() { // from class: ps0.l
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i13 = HomeFeedFragment.U1;
                            HomeFeedFragment this$0 = homeFeedFragment;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            c cVar = this$0.f45768x1;
                            if (cVar != null) {
                                r0 r0Var2 = (r0) cVar;
                                e W32 = r0Var2.W3();
                                if (W32 != null) {
                                    ((HomeFeedFragment) W32).o9(u0.anim_speed_fastest);
                                }
                                r0Var2.f4(true);
                                HashMap hashMap = new HashMap();
                                Long l14 = l13;
                                if (l14 != null) {
                                    hashMap.put("hf_time_away_from_tab", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(l14.longValue())));
                                }
                                hashMap.put("hf_refresh_prompt_visible_duration", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis2)));
                                r0Var2.getPinalytics().Z(h32.u0.UPSELL_HOMEFEED_REFRESH_BUTTON, hashMap);
                            }
                        }
                    });
                }
            }
            HashMap hashMap = new HashMap();
            if (l13 != null) {
                hashMap.put("hf_time_away_from_tab", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(l13.longValue())));
            }
            r0Var.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.VIEW, (r18 & 2) != 0 ? null : h32.u0.UPSELL_HOMEFEED_REFRESH_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            l1 A = uj2.q.M(15L, TimeUnit.SECONDS, tk2.e.f118016b).A(wj2.c.a());
            fs0.q qVar = new fs0.q(25, new c0(r0Var, 2));
            a2 a2Var = ck2.i.f27924d;
            xj2.c F = A.F(qVar, a2Var, ck2.i.f27923c, a2Var);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            r0Var.addDisposable(F);
        }
    }
}
