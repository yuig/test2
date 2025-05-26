package qu0;

import com.pinterest.feature.ideaPinCreation.closeup.view.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f105145a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f105146b;

    public a(int i13, c0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f105145a = i13;
        this.f105146b = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f105145a == aVar.f105145a && Intrinsics.d(this.f105146b, aVar.f105146b);
    }

    public final int hashCode() {
        return this.f105146b.hashCode() + (Integer.hashCode(this.f105145a) * 31);
    }

    public final String toString() {
        return "OverlayEditOption(displayTextRes=" + this.f105145a + ", action=" + this.f105146b + ")";
    }
}
