package ka1;

import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.s;
import com.pinterest.screens.z3;
import h32.f1;
import h32.u0;
import i92.g;
import i92.k;
import ja1.e;
import kk2.t;
import kotlin.jvm.internal.Intrinsics;
import la1.j;
import la1.p;
import m60.w;
import m60.x0;
import nx.d0;
import q91.h;
import sq0.c0;
import t3.s1;
import wj2.c;
import wk1.i;
import wk1.q;
import x10.d;
import yk1.v;
import zp.b0;

/* loaded from: classes5.dex */
public final class b extends q {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f78924a;

    /* renamed from: b, reason: collision with root package name */
    public final k f78925b;

    /* renamed from: c, reason: collision with root package name */
    public final v f78926c;

    /* renamed from: d, reason: collision with root package name */
    public final w f78927d;

    /* renamed from: e, reason: collision with root package name */
    public final d f78928e;

    /* renamed from: f, reason: collision with root package name */
    public final s f78929f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f78930g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f78931h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f78932i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f78933j;

    /* renamed from: k, reason: collision with root package name */
    public final String f78934k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003c, code lost:
    
        if (r3 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(uk1.d r2, uj2.q r3, com.pinterest.api.model.wy0 r4, i92.k r5, yk1.a r6, m60.w r7, x10.d r8, com.pinterest.framework.screens.s r9) {
        /*
            r1 = this;
            java.lang.String r0 = "pinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "networkStateStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "toastUtils"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "viewResources"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "eventManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "settingsApi"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r1.<init>(r2, r3)
            r1.f78924a = r4
            r1.f78925b = r5
            r1.f78926c = r6
            r1.f78927d = r7
            r1.f78928e = r8
            r1.f78929f = r9
            r2 = 0
            if (r4 == 0) goto L3e
            com.pinterest.api.model.v10 r3 = r4.Y3()
            if (r3 == 0) goto L3b
            java.lang.Boolean r3 = r3.I()
            goto L3c
        L3b:
            r3 = r2
        L3c:
            if (r3 != 0) goto L40
        L3e:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        L40:
            boolean r3 = r3.booleanValue()
            r1.f78930g = r3
            if (r4 == 0) goto L4d
            java.util.List r3 = r4.u2()
            goto L4e
        L4d:
            r3 = r2
        L4e:
            java.util.Collection r3 = (java.util.Collection) r3
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L5d
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L5b
            goto L5d
        L5b:
            r3 = r5
            goto L5e
        L5d:
            r3 = r6
        L5e:
            r1.f78931h = r3
            if (r4 == 0) goto L66
            java.util.List r2 = r4.u2()
        L66:
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L70
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L71
        L70:
            r5 = r6
        L71:
            r2 = r5 ^ 1
            r1.f78933j = r2
            if (r4 == 0) goto L7d
            java.lang.String r2 = r4.z4()
            if (r2 != 0) goto L7f
        L7d:
            java.lang.String r2 = ""
        L7f:
            r1.f78934k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka1.b.<init>(uk1.d, uj2.q, com.pinterest.api.model.wy0, i92.k, yk1.a, m60.w, x10.d, com.pinterest.framework.screens.s):void");
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(new e(0, this.f78924a));
    }

    @Override // wk1.q
    public final void loadData() {
        t r13 = this.f78928e.f131564a.g().l(c.a()).r(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        nl.b.q(r13, new a(this, 0), new a(this, 1));
        super.loadData();
    }

    public final void onBackPressed() {
        getPinalytics().X(u0.BACK_BUTTON);
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        ((p) ((ia1.a) getView())).D0 = null;
        super.onUnbind();
    }

    public final void t3() {
        int i13 = this.f78933j ? b52.c.close_multiple_accounts_confirmation_toast : b52.c.delete_account_email_confirmation_toast;
        s sVar = this.f78929f;
        if (sVar != null) {
            ScreenDescription k13 = sVar.k();
            Class f44666a = ((ScreenLocation) z3.f51678d.getValue()).getF44666a();
            if (!Intrinsics.d(k13.getScreenClass(), f44666a)) {
                sVar.B(k13, new h(f44666a, 20));
            }
        }
        this.f78927d.d(new i92.i(new g(s1.d(new Object[]{this.f78934k}, 1, ((yk1.a) this.f78926c).f139224a.getString(i13), "format(...)"), 7000)));
    }

    @Override // wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(ia1.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        p pVar = (p) view;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        pVar.D0 = this;
    }

    public final void v3() {
        getPinalytics().X(u0.CONTINUE_BUTTON);
        d0.v(getPinalytics(), f1.USER_DELETE_REQUEST, null, false, 12);
        boolean z13 = this.f78932i;
        k kVar = this.f78925b;
        if (z13) {
            kVar.i(((yk1.a) this.f78926c).f139224a.getString(x0.oops_something_went_wrong));
        }
        boolean z14 = this.f78931h;
        w wVar = this.f78927d;
        if (!z14) {
            wVar.d(new jc0.v(new j(this.f78930g || this.f78933j), false, 0L, 30));
            return;
        }
        try {
            wVar.d(new jc0.v(new b0(this.f78924a, this.f78928e, this), false, 0L, 30));
        } catch (Exception e13) {
            kVar.i(e13.getMessage());
        }
    }
}
