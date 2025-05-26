package k62;

import a.cb;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f78420a;

    /* renamed from: b, reason: collision with root package name */
    public final String f78421b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f78422c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f78423d;

    public b(String displayName, LinkedHashMap settingsMetadata, String analyticsName, boolean z13) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(analyticsName, "analyticsName");
        Intrinsics.checkNotNullParameter(settingsMetadata, "settingsMetadata");
        this.f78420a = displayName;
        this.f78421b = analyticsName;
        this.f78422c = settingsMetadata;
        this.f78423d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f78420a, bVar.f78420a) && Intrinsics.d(this.f78421b, bVar.f78421b) && Intrinsics.d(this.f78422c, bVar.f78422c) && this.f78423d == bVar.f78423d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78423d) + a.c.e(this.f78422c, cb.d(this.f78421b, this.f78420a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EffectMetadata(displayName=");
        sb3.append(this.f78420a);
        sb3.append(", analyticsName=");
        sb3.append(this.f78421b);
        sb3.append(", settingsMetadata=");
        sb3.append(this.f78422c);
        sb3.append(", isComingSoon=");
        return a.a.r(sb3, this.f78423d, ")");
    }
}
