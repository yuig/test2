package zc2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f141623a;

    public g(String str) {
        this.f141623a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f141623a, ((g) obj).f141623a);
    }

    public final int hashCode() {
        String str = this.f141623a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SelectedBoardNameUpdated(boardName="), this.f141623a, ")");
    }
}
