package aa1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f1634a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f1635b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f1636c;

    public a0(i0 title, i0 description, i0 actionButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        this.f1634a = title;
        this.f1635b = description;
        this.f1636c = actionButtonText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.f1634a, a0Var.f1634a) && Intrinsics.d(this.f1635b, a0Var.f1635b) && Intrinsics.d(this.f1636c, a0Var.f1636c);
    }

    public final int hashCode() {
        return this.f1636c.hashCode() + ep.b.d(this.f1635b, this.f1634a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ClaimedTargetViewDisplayState(title=");
        sb3.append(this.f1634a);
        sb3.append(", description=");
        sb3.append(this.f1635b);
        sb3.append(", actionButtonText=");
        return jq.b.k(sb3, this.f1636c, ")");
    }
}
