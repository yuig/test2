package c71;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.d5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import zd1.c0;

/* loaded from: classes5.dex */
public final class b0 {
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final Map H;
    public final c0 I;

    /* renamed from: J, reason: collision with root package name */
    public final String f26727J;
    public final String K;
    public final String L;
    public final String M;
    public final Boolean N;
    public final String O;
    public final String P;
    public final String Q;
    public final String R;
    public final String S;
    public final List T;
    public final List U;
    public final String V;
    public final String W;
    public final String X;
    public final Boolean Y;
    public final List Z;

    /* renamed from: a, reason: collision with root package name */
    public final h61.h f26728a;

    /* renamed from: a0, reason: collision with root package name */
    public final String f26729a0;

    /* renamed from: b, reason: collision with root package name */
    public final String f26730b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26731c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26732d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26733e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26734f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26735g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26736h;

    /* renamed from: i, reason: collision with root package name */
    public final String f26737i;

    /* renamed from: j, reason: collision with root package name */
    public final String f26738j;

    /* renamed from: k, reason: collision with root package name */
    public final String f26739k;

    /* renamed from: l, reason: collision with root package name */
    public final String f26740l;

    /* renamed from: m, reason: collision with root package name */
    public final String f26741m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f26742n;

    /* renamed from: o, reason: collision with root package name */
    public final Boolean f26743o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f26744p;

    /* renamed from: q, reason: collision with root package name */
    public final List f26745q;

    /* renamed from: r, reason: collision with root package name */
    public final List f26746r;

    /* renamed from: s, reason: collision with root package name */
    public String f26747s;

    /* renamed from: t, reason: collision with root package name */
    public final String f26748t;

    /* renamed from: u, reason: collision with root package name */
    public final String f26749u;

    /* renamed from: v, reason: collision with root package name */
    public final String f26750v;

    /* renamed from: w, reason: collision with root package name */
    public final Map f26751w;

    /* renamed from: x, reason: collision with root package name */
    public final List f26752x;

    /* renamed from: y, reason: collision with root package name */
    public final String f26753y;

    /* renamed from: z, reason: collision with root package name */
    public final String f26754z;

    public b0(h61.h hVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, List list, String str10, String str11, String str12, String str13, List list2, String str14, String str15, String str16, String str17, String str18, String str19, Map map, c0 c0Var, String str20, String str21, String str22, String str23, Boolean bool3, String str24, String str25, String str26, String str27, String str28, List list3, List list4, String str29, String str30, String str31, List list5, String str32, int i13, int i14) {
        this(hVar, str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, null, (i13 & 64) != 0 ? null : str5, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str6, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : str7, (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : str8, (i13 & 1024) != 0 ? "unknown" : str9, null, null, false, (i13 & 16384) != 0 ? null : bool, (i13 & 32768) != 0 ? null : bool2, (i13 & 65536) != 0 ? q0.f80391a : list, q0.f80391a, (262144 & i13) != 0 ? null : str10, (i13 & 524288) != 0 ? null : str11, (i13 & 1048576) != 0 ? null : str12, (2097152 & i13) != 0 ? null : str13, null, (8388608 & i13) != 0 ? null : list2, (16777216 & i13) != 0 ? null : str14, (33554432 & i13) != 0 ? null : str15, null, null, (268435456 & i13) != 0 ? null : str16, null, (1073741824 & i13) != 0 ? null : str17, (i13 & Integer.MIN_VALUE) != 0 ? null : str18, (i14 & 1) != 0 ? null : str19, (i14 & 2) != 0 ? null : map, (i14 & 4) != 0 ? null : c0Var, (i14 & 8) != 0 ? null : str20, (i14 & 16) != 0 ? null : str21, (i14 & 32) != 0 ? null : str22, (i14 & 64) != 0 ? null : str23, (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : bool3, (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : str24, (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : str25, (i14 & 1024) != 0 ? null : str26, (i14 & 2048) != 0 ? null : str27, (i14 & 4096) != 0 ? null : str28, (i14 & 8192) != 0 ? null : list3, (i14 & 16384) != 0 ? null : list4, (i14 & 32768) != 0 ? null : str29, (i14 & 65536) != 0 ? null : str30, (131072 & i14) != 0 ? null : str31, null, (i14 & 524288) != 0 ? null : list5, (i14 & 1048576) != 0 ? null : str32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    public static b0 a(b0 b0Var, h61.h hVar, String str, String str2, String str3, String str4, String str5, boolean z13, String str6, String str7, String str8, Map map, q0 q0Var, c0 c0Var, String str9, String str10, String str11, List list, String str12, String str13, String str14, Boolean bool, List list2, int i13, int i14) {
        Boolean bool2;
        String str15;
        String str16;
        Map map2;
        String str17;
        c0 c0Var2;
        String str18;
        String str19;
        List list3;
        String str20;
        h61.h searchType = (i13 & 1) != 0 ? b0Var.f26728a : hVar;
        String query = (i13 & 2) != 0 ? b0Var.f26730b : str;
        String str21 = (i13 & 4) != 0 ? b0Var.f26731c : str2;
        String str22 = b0Var.f26732d;
        String str23 = b0Var.f26733e;
        String str24 = b0Var.f26734f;
        String str25 = b0Var.f26735g;
        String str26 = b0Var.f26736h;
        String str27 = b0Var.f26737i;
        String str28 = b0Var.f26738j;
        String referrerSource = (i13 & 1024) != 0 ? b0Var.f26739k : str3;
        String str29 = (i13 & 2048) != 0 ? b0Var.f26740l : str4;
        String str30 = (i13 & 4096) != 0 ? b0Var.f26741m : str5;
        boolean z14 = (i13 & 8192) != 0 ? b0Var.f26742n : z13;
        Boolean bool3 = b0Var.f26743o;
        Boolean bool4 = b0Var.f26744p;
        List termMeta = b0Var.f26745q;
        List foodFilters = b0Var.f26746r;
        if ((i13 & 262144) != 0) {
            bool2 = bool4;
            str15 = b0Var.f26747s;
        } else {
            bool2 = bool4;
            str15 = str6;
        }
        String str31 = (i13 & 524288) != 0 ? b0Var.f26748t : str7;
        String str32 = (1048576 & i13) != 0 ? b0Var.f26749u : str8;
        String str33 = b0Var.f26750v;
        if ((i13 & 4194304) != 0) {
            str16 = str33;
            map2 = b0Var.f26751w;
        } else {
            str16 = str33;
            map2 = map;
        }
        q0 q0Var2 = (i13 & 8388608) != 0 ? b0Var.f26752x : q0Var;
        String str34 = b0Var.f26753y;
        String str35 = b0Var.f26754z;
        String str36 = b0Var.A;
        String str37 = b0Var.B;
        String str38 = b0Var.C;
        String str39 = b0Var.D;
        String str40 = b0Var.E;
        String str41 = b0Var.F;
        String str42 = b0Var.G;
        Map map3 = b0Var.H;
        if ((i14 & 4) != 0) {
            str17 = str35;
            c0Var2 = b0Var.I;
        } else {
            str17 = str35;
            c0Var2 = c0Var;
        }
        String str43 = b0Var.f26727J;
        String str44 = b0Var.K;
        if ((i14 & 32) != 0) {
            str18 = str43;
            str19 = b0Var.L;
        } else {
            str18 = str43;
            str19 = str9;
        }
        String str45 = (i14 & 64) != 0 ? b0Var.M : str10;
        Boolean bool5 = b0Var.N;
        String str46 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? b0Var.O : null;
        String str47 = b0Var.P;
        String str48 = b0Var.Q;
        String str49 = b0Var.R;
        String str50 = (i14 & 4096) != 0 ? b0Var.S : str11;
        List list4 = (i14 & 8192) != 0 ? b0Var.T : list;
        List list5 = b0Var.U;
        if ((i14 & 32768) != 0) {
            list3 = list5;
            str20 = b0Var.V;
        } else {
            list3 = list5;
            str20 = str12;
        }
        String str51 = (65536 & i14) != 0 ? b0Var.W : str13;
        String str52 = (131072 & i14) != 0 ? b0Var.X : str14;
        Boolean bool6 = (i14 & 262144) != 0 ? b0Var.Y : bool;
        List list6 = (i14 & 524288) != 0 ? b0Var.Z : list2;
        String str53 = b0Var.f26729a0;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(referrerSource, "referrerSource");
        Intrinsics.checkNotNullParameter(termMeta, "termMeta");
        Intrinsics.checkNotNullParameter(foodFilters, "foodFilters");
        return new b0(searchType, query, str21, str22, str23, str24, str25, str26, str27, str28, referrerSource, str29, str30, z14, bool3, bool2, termMeta, foodFilters, str15, str31, str32, str16, map2, q0Var2, str34, str17, str36, str37, str38, str39, str40, str41, str42, map3, c0Var2, str18, str44, str19, str45, bool5, str46, str47, str48, str49, str50, list4, list3, str20, str51, str52, bool6, list6, str53);
    }

    public static /* synthetic */ NavigationImpl c(b0 b0Var, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        return b0Var.b(z13, null);
    }

    public final NavigationImpl b(boolean z13, Integer num) {
        ScreenLocation screenLocation = z13 ? (ScreenLocation) d5.f50671b.getValue() : (ScreenLocation) d5.f50672c.getValue();
        String str = this.f26730b;
        NavigationImpl w13 = kotlin.text.z.j(str) ? Navigation.w1(screenLocation) : Navigation.z0(screenLocation, str);
        List list = this.f26745q;
        if (!list.isEmpty()) {
            w13.d("com.pinterest.EXTRA_SEARCH_TERM_META", new ArrayList(list));
        }
        if (num != null) {
            w13.z(num.intValue(), "com.pinterest.EXTRA_APPLIED_FILTER_COUNT");
        }
        w13.m0("com.pinterest.EXTRA_SEARCH_REFERRING_SOURCE", this.f26739k);
        w13.m0("com.pinterest.EXTRA_SEARCH_TYPE", this.f26728a.toString());
        w13.y0(this.f26731c, "com.pinterest.EXTRA_SEARCH_ENTERED_QUERY");
        w13.y0(this.f26747s, "com.pinterest.EXTRA_SKIN_TONE_FILTER");
        w13.y0(this.f26748t, "com.pinterest.EXTRA_HAIR_PATTERN_FILTER");
        w13.m0("com.pinterest.EXTRA_BODY_TYPE_FILTER", this.f26749u);
        w13.m0("com.pinterest.EXTRA_COLOR_PALETTE_FILTER", this.f26750v);
        w13.y0(this.f26732d, "com.pinterest.EXTRA_SEARCH_ELAPSE_TIME_SINCE_LAST_FOCUS");
        w13.m0("com.pinterest.EXTRA_HYBRID_SEARCH_PARAMS", this.V);
        String str2 = this.E;
        if (str2 != null) {
            w13.m0("com.pinterest.EXTRA_SHOP_SOURCE", str2);
        }
        Boolean bool = this.f26743o;
        if (bool != null) {
            w13.y0(bool, "com.pinterest.EXTRA_SEARCH_ENABLE_PROMOTED_PINS");
        }
        Map map = this.H;
        if (map != null) {
            w13.y0(map, "com.pinterest.EXTRA_SEARCH_DEBUG_PARAMETERS");
        }
        String str3 = this.K;
        if (str3 != null) {
            w13.m0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", str3);
        }
        String str4 = this.L;
        if (str4 != null) {
            w13.m0("com.pinterest.EXTRA_JOURNEY_DEPTH", str4);
        }
        String str5 = this.M;
        if (str5 != null) {
            w13.m0("com.pinterest.EXTRA_SOURCE_MODULE_ID", str5);
        }
        String str6 = this.O;
        if (str6 != null) {
            w13.m0("com.pinterest.EXTRA_MODULE_TO_AUTO_CLICK", str6);
        }
        String str7 = this.P;
        if (str7 != null) {
            w13.m0("com.pinterest.EXTRA_TITLE", str7);
        }
        String str8 = this.Q;
        if (str8 != null) {
            w13.m0("com.pinterest.EXTRA_SUBTITLE", str8);
        }
        String str9 = this.R;
        if (str9 != null) {
            w13.m0("com.pinterest.EXTRA_INTEREST_ID", str9);
        }
        String str10 = this.S;
        if (str10 != null) {
            w13.m0("com.pinterest.EXTRA_PINNER_DISPLAYED_QUERY", str10);
        }
        List list2 = this.T;
        if (list2 != null) {
            w13.d("com.pinterest.EXTRA_SELECTED_ONE_BAR_MODULES", new ArrayList(list2));
        }
        List list3 = this.U;
        if (list3 != null) {
            w13.y0(list3, "com.pinterest.EXTRA_OVERRIDE_ONE_BAR_MODULES");
        }
        String str11 = this.W;
        if (str11 != null) {
            w13.m0("com.pinterest.EXTRA_HYBRID_SEARCH_PIN_ID", str11);
        }
        String str12 = this.X;
        if (str12 != null) {
            w13.m0("com.pinterest.EXTRA_HYBRID_SEARCH_PIN_IMAGE_SIGNATURE", str12);
        }
        c0 c0Var = this.I;
        if (c0Var != null) {
            w13.m0("com.pinterest.EXTRA_UNIFIED_FILTERS_API_SPEC", c0Var.a());
        }
        List list4 = this.Z;
        if (list4 != null) {
            w13.y0(list4, "com.pinterest.EXTRA_CACHED_FILTERS_DATA");
        }
        List list5 = this.f26752x;
        if (list5 != null) {
            w13.y0(list5, "com.pinterest.EXTRA_SEARCH_TOP_PIN_IDS");
        }
        return w13;
    }

    public final String d() {
        return this.f26737i;
    }

    public final String e() {
        return this.f26749u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f26728a == b0Var.f26728a && Intrinsics.d(this.f26730b, b0Var.f26730b) && Intrinsics.d(this.f26731c, b0Var.f26731c) && Intrinsics.d(this.f26732d, b0Var.f26732d) && Intrinsics.d(this.f26733e, b0Var.f26733e) && Intrinsics.d(this.f26734f, b0Var.f26734f) && Intrinsics.d(this.f26735g, b0Var.f26735g) && Intrinsics.d(this.f26736h, b0Var.f26736h) && Intrinsics.d(this.f26737i, b0Var.f26737i) && Intrinsics.d(this.f26738j, b0Var.f26738j) && Intrinsics.d(this.f26739k, b0Var.f26739k) && Intrinsics.d(this.f26740l, b0Var.f26740l) && Intrinsics.d(this.f26741m, b0Var.f26741m) && this.f26742n == b0Var.f26742n && Intrinsics.d(this.f26743o, b0Var.f26743o) && Intrinsics.d(this.f26744p, b0Var.f26744p) && Intrinsics.d(this.f26745q, b0Var.f26745q) && Intrinsics.d(this.f26746r, b0Var.f26746r) && Intrinsics.d(this.f26747s, b0Var.f26747s) && Intrinsics.d(this.f26748t, b0Var.f26748t) && Intrinsics.d(this.f26749u, b0Var.f26749u) && Intrinsics.d(this.f26750v, b0Var.f26750v) && Intrinsics.d(this.f26751w, b0Var.f26751w) && Intrinsics.d(this.f26752x, b0Var.f26752x) && Intrinsics.d(this.f26753y, b0Var.f26753y) && Intrinsics.d(this.f26754z, b0Var.f26754z) && Intrinsics.d(this.A, b0Var.A) && Intrinsics.d(this.B, b0Var.B) && Intrinsics.d(this.C, b0Var.C) && Intrinsics.d(this.D, b0Var.D) && Intrinsics.d(this.E, b0Var.E) && Intrinsics.d(this.F, b0Var.F) && Intrinsics.d(this.G, b0Var.G) && Intrinsics.d(this.H, b0Var.H) && Intrinsics.d(this.I, b0Var.I) && Intrinsics.d(this.f26727J, b0Var.f26727J) && Intrinsics.d(this.K, b0Var.K) && Intrinsics.d(this.L, b0Var.L) && Intrinsics.d(this.M, b0Var.M) && Intrinsics.d(this.N, b0Var.N) && Intrinsics.d(this.O, b0Var.O) && Intrinsics.d(this.P, b0Var.P) && Intrinsics.d(this.Q, b0Var.Q) && Intrinsics.d(this.R, b0Var.R) && Intrinsics.d(this.S, b0Var.S) && Intrinsics.d(this.T, b0Var.T) && Intrinsics.d(this.U, b0Var.U) && Intrinsics.d(this.V, b0Var.V) && Intrinsics.d(this.W, b0Var.W) && Intrinsics.d(this.X, b0Var.X) && Intrinsics.d(this.Y, b0Var.Y) && Intrinsics.d(this.Z, b0Var.Z) && Intrinsics.d(this.f26729a0, b0Var.f26729a0);
    }

    public final String f() {
        return this.f26748t;
    }

    public final String g() {
        return this.f26730b;
    }

    public final String h() {
        return this.f26739k;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f26730b, this.f26728a.hashCode() * 31, 31);
        String str = this.f26731c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26732d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26733e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26734f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26735g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f26736h;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f26737i;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f26738j;
        int d13 = cb.d(this.f26739k, (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31, 31);
        String str9 = this.f26740l;
        int hashCode8 = (d13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f26741m;
        int e13 = ep.b.e(this.f26742n, (hashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31, 31);
        Boolean bool = this.f26743o;
        int hashCode9 = (e13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f26744p;
        int c13 = ep.b.c(this.f26746r, ep.b.c(this.f26745q, (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31), 31);
        String str11 = this.f26747s;
        int hashCode10 = (c13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f26748t;
        int hashCode11 = (hashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f26749u;
        int hashCode12 = (hashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f26750v;
        int hashCode13 = (hashCode12 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Map map = this.f26751w;
        int hashCode14 = (hashCode13 + (map == null ? 0 : map.hashCode())) * 31;
        List list = this.f26752x;
        int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        String str15 = this.f26753y;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f26754z;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.A;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.B;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.C;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.D;
        int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.E;
        int hashCode22 = (hashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.F;
        int hashCode23 = (hashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.G;
        int hashCode24 = (hashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Map map2 = this.H;
        int hashCode25 = (hashCode24 + (map2 == null ? 0 : map2.hashCode())) * 31;
        c0 c0Var = this.I;
        int hashCode26 = (hashCode25 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        String str24 = this.f26727J;
        int hashCode27 = (hashCode26 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.K;
        int hashCode28 = (hashCode27 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.L;
        int hashCode29 = (hashCode28 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.M;
        int hashCode30 = (hashCode29 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Boolean bool3 = this.N;
        int hashCode31 = (hashCode30 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str28 = this.O;
        int hashCode32 = (hashCode31 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.P;
        int hashCode33 = (hashCode32 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.Q;
        int hashCode34 = (hashCode33 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.R;
        int hashCode35 = (hashCode34 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.S;
        int hashCode36 = (hashCode35 + (str32 == null ? 0 : str32.hashCode())) * 31;
        List list2 = this.T;
        int hashCode37 = (hashCode36 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.U;
        int hashCode38 = (hashCode37 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str33 = this.V;
        int hashCode39 = (hashCode38 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.W;
        int hashCode40 = (hashCode39 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.X;
        int hashCode41 = (hashCode40 + (str35 == null ? 0 : str35.hashCode())) * 31;
        Boolean bool4 = this.Y;
        int hashCode42 = (hashCode41 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List list4 = this.Z;
        int hashCode43 = (hashCode42 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str36 = this.f26729a0;
        return hashCode43 + (str36 != null ? str36.hashCode() : 0);
    }

    public final h61.h i() {
        return this.f26728a;
    }

    public final List j() {
        return this.T;
    }

    public final String k() {
        return this.E;
    }

    public final String l() {
        return this.f26747s;
    }

    public final String m() {
        return this.P;
    }

    public final boolean n() {
        return Intrinsics.d(this.Y, Boolean.TRUE) || this.f26728a == h61.h.PRODUCTS;
    }

    public final Boolean o() {
        return this.N;
    }

    public final void p(String str) {
        this.f26747s = str;
    }

    public final String toString() {
        String str = this.f26747s;
        StringBuilder sb3 = new StringBuilder("SearchParameters(searchType=");
        sb3.append(this.f26728a);
        sb3.append(", query=");
        sb3.append(this.f26730b);
        sb3.append(", enteredQuery=");
        sb3.append(this.f26731c);
        sb3.append(", elapseTimeSinceLastFocus=");
        sb3.append(this.f26732d);
        sb3.append(", fromQuery=");
        sb3.append(this.f26733e);
        sb3.append(", prefilledQuery=");
        sb3.append(this.f26734f);
        sb3.append(", sourceId=");
        sb3.append(this.f26735g);
        sb3.append(", category=");
        sb3.append(this.f26736h);
        sb3.append(", article=");
        sb3.append(this.f26737i);
        sb3.append(", todayArticle=");
        sb3.append(this.f26738j);
        sb3.append(", referrerSource=");
        sb3.append(this.f26739k);
        sb3.append(", searchCorpusType=");
        sb3.append(this.f26740l);
        sb3.append(", lastBookmark=");
        sb3.append(this.f26741m);
        sb3.append(", appendGlobalResults=");
        sb3.append(this.f26742n);
        sb3.append(", enablePromotedPins=");
        sb3.append(this.f26743o);
        sb3.append(", autoCorrectionDisabled=");
        sb3.append(this.f26744p);
        sb3.append(", termMeta=");
        sb3.append(this.f26745q);
        sb3.append(", foodFilters=");
        sb3.append(this.f26746r);
        sb3.append(", skinToneFilter=");
        sb3.append(str);
        sb3.append(", hairPatternFilter=");
        sb3.append(this.f26748t);
        sb3.append(", bodyTypeFilter=");
        sb3.append(this.f26749u);
        sb3.append(", colorPaletteFilterApiTerm=");
        sb3.append(this.f26750v);
        sb3.append(", traceHttpHeaders=");
        sb3.append(this.f26751w);
        sb3.append(", topPinIds=");
        sb3.append(this.f26752x);
        sb3.append(", topPinsOffset=");
        sb3.append(this.f26753y);
        sb3.append(", creativeId=");
        sb3.append(this.f26754z);
        sb3.append(", priceMin=");
        sb3.append(this.A);
        sb3.append(", priceMax=");
        sb3.append(this.B);
        sb3.append(", domains=");
        sb3.append(this.C);
        sb3.append(", categories=");
        sb3.append(this.D);
        sb3.append(", shopSource=");
        sb3.append(this.E);
        sb3.append(", utmMedium=");
        sb3.append(this.F);
        sb3.append(", utmSource=");
        sb3.append(this.G);
        sb3.append(", debugParameters=");
        sb3.append(this.H);
        sb3.append(", unifiedFiltersApiSpec=");
        sb3.append(this.I);
        sb3.append(", styleFilters=");
        sb3.append(this.f26727J);
        sb3.append(", requestParams=");
        sb3.append(this.K);
        sb3.append(", journeyDepth=");
        sb3.append(this.L);
        sb3.append(", sourceModuleId=");
        sb3.append(this.M);
        sb3.append(", isRetractedSearchHeader=");
        sb3.append(this.N);
        sb3.append(", moduleToAutoClick=");
        sb3.append(this.O);
        sb3.append(", title=");
        sb3.append(this.P);
        sb3.append(", subtitle=");
        sb3.append(this.Q);
        sb3.append(", interestId=");
        sb3.append(this.R);
        sb3.append(", pinnerDisplayedQuery=");
        sb3.append(this.S);
        sb3.append(", selectedOneBarModules=");
        sb3.append(this.T);
        sb3.append(", overrideOneBarModules=");
        sb3.append(this.U);
        sb3.append(", hybridSearchParams=");
        sb3.append(this.V);
        sb3.append(", hybridSearchPinUid=");
        sb3.append(this.W);
        sb3.append(", hybridSearchPinImageSignature=");
        sb3.append(this.X);
        sb3.append(", overrideIsCommerceOnly=");
        sb3.append(this.Y);
        sb3.append(", cachedFilterDataList=");
        sb3.append(this.Z);
        sb3.append(", descriptors=");
        return a.a.p(sb3, this.f26729a0, ")");
    }

    public b0(h61.h searchType, String query, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String referrerSource, String str9, String str10, boolean z13, Boolean bool, Boolean bool2, List termMeta, List foodFilters, String str11, String str12, String str13, String str14, Map map, List list, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Map map2, c0 c0Var, String str24, String str25, String str26, String str27, Boolean bool3, String str28, String str29, String str30, String str31, String str32, List list2, List list3, String str33, String str34, String str35, Boolean bool4, List list4, String str36) {
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(referrerSource, "referrerSource");
        Intrinsics.checkNotNullParameter(termMeta, "termMeta");
        Intrinsics.checkNotNullParameter(foodFilters, "foodFilters");
        this.f26728a = searchType;
        this.f26730b = query;
        this.f26731c = str;
        this.f26732d = str2;
        this.f26733e = str3;
        this.f26734f = str4;
        this.f26735g = str5;
        this.f26736h = str6;
        this.f26737i = str7;
        this.f26738j = str8;
        this.f26739k = referrerSource;
        this.f26740l = str9;
        this.f26741m = str10;
        this.f26742n = z13;
        this.f26743o = bool;
        this.f26744p = bool2;
        this.f26745q = termMeta;
        this.f26746r = foodFilters;
        this.f26747s = str11;
        this.f26748t = str12;
        this.f26749u = str13;
        this.f26750v = str14;
        this.f26751w = map;
        this.f26752x = list;
        this.f26753y = str15;
        this.f26754z = str16;
        this.A = str17;
        this.B = str18;
        this.C = str19;
        this.D = str20;
        this.E = str21;
        this.F = str22;
        this.G = str23;
        this.H = map2;
        this.I = c0Var;
        this.f26727J = str24;
        this.K = str25;
        this.L = str26;
        this.M = str27;
        this.N = bool3;
        this.O = str28;
        this.P = str29;
        this.Q = str30;
        this.R = str31;
        this.S = str32;
        this.T = list2;
        this.U = list3;
        this.V = str33;
        this.W = str34;
        this.X = str35;
        this.Y = bool4;
        this.Z = list4;
        this.f26729a0 = str36;
    }
}
