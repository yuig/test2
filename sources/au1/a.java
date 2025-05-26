package au1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f20501a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20502b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20503c;

    public a(String artist, String title, String str) {
        Intrinsics.checkNotNullParameter(artist, "artist");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f20501a = artist;
        this.f20502b = title;
        this.f20503c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f20501a, aVar.f20501a) && Intrinsics.d(this.f20502b, aVar.f20502b) && Intrinsics.d(this.f20503c, aVar.f20503c);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f20502b, this.f20501a.hashCode() * 31, 31);
        String str = this.f20503c;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MusicAttributionArtistTitleIcon(artist=");
        sb3.append(this.f20501a);
        sb3.append(", title=");
        sb3.append(this.f20502b);
        sb3.append(", iconUrl=");
        return a.a.p(sb3, this.f20503c, ")");
    }
}
