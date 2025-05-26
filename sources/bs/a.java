package bs;

import bk1.u1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23838a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f23839b;

    public a(boolean z13, u1 activateExperiment) {
        Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
        this.f23838a = z13;
        this.f23839b = activateExperiment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23838a == aVar.f23838a && Intrinsics.d(this.f23839b, aVar.f23839b);
    }

    public final int hashCode() {
        return this.f23839b.hashCode() + (Boolean.hashCode(this.f23838a) * 31);
    }

    public final String toString() {
        return "ExperimentStatusAndActivation(isExperimentEnabled=" + this.f23838a + ", activateExperiment=" + this.f23839b + ")";
    }
}
