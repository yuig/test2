package ax0;

import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.o;
import yw0.n;

/* loaded from: classes5.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f20593a;

    /* renamed from: b, reason: collision with root package name */
    public final List f20594b;

    /* renamed from: c, reason: collision with root package name */
    public final float f20595c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20596d;

    /* renamed from: e, reason: collision with root package name */
    public final n f20597e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20598f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20599g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20600h;

    public a(f30 pin, List storyPinImageUrls, float f13, int i13, boolean z13, boolean z14, boolean z15) {
        n moduleVariant = n.DROPDOWN;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(storyPinImageUrls, "storyPinImageUrls");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        this.f20593a = pin;
        this.f20594b = storyPinImageUrls;
        this.f20595c = f13;
        this.f20596d = i13;
        this.f20597e = moduleVariant;
        this.f20598f = z13;
        this.f20599g = z14;
        this.f20600h = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f20593a, aVar.f20593a) && Intrinsics.d(this.f20594b, aVar.f20594b) && Float.compare(this.f20595c, aVar.f20595c) == 0 && this.f20596d == aVar.f20596d && this.f20597e == aVar.f20597e && this.f20598f == aVar.f20598f && this.f20599g == aVar.f20599g && this.f20600h == aVar.f20600h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20600h) + ep.b.e(this.f20599g, ep.b.e(this.f20598f, (this.f20597e.hashCode() + ep.b.b(this.f20596d, a.a.a(this.f20595c, ep.b.c(this.f20594b, this.f20593a.hashCode() * 31, 31), 31), 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SeeItStyledScenePinDisplayState(pin=");
        sb3.append(this.f20593a);
        sb3.append(", storyPinImageUrls=");
        sb3.append(this.f20594b);
        sb3.append(", imageWidthHeightRatio=");
        sb3.append(this.f20595c);
        sb3.append(", position=");
        sb3.append(this.f20596d);
        sb3.append(", moduleVariant=");
        sb3.append(this.f20597e);
        sb3.append(", shouldMoveDropdownBelowScenePin=");
        sb3.append(this.f20598f);
        sb3.append(", isInEnabledCTAGroup=");
        sb3.append(this.f20599g);
        sb3.append(", shouldLazyLoad=");
        return a.a.r(sb3, this.f20600h, ")");
    }
}
