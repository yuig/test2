package db;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f54260a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54261b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54262c;

    /* renamed from: d, reason: collision with root package name */
    public final int f54263d;

    public b(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        int i13 = rect.left;
        int i14 = rect.top;
        int i15 = rect.right;
        int i16 = rect.bottom;
        this.f54260a = i13;
        this.f54261b = i14;
        this.f54262c = i15;
        this.f54263d = i16;
        if (i13 > i15) {
            throw new IllegalArgumentException(a.a.f("Left must be less than or equal to right, left: ", i13, ", right: ", i15).toString());
        }
        if (i14 > i16) {
            throw new IllegalArgumentException(a.a.f("top must be less than or equal to bottom, top: ", i14, ", bottom: ", i16).toString());
        }
    }

    public final int a() {
        return this.f54263d - this.f54261b;
    }

    public final int b() {
        return this.f54262c - this.f54260a;
    }

    public final Rect c() {
        return new Rect(this.f54260a, this.f54261b, this.f54262c, this.f54263d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f54260a == bVar.f54260a && this.f54261b == bVar.f54261b && this.f54262c == bVar.f54262c && this.f54263d == bVar.f54263d;
    }

    public final int hashCode() {
        return (((((this.f54260a * 31) + this.f54261b) * 31) + this.f54262c) * 31) + this.f54263d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b.class.getSimpleName());
        sb3.append(" { [");
        sb3.append(this.f54260a);
        sb3.append(',');
        sb3.append(this.f54261b);
        sb3.append(',');
        sb3.append(this.f54262c);
        sb3.append(',');
        return a.a.n(sb3, this.f54263d, "] }");
    }
}
