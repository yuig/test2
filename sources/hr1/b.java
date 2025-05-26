package hr1;

import com.facebook.AccessToken;
import com.facebook.Profile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final AccessToken f69983a;

    /* renamed from: b, reason: collision with root package name */
    public final Profile f69984b;

    public b(AccessToken accessToken, Profile profile) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(profile, "profile");
        this.f69983a = accessToken;
        this.f69984b = profile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f69983a, bVar.f69983a) && Intrinsics.d(this.f69984b, bVar.f69984b);
    }

    public final int hashCode() {
        return this.f69984b.hashCode() + (this.f69983a.hashCode() * 31);
    }

    public final String toString() {
        return "FacebookAuthAttributes(accessToken=" + this.f69983a + ", profile=" + this.f69984b + ")";
    }
}
