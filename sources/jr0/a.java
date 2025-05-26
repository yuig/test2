package jr0;

import com.pinterest.creatorHub.feature.creatorpathways.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f77537a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f77538b;

    public a(d action, String display) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f77537a = display;
        this.f77538b = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f77537a, aVar.f77537a) && Intrinsics.d(this.f77538b, aVar.f77538b);
    }

    public final int hashCode() {
        return this.f77538b.hashCode() + (this.f77537a.hashCode() * 31);
    }

    public final String toString() {
        return "CreatorHubModalButtonState(display=" + this.f77537a + ", action=" + this.f77538b + ")";
    }
}
