package sk0;

import android.content.Context;
import androidx.appcompat.widget.c2;
import ao2.j0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import x02.x0;

/* loaded from: classes5.dex */
public final class j implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final m60.w f113060a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f113061b;

    /* renamed from: c, reason: collision with root package name */
    public final ap.o f113062c;

    /* renamed from: d, reason: collision with root package name */
    public final gi.m f113063d;

    /* renamed from: e, reason: collision with root package name */
    public final uk1.e f113064e;

    /* renamed from: f, reason: collision with root package name */
    public final c2 f113065f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f113066g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f113067h;

    public j(m60.w eventManager, x0 boardRepository, ap.o uploadContactsUtil, gi.m boardInviteUtils, uk1.e presenterPinalyticsFactory, c2 sharesheetUtils, Context context, rd.j pinalytics, d0 topLevelPinalytics) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(boardInviteUtils, "boardInviteUtils");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(topLevelPinalytics, "topLevelPinalytics");
        this.f113060a = eventManager;
        this.f113061b = boardRepository;
        this.f113062c = uploadContactsUtil;
        this.f113063d = boardInviteUtils;
        this.f113064e = presenterPinalyticsFactory;
        this.f113065f = sharesheetUtils;
        this.f113066g = context;
        this.f113067h = topLevelPinalytics;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(j0 scope, s request, u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = request instanceof n;
        m60.w wVar = this.f113060a;
        if (z13) {
            n nVar = (n) request;
            NavigationImpl z03 = Navigation.z0((ScreenLocation) com.pinterest.screens.t.f51362c.getValue(), nVar.f113072a);
            z03.m0("com.pinterest.EXTRA_BOARD_ID", nVar.f113072a);
            z03.z(x22.c.BOARD_TOOL.getValue(), "com.pinterest.EXTRA_IDEAS_REFERRER_TYPE");
            z03.Y1("EXTRA_NAVBAR_HIDE", true);
            wVar.d(z03);
            return;
        }
        if (request instanceof p) {
            p pVar = (p) request;
            NavigationImpl z04 = Navigation.z0((ScreenLocation) com.pinterest.screens.t.f51366g.getValue(), pVar.f113075b);
            z04.m0("com.pinterest.EXTRA_BOARD_ID", pVar.f113074a);
            z04.m0("com.pinterest.EXTRA_BOARD_SECTION_ID", pVar.f113075b);
            z04.z(x22.c.BOARD_TOOL.getValue(), "com.pinterest.EXTRA_IDEAS_REFERRER_TYPE");
            z04.Y1("EXTRA_NAVBAR_HIDE", true);
            wVar.d(z04);
            return;
        }
        if (request instanceof o) {
            NavigationImpl w13 = Navigation.w1((ScreenLocation) com.pinterest.screens.t.f51368i.getValue());
            w13.m0("com.pinterest.EXTRA_BOARD_ID", ((o) request).f113073a);
            w13.m0("extra_lens_camera_mode", "ROOM_REPAINT");
            w13.m0("extra_room_repaint_source", "toolbar");
            wVar.d(w13);
            return;
        }
        if (request instanceof q) {
            q qVar = (q) request;
            NavigationImpl z05 = Navigation.z0((ScreenLocation) com.pinterest.screens.t.f51367h.getValue(), qVar.f113076a);
            z05.m0("com.pinterest.EXTRA_BOARD_ID", qVar.f113076a);
            z05.m0("com.pinterest.EXTRA_BOARD_SESSION_ID", qVar.f113077b);
            z05.z(x22.c.BOARD_TOOL.getValue(), "com.pinterest.EXTRA_IDEAS_REFERRER_TYPE");
            z05.m0("com.pinterest.EXTRA_SHOP_TOOL_TITLE", qVar.f113078c);
            z05.m0("com.pinterest.EXTRA_SHOP_TOOL_SUBTITLE", qVar.f113079d);
            wVar.d(z05);
            return;
        }
        if (request instanceof r) {
            r rVar = (r) request;
            String str = rVar.f113080a;
            Context context = this.f113066g;
            yk1.a aVar = new yk1.a(context.getResources(), context.getTheme());
            String str2 = rVar.f113081b;
            hk0.m mVar = (str2 == null || str2.length() == 0) ? hk0.m.BOARD : hk0.m.BOARD_SECTION;
            ap.o oVar = this.f113062c;
            gi.m mVar2 = this.f113063d;
            String str3 = rVar.f113081b;
            d0 d0Var = this.f113067h;
            x0 x0Var = this.f113061b;
            m60.w wVar2 = this.f113060a;
            wVar2.d(new jc0.v(new jk0.b(str, str3, d0Var, x0Var, wVar2, oVar, aVar, mVar2, mVar, this.f113064e, this.f113065f), false, 0L, 30));
        }
    }
}
