package s02;

import com.pinterest.api.model.mj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final mj f110321a;

    public j(mj mjVar) {
        this.f110321a = mjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f110321a, ((j) obj).f110321a);
    }

    public final int hashCode() {
        mj mjVar = this.f110321a;
        if (mjVar == null) {
            return 0;
        }
        return mjVar.hashCode();
    }

    public final String toString() {
        return "RVCSectionItemDisplayState(data=" + this.f110321a + ")";
    }
}
