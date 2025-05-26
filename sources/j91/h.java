package j91;

import android.app.Activity;
import android.content.Context;
import com.pinterest.activity.conversation.notifsupsell.view.NotifsOptInUpsellBannerView;
import com.pinterest.feature.sendshare.view.ContactSearchAndSelectModalView;
import h32.f1;
import h32.g0;
import i32.y0;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import pg0.p;
import rg0.s;

/* loaded from: classes5.dex */
public final class h implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContactSearchAndSelectModalView f75123a;

    public h(ContactSearchAndSelectModalView contactSearchAndSelectModalView) {
        this.f75123a = contactSearchAndSelectModalView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        if (r8 == false) goto L31;
     */
    @sp2.k(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull dr.h r13) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j91.h.onEventMainThread(dr.h):void");
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(g91.f fVar) {
        NotifsOptInUpsellBannerView notifsOptInUpsellBannerView;
        ContactSearchAndSelectModalView contactSearchAndSelectModalView = this.f75123a;
        s sVar = contactSearchAndSelectModalView.f48068h;
        if (sVar != null) {
            rg0.n c13 = ((dh0.d) sVar).c(y0.ANDROID_SHARESHEET_SEARCHMODAL_TAKEOVER);
            if (c13 == null || (notifsOptInUpsellBannerView = contactSearchAndSelectModalView.f48081u) == null) {
                return;
            }
            if (c13.f108060b == i32.l.ANDROID_SHARESHEET_MESSAGE_NOTIFS_OPT_IN_BANNER.value()) {
                r20.a aVar = contactSearchAndSelectModalView.f48064d;
                if (aVar != null) {
                    hp.d dVar = new hp.d(c13, contactSearchAndSelectModalView.D, aVar);
                    yk1.j jVar = contactSearchAndSelectModalView.f48069i;
                    if (jVar != null) {
                        jVar.d(notifsOptInUpsellBannerView, dVar);
                        contactSearchAndSelectModalView.f48082v = dVar;
                        if (notifsOptInUpsellBannerView.getVisibility() == 8) {
                            notifsOptInUpsellBannerView.setTranslationY(0.0f);
                            notifsOptInUpsellBannerView.measure(-1, bs1.c.F0(notifsOptInUpsellBannerView));
                            kg.a.d0(notifsOptInUpsellBannerView, "translationY", notifsOptInUpsellBannerView.getTranslationY(), 0.0f, 0.65f, 0.32f).start();
                            pl1.b bVar = new pl1.b(notifsOptInUpsellBannerView, bs1.c.F0(notifsOptInUpsellBannerView), true);
                            bVar.setDuration(200L);
                            bVar.setAnimationListener(new ip.b(notifsOptInUpsellBannerView, 0));
                            notifsOptInUpsellBannerView.startAnimation(bVar);
                            c13.g();
                            f1 f1Var = f1.VIEW;
                            g0 g0Var = g0.INBOX_NOTIFS_OPT_IN_BANNER_VIEW_UPSELL;
                            b60.b bVar2 = contactSearchAndSelectModalView.f48066f;
                            if (bVar2 != null) {
                                contactSearchAndSelectModalView.D.N(f1Var, null, g0Var, dl2.b.g1(((b60.d) bVar2).f()), false);
                                return;
                            } else {
                                Intrinsics.r("activeUserManager");
                                throw null;
                            }
                        }
                        return;
                    }
                    Intrinsics.r("mvpBinder");
                    throw null;
                }
                Intrinsics.r("notificationSettingsService");
                throw null;
            }
            bs1.c.R1(notifsOptInUpsellBannerView, false);
            return;
        }
        Intrinsics.r("experiences");
        throw null;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(p pVar) {
        ContactSearchAndSelectModalView contactSearchAndSelectModalView = this.f75123a;
        q prefsManagerPersisted = contactSearchAndSelectModalView.f48070j;
        if (prefsManagerPersisted != null) {
            Context context = contactSearchAndSelectModalView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Activity k03 = bs1.c.k0(context);
            Intrinsics.g(k03, "null cannot be cast to non-null type com.pinterest.hairball.kit.activity.BaseActivity");
            cp1.p activity = (cp1.p) k03;
            dr.k adapter = contactSearchAndSelectModalView.f48074n;
            if (adapter != null) {
                Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                qy1.d.b(prefsManagerPersisted, activity, "android.permission.READ_CONTACTS", a62.e.contacts_permission_explanation_send, new to0.t(2, activity, adapter));
                return;
            }
            Intrinsics.r("adapter");
            throw null;
        }
        Intrinsics.r("prefsManagerPersisted");
        throw null;
    }
}
