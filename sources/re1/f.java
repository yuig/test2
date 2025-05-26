package re1;

import h32.g0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import z32.d3;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f107580a;

    /* renamed from: b, reason: collision with root package name */
    public final ue1.l f107581b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f107582c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f107583d;

    /* renamed from: e, reason: collision with root package name */
    public final int f107584e;

    /* renamed from: f, reason: collision with root package name */
    public final g f107585f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f107586g;

    /* renamed from: h, reason: collision with root package name */
    public final d3 f107587h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f107588i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f107589j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f107590k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f107591l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f107592m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f107593n;

    /* renamed from: o, reason: collision with root package name */
    public final Float f107594o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f107595p;

    /* renamed from: q, reason: collision with root package name */
    public final int f107596q;

    /* renamed from: r, reason: collision with root package name */
    public final int f107597r;

    /* renamed from: s, reason: collision with root package name */
    public final String f107598s;

    public f(String storyId, ue1.l contentItemRepData, HashMap auxData, g0 g0Var, int i13, g gVar, boolean z13, d3 videoPlayMode, Long l13, boolean z14, boolean z15, boolean z16, Boolean bool, Float f13, boolean z17, int i14, int i15, String trafficSource, int i16) {
        g carouselPaddingSpec = (i16 & 32) != 0 ? new g(null, null, 15) : gVar;
        boolean z18 = (i16 & 64) != 0 ? false : z13;
        boolean z19 = (i16 & 32768) != 0 ? false : z17;
        int i17 = (i16 & 65536) != 0 ? 1 : i14;
        int i18 = (i16 & 131072) != 0 ? 6 : i15;
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        Intrinsics.checkNotNullParameter(contentItemRepData, "contentItemRepData");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(carouselPaddingSpec, "carouselPaddingSpec");
        Intrinsics.checkNotNullParameter(videoPlayMode, "videoPlayMode");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        this.f107580a = storyId;
        this.f107581b = contentItemRepData;
        this.f107582c = auxData;
        this.f107583d = g0Var;
        this.f107584e = i13;
        this.f107585f = carouselPaddingSpec;
        this.f107586g = z18;
        this.f107587h = videoPlayMode;
        this.f107588i = l13;
        this.f107589j = z14;
        this.f107590k = false;
        this.f107591l = z15;
        this.f107592m = z16;
        this.f107593n = bool;
        this.f107594o = f13;
        this.f107595p = z19;
        this.f107596q = i17;
        this.f107597r = i18;
        this.f107598s = trafficSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f107580a, fVar.f107580a) && Intrinsics.d(this.f107581b, fVar.f107581b) && Intrinsics.d(this.f107582c, fVar.f107582c) && this.f107583d == fVar.f107583d && this.f107584e == fVar.f107584e && Intrinsics.d(this.f107585f, fVar.f107585f) && this.f107586g == fVar.f107586g && this.f107587h == fVar.f107587h && Intrinsics.d(this.f107588i, fVar.f107588i) && this.f107589j == fVar.f107589j && this.f107590k == fVar.f107590k && this.f107591l == fVar.f107591l && this.f107592m == fVar.f107592m && Intrinsics.d(this.f107593n, fVar.f107593n) && Intrinsics.d(this.f107594o, fVar.f107594o) && this.f107595p == fVar.f107595p && this.f107596q == fVar.f107596q && this.f107597r == fVar.f107597r && Intrinsics.d(this.f107598s, fVar.f107598s);
    }

    public final int hashCode() {
        int d2 = a.c.d(this.f107582c, (this.f107581b.hashCode() + (this.f107580a.hashCode() * 31)) * 31, 31);
        g0 g0Var = this.f107583d;
        int hashCode = (this.f107587h.hashCode() + ep.b.e(this.f107586g, (this.f107585f.hashCode() + ep.b.b(this.f107584e, (d2 + (g0Var == null ? 0 : g0Var.hashCode())) * 31, 31)) * 31, 31)) * 31;
        Long l13 = this.f107588i;
        int e13 = ep.b.e(this.f107592m, ep.b.e(this.f107591l, ep.b.e(this.f107590k, ep.b.e(this.f107589j, (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31, 31), 31), 31), 31);
        Boolean bool = this.f107593n;
        int hashCode2 = (e13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f13 = this.f107594o;
        return this.f107598s.hashCode() + ep.b.b(this.f107597r, ep.b.b(this.f107596q, ep.b.e(this.f107595p, (hashCode2 + (f13 != null ? f13.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CarouselModel(storyId=");
        sb3.append(this.f107580a);
        sb3.append(", contentItemRepData=");
        sb3.append(this.f107581b);
        sb3.append(", auxData=");
        sb3.append(this.f107582c);
        sb3.append(", componentType=");
        sb3.append(this.f107583d);
        sb3.append(", numRows=");
        sb3.append(this.f107584e);
        sb3.append(", carouselPaddingSpec=");
        sb3.append(this.f107585f);
        sb3.append(", enablePageSnapForSingleItem=");
        sb3.append(this.f107586g);
        sb3.append(", videoPlayMode=");
        sb3.append(this.f107587h);
        sb3.append(", videoMaxPlaytimeMs=");
        sb3.append(this.f107588i);
        sb3.append(", shouldLogCarouselSwipe=");
        sb3.append(this.f107589j);
        sb3.append(", shouldUnboldPrice=");
        sb3.append(this.f107590k);
        sb3.append(", shouldDisableRecyclerViewFocusable=");
        sb3.append(this.f107591l);
        sb3.append(", shouldDisablePinSwipe=");
        sb3.append(this.f107592m);
        sb3.append(", shouldShowSavedOverlay=");
        sb3.append(this.f107593n);
        sb3.append(", itemWidthHeightRatio=");
        sb3.append(this.f107594o);
        sb3.append(", enablePageSnapping=");
        sb3.append(this.f107595p);
        sb3.append(", itemsPerPageSnap=");
        sb3.append(this.f107596q);
        sb3.append(", numCarouselPages=");
        sb3.append(this.f107597r);
        sb3.append(", trafficSource=");
        return a.a.p(sb3, this.f107598s, ")");
    }
}
