package y80;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0005R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\t\u0010\u0005R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000e\u0010\u0005R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\f\u0010\u0005¨\u0006\u0012"}, d2 = {"Ly80/d;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "continueButtonText", "b", "dismissButtonText", "c", "getHeader", "header", "d", "id", "e", "title", "f", "subTitle", "composer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("continue_button_text")
    private final String continueButtonText = null;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("dismiss_button_text")
    private final String dismissButtonText = null;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("header")
    private final String header = null;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("id")
    private final String id = null;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("title")
    private final String title = null;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("subtitle")
    private final String subTitle = null;

    /* renamed from: a, reason: from getter */
    public final String getContinueButtonText() {
        return this.continueButtonText;
    }

    /* renamed from: b, reason: from getter */
    public final String getDismissButtonText() {
        return this.dismissButtonText;
    }

    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.continueButtonText, dVar.continueButtonText) && Intrinsics.d(this.dismissButtonText, dVar.dismissButtonText) && Intrinsics.d(this.header, dVar.header) && Intrinsics.d(this.id, dVar.id) && Intrinsics.d(this.title, dVar.title) && Intrinsics.d(this.subTitle, dVar.subTitle);
    }

    public final int hashCode() {
        String str = this.continueButtonText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dismissButtonText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.header;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.id;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subTitle;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.continueButtonText;
        String str2 = this.dismissButtonText;
        String str3 = this.header;
        String str4 = this.id;
        String str5 = this.title;
        String str6 = this.subTitle;
        StringBuilder w13 = a.a.w("Step(continueButtonText=", str, ", dismissButtonText=", str2, ", header=");
        a.a.B(w13, str3, ", id=", str4, ", title=");
        return a.a.q(w13, str5, ", subTitle=", str6, ")");
    }
}
