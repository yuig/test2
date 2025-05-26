package au0;

import a42.o;
import android.app.Application;
import android.content.Context;
import android.graphics.Matrix;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.aq0;
import com.pinterest.api.model.er;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.oq;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.uq;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.ideaPinCreation.closeup.view.n;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.screens.d2;
import cp.b0;
import dl1.l;
import dl1.t;
import go0.r;
import h32.u0;
import j1.v1;
import java.util.ArrayList;
import java.util.List;
import k22.m;
import kh2.k3;
import kh2.p2;
import kh2.s0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kt0.x;
import lq0.g1;
import m60.w;
import m60.x0;
import nx.d0;
import ou0.k;
import rq.y;
import sq0.c0;
import tb0.p;
import wk1.q;
import yk1.v;

/* loaded from: classes5.dex */
public final class d extends q implements k {

    /* renamed from: a, reason: collision with root package name */
    public final t f20475a;

    /* renamed from: b, reason: collision with root package name */
    public final ag1.b f20476b;

    /* renamed from: c, reason: collision with root package name */
    public final ag1.h f20477c;

    /* renamed from: d, reason: collision with root package name */
    public final w f20478d;

    /* renamed from: e, reason: collision with root package name */
    public final i92.k f20479e;

    /* renamed from: f, reason: collision with root package name */
    public final tb0.h f20480f;

    /* renamed from: g, reason: collision with root package name */
    public final m f20481g;

    /* renamed from: h, reason: collision with root package name */
    public final bw0.f f20482h;

    /* renamed from: i, reason: collision with root package name */
    public final v f20483i;

    /* renamed from: j, reason: collision with root package name */
    public final b60.b f20484j;

    /* renamed from: k, reason: collision with root package name */
    public ln0 f20485k;

    /* renamed from: l, reason: collision with root package name */
    public ln0 f20486l;

    /* renamed from: m, reason: collision with root package name */
    public final zt0.b f20487m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(du0.b presenterPinalytics, uj2.q networkStateStream, t storyPinLocalDataRepository, ag1.b ideaPinComposeDataManager, ag1.h sessionDataManager, w eventManager, i92.k toastUtils, tb0.h crashReporting, m userService, bw0.f ideaPinWorkUtils, v viewResources, b60.b activeUserManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(ideaPinComposeDataManager, "ideaPinComposeDataManager");
        Intrinsics.checkNotNullParameter(sessionDataManager, "sessionDataManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(ideaPinWorkUtils, "ideaPinWorkUtils");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f20475a = storyPinLocalDataRepository;
        this.f20476b = ideaPinComposeDataManager;
        this.f20477c = sessionDataManager;
        this.f20478d = eventManager;
        this.f20479e = toastUtils;
        this.f20480f = crashReporting;
        this.f20481g = userService;
        this.f20482h = ideaPinWorkUtils;
        this.f20483i = viewResources;
        this.f20484j = activeUserManager;
        this.f20487m = new zt0.b(ideaPinComposeDataManager.d(), storyPinLocalDataRepository, presenterPinalytics, this, this, this, this);
    }

    public static void I3(d dVar, String str) {
        ln0 ln0Var;
        boolean z13 = str != null;
        if (z13) {
            dVar.getPinalytics().X(u0.STORY_PIN_CREATE_PRODUCT_THUMBNAIL);
        } else {
            dVar.getPinalytics().X(u0.STORY_PIN_PRODUCT_TAGGING_BUTTON);
        }
        tp u33 = dVar.u3();
        if (u33 != null) {
            i92.k kVar = dVar.f20479e;
            if (!z13 && u33.K() >= 5) {
                kVar.h(aq1.h.product_tag_limit_per_idea_pin_page);
                return;
            }
            int i13 = 20;
            if (!z13 && (ln0Var = dVar.f20486l) != null && ln0Var.E() >= 20) {
                kVar.h(aq1.h.product_tag_limit_per_pin);
                return;
            }
            b60.d dVar2 = (b60.d) dVar.f20484j;
            wy0 f13 = dVar2.f();
            if (f13 == null || !Intrinsics.d(f13.c3(), Boolean.FALSE)) {
                ((com.pinterest.feature.ideaPinCreation.closeup.view.q) ((yt0.d) dVar.getView())).Z8(str, false);
                return;
            }
            wy0 f14 = dVar2.f();
            if (f14 != null) {
                String uid = f14.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                xj2.c o13 = dVar.f20481g.w(uid, n00.b.a(n00.c.USER_HAS_CONFIRMED_EMAIL_FIELDS)).r(tk2.e.f118017c).l(wj2.c.a()).o(new x(i13, new r(dVar, str, (Object) null, 12)), new x(21, new y(6, f14)));
                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                dVar.addDisposable(o13);
            }
        }
    }

    @Override // wk1.q, yk1.p
    /* renamed from: B3, reason: merged with bridge method [inline-methods] */
    public final void r3(yt0.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        int i13 = 0;
        addDisposable(((l) this.f20475a).S(this.f20476b.d()).F(new x(22, new b(this, i13)), new x(23, new b(this, 1)), ck2.i.f27923c, ck2.i.f27924d));
        com.pinterest.feature.ideaPinCreation.closeup.view.q qVar = (com.pinterest.feature.ideaPinCreation.closeup.view.q) view;
        RecyclerView g83 = qVar.g8();
        if (g83 != null) {
            g83.post(new v.k(qVar, i13, 11));
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        qVar.F0 = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        qVar.G0 = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        qVar.H0 = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        qVar.I0 = this;
    }

    public final void D3(String viewId, uq overlayType) {
        Intrinsics.checkNotNullParameter(viewId, "viewId");
        Intrinsics.checkNotNullParameter(overlayType, "overlayType");
        tp u33 = u3();
        if (u33 != null) {
            List overlayBlocks = u33.getOverlayBlocks();
            ArrayList arrayList = new ArrayList();
            for (Object obj : overlayBlocks) {
                if (!Intrinsics.d(((qq) obj).getConfig().getId(), viewId)) {
                    arrayList.add(obj);
                }
            }
            x3(tp.e(u33, null, null, null, null, null, arrayList, null, null, null, null, null, null, 4063));
        }
    }

    public final void F3(String colorHex) {
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        tp u33 = u3();
        if (u33 != null) {
            x3(tp.e(u33, null, colorHex, null, null, null, null, null, null, null, null, null, null, 4093));
        }
    }

    public final void G3(String text, String fontId, float f13, aq0 textAlignment, String colorHex, er highlightType, Matrix matrix, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontId, "fontId");
        Intrinsics.checkNotNullParameter(textAlignment, "textAlignment");
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        Intrinsics.checkNotNullParameter(highlightType, "highlightType");
        tp u33 = u3();
        if (u33 != null) {
            Pair o03 = u33.o0(str, new v1(text, fontId, f13, textAlignment, highlightType), new g1(26, colorHex, matrix));
            tp tpVar = (tp) o03.f80346a;
            oq oqVar = (oq) o03.f80347b;
            x3(tpVar);
            ln0 ln0Var = this.f20486l;
            if (ln0Var != null) {
                ln0 a13 = ln0.a(ln0Var, null, null, null, null, null, null, false, oqVar.getConfig().getId(), null, null, null, 15871);
                this.f20486l = a13;
                ((l) this.f20475a).W(a13);
            }
        }
    }

    public final void H3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ln0 ln0Var = this.f20486l;
        tp pageData = ln0Var != null ? ln0Var.getPageData() : null;
        if (pageData == null) {
            J3(x0.try_again);
            this.f20480f.q(new IllegalStateException("Page data is null when attempting to navigate to finishing touches"), "IdeaPinCreationCloseupPresenter: attempt to publish empty local pages list", p.IDEA_PINS_CREATION);
            return;
        }
        byte b13 = 0;
        byte b14 = 0;
        if (p2.Q0(pageData, new a(this, 0))) {
            if (this.f20477c.f15145a.f15150e == fg1.b.FINISHING_TOUCHES_FIRST) {
                com.pinterest.feature.ideaPinCreation.closeup.view.q qVar = (com.pinterest.feature.ideaPinCreation.closeup.view.q) ((yt0.d) getView());
                if (qVar.X8()) {
                    qVar.D5();
                    return;
                } else {
                    qVar.M1(com.pinterest.feature.ideaPinCreation.closeup.view.q.V8(qVar, d2.n()));
                    return;
                }
            }
            return;
        }
        GestaltButton gestaltButton = ((com.pinterest.feature.ideaPinCreation.closeup.view.q) ((yt0.d) getView())).N0;
        if (gestaltButton == null) {
            Intrinsics.r("nextGestaltButton");
            throw null;
        }
        gestaltButton.d(new rn0.d(b14 == true ? 1 : 0, 22));
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        addDisposable(new kk2.h(s0.E((Application) applicationContext, context, pageData, k3.a0(this.f20486l), null).l(wj2.c.a()), new b0(this, 18), 1).o(new x(24, new c(pageData, this, b13 == true ? 1 : 0)), new x(25, new b(this, 3))));
    }

    public final void J3(int i13) {
        this.f20479e.i(((yk1.a) this.f20483i).f139224a.getString(i13));
    }

    @Override // ou0.k
    public final void O(List pathList) {
        Intrinsics.checkNotNullParameter(pathList, "pathList");
        tp u33 = u3();
        if (u33 != null) {
            x3(tp.e(u33, null, null, null, null, null, null, null, null, null, pathList, null, null, 3583));
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f20487m);
    }

    public final void t3() {
        this.f20482h.b();
    }

    public final tp u3() {
        ln0 ln0Var = this.f20486l;
        if (ln0Var != null) {
            return ln0Var.getPageData();
        }
        return null;
    }

    public final boolean v3(boolean z13) {
        if (!z13) {
            return true;
        }
        return true ^ Intrinsics.d(this.f20476b.f15132e, this.f20486l);
    }

    public final void w3() {
        ln0 ln0Var = this.f20486l;
        if (ln0Var == null || !ln0Var.G()) {
            return;
        }
        String localAdjustedImagePath = ln0Var.y().getLocalAdjustedImagePath();
        if (localAdjustedImagePath == null || localAdjustedImagePath.length() == 0) {
            yt0.d dVar = (yt0.d) getView();
            String draftId = this.f20476b.d();
            com.pinterest.feature.ideaPinCreation.closeup.view.q qVar = (com.pinterest.feature.ideaPinCreation.closeup.view.q) dVar;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(draftId, "draftId");
            d0 s73 = qVar.s7();
            Context requireContext = qVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            uv0.k.b(s73, requireContext, draftId, new n(qVar, 0), 8);
        }
    }

    public final void x3(tp tpVar) {
        ln0 ln0Var = this.f20486l;
        if (ln0Var == null) {
            return;
        }
        ln0 J2 = ln0Var.J(tpVar, true);
        this.f20486l = J2;
        ((l) this.f20475a).W(J2);
    }

    public final void z3(String productPinId, a42.f storyPinBlockType, o variantType) {
        Intrinsics.checkNotNullParameter(productPinId, "productPinId");
        Intrinsics.checkNotNullParameter(storyPinBlockType, "storyPinBlockType");
        Intrinsics.checkNotNullParameter(variantType, "variantType");
        tp u33 = u3();
        if (u33 != null) {
            Pair l03 = storyPinBlockType == a42.f.PRODUCT_STICKER ? tp.l0(u33, productPinId, null, false, 12) : u33.p0(productPinId);
            tp tpVar = (tp) l03.f80346a;
            qq qqVar = (qq) l03.f80347b;
            x3(tpVar);
            this.f20478d.d(new hv0.e(qqVar.getConfig().getId()));
        }
    }
}
