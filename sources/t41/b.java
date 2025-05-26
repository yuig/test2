package t41;

import android.content.res.Resources;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.button.view.GestaltButton;
import h32.f1;
import i92.k;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nr0.e;
import nr0.m;
import nx.d0;
import nz1.f;
import qa2.n;
import s42.j;
import so.n6;
import uk1.d;
import wk1.c;
import yk1.v;

/* loaded from: classes5.dex */
public final class b extends u42.b implements s41.b {

    /* renamed from: g, reason: collision with root package name */
    public final k f116413g;

    /* renamed from: h, reason: collision with root package name */
    public final b60.b f116414h;

    /* renamed from: i, reason: collision with root package name */
    public final w f116415i;

    /* renamed from: j, reason: collision with root package name */
    public final String f116416j;

    /* renamed from: k, reason: collision with root package name */
    public final String f116417k;

    /* renamed from: l, reason: collision with root package name */
    public final t42.b f116418l;

    /* renamed from: m, reason: collision with root package name */
    public final a f116419m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String userId, k toastUtils, v viewResources, c params, m dynamicGridViewBinderDelegateFactory, b60.b activeUserManager, w eventManager) {
        super(viewResources, params);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f116413g = toastUtils;
        this.f116414h = activeUserManager;
        this.f116415i = eventManager;
        int i13 = f.organize_into_boards;
        Resources resources = ((yk1.a) viewResources).f139224a;
        this.f116416j = resources.getString(i13);
        this.f116417k = resources.getString(j.organize_into_boards_subheading);
        String k13 = a.a.k("users/", userId, "/boardless/pins/");
        String a13 = n00.b.a(n00.c.BASE_PIN_FEED);
        n nVar = params.f130131b;
        d presenterPinalytics = getPresenterPinalytics();
        n nVar2 = params.f130131b;
        this.f116418l = new t42.b(k13, a13, nVar, ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics, nVar2.f103320a, nVar2, params.f130137h), this, viewResources, "");
        this.f116419m = new a(this);
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: B3, reason: merged with bridge method [inline-methods] */
    public final void r3(s41.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((e) view);
        s41.c cVar = (s41.c) getViewIfBound();
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(this, "listener");
            ((s41.f) cVar).f111137f1 = this;
        }
        x3();
        String subheadingText = z3();
        if (subheadingText != null) {
            t42.a aVar = this.f120493e;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(subheadingText, "subheadingText");
            s42.f fVar = aVar.f116420h;
            fVar.f111144b = subheadingText;
            aVar.u1(0, fVar);
        }
        s41.c cVar2 = (s41.c) getViewIfBound();
        if (cVar2 != null) {
            boolean z13 = !this.f120492d.isEmpty();
            GestaltButton gestaltButton = ((s41.f) cVar2).f111138g1;
            if (gestaltButton == null) {
                Intrinsics.r("nextButton");
                throw null;
            }
            gestaltButton.d(new i31.a(z13, 12));
        }
        this.f116415i.h(this.f116419m);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D3() {
        /*
            r5 = this;
            java.util.Set r0 = r5.f120492d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            i92.k r0 = r5.f116413g
            int r1 = nz1.f.empty_board_add_pins
            r0.h(r1)
            return
        L10:
            nx.d0 r0 = r5.getPinalytics()
            h32.u0 r1 = h32.u0.BOARDLESS_PIN_ORGANIZE_DONE_BUTTON
            r0.X(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r1 = r5.f120492d
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.g0.q(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()
            com.pinterest.api.model.f30 r3 = (com.pinterest.api.model.f30) r3
            java.lang.String r3 = r3.getUid()
            r2.add(r3)
            goto L31
        L45:
            r0.addAll(r2)
            b60.b r1 = r5.f116414h
            b60.d r1 = (b60.d) r1
            com.pinterest.api.model.wy0 r1 = r1.f()
            java.lang.String r2 = "com.pinterest.EXTRA_SOURCE"
            java.lang.String r3 = "com.pinterest.EXTRA_SELECTED_PIN_IDS_LIST"
            if (r1 == 0) goto L7f
            java.lang.Integer r1 = r1.t2()
            java.lang.String r4 = "getBoardCount(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            int r1 = r1.intValue()
            r4 = 2
            if (r1 >= r4) goto L7f
            xk2.v r1 = com.pinterest.screens.i3.f50986t
            java.lang.Object r1 = r1.getValue()
            com.pinterest.framework.screens.ScreenLocation r1 = (com.pinterest.framework.screens.ScreenLocation) r1
            com.pinterest.navigation.NavigationImpl r1 = com.pinterest.navigation.Navigation.w1(r1)
            r1.d(r3, r0)
            ou1.b r0 = ou1.b.UNORGANIZED_PIN
            java.lang.String r0 = r0.getValue()
            r1.m0(r2, r0)
            goto Lb5
        L7f:
            xk2.v r1 = com.pinterest.screens.i3.f50977k
            java.lang.Object r1 = r1.getValue()
            com.pinterest.framework.screens.ScreenLocation r1 = (com.pinterest.framework.screens.ScreenLocation) r1
            java.lang.String r4 = ""
            com.pinterest.navigation.NavigationImpl r1 = com.pinterest.navigation.Navigation.z0(r1, r4)
            r1.d(r3, r0)
            java.lang.String r0 = "com.pinterest.EXTRA_SHOW_PARENT_BOARD"
            r3 = 0
            r1.Y1(r0, r3)
            java.lang.String r0 = "com.pinterest.EXTRA_LOAD_ALL_BOARDS"
            r4 = 1
            r1.Y1(r0, r4)
            java.lang.String r0 = "com.pinterest.EXTRA_IS_SELECT_ALL_MODE_ACTIVE"
            r1.Y1(r0, r3)
            hk0.m r0 = hk0.m.PROFILE
            java.lang.String r0 = r0.toString()
            r1.m0(r2, r0)
            ou1.b r0 = ou1.b.UNORGANIZED_PIN
            java.lang.String r0 = r0.getValue()
            java.lang.String r2 = "com.pinterest.EXTRA_ENTRY_SOURCE"
            r1.m0(r2, r0)
        Lb5:
            boolean r0 = r5.isBound()
            if (r0 == 0) goto Lc6
            yk1.n r0 = r5.getView()
            s41.c r0 = (s41.c) r0
            nl1.d r0 = (nl1.d) r0
            r0.M1(r1)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t41.b.D3():void");
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        this.f116415i.j(this.f116419m);
        super.onUnbind();
    }

    @Override // u42.b
    public final String u3() {
        return this.f116416j;
    }

    @Override // u42.b
    public final t42.b v3() {
        return this.f116418l;
    }

    @Override // u42.b, s42.k
    public final void z0(f30 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        f1 f1Var = H0(model) ? f1.PIN_DESELECTION : f1.PIN_SELECTION;
        super.z0(model);
        d0.B(getPinalytics(), f1Var, null, null, new HashMap(z0.f(new Pair("pin_id", model.getUid()))), 22);
        s41.c cVar = (s41.c) getViewIfBound();
        if (cVar != null) {
            boolean z13 = !this.f120492d.isEmpty();
            GestaltButton gestaltButton = ((s41.f) cVar).f111138g1;
            if (gestaltButton != null) {
                gestaltButton.d(new i31.a(z13, 12));
            } else {
                Intrinsics.r("nextButton");
                throw null;
            }
        }
    }

    public final String z3() {
        return this.f116417k;
    }
}
