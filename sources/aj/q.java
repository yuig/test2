package aj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Laj/q;", "", "", "a", "Ljava/lang/Boolean;", "isInstantApp", "b", "Z", "isPrivilegedProcess", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("instant_app")
    public Boolean isInstantApp;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("is_privileged_process")
    public boolean isPrivilegedProcess;

    public q() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.isInstantApp, qVar.isInstantApp) && this.isPrivilegedProcess == qVar.isPrivilegedProcess;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Boolean bool = this.isInstantApp;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        boolean z13 = this.isPrivilegedProcess;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return hashCode + i13;
    }

    public final String toString() {
        return "SdkEnvironment(isInstantApp=" + this.isInstantApp + ", isPrivilegedProcess=" + this.isPrivilegedProcess + ")";
    }

    public q(int i13) {
        this.isInstantApp = null;
        this.isPrivilegedProcess = false;
    }
}
