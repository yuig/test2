package w01;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import df.j1;
import h32.a4;
import h32.c1;
import h32.c2;
import h32.d4;
import h32.e2;
import h32.f1;
import h32.v0;
import h32.w0;
import h32.w3;
import h32.x3;
import i01.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kh2.u2;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import nx.d1;

/* loaded from: classes5.dex */
public final class f extends uk1.d implements e1 {

    /* renamed from: g, reason: collision with root package name */
    public final e f126998g;

    /* renamed from: h, reason: collision with root package name */
    public final String f126999h;

    /* renamed from: i, reason: collision with root package name */
    public final d4 f127000i;

    /* renamed from: j, reason: collision with root package name */
    public final a4 f127001j;

    /* renamed from: k, reason: collision with root package name */
    public final d1 f127002k;

    /* renamed from: l, reason: collision with root package name */
    public final k11.k f127003l;

    /* renamed from: m, reason: collision with root package name */
    public final nx.b0 f127004m;

    /* renamed from: n, reason: collision with root package name */
    public final ur.a f127005n;

    /* renamed from: o, reason: collision with root package name */
    public f30 f127006o;

    /* renamed from: p, reason: collision with root package name */
    public nq.b f127007p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String objectId, e eVar, String str, nx.f0 pinalyticsFactory, d1 trackingParamAttacher, k11.k repinSessionDataManager, nx.b0 pinAuxHelper, ur.a adsCoreDependencies) {
        super(objectId, new e3.a(5), pinalyticsFactory);
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(repinSessionDataManager, "repinSessionDataManager");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        this.f126998g = eVar;
        this.f126999h = str;
        this.f127000i = null;
        this.f127001j = null;
        this.f127002k = trackingParamAttacher;
        this.f127003l = repinSessionDataManager;
        this.f127004m = pinAuxHelper;
        this.f127005n = adsCoreDependencies;
        this.f127007p = nq.b.CLICK;
    }

    @Override // i01.e1
    public final void b(f30 repinnedPin, f30 f30Var, String boardId, int i13, boolean z13, List suggestedBoards, String str, String str2) {
        Boolean bool;
        v0 v0Var;
        Short o13;
        String i03;
        Intrinsics.checkNotNullParameter(repinnedPin, "repinnedPin");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(suggestedBoards, "suggestedBoards");
        HashMap o14 = this.f127004m.o(repinnedPin, boardId);
        if (o14 == null) {
            o14 = new HashMap();
        }
        HashMap hashMap = o14;
        if (b40.X0(repinnedPin) && (i03 = b40.i0(repinnedPin)) != null) {
            hashMap.put(SbaPinRep.AUX_DATA_VIDEO_ID, i03);
        }
        if (f30Var != null && !Intrinsics.d(repinnedPin.c4(), f30Var.c4())) {
            String c43 = repinnedPin.c4();
            if (c43 != null) {
                hashMap.put("original_pin_description", c43);
            }
            String c44 = f30Var.c4();
            if (c44 != null) {
                hashMap.put("repinned_pin_description", c44);
            }
        }
        hashMap.put("is_profile_save", String.valueOf(z13));
        hashMap.put("grid_index", String.valueOf(i13));
        String uid = repinnedPin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        hashMap.put("pin_id", uid);
        hashMap.put("save_session_id", this.f127003l.f78148a.f78145a);
        f30 f30Var2 = this.f127006o;
        String sh3 = (this.f127007p == nq.b.SWIPE || f30Var2 == null || (o13 = ((es.v) ((ur.b) this.f127005n).f123060c).o(f30Var2)) == null) ? null : o13.toString();
        if (sh3 != null) {
            hashMap.put("parent_dl_ad_closeup_ingress_variant", sh3);
        }
        String b13 = this.f127002k.b(repinnedPin);
        if (b13 != null) {
            bool = Boolean.valueOf(b13.length() > 0);
        } else {
            bool = null;
        }
        Intrinsics.f(bool);
        if (bool.booleanValue()) {
            v0 v0Var2 = new v0();
            v0Var2.G = b13;
            v0Var = v0Var2;
        } else {
            v0Var = null;
        }
        String uid2 = repinnedPin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        c1 O = u2.O(uid2, str2);
        nx.d0 d0Var = this.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        d0Var.H(f1.PIN_REPIN, repinnedPin.getUid(), O, hashMap, v0Var, false);
    }

    @Override // uk1.d, nx.i1
    public final h32.g0 b2() {
        return h32.g0.PIN_CLOSEUP;
    }

    @Override // uk1.d, nx.i1
    public final w0 e() {
        f30 f30Var = this.f127006o;
        e eVar = this.f126998g;
        String str = eVar != null ? eVar.f126995a : null;
        if ((str == null || str.length() == 0) && f30Var != null) {
            str = this.f127002k.b(f30Var);
        }
        String str2 = str;
        z0.d();
        return new w0(null, null, null, null, z0.d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, f30Var != null ? f30Var.d5() : null, null, null, null, null, null, str2, null, null, null, null);
    }

    @Override // uk1.d
    public final x3 h(String str) {
        x3 h10 = super.h(str);
        w3 w3Var = h10 == null ? new w3() : new w3(h10);
        f30 f30Var = this.f127006o;
        if (f30Var != null) {
            Set set = b40.f35967a;
            Intrinsics.checkNotNullParameter(f30Var, "<this>");
            List a03 = b40.a0(f30Var);
            ArrayList arrayList = new ArrayList();
            Iterator it = a03.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                e2.Companion.getClass();
                e2 a13 = c2.a(intValue);
                if (a13 != null) {
                    arrayList.add(a13);
                }
            }
            w3Var.f67368g = arrayList;
        }
        return w3Var.a();
    }

    @Override // uk1.d
    public final a4 i() {
        a4 a4Var = this.f127001j;
        return a4Var == null ? super.i() : a4Var;
    }

    @Override // uk1.d
    public final d4 j() {
        d4 d4Var = this.f127000i;
        return d4Var == null ? super.j() : d4Var;
    }

    public final void l(nq.b type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f127007p = type;
    }

    public final void m(f30 f30Var) {
        this.f127006o = f30Var;
    }

    @Override // uk1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        String uid;
        Short o13;
        String i03;
        f30 f30Var = this.f127006o;
        if (f30Var == null) {
            return super.getF63135d0();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f127004m.c(f30Var, linkedHashMap);
        v7 D3 = f30Var.D3();
        if (D3 != null && kh2.d.L0(D3)) {
            linkedHashMap.put("is_screenshot_repin", "true");
        }
        linkedHashMap.put("closeup_navigation_type", this.f127007p.getType());
        if (b40.X0(f30Var) && (i03 = b40.i0(f30Var)) != null) {
        }
        if (b40.Q0(f30Var)) {
            String w63 = f30Var.w6();
            if (w63 == null) {
                w63 = "";
            }
            linkedHashMap.put("story_pin_data_id", w63);
        }
        if (j1.F1(f30Var) && b40.m0(f30Var)) {
            linkedHashMap.put("rating_value", String.valueOf(b40.W(f30Var)));
        }
        String str = this.f126999h;
        if (str != null) {
            linkedHashMap.put("current_page_url", str);
        }
        f30 f30Var2 = this.f127006o;
        String str2 = null;
        if (f30Var2 != null && f30Var2.V4()) {
            f30 f30Var3 = this.f127006o;
            linkedHashMap.put("is_go_linkless", String.valueOf(f30Var3 != null ? f30Var3.U4() : null));
        }
        f30 f30Var4 = this.f127006o;
        if (this.f127007p != nq.b.SWIPE && f30Var4 != null && (o13 = ((es.v) ((ur.b) this.f127005n).f123060c).o(f30Var4)) != null) {
            str2 = o13.toString();
        }
        if (str2 != null) {
            linkedHashMap.put("parent_dl_ad_closeup_ingress_variant", str2);
        }
        f30 f30Var5 = this.f127006o;
        if (f30Var5 != null && (uid = f30Var5.getUid()) != null) {
            linkedHashMap.put("dl_ad_closeup_parent_object_id", uid);
        }
        return linkedHashMap;
    }
}
