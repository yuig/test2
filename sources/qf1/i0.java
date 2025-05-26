package qf1;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.widget.c2;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gl0;
import com.pinterest.api.model.hl0;
import com.pinterest.api.model.ro0;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.r4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nx.d1;
import so.k8;
import x02.i2;
import x02.x2;

/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nx.d0 f103690a;

    /* renamed from: b, reason: collision with root package name */
    public final xj2.b f103691b;

    /* renamed from: c, reason: collision with root package name */
    public final so.v f103692c;

    /* renamed from: d, reason: collision with root package name */
    public final m60.w f103693d;

    /* renamed from: e, reason: collision with root package name */
    public final i92.k f103694e;

    /* renamed from: f, reason: collision with root package name */
    public final np0.d f103695f;

    /* renamed from: g, reason: collision with root package name */
    public final i2 f103696g;

    /* renamed from: h, reason: collision with root package name */
    public final x2 f103697h;

    /* renamed from: i, reason: collision with root package name */
    public final d1 f103698i;

    /* renamed from: j, reason: collision with root package name */
    public final il1.a f103699j;

    /* renamed from: k, reason: collision with root package name */
    public final js0.a f103700k;

    /* renamed from: l, reason: collision with root package name */
    public final h22.f f103701l;

    /* renamed from: m, reason: collision with root package name */
    public final uk1.e f103702m;

    /* renamed from: n, reason: collision with root package name */
    public final so.x f103703n;

    /* renamed from: o, reason: collision with root package name */
    public final e02.a f103704o;

    /* renamed from: p, reason: collision with root package name */
    public final k8 f103705p;

    /* renamed from: q, reason: collision with root package name */
    public final b60.b f103706q;

    /* renamed from: r, reason: collision with root package name */
    public final q11.a f103707r;

    /* renamed from: s, reason: collision with root package name */
    public final k11.p f103708s;

    /* renamed from: t, reason: collision with root package name */
    public final nk1.l f103709t;

    /* renamed from: u, reason: collision with root package name */
    public final es.a f103710u;

    /* renamed from: v, reason: collision with root package name */
    public final so.y f103711v;

    /* renamed from: w, reason: collision with root package name */
    public final c2 f103712w;

    /* renamed from: x, reason: collision with root package name */
    public final nx.b0 f103713x;

    /* renamed from: y, reason: collision with root package name */
    public final ku1.j f103714y;

    /* renamed from: z, reason: collision with root package name */
    public final jo1.c f103715z;

    public i0(nx.d0 pinalytics, xj2.b disposables, so.v inviteCodeHandlerFactory, m60.w eventManager, i92.k toastUtils, np0.d closeupActionController, i2 pinRepository, x2 userRepository, d1 trackingParamAttacher, il1.a fragmentFactory, js0.a homefeedOrganicPinHPfyHideRemoteRequest, h22.f storyPinService, uk1.e presenterPinalyticsFactory, so.x pinFeedbackModalFactory, e02.a boardRouter, k8 paidPartnershipDelegateFactory, b60.b activeUserManager, q11.a editPinLauncher, k11.p repinUtils, nk1.l userFollowConfirmationProvider, es.a adFormats, so.y pinImageDownloaderFactory, c2 sharesheetUtils, nx.b0 pinAuxHelper, ku1.j navigationManager, jo1.c baseGridActionUtils) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(disposables, "disposables");
        Intrinsics.checkNotNullParameter(inviteCodeHandlerFactory, "inviteCodeHandlerFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(closeupActionController, "closeupActionController");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(homefeedOrganicPinHPfyHideRemoteRequest, "homefeedOrganicPinHPfyHideRemoteRequest");
        Intrinsics.checkNotNullParameter(storyPinService, "storyPinService");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(pinFeedbackModalFactory, "pinFeedbackModalFactory");
        Intrinsics.checkNotNullParameter(boardRouter, "boardRouter");
        Intrinsics.checkNotNullParameter(paidPartnershipDelegateFactory, "paidPartnershipDelegateFactory");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(editPinLauncher, "editPinLauncher");
        Intrinsics.checkNotNullParameter(repinUtils, "repinUtils");
        Intrinsics.checkNotNullParameter(userFollowConfirmationProvider, "userFollowConfirmationProvider");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinImageDownloaderFactory, "pinImageDownloaderFactory");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(baseGridActionUtils, "baseGridActionUtils");
        this.f103690a = pinalytics;
        this.f103691b = disposables;
        this.f103692c = inviteCodeHandlerFactory;
        this.f103693d = eventManager;
        this.f103694e = toastUtils;
        this.f103695f = closeupActionController;
        this.f103696g = pinRepository;
        this.f103697h = userRepository;
        this.f103698i = trackingParamAttacher;
        this.f103699j = fragmentFactory;
        this.f103700k = homefeedOrganicPinHPfyHideRemoteRequest;
        this.f103701l = storyPinService;
        this.f103702m = presenterPinalyticsFactory;
        this.f103703n = pinFeedbackModalFactory;
        this.f103704o = boardRouter;
        this.f103705p = paidPartnershipDelegateFactory;
        this.f103706q = activeUserManager;
        this.f103707r = editPinLauncher;
        this.f103708s = repinUtils;
        this.f103709t = userFollowConfirmationProvider;
        this.f103710u = adFormats;
        this.f103711v = pinImageDownloaderFactory;
        this.f103712w = sharesheetUtils;
        this.f103713x = pinAuxHelper;
        this.f103714y = navigationManager;
        this.f103715z = baseGridActionUtils;
    }

    public static final void a(i0 i0Var, Resources resources) {
        i0Var.getClass();
        i0Var.f103694e.i(resources.getString(x0.generic_error));
    }

    public static final void b(i0 i0Var, f30 f30Var) {
        i0Var.getClass();
        String f39332b = f30Var.getF39332b();
        Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
        String f39332b2 = f30Var.getF39332b();
        Intrinsics.checkNotNullExpressionValue(f39332b2, "getUid(...)");
        i0Var.f103693d.d(new jc0.v(i0Var.f103703n.a(f39332b, ((uk1.a) i0Var.f103702m).f(i0Var.f103690a, f39332b2), oe.f.t(f30Var, i0Var.f103710u), null, null), true, 0L, 28));
    }

    public final uj2.l c(f30 f30Var, boolean z13) {
        boolean booleanValue;
        boolean z14;
        boolean z15 = false;
        if (b40.t0(f30Var)) {
            booleanValue = !z13;
        } else {
            Boolean Q3 = f30Var.Q3();
            Intrinsics.checkNotNullExpressionValue(Q3, "getCommentsDisabled(...)");
            booleanValue = Q3.booleanValue();
        }
        if (!b40.u0(f30Var)) {
            Boolean e43 = f30Var.e4();
            Intrinsics.checkNotNullExpressionValue(e43, "getDidItDisabled(...)");
            z15 = e43.booleanValue();
        } else if (!z13) {
            z14 = true;
            return c0.d.L(this.f103696g, f30Var, null, booleanValue, z14, 7422);
        }
        z14 = z15;
        return c0.d.L(this.f103696g, f30Var, null, booleanValue, z14, 7422);
    }

    public final void d() {
        this.f103693d.d(new jc0.s());
    }

    public final void e(Context context, j0 actionSheetModel, Boolean bool) {
        boolean z13;
        boolean z14;
        dl0 v63;
        Boolean bool2;
        Pair pair;
        String s53;
        int i13;
        boolean z15;
        Intrinsics.checkNotNullParameter(actionSheetModel, "actionSheetModel");
        Intrinsics.checkNotNullParameter(context, "context");
        f30 f30Var = actionSheetModel.f103719a;
        boolean P0 = b40.P0(f30Var);
        wy0 Q = com.bumptech.glide.d.Q(this.f103706q);
        dl0 v64 = f30Var.v6();
        if (v64 != null) {
            String userId = Q.getF39332b();
            Intrinsics.checkNotNullExpressionValue(userId, "getUid(...)");
            Intrinsics.checkNotNullParameter(v64, "<this>");
            Intrinsics.checkNotNullParameter(userId, "userId");
            hl0 hl0Var = new hl0(userId);
            List s13 = v64.s();
            if (s13 != null) {
                Iterator it = s13.iterator();
                loop0: while (it.hasNext()) {
                    List o13 = ((uo0) it.next()).o();
                    if (o13 != null) {
                        Iterator it2 = o13.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.d(((ro0) it2.next()).a(hl0Var), Boolean.TRUE)) {
                                z13 = true;
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        z13 = false;
        f30 f30Var2 = actionSheetModel.f103719a;
        if (bool != null) {
            z14 = bool.booleanValue();
        } else {
            if (actionSheetModel.f103727i != null && (v63 = f30Var2.v6()) != null) {
                String userId2 = Q.getF39332b();
                Intrinsics.checkNotNullExpressionValue(userId2, "getUid(...)");
                Intrinsics.checkNotNullParameter(v63, "<this>");
                Intrinsics.checkNotNullParameter(userId2, "userId");
                gl0 gl0Var = new gl0(userId2);
                List s14 = v63.s();
                if (s14 != null) {
                    Iterator it3 = s14.iterator();
                    loop5: while (it3.hasNext()) {
                        List o14 = ((uo0) it3.next()).o();
                        if (o14 != null) {
                            Iterator it4 = o14.iterator();
                            while (it4.hasNext()) {
                                if (Intrinsics.d(((ro0) it4.next()).a(gl0Var), Boolean.TRUE)) {
                                    z14 = true;
                                    break loop5;
                                }
                            }
                        }
                    }
                }
            }
            z14 = false;
        }
        z9.n nVar = new z9.n(this, f30Var, actionSheetModel, context, z14, 5);
        ed1.m mVar = new ed1.m(this, f30Var, context, 6);
        boolean z16 = b40.t0(f30Var) || b40.u0(f30Var);
        ArrayList arrayList = new ArrayList();
        boolean W = rl2.g0.W(f30Var);
        if (W) {
            if (z16) {
                arrayList.add(kh2.w.y0(kotlin.collections.e0.b(new l0(k0.EDIT, null)), nVar, Integer.valueOf(x0.manage), null));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new Pair(k0.ALLOW_COMMENTS, Boolean.valueOf((f30Var.Q3().booleanValue() || f30Var.e4().booleanValue()) ? false : true)));
                HashMap hashMap = new HashMap();
                Iterator it5 = arrayList2.iterator();
                int i14 = 0;
                while (it5.hasNext()) {
                    Object next = it5.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    hashMap.put(((Pair) next).f80346a, Integer.valueOf(i14));
                    i14 = i15;
                }
                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(arrayList2, 10));
                Iterator it6 = arrayList2.iterator();
                int i16 = 0;
                while (it6.hasNext()) {
                    Object next2 = it6.next();
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    Pair pair2 = (Pair) next2;
                    Iterator it7 = it6;
                    k0 k0Var = (k0) pair2.f80346a;
                    boolean booleanValue = ((Boolean) pair2.f80347b).booleanValue();
                    wy0 z53 = f30Var.z5();
                    if (z53 != null) {
                        i13 = i17;
                        z15 = Intrinsics.d(z53.r4(), Boolean.TRUE);
                    } else {
                        i13 = i17;
                        z15 = false;
                    }
                    arrayList3.add(new ha2.c0(k0Var.getLabelResId(), i16, null, booleanValue, z15, null, null, z15 ? Integer.valueOf(x0.comments_turned_off_in_social_permissions) : null, z15 ? Integer.valueOf(x0.social_permissions) : null, z15 ? Navigation.L((ScreenLocation) r4.f51310b.getValue(), "", ml1.b.MODAL_TRANSITION.getValue()) : null, 100));
                    it6 = it7;
                    i16 = i13;
                }
                arrayList.add(new ha2.y(arrayList3, new cl0.b(hashMap, mVar, 3)));
            } else {
                arrayList.add(kh2.w.y0(kotlin.collections.e0.b(new l0(k0.EDIT, null)), nVar, Integer.valueOf(q82.a.more_options), null));
            }
        }
        ArrayList arrayList4 = new ArrayList();
        wy0 wy0Var = actionSheetModel.f103720b;
        if (wy0Var == null || (bool2 = wy0Var.R2()) == null) {
            bool2 = Boolean.FALSE;
        }
        boolean z17 = !bool2.booleanValue();
        es.a aVar = this.f103710u;
        if (!W && !((es.c) aVar).U(f30Var) && wy0Var != null && ((Boolean) nk1.a.f91101m.invoke(wy0Var, Boolean.valueOf(z17))).booleanValue()) {
            if (z17) {
                arrayList4.add(new l0(k0.FOLLOW_USER, wy0Var.Z2()));
            } else {
                arrayList4.add(new l0(k0.UNFOLLOW_USER, wy0Var.Z2()));
            }
        }
        if (actionSheetModel.f103721c || b40.o0(f30Var)) {
            arrayList4.add(new l0(k0.SAVE, null));
        }
        if (actionSheetModel.f103723e && (s53 = f30Var.s5()) != null && (!kotlin.text.z.j(s53))) {
            arrayList4.add(new l0(k0.VISIT, null));
        }
        if (((es.c) aVar).U(f30Var) || b40.o0(f30Var)) {
            arrayList4.add(new l0(k0.SEND, null));
            arrayList4.add(new l0(k0.HIDE, null));
            arrayList4.add(new l0(k0.WHY_AM_I_SEEING_THIS_AD, null));
            arrayList4.add(new l0(k0.REPORT, null));
        } else {
            arrayList4.add(new l0(k0.SHARE, null));
            arrayList4.add(new l0(k0.COPY_LINK, null));
            if (P0) {
                arrayList4.add(new l0(k0.DOWNLOAD_IMAGE, null));
            }
            if (!W) {
                arrayList4.add(new l0(k0.REPORT, null));
                if (actionSheetModel.f103722d) {
                    arrayList4.add(new l0(k0.HIDE, null));
                }
            }
            if (actionSheetModel.f103724f) {
                arrayList4.add(new l0(k0.VIEW_SIMILAR_IDEAS, null));
            }
            if (z13) {
                arrayList4.add(new l0(k0.REMOVE_MENTION, null));
            }
            if (z14) {
                arrayList4.add(new l0(k0.REMOVE_PRODUCTS, null));
            }
        }
        if (!arrayList4.isEmpty()) {
            Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                if (((l0) it8.next()).f103740a == k0.WHY_AM_I_SEEING_THIS_AD) {
                    Integer valueOf = Integer.valueOf(q82.a.story_pin_overflow_menu_group_title);
                    wy0 a63 = f30Var.a6();
                    pair = new Pair(valueOf, a63 != null ? dl2.b.j1(a63) : null);
                    arrayList.add(kh2.w.y0(arrayList4, nVar, (Integer) pair.f80346a, (String) pair.f80347b));
                    this.f103693d.d(new jc0.v(new lp.k(new ha2.a((List) arrayList, true, Integer.valueOf(x0.options), 8), new SendableObject(f30Var2)), false, 0L, 30));
                }
            }
        }
        pair = new Pair(null, null);
        arrayList.add(kh2.w.y0(arrayList4, nVar, (Integer) pair.f80346a, (String) pair.f80347b));
        this.f103693d.d(new jc0.v(new lp.k(new ha2.a((List) arrayList, true, Integer.valueOf(x0.options), 8), new SendableObject(f30Var2)), false, 0L, 30));
    }
}
