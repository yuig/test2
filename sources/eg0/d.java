package eg0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u000e"}, d2 = {"Leg0/d;", "", "", "a", "Z", "b", "()Z", "hideCompleteButton", "", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "text", "actionUrl", "experiences_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("hide_complete_button")
    private final boolean hideCompleteButton;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("text")
    private final String text;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("cta_url")
    private final String actionUrl;

    /* renamed from: a, reason: from getter */
    public final String getActionUrl() {
        return this.actionUrl;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getHideCompleteButton() {
        return this.hideCompleteButton;
    }

    /* renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.hideCompleteButton == dVar.hideCompleteButton && Intrinsics.d(this.text, dVar.text) && Intrinsics.d(this.actionUrl, dVar.actionUrl);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.hideCompleteButton) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.actionUrl;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        boolean z13 = this.hideCompleteButton;
        String str = this.text;
        String str2 = this.actionUrl;
        StringBuilder sb3 = new StringBuilder("CompleteButton(hideCompleteButton=");
        sb3.append(z13);
        sb3.append(", text=");
        sb3.append(str);
        sb3.append(", actionUrl=");
        return a.a.p(sb3, str2, ")");
    }
}
