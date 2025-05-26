package we1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f129433a;

    /* renamed from: b, reason: collision with root package name */
    public final int f129434b;

    /* renamed from: c, reason: collision with root package name */
    public final String f129435c;

    /* renamed from: d, reason: collision with root package name */
    public final h32.u0 f129436d;

    /* renamed from: e, reason: collision with root package name */
    public final String f129437e;

    /* renamed from: f, reason: collision with root package name */
    public final int f129438f;

    public j(int i13, int i14, String storyType, h32.u0 elementType, String storyId, int i15) {
        Intrinsics.checkNotNullParameter(storyType, "storyType");
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        this.f129433a = i13;
        this.f129434b = i14;
        this.f129435c = storyType;
        this.f129436d = elementType;
        this.f129437e = storyId;
        this.f129438f = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f129433a == jVar.f129433a && this.f129434b == jVar.f129434b && Intrinsics.d(this.f129435c, jVar.f129435c) && this.f129436d == jVar.f129436d && Intrinsics.d(this.f129437e, jVar.f129437e) && this.f129438f == jVar.f129438f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f129438f) + cb.d(this.f129437e, (this.f129436d.hashCode() + cb.d(this.f129435c, ep.b.b(this.f129434b, Integer.hashCode(this.f129433a) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardMoreIdeasUpsellLoggingSpec(position=");
        sb3.append(this.f129433a);
        sb3.append(", totalObjectCount=");
        sb3.append(this.f129434b);
        sb3.append(", storyType=");
        sb3.append(this.f129435c);
        sb3.append(", elementType=");
        sb3.append(this.f129436d);
        sb3.append(", storyId=");
        sb3.append(this.f129437e);
        sb3.append(", storyGridPosition=");
        return a.a.n(sb3, this.f129438f, ")");
    }
}
