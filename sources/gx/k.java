package gx;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes3.dex */
public final class k implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f66256a;

    /* renamed from: b, reason: collision with root package name */
    public final vh f66257b;

    public k(vh dynamicStory, String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(dynamicStory, "dynamicStory");
        this.f66256a = pinUid;
        this.f66257b = dynamicStory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f66256a, kVar.f66256a) && Intrinsics.d(this.f66257b, kVar.f66257b);
    }

    public final int hashCode() {
        return this.f66257b.hashCode() + (this.f66256a.hashCode() * 31);
    }

    public final String toString() {
        return "AdsStlShoppingModuleVMState(pinUid=" + this.f66256a + ", dynamicStory=" + this.f66257b + ")";
    }
}
