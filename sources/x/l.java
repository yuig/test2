package x;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final OutputConfiguration f131252a;

    /* renamed from: b, reason: collision with root package name */
    public long f131253b = 1;

    public l(OutputConfiguration outputConfiguration) {
        this.f131252a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Objects.equals(this.f131252a, lVar.f131252a) && this.f131253b == lVar.f131253b;
    }

    public final int hashCode() {
        int hashCode = this.f131252a.hashCode() ^ 31;
        return Long.hashCode(this.f131253b) ^ ((hashCode << 5) - hashCode);
    }
}
