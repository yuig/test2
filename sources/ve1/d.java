package ve1;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import org.chromium.net.y;
import xe1.t;

/* loaded from: classes5.dex */
public final class d implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f125760a;

    /* renamed from: b, reason: collision with root package name */
    public final re1.c f125761b;

    /* renamed from: c, reason: collision with root package name */
    public final t f125762c;

    public d(vh vhVar, t tVar, int i13) {
        vhVar = (i13 & 1) != 0 ? null : vhVar;
        y contentImpressionView = new y();
        tVar = (i13 & 4) != 0 ? null : tVar;
        Intrinsics.checkNotNullParameter(contentImpressionView, "contentImpressionView");
        this.f125760a = vhVar;
        this.f125761b = contentImpressionView;
        this.f125762c = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f125760a, dVar.f125760a) && Intrinsics.d(this.f125761b, dVar.f125761b) && Intrinsics.d(this.f125762c, dVar.f125762c);
    }

    public final int hashCode() {
        vh vhVar = this.f125760a;
        int hashCode = (this.f125761b.hashCode() + ((vhVar == null ? 0 : vhVar.hashCode()) * 31)) * 31;
        t tVar = this.f125762c;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        return "StructuredFeedStoryVMState(dynamicStory=" + this.f125760a + ", contentImpressionView=" + this.f125761b + ", storyContentParams=" + this.f125762c + ")";
    }
}
