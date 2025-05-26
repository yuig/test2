package io.embrace.android.embracesdk.internal.comms.api;

import ep.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0004\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lio/embrace/android/embracesdk/internal/comms/api/ApiRequestUrl;", "", "", "url", "copy", "(Ljava/lang/String;)Lio/embrace/android/embracesdk/internal/comms/api/ApiRequestUrl;", "<init>", "(Ljava/lang/String;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class ApiRequestUrl {

    /* renamed from: a, reason: collision with root package name */
    public final String f72939a;

    public ApiRequestUrl(@p(name = "url") @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f72939a = url;
    }

    @NotNull
    public final ApiRequestUrl copy(@p(name = "url") @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new ApiRequestUrl(url);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApiRequestUrl) && Intrinsics.d(this.f72939a, ((ApiRequestUrl) obj).f72939a);
    }

    public final int hashCode() {
        return this.f72939a.hashCode();
    }

    public final String toString() {
        return b.k(new StringBuilder("ApiRequestUrl(url="), this.f72939a, ')');
    }
}
