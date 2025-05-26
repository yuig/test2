package com.pinterest.feature.settings.notifications;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class k0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f48216a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f48217b;

    /* renamed from: c, reason: collision with root package name */
    public final String f48218c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f48219d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f48220e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f48221f;

    /* renamed from: g, reason: collision with root package name */
    public final String f48222g;

    /* renamed from: h, reason: collision with root package name */
    public final String f48223h;

    /* renamed from: i, reason: collision with root package name */
    public final String f48224i;

    /* renamed from: j, reason: collision with root package name */
    public final String f48225j;

    /* renamed from: k, reason: collision with root package name */
    public final String f48226k;

    /* renamed from: l, reason: collision with root package name */
    public final String f48227l;

    /* renamed from: m, reason: collision with root package name */
    public final String f48228m;

    /* renamed from: n, reason: collision with root package name */
    public final String f48229n;

    /* renamed from: o, reason: collision with root package name */
    public final List f48230o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f48231p;

    /* renamed from: q, reason: collision with root package name */
    public final Boolean f48232q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f48233r;

    /* renamed from: s, reason: collision with root package name */
    public final j0 f48234s;

    /* renamed from: t, reason: collision with root package name */
    public final String f48235t;

    public k0(String label, u50.i0 subLabel, String description, boolean z13, boolean z14, boolean z15, String categoryKey, String subcategoryKey, String pushCategoryKey, String emailCategoryKey, String newsSubcategoryKey, String pushSubcategoryKey, String emailSubcategoryKey, String newsCategoryKey, List channelOptions, Boolean bool, Boolean bool2, Boolean bool3, j0 j0Var) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(subLabel, "subLabel");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Intrinsics.checkNotNullParameter(subcategoryKey, "subcategoryKey");
        Intrinsics.checkNotNullParameter(pushCategoryKey, "pushCategoryKey");
        Intrinsics.checkNotNullParameter(emailCategoryKey, "emailCategoryKey");
        Intrinsics.checkNotNullParameter(newsSubcategoryKey, "newsSubcategoryKey");
        Intrinsics.checkNotNullParameter(pushSubcategoryKey, "pushSubcategoryKey");
        Intrinsics.checkNotNullParameter(emailSubcategoryKey, "emailSubcategoryKey");
        Intrinsics.checkNotNullParameter(newsCategoryKey, "newsCategoryKey");
        Intrinsics.checkNotNullParameter(channelOptions, "channelOptions");
        this.f48216a = label;
        this.f48217b = subLabel;
        this.f48218c = description;
        this.f48219d = z13;
        this.f48220e = z14;
        this.f48221f = z15;
        this.f48222g = categoryKey;
        this.f48223h = subcategoryKey;
        this.f48224i = pushCategoryKey;
        this.f48225j = emailCategoryKey;
        this.f48226k = newsSubcategoryKey;
        this.f48227l = pushSubcategoryKey;
        this.f48228m = emailSubcategoryKey;
        this.f48229n = newsCategoryKey;
        this.f48230o = channelOptions;
        this.f48231p = bool;
        this.f48232q = bool2;
        this.f48233r = bool3;
        this.f48234s = j0Var;
        this.f48235t = a.a.D(categoryKey, ":", subcategoryKey);
    }

    public static k0 b(k0 k0Var, u50.f0 f0Var, boolean z13, String str, String str2, String str3, String str4, String str5, String str6, List list, Boolean bool, Boolean bool2, Boolean bool3, j0 j0Var, int i13) {
        boolean z14;
        Boolean bool4;
        String label = k0Var.f48216a;
        u50.i0 subLabel = (i13 & 2) != 0 ? k0Var.f48217b : f0Var;
        String description = k0Var.f48218c;
        boolean z15 = (i13 & 8) != 0 ? k0Var.f48219d : z13;
        boolean z16 = k0Var.f48220e;
        boolean z17 = k0Var.f48221f;
        String categoryKey = k0Var.f48222g;
        String subcategoryKey = k0Var.f48223h;
        String pushCategoryKey = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? k0Var.f48224i : str;
        String emailCategoryKey = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? k0Var.f48225j : str2;
        String newsSubcategoryKey = (i13 & 1024) != 0 ? k0Var.f48226k : str3;
        String pushSubcategoryKey = (i13 & 2048) != 0 ? k0Var.f48227l : str4;
        String emailSubcategoryKey = (i13 & 4096) != 0 ? k0Var.f48228m : str5;
        String newsCategoryKey = (i13 & 8192) != 0 ? k0Var.f48229n : str6;
        List channelOptions = (i13 & 16384) != 0 ? k0Var.f48230o : list;
        if ((i13 & 32768) != 0) {
            z14 = z16;
            bool4 = k0Var.f48231p;
        } else {
            z14 = z16;
            bool4 = bool;
        }
        Boolean bool5 = (65536 & i13) != 0 ? k0Var.f48232q : bool2;
        Boolean bool6 = (131072 & i13) != 0 ? k0Var.f48233r : bool3;
        j0 j0Var2 = (i13 & 262144) != 0 ? k0Var.f48234s : j0Var;
        k0Var.getClass();
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(subLabel, "subLabel");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Intrinsics.checkNotNullParameter(subcategoryKey, "subcategoryKey");
        Intrinsics.checkNotNullParameter(pushCategoryKey, "pushCategoryKey");
        Intrinsics.checkNotNullParameter(emailCategoryKey, "emailCategoryKey");
        Intrinsics.checkNotNullParameter(newsSubcategoryKey, "newsSubcategoryKey");
        Intrinsics.checkNotNullParameter(pushSubcategoryKey, "pushSubcategoryKey");
        Intrinsics.checkNotNullParameter(emailSubcategoryKey, "emailSubcategoryKey");
        Intrinsics.checkNotNullParameter(newsCategoryKey, "newsCategoryKey");
        Intrinsics.checkNotNullParameter(channelOptions, "channelOptions");
        return new k0(label, subLabel, description, z15, z14, z17, categoryKey, subcategoryKey, pushCategoryKey, emailCategoryKey, newsSubcategoryKey, pushSubcategoryKey, emailSubcategoryKey, newsCategoryKey, channelOptions, bool4, bool5, bool6, j0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.d(this.f48216a, k0Var.f48216a) && Intrinsics.d(this.f48217b, k0Var.f48217b) && Intrinsics.d(this.f48218c, k0Var.f48218c) && this.f48219d == k0Var.f48219d && this.f48220e == k0Var.f48220e && this.f48221f == k0Var.f48221f && Intrinsics.d(this.f48222g, k0Var.f48222g) && Intrinsics.d(this.f48223h, k0Var.f48223h) && Intrinsics.d(this.f48224i, k0Var.f48224i) && Intrinsics.d(this.f48225j, k0Var.f48225j) && Intrinsics.d(this.f48226k, k0Var.f48226k) && Intrinsics.d(this.f48227l, k0Var.f48227l) && Intrinsics.d(this.f48228m, k0Var.f48228m) && Intrinsics.d(this.f48229n, k0Var.f48229n) && Intrinsics.d(this.f48230o, k0Var.f48230o) && Intrinsics.d(this.f48231p, k0Var.f48231p) && Intrinsics.d(this.f48232q, k0Var.f48232q) && Intrinsics.d(this.f48233r, k0Var.f48233r) && Intrinsics.d(this.f48234s, k0Var.f48234s);
    }

    @Override // com.pinterest.feature.settings.notifications.o0
    public final String getId() {
        return this.f48235t;
    }

    public final int hashCode() {
        int c13 = ep.b.c(this.f48230o, cb.d(this.f48229n, cb.d(this.f48228m, cb.d(this.f48227l, cb.d(this.f48226k, cb.d(this.f48225j, cb.d(this.f48224i, cb.d(this.f48223h, cb.d(this.f48222g, ep.b.e(this.f48221f, ep.b.e(this.f48220e, ep.b.e(this.f48219d, cb.d(this.f48218c, ep.b.d(this.f48217b, this.f48216a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Boolean bool = this.f48231p;
        int hashCode = (c13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f48232q;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f48233r;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        j0 j0Var = this.f48234s;
        return hashCode3 + (j0Var != null ? j0Var.hashCode() : 0);
    }

    public final String toString() {
        return "NotifSettingsExpandableSectionVMState(label=" + this.f48216a + ", subLabel=" + this.f48217b + ", description=" + this.f48218c + ", isExpanded=" + this.f48219d + ", isGlobalPermissions=" + this.f48220e + ", hideExpandedSectionBottomDivider=" + this.f48221f + ", categoryKey=" + this.f48222g + ", subcategoryKey=" + this.f48223h + ", pushCategoryKey=" + this.f48224i + ", emailCategoryKey=" + this.f48225j + ", newsSubcategoryKey=" + this.f48226k + ", pushSubcategoryKey=" + this.f48227l + ", emailSubcategoryKey=" + this.f48228m + ", newsCategoryKey=" + this.f48229n + ", channelOptions=" + this.f48230o + ", pushEnabled=" + this.f48231p + ", emailEnabled=" + this.f48232q + ", newsEnabled=" + this.f48233r + ", globalPermissionConfirmationPending=" + this.f48234s + ")";
    }
}
