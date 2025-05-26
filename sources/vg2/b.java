package vg2;

import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final RemoteConfig f125793a;

    /* renamed from: b, reason: collision with root package name */
    public final String f125794b;

    public b(RemoteConfig remoteConfig, String str) {
        this.f125793a = remoteConfig;
        this.f125794b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f125793a, bVar.f125793a) && Intrinsics.d(this.f125794b, bVar.f125794b);
    }

    public final int hashCode() {
        RemoteConfig remoteConfig = this.f125793a;
        int hashCode = (remoteConfig == null ? 0 : remoteConfig.hashCode()) * 31;
        String str = this.f125794b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConfigHttpResponse(cfg=");
        sb3.append(this.f125793a);
        sb3.append(", etag=");
        return ep.b.k(sb3, this.f125794b, ')');
    }
}
