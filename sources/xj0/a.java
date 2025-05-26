package xj0;

import bk0.c;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.c9;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import h32.c1;
import h32.f1;
import h32.v0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import nx.b0;
import nx.d1;
import org.json.JSONArray;
import uk1.d;

/* loaded from: classes5.dex */
public final class a extends d {

    /* renamed from: g, reason: collision with root package name */
    public final d1 f135152g;

    /* renamed from: h, reason: collision with root package name */
    public final b0 f135153h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f135154i;

    /* renamed from: j, reason: collision with root package name */
    public String f135155j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(java.lang.String r3, nx.d1 r4, nx.f0 r5, nx.b0 r6) {
        /*
            r2 = this;
            java.lang.String r0 = "objectId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "_trackingParamAttacher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "pinAuxHelper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            e3.a r0 = new e3.a
            r1 = 5
            r0.<init>(r1)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r2.<init>(r3, r0, r5)
            r2.f135152g = r4
            r2.f135153h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xj0.a.<init>(java.lang.String, nx.d1, nx.f0, nx.b0):void");
    }

    public static void l(HashMap hashMap, int i13, List list) {
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            jSONArray.put(cVar.f23148a);
            String str = null;
            c9 c9Var = cVar.f23149b;
            jSONArray2.put(c9Var != null ? Long.valueOf((long) c9Var.f().doubleValue()) : null);
            jSONArray3.put(c9Var != null ? c9Var.d() : null);
            if (c9Var != null) {
                str = c9Var.e();
            }
            jSONArray4.put(str);
        }
        String jSONArray5 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray5, "toString(...)");
        hashMap.put("board_title_list", jSONArray5);
        String jSONArray6 = jSONArray2.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray6, "toString(...)");
        hashMap.put("board_title_id_list", jSONArray6);
        String jSONArray7 = jSONArray3.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray7, "toString(...)");
        hashMap.put("board_title_score_list", jSONArray7);
        String jSONArray8 = jSONArray4.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray8, "toString(...)");
        hashMap.put("board_title_kind_list", jSONArray8);
        hashMap.put("selected_board_title_index", String.valueOf(i13));
    }

    public final void m(String boardUid, String str, f30 repinnedPin) {
        c1 c1Var;
        String i03;
        Intrinsics.checkNotNullParameter(repinnedPin, "repinnedPin");
        Intrinsics.checkNotNullParameter(boardUid, "boardUid");
        HashMap o13 = this.f135153h.o(repinnedPin, boardUid);
        if (o13 == null) {
            o13 = new HashMap();
        }
        HashMap hashMap = o13;
        if (b40.X0(repinnedPin) && (i03 = b40.i0(repinnedPin)) != null) {
            hashMap.put(SbaPinRep.AUX_DATA_VIDEO_ID, i03);
        }
        if (str != null) {
            String uid = repinnedPin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            c1Var = u2.O(uid, str);
        } else {
            c1Var = null;
        }
        c1 c1Var2 = c1Var;
        f1 f1Var = f1.PIN_REPIN;
        String uid2 = repinnedPin.getUid();
        v0 v0Var = new v0();
        v0Var.G = this.f135152g.b(repinnedPin);
        this.f122379a.H(f1Var, uid2, c1Var2, hashMap, v0Var, false);
    }

    @Override // uk1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap f63135d0 = super.getF63135d0();
        if (f63135d0 == null) {
            f63135d0 = new HashMap();
        }
        String str = this.f135155j;
        if (str != null) {
            f63135d0.put("save_session_id", str);
        }
        return f63135d0;
    }
}
