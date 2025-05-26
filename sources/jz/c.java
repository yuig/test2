package jz;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes3.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f77737a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f77738b;

    public c(i0 message, i0 closeButtonLabel) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(closeButtonLabel, "closeButtonLabel");
        this.f77737a = message;
        this.f77738b = closeButtonLabel;
    }

    public final i0 a() {
        return this.f77738b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f77737a, cVar.f77737a) && Intrinsics.d(this.f77738b, cVar.f77738b);
    }

    public final int hashCode() {
        return this.f77738b.hashCode() + (this.f77737a.hashCode() * 31);
    }

    public final String toString() {
        return "FinalMessage(message=" + this.f77737a + ", closeButtonLabel=" + this.f77738b + ")";
    }
}
