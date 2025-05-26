package ww;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final fn.i f131158a;

    /* renamed from: b, reason: collision with root package name */
    public final com.iab.omid.library.pinterest.adsession.media.b f131159b;

    /* renamed from: c, reason: collision with root package name */
    public final com.iab.omid.library.pinterest.adsession.media.b f131160c;

    public c(fn.i adSession, com.iab.omid.library.pinterest.adsession.media.b adEvents, com.iab.omid.library.pinterest.adsession.media.b bVar) {
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        Intrinsics.checkNotNullParameter(adEvents, "adEvents");
        this.f131158a = adSession;
        this.f131159b = adEvents;
        this.f131160c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f131158a, cVar.f131158a) && Intrinsics.d(this.f131159b, cVar.f131159b) && Intrinsics.d(this.f131160c, cVar.f131160c);
    }

    public final int hashCode() {
        int hashCode = (this.f131159b.hashCode() + (this.f131158a.hashCode() * 31)) * 31;
        com.iab.omid.library.pinterest.adsession.media.b bVar = this.f131160c;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "CreatedSession(adSession=" + this.f131158a + ", adEvents=" + this.f131159b + ", mediaEvents=" + this.f131160c + ")";
    }
}
