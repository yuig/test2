package go0;

import cb2.x;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.d40;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hb;
import com.pinterest.api.model.md0;
import com.pinterest.api.model.v7;
import java.lang.ref.WeakReference;
import jc0.v;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import nx.d1;
import x02.d2;
import x02.i2;

/* loaded from: classes5.dex */
public final class l extends rk2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f65870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f65871c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f65872d;

    public /* synthetic */ l(int i13, Object obj, Object obj2) {
        this.f65870b = i13;
        this.f65871c = obj;
        this.f65872d = obj2;
    }

    @Override // uj2.d
    public final void a() {
        String str;
        String str2;
        nl1.d a13;
        ho0.b bVar = ho0.b.f69683k;
        int i13 = this.f65870b;
        Object obj = this.f65872d;
        Object obj2 = this.f65871c;
        switch (i13) {
            case 0:
                m mVar = (m) obj2;
                boolean z13 = mVar.f65890z;
                String str3 = mVar.f65873i;
                if (z13 && (str = mVar.A) != null) {
                    v7 v33 = mVar.v3(str3 == null ? "" : str3);
                    if (v33 != null) {
                        pe.i.s1(mVar.f65876l, str, v33);
                    }
                }
                String str4 = (String) obj;
                m.B3(mVar, str3 == null ? "" : str3, null, str4, hb.BULK_PIN_MOVE, 2);
                if (mVar.isBound()) {
                    ba u33 = mVar.u3(str4);
                    v7 w33 = mVar.w3();
                    if (u33 != null && w33 != null) {
                        fo0.b bVar2 = (fo0.b) mVar.getView();
                        String uid = w33.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        String A = u33.A();
                        Intrinsics.checkNotNullExpressionValue(A, "getTitle(...)");
                        String j13 = w33.j1();
                        Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                        ((ho0.k) bVar2).m9(str4, mVar.f65887w.size(), uid, A, j13);
                    }
                    ((ho0.k) ((fo0.b) mVar.getView())).Y6(bVar);
                    mVar.f65877m.d(new md0());
                    return;
                }
                return;
            case 1:
                m mVar2 = (m) obj2;
                if (mVar2.f65890z && (str2 = mVar2.A) != null) {
                    String uid2 = ((v7) obj).getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    v7 v34 = mVar2.v3(uid2);
                    if (v34 != null) {
                        pe.i.s1(mVar2.f65876l, str2, v34);
                    }
                }
                String str5 = mVar2.f65873i;
                if (str5 == null) {
                    str5 = "";
                }
                v7 v7Var = (v7) obj;
                m.B3(mVar2, str5, v7Var.getUid(), null, hb.BULK_PIN_MOVE, 4);
                if (mVar2.isBound()) {
                    fo0.b bVar3 = (fo0.b) mVar2.getView();
                    String uid3 = v7Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                    String j14 = v7Var.j1();
                    Intrinsics.checkNotNullExpressionValue(j14, "getName(...)");
                    ((ho0.k) bVar3).n9(uid3, mVar2.f65887w.size(), j14, v7Var.b1());
                    ((ho0.k) ((fo0.b) mVar2.getView())).Y6(bVar);
                    mVar2.f65877m.d(new md0());
                    return;
                }
                return;
            case 2:
                k11.d dVar = (k11.d) obj;
                if (dVar.f78120a.get() != null) {
                    WeakReference weakReference = dVar.f78120a;
                    if (((k11.e) weakReference.get()).isBound()) {
                        d2 d2Var = (d2) obj2;
                        ((k11.e) weakReference.get()).h4(d2Var.f131320a, dVar.f78121b, d2Var.f131332m, d2Var.f131324e);
                        return;
                    }
                    return;
                }
                return;
            default:
                x xVar = (x) obj2;
                f30 f30Var = xVar.I;
                if (f30Var == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                b40.Z0(f30Var, d40.TRANSITION);
                f30 f30Var2 = xVar.I;
                if (f30Var2 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                e30 R6 = f30Var2.R6();
                R6.n0(Boolean.TRUE);
                f30 a14 = R6.a();
                Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                xVar.f27378a.W(a14);
                gb2.f fVar = gb2.f.f64747a;
                f30 f30Var3 = xVar.I;
                if (f30Var3 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                String uid4 = f30Var3.getUid();
                Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                wa2.p pVar = wa2.p.STATE_HIDDEN;
                gb2.f.c(new gb2.i(uid4, pVar, wa2.o.UI_ONLY));
                f30 f30Var4 = xVar.I;
                if (f30Var4 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                String pinFeedbackModalPinId = f30Var4.getUid();
                Intrinsics.checkNotNullExpressionValue(pinFeedbackModalPinId, "getUid(...)");
                f30 f30Var5 = xVar.I;
                if (f30Var5 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                if (!n60.o.B(f30Var5, "getIsPromoted(...)") && (((a13 = xVar.a()) != null && a13.H7()) || (xVar.k() && Intrinsics.d(xVar.d(), "feed_home")))) {
                    gb2.f.c(new gb2.i(pinFeedbackModalPinId, wa2.p.STATE_FILTER_PIN, wa2.o.EVENT_ONLY));
                } else {
                    gb2.f.c(new gb2.i(pinFeedbackModalPinId, pVar, wa2.o.EVENT_ONLY));
                }
                uk1.d presenterPinalytics = (uk1.d) obj;
                xVar.f27391n.getClass();
                Intrinsics.checkNotNullParameter(pinFeedbackModalPinId, "pinFeedbackModalPinId");
                Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
                wk2.a networkStateStream = xVar.f27393p;
                Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
                i2 pinRepository = xVar.f27378a;
                Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
                x10.b pinApiService = xVar.f27390m;
                Intrinsics.checkNotNullParameter(pinApiService, "pinApiService");
                n1 experiments = xVar.f27387j;
                Intrinsics.checkNotNullParameter(experiments, "experiments");
                js0.a hideRemoteRequest = xVar.f27394q;
                Intrinsics.checkNotNullParameter(hideRemoteRequest, "hideRemoteRequest");
                d1 trackingParamAttacher = xVar.f27383f;
                Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
                Object obj3 = networkStateStream.get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                xVar.f27379b.d(new v(new gs0.f(pinFeedbackModalPinId, presenterPinalytics, null, null, null, (uj2.q) obj3, pinRepository, pinApiService, experiments, hideRemoteRequest, trackingParamAttacher), true, 0L, 28));
                return;
        }
    }

    @Override // uj2.d
    public final void onError(Throwable e13) {
        int i13 = this.f65870b;
        Object obj = this.f65871c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(e13, "e");
                m mVar = (m) obj;
                if (mVar.isBound()) {
                    ((ho0.d) ((fo0.b) mVar.getView())).setLoadState(yk1.i.LOADED);
                }
                e13.getMessage();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(e13, "e");
                m mVar2 = (m) obj;
                if (mVar2.isBound()) {
                    ((ho0.d) ((fo0.b) mVar2.getView())).setLoadState(yk1.i.LOADED);
                }
                e13.getMessage();
                break;
            case 2:
                k11.d dVar = (k11.d) this.f65872d;
                if (((k11.e) dVar.f78120a.get()).isBound()) {
                    ((k11.e) dVar.f78120a.get()).w3(e13.getMessage());
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(e13, "throwable");
                i92.k kVar = ((x) obj).f27380c;
                String message = e13.getMessage();
                if (message != null) {
                    e13 = message;
                }
                kVar.e("Got error: " + e13);
                break;
        }
    }

    public l(k11.d dVar, d2 d2Var) {
        this.f65870b = 2;
        this.f65872d = dVar;
        this.f65871c = d2Var;
    }
}
