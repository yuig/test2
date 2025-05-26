package ed1;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.iw;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.sharesheet.view.SharesheetModalAppListView;
import com.pinterest.ui.grid.PinterestRecyclerView;
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
import ua.t0;
import x02.i2;
import x02.x0;

/* loaded from: classes5.dex */
public final class i extends vq0.b {

    /* renamed from: c, reason: collision with root package name */
    public final Context f58625c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58626d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58627e;

    /* renamed from: f, reason: collision with root package name */
    public final p32.c f58628f;

    /* renamed from: g, reason: collision with root package name */
    public final SendableObject f58629g;

    /* renamed from: h, reason: collision with root package name */
    public final b1 f58630h;

    /* renamed from: i, reason: collision with root package name */
    public final z0 f58631i;

    /* renamed from: j, reason: collision with root package name */
    public final i91.b f58632j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f58633k;

    /* renamed from: l, reason: collision with root package name */
    public final f1 f58634l;

    /* renamed from: m, reason: collision with root package name */
    public i91.c0 f58635m;

    /* renamed from: n, reason: collision with root package name */
    public final i91.n f58636n;

    /* renamed from: o, reason: collision with root package name */
    public final i2 f58637o;

    /* renamed from: p, reason: collision with root package name */
    public final x0 f58638p;

    /* renamed from: q, reason: collision with root package name */
    public final ll.j f58639q;

    /* renamed from: r, reason: collision with root package name */
    public final i91.z f58640r;

    /* renamed from: s, reason: collision with root package name */
    public final e82.h0 f58641s;

    /* renamed from: t, reason: collision with root package name */
    public final i91.i0 f58642t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f58643u;

    /* renamed from: v, reason: collision with root package name */
    public final GridLayoutManager f58644v;

    /* renamed from: w, reason: collision with root package name */
    public l2 f58645w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0163 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0191 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(android.content.Context r17, boolean r18, boolean r19, p32.c r20, com.pinterest.activity.sendapin.model.SendableObject r21, fd1.b1 r22, uk1.d r23, fd1.z0 r24, i91.a0 r25, i91.b r26, int r27, boolean r28, fd1.f1 r29, i91.c0 r30, uj2.q r31, i91.n r32, x02.i2 r33, x02.x0 r34, so.c4 r35, ll.j r36, i91.z r37, e82.h0 r38) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ed1.i.<init>(android.content.Context, boolean, boolean, p32.c, com.pinterest.activity.sendapin.model.SendableObject, fd1.b1, uk1.d, fd1.z0, i91.a0, i91.b, int, boolean, fd1.f1, i91.c0, uj2.q, i91.n, x02.i2, x02.x0, so.c4, ll.j, i91.z, e82.h0):void");
    }

    public static final ArrayList D3(i iVar, List list) {
        boolean z13;
        iVar.getClass();
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
        Context context = iVar.f58625c;
        if (z16) {
            H0.add(ig1.b.x(context));
        }
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        if (f13 != null && Intrinsics.d(f13.s4(), Boolean.TRUE) && iVar.f58633k && iVar.f58631i == z0.DEFAULT) {
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

    public static final void F3(i iVar, ArrayList arrayList) {
        iVar.getClass();
        boolean i13 = kotlin.text.z.i(arrayList.size() > 0 ? ((os.g) arrayList.get(0)).f97486c : "", iVar.f58640r.f71924c, true);
        SendableObject sendableObject = iVar.f58629g;
        boolean h10 = sendableObject.h();
        ck2.c cVar = ck2.i.f27923c;
        if (h10) {
            String d2 = sendableObject.d();
            Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
            iVar.f58637o.P(d2).F(new ec1.a(28, new rq.a0(iVar, arrayList, i13 ? 1 : 0, 11)), new ec1.a(29, c.f58539k), cVar, ck2.i.f27924d);
        }
        i91.c0 c0Var = iVar.f58635m;
        boolean z13 = c0Var instanceof i91.w;
        Context context = iVar.f58625c;
        if (z13) {
            i91.w wVar = z13 ? (i91.w) c0Var : null;
            if (b40.O0(wVar != null ? wVar.f71905a : null) && dl2.b.P1(context, "com.instagram.android")) {
                w3 a13 = c62.c.a();
                a13.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) a13.f83501a;
                if (g1Var.o("sg_android_collage_share_ig_stories", "enabled", z3Var) || g1Var.l("sg_android_collage_share_ig_stories")) {
                    arrayList.add(i13 ? 1 : 0, ig1.b.B(context));
                }
            }
        }
        if (sendableObject.g() && iVar.f58626d) {
            arrayList.add(0, ig1.b.H(context));
        }
        if (sendableObject.g()) {
            oo1.j jVar = oo1.j.f96854a;
            if (oo1.j.k()) {
                if (iVar.f58627e) {
                    arrayList.add(Math.max(0, arrayList.size() - 1), ig1.b.E(context));
                } else if (iVar.f58630h == b1.PIN_OVERFLOW_FEED_MODAL) {
                    arrayList.add(0, ig1.b.E(context));
                }
            }
        }
        if (iVar.f58628f == p32.c.MESSAGE && sendableObject.e()) {
            String d13 = sendableObject.d();
            Intrinsics.checkNotNullExpressionValue(d13, "getUid(...)");
            iVar.f58638p.M(d13).f(new hk2.b(new g(0, new h(iVar, arrayList, 0)), new g(1, c.f58540l), cVar));
        }
        if (sendableObject.e()) {
            i91.b bVar = iVar.f58632j;
            if (bVar.f71798a) {
                if (iVar.f58635m.getContentType() == fd1.m.BOARD_VIDEO) {
                    kotlin.collections.k0.y(arrayList, new w1.g(iVar.f58635m.getContentType().getShareDestinations(), 20));
                    arrayList.add(0, ig1.b.y(context));
                    if (dl2.b.P1(context, "com.instagram.android")) {
                        os.g B = ig1.b.B(context);
                        B.f97485b = context.getString(a62.e.sharesheet_add_to_story);
                        arrayList.removeIf(new iw(7, c.f58542n));
                        arrayList.add(1, B);
                    }
                    if (dl2.b.P1(context, "com.facebook.katana")) {
                        os.g z14 = ig1.b.z(context);
                        z14.f97485b = context.getString(a62.e.sharesheet_add_to_story);
                        arrayList.removeIf(new iw(8, c.f58543o));
                        arrayList.add(1, z14);
                    }
                } else {
                    iVar.I3(arrayList);
                }
            }
            String d14 = sendableObject.d();
            Intrinsics.checkNotNullExpressionValue(d14, "getUid(...)");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                os.g gVar = (os.g) it.next();
                nx.d0 pinalytics = iVar.getPinalytics();
                h32.f1 f1Var = h32.f1.RENDER;
                h32.i0 l03 = kh2.b0.l0(d14, u0.EXTERNAL_SHARE_OPTION);
                String meta = gVar.f97486c;
                Intrinsics.checkNotNullExpressionValue(meta, "meta");
                pinalytics.U(l03, f1Var, null, null, kh2.b0.u0(d14, bVar.f71799b, kh2.b0.q0(meta)), false);
            }
        }
        if (sendableObject.f35129c == 14) {
            arrayList.clear();
            if (dl2.b.P1(context, "com.instagram.android")) {
                os.g B2 = ig1.b.B(context);
                B2.f97485b = context.getString(a62.e.sharesheet_add_to_story);
                arrayList.removeIf(new iw(9, c.f58544p));
                arrayList.add(0, B2);
            }
            arrayList.add(ig1.b.y(context));
        }
        if (iVar.f58634l == f1.SCREENSHOT) {
            w3 a14 = c62.c.a();
            a14.getClass();
            z3 z3Var2 = a4.f83298b;
            g1 g1Var2 = (g1) a14.f83501a;
            if (g1Var2.o("android_visual_search_share_sheet", "enabled", z3Var2) || g1Var2.l("android_visual_search_share_sheet")) {
                arrayList.add(arrayList.size() > 0 ? 1 : 0, ig1.b.A(context));
            }
        }
        if (!(iVar.f58635m instanceof i91.y)) {
            iVar.I3(arrayList);
            return;
        }
        arrayList.removeIf(new iw(6, c.f58541m));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0, ig1.b.H(context));
        arrayList2.add(ig1.b.G(context, true));
        if (arrayList.size() > 3) {
            arrayList2.addAll(arrayList.subList(0, 6 - arrayList2.size()));
        } else {
            arrayList2.addAll(arrayList);
        }
        arrayList2.add(ig1.b.x(context));
        arrayList2.add(ig1.b.F(context));
        iVar.I3(arrayList2);
    }

    public final void G3() {
        e82.h0 h0Var = this.f58641s;
        h0Var.getClass();
        Context context = this.f58625c;
        xj2.c o13 = h0Var.d(context, e82.h0.n(context, this.f58629g) ? "com.whatsapp" : null).r(tk2.e.f118017c).l(wj2.c.a()).o(new ec1.a(26, new kc1.w(this, 13)), new ec1.a(27, c.f58545q));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    @Override // vq0.g
    /* renamed from: H3, reason: merged with bridge method [inline-methods] */
    public final void r3(SharesheetModalAppListView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        PinterestRecyclerView pinterestRecyclerView = view.getPinterestRecyclerView();
        ViewGroup.LayoutParams layoutParams = view.getPinterestRecyclerView().getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.height = -2;
        layoutParams2.width = -2;
        layoutParams2.gravity = 1;
        pinterestRecyclerView.setLayoutParams(layoutParams2);
        RecyclerView recyclerView = view.getPinterestRecyclerView().f52531a;
        ViewGroup.LayoutParams layoutParams3 = view.getPinterestRecyclerView().f52531a.getLayoutParams();
        Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.height = -2;
        layoutParams4.width = -2;
        layoutParams4.gravity = 1;
        recyclerView.setLayoutParams(layoutParams4);
        view.getPinterestRecyclerView().k(null);
        l2 l2Var = view.getPinterestRecyclerView().f52535e;
        Intrinsics.checkNotNullExpressionValue(l2Var, "getLayoutManager(...)");
        this.f58645w = l2Var;
        G3();
    }

    public final void I3(ArrayList arrayList) {
        SharesheetModalAppListView sharesheetModalAppListView = (SharesheetModalAppListView) getViewIfBound();
        if (sharesheetModalAppListView != null) {
            if (arrayList.isEmpty()) {
                sharesheetModalAppListView.getPinterestRecyclerView().setVisibility(8);
                return;
            }
            t0.a(sharesheetModalAppListView.getPinterestRecyclerView(), null);
            x3(arrayList);
            sharesheetModalAppListView.post(new a11.p(10, this, arrayList));
        }
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
