package com.pinterest.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B5\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0004\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/pinterest/api/model/hr;", "Ldl1/s;", "", "a", "Ljava/lang/String;", "uid", "b", "getCompletionTitle", "()Ljava/lang/String;", "completionTitle", "c", "getCompletionSubtitle", "completionSubtitle", "d", "getCompletionButtonText", "completionButtonText", "e", "getExperienceId", "experienceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com/pinterest/api/model/gr", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class hr implements dl1.s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("id")
    @NotNull
    private final String uid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("completion_title")
    private final String completionTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("completion_subtitle")
    private final String completionSubtitle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("completion_button_text")
    private final String completionButtonText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("experience_id")
    @NotNull
    private final String experienceId;

    static {
        new gr(null);
    }

    public hr(@NotNull String uid, String str, String str2, String str3, @NotNull String experienceId) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        this.uid = uid;
        this.completionTitle = str;
        this.completionSubtitle = str2;
        this.completionButtonText = str3;
        this.experienceId = experienceId;
    }

    @Override // dl1.s
    /* renamed from: b, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr)) {
            return false;
        }
        hr hrVar = (hr) obj;
        return Intrinsics.d(this.uid, hrVar.uid) && Intrinsics.d(this.completionTitle, hrVar.completionTitle) && Intrinsics.d(this.completionSubtitle, hrVar.completionSubtitle) && Intrinsics.d(this.completionButtonText, hrVar.completionButtonText) && Intrinsics.d(this.experienceId, hrVar.experienceId);
    }

    public final int hashCode() {
        int hashCode = this.uid.hashCode() * 31;
        String str = this.completionTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.completionSubtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.completionButtonText;
        return this.experienceId.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.uid;
        String str2 = this.completionTitle;
        String str3 = this.completionSubtitle;
        String str4 = this.completionButtonText;
        String str5 = this.experienceId;
        StringBuilder w13 = a.a.w("IdeasCard(uid=", str, ", completionTitle=", str2, ", completionSubtitle=");
        a.a.B(w13, str3, ", completionButtonText=", str4, ", experienceId=");
        return a.a.p(w13, str5, ")");
    }
}
