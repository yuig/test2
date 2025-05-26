package fd0;

import a.cb;
import dl1.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class g implements s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f61848a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f61849b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f61850c;

    public g(boolean z13, boolean z14, @NotNull Function1<? super md0.a, Unit> logAction) {
        Intrinsics.checkNotNullParameter(logAction, "logAction");
        this.f61848a = z13;
        this.f61849b = z14;
        this.f61850c = logAction;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return cb.g("toString(...)");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f61848a == gVar.f61848a && this.f61849b == gVar.f61849b && Intrinsics.d(this.f61850c, gVar.f61850c);
    }

    public final int hashCode() {
        return this.f61850c.hashCode() + ep.b.e(this.f61849b, Boolean.hashCode(this.f61848a) * 31, 31);
    }

    public final String toString() {
        return "RecentPinHeaderState(isExpandedCreatorHub=" + this.f61848a + ", isSubTitleVisible=" + this.f61849b + ", logAction=" + this.f61850c + ")";
    }
}
