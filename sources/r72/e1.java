package r72;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f106463a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f106464b;

    public e1(ArrayList keyframes, f1 loopMode) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        Intrinsics.checkNotNullParameter(loopMode, "loopMode");
        this.f106463a = keyframes;
        this.f106464b = loopMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Intrinsics.d(this.f106463a, e1Var.f106463a) && this.f106464b == e1Var.f106464b;
    }

    public final int hashCode() {
        return this.f106464b.hashCode() + (this.f106463a.hashCode() * 31);
    }

    public final String toString() {
        return "KeyframeAnimation(keyframes=" + this.f106463a + ", loopMode=" + this.f106464b + ")";
    }
}
