package we1;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.zv0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.style.spotlight.view.SearchTypeaheadTodayArticleCell;
import com.pinterest.feature.style.spotlight.view.SpotlightBoardBaseView;
import com.pinterest.feature.todaytab.tab.view.TodayTabHeroModule;
import com.pinterest.feature.todaytab.tab.view.TodayTabSingleCreatorModule;
import com.pinterest.feature.todaytab.tab.view.TodayTabSingleVideoModule;
import com.pinterest.feature.todaytab.tab.view.TodayTabThreePinsCollectionModule;
import com.pinterest.feature.videocarousel.view.VideoCarouselActionCellView;
import com.pinterest.following.view.lego.InterestFollowButton;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.avatargroup.legacy.AvatarGroup;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.radioGroup.GestaltRadio;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.u4;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes5.dex */
public final /* synthetic */ class a2 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f129279b;

    public /* synthetic */ a2(Object obj, int i13) {
        this.f129278a = i13;
        this.f129279b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.pinterest.navigation.NavigationImpl] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sf1.j1 j1Var;
        String R;
        String uid;
        String q13;
        List I;
        f30 f30Var;
        zv0 zv0Var;
        zv0 zv0Var2;
        String R2;
        ih ihVar;
        String uri;
        int i13 = this.f129278a;
        Object obj = this.f129279b;
        switch (i13) {
            case 0:
                re1.x this_with = (re1.x) obj;
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                this_with.f107684a.f107576d.invoke();
                return;
            case 1:
                ue1.h model = (ue1.h) obj;
                Intrinsics.checkNotNullParameter(model, "$model");
                model.f122006b.c();
                return;
            case 2:
                ye1.l this$0 = (ye1.l) obj;
                int i14 = ye1.l.f138868k;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ye1.p pVar = this$0.f138874f;
                if (pVar != null) {
                    ((ye1.u) pVar).r3();
                    return;
                }
                return;
            case 3:
                ye1.s this$02 = (ye1.s) obj;
                int i15 = ye1.s.f138886i;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ye1.p pVar2 = this$02.f138888e;
                if (pVar2 != null) {
                    ((ye1.u) pVar2).r3();
                    return;
                }
                return;
            case 4:
                ye1.v this$03 = (ye1.v) obj;
                int i16 = ye1.v.f138897f;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                ye1.p pVar3 = this$03.f138901d;
                if (pVar3 != null) {
                    ((ye1.u) pVar3).r3();
                    return;
                }
                return;
            case 5:
                cf1.a this$04 = (cf1.a) obj;
                int i17 = cf1.a.f27641w;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                View.OnClickListener onClickListener = this$04.f27643v;
                if (onClickListener != null) {
                    onClickListener.onClick(this$04.f27642u);
                    return;
                }
                return;
            case 6:
                sf1.h0 this$05 = (sf1.h0) obj;
                int i18 = sf1.h0.C;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                sf1.e1 e1Var = (sf1.e1) this$05.f112582g;
                sf1.h0 h0Var = e1Var.f112559r;
                Context context = h0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (df.j1.l(context)) {
                    h0Var.A.cancel();
                } else {
                    h0Var.getHandler().removeCallbacksAndMessages(null);
                }
                h0Var.g0();
                sf1.e1 e1Var2 = (sf1.e1) h0Var.f112582g;
                int i19 = e1Var2.f112558q.f19924d;
                sf1.j1 j1Var2 = e1Var2.G;
                boolean x43 = j1Var2 != null ? ((rf1.p0) j1Var2).x4(i19) : false;
                boolean T = h0Var.T();
                boolean z13 = !T;
                h0Var.k0(z13);
                sf1.c cVar = sf1.c.f112526s;
                sf1.c cVar2 = sf1.c.f112527t;
                GestaltIcon gestaltIcon = h0Var.f112588m;
                if (x43) {
                    sf1.s C = e1Var2.F.C(i19);
                    if (C != null) {
                        if (T) {
                            C.D();
                            gestaltIcon.g2(cVar);
                        } else {
                            PinterestVideoView o13 = C.o();
                            if (o13 != null) {
                                oc2.i.a(o13);
                            }
                            gestaltIcon.g2(cVar2);
                        }
                    }
                } else if (T) {
                    h0Var.Z();
                    gestaltIcon.g2(cVar);
                } else {
                    h0Var.X();
                    gestaltIcon.g2(cVar2);
                }
                e1Var2.r0(!T ? h32.f1.STORY_PIN_PAUSE : h32.f1.STORY_PIN_RESUME);
                if (!z13) {
                    h0Var.L(Long.valueOf(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS));
                }
                h0Var.T();
                if (e1Var.O || (j1Var = e1Var.G) == null) {
                    return;
                }
                sf1.j1.L0(j1Var, h32.f1.TAP, h32.u0.STORY_PIN_PAUSE_BUTTON, null, 12);
                return;
            case 7:
                SearchTypeaheadTodayArticleCell this$06 = (SearchTypeaheadTodayArticleCell) obj;
                int i23 = SearchTypeaheadTodayArticleCell.f48579e;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                ug1.a aVar = this$06.f48580a;
                if (aVar != null) {
                    ug1.b bVar = aVar.f122145a;
                    nx.d0 d0Var = bVar.getPresenterPinalytics().f122379a;
                    Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                    h32.g0 g0Var = h32.g0.DYNAMIC_GRID_STORY;
                    HashMap hashMap = new HashMap();
                    vh vhVar = bVar.f122151c;
                    if (vhVar != null && (q13 = vhVar.q()) != null) {
                    }
                    vh vhVar2 = bVar.f122151c;
                    if (vhVar2 != null && (uid = vhVar2.getUid()) != null) {
                    }
                    hashMap.put("story_index", String.valueOf(aVar.f122147c));
                    hashMap.put("rs", "autocomplete");
                    Unit unit = Unit.f80348a;
                    nx.d0.B(d0Var, null, g0Var, null, hashMap, 21);
                    zv0 zv0Var3 = aVar.f122146b;
                    if (zv0Var3.S() && (R = zv0Var3.R()) != null && (!kotlin.text.z.j(R))) {
                        nu1.a.c(bVar.f122149a, zv0Var3.R(), null, null, false, 30);
                        return;
                    } else {
                        bVar.f122150b.d(c0.d.X(zv0Var3, null));
                        return;
                    }
                }
                return;
            case 8:
                ug1.e listener = (ug1.e) obj;
                int i24 = SpotlightBoardBaseView.f48586h;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                listener.getClass();
                nx.d0.B(listener.f122162b, h32.f1.TAP, h32.g0.DYNAMIC_GRID_STORY, null, listener.p3(), 20);
                g70.h.f(listener.f122163c, listener.f122161a, null, 6);
                return;
            case 9:
                wg1.b0 this$07 = (wg1.b0) obj;
                int i25 = wg1.b0.f129722s;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                ug1.m mVar = this$07.f129731r;
                if (mVar != null) {
                    mVar.f122223a.f122379a.h(h32.g0.TODAY_ARTICLE, null, mVar.f122229g);
                    if (mVar.f122225c == null || (zv0Var = mVar.f122230h) == null || !zv0Var.S() || (zv0Var2 = mVar.f122230h) == null || (R2 = zv0Var2.R()) == null || !(!kotlin.text.z.j(R2))) {
                        ?? X = c0.d.X(mVar.f122230h, null);
                        if (X != 0) {
                            X.z(c42.f.SEARCH_LANDING_PAGE.getValue(), "com.pinterest.EXTRA_TODAY_ARTICLE_REFERRER");
                            r8 = X;
                        }
                        mVar.f122224b.d(r8);
                    } else {
                        zv0 zv0Var4 = mVar.f122230h;
                        nu1.a.c(mVar.f122225c, zv0Var4 != null ? zv0Var4.R() : null, null, null, false, 30);
                    }
                    zv0 zv0Var5 = mVar.f122230h;
                    if (zv0Var5 != null) {
                        if (zv0Var5.L().intValue() == c42.c.IDEA_STREAM.getValue()) {
                            zv0 zv0Var6 = mVar.f122230h;
                            if (zv0Var6 == null || (I = zv0Var6.I()) == null || (f30Var = (f30) CollectionsKt.firstOrNull(I)) == null) {
                                vb0.j.f125466a.G("Failed to get today article cover Pin ID for Idea Stream, needed for Static Grid to Story Pin PWT", new Object[0]);
                                return;
                            }
                            String uid2 = f30Var.getUid();
                            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                            boolean R0 = b40.R0(f30Var);
                            dl0 v63 = f30Var.v6();
                            if (v63 != null) {
                                v63.r();
                            }
                            new oy.i0(uid2, null, R0, d4.FEED, a4.SEARCH_TAB, 22).i();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                f30 videoPin = (f30) obj;
                int i26 = com.pinterest.feature.todaytab.articlefeed.o.f48637m;
                Intrinsics.checkNotNullParameter(videoPin, "$videoPin");
                m60.u.f85943a.d(Navigation.z0((ScreenLocation) u4.f51436b.getValue(), videoPin.getUid()));
                return;
            case 11:
                zg1.c this$08 = (zg1.c) obj;
                int i27 = zg1.c.f141957d;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                f30 f30Var2 = this$08.f141958a;
                if (f30Var2 != null) {
                    m60.u.f85943a.d(Navigation.z0((ScreenLocation) u4.f51436b.getValue(), f30Var2.getUid()));
                    return;
                }
                return;
            case 12:
                TodayTabHeroModule this$09 = (TodayTabHeroModule) obj;
                int i28 = TodayTabHeroModule.f48653f;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                dh1.e eVar = this$09.f48658e;
                if (eVar != null) {
                    eVar.t3(null);
                    return;
                }
                return;
            case 13:
                TodayTabSingleCreatorModule this$010 = (TodayTabSingleCreatorModule) obj;
                int i29 = TodayTabSingleCreatorModule.f48659l;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                dh1.e eVar2 = this$010.f48668i;
                if (eVar2 != null) {
                    eVar2.t3(null);
                    return;
                }
                return;
            case 14:
                com.pinterest.feature.todaytab.tab.view.q this$011 = (com.pinterest.feature.todaytab.tab.view.q) obj;
                int i33 = com.pinterest.feature.todaytab.tab.view.q.f48740i;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                dh1.e eVar3 = this$011.f48748h;
                if (eVar3 != null) {
                    eVar3.t3(null);
                    return;
                }
                return;
            case 15:
                TodayTabSingleVideoModule this$012 = (TodayTabSingleVideoModule) obj;
                int i34 = TodayTabSingleVideoModule.f48671h;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                dh1.e eVar4 = this$012.f48678g;
                if (eVar4 != null) {
                    eVar4.t3(null);
                    return;
                }
                return;
            case 16:
                TodayTabThreePinsCollectionModule this$013 = (TodayTabThreePinsCollectionModule) obj;
                int i35 = TodayTabThreePinsCollectionModule.f48679g;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                dh1.e eVar5 = this$013.f48685f;
                if (eVar5 != null) {
                    eVar5.t3(null);
                    return;
                }
                return;
            case 17:
                gh1.b this$014 = (gh1.b) obj;
                int i36 = gh1.b.f64999r;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                fh1.a aVar2 = this$014.f65013n;
                if (aVar2 != null) {
                    vh story = aVar2.f62168c;
                    Integer num = aVar2.f62167b;
                    gh1.b bVar2 = (gh1.b) ((eh1.a) aVar2.getView());
                    Iterator it = bVar2.f65016q.iterator();
                    while (it.hasNext()) {
                        ((WebImageView) it.next()).clearAnimation();
                    }
                    bVar2.f65012m = false;
                    rg0.n nVar = aVar2.f62166a;
                    if (nVar != null) {
                        nVar.a(null, null);
                    }
                    if (story != null && num != null) {
                        eh1.a aVar3 = (eh1.a) aVar2.getView();
                        int intValue = num.intValue();
                        gh1.b bVar3 = (gh1.b) aVar3;
                        bVar3.getClass();
                        Intrinsics.checkNotNullParameter(story, "story");
                        m60.w wVar = bVar3.f65002c;
                        if (wVar == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        wVar.f(new pg0.g0(intValue));
                    }
                    if (story != null && (ihVar = story.f42857o) != null && (uri = ihVar.e()) != null) {
                        gh1.b bVar4 = (gh1.b) ((eh1.a) aVar2.getView());
                        bVar4.getClass();
                        Intrinsics.checkNotNullParameter(uri, "uri");
                        if (Intrinsics.d(uri, "pinterest://today")) {
                            Context context2 = bVar4.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            Activity k03 = bs1.c.k0(context2);
                            nl1.d f52740f = k03 instanceof MainActivity ? ((MainActivity) k03).getF52740f() : null;
                            if (f52740f != null && f52740f.H7()) {
                                m60.w wVar2 = bVar4.f65002c;
                                if (wVar2 == null) {
                                    Intrinsics.r("eventManager");
                                    throw null;
                                }
                                wVar2.d(new g4.u());
                            }
                        }
                        ku1.l lVar = bVar4.f65003d;
                        if (lVar == null) {
                            Intrinsics.r("uriNavigator");
                            throw null;
                        }
                        Context context3 = bVar4.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        ku1.l.b(lVar, context3, uri, false, false, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
                    }
                    nx.d0 pinalytics = aVar2.getPinalytics();
                    h32.g0 g0Var2 = h32.g0.DYNAMIC_GRID_STORY;
                    h32.u0 u0Var = h32.u0.TODAY_TAB_ENTRY;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("grid_index", String.valueOf(num));
                    pinalytics.h(g0Var2, u0Var, hashMap2);
                    return;
                }
                return;
            case 18:
                rh1.s0 this$015 = (rh1.s0) obj;
                int i37 = rh1.s0.f108287t1;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                this$015.P7();
                return;
            case 19:
                VideoCarouselActionCellView this$016 = (VideoCarouselActionCellView) obj;
                int i38 = VideoCarouselActionCellView.f49046g;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                ii1.a aVar4 = this$016.f49048e;
                if (aVar4 != null) {
                    ih ihVar2 = aVar4.f72302c;
                    if (ihVar2 != null) {
                        nx.d0 d0Var2 = aVar4.f72300a.f122379a;
                        Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
                        d0Var2.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.STORY_END_CELL, (r18 & 4) != 0 ? null : h32.g0.DYNAMIC_GRID_STORY, (r18 & 8) != 0 ? null : ihVar2.getUid(), (r18 & 32) != 0 ? null : aVar4.f72301b, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    }
                    ih ihVar3 = aVar4.f72302c;
                    if (ihVar3 != null) {
                        hi1.a aVar5 = (hi1.a) aVar4.getView();
                        String location = ihVar3.e();
                        Intrinsics.checkNotNullExpressionValue(location, "getActionDeepLink(...)");
                        VideoCarouselActionCellView videoCarouselActionCellView = (VideoCarouselActionCellView) aVar5;
                        videoCarouselActionCellView.getClass();
                        Intrinsics.checkNotNullParameter(location, "location");
                        ku1.l lVar2 = videoCarouselActionCellView.f49049f;
                        if (lVar2 == null) {
                            Intrinsics.r("uriNavigator");
                            throw null;
                        }
                        Context context4 = videoCarouselActionCellView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        ku1.l.b(lVar2, context4, location, false, false, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                li1.j this$017 = (li1.j) obj;
                int i39 = li1.j.f83556e;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                u50.r rVar = this$017.f83557a;
                if (rVar != null) {
                    rVar.a(li1.b.f83540a);
                    return;
                }
                return;
            case 21:
                InterestFollowButton this$018 = (InterestFollowButton) obj;
                int i43 = InterestFollowButton.f49066i;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                nk1.f fVar = this$018.f49064f;
                if (fVar != null) {
                    fVar.f();
                    return;
                }
                return;
            case 22:
                tl1.n viewModel = (tl1.n) obj;
                int i44 = AvatarGroup.f49259w;
                Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
                viewModel.f118111f.invoke();
                return;
            case 23:
                tl1.m viewModel2 = (tl1.m) obj;
                int i45 = AvatarGroup.f49259w;
                Intrinsics.checkNotNullParameter(viewModel2, "$viewModel");
                viewModel2.f118105g.invoke();
                return;
            case 24:
                GestaltRadio this$019 = (GestaltRadio) obj;
                fm1.c cVar3 = GestaltRadio.f49479f;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                this$019.f49480e.s(new an1.j(this$019.getId(), this$019.isChecked()));
                return;
            case 25:
                androidx.appcompat.widget.c2 overflowMenu = (androidx.appcompat.widget.c2) obj;
                int i46 = GestaltToolbarImpl.f49700u;
                Intrinsics.checkNotNullParameter(overflowMenu, "$overflowMenu");
                n.y yVar = (n.y) overflowMenu.f16534e;
                if (yVar.b()) {
                    return;
                }
                if (yVar.f88718f == null) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                yVar.d(0, 0, false, false);
                return;
            case 26:
                GestaltToolbarImpl this$020 = (GestaltToolbarImpl) obj;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                View.OnClickListener onClickListener2 = this$020.f49713m;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                    return;
                }
                return;
            case 27:
                jq1.c this$021 = (jq1.c) obj;
                int i47 = jq1.c.f77464q0;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                this$021.P7();
                return;
            case 28:
                nq1.e this$022 = (nq1.e) obj;
                int i48 = nq1.e.f91820u0;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                this$022.c8();
                return;
            default:
                com.pinterest.identity.account.h this$023 = (com.pinterest.identity.account.h) obj;
                int i49 = com.pinterest.identity.account.h.H0;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                this$023.s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.CANCEL_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                this$023.P7();
                return;
        }
    }
}
