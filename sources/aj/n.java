package aj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Laj/n;", "", "", "a", "Ljava/lang/String;", "playStoreVersion", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("package_version")
    public String playStoreVersion;

    public n() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.playStoreVersion, ((n) obj).playStoreVersion);
    }

    public final int hashCode() {
        String str = this.playStoreVersion;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.k("PlayStoreSignals(playStoreVersion=", this.playStoreVersion, ")");
    }

    public n(int i13) {
        this.playStoreVersion = null;
    }
}
