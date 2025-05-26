package ads_mobile_sdk;

import a.j9;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ah implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2397a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2398b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2399c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2400d;

    /* renamed from: e, reason: collision with root package name */
    public final Pair f2401e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2402f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2403g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2404h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2405i;

    /* renamed from: j, reason: collision with root package name */
    public final Double f2406j;

    public ah(int i13, boolean z13, boolean z14, int i14, Pair pair, int i15, int i16, float f13, boolean z15, Double d2) {
        this.f2397a = i13;
        this.f2398b = z13;
        this.f2399c = z14;
        this.f2400d = i14;
        this.f2401e = pair;
        this.f2402f = i15;
        this.f2403g = i16;
        this.f2404h = f13;
        this.f2405i = z15;
        this.f2406j = d2;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.audioMode = this.f2397a;
        signals.isMusicActive = this.f2398b;
        signals.isSpeakerPhoneOn = this.f2399c;
        signals.musicVolume = this.f2400d;
        Pair pair = this.f2401e;
        if (pair != null) {
            signals.minMusicVolume = (Integer) pair.f80346a;
            signals.maxMusicVolume = (Integer) pair.f80347b;
        }
        signals.ringerMode = this.f2402f;
        signals.ringerVolume = this.f2403g;
        signals.appVolume = this.f2404h;
        signals.isAppMuted = this.f2405i;
        signals.musicVolumePercent = this.f2406j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return this.f2397a == ahVar.f2397a && this.f2398b == ahVar.f2398b && this.f2399c == ahVar.f2399c && this.f2400d == ahVar.f2400d && Intrinsics.d(this.f2401e, ahVar.f2401e) && this.f2402f == ahVar.f2402f && this.f2403g == ahVar.f2403g && Float.compare(this.f2404h, ahVar.f2404h) == 0 && this.f2405i == ahVar.f2405i && Intrinsics.d(this.f2406j, ahVar.f2406j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f2397a) * 31;
        boolean z13 = this.f2398b;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int i14 = (hashCode + i13) * 31;
        boolean z14 = this.f2399c;
        int i15 = z14;
        if (z14 != 0) {
            i15 = 1;
        }
        int f13 = kh2.n3.f(this.f2400d, (i14 + i15) * 31);
        Pair pair = this.f2401e;
        int a13 = a.a.a(this.f2404h, kh2.n3.f(this.f2403g, kh2.n3.f(this.f2402f, (f13 + (pair == null ? 0 : pair.hashCode())) * 31)), 31);
        boolean z15 = this.f2405i;
        int i16 = (a13 + (z15 ? 1 : z15 ? 1 : 0)) * 31;
        Double d2 = this.f2406j;
        return i16 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "AudioSignal(audioMode=" + this.f2397a + ", isMusicActive=" + this.f2398b + ", isSpeakerPhoneOn=" + this.f2399c + ", musicVolume=" + this.f2400d + ", minMaxMusicVolume=" + this.f2401e + ", ringerMode=" + this.f2402f + ", ringerVolume=" + this.f2403g + ", appVolume=" + this.f2404h + ", isAppMuted=" + this.f2405i + ", musicVolumePercent=" + this.f2406j + ")";
    }
}
