package kb1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f79068a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79069b;

    public d(String backupEmail, String confirmedBackupEmail) {
        Intrinsics.checkNotNullParameter(backupEmail, "backupEmail");
        Intrinsics.checkNotNullParameter(confirmedBackupEmail, "confirmedBackupEmail");
        this.f79068a = backupEmail;
        this.f79069b = confirmedBackupEmail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f79068a, dVar.f79068a) && Intrinsics.d(this.f79069b, dVar.f79069b);
    }

    public final int hashCode() {
        return this.f79069b.hashCode() + (this.f79068a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SendEmailButtonClicked(backupEmail=");
        sb3.append(this.f79068a);
        sb3.append(", confirmedBackupEmail=");
        return a.a.p(sb3, this.f79069b, ")");
    }
}
