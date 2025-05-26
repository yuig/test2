package ea1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final e82.w f58079a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58080b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58081c;

    public l1(e82.w network, String boardId, String str) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f58079a = network;
        this.f58080b = boardId;
        this.f58081c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f58079a == l1Var.f58079a && Intrinsics.d(this.f58080b, l1Var.f58080b) && Intrinsics.d(this.f58081c, l1Var.f58081c);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f58080b, this.f58079a.hashCode() * 31, 31);
        String str = this.f58081c;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UpdateBoard(network=");
        sb3.append(this.f58079a);
        sb3.append(", boardId=");
        sb3.append(this.f58080b);
        sb3.append(", sectionId=");
        return a.a.p(sb3, this.f58081c, ")");
    }
}
