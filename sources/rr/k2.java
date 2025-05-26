package rr;

import android.net.Uri;
import android.text.TextUtils;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k2 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "story_feed";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String str;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter4 = uri.getQueryParameter("feed_type");
        String str2 = null;
        String y13 = queryParameter4 != null ? pp2.a.y(queryParameter4) : null;
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.A());
        w13.m0("com.pinterest.STRUCTURED_FEED_ENDPOINT", y13);
        HashMap hashMap = this.f109727e;
        String str3 = hashMap != null ? (String) hashMap.get("search_query") : null;
        if (str3 != null) {
            w13.m0("search_query", str3);
        }
        String str4 = hashMap != null ? (String) hashMap.get("source") : null;
        if (str4 != null) {
            w13.m0("source", str4);
        }
        String str5 = hashMap != null ? (String) hashMap.get("shop_source") : null;
        if (str5 == null || str5.length() == 0) {
            str5 = uri.getQueryParameter("shop_source");
        }
        w13.m0("shop_source", str5);
        String str6 = hashMap != null ? (String) hashMap.get("source_identifier") : null;
        if (str6 != null) {
            w13.m0("source_identifier", str6);
        }
        if (hashMap == null || (queryParameter = (String) hashMap.get("com.pinterest.STRUCTURED_FEED_TITLE")) == null) {
            queryParameter = uri.getQueryParameter("full_feed_title");
        }
        if (queryParameter != null) {
            w13.m0("com.pinterest.STRUCTURED_FEED_TITLE", queryParameter);
        }
        String queryParameter5 = uri.getQueryParameter("full_feed_subtitle");
        if (queryParameter5 == null) {
            queryParameter5 = hashMap != null ? (String) hashMap.get("com.pinterest.STRUCTURED_FEED_SUBTITLE") : null;
        }
        if (queryParameter5 != null) {
            w13.m0("com.pinterest.STRUCTURED_FEED_SUBTITLE", queryParameter5);
        }
        String queryParameter6 = uri.getQueryParameter("quick_save_icon");
        if (queryParameter6 != null && TextUtils.isDigitsOnly(queryParameter6)) {
            w13.z(Integer.parseInt(queryParameter6), "com.pinterest.STRUCTURED_FEED_QUICK_SAVE_ICON");
        }
        String queryParameter7 = uri.getQueryParameter("request_params");
        if (queryParameter7 == null) {
            queryParameter7 = hashMap != null ? (String) hashMap.get("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS") : null;
        }
        if (queryParameter7 != null) {
            w13.m0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", queryParameter7);
        }
        String str7 = hashMap != null ? (String) hashMap.get("com.pinterest.STRUCTURED_FEED_MERCHANT_IMAGE") : null;
        if (str7 != null) {
            w13.m0("com.pinterest.STRUCTURED_FEED_MERCHANT_IMAGE", str7);
        }
        String str8 = hashMap != null ? (String) hashMap.get("com.pinterest.STRUCTURED_FEED_MERCHANT_NAME") : null;
        if (str8 != null) {
            w13.m0("com.pinterest.STRUCTURED_FEED_MERCHANT_NAME", str8);
        }
        String str9 = hashMap != null ? (String) hashMap.get("com.pinterest.STRUCTURED_FEED_MERCHANT_USER_ID") : null;
        if (str9 != null) {
            w13.m0("com.pinterest.STRUCTURED_FEED_MERCHANT_USER_ID", str9);
        }
        w13.Y1("com.pinterest.STRUCTURED_FEED_MERCHANT_VERIFICATION", (hashMap == null || (str = (String) hashMap.get("com.pinterest.STRUCTURED_FEED_MERCHANT_VERIFICATION")) == null) ? false : Boolean.parseBoolean(str));
        String queryParameter8 = uri.getQueryParameter("view_parameter");
        if (queryParameter8 == null) {
            queryParameter8 = hashMap != null ? (String) hashMap.get("com.pinterest.STRUCTURED_FEED_VIEW_PARAMETER") : null;
        }
        if (queryParameter8 != null && TextUtils.isDigitsOnly(queryParameter8)) {
            w13.z(Integer.parseInt(queryParameter8), "com.pinterest.STRUCTURED_FEED_VIEW_PARAMETER");
        }
        String queryParameter9 = uri.getQueryParameter("pins_display");
        if (queryParameter9 == null) {
            queryParameter9 = hashMap != null ? (String) hashMap.get("com.pinterest.STRUCTURED_FEED_PINS_DISPLAY") : null;
        }
        if (queryParameter9 != null && TextUtils.isDigitsOnly(queryParameter9)) {
            w13.z(Integer.parseInt(queryParameter9), "com.pinterest.STRUCTURED_FEED_PINS_DISPLAY");
        }
        if (hashMap == null || (queryParameter2 = (String) hashMap.get("com.pinterest.STRUCTURED_FEED_USER_REP_STYLE")) == null) {
            queryParameter2 = uri.getQueryParameter("user_rep_style");
        }
        if (queryParameter2 != null && TextUtils.isDigitsOnly(queryParameter2)) {
            w13.z(Integer.parseInt(queryParameter2), "com.pinterest.STRUCTURED_FEED_USER_REP_STYLE");
        }
        if (hashMap == null || (queryParameter3 = (String) hashMap.get("com.pinterest.STRUCTURED_FEED_EXPLORE_ARTICLE_REP_STYLE")) == null) {
            queryParameter3 = uri.getQueryParameter("explore_article_rep_style");
        }
        if (queryParameter3 != null && TextUtils.isDigitsOnly(queryParameter3)) {
            w13.z(Integer.parseInt(queryParameter3), "com.pinterest.STRUCTURED_FEED_EXPLORE_ARTICLE_REP_STYLE");
        }
        String str10 = hashMap != null ? (String) hashMap.get("com.pinterest.STRUCTURED_FEED_LANDING_PAGE_IMAGES") : null;
        if (str10 != null) {
            w13.m0("com.pinterest.STRUCTURED_FEED_LANDING_PAGE_IMAGES", str10);
        }
        String queryParameter10 = uri.getQueryParameter("landing_page_header_style");
        if (queryParameter10 != null) {
            str2 = queryParameter10;
        } else if (hashMap != null) {
            str2 = (String) hashMap.get("com.pinterest.STRUCTURED_FEED_LANDING_PAGE_HEADER_STYLE");
        }
        if (str2 != null) {
            w13.z(Integer.parseInt(str2), "com.pinterest.STRUCTURED_FEED_LANDING_PAGE_HEADER_STYLE");
        }
        this.f109723a.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("feed_type");
        return (!Intrinsics.d(uri.getHost(), "story_feed") || queryParameter == null || queryParameter.length() == 0) ? false : true;
    }
}
