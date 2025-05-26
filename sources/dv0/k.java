package dv0;

import android.content.Context;
import ao2.j0;
import av0.v;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.m40;
import com.pinterest.api.model.qp;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.wn0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.ideaPinCreation.closeup.view.d0;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.d2;
import dl1.t;
import h32.u0;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import jk2.e0;
import k1.b0;
import kh2.p2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.z;
import lb0.r;
import lh0.s1;
import m60.w;
import nx.f0;
import om0.m1;
import sq0.c0;
import u50.k0;
import x02.i2;
import x02.x0;
import x02.z0;

/* loaded from: classes5.dex */
public final class k extends wk1.q implements av0.f, av0.g, av0.h, av0.e, av0.c, av0.i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f56342a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f56343b;

    /* renamed from: c, reason: collision with root package name */
    public final String f56344c;

    /* renamed from: d, reason: collision with root package name */
    public final yk1.a f56345d;

    /* renamed from: e, reason: collision with root package name */
    public final ag1.b f56346e;

    /* renamed from: f, reason: collision with root package name */
    public final w f56347f;

    /* renamed from: g, reason: collision with root package name */
    public final tb0.h f56348g;

    /* renamed from: h, reason: collision with root package name */
    public final t f56349h;

    /* renamed from: i, reason: collision with root package name */
    public final x0 f56350i;

    /* renamed from: j, reason: collision with root package name */
    public final s1 f56351j;

    /* renamed from: k, reason: collision with root package name */
    public final bw0.f f56352k;

    /* renamed from: l, reason: collision with root package name */
    public final qb0.e f56353l;

    /* renamed from: m, reason: collision with root package name */
    public final b60.b f56354m;

    /* renamed from: n, reason: collision with root package name */
    public final e12.d f56355n;

    /* renamed from: o, reason: collision with root package name */
    public final nt0.d f56356o;

    /* renamed from: p, reason: collision with root package name */
    public final ag1.h f56357p;

    /* renamed from: q, reason: collision with root package name */
    public final j0 f56358q;

    /* renamed from: r, reason: collision with root package name */
    public final o00.a f56359r;

    /* renamed from: s, reason: collision with root package name */
    public final r f56360s;

    /* renamed from: t, reason: collision with root package name */
    public ln0 f56361t;

    /* renamed from: u, reason: collision with root package name */
    public final HashSet f56362u;

    /* renamed from: v, reason: collision with root package name */
    public final Calendar f56363v;

    /* renamed from: w, reason: collision with root package name */
    public final bv0.l f56364w;

    /* renamed from: x, reason: collision with root package name */
    public final h f56365x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, du0.b pinalytics, boolean z13, String str, int i13, uj2.q networkStateStream, yk1.a viewResources, ag1.b dataManager, w eventManager, tb0.h crashReporting, t ideaPinLocalDataRepository, x0 boardRepository, z0 boardSectionRepository, i2 pinRepository, f0 pinalyticsFactory, s1 experiments, bw0.f storyPinWorkerUtils, qb0.e networkUtils, fe0.b networkSpeedDataProvider, b60.b activeUserManager, e12.d boardService, nt0.d animatedStickerRepository, ag1.h ideaPinSessionDataManager, j0 applicationScope, o00.a coroutineDispatcherProvider, r prefsManagerUser) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(ideaPinLocalDataRepository, "ideaPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(storyPinWorkerUtils, "storyPinWorkerUtils");
        Intrinsics.checkNotNullParameter(networkUtils, "networkUtils");
        Intrinsics.checkNotNullParameter(networkSpeedDataProvider, "networkSpeedDataProvider");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        Intrinsics.checkNotNullParameter(animatedStickerRepository, "animatedStickerRepository");
        Intrinsics.checkNotNullParameter(ideaPinSessionDataManager, "ideaPinSessionDataManager");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f56342a = context;
        this.f56343b = z13;
        this.f56344c = str;
        this.f56345d = viewResources;
        this.f56346e = dataManager;
        this.f56347f = eventManager;
        this.f56348g = crashReporting;
        this.f56349h = ideaPinLocalDataRepository;
        this.f56350i = boardRepository;
        this.f56351j = experiments;
        this.f56352k = storyPinWorkerUtils;
        this.f56353l = networkUtils;
        this.f56354m = activeUserManager;
        this.f56355n = boardService;
        this.f56356o = animatedStickerRepository;
        this.f56357p = ideaPinSessionDataManager;
        this.f56358q = applicationScope;
        this.f56359r = coroutineDispatcherProvider;
        this.f56360s = prefsManagerUser;
        this.f56362u = new HashSet();
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        Date date2 = new Date(TimeUnit.SECONDS.toMillis(i13));
        calendar.setTime(date2.after(date) ? date2 : date);
        this.f56363v = calendar;
        this.f56364w = new bv0.l(context, dataManager.d(), pinalytics, viewResources, ideaPinLocalDataRepository, ideaPinSessionDataManager, boardRepository, boardSectionRepository, this, experiments, this, this, this, activeUserManager);
        this.f56365x = new h(this);
    }

    public static void H3(k kVar, Function1 function1, i iVar, g gVar, boolean z13, int i13) {
        s sVar = iVar;
        if ((i13 & 2) != 0) {
            sVar = c.f56302p;
        }
        s sVar2 = sVar;
        Function0 function0 = gVar;
        if ((i13 & 4) != 0) {
            function0 = j.f56341i;
        }
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        e0 M = ((dl1.l) kVar.f56349h).M(kVar.f56346e.d());
        hk2.b bVar = new hk2.b(new mu0.a(15, new b0(function1, kVar, z13, sVar2, 7)), new mu0.a(16, new d0(4, function0)), ck2.i.f27923c);
        M.f(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        kVar.addDisposable(bVar);
    }

    public static final void t3(k kVar, ln0 ln0Var, String str, String str2, Integer num) {
        String str3;
        boolean d2;
        kVar.getClass();
        tp pageData = ln0Var.getPageData();
        ag1.b bVar = kVar.f56346e;
        bVar.f15133f = pageData;
        bVar.f(ln0Var.getMetadata());
        List tags = ln0Var.getTags();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : tags) {
            Boolean l13 = ((m40) obj).l();
            Object obj2 = linkedHashMap.get(l13);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(l13, obj2);
            }
            ((List) obj2).add(obj);
        }
        List list = (List) linkedHashMap.get(Boolean.TRUE);
        String Z = list != null ? CollectionsKt.Z(list, ",", null, null, 0, null, c.f56297k, 30) : null;
        Boolean bool = Boolean.FALSE;
        List list2 = (List) linkedHashMap.get(bool);
        String Z2 = list2 != null ? CollectionsKt.Z(list2, ",", null, null, 0, null, c.f56298l, 30) : null;
        List list3 = (List) linkedHashMap.get(bool);
        String Z3 = list3 != null ? CollectionsKt.Z(list3, ",", null, null, 0, null, c.f56299m, 30) : null;
        String pinDescription = ln0Var.getMetadata().getPinDescription();
        String k13 = vd0.c.f125622b.k(ln0Var.getMetadata().getUserMentionTags());
        boolean z13 = !(pinDescription == null || z.j(pinDescription));
        tp page = ln0Var.getPageData();
        if (page != null) {
            Intrinsics.checkNotNullParameter(page, "page");
            if (page.R()) {
                String path = page.getLocalAdjustedImagePath();
                if (path == null) {
                    path = "";
                }
                Intrinsics.checkNotNullParameter(path, "path");
                d2 = z.h(il2.m.h(new File(path)), "_copy_from_source", true);
            } else {
                Intrinsics.checkNotNullParameter(page, "page");
                d2 = Intrinsics.d(page.getContentModified(), bool);
            }
            String valueOf = String.valueOf(d2);
            if (valueOf != null) {
                str3 = valueOf;
                kotlin.jvm.internal.j.z(kVar.f56358q, null, null, new f(kVar, ln0Var, z13, pinDescription, k13, str, str2, num, Z, Z2, Z3, str3, null), 3);
                yk1.n view = kVar.getView();
                Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
                ((ev0.l) ((av0.d) view)).U8(false);
                kVar.f56360s.i("PREF_COMMENT_ENABLED_ON_STORY_PIN_CREATE_DEFAULT", ln0Var.getCommentsEnabled());
            }
        }
        str3 = "";
        kotlin.jvm.internal.j.z(kVar.f56358q, null, null, new f(kVar, ln0Var, z13, pinDescription, k13, str, str2, num, Z, Z2, Z3, str3, null), 3);
        yk1.n view2 = kVar.getView();
        Intrinsics.checkNotNullExpressionValue(view2, "<get-view>(...)");
        ((ev0.l) ((av0.d) view2)).U8(false);
        kVar.f56360s.i("PREF_COMMENT_ENABLED_ON_STORY_PIN_CREATE_DEFAULT", ln0Var.getCommentsEnabled());
    }

    public final void B3(Integer num) {
        boolean c13 = this.f56353l.c();
        ln0 ln0Var = this.f56361t;
        if (p2.Q0(ln0Var != null ? ln0Var.getPageData() : null, uv0.g.f123167j)) {
            ((ev0.l) ((av0.d) getView())).X8(av0.s.f20520b);
            return;
        }
        if (!c13) {
            ((ev0.l) ((av0.d) getView())).X8(av0.t.f20521b);
            return;
        }
        z3(false);
        e0 M = ((dl1.l) this.f56349h).M(this.f56346e.d());
        hk2.b bVar = new hk2.b(new mu0.a(19, new r0(10, this, num)), new mu0.a(20, new i(this, 4)), ck2.i.f27923c);
        M.f(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        addDisposable(bVar);
    }

    public final void D3(ln0 ln0Var) {
        boolean z13;
        qp link = ln0Var.getLink();
        if (link != null) {
            Boolean bool = link.f41350b;
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            z13 = bool.booleanValue();
        } else {
            z13 = true;
        }
        String boardId = ln0Var.getBoardId();
        if (boardId == null) {
            z3(z13);
            return;
        }
        xj2.c F = this.f56350i.P(boardId).F(new mu0.a(17, new r1.f(this, z13, 21)), new mu0.a(18, c.f56301o), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final boolean F3() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        wy0 f13 = ((b60.d) this.f56354m).f();
        return f13 != null && Intrinsics.d(f13.G3(), Boolean.TRUE) && this.f56363v.getTime().compareTo(calendar.getTime()) > 0;
    }

    public final void G3() {
        int i13 = 1;
        if (F3()) {
            av0.d dVar = (av0.d) getView();
            int i14 = p22.b.idea_pin_schedule_button_text;
            ev0.l lVar = (ev0.l) dVar;
            lVar.getClass();
            k0 j23 = bs1.c.j2(new String[0], i14);
            GestaltButton gestaltButton = lVar.K0;
            if (gestaltButton != null) {
                gestaltButton.d(new uv.b(j23, i13));
                return;
            } else {
                Intrinsics.r("createButton");
                throw null;
            }
        }
        av0.d dVar2 = (av0.d) getView();
        int i15 = m60.x0.button_create;
        ev0.l lVar2 = (ev0.l) dVar2;
        lVar2.getClass();
        k0 j24 = bs1.c.j2(new String[0], i15);
        GestaltButton gestaltButton2 = lVar2.K0;
        if (gestaltButton2 != null) {
            gestaltButton2.d(new uv.b(j24, i13));
        } else {
            Intrinsics.r("createButton");
            throw null;
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f56364w);
    }

    @Override // y11.f
    public final void m2(String description, ArrayList userMentionTags) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(userMentionTags, "userMentionTags");
        H3(this, new r0(9, description, userMentionTags), null, null, false, 14);
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        p3();
        e0 M = ((dl1.l) this.f56349h).M(this.f56346e.d());
        hk2.b bVar = new hk2.b(new mu0.a(21, new i(this, 0)), new mu0.a(22, c.f56300n), ck2.i.f27923c);
        M.f(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        addDisposable(bVar);
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        wn0 metadata;
        String pinTitle;
        ln0 ln0Var = this.f56361t;
        if (ln0Var != null && (metadata = ln0Var.getMetadata()) != null && (pinTitle = metadata.getPinTitle()) != null) {
            H3(this, new zu0.c(pinTitle, 2), null, null, true, 6);
        }
        this.f56347f.j(this.f56365x);
        super.onUnbind();
    }

    public final void u3() {
        Date time = Calendar.getInstance(TimeZone.getDefault()).getTime();
        Calendar calendar = this.f56363v;
        if (time.compareTo(calendar.getTime()) > 0) {
            ev0.l lVar = (ev0.l) ((av0.d) getView());
            lVar.getClass();
            NavigationImpl w13 = Navigation.w1(d2.k());
            Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
            lVar.M1(w13);
            return;
        }
        av0.d dVar = (av0.d) getView();
        Date time2 = calendar.getTime();
        ev0.l lVar2 = (ev0.l) dVar;
        lVar2.getClass();
        NavigationImpl w14 = Navigation.w1(d2.k());
        if (time2 != null) {
            w14.y0(time2, "com.pinterest.EXTRA_PIN_SELECTED_DATE_TIME");
        }
        Intrinsics.checkNotNullExpressionValue(w14, "apply(...)");
        lVar2.M1(w14);
    }

    public final Date v3() {
        Date time = this.f56363v.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }

    public final void w3(kg.a action) {
        tp pageData;
        fg1.a aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z13 = action instanceof av0.o;
        bw0.f fVar = this.f56352k;
        ag1.h hVar = this.f56357p;
        if (z13) {
            getPresenterPinalytics().f122379a.X(((av0.o) action).f20516f);
            ln0 ln0Var = this.f56361t;
            if (ln0Var != null && (aVar = hVar.f15145a.f15152g) != null) {
                tp pageData2 = ln0Var.getPageData();
                if (Intrinsics.d(aVar.f62126a, pageData2 != null ? pageData2.y() : null)) {
                    H3(this, new au0.f(aVar, 13), null, null, false, 14);
                }
            }
            fVar.b();
            ((ev0.l) ((av0.d) getView())).U8(true);
            return;
        }
        boolean z14 = action instanceof av0.m;
        kg.n nVar = av0.r.f20519b;
        ag1.b bVar = this.f56346e;
        if (z14) {
            getPresenterPinalytics().f122379a.X(u0.STORY_PIN_DISCARD_BUTTON);
            if (this.f56343b) {
                bVar.b(new m1(17, this.f56361t, this));
            } else {
                ln0 ln0Var2 = this.f56361t;
                if (ln0Var2 != null) {
                    uv0.k.c(ln0Var2);
                    kh2.d.o(this.f56349h, ln0Var2.q());
                }
            }
            fVar.b();
            ((ev0.l) ((av0.d) getView())).X8(nVar);
            return;
        }
        if (action instanceof av0.l) {
            getPresenterPinalytics().f122379a.X(u0.BACK_BUTTON);
            av0.d dVar = (av0.d) getView();
            if (hVar.f15145a.f15150e == fg1.b.FINISHING_TOUCHES_FIRST) {
                if (!Intrinsics.d(bVar.f15132e, this.f56361t)) {
                    nVar = v.f20523b;
                }
            }
            ((ev0.l) dVar).X8(nVar);
            return;
        }
        if (action instanceof av0.n) {
            av0.n nVar2 = (av0.n) action;
            ln0 ln0Var3 = this.f56361t;
            if (ln0Var3 == null || (pageData = ln0Var3.getPageData()) == null) {
                return;
            }
            String id3 = pageData.getId();
            tp tpVar = nVar2.f20514f;
            if (Intrinsics.d(id3, tpVar.getId())) {
                H3(this, new r0(8, tpVar, nVar2.f20515g), new i(this, 2), null, true, 4);
            }
        }
    }

    @Override // wk1.q, yk1.p
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public final void r3(av0.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        ev0.l lVar = (ev0.l) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        lVar.N0 = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        lVar.O0 = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        Intrinsics.checkNotNullParameter(this, "listener");
        lVar.P0 = this;
        G3();
        this.f56347f.h(this.f56365x);
    }

    public final void z3(boolean z13) {
        GestaltButton gestaltButton = ((ev0.l) ((av0.d) getView())).K0;
        if (gestaltButton != null) {
            gestaltButton.d(new n(z13, 1));
        } else {
            Intrinsics.r("createButton");
            throw null;
        }
    }
}
