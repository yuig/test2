package eh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f58915a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f58916b;

    public b(a button, Function0 onClick) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f58915a = button;
        this.f58916b = onClick;
    }

    public static b a(b bVar, g onClick) {
        a button = bVar.f58915a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new b(button, onClick);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f58915a, bVar.f58915a) && Intrinsics.d(this.f58916b, bVar.f58916b);
    }

    public final int hashCode() {
        return this.f58916b.hashCode() + (this.f58915a.hashCode() * 31);
    }

    public final String toString() {
        return "ExperienceButtonRendering(button=" + this.f58915a + ", onClick=" + this.f58916b + ")";
    }
}
