package io.embrace.android.embracesdk.internal.payload;

import ep.b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ^\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/EnvelopeMetadata;", "", "", "userId", "email", "username", "", "personas", "timezoneDescription", "locale", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)Lio/embrace/android/embracesdk/internal/payload/EnvelopeMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class EnvelopeMetadata {

    /* renamed from: a, reason: collision with root package name */
    public final String f73119a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73120b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73121c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f73122d;

    /* renamed from: e, reason: collision with root package name */
    public final String f73123e;

    /* renamed from: f, reason: collision with root package name */
    public final String f73124f;

    public EnvelopeMetadata(@p(name = "user_id") String str, @p(name = "email") String str2, @p(name = "username") String str3, @p(name = "personas") Set<String> set, @p(name = "timezone_description") String str4, @p(name = "locale") String str5) {
        this.f73119a = str;
        this.f73120b = str2;
        this.f73121c = str3;
        this.f73122d = set;
        this.f73123e = str4;
        this.f73124f = str5;
    }

    @NotNull
    public final EnvelopeMetadata copy(@p(name = "user_id") String userId, @p(name = "email") String email, @p(name = "username") String username, @p(name = "personas") Set<String> personas, @p(name = "timezone_description") String timezoneDescription, @p(name = "locale") String locale) {
        return new EnvelopeMetadata(userId, email, username, personas, timezoneDescription, locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnvelopeMetadata)) {
            return false;
        }
        EnvelopeMetadata envelopeMetadata = (EnvelopeMetadata) obj;
        return Intrinsics.d(this.f73119a, envelopeMetadata.f73119a) && Intrinsics.d(this.f73120b, envelopeMetadata.f73120b) && Intrinsics.d(this.f73121c, envelopeMetadata.f73121c) && Intrinsics.d(this.f73122d, envelopeMetadata.f73122d) && Intrinsics.d(this.f73123e, envelopeMetadata.f73123e) && Intrinsics.d(this.f73124f, envelopeMetadata.f73124f);
    }

    public final int hashCode() {
        String str = this.f73119a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f73120b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f73121c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Set set = this.f73122d;
        int hashCode4 = (hashCode3 + (set == null ? 0 : set.hashCode())) * 31;
        String str4 = this.f73123e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f73124f;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EnvelopeMetadata(userId=");
        sb3.append(this.f73119a);
        sb3.append(", email=");
        sb3.append(this.f73120b);
        sb3.append(", username=");
        sb3.append(this.f73121c);
        sb3.append(", personas=");
        sb3.append(this.f73122d);
        sb3.append(", timezoneDescription=");
        sb3.append(this.f73123e);
        sb3.append(", locale=");
        return b.k(sb3, this.f73124f, ')');
    }

    public /* synthetic */ EnvelopeMetadata(String str, String str2, String str3, Set set, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : set, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5);
    }
}
