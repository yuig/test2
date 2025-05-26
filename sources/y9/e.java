package y9;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: e, reason: collision with root package name */
    public long f138096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ArrayList states) {
        super(states);
        Intrinsics.checkNotNullParameter(states, "states");
        this.f138096e = 0L;
    }

    @Override // y9.d
    public boolean equals(Object obj) {
        return (obj instanceof e) && super.equals(obj) && this.f138096e == ((e) obj).f138096e;
    }

    @Override // y9.d
    public int hashCode() {
        return Long.hashCode(this.f138096e) + (super.hashCode() * 31);
    }

    @Override // y9.d
    public String toString() {
        StringBuilder sb3 = new StringBuilder("FrameData(frameStartNanos=");
        sb3.append(this.f138093b);
        sb3.append(", frameDurationUiNanos=");
        sb3.append(this.f138094c);
        sb3.append(", frameDurationCpuNanos=");
        sb3.append(this.f138096e);
        sb3.append(", isJank=");
        sb3.append(this.f138095d);
        sb3.append(", states=");
        return d7.g.k(sb3, this.f138092a, ')');
    }
}
