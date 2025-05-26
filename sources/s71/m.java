package s71;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f111395a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f111396b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f111397c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f111398d;

    public m(Rect topLeftBounds, Rect topRightBounds, Rect bottomLeftBounds, Rect bottomRightBounds) {
        Intrinsics.checkNotNullParameter(topLeftBounds, "topLeftBounds");
        Intrinsics.checkNotNullParameter(topRightBounds, "topRightBounds");
        Intrinsics.checkNotNullParameter(bottomLeftBounds, "bottomLeftBounds");
        Intrinsics.checkNotNullParameter(bottomRightBounds, "bottomRightBounds");
        this.f111395a = topLeftBounds;
        this.f111396b = topRightBounds;
        this.f111397c = bottomLeftBounds;
        this.f111398d = bottomRightBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f111395a, mVar.f111395a) && Intrinsics.d(this.f111396b, mVar.f111396b) && Intrinsics.d(this.f111397c, mVar.f111397c) && Intrinsics.d(this.f111398d, mVar.f111398d);
    }

    public final int hashCode() {
        return this.f111398d.hashCode() + ((this.f111397c.hashCode() + ((this.f111396b.hashCode() + (this.f111395a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CropperHandleBounds(topLeftBounds=" + this.f111395a + ", topRightBounds=" + this.f111396b + ", bottomLeftBounds=" + this.f111397c + ", bottomRightBounds=" + this.f111398d + ")";
    }
}
