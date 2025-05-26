package v61;

import bm1.c;
import bm1.d;
import bm1.f;
import bm1.g;
import bm1.h;
import bm1.l;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import m42.e;
import u50.g0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final a f124201i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f124202j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f124203k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f124204l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f124205m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f124206n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f124207o;

    /* renamed from: a, reason: collision with root package name */
    public final int f124208a;

    /* renamed from: b, reason: collision with root package name */
    public final int f124209b;

    /* renamed from: c, reason: collision with root package name */
    public final l f124210c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f124211d;

    /* renamed from: e, reason: collision with root package name */
    public final int f124212e;

    /* renamed from: f, reason: collision with root package name */
    public final String f124213f;

    /* renamed from: g, reason: collision with root package name */
    public final String f124214g;

    /* renamed from: h, reason: collision with root package name */
    public final int f124215h;

    static {
        int i13 = e.hair_pattern_unknown;
        f124201i = new a(i13, 0, new g(g0.b(new String[0], i13)), 0, "UNKNOWN", null, 0, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
        int i14 = e.hair_pattern_straight;
        f124202j = new a(i14, m42.b.ic_straight_selected_nonpds, new g(g0.b(new String[0], i14)), 1, "STRAIGHT", null, m42.b.ic_straight_gestalt_selected, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
        int i15 = e.hair_pattern_wavy;
        f124203k = new a(i15, m42.b.ic_wavy_selected_nonpds, new h(g0.b(new String[0], i15)), 2, "WAVY", null, m42.b.ic_wavy_gestalt_selected, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
        int i16 = e.hair_pattern_curly;
        f124204l = new a(i16, m42.b.ic_curly_selected_nonpds, new bm1.e(g0.b(new String[0], i16)), 3, "CURLY", null, m42.b.ic_curly_gestalt_selected, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
        int i17 = e.hair_pattern_coily;
        f124205m = new a(i17, m42.b.ic_coily_selected_nonpds, new d(g0.b(new String[0], i17)), 4, "COILY", null, m42.b.ic_coily_gestalt_selected, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
        int i18 = e.hair_pattern_protective;
        f124206n = new a(i18, m42.b.ic_protective_selected_nonpds, new f(g0.b(new String[0], i18)), 5, "PROTECTIVE", null, m42.b.ic_protective_gestalt_selected, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
        int i19 = e.hair_pattern_bald;
        f124207o = new a(i19, m42.b.ic_bald_selected_nonpds, new c(g0.b(new String[0], i19)), 6, "BALD", null, m42.b.ic_bald_shaved_gestalt_selected, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
    }

    public a(int i13, int i14, l buttonType, int i15, String name, String str, int i16, int i17) {
        str = (i17 & 64) != 0 ? null : str;
        i16 = (i17 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? 0 : i16;
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f124208a = i13;
        this.f124209b = i14;
        this.f124210c = buttonType;
        this.f124211d = false;
        this.f124212e = i15;
        this.f124213f = name;
        this.f124214g = str;
        this.f124215h = i16;
    }

    public final String a() {
        return "hair_pattern_id:" + this.f124212e;
    }

    public final int b() {
        return this.f124212e;
    }
}
