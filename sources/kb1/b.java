package kb1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f79064a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79065b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f79066c;

    public b(String backupEmail, String confirmedBackupEmail, boolean z13) {
        Intrinsics.checkNotNullParameter(backupEmail, "backupEmail");
        Intrinsics.checkNotNullParameter(confirmedBackupEmail, "confirmedBackupEmail");
        this.f79064a = backupEmail;
        this.f79065b = confirmedBackupEmail;
        this.f79066c = z13;
    }

    public static b e(b bVar) {
        String backupEmail = bVar.f79064a;
        String confirmedBackupEmail = bVar.f79065b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(backupEmail, "backupEmail");
        Intrinsics.checkNotNullParameter(confirmedBackupEmail, "confirmedBackupEmail");
        return new b(backupEmail, confirmedBackupEmail, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f79064a, bVar.f79064a) && Intrinsics.d(this.f79065b, bVar.f79065b) && this.f79066c == bVar.f79066c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79066c) + cb.d(this.f79065b, this.f79064a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PasscodeSetupEmailDisplayState(backupEmail=");
        sb3.append(this.f79064a);
        sb3.append(", confirmedBackupEmail=");
        sb3.append(this.f79065b);
        sb3.append(", isSendEmailButtonEnabled=");
        return a.a.r(sb3, this.f79066c, ")");
    }
}
