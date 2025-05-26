package g11;

import bp1.h;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import h32.f1;
import h32.g0;
import h32.u0;
import h32.v0;
import i01.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kh2.u2;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import nx.b0;
import nx.d0;
import nx.d1;
import nx.f0;
import org.json.JSONArray;
import org.json.JSONObject;
import ou1.b;
import uk1.d;

/* loaded from: classes5.dex */
public final class a extends d implements e1 {

    /* renamed from: g, reason: collision with root package name */
    public final d1 f63363g;

    /* renamed from: h, reason: collision with root package name */
    public final b0 f63364h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f63365i;

    /* renamed from: j, reason: collision with root package name */
    public String f63366j;

    /* renamed from: k, reason: collision with root package name */
    public g0 f63367k;

    /* renamed from: l, reason: collision with root package name */
    public String f63368l;

    /* renamed from: m, reason: collision with root package name */
    public String f63369m;

    /* renamed from: n, reason: collision with root package name */
    public String f63370n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d1 trackingParamAttacher, f0 pinalyticsFactory, b0 pinAuxHelper) {
        super(pinalyticsFactory);
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f63363g = trackingParamAttacher;
        this.f63364h = pinAuxHelper;
        this.f63367k = g0.MODAL_ADD_PIN;
    }

    public static String l(BoardFeed suggestedBoardNamesFeed) {
        Intrinsics.checkNotNullParameter(suggestedBoardNamesFeed, "suggestedBoardNamesFeed");
        JSONArray jSONArray = new JSONArray();
        for (v7 v7Var : suggestedBoardNamesFeed.q()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("board_title", v7Var.j1());
            jSONObject.put("board_title_kind", v7Var.A1());
            Double y13 = v7Var.y1();
            Intrinsics.checkNotNullExpressionValue(y13, "getSuggestionConfidence(...)");
            jSONObject.put("board_title_score", y13.doubleValue());
            Double z13 = v7Var.z1();
            Intrinsics.checkNotNullExpressionValue(z13, "getSuggestionTitleId(...)");
            jSONObject.put("board_title_id", z13.doubleValue());
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    public static void p(HashMap hashMap, String str, List list, BoardFeed boardFeed, String str2) {
        if (str != null) {
            hashMap.put("pin_id", str);
        }
        h.w(hashMap, list);
        if (boardFeed != null && !boardFeed.x()) {
            hashMap.put("board_title_suggestions", l(boardFeed));
        }
        if (str2 != null) {
            hashMap.put("image_signature", str2);
        }
    }

    @Override // i01.e1
    public final void b(f30 pin, f30 f30Var, String boardId, int i13, boolean z13, List suggestedBoards, String str, String str2) {
        v0 v0Var;
        String i03;
        Intrinsics.checkNotNullParameter(pin, "repinnedPin");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(suggestedBoards, "suggestedBoards");
        d0 pinalytics = this.f122379a;
        Intrinsics.checkNotNullExpressionValue(pinalytics, "getPinalytics(...)");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        d1 trackingParamAttacher = this.f63363g;
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pin, "repinnedPin");
        b0 pinAuxHelper = this.f63364h;
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        pinAuxHelper.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        HashMap p13 = b0.p(pinAuxHelper, pin, i13, boardId);
        if (p13 == null) {
            p13 = new HashMap();
        }
        HashMap hashMap = p13;
        if (b40.X0(pin) && (i03 = b40.i0(pin)) != null) {
            hashMap.put(SbaPinRep.AUX_DATA_VIDEO_ID, i03);
        }
        if (f30Var != null && !Intrinsics.d(pin.c4(), f30Var.c4())) {
            String c43 = pin.c4();
            if (c43 != null) {
                hashMap.put("original_pin_description", c43);
            }
            String c44 = f30Var.c4();
            if (c44 != null) {
                hashMap.put("repinned_pin_description", c44);
            }
        }
        h.w(hashMap, suggestedBoards);
        hashMap.put("is_profile_save", String.valueOf(z13));
        hashMap.put("grid_index", String.valueOf(i13));
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        hashMap.put("pin_id", uid);
        if (str != null) {
            hashMap.put("save_session_id", str);
        }
        String b13 = trackingParamAttacher.b(pin);
        if (b13 == null || b13.length() == 0) {
            v0Var = null;
        } else {
            v0 v0Var2 = new v0();
            v0Var2.G = b13;
            v0Var = v0Var2;
        }
        String uid2 = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        pinalytics.H(f1.PIN_REPIN, pin.getUid(), u2.O(uid2, str2), hashMap, v0Var, false);
    }

    @Override // uk1.d
    public final g0 f() {
        return this.f63367k;
    }

    public final void m(String str, ArrayList suggestedBoards, BoardFeed boardFeed, String str2) {
        Intrinsics.checkNotNullParameter(suggestedBoards, "suggestedBoards");
        HashMap f63135d0 = getF63135d0();
        f63135d0.put("source", b.BOARD_PICKER.getValue());
        p(f63135d0, str, suggestedBoards, boardFeed, str2);
        this.f122379a.h0(f1.TAP, u0.BOARD_ACTION_CREATE_BUTTON, g0.MODAL_ADD_PIN, str, f63135d0, null, null, false);
    }

    public final void n(f1 eventType, int i13, BoardFeed suggestedBoardNamesFeed, v7 v7Var, String str, String str2) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(suggestedBoardNamesFeed, "suggestedBoardNamesFeed");
        HashMap f63135d0 = getF63135d0();
        f63135d0.put("board_component", "BOARD_PICKER_BOARD_TITLE_SUGGESTION");
        if (i13 >= 0) {
            f63135d0.put("board_index", String.valueOf(i13));
        }
        p(f63135d0, str, q0.f80391a, suggestedBoardNamesFeed, str2);
        this.f122379a.h0(eventType, u0.BOARD_CREATE_SUGGESTED, g0.MODAL_ADD_PIN, v7Var != null ? v7Var.getUid() : null, f63135d0, null, null, false);
    }

    public final void o(f1 eventType, String str, ArrayList suggestedBoards, BoardFeed boardFeed, String str2, String str3) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(suggestedBoards, "suggestedBoards");
        HashMap f63135d0 = getF63135d0();
        f63135d0.put("board_component", "BOARD_PICKER_PROFILE_BOARD");
        if (str2 == null) {
            str2 = "";
        }
        f63135d0.put("save_session_id", str2);
        p(f63135d0, str, suggestedBoards, boardFeed, str3);
        d0 d0Var = this.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        d0Var.g(eventType, str, f63135d0, false);
    }

    @Override // uk1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap hashMap = new HashMap();
        HashMap f63135d0 = super.getF63135d0();
        if (f63135d0 != null) {
            hashMap = f63135d0;
        }
        Boolean bool = this.f63365i;
        if (bool != null) {
            hashMap.put("is_draft", String.valueOf(bool));
        }
        String str = this.f63366j;
        if (str != null) {
            hashMap.put("entry_type", str);
        }
        String str2 = this.f63368l;
        if (str2 != null) {
            hashMap.put("save_session_id", str2);
        }
        String str3 = this.f63369m;
        if (str3 != null) {
            hashMap.put("board_picker_surface_origin", str3);
        }
        String str4 = this.f63370n;
        if (str4 != null) {
            hashMap.put("user_action", str4);
        }
        return hashMap;
    }
}
