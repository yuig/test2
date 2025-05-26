package om0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final k f96527d = new k(j.f96516j, j.f96517k, j.f96518l);

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f96528a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f96529b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f96530c;

    public k(Function1 onAvatarClicked, Function1 onOverflowClicked, Function1 onIconClicked) {
        Intrinsics.checkNotNullParameter(onAvatarClicked, "onAvatarClicked");
        Intrinsics.checkNotNullParameter(onOverflowClicked, "onOverflowClicked");
        Intrinsics.checkNotNullParameter(onIconClicked, "onIconClicked");
        this.f96528a = onAvatarClicked;
        this.f96529b = onOverflowClicked;
        this.f96530c = onIconClicked;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f96528a, kVar.f96528a) && Intrinsics.d(this.f96529b, kVar.f96529b) && Intrinsics.d(this.f96530c, kVar.f96530c);
    }

    public final int hashCode() {
        return this.f96530c.hashCode() + d7.g.c(this.f96529b, this.f96528a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BoardCollaboratorEvents(onAvatarClicked=" + this.f96528a + ", onOverflowClicked=" + this.f96529b + ", onIconClicked=" + this.f96530c + ")";
    }
}
