package w01;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.feature.pin.closeup.view.PinCloseupFloatingActionBarModule;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import df.j1;
import h32.u0;
import i32.y0;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import oq.x0;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import v.c2;

/* loaded from: classes5.dex */
public final class p implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinCloseupPresenter f127095a;

    public p(PinCloseupPresenter pinCloseupPresenter) {
        this.f127095a = pinCloseupPresenter;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull com.pinterest.feature.pin.closeup.datasource.m event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        String str2 = event.f46952a;
        PinCloseupPresenter pinCloseupPresenter = this.f127095a;
        str = pinCloseupPresenter.pinUid;
        if (Intrinsics.d(str2, str)) {
            pinCloseupPresenter.prefetchBoardPickerSuggestions();
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull f81.a closeupDotTapEvent) {
        Intrinsics.checkNotNullParameter(closeupDotTapEvent, "closeupDotTapEvent");
        this.f127095a.handleCloseupDotTapEvent(closeupDotTapEvent);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull h81.e event) {
        Intrinsics.checkNotNullParameter(event, "event");
        PinCloseupPresenter pinCloseupPresenter = this.f127095a;
        if (pinCloseupPresenter.isBound()) {
            PinCloseupPresenter.access$getView(pinCloseupPresenter);
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull hx.a categoryTapEvent) {
        Intrinsics.checkNotNullParameter(categoryTapEvent, "categoryTapEvent");
        this.f127095a.handleCategoryTapEvent(categoryTapEvent);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jo1.d event) {
        String str;
        rg0.s sVar;
        f30 f30Var;
        Intrinsics.checkNotNullParameter(event, "event");
        String str2 = event.f77215a;
        PinCloseupPresenter pinCloseupPresenter = this.f127095a;
        str = pinCloseupPresenter.pinUid;
        if (!Intrinsics.d(str2, str) || event.f77216b) {
            return;
        }
        sVar = pinCloseupPresenter.experiences;
        y0 y0Var = y0.ANDROID_PIN_CLOSEUP_AFTER_DOWNLOAD;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair(rg0.o.CONTEXT_PIN_ID, event.f77215a);
        rg0.o oVar = rg0.o.IS_PROMOTED;
        f30Var = pinCloseupPresenter.pin;
        pairArr[1] = new Pair(oVar, String.valueOf(com.bumptech.glide.d.o0(f30Var != null ? f30Var.d5() : null)));
        Map g13 = z0.g(pairArr);
        o oVar2 = new o(pinCloseupPresenter, 3);
        i01.t access$getView = PinCloseupPresenter.access$getView(pinCloseupPresenter);
        Intrinsics.checkNotNullExpressionValue(access$getView, "access$getView(...)");
        kh2.d.X0(sVar, y0Var, oVar2, new o(access$getView, 4), g13, 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        r7 = r0.pin;
     */
    @sp2.k(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull lq.a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter r0 = r6.f127095a
            com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$subscribeToSaveStatusChange(r0)
            java.lang.String r7 = r7.f84244a
            java.lang.String r1 = com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$getPinUid$p(r0)
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r1)
            if (r7 == 0) goto Ld5
            com.pinterest.api.model.f30 r7 = com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$getPin$p(r0)
            if (r7 == 0) goto Ld5
            com.pinterest.api.model.f30 r7 = com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$getPin$p(r0)
            if (r7 == 0) goto Ld5
            b60.b r1 = com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$getActiveUserManager$p(r0)
            b60.d r1 = (b60.d) r1
            com.pinterest.api.model.wy0 r1 = r1.f()
            if (r1 == 0) goto L33
            java.lang.String r1 = r1.getUid()
            goto L34
        L33:
            r1 = 0
        L34:
            boolean r7 = rl2.g0.V(r7, r1)
            if (r7 != 0) goto Ld5
            zf0.f r7 = com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$getEducationHelper$p(r0)
            r7.getClass()
            i32.y0 r7 = i32.y0.ANDROID_REPIN_DIALOG_TAKEOVER
            i32.l r1 = i32.l.ANDROID_FIRST_BOARD_CREATE
            boolean r7 = df.j1.D0(r7, r1)
            rg0.s r1 = rg0.y.a()
            i32.y0 r2 = i32.y0.ANDROID_QUICKSAVE
            dh0.d r1 = (dh0.d) r1
            rg0.n r1 = r1.c(r2)
            zf0.f r3 = com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$getEducationHelper$p(r0)
            r3.getClass()
            i32.l r3 = i32.l.ANDROID_QUICKSAVE
            boolean r2 = df.j1.D0(r2, r3)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L6a
            if (r1 == 0) goto L6a
            r2 = r3
            goto L6b
        L6a:
            r2 = r4
        L6b:
            if (r2 == 0) goto L70
            com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$quicksave(r0, r1)
        L70:
            boolean r1 = r0.isBound()
            if (r1 != 0) goto L77
            return
        L77:
            i01.t r1 = com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$getView(r0)
            com.pinterest.feature.pin.closeup.view.PinCloseupFragment r1 = (com.pinterest.feature.pin.closeup.view.PinCloseupFragment) r1
            android.content.Context r5 = r1.getContext()
            if (r5 == 0) goto L8a
            az0.b r1 = r1.L2
            if (r1 == 0) goto L8a
            r1.a(r5)
        L8a:
            if (r2 == 0) goto Lb3
            i01.t r7 = com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$getView(r0)
            com.pinterest.feature.pin.closeup.view.PinCloseupFragment r7 = (com.pinterest.feature.pin.closeup.view.PinCloseupFragment) r7
            r7.G9()
            i01.t r7 = com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$getView(r0)
            com.pinterest.feature.pin.closeup.view.PinCloseupFragment r7 = (com.pinterest.feature.pin.closeup.view.PinCloseupFragment) r7
            android.media.MediaPlayer r0 = r7.Y1
            if (r0 != 0) goto Lab
            android.content.Context r0 = r7.getContext()
            int r1 = xb2.c.success_2
            android.media.MediaPlayer r0 = android.media.MediaPlayer.create(r0, r1)
            r7.Y1 = r0
        Lab:
            android.media.MediaPlayer r7 = r7.Y1
            if (r7 == 0) goto Ld5
            r7.start()
            goto Ld5
        Lb3:
            w01.n r1 = new w01.n
            r1.<init>(r0, r7, r4)
            fk2.g r7 = new fk2.g
            r7.<init>(r1, r3)
            uj2.a0 r0 = tk2.e.f118017c
            fk2.c r7 = r7.l(r0)
            i01.r0 r0 = new i01.r0
            r1 = 2
            r0.<init>(r1)
            w01.b r1 = w01.b.f126961m
            w01.h r2 = new w01.h
            r3 = 9
            r2.<init>(r3, r1)
            r7.i(r0, r2)
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w01.p.onEventMainThread(lq.a):void");
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.i event) {
        String str;
        i01.k0 orCreateImpressionsLoggingManager;
        Intrinsics.checkNotNullParameter(event, "event");
        String str2 = event.f84695i;
        PinCloseupPresenter pinCloseupPresenter = this.f127095a;
        str = pinCloseupPresenter.pinUid;
        if (Intrinsics.d(str2, str)) {
            orCreateImpressionsLoggingManager = pinCloseupPresenter.getOrCreateImpressionsLoggingManager();
            if (orCreateImpressionsLoggingManager.f70677n) {
                return;
            }
            orCreateImpressionsLoggingManager.f70677n = true;
            if (orCreateImpressionsLoggingManager.f70676m == null) {
                orCreateImpressionsLoggingManager.g();
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull nd1.a event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        String str2 = event.f90423a;
        PinCloseupPresenter pinCloseupPresenter = this.f127095a;
        str = pinCloseupPresenter.pinUid;
        if (Intrinsics.d(str2, str)) {
            ((PinCloseupFragment) PinCloseupPresenter.access$getView(pinCloseupPresenter)).z9(y0.ANDROID_PIN_CLOSEUP_AFTER_SHOWING_RELATED_PINS);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull oq.c flashlightSearchButtonEvent) {
        Intrinsics.checkNotNullParameter(flashlightSearchButtonEvent, "flashlightSearchButtonEvent");
        this.f127095a.handleFlashlightSearchButtonEvent(flashlightSearchButtonEvent);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull oq.l linklessImageEvent) {
        Intrinsics.checkNotNullParameter(linklessImageEvent, "linklessImageEvent");
        this.f127095a.handleLinklessImageEvent(linklessImageEvent);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull oq.w vtoButtonEvent) {
        Intrinsics.checkNotNullParameter(vtoButtonEvent, "vtoButtonEvent");
        this.f127095a.handleVirtualTryOnButtonEvent(vtoButtonEvent);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.x event) {
        Intrinsics.checkNotNullParameter(event, "event");
        PinCloseupPresenter pinCloseupPresenter = this.f127095a;
        if (pinCloseupPresenter.isBound()) {
            i01.t access$getView = PinCloseupPresenter.access$getView(pinCloseupPresenter);
            boolean z13 = event.f100090a;
            PinCloseupFloatingActionBarModule pinCloseupFloatingActionBarModule = ((PinCloseupFragment) access$getView).f47017q2;
            if (pinCloseupFloatingActionBarModule != null) {
                pinCloseupFloatingActionBarModule.requestLayout();
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.c0 event) {
        String str;
        rg0.s sVar;
        String str2;
        f30 f30Var;
        lb0.q qVar;
        Intrinsics.checkNotNullParameter(event, "event");
        String str3 = event.f100056c;
        PinCloseupPresenter pinCloseupPresenter = this.f127095a;
        str = pinCloseupPresenter.pinUid;
        if (Intrinsics.d(str3, str)) {
            sVar = pinCloseupPresenter.experiences;
            y0 y0Var = y0.ANDROID_PIN_CLOSEUP_AFTER_REACT;
            o oVar = new o(pinCloseupPresenter, 5);
            i01.t access$getView = PinCloseupPresenter.access$getView(pinCloseupPresenter);
            Intrinsics.checkNotNullExpressionValue(access$getView, "access$getView(...)");
            o oVar2 = new o(access$getView, 0);
            Pair[] pairArr = new Pair[3];
            rg0.o oVar3 = rg0.o.CONTEXT_PIN_ID;
            str2 = pinCloseupPresenter.pinUid;
            pairArr[0] = new Pair(oVar3, str2);
            rg0.o oVar4 = rg0.o.IS_PROMOTED;
            f30Var = pinCloseupPresenter.pin;
            pairArr[1] = new Pair(oVar4, String.valueOf(com.bumptech.glide.d.o0(f30Var != null ? f30Var.d5() : null)));
            rg0.o oVar5 = rg0.o.SHARE_UPSELL_TIMESTAMP_KEY;
            qVar = pinCloseupPresenter.prefsManagerPersisted;
            pairArr[2] = new Pair(oVar5, String.valueOf(qVar.a("PREF_LAST_SHARING_UPSELL_SHOWN_AT", 0L)));
            kh2.d.X0(sVar, y0Var, oVar, oVar2, z0.g(pairArr), 16);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.d0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f127095a.logClickSatisfactionFeedback(event.f100058a, u0.POSITIVE_FEEDBACK);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.n0 event) {
        yk1.a viewResource;
        String pinId;
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f100082a;
        u0 u0Var = u0.NEGATIVE_FEEDBACK;
        PinCloseupPresenter pinCloseupPresenter = this.f127095a;
        pinCloseupPresenter.logClickSatisfactionFeedback(str, u0Var);
        if (pinCloseupPresenter.isBound()) {
            i01.t access$getView = PinCloseupPresenter.access$getView(pinCloseupPresenter);
            viewResource = pinCloseupPresenter.viewResources;
            pinId = pinCloseupPresenter.pinUid;
            PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) access$getView;
            pinCloseupFragment.getClass();
            Intrinsics.checkNotNullParameter(viewResource, "viewResource");
            Intrinsics.checkNotNullParameter(pinId, "pinId");
            m60.w f73 = pinCloseupFragment.f7();
            se2.a aVar = pinCloseupFragment.Z0;
            if (aVar != null) {
                i92.k kVar = (i92.k) ((bf2.b) aVar).get();
                tp.e eVar = new tp.e(pinCloseupFragment, 1);
                c82.d dVar = pinCloseupFragment.G1;
                if (dVar != null) {
                    nx.f0 f0Var = pinCloseupFragment.Y0;
                    if (f0Var != null) {
                        Intrinsics.f(kVar);
                        f73.d(new jc0.v(new b11.b(pinId, eVar, viewResource, kVar, dVar, f0Var), false, 0L, 30));
                        return;
                    } else {
                        Intrinsics.r("pinalyticsFactory");
                        throw null;
                    }
                }
                Intrinsics.r("siteApi");
                throw null;
            }
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull rg0.i0 event) {
        String str;
        zf0.f fVar;
        rg0.s sVar;
        f30 f30Var;
        Intrinsics.checkNotNullParameter(event, "event");
        String str2 = event.f108030a;
        PinCloseupPresenter pinCloseupPresenter = this.f127095a;
        str = pinCloseupPresenter.pinUid;
        if (Intrinsics.d(str2, str)) {
            fVar = pinCloseupPresenter.educationHelper;
            fVar.getClass();
            y0 y0Var = y0.ANDROID_REPIN_DIALOG_TAKEOVER;
            if (j1.D0(y0Var, i32.l.ANDROID_POST_REPIN_BOARD_UPSELL) || j1.D0(y0Var, i32.l.ANDROID_POST_REPIN_BOARD_UPSELL_POST_CREATE)) {
                return;
            }
            sVar = pinCloseupPresenter.experiences;
            y0 y0Var2 = y0.ANDROID_PIN_CLOSEUP_AFTER_SAVE;
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair(rg0.o.CONTEXT_PIN_ID, event.f108030a);
            rg0.o oVar = rg0.o.IS_PROMOTED;
            f30Var = pinCloseupPresenter.pin;
            pairArr[1] = new Pair(oVar, String.valueOf(com.bumptech.glide.d.o0(f30Var != null ? f30Var.d5() : null)));
            Map g13 = z0.g(pairArr);
            o oVar2 = new o(pinCloseupPresenter, 1);
            i01.t access$getView = PinCloseupPresenter.access$getView(pinCloseupPresenter);
            Intrinsics.checkNotNullExpressionValue(access$getView, "access$getView(...)");
            kh2.d.X0(sVar, y0Var2, oVar2, new o(access$getView, 2), g13, 16);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull rq.w event) {
        Intrinsics.checkNotNullParameter(event, "event");
        i01.t access$getView = PinCloseupPresenter.access$getView(this.f127095a);
        double d2 = event.f109606a;
        PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) access$getView;
        pinCloseupFragment.getClass();
        String label = event.f109607b;
        Intrinsics.checkNotNullParameter(label, "label");
        String requestParams = event.f109610e;
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        pinCloseupFragment.D8();
        pinCloseupFragment.S1.postDelayed(new c2(event.f109608c, pinCloseupFragment, event.f109609d, 5), 100L);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull a event) {
        String str;
        r01.c cVar;
        Intrinsics.checkNotNullParameter(event, "event");
        String str2 = event.f126953a;
        PinCloseupPresenter pinCloseupPresenter = this.f127095a;
        str = pinCloseupPresenter.pinUid;
        if (Intrinsics.d(str2, str)) {
            i01.t view = PinCloseupPresenter.access$getViewIfBound(pinCloseupPresenter);
            if (view != null) {
                cVar = pinCloseupPresenter.pinCloseupLoadingIndicatorManager;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                cVar.f105710g = i01.g.COMPLETE;
                cVar.e(view);
            }
            vh story = event.f126954b;
            if (story == null || !story.C()) {
                return;
            }
            PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) PinCloseupPresenter.access$getView(pinCloseupPresenter);
            pinCloseupFragment.getClass();
            Intrinsics.checkNotNullParameter(story, "story");
            x0 x0Var = pinCloseupFragment.f46991g2;
            if (x0Var != null) {
                x0Var.T0(story);
                return;
            }
            tq.y yVar = pinCloseupFragment.f46994h2;
            if (yVar != null) {
                yVar.o(story);
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull zf0.e event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        f30 f30Var = event.f141902a;
        String uid = f30Var != null ? f30Var.getUid() : null;
        PinCloseupPresenter pinCloseupPresenter = this.f127095a;
        str = pinCloseupPresenter.pinUid;
        if (Intrinsics.d(uid, str)) {
            ((PinCloseupFragment) PinCloseupPresenter.access$getView(pinCloseupPresenter)).z9(y0.ANDROID_PIN_CLOSEUP_TAKEOVER);
        }
    }
}
