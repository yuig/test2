package oe;

import df.j1;
import df.u0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import le.g0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f94200a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f94201b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f94202c;

    static {
        d dVar = d.ANON_ID;
        t tVar = t.USER_DATA;
        Pair pair = new Pair(dVar, new j(tVar, u.ANON_ID));
        Pair pair2 = new Pair(d.APP_USER_ID, new j(tVar, u.FB_LOGIN_ID));
        Pair pair3 = new Pair(d.ADVERTISER_ID, new j(tVar, u.MAD_ID));
        Pair pair4 = new Pair(d.PAGE_ID, new j(tVar, u.PAGE_ID));
        Pair pair5 = new Pair(d.PAGE_SCOPED_USER_ID, new j(tVar, u.PAGE_SCOPED_USER_ID));
        d dVar2 = d.ADV_TE;
        t tVar2 = t.APP_DATA;
        f94200a = z0.g(pair, pair2, pair3, pair4, pair5, new Pair(dVar2, new j(tVar2, u.ADV_TE)), new Pair(d.APP_TE, new j(tVar2, u.APP_TE)), new Pair(d.CONSIDER_VIEWS, new j(tVar2, u.CONSIDER_VIEWS)), new Pair(d.DEVICE_TOKEN, new j(tVar2, u.DEVICE_TOKEN)), new Pair(d.EXT_INFO, new j(tVar2, u.EXT_INFO)), new Pair(d.INCLUDE_DWELL_DATA, new j(tVar2, u.INCLUDE_DWELL_DATA)), new Pair(d.INCLUDE_VIDEO_DATA, new j(tVar2, u.INCLUDE_VIDEO_DATA)), new Pair(d.INSTALL_REFERRER, new j(tVar2, u.INSTALL_REFERRER)), new Pair(d.INSTALLER_PACKAGE, new j(tVar2, u.INSTALLER_PACKAGE)), new Pair(d.RECEIPT_DATA, new j(tVar2, u.RECEIPT_DATA)), new Pair(d.URL_SCHEMES, new j(tVar2, u.URL_SCHEMES)), new Pair(d.USER_DATA, new j(tVar, null)));
        Pair pair6 = new Pair(w.EVENT_TIME, new i(null, r.EVENT_TIME));
        Pair pair7 = new Pair(w.EVENT_NAME, new i(null, r.EVENT_NAME));
        w wVar = w.VALUE_TO_SUM;
        t tVar3 = t.CUSTOM_DATA;
        f94201b = z0.g(pair6, pair7, new Pair(wVar, new i(tVar3, r.VALUE_TO_SUM)), new Pair(w.CONTENT_IDS, new i(tVar3, r.CONTENT_IDS)), new Pair(w.CONTENTS, new i(tVar3, r.CONTENTS)), new Pair(w.CONTENT_TYPE, new i(tVar3, r.CONTENT_TYPE)), new Pair(w.CURRENCY, new i(tVar3, r.CURRENCY)), new Pair(w.DESCRIPTION, new i(tVar3, r.DESCRIPTION)), new Pair(w.LEVEL, new i(tVar3, r.LEVEL)), new Pair(w.MAX_RATING_VALUE, new i(tVar3, r.MAX_RATING_VALUE)), new Pair(w.NUM_ITEMS, new i(tVar3, r.NUM_ITEMS)), new Pair(w.PAYMENT_INFO_AVAILABLE, new i(tVar3, r.PAYMENT_INFO_AVAILABLE)), new Pair(w.REGISTRATION_METHOD, new i(tVar3, r.REGISTRATION_METHOD)), new Pair(w.SEARCH_STRING, new i(tVar3, r.SEARCH_STRING)), new Pair(w.SUCCESS, new i(tVar3, r.SUCCESS)), new Pair(w.ORDER_ID, new i(tVar3, r.ORDER_ID)), new Pair(w.AD_TYPE, new i(tVar3, r.AD_TYPE)));
        f94202c = z0.g(new Pair("fb_mobile_achievement_unlocked", s.UNLOCKED_ACHIEVEMENT), new Pair("fb_mobile_activate_app", s.ACTIVATED_APP), new Pair("fb_mobile_add_payment_info", s.ADDED_PAYMENT_INFO), new Pair("fb_mobile_add_to_cart", s.ADDED_TO_CART), new Pair("fb_mobile_add_to_wishlist", s.ADDED_TO_WISHLIST), new Pair("fb_mobile_complete_registration", s.COMPLETED_REGISTRATION), new Pair("fb_mobile_content_view", s.VIEWED_CONTENT), new Pair("fb_mobile_initiated_checkout", s.INITIATED_CHECKOUT), new Pair("fb_mobile_level_achieved", s.ACHIEVED_LEVEL), new Pair("fb_mobile_purchase", s.PURCHASED), new Pair("fb_mobile_rate", s.RATED), new Pair("fb_mobile_search", s.SEARCHED), new Pair("fb_mobile_spent_credits", s.SPENT_CREDITS), new Pair("fb_mobile_tutorial_completion", s.COMPLETED_TUTORIAL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.HashMap] */
    public static final Object a(Object value, String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        l.Companion.getClass();
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        l lVar = Intrinsics.d(rawValue, d.EXT_INFO.getRawValue()) ? l.ARRAY : Intrinsics.d(rawValue, d.URL_SCHEMES.getRawValue()) ? l.ARRAY : Intrinsics.d(rawValue, w.CONTENT_IDS.getRawValue()) ? l.ARRAY : Intrinsics.d(rawValue, w.CONTENTS.getRawValue()) ? l.ARRAY : Intrinsics.d(rawValue, h.OPTIONS.getRawValue()) ? l.ARRAY : Intrinsics.d(rawValue, d.ADV_TE.getRawValue()) ? l.BOOL : Intrinsics.d(rawValue, d.APP_TE.getRawValue()) ? l.BOOL : Intrinsics.d(rawValue, w.EVENT_TIME.getRawValue()) ? l.INT : null;
        String str = value instanceof String ? (String) value : null;
        if (lVar == null || str == null) {
            return value;
        }
        int i13 = m.f94197a[lVar.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    return StringsKt.toIntOrNull(value.toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            Integer intOrNull = StringsKt.toIntOrNull(str);
            if (intOrNull != null) {
                return Boolean.valueOf(intOrNull.intValue() != 0);
            }
            return null;
        }
        try {
            ArrayList<??> B = j1.B(new JSONArray(str));
            ArrayList arrayList = new ArrayList();
            for (?? r13 : B) {
                try {
                    try {
                        r13 = j1.C(new JSONObject((String) r13));
                    } catch (JSONException unused) {
                        r13 = j1.B(new JSONArray((String) r13));
                    }
                } catch (JSONException unused2) {
                }
                arrayList.add(r13);
            }
            return arrayList;
        } catch (JSONException e13) {
            wc.b bVar = u0.f54860d;
            wc.b.y(g0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e13);
            return Unit.f80348a;
        }
    }
}
