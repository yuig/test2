package ba1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final o82.a0 f22373a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f22374b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22375c;

    public j(o82.a0 listDisplayState, Integer num, boolean z13) {
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        this.f22373a = listDisplayState;
        this.f22374b = num;
        this.f22375c = z13;
    }

    public static j e(j jVar, o82.a0 listDisplayState, Integer num, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            listDisplayState = jVar.f22373a;
        }
        if ((i13 & 2) != 0) {
            num = jVar.f22374b;
        }
        if ((i13 & 4) != 0) {
            z13 = jVar.f22375c;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        return new j(listDisplayState, num, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f22373a, jVar.f22373a) && Intrinsics.d(this.f22374b, jVar.f22374b) && this.f22375c == jVar.f22375c;
    }

    public final int hashCode() {
        int hashCode = this.f22373a.f93524a.hashCode() * 31;
        Integer num = this.f22374b;
        return Boolean.hashCode(this.f22375c) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ListClaimedAccountsDisplayState(listDisplayState=");
        sb3.append(this.f22373a);
        sb3.append(", apiMigrationErrorStringId=");
        sb3.append(this.f22374b);
        sb3.append(", isApiMigrationWarning=");
        return a.a.r(sb3, this.f22375c, ")");
    }
}
