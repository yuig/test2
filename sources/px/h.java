package px;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f101562a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f101563b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f101564c;

    /* renamed from: d, reason: collision with root package name */
    public final String f101565d;

    /* renamed from: e, reason: collision with root package name */
    public final String f101566e;

    /* renamed from: f, reason: collision with root package name */
    public final String f101567f;

    /* renamed from: g, reason: collision with root package name */
    public final String f101568g;

    /* renamed from: h, reason: collision with root package name */
    public final f f101569h;

    public h(String id3, Long l13, Double d2, String str, String str2, String str3, String str4, f metricType) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        this.f101562a = id3;
        this.f101563b = l13;
        this.f101564c = d2;
        this.f101565d = str;
        this.f101566e = str2;
        this.f101567f = str3;
        this.f101568g = str4;
        this.f101569h = metricType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f101562a, hVar.f101562a) && Intrinsics.d(this.f101563b, hVar.f101563b) && Intrinsics.d(this.f101564c, hVar.f101564c) && Intrinsics.d(this.f101565d, hVar.f101565d) && Intrinsics.d(this.f101566e, hVar.f101566e) && Intrinsics.d(this.f101567f, hVar.f101567f) && Intrinsics.d(this.f101568g, hVar.f101568g) && this.f101569h == hVar.f101569h;
    }

    public final int hashCode() {
        int hashCode = this.f101562a.hashCode() * 31;
        Long l13 = this.f101563b;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        Double d2 = this.f101564c;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.f101565d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f101566e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f101567f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f101568g;
        return this.f101569h.hashCode() + ((hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ProductTagItem(id=" + this.f101562a + ", value=" + this.f101563b + ", percentage=" + this.f101564c + ", advertiserName=" + this.f101565d + ", price=" + this.f101566e + ", productName=" + this.f101567f + ", imageLink=" + this.f101568g + ", metricType=" + this.f101569h + ")";
    }

    public /* synthetic */ h(String str, String str2, String str3, String str4, String str5, f fVar, int i13) {
        this(str, 0L, null, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, str4, (i13 & 64) != 0 ? null : str5, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? f.PRODUCT_TAG_IMPRESSION : fVar);
    }
}
