package cj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final zo.c f27791a;

    public c1(zo.c boardViewType) {
        Intrinsics.checkNotNullParameter(boardViewType, "boardViewType");
        this.f27791a = boardViewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && this.f27791a == ((c1) obj).f27791a;
    }

    public final int hashCode() {
        return this.f27791a.hashCode();
    }

    public final String toString() {
        return "UpdateBoardViewTypeRequest(boardViewType=" + this.f27791a + ")";
    }
}
