package ej0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements b {

    /* renamed from: a, reason: collision with root package name */
    public final dl0.e f59095a;

    public h(dl0.e boardTag) {
        Intrinsics.checkNotNullParameter(boardTag, "boardTag");
        this.f59095a = boardTag;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f59095a == ((h) obj).f59095a;
    }

    public final int hashCode() {
        return this.f59095a.hashCode();
    }

    public final String toString() {
        return "BoardTagClicked(boardTag=" + this.f59095a + ")";
    }
}
