package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class lk0 extends jk0 {

    /* renamed from: c, reason: collision with root package name */
    public final Response f7864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk0(Response response) {
        super(yx0.f14447e, 0);
        Intrinsics.checkNotNullParameter(response, "response");
        this.f7864c = response;
    }

    public final Response c() {
        return this.f7864c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lk0) && Intrinsics.d(this.f7864c, ((lk0) obj).f7864c);
    }

    public final int hashCode() {
        return this.f7864c.hashCode();
    }

    public final String toString() {
        return "HttpError(response=" + this.f7864c + ")";
    }
}
