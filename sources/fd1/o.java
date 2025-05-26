package fd1;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.wy0;
import com.pinterest.component.modal.BaseModalViewWrapper;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import so.a5;
import so.c5;
import so.oa;
import so.r8;
import so.s8;
import so.y4;

/* loaded from: classes5.dex */
public final class o extends yk1.l implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61956a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final SendableObject f61957b;

    /* renamed from: c, reason: collision with root package name */
    public final int f61958c;

    /* renamed from: d, reason: collision with root package name */
    public final p32.c f61959d;

    /* renamed from: e, reason: collision with root package name */
    public final dl1.s f61960e;

    /* renamed from: f, reason: collision with root package name */
    public Context f61961f;

    /* renamed from: g, reason: collision with root package name */
    public nx.j0 f61962g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f61963h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f61964i;

    /* renamed from: j, reason: collision with root package name */
    public Object f61965j;

    public /* synthetic */ o(SendableObject sendableObject, dl1.s sVar, int i13, p32.c cVar) {
        this(sendableObject, sVar, i13, cVar, new i91.a0());
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        int i13 = this.f61956a;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                jc0.n nVar = new jc0.n(context);
                this.f61962g = ((nx.m) nVar.C()).a(this);
                this.f61961f = context;
                s sVar = new s(context, this.f61958c, nVar, this.f61960e);
                this.f61964i = sVar;
                nVar.x(sVar);
                s8 s8Var = (s8) ((n) me.o.a(bs1.c.k0(context), n.class));
                m60.w y53 = s8Var.y5();
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(y53, "<set-?>");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(y53, "<set-?>");
                        break;
                }
                y4 y4Var = (y4) s8Var.f114475rd.get();
                Intrinsics.checkNotNullParameter(y4Var, "<set-?>");
                this.f61965j = y4Var;
                nVar.T(false);
                nVar.Z(0, 0, 0, 0);
                return nVar;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                jc0.n nVar2 = new jc0.n(context);
                this.f61962g = ((nx.m) nVar2.C()).a(this);
                this.f61961f = context;
                nx.j0 j0Var = this.f61962g;
                if (j0Var == null) {
                    Intrinsics.r("pinalytics");
                    throw null;
                }
                w wVar = new w(context, j0Var, this.f61958c, this.f61960e, (dl1.s) this.f61963h);
                this.f61964i = wVar;
                nVar2.x(wVar);
                s8 s8Var2 = (s8) ((u) me.o.a(bs1.c.k0(context), u.class));
                m60.w y54 = s8Var2.y5();
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(y54, "<set-?>");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(y54, "<set-?>");
                        break;
                }
                c5 c5Var = (c5) s8Var2.f114490sd.get();
                Intrinsics.checkNotNullParameter(c5Var, "<set-?>");
                this.f61965j = c5Var;
                nVar2.T(false);
                return nVar2;
        }
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        switch (this.f61956a) {
            case 0:
                y4 y4Var = (y4) this.f61965j;
                if (y4Var == null) {
                    Intrinsics.r("inviteModalPresenterFactory");
                    throw null;
                }
                Context context = this.f61961f;
                if (context == null) {
                    Intrinsics.r("context");
                    throw null;
                }
                nx.j0 j0Var = this.f61962g;
                if (j0Var == null) {
                    Intrinsics.r("pinalytics");
                    throw null;
                }
                r8 r8Var = y4Var.f114720a;
                yk1.j jVar = (yk1.j) r8Var.f114090a.Qc.get();
                oa oaVar = r8Var.f114090a;
                m60.w wVar = (m60.w) oaVar.f113885r0.get();
                uk1.e eVar = (uk1.e) oaVar.f113702ga.get();
                a5 a5Var = (a5) r8Var.f114091b.f114461qd.get();
                lz1.c H1 = oa.H1(oaVar);
                ed1.e eVar2 = new ed1.e(context, j0Var, this.f61959d, this.f61957b, this.f61958c, jVar, wVar, eVar, a5Var, H1);
                Intrinsics.checkNotNullParameter(eVar2, "<set-?>");
                return eVar2;
            default:
                c5 c5Var = (c5) this.f61965j;
                if (c5Var == null) {
                    Intrinsics.r("postFollowModalPresenterFactory");
                    throw null;
                }
                nx.j0 j0Var2 = this.f61962g;
                if (j0Var2 == null) {
                    Intrinsics.r("pinalytics");
                    throw null;
                }
                r8 r8Var2 = c5Var.f113361a;
                ed1.f fVar = new ed1.f(j0Var2, this.f61957b, (m60.w) r8Var2.f114090a.f113885r0.get(), oa.H1(r8Var2.f114090a), 0);
                Intrinsics.checkNotNullParameter(fVar, "<set-?>");
                return fVar;
        }
    }

    @Override // nx.a
    public final h32.i0 generateLoggingContext() {
        a4 a4Var;
        a4 a4Var2;
        int i13 = this.f61956a;
        switch (i13) {
            case 0:
                d4 viewType = getViewType();
                switch (i13) {
                    case 0:
                        a4Var = a4.SEND_SHARE_MAIN;
                        break;
                    default:
                        a4Var = a4.SEND_SHARE_MAIN;
                        break;
                }
                return new h32.i0(viewType, a4Var, null, null, null, null);
            default:
                d4 viewType2 = getViewType();
                switch (i13) {
                    case 0:
                        a4Var2 = a4.SEND_SHARE_MAIN;
                        break;
                    default:
                        a4Var2 = a4.SEND_SHARE_MAIN;
                        break;
                }
                return new h32.i0(viewType2, a4Var2, null, null, null, null);
        }
    }

    @Override // yk1.l
    public final yk1.n getView() {
        switch (this.f61956a) {
            case 0:
                cd1.a aVar = (cd1.a) this.f61964i;
                if (aVar != null) {
                    return aVar;
                }
                Intrinsics.r("inviteView");
                throw null;
            default:
                cd1.b bVar = (cd1.b) this.f61964i;
                if (bVar != null) {
                    return bVar;
                }
                Intrinsics.r("postFollowView");
                throw null;
        }
    }

    @Override // jc0.a0
    public final d4 getViewType() {
        switch (this.f61956a) {
            case 0:
                break;
            default:
                SendableObject sendableObject = this.f61957b;
                if (!sendableObject.g() || !sendableObject.h()) {
                    break;
                } else {
                    break;
                }
        }
        return d4.SEND_SHARE;
    }

    public o(SendableObject sendableObject, int i13, p32.c inviteCategory, wy0 model, dl1.s viewedUser) {
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(viewedUser, "viewedUser");
        this.f61957b = sendableObject;
        this.f61958c = i13;
        this.f61959d = inviteCategory;
        this.f61960e = model;
        this.f61963h = viewedUser;
    }

    public o(SendableObject sendableObject, dl1.s model, int i13, p32.c inviteCategory, i91.a0 sendShareState) {
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(sendShareState, "sendShareState");
        this.f61957b = sendableObject;
        this.f61960e = model;
        this.f61958c = i13;
        this.f61959d = inviteCategory;
        this.f61963h = sendShareState;
    }
}
