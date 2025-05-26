package j22;

import android.content.Context;
import android.content.res.Resources;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import x02.j2;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f74522a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f74523b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f74524c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f74525d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f74526e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f74527f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f74528g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f74529h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f74530i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f74531j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f74532k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f74533l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f74534m;

    /* renamed from: n, reason: collision with root package name */
    public static final List f74535n;

    /* renamed from: o, reason: collision with root package name */
    public static final List f74536o;

    static {
        Context context = kb0.a.f79058b;
        Resources resources = f0.W().getResources();
        String string = resources.getString(j2.typeahead_max_users);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        f74522a = string;
        String string2 = resources.getString(j2.people_picker_max_users);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        f74523b = string2;
        String string3 = resources.getString(j2.multiobject_search_max_objects_phone);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        f74524c = string3;
        String string4 = resources.getString(j2.multiobject_search_max_pins_phone);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        f74525d = string4;
        String string5 = resources.getString(j2.search_recent_searches_no_bubbles);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        f74526e = string5;
        String string6 = resources.getString(j2.multiobject_search_max_pins_tablet);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        f74527f = string6;
        String string7 = resources.getString(j2.multiobject_search_max_objects_tablet);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        f74528g = string7;
        String string8 = resources.getString(j2.search_max_history);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        f74529h = string8;
        String string9 = resources.getString(j2.search_max_history_single_tab_phone);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        f74530i = string9;
        String string10 = resources.getString(j2.search_max_history_single_tab_tablet);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        f74531j = string10;
        String string11 = resources.getString(j2.trending_max_queries);
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        f74532k = string11;
        Intrinsics.checkNotNullExpressionValue(resources.getString(j2.typeahead_max_objects_single_tab), "getString(...)");
        String string12 = resources.getString(j2.typeahead_autocomplete_suggestions_single_tab_phone);
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        f74533l = string12;
        String string13 = resources.getString(j2.typeahead_autocomplete_suggestions_single_tab_tablet);
        Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
        f74534m = string13;
        f74535n = kotlin.collections.f0.j("facebook_pinner", "mutual_follow", "follower", "twitter_pinner", "google_pinner", "yahoo_pinner", "gplus_pinner", "address_book_pinner", "second_degree_follower");
        f74536o = kotlin.collections.f0.j("google_non_pinner", "yahoo_non_pinner");
    }
}
