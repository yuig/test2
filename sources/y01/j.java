package y01;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f136418a;

    /* renamed from: b, reason: collision with root package name */
    public final String f136419b;

    /* renamed from: c, reason: collision with root package name */
    public final String f136420c;

    public j(String unformattedUrl, String path, String str) {
        Intrinsics.checkNotNullParameter(unformattedUrl, "unformattedUrl");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f136418a = unformattedUrl;
        this.f136419b = path;
        this.f136420c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f136418a, jVar.f136418a) && Intrinsics.d(this.f136419b, jVar.f136419b) && Intrinsics.d(this.f136420c, jVar.f136420c);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f136419b, this.f136418a.hashCode() * 31, 31);
        String str = this.f136420c;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LoadFeed(unformattedUrl=");
        sb3.append(this.f136418a);
        sb3.append(", path=");
        sb3.append(this.f136419b);
        sb3.append(", bookmark=");
        return a.a.p(sb3, this.f136420c, ")");
    }
}
