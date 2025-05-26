package cx0;

import bx0.z;
import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.o;

/* loaded from: classes5.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f53334a;

    /* renamed from: b, reason: collision with root package name */
    public final List f53335b;

    /* renamed from: c, reason: collision with root package name */
    public final float f53336c;

    /* renamed from: d, reason: collision with root package name */
    public final int f53337d;

    /* renamed from: e, reason: collision with root package name */
    public final z f53338e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f53339f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f53340g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f53341h;

    public a(f30 f30Var, List storyPinImageUrls, float f13, int i13, z moduleVariant, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(storyPinImageUrls, "storyPinImageUrls");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        this.f53334a = f30Var;
        this.f53335b = storyPinImageUrls;
        this.f53336c = f13;
        this.f53337d = i13;
        this.f53338e = moduleVariant;
        this.f53339f = z13;
        this.f53340g = z14;
        this.f53341h = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f53334a, aVar.f53334a) && Intrinsics.d(this.f53335b, aVar.f53335b) && Float.compare(this.f53336c, aVar.f53336c) == 0 && this.f53337d == aVar.f53337d && this.f53338e == aVar.f53338e && this.f53339f == aVar.f53339f && this.f53340g == aVar.f53340g && this.f53341h == aVar.f53341h;
    }

    public final int hashCode() {
        f30 f30Var = this.f53334a;
        return Boolean.hashCode(this.f53341h) + ep.b.e(this.f53340g, ep.b.e(this.f53339f, (this.f53338e.hashCode() + ep.b.b(this.f53337d, a.a.a(this.f53336c, ep.b.c(this.f53335b, (f30Var == null ? 0 : f30Var.hashCode()) * 31, 31), 31), 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("STLFocusScenePinDisplayState(pin=");
        sb3.append(this.f53334a);
        sb3.append(", storyPinImageUrls=");
        sb3.append(this.f53335b);
        sb3.append(", imageWidthHeightRatio=");
        sb3.append(this.f53336c);
        sb3.append(", position=");
        sb3.append(this.f53337d);
        sb3.append(", moduleVariant=");
        sb3.append(this.f53338e);
        sb3.append(", shouldMoveDropdownBelowScenePin=");
        sb3.append(this.f53339f);
        sb3.append(", isInEnabledCTAGroup=");
        sb3.append(this.f53340g);
        sb3.append(", shouldLazyLoad=");
        return a.a.r(sb3, this.f53341h, ")");
    }
}
