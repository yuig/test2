package uz1;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Map f123274a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123275b;

    public a(String pushId, Map rawMap) {
        Intrinsics.checkNotNullParameter(rawMap, "rawMap");
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        Intrinsics.checkNotNullParameter("ACTION_ACCEPT", "action");
        this.f123274a = rawMap;
        this.f123275b = pushId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f123274a, aVar.f123274a) && Intrinsics.d(this.f123275b, aVar.f123275b) && Intrinsics.d("ACTION_ACCEPT", "ACTION_ACCEPT");
    }

    public final int hashCode() {
        return ((this.f123275b.hashCode() + (this.f123274a.hashCode() * 31)) * 31) - 1834783951;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardActionServiceIntentData(rawMap=");
        sb3.append(this.f123274a);
        sb3.append(", pushId=");
        return a.a.p(sb3, this.f123275b, ", action=ACTION_ACCEPT)");
    }
}
