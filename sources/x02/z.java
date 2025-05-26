package x02;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f131541a;

    /* renamed from: b, reason: collision with root package name */
    public final v7 f131542b;

    public z(v7 mergedBoard, v7 destinationBoard) {
        Intrinsics.checkNotNullParameter(mergedBoard, "mergedBoard");
        Intrinsics.checkNotNullParameter(destinationBoard, "destinationBoard");
        this.f131541a = mergedBoard;
        this.f131542b = destinationBoard;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f131541a, zVar.f131541a) && Intrinsics.d(this.f131542b, zVar.f131542b);
    }

    public final int hashCode() {
        return this.f131542b.hashCode() + (this.f131541a.hashCode() * 31);
    }

    public final String toString() {
        return "BoardMergedEvent(mergedBoard=" + this.f131541a + ", destinationBoard=" + this.f131542b + ")";
    }
}
