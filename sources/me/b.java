package me;

import com.facebook.AccessToken;
import df.j1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f86969a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86970b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(AccessToken accessToken) {
        this(accessToken.f29851e, le.v.b());
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
    }

    private final Object writeReplace() {
        return new a(this.f86970b, this.f86969a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j1.p(bVar.f86970b, this.f86970b) && j1.p(bVar.f86969a, this.f86969a);
    }

    public final int hashCode() {
        String str = this.f86970b;
        return (str == null ? 0 : str.hashCode()) ^ this.f86969a.hashCode();
    }

    public b(String str, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f86969a = applicationId;
        this.f86970b = j1.V0(str) ? null : str;
    }
}
