package z70;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends b {

    /* renamed from: a, reason: collision with root package name */
    public final String f140991a;

    public e(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f140991a = url;
    }

    public final String a() {
        return this.f140991a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f140991a, ((e) obj).f140991a);
    }

    public final int hashCode() {
        return this.f140991a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ChromeSessionPreload(url="), this.f140991a, ")");
    }
}
