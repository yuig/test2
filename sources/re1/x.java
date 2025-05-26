package re1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final e f107684a;

    /* renamed from: b, reason: collision with root package name */
    public final String f107685b;

    /* renamed from: c, reason: collision with root package name */
    public final yd1.a f107686c;

    /* renamed from: d, reason: collision with root package name */
    public final String f107687d;

    /* renamed from: e, reason: collision with root package name */
    public final float f107688e;

    public x(e action, String imageUrl, yd1.a aVar, String title, float f13) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f107684a = action;
        this.f107685b = imageUrl;
        this.f107686c = aVar;
        this.f107687d = title;
        this.f107688e = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f107684a, xVar.f107684a) && Intrinsics.d(this.f107685b, xVar.f107685b) && Intrinsics.d(this.f107686c, xVar.f107686c) && Intrinsics.d(this.f107687d, xVar.f107687d) && Float.compare(this.f107688e, xVar.f107688e) == 0;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f107685b, this.f107684a.hashCode() * 31, 31);
        yd1.a aVar = this.f107686c;
        return Float.hashCode(this.f107688e) + cb.d(this.f107687d, (d2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SingleImageUpsellModel(action=");
        sb3.append(this.f107684a);
        sb3.append(", imageUrl=");
        sb3.append(this.f107685b);
        sb3.append(", merchantViewModel=");
        sb3.append(this.f107686c);
        sb3.append(", title=");
        sb3.append(this.f107687d);
        sb3.append(", widthHeightRatio=");
        return d7.g.i(sb3, this.f107688e, ")");
    }
}
