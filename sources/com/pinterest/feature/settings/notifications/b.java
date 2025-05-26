package com.pinterest.feature.settings.notifications;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f48163a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48164b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.i0 f48165c;

    /* renamed from: d, reason: collision with root package name */
    public final String f48166d;

    /* renamed from: e, reason: collision with root package name */
    public final int f48167e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f48168f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f48169g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f48170h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f48171i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f48172j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f48173k;

    public b(String id3, String label, u50.i0 subLabel, String description, int i13, boolean z13, boolean z14, boolean z15, Boolean bool, Boolean bool2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(subLabel, "subLabel");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f48163a = id3;
        this.f48164b = label;
        this.f48165c = subLabel;
        this.f48166d = description;
        this.f48167e = i13;
        this.f48168f = z13;
        this.f48169g = z14;
        this.f48170h = z15;
        this.f48171i = bool;
        this.f48172j = bool2;
        this.f48173k = bool3;
    }

    public static b e(b bVar, boolean z13, Boolean bool, Boolean bool2, Boolean bool3, int i13) {
        String id3 = bVar.f48163a;
        String label = bVar.f48164b;
        u50.i0 subLabel = bVar.f48165c;
        String description = bVar.f48166d;
        int i14 = bVar.f48167e;
        boolean z14 = (i13 & 32) != 0 ? bVar.f48168f : z13;
        boolean z15 = bVar.f48169g;
        boolean z16 = bVar.f48170h;
        Boolean bool4 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? bVar.f48171i : bool;
        Boolean bool5 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? bVar.f48172j : bool2;
        Boolean bool6 = (i13 & 1024) != 0 ? bVar.f48173k : bool3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(subLabel, "subLabel");
        Intrinsics.checkNotNullParameter(description, "description");
        return new b(id3, label, subLabel, description, i14, z14, z15, z16, bool4, bool5, bool6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f48163a, bVar.f48163a) && Intrinsics.d(this.f48164b, bVar.f48164b) && Intrinsics.d(this.f48165c, bVar.f48165c) && Intrinsics.d(this.f48166d, bVar.f48166d) && this.f48167e == bVar.f48167e && this.f48168f == bVar.f48168f && this.f48169g == bVar.f48169g && this.f48170h == bVar.f48170h && Intrinsics.d(this.f48171i, bVar.f48171i) && Intrinsics.d(this.f48172j, bVar.f48172j) && Intrinsics.d(this.f48173k, bVar.f48173k);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f48170h, ep.b.e(this.f48169g, ep.b.e(this.f48168f, ep.b.b(this.f48167e, cb.d(this.f48166d, ep.b.d(this.f48165c, cb.d(this.f48164b, this.f48163a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        Boolean bool = this.f48171i;
        int hashCode = (e13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f48172j;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f48173k;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NotifSettingsExpandableSectionDisplayState(id=");
        sb3.append(this.f48163a);
        sb3.append(", label=");
        sb3.append(this.f48164b);
        sb3.append(", subLabel=");
        sb3.append(this.f48165c);
        sb3.append(", description=");
        sb3.append(this.f48166d);
        sb3.append(", toggleSectionTitle=");
        sb3.append(this.f48167e);
        sb3.append(", isExpanded=");
        sb3.append(this.f48168f);
        sb3.append(", isGlobalPermissions=");
        sb3.append(this.f48169g);
        sb3.append(", hideExpandedSectionBottomDivider=");
        sb3.append(this.f48170h);
        sb3.append(", pushEnabled=");
        sb3.append(this.f48171i);
        sb3.append(", emailEnabled=");
        sb3.append(this.f48172j);
        sb3.append(", newsEnabled=");
        return a.c.h(sb3, this.f48173k, ")");
    }
}
