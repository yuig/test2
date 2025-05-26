package rr;

import android.net.Uri;
import android.text.TextUtils;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h0 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "story_feed";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        Intrinsics.checkNotNullParameter(uri, "uri");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.A());
        w13.m0("com.pinterest.STRUCTURED_FEED_ENDPOINT", "feeds/pinterest_picks/");
        HashMap hashMap = this.f109727e;
        String str = null;
        String str2 = hashMap != null ? (String) hashMap.get("search_query") : null;
        if (str2 != null) {
            w13.m0("search_query", str2);
        }
        String str3 = hashMap != null ? (String) hashMap.get("source") : null;
        if (str3 != null) {
            w13.m0("source", str3);
        }
        String str4 = hashMap != null ? (String) hashMap.get("shop_source") : null;
        if (str4 == null || str4.length() == 0) {
            str4 = uri.getQueryParameter("shop_source");
        }
        w13.m0("shop_source", str4);
        String str5 = hashMap != null ? (String) hashMap.get("source_identifier") : null;
        if (str5 != null) {
            w13.m0("source_identifier", str5);
        }
        if (hashMap == null || (queryParameter = (String) hashMap.get("com.pinterest.STRUCTURED_FEED_TITLE")) == null) {
            queryParameter = uri.getQueryParameter("full_feed_title");
        }
        if (queryParameter != null) {
            w13.m0("com.pinterest.STRUCTURED_FEED_TITLE", queryParameter);
        }
        String queryParameter4 = uri.getQueryParameter("full_feed_subtitle");
        if (queryParameter4 == null) {
            queryParameter4 = hashMap != null ? (String) hashMap.get("com.pinterest.STRUCTURED_FEED_SUBTITLE") : null;
        }
        if (queryParameter4 != null) {
            w13.m0("com.pinterest.STRUCTURED_FEED_SUBTITLE", queryParameter4);
        }
        String queryParameter5 = uri.getQueryParameter("quick_save_icon");
        if (queryParameter5 != null && TextUtils.isDigitsOnly(queryParameter5)) {
            w13.z(Integer.parseInt(queryParameter5), "com.pinterest.STRUCTURED_FEED_QUICK_SAVE_ICON");
        }
        String queryParameter6 = uri.getQueryParameter("request_params");
        if (queryParameter6 == null) {
            queryParameter6 = hashMap != null ? (String) hashMap.get("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS") : null;
        }
        if (queryParameter6 != null) {
            w13.m0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", queryParameter6);
        }
        String queryParameter7 = uri.getQueryParameter("view_parameter");
        if (queryParameter7 == null) {
            queryParameter7 = hashMap != null ? (String) hashMap.get("com.pinterest.STRUCTURED_FEED_VIEW_PARAMETER") : null;
        }
        if (queryParameter7 != null && TextUtils.isDigitsOnly(queryParameter7)) {
            w13.z(Integer.parseInt(queryParameter7), "com.pinterest.STRUCTURED_FEED_VIEW_PARAMETER");
        }
        String queryParameter8 = uri.getQueryParameter("pins_display");
        if (queryParameter8 == null) {
            queryParameter8 = hashMap != null ? (String) hashMap.get("com.pinterest.STRUCTURED_FEED_PINS_DISPLAY") : null;
        }
        if (queryParameter8 != null && TextUtils.isDigitsOnly(queryParameter8)) {
            w13.z(Integer.parseInt(queryParameter8), "com.pinterest.STRUCTURED_FEED_PINS_DISPLAY");
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
        String str6 = hashMap != null ? (String) hashMap.get("com.pinterest.STRUCTURED_FEED_LANDING_PAGE_IMAGES") : null;
        if (str6 != null) {
            w13.m0("com.pinterest.STRUCTURED_FEED_LANDING_PAGE_IMAGES", str6);
        }
        String queryParameter9 = uri.getQueryParameter("landing_page_header_style");
        if (queryParameter9 != null) {
            str = queryParameter9;
        } else if (hashMap != null) {
            str = (String) hashMap.get("com.pinterest.STRUCTURED_FEED_LANDING_PAGE_HEADER_STYLE");
        }
        if (str != null) {
            w13.z(Integer.parseInt(str), "com.pinterest.STRUCTURED_FEED_LANDING_PAGE_HEADER_STYLE");
        }
        this.f109723a.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.d(uri.getHost(), "filtered_hf");
    }
}
