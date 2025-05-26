package hh1;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends l {

    /* renamed from: f, reason: collision with root package name */
    public final vn1.c f69208f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f69209g;

    /* renamed from: h, reason: collision with root package name */
    public final String f69210h;

    /* renamed from: i, reason: collision with root package name */
    public final SpannableStringBuilder f69211i;

    /* renamed from: j, reason: collision with root package name */
    public final String f69212j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f69213k;

    public q(String str, SpannableStringBuilder spannableStringBuilder, String str2) {
        vn1.c textColor = vn1.c.DEFAULT;
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.f69208f = textColor;
        this.f69209g = true;
        this.f69210h = str;
        this.f69211i = spannableStringBuilder;
        this.f69212j = str2;
        this.f69213k = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f69208f == qVar.f69208f && this.f69209g == qVar.f69209g && Intrinsics.d(this.f69210h, qVar.f69210h) && Intrinsics.d(this.f69211i, qVar.f69211i) && Intrinsics.d(this.f69212j, qVar.f69212j) && Intrinsics.d(this.f69213k, qVar.f69213k);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f69209g, this.f69208f.hashCode() * 31, 31);
        String str = this.f69210h;
        int hashCode = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        SpannableStringBuilder spannableStringBuilder = this.f69211i;
        int hashCode2 = (hashCode + (spannableStringBuilder == null ? 0 : spannableStringBuilder.hashCode())) * 31;
        String str2 = this.f69212j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f69213k;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ProductTagData(textColor=" + this.f69208f + ", showArrow=" + this.f69209g + ", title=" + this.f69210h + ", price=" + ((Object) this.f69211i) + ", productImageUrl=" + this.f69212j + ", foregroundDrawableId=" + this.f69213k + ")";
    }
}
