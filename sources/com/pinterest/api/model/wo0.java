package com.pinterest.api.model;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wo0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final uo0 f43310a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43311b;

    /* renamed from: c, reason: collision with root package name */
    public f30 f43312c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f43313d;

    /* renamed from: e, reason: collision with root package name */
    public final sp0 f43314e;

    /* renamed from: f, reason: collision with root package name */
    public final ql0 f43315f;

    /* renamed from: g, reason: collision with root package name */
    public final String f43316g;

    /* renamed from: h, reason: collision with root package name */
    public final String f43317h;

    /* renamed from: i, reason: collision with root package name */
    public final qk0 f43318i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f43319j;

    /* renamed from: k, reason: collision with root package name */
    public String f43320k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f43321l;

    public wo0(@NotNull uo0 storyPinPage, int i13, f30 f30Var, Integer num, sp0 sp0Var, ql0 ql0Var, String str, String str2, qk0 qk0Var, boolean z13, String str3) {
        Intrinsics.checkNotNullParameter(storyPinPage, "storyPinPage");
        this.f43310a = storyPinPage;
        this.f43311b = i13;
        this.f43312c = f30Var;
        this.f43313d = num;
        this.f43314e = sp0Var;
        this.f43315f = ql0Var;
        this.f43316g = str;
        this.f43317h = str2;
        this.f43318i = qk0Var;
        this.f43319j = z13;
        this.f43320k = str3;
        this.f43321l = xk2.m.b(vo0.f42943i);
    }

    public static wo0 a(wo0 wo0Var, Integer num, sp0 sp0Var, ql0 ql0Var, String str, String str2, qk0 qk0Var, int i13) {
        f30 f30Var = wo0Var.f43312c;
        Integer num2 = (i13 & 8) != 0 ? wo0Var.f43313d : num;
        sp0 sp0Var2 = (i13 & 16) != 0 ? wo0Var.f43314e : sp0Var;
        ql0 ql0Var2 = (i13 & 32) != 0 ? wo0Var.f43315f : ql0Var;
        String str3 = (i13 & 64) != 0 ? wo0Var.f43316g : str;
        String str4 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? wo0Var.f43317h : str2;
        qk0 qk0Var2 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? wo0Var.f43318i : qk0Var;
        String str5 = wo0Var.f43320k;
        uo0 storyPinPage = wo0Var.f43310a;
        Intrinsics.checkNotNullParameter(storyPinPage, "storyPinPage");
        return new wo0(storyPinPage, wo0Var.f43311b, f30Var, num2, sp0Var2, ql0Var2, str3, str4, qk0Var2, wo0Var.f43319j, str5);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        String v13 = this.f43310a.v();
        return v13 == null ? (String) this.f43321l.getValue() : v13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo0)) {
            return false;
        }
        wo0 wo0Var = (wo0) obj;
        return Intrinsics.d(this.f43310a, wo0Var.f43310a) && this.f43311b == wo0Var.f43311b && Intrinsics.d(this.f43312c, wo0Var.f43312c) && Intrinsics.d(this.f43313d, wo0Var.f43313d) && Intrinsics.d(this.f43314e, wo0Var.f43314e) && Intrinsics.d(this.f43315f, wo0Var.f43315f) && Intrinsics.d(this.f43316g, wo0Var.f43316g) && Intrinsics.d(this.f43317h, wo0Var.f43317h) && Intrinsics.d(this.f43318i, wo0Var.f43318i) && this.f43319j == wo0Var.f43319j && Intrinsics.d(this.f43320k, wo0Var.f43320k);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f43311b, this.f43310a.hashCode() * 31, 31);
        f30 f30Var = this.f43312c;
        int hashCode = (b13 + (f30Var == null ? 0 : f30Var.hashCode())) * 31;
        Integer num = this.f43313d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        sp0 sp0Var = this.f43314e;
        int hashCode3 = (hashCode2 + (sp0Var == null ? 0 : sp0Var.hashCode())) * 31;
        ql0 ql0Var = this.f43315f;
        int hashCode4 = (hashCode3 + (ql0Var == null ? 0 : ql0Var.hashCode())) * 31;
        String str = this.f43316g;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f43317h;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        qk0 qk0Var = this.f43318i;
        int e13 = ep.b.e(this.f43319j, (hashCode6 + (qk0Var == null ? 0 : qk0Var.hashCode())) * 31, 31);
        String str3 = this.f43320k;
        return e13 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "StoryPinPageContainer(storyPinPage=" + this.f43310a + ", storyPinPageIndex=" + this.f43311b + ", pin=" + this.f43312c + ", templateType=" + this.f43313d + ", recipeMetadata=" + this.f43314e + ", diyMetadata=" + this.f43315f + ", pinImageSignature=" + this.f43316g + ", pinTitle=" + this.f43317h + ", basics=" + this.f43318i + ", isNativeVideo=" + this.f43319j + ", updatedFirstPageThumbnailUrl=" + this.f43320k + ")";
    }

    public /* synthetic */ wo0(uo0 uo0Var, int i13, f30 f30Var, Integer num, sp0 sp0Var, ql0 ql0Var, String str, String str2, qk0 qk0Var, boolean z13, String str3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(uo0Var, i13, f30Var, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : sp0Var, (i14 & 32) != 0 ? null : ql0Var, (i14 & 64) != 0 ? null : str, (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str2, (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : qk0Var, (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : z13, (i14 & 1024) != 0 ? null : str3);
    }
}
