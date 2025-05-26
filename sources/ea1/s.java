package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final e82.g f58130a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58131b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58132c;

    /* renamed from: d, reason: collision with root package name */
    public final long f58133d;

    /* renamed from: e, reason: collision with root package name */
    public final long f58134e;

    public s(e82.g connectionStatus, String str, String str2, long j13, long j14) {
        Intrinsics.checkNotNullParameter(connectionStatus, "connectionStatus");
        this.f58130a = connectionStatus;
        this.f58131b = str;
        this.f58132c = str2;
        this.f58133d = j13;
        this.f58134e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f58130a, sVar.f58130a) && Intrinsics.d(this.f58131b, sVar.f58131b) && Intrinsics.d(this.f58132c, sVar.f58132c) && this.f58133d == sVar.f58133d && this.f58134e == sVar.f58134e;
    }

    public final int hashCode() {
        int hashCode = this.f58130a.hashCode() * 31;
        String str = this.f58131b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58132c;
        return Long.hashCode(this.f58134e) + a.a.c(this.f58133d, (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "FeedLoaded(connectionStatus=" + this.f58130a + ", boardId=" + this.f58131b + ", sectionId=" + this.f58132c + ", currentDayInMillis=" + this.f58133d + ", apiMigrationHardDeadlineInMillis=" + this.f58134e + ")";
    }
}
