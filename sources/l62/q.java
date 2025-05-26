package l62;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import r72.a2;

/* loaded from: classes4.dex */
public final class q extends w {

    /* renamed from: a, reason: collision with root package name */
    public final String f81684a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81685b;

    public q(String id3, int i13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81684a = id3;
        this.f81685b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        String str = qVar.f81684a;
        int i13 = a2.f106437b;
        return Intrinsics.d(this.f81684a, str) && this.f81685b == qVar.f81685b;
    }

    public final int hashCode() {
        int i13 = a2.f106437b;
        return Integer.hashCode(this.f81685b) + (this.f81684a.hashCode() * 31);
    }

    public final String toString() {
        return a.a.n(cb.o("ItemZOrderTrackingStarted(id=", a2.a(this.f81684a), ", currentZIndex="), this.f81685b, ")");
    }
}
