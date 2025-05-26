package qr1;

import a.cb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u001b"}, d2 = {"Lqr1/z;", "", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "e", "name", "", "c", "Z", "g", "()Z", "value", "d", "h", "isInvertedValue", "f", "type", "labelMobile", "headerMobile", "linkUrl", "i", "linkText", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class z {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("id")
    @NotNull
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("name")
    @NotNull
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("value")
    private final boolean value;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("is_inverted_value")
    private final boolean isInvertedValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("setting_type")
    @NotNull
    private final String type;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("label_mobile")
    @NotNull
    private final String labelMobile;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("header_mobile")
    @NotNull
    private final String headerMobile;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("link_url")
    private final String linkUrl;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @om.b("link_text")
    private final String linkText;

    /* renamed from: a, reason: from getter */
    public final String getHeaderMobile() {
        return this.headerMobile;
    }

    /* renamed from: b, reason: from getter */
    public final String getLabelMobile() {
        return this.labelMobile;
    }

    /* renamed from: c, reason: from getter */
    public final String getLinkText() {
        return this.linkText;
    }

    /* renamed from: d, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.id, zVar.id) && Intrinsics.d(this.name, zVar.name) && this.value == zVar.value && this.isInvertedValue == zVar.isInvertedValue && Intrinsics.d(this.type, zVar.type) && Intrinsics.d(this.labelMobile, zVar.labelMobile) && Intrinsics.d(this.headerMobile, zVar.headerMobile) && Intrinsics.d(this.linkUrl, zVar.linkUrl) && Intrinsics.d(this.linkText, zVar.linkText);
    }

    /* renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsInvertedValue() {
        return this.isInvertedValue;
    }

    public final int hashCode() {
        int d2 = cb.d(this.headerMobile, cb.d(this.labelMobile, cb.d(this.type, ep.b.e(this.isInvertedValue, ep.b.e(this.value, cb.d(this.name, this.id.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        String str = this.linkUrl;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.linkText;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.name;
        boolean z13 = this.value;
        boolean z14 = this.isInvertedValue;
        String str3 = this.type;
        String str4 = this.labelMobile;
        String str5 = this.headerMobile;
        String str6 = this.linkUrl;
        String str7 = this.linkText;
        StringBuilder w13 = a.a.w("PrivacyAndDataField(id=", str, ", name=", str2, ", value=");
        a.c.v(w13, z13, ", isInvertedValue=", z14, ", type=");
        a.a.B(w13, str3, ", labelMobile=", str4, ", headerMobile=");
        a.a.B(w13, str5, ", linkUrl=", str6, ", linkText=");
        return a.a.p(w13, str7, ")");
    }
}
