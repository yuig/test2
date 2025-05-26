package ww;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f131163a;

    /* renamed from: b, reason: collision with root package name */
    public final f30 f131164b;

    /* renamed from: c, reason: collision with root package name */
    public final fn.i f131165c;

    /* renamed from: d, reason: collision with root package name */
    public final com.iab.omid.library.pinterest.adsession.media.b f131166d;

    /* renamed from: e, reason: collision with root package name */
    public final com.iab.omid.library.pinterest.adsession.media.b f131167e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f131168f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f131169g;

    /* renamed from: h, reason: collision with root package name */
    public final i f131170h;

    /* renamed from: i, reason: collision with root package name */
    public Float f131171i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f131172j;

    public g(f30 pin, fn.i iVar, com.iab.omid.library.pinterest.adsession.media.b bVar, com.iab.omid.library.pinterest.adsession.media.b bVar2) {
        k previousVideoState = k.STATE_INITIAL;
        Intrinsics.checkNotNullParameter(previousVideoState, "previousVideoState");
        i videoMetadata = new i();
        videoMetadata.f131178a = previousVideoState;
        videoMetadata.f131179b = false;
        videoMetadata.f131180c = -1L;
        videoMetadata.f131181d = -1L;
        videoMetadata.f131182e = -1L;
        videoMetadata.f131183f = -1L;
        videoMetadata.f131184g = -1L;
        Intrinsics.checkNotNullParameter("", "screen");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(videoMetadata, "videoMetadata");
        this.f131163a = "";
        this.f131164b = pin;
        this.f131165c = iVar;
        this.f131166d = bVar;
        this.f131167e = bVar2;
        this.f131168f = false;
        this.f131169g = false;
        this.f131170h = videoMetadata;
        this.f131171i = null;
        this.f131172j = false;
    }

    public final f30 a() {
        return this.f131164b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f131163a, gVar.f131163a) && Intrinsics.d(this.f131164b, gVar.f131164b) && Intrinsics.d(this.f131165c, gVar.f131165c) && Intrinsics.d(this.f131166d, gVar.f131166d) && Intrinsics.d(this.f131167e, gVar.f131167e) && this.f131168f == gVar.f131168f && this.f131169g == gVar.f131169g && Intrinsics.d(this.f131170h, gVar.f131170h) && Intrinsics.d(this.f131171i, gVar.f131171i) && this.f131172j == gVar.f131172j;
    }

    public final int hashCode() {
        int hashCode = (this.f131164b.hashCode() + (this.f131163a.hashCode() * 31)) * 31;
        fn.i iVar = this.f131165c;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        com.iab.omid.library.pinterest.adsession.media.b bVar = this.f131166d;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        com.iab.omid.library.pinterest.adsession.media.b bVar2 = this.f131167e;
        int hashCode4 = (this.f131170h.hashCode() + ep.b.e(this.f131169g, ep.b.e(this.f131168f, (hashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31, 31), 31)) * 31;
        Float f13 = this.f131171i;
        return Boolean.hashCode(this.f131172j) + ((hashCode4 + (f13 != null ? f13.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OpenMeasurementDataWrapper(screen=" + this.f131163a + ", pin=" + this.f131164b + ", adSession=" + this.f131165c + ", adEvents=" + this.f131166d + ", mediaEvents=" + this.f131167e + ", impressionLogged=" + this.f131168f + ", creativeLoadedLogged=" + this.f131169g + ", videoMetadata=" + this.f131170h + ", volume=" + this.f131171i + ", playbackCompletionRecorded=" + this.f131172j + ")";
    }
}
