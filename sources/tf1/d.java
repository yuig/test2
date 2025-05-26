package tf1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f117553a;

    /* renamed from: b, reason: collision with root package name */
    public final int f117554b;

    /* renamed from: c, reason: collision with root package name */
    public final int f117555c;

    /* renamed from: d, reason: collision with root package name */
    public final a f117556d;

    /* renamed from: e, reason: collision with root package name */
    public final b f117557e;

    /* renamed from: f, reason: collision with root package name */
    public final c f117558f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f117559g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f117560h;

    /* renamed from: i, reason: collision with root package name */
    public final Function0 f117561i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f117562j;

    public d(int i13, int i14, int i15, a chromeViewModel, b pageProgression, c pageTapAction, boolean z13, boolean z14, Function0 function0, boolean z15) {
        Intrinsics.checkNotNullParameter(chromeViewModel, "chromeViewModel");
        Intrinsics.checkNotNullParameter(pageProgression, "pageProgression");
        Intrinsics.checkNotNullParameter(pageTapAction, "pageTapAction");
        this.f117553a = i13;
        this.f117554b = i14;
        this.f117555c = i15;
        this.f117556d = chromeViewModel;
        this.f117557e = pageProgression;
        this.f117558f = pageTapAction;
        this.f117559g = z13;
        this.f117560h = z14;
        this.f117561i = function0;
        this.f117562j = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f117553a == dVar.f117553a && this.f117554b == dVar.f117554b && this.f117555c == dVar.f117555c && Intrinsics.d(this.f117556d, dVar.f117556d) && this.f117557e == dVar.f117557e && this.f117558f == dVar.f117558f && this.f117559g == dVar.f117559g && this.f117560h == dVar.f117560h && Intrinsics.d(this.f117561i, dVar.f117561i) && this.f117562j == dVar.f117562j;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f117560h, ep.b.e(this.f117559g, (this.f117558f.hashCode() + ((this.f117557e.hashCode() + ((this.f117556d.hashCode() + ep.b.b(this.f117555c, ep.b.b(this.f117554b, Integer.hashCode(this.f117553a) * 31, 31), 31)) * 31)) * 31)) * 31, 31), 31);
        Function0 function0 = this.f117561i;
        return Boolean.hashCode(this.f117562j) + ((e13 + (function0 == null ? 0 : function0.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinViewModel(availableDisplayWidth=");
        sb3.append(this.f117553a);
        sb3.append(", availableDisplayHeight=");
        sb3.append(this.f117554b);
        sb3.append(", displayBottomSpacing=");
        sb3.append(this.f117555c);
        sb3.append(", chromeViewModel=");
        sb3.append(this.f117556d);
        sb3.append(", pageProgression=");
        sb3.append(this.f117557e);
        sb3.append(", pageTapAction=");
        sb3.append(this.f117558f);
        sb3.append(", allowUserInteraction=");
        sb3.append(this.f117559g);
        sb3.append(", fullWidthPages=");
        sb3.append(this.f117560h);
        sb3.append(", onStoryPinPWTFinish=");
        sb3.append(this.f117561i);
        sb3.append(", isFullScreenMode=");
        return a.a.r(sb3, this.f117562j, ")");
    }
}
