package b21;

import kotlin.jvm.internal.Intrinsics;
import v32.c;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f21279a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21280b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21281c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21282d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21283e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21284f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21285g;

    /* renamed from: h, reason: collision with root package name */
    public final c f21286h;

    public a(int i13, int i14, int i15, int i16, int i17, int i18, int i19, c reactionType) {
        Intrinsics.checkNotNullParameter(reactionType, "reactionType");
        this.f21279a = i13;
        this.f21280b = i14;
        this.f21281c = i15;
        this.f21282d = i16;
        this.f21283e = i17;
        this.f21284f = i18;
        this.f21285g = i19;
        this.f21286h = reactionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21279a == aVar.f21279a && this.f21280b == aVar.f21280b && this.f21281c == aVar.f21281c && this.f21282d == aVar.f21282d && this.f21283e == aVar.f21283e && this.f21284f == aVar.f21284f && this.f21285g == aVar.f21285g && this.f21286h == aVar.f21286h;
    }

    public final int hashCode() {
        return this.f21286h.hashCode() + ep.b.b(this.f21285g, ep.b.b(this.f21284f, ep.b.b(this.f21283e, ep.b.b(this.f21282d, ep.b.b(this.f21281c, ep.b.b(this.f21280b, Integer.hashCode(this.f21279a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "PinReactionFaceModel(eyesDrawableRes=" + this.f21279a + ", animatedEyesDrawableRes=" + this.f21280b + ", mouthDrawableRes=" + this.f21281c + ", animatedMouthDrawableRes=" + this.f21282d + ", backgroundDrawableRes=" + this.f21283e + ", backgroundDrawableTint=" + this.f21284f + ", labelRes=" + this.f21285g + ", reactionType=" + this.f21286h + ")";
    }
}
