package f9;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public final long f61429a;

    /* renamed from: b, reason: collision with root package name */
    public final long f61430b;

    /* renamed from: c, reason: collision with root package name */
    public final List f61431c;

    public d(long j13, long j14, List list) {
        this.f61429a = j13;
        this.f61430b = j14;
        this.f61431c = Collections.unmodifiableList(list);
    }

    @Override // f9.b
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb3.append(this.f61429a);
        sb3.append(", programSplicePlaybackPositionUs= ");
        return a.a.o(sb3, this.f61430b, " }");
    }
}
