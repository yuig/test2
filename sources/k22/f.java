package k22;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f78211d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f78212e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String uid, Map batchUpdateMap) {
        super(uid, 2);
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(batchUpdateMap, "batchUpdateMap");
        this.f78211d = uid;
        this.f78212e = batchUpdateMap;
    }

    @Override // dl1.u
    public final String a() {
        return this.f78211d;
    }

    @Override // dl1.u
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f78211d, fVar.f78211d) && Intrinsics.d(this.f78212e, fVar.f78212e);
    }

    @Override // dl1.u
    public final int hashCode() {
        return this.f78212e.hashCode() + (this.f78211d.hashCode() * 31);
    }

    public final String toString() {
        return "UserSettingsBatchRequestParams(uid=" + this.f78211d + ", batchUpdateMap=" + this.f78212e + ")";
    }
}
