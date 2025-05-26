package pu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f101369a;

    public s(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f101369a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f101369a, ((s) obj).f101369a);
    }

    public final int hashCode() {
        return this.f101369a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RegisterEventManagerSubscriber(pinId="), this.f101369a, ")");
    }
}
