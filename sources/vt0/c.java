package vt0;

import android.graphics.RectF;
import d7.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f126633a;

    /* renamed from: b, reason: collision with root package name */
    public final float f126634b;

    /* renamed from: c, reason: collision with root package name */
    public final float f126635c;

    /* renamed from: d, reason: collision with root package name */
    public final float f126636d;

    /* renamed from: e, reason: collision with root package name */
    public final float f126637e;

    public c(RectF newCanvasRect, float f13, float f14, float f15, float f16) {
        Intrinsics.checkNotNullParameter(newCanvasRect, "newCanvasRect");
        this.f126633a = newCanvasRect;
        this.f126634b = f13;
        this.f126635c = f14;
        this.f126636d = f15;
        this.f126637e = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f126633a, cVar.f126633a) && Float.compare(this.f126634b, cVar.f126634b) == 0 && Float.compare(this.f126635c, cVar.f126635c) == 0 && Float.compare(this.f126636d, cVar.f126636d) == 0 && Float.compare(this.f126637e, cVar.f126637e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f126637e) + a.a.a(this.f126636d, a.a.a(this.f126635c, a.a.a(this.f126634b, this.f126633a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CanvasTransformationData(newCanvasRect=");
        sb3.append(this.f126633a);
        sb3.append(", canvasScaleFactor=");
        sb3.append(this.f126634b);
        sb3.append(", yOffset=");
        sb3.append(this.f126635c);
        sb3.append(", defaultYOffset=");
        sb3.append(this.f126636d);
        sb3.append(", defaultYOffsetPercentage=");
        return g.i(sb3, this.f126637e, ")");
    }
}
