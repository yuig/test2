package uc0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f121879a;

    /* renamed from: b, reason: collision with root package name */
    public final String f121880b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f121881c;

    public x(String title, String subtitle, a0 event) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f121879a = title;
        this.f121880b = subtitle;
        this.f121881c = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f121879a, xVar.f121879a) && Intrinsics.d(this.f121880b, xVar.f121880b) && Intrinsics.d(this.f121881c, xVar.f121881c);
    }

    public final int hashCode() {
        return this.f121881c.hashCode() + cb.d(this.f121880b, this.f121879a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ComponentItemDisplayState(title=" + this.f121879a + ", subtitle=" + this.f121880b + ", event=" + this.f121881c + ")";
    }
}
