package cj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final zo.c f27839a;

    public k0(zo.c boardViewType) {
        Intrinsics.checkNotNullParameter(boardViewType, "boardViewType");
        this.f27839a = boardViewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && this.f27839a == ((k0) obj).f27839a;
    }

    public final int hashCode() {
        return this.f27839a.hashCode();
    }

    public final String toString() {
        return "BoardViewTypeLoaded(boardViewType=" + this.f27839a + ")";
    }
}
