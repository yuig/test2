package y52;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f137792a;

    /* renamed from: b, reason: collision with root package name */
    public final String f137793b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f137794c;

    public e(String link, String uriString, boolean z13) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        this.f137792a = link;
        this.f137793b = uriString;
        this.f137794c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f137792a, eVar.f137792a) && Intrinsics.d(this.f137793b, eVar.f137793b) && this.f137794c == eVar.f137794c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137794c) + cb.d(this.f137793b, this.f137792a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShareBoardVideoPreviewDisplayState(link=");
        sb3.append(this.f137792a);
        sb3.append(", uriString=");
        sb3.append(this.f137793b);
        sb3.append(", shouldShowTooltip=");
        return a.a.r(sb3, this.f137794c, ")");
    }
}
