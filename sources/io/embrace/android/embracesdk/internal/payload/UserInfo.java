package io.embrace.android.embracesdk.internal.payload;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJF\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/UserInfo;", "", "", "userId", "email", "username", "", "personas", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lio/embrace/android/embracesdk/internal/payload/UserInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class UserInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f73276a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73277b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73278c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f73279d;

    public UserInfo(@p(name = "id") String str, @p(name = "em") String str2, @p(name = "un") String str3, @p(name = "per") Set<String> set) {
        this.f73276a = str;
        this.f73277b = str2;
        this.f73278c = str3;
        this.f73279d = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserInfo a(UserInfo userInfo, String str, String str2, String str3, Set set, int i13) {
        if ((i13 & 1) != 0) {
            str = userInfo.f73276a;
        }
        if ((i13 & 2) != 0) {
            str2 = userInfo.f73277b;
        }
        if ((i13 & 4) != 0) {
            str3 = userInfo.f73278c;
        }
        if ((i13 & 8) != 0) {
            set = userInfo.f73279d;
        }
        return userInfo.copy(str, str2, str3, set);
    }

    @NotNull
    public final UserInfo copy(@p(name = "id") String userId, @p(name = "em") String email, @p(name = "un") String username, @p(name = "per") Set<String> personas) {
        return new UserInfo(userId, email, username, personas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        return Intrinsics.d(this.f73276a, userInfo.f73276a) && Intrinsics.d(this.f73277b, userInfo.f73277b) && Intrinsics.d(this.f73278c, userInfo.f73278c) && Intrinsics.d(this.f73279d, userInfo.f73279d);
    }

    public final int hashCode() {
        String str = this.f73276a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f73277b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f73278c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Set set = this.f73279d;
        return hashCode3 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "UserInfo(userId=" + this.f73276a + ", email=" + this.f73277b + ", username=" + this.f73278c + ", personas=" + this.f73279d + ')';
    }

    public /* synthetic */ UserInfo(String str, String str2, String str3, Set set, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : set);
    }
}
