package gs0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.gridactions.modal.view.OverflowMenu;
import com.pinterest.feature.unifiedcomments.view.CommentCodeModalView;
import df.j1;
import h32.g0;
import h32.i0;
import h32.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m60.w;
import m60.x0;
import so.oa;
import u51.r;
import u51.u;
import u51.x;
import u51.z;
import x02.p2;
import x02.x2;

/* loaded from: classes5.dex */
public final class a extends yk1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66015a = 1;

    /* renamed from: b, reason: collision with root package name */
    public uj2.q f66016b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f66017c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f66018d;

    /* renamed from: e, reason: collision with root package name */
    public Object f66019e;

    /* renamed from: f, reason: collision with root package name */
    public Object f66020f;

    /* renamed from: g, reason: collision with root package name */
    public Object f66021g;

    /* renamed from: h, reason: collision with root package name */
    public Object f66022h;

    /* renamed from: i, reason: collision with root package name */
    public Object f66023i;

    public a(az0 reportableModel, u51.n adapter) {
        Intrinsics.checkNotNullParameter(reportableModel, "reportableModel");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f66017c = reportableModel;
        this.f66018d = adapter;
    }

    public final nk1.g b(u0 u0Var) {
        return new nk1.g(sh.f.a(), new i0(null, null, null, g0.MODAL_DIALOG, null, u0Var), ((az0) this.f66017c).getUid(), null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        switch (this.f66015a) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                this.f66022h = resources;
                this.f66021g = new OverflowMenu(context);
                Resources.Theme theme = context.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                this.f66023i = theme;
                ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
                modalViewWrapper.l(x0.options);
                Object obj = (cs0.c) this.f66021g;
                if (obj == null) {
                    Intrinsics.r("modalView");
                    throw null;
                }
                View view = obj instanceof View ? (View) obj : null;
                if (view != null) {
                    modalViewWrapper.t(view);
                }
                return modalViewWrapper;
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                z zVar = new z(context);
                this.f66023i = zVar;
                return zVar;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                jc0.n nVar = new jc0.n(context);
                nVar.Z(0, 0, 0, 0);
                nVar.T(false);
                CommentCodeModalView commentCodeModalView = new CommentCodeModalView(context);
                this.f66022h = commentCodeModalView;
                nVar.x(commentCodeModalView);
                return nVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.List] */
    @Override // yk1.l
    public final yk1.m createPresenter() {
        v7 D3;
        q0 q0Var;
        int i13 = this.f66015a;
        Object obj = this.f66017c;
        Object obj2 = this.f66018d;
        switch (i13) {
            case 0:
                String str = (String) obj;
                v7 v7Var = (v7) obj2;
                wy0 wy0Var = (wy0) this.f66019e;
                uk1.d dVar = (uk1.d) this.f66020f;
                uj2.q qVar = this.f66016b;
                Resources resources = (Resources) this.f66022h;
                if (resources == null) {
                    Intrinsics.r("resources");
                    throw null;
                }
                Resources.Theme theme = (Resources.Theme) this.f66023i;
                if (theme != null) {
                    return new fs0.i(str, v7Var, wy0Var, new yk1.a(resources, theme), dVar, qVar);
                }
                Intrinsics.r("theme");
                throw null;
            case 1:
                q51.b bVar = (q51.b) this.f66023i;
                if (bVar == null) {
                    Intrinsics.r("reportContentView");
                    throw null;
                }
                z zVar = (z) bVar;
                Context context = kb0.a.f79058b;
                oa oaVar = (oa) ((r) j1.b0(r.class, f0.W()));
                p2 p2Var = (p2) oaVar.f113912sa.get();
                Intrinsics.checkNotNullParameter(p2Var, "<set-?>");
                this.f66019e = p2Var;
                x02.x0 x0Var = (x02.x0) oaVar.f113765k3.get();
                Intrinsics.checkNotNullParameter(x0Var, "<set-?>");
                this.f66020f = x0Var;
                x2 G2 = oaVar.G2();
                Intrinsics.checkNotNullParameter(G2, "<set-?>");
                this.f66021g = G2;
                uj2.q u23 = oaVar.u2();
                Intrinsics.checkNotNullParameter(u23, "<set-?>");
                this.f66016b = u23;
                uk1.e x23 = oaVar.x2();
                Intrinsics.checkNotNullParameter(x23, "<set-?>");
                this.f66022h = x23;
                Context context2 = zVar.getContext();
                HashMap hashMap = t51.a.f116436a;
                Resources resources2 = context2 != null ? context2.getResources() : null;
                if (resources2 != null) {
                    List asList = Arrays.asList(resources2.getStringArray(w02.a.report_pin_unfollow_titles));
                    List asList2 = Arrays.asList(resources2.getStringArray(w02.a.report_pin_unfollow_text_values));
                    HashMap hashMap2 = t51.a.f116436a;
                    hashMap2.put(x.IGNORE_UNFOLLOW_BOARD, Arrays.asList((String) asList.get(0), (String) asList2.get(0)));
                    hashMap2.put(x.IGNORE_UNFOLLOW_USER, Arrays.asList((String) asList.get(1), (String) asList2.get(1)));
                    hashMap2.put(x.IGNORE_BLOCK_USER, Arrays.asList((String) asList.get(2), (String) asList2.get(2)));
                    List asList3 = Arrays.asList(resources2.getStringArray(w02.a.report_pin_spam_titles));
                    hashMap2.put(x.SPAM_REPETITIVE_SPAM, Collections.singletonList((String) asList3.get(0)));
                    hashMap2.put(x.SPAM_FAKE_ACCOUNT, Collections.singletonList((String) asList3.get(1)));
                    hashMap2.put(x.SPAM_HACKED_ACCOUNT, Collections.singletonList((String) asList3.get(2)));
                    List asList4 = Arrays.asList(resources2.getStringArray(w02.a.report_pin_against_our_policies_titles));
                    List asList5 = Arrays.asList(resources2.getStringArray(w02.a.report_pin_against_our_policies_text_values));
                    hashMap2.put(x.POLICY_NUDITY, Arrays.asList((String) asList4.get(0), (String) asList5.get(0)));
                    hashMap2.put(x.POLICY_HURTFUL_CONTENT, Arrays.asList((String) asList4.get(1), (String) asList5.get(1)));
                    hashMap2.put(x.POLICY_GORE, Arrays.asList((String) asList4.get(2), (String) asList5.get(2)));
                    hashMap2.put(x.FILE_IP_REPORT, Collections.singletonList((String) Arrays.asList(resources2.getStringArray(w02.a.report_pin_intellectual_property)).get(0)));
                    List asList6 = Arrays.asList(resources2.getStringArray(w02.a.report_pin_hurtful_content_titles));
                    hashMap2.put(x.HURTFUL_CONTENT_HARASSING_ME_OR_CHILD, Collections.singletonList((String) asList6.get(0)));
                    hashMap2.put(x.HURTFUL_CONTENT_HARASSING_FRIEND, Collections.singletonList((String) asList6.get(1)));
                    hashMap2.put(x.HURTFUL_CONTENT_HARASSING_PUBLIC_FIGURE, Collections.singletonList((String) asList6.get(2)));
                    hashMap2.put(x.HURTFUL_CONTENT_HATE_SPEECH, Collections.singletonList((String) asList6.get(3)));
                    hashMap2.put(x.HURTFUL_CONTENT_SELF_HARM, Collections.singletonList((String) asList6.get(4)));
                    List asList7 = Arrays.asList(context2.getString(w02.b.report_pin_title_ignore), context2.getString(w02.b.report_pin_title_spam), context2.getString(w02.b.report_pin_title_policies), context2.getString(w02.b.report_pin_title_ip));
                    List asList8 = Arrays.asList(context2.getString(w02.b.report_pin_text_ignore), context2.getString(w02.b.report_pin_text_spam), context2.getString(w02.b.report_pin_text_policies), context2.getString(w02.b.report_pin_text_ip));
                    hashMap2.put(x.IGNORE, Arrays.asList((String) asList7.get(0), (String) asList8.get(0)));
                    hashMap2.put(x.SPAM, Arrays.asList((String) asList7.get(1), (String) asList8.get(1)));
                    hashMap2.put(x.POLICIES, Arrays.asList((String) asList7.get(2), (String) asList8.get(2)));
                    hashMap2.put(x.IP, Arrays.asList((String) asList7.get(3), (String) asList8.get(3)));
                    List asList9 = Arrays.asList(context2.getString(w02.b.report_did_it_title_useful), context2.getString(w02.b.report_did_it_title_on_pinterest), context2.getString(w02.b.report_did_it_title_spam), context2.getString(w02.b.report_did_it_not_on_pinterest_sexually_explicit), context2.getString(w02.b.report_did_it_not_on_pinterest_self_harm), context2.getString(w02.b.report_did_it_not_on_pinterest_hate_speech), context2.getString(w02.b.report_did_it_not_on_pinterest_harassment_bullying), context2.getString(w02.b.report_did_it_not_on_pinterest_graphic_violence), context2.getString(w02.b.report_did_it_not_on_pinterest_intellectual_property), context2.getString(w02.b.report_did_it_harassment_me_child), context2.getString(w02.b.report_did_it_harassment_attacks), context2.getString(w02.b.report_did_it_harassment_something_else));
                    hashMap2.put(x.DID_IT_USEFUL, Collections.singletonList((String) asList9.get(0)));
                    hashMap2.put(x.DID_IT_ON_PINTEREST, Collections.singletonList((String) asList9.get(1)));
                    hashMap2.put(x.DID_IT_SPAM, Collections.singletonList((String) asList9.get(2)));
                    hashMap2.put(x.DID_IT_ON_PINTEREST_SEXUALLY, Collections.singletonList((String) asList9.get(3)));
                    hashMap2.put(x.DID_IT_ON_PINTEREST_SELF_HARM, Collections.singletonList((String) asList9.get(4)));
                    hashMap2.put(x.DID_IT_ON_PINTEREST_HATE, Collections.singletonList((String) asList9.get(5)));
                    hashMap2.put(x.DID_IT_ON_PINTEREST_HARASS, Collections.singletonList((String) asList9.get(6)));
                    hashMap2.put(x.DID_IT_ON_PINTEREST_GRAPHIC, Collections.singletonList((String) asList9.get(7)));
                    hashMap2.put(x.DID_IT_ON_PINTEREST_IP, Collections.singletonList((String) asList9.get(8)));
                    hashMap2.put(x.DID_IT_HARASSMENT_ME_CHILD, Collections.singletonList((String) asList9.get(9)));
                    hashMap2.put(x.DID_IT_HARASSMENT_ATTACKS, Collections.singletonList((String) asList9.get(10)));
                    hashMap2.put(x.DID_IT_HARASSMENT_SOMETHING_ELSE, Collections.singletonList((String) asList9.get(11)));
                }
                uk1.e eVar = (uk1.e) this.f66022h;
                if (eVar == null) {
                    Intrinsics.r("presenterPinalyticsFactory");
                    throw null;
                }
                az0 az0Var = (az0) obj;
                String uid = az0Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                uk1.d d2 = ((uk1.a) eVar).d(uid);
                uj2.q qVar2 = this.f66016b;
                if (qVar2 == null) {
                    Intrinsics.r("networkStateStream");
                    throw null;
                }
                yk1.a aVar = new yk1.a(zVar.getContext().getResources(), zVar.getContext().getTheme());
                p2 p2Var2 = (p2) this.f66019e;
                if (p2Var2 == null) {
                    Intrinsics.r("userDidItRepository");
                    throw null;
                }
                s51.e eVar2 = new s51.e(d2, qVar2, az0Var, aVar, p2Var2, new s60.d(new s60.c(sh.f.a(), new i0(null, null, null, g0.MODAL_DIALOG, null, u0.USER_BLOCK_BUTTON), az0Var.getUid(), 56)), new ok1.f(b(u0.USER_FOLLOW), null, null, false, null, 62), new ok1.d(b(u0.BOARD_UNFOLLOW), null, 6));
                u51.n adapter = (u51.n) obj2;
                adapter.f120636c = eVar2;
                adapter.f120637d = eVar2;
                if (adapter instanceof u51.q) {
                    q0Var = kotlin.collections.f0.j(x.DID_IT_USEFUL, x.DID_IT_ON_PINTEREST, x.DID_IT_SPAM);
                } else if (adapter instanceof u) {
                    ?? arrayList = new ArrayList();
                    az0 az0Var2 = eVar2.f111157a;
                    f30 O = az0Var2.O();
                    if (O != null && (D3 = O.D3()) != null && Intrinsics.d(D3.V0(), Boolean.TRUE)) {
                        arrayList.add(x.IGNORE_UNFOLLOW_BOARD);
                    }
                    wy0 U = az0Var2.U();
                    if (U != null && Intrinsics.d(U.R2(), Boolean.TRUE)) {
                        arrayList.add(x.IGNORE_UNFOLLOW_USER);
                    }
                    arrayList.add(x.IGNORE_BLOCK_USER);
                    q0Var = arrayList;
                } else {
                    q0Var = q0.f80391a;
                }
                if (!q0Var.isEmpty()) {
                    adapter.f120635b = q0Var;
                }
                adapter.f120634a = adapter.a();
                zVar.l(adapter.b());
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                zVar.t(adapter);
                return eVar2;
            default:
                oh1.n nVar = new oh1.n((c30.a) obj2, (Function0) obj, (w) this.f66019e, (lb0.r) this.f66021g, ((uk1.a) ((uk1.e) this.f66020f)).g(), this.f66016b);
                this.f66023i = nVar;
                nVar.create();
                return nVar;
        }
    }

    @Override // yk1.l
    public final yk1.n getView() {
        switch (this.f66015a) {
            case 0:
                cs0.c cVar = (cs0.c) this.f66021g;
                if (cVar != null) {
                    return cVar;
                }
                Intrinsics.r("modalView");
                throw null;
            case 1:
                q51.b bVar = (q51.b) this.f66023i;
                if (bVar != null) {
                    return bVar;
                }
                Intrinsics.r("reportContentView");
                throw null;
            default:
                CommentCodeModalView commentCodeModalView = (CommentCodeModalView) this.f66022h;
                if (commentCodeModalView != null) {
                    return commentCodeModalView;
                }
                Intrinsics.r("modalView");
                throw null;
        }
    }

    public a(String sourceId, v7 board, wy0 user, uk1.d pinalytics, uj2.q networkStateStream) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f66017c = sourceId;
        this.f66018d = board;
        this.f66019e = user;
        this.f66020f = pinalytics;
        this.f66016b = networkStateStream;
    }

    public a(Function0 onCompleteCallback, c30.a userStateService, w eventManager, uk1.e presenterPinalyticsFactory, uj2.q networkStateStream, lb0.r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(onCompleteCallback, "onCompleteCallback");
        Intrinsics.checkNotNullParameter(userStateService, "userStateService");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f66017c = onCompleteCallback;
        this.f66018d = userStateService;
        this.f66019e = eventManager;
        this.f66020f = presenterPinalyticsFactory;
        this.f66016b = networkStateStream;
        this.f66021g = prefsManagerUser;
    }
}
