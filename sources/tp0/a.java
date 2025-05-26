package tp0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f118768a;

    /* renamed from: b, reason: collision with root package name */
    public final String f118769b;

    public a(String artist, String title) {
        Intrinsics.checkNotNullParameter(artist, "artist");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f118768a = artist;
        this.f118769b = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f118768a, aVar.f118768a) && Intrinsics.d(this.f118769b, aVar.f118769b);
    }

    public final int hashCode() {
        return this.f118769b.hashCode() + (this.f118768a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MusicAttributionArtistTitle(artist=");
        sb3.append(this.f118768a);
        sb3.append(", title=");
        return a.a.p(sb3, this.f118769b, ")");
    }
}
