package x;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final OutputConfiguration f131249a;

    /* renamed from: b, reason: collision with root package name */
    public String f131250b;

    /* renamed from: c, reason: collision with root package name */
    public long f131251c = 1;

    public j(OutputConfiguration outputConfiguration) {
        this.f131249a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Objects.equals(this.f131249a, jVar.f131249a) && this.f131251c == jVar.f131251c && Objects.equals(this.f131250b, jVar.f131250b);
    }

    public final int hashCode() {
        int hashCode = this.f131249a.hashCode() ^ 31;
        int i13 = (hashCode << 5) - hashCode;
        String str = this.f131250b;
        int hashCode2 = (str == null ? 0 : str.hashCode()) ^ i13;
        return Long.hashCode(this.f131251c) ^ ((hashCode2 << 5) - hashCode2);
    }
}
