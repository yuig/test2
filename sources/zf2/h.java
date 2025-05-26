package zf2;

import ei2.q;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f141942a;

    /* renamed from: b, reason: collision with root package name */
    public final f f141943b;

    /* renamed from: c, reason: collision with root package name */
    public final q f141944c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f141945d;

    public h(String activityName, f traceCompleteTrigger, q root, Map children) {
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        Intrinsics.checkNotNullParameter(traceCompleteTrigger, "traceCompleteTrigger");
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(children, "children");
        this.f141942a = activityName;
        this.f141943b = traceCompleteTrigger;
        this.f141944c = root;
        this.f141945d = children;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f141942a, hVar.f141942a) && this.f141943b == hVar.f141943b && Intrinsics.d(this.f141944c, hVar.f141944c) && Intrinsics.d(this.f141945d, hVar.f141945d);
    }

    public final int hashCode() {
        return this.f141945d.hashCode() + ((this.f141944c.hashCode() + ((this.f141943b.hashCode() + (this.f141942a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "UiLoadTrace(activityName=" + this.f141942a + ", traceCompleteTrigger=" + this.f141943b + ", root=" + this.f141944c + ", children=" + this.f141945d + ')';
    }
}
