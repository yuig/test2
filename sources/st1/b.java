package st1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f115173a;

    /* renamed from: b, reason: collision with root package name */
    public final List f115174b;

    public b(List list, List list2) {
        this.f115173a = list;
        this.f115174b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f115173a, bVar.f115173a) && Intrinsics.d(this.f115174b, bVar.f115174b);
    }

    public final int hashCode() {
        List list = this.f115173a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f115174b;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "CutoutMaskModel(hiddenMasks=" + this.f115173a + ", masks=" + this.f115174b + ")";
    }
}
