package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f104237a;

    public a0(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f104237a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f104237a, ((a0) obj).f104237a);
    }

    public final int hashCode() {
        return this.f104237a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinPreviewClicked(pinId="), this.f104237a, ")");
    }
}
