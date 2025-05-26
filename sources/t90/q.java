package t90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final r f116821a;

    /* renamed from: b, reason: collision with root package name */
    public final o f116822b;

    public q(r topBar, o actions) {
        Intrinsics.checkNotNullParameter(topBar, "topBar");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f116821a = topBar;
        this.f116822b = actions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f116821a, qVar.f116821a) && Intrinsics.d(this.f116822b, qVar.f116822b);
    }

    public final int hashCode() {
        return this.f116822b.f116816a.hashCode() + (this.f116821a.hashCode() * 31);
    }

    public final String toString() {
        return "CutoutRefineActionPanelState(topBar=" + this.f116821a + ", actions=" + this.f116822b + ")";
    }
}
