package eb;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import q5.a2;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final db.b f58211a;

    /* renamed from: b, reason: collision with root package name */
    public final a2 f58212b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(Rect bounds, a2 insets) {
        this(new db.b(bounds), insets);
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(insets, "insets");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(q.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        q qVar = (q) obj;
        return Intrinsics.d(this.f58211a, qVar.f58211a) && Intrinsics.d(this.f58212b, qVar.f58212b);
    }

    public final int hashCode() {
        return this.f58212b.hashCode() + (this.f58211a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f58211a + ", windowInsetsCompat=" + this.f58212b + ')';
    }

    public q(db.b _bounds, a2 _windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(_bounds, "_bounds");
        Intrinsics.checkNotNullParameter(_windowInsetsCompat, "_windowInsetsCompat");
        this.f58211a = _bounds;
        this.f58212b = _windowInsetsCompat;
    }
}
