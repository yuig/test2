package dl1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class u extends m {

    /* renamed from: c, reason: collision with root package name */
    public final String f55288c;

    public u(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f55288c = uid;
    }

    public String a() {
        return this.f55288c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && Intrinsics.d(((u) obj).a(), a());
    }

    public int hashCode() {
        return a().hashCode();
    }
}
