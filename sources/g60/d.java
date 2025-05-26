package g60;

import a.cb;
import h32.i0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements l82.h {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f63698a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63699b;

    /* renamed from: c, reason: collision with root package name */
    public final String f63700c;

    /* renamed from: d, reason: collision with root package name */
    public final int f63701d;

    /* renamed from: e, reason: collision with root package name */
    public final List f63702e;

    /* renamed from: f, reason: collision with root package name */
    public final String f63703f;

    public d(i0 context, String clusterId, String clusterName, int i13, List list, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clusterId, "clusterId");
        Intrinsics.checkNotNullParameter(clusterName, "clusterName");
        this.f63698a = context;
        this.f63699b = clusterId;
        this.f63700c = clusterName;
        this.f63701d = i13;
        this.f63702e = list;
        this.f63703f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f63698a, dVar.f63698a) && Intrinsics.d(this.f63699b, dVar.f63699b) && Intrinsics.d(this.f63700c, dVar.f63700c) && this.f63701d == dVar.f63701d && Intrinsics.d(this.f63702e, dVar.f63702e) && Intrinsics.d(this.f63703f, dVar.f63703f);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f63701d, cb.d(this.f63700c, cb.d(this.f63699b, this.f63698a.hashCode() * 31, 31), 31), 31);
        List list = this.f63702e;
        int hashCode = (b13 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f63703f;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CreateBoardFromCluster(context=");
        sb3.append(this.f63698a);
        sb3.append(", clusterId=");
        sb3.append(this.f63699b);
        sb3.append(", clusterName=");
        sb3.append(this.f63700c);
        sb3.append(", clusterPinCount=");
        sb3.append(this.f63701d);
        sb3.append(", clusterPinTypes=");
        sb3.append(this.f63702e);
        sb3.append(", navigationSource=");
        return a.a.p(sb3, this.f63703f, ")");
    }
}
