package ed1;

import android.content.Context;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.sharesheet.view.SharesheetModalAppListView;
import fd1.b1;
import fd1.f1;
import fd1.z0;
import h32.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.w3;
import lh0.z3;
import so.c4;
import x02.i2;
import x02.x0;

/* loaded from: classes5.dex */
public final class x extends vq0.b {

    /* renamed from: c, reason: collision with root package name */
    public final Context f58727c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58728d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58729e;

    /* renamed from: f, reason: collision with root package name */
    public final p32.c f58730f;

    /* renamed from: g, reason: collision with root package name */
    public final SendableObject f58731g;

    /* renamed from: h, reason: collision with root package name */
    public final b1 f58732h;

    /* renamed from: i, reason: collision with root package name */
    public final z0 f58733i;

    /* renamed from: j, reason: collision with root package name */
    public final i91.b f58734j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f58735k;

    /* renamed from: l, reason: collision with root package name */
    public final f1 f58736l;

    /* renamed from: m, reason: collision with root package name */
    public final i91.n f58737m;

    /* renamed from: n, reason: collision with root package name */
    public final i2 f58738n;

    /* renamed from: o, reason: collision with root package name */
    public final x0 f58739o;

    /* renamed from: p, reason: collision with root package name */
    public final ll.j f58740p;

    /* renamed from: q, reason: collision with root package name */
    public final i91.z f58741q;

    /* renamed from: r, reason: collision with root package name */
    public final e82.h0 f58742r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, boolean z13, boolean z14, p32.c inviteCategory, SendableObject sendableObject, b1 surface, uk1.d presenterPinalytics, z0 sharesheetModalViewOptions, i91.a0 sendShareState, i91.b boardPreviewState, int i13, boolean z15, f1 upsellTypes, uj2.q networkStateStream, i91.n ideaPinDownloadManager, i2 pinRepository, x0 boardRepository, c4 shareSheetIconOnClickListenerFactory, ll.j pincodesUtil, i91.z preferredSharingAppTracker, e82.h0 socialUtils) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(sharesheetModalViewOptions, "sharesheetModalViewOptions");
        Intrinsics.checkNotNullParameter(sendShareState, "sendShareState");
        Intrinsics.checkNotNullParameter(boardPreviewState, "boardPreviewState");
        Intrinsics.checkNotNullParameter(upsellTypes, "upsellTypes");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(ideaPinDownloadManager, "ideaPinDownloadManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(shareSheetIconOnClickListenerFactory, "shareSheetIconOnClickListenerFactory");
        Intrinsics.checkNotNullParameter(pincodesUtil, "pincodesUtil");
        Intrinsics.checkNotNullParameter(preferredSharingAppTracker, "preferredSharingAppTracker");
        Intrinsics.checkNotNullParameter(socialUtils, "socialUtils");
        this.f58727c = context;
        this.f58728d = z13;
        this.f58729e = z14;
        this.f58730f = inviteCategory;
        this.f58731g = sendableObject;
        this.f58732h = surface;
        this.f58733i = sharesheetModalViewOptions;
        this.f58734j = boardPreviewState;
        this.f58735k = z15;
        this.f58736l = upsellTypes;
        this.f58737m = ideaPinDownloadManager;
        this.f58738n = pinRepository;
        this.f58739o = boardRepository;
        this.f58740p = pincodesUtil;
        this.f58741q = preferredSharingAppTracker;
        this.f58742r = socialUtils;
        i91.i0 a13 = shareSheetIconOnClickListenerFactory.a(context, sendableObject, getPinalytics(), inviteCategory, sharesheetModalViewOptions.getContextLoggingComponentType(), sendShareState, i13, boardPreviewState, null);
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP, new b(a13, 1));
        this.f126436a.j(10002, new b(a13, 2));
    }

    public static final ArrayList D3(x xVar, List list) {
        boolean z13;
        xVar.getClass();
        ArrayList H0 = CollectionsKt.H0(list);
        List list2 = list;
        boolean z14 = list2 instanceof Collection;
        boolean z15 = false;
        if (!z14 || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (kotlin.text.z.i("copy_link", ((os.g) it.next()).f97486c, true)) {
                    z13 = true;
                    break;
                }
            }
        }
        z13 = false;
        boolean z16 = !z13;
        Context context = xVar.f58727c;
        if (z16) {
            H0.add(ig1.b.x(context));
        }
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        if (f13 != null && Intrinsics.d(f13.s4(), Boolean.TRUE) && xVar.f58735k && xVar.f58733i == z0.DEFAULT) {
            H0.add(ig1.b.G(context, false));
        }
        if (!z14 || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (kotlin.text.z.i("more_apps", ((os.g) it2.next()).f97486c, true)) {
                    z15 = true;
                    break;
                }
            }
        }
        if (!z15) {
            H0.add(ig1.b.F(context));
        }
        return H0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void F3(x xVar, ArrayList arrayList) {
        xVar.getClass();
        boolean i13 = kotlin.text.z.i(arrayList.size() > 0 ? ((os.g) arrayList.get(0)).f97486c : "", xVar.f58741q.f71924c, true);
        SendableObject sendableObject = xVar.f58731g;
        boolean h10 = sendableObject.h();
        ck2.c cVar = ck2.i.f27923c;
        if (h10) {
            String d2 = sendableObject.d();
            Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
            xVar.f58738n.P(d2).F(new g(10, new rq.a0(xVar, arrayList, i13 ? 1 : 0, 12)), new g(11, c.f58549u), cVar, ck2.i.f27924d);
        }
        byte b13 = sendableObject.f35129c == 0 && sendableObject.f35136j;
        Context context = xVar.f58727c;
        if (b13 != false && dl2.b.P1(context, "com.instagram.android")) {
            w3 a13 = c62.c.a();
            a13.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) a13.f83501a;
            if (g1Var.o("sg_android_collage_share_ig_stories", "enabled", z3Var) || g1Var.l("sg_android_collage_share_ig_stories")) {
                arrayList.add(i13 ? 1 : 0, ig1.b.B(context));
            }
        }
        if (sendableObject.g() && xVar.f58728d) {
            arrayList.add(0, ig1.b.H(context));
        }
        if (sendableObject.g()) {
            oo1.j jVar = oo1.j.f96854a;
            if (oo1.j.k()) {
                if (xVar.f58729e) {
                    arrayList.add(Math.max(0, arrayList.size() - 1), ig1.b.E(context));
                } else if (xVar.f58732h == b1.PIN_OVERFLOW_FEED_MODAL) {
                    arrayList.add(0, ig1.b.E(context));
                }
            }
        }
        if (xVar.f58730f == p32.c.MESSAGE && sendableObject.e()) {
            String d13 = sendableObject.d();
            Intrinsics.checkNotNullExpressionValue(d13, "getUid(...)");
            xVar.f58739o.M(d13).f(new hk2.b(new g(12, new w(xVar, arrayList, 0)), new g(13, c.f58550v), cVar));
        }
        if (sendableObject.e()) {
            i91.b bVar = xVar.f58734j;
            if (bVar.f71798a) {
                os.g y13 = ig1.b.y(context);
                int i14 = a62.e.share_app_badge_video;
                Intrinsics.checkNotNullParameter(y13, "<this>");
                arrayList.add(0, new dd1.a(y13, i14));
                if (dl2.b.P1(context, "com.instagram.android")) {
                    os.g B = ig1.b.B(context);
                    B.f97485b = context.getString(a62.e.sharesheet_add_to_story);
                    int i15 = a62.e.share_app_badge_video;
                    Intrinsics.checkNotNullParameter(B, "<this>");
                    arrayList.add(1, new dd1.a(B, i15));
                }
            }
            String d14 = sendableObject.d();
            Intrinsics.checkNotNullExpressionValue(d14, "getUid(...)");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                os.g gVar = (os.g) it.next();
                nx.d0 pinalytics = xVar.getPinalytics();
                h32.f1 f1Var = h32.f1.RENDER;
                h32.i0 l03 = kh2.b0.l0(d14, u0.EXTERNAL_SHARE_OPTION);
                String meta = gVar.f97486c;
                Intrinsics.checkNotNullExpressionValue(meta, "meta");
                pinalytics.U(l03, f1Var, null, null, kh2.b0.u0(d14, bVar.f71799b, kh2.b0.q0(meta)), false);
            }
        }
        if (xVar.f58736l == f1.SCREENSHOT) {
            w3 a14 = c62.c.a();
            a14.getClass();
            z3 z3Var2 = a4.f83298b;
            g1 g1Var2 = (g1) a14.f83501a;
            if (g1Var2.o("android_visual_search_share_sheet", "enabled", z3Var2) || g1Var2.l("android_visual_search_share_sheet")) {
                arrayList.add(arrayList.size() <= 0 ? 0 : 1, ig1.b.A(context));
            }
        }
        if (arrayList.isEmpty()) {
            ((SharesheetModalAppListView) xVar.getView()).getPinterestRecyclerView().setVisibility(8);
        } else {
            ((SharesheetModalAppListView) xVar.getView()).getPinterestRecyclerView().setVisibility(0);
            xVar.x3(arrayList);
        }
    }

    @Override // vq0.g
    /* renamed from: G3, reason: merged with bridge method [inline-methods] */
    public final void r3(SharesheetModalAppListView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        e82.h0 h0Var = this.f58742r;
        h0Var.getClass();
        Context context = this.f58727c;
        xj2.c o13 = h0Var.d(context, e82.h0.n(context, this.f58731g) ? "com.whatsapp" : null).r(tk2.e.f118017c).l(wj2.c.a()).o(new g(8, new ic1.c(9, this, view)), new g(9, c.f58551w));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        Object item = getItem(i13);
        if (item instanceof dd1.a) {
            return 10002;
        }
        if (item instanceof os.g) {
            return RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP;
        }
        return -2;
    }

    @Override // vq0.g
    public final sq0.e0 p3() {
        return this;
    }
}
