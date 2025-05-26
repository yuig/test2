package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h1 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final l62.w f111566a;

    public h1(l62.w composerViewEvent) {
        Intrinsics.checkNotNullParameter(composerViewEvent, "composerViewEvent");
        this.f111566a = composerViewEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && Intrinsics.d(this.f111566a, ((h1) obj).f111566a);
    }

    public final int hashCode() {
        return this.f111566a.hashCode();
    }

    public final String toString() {
        return "OnComposerViewEvent(composerViewEvent=" + this.f111566a + ")";
    }
}
