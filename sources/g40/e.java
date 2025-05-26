package g40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: d, reason: collision with root package name */
    public final String f63495d;

    /* renamed from: e, reason: collision with root package name */
    public final d f63496e;

    public e(String __typename, d dVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f63495d = __typename;
        this.f63496e = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f63495d, eVar.f63495d) && Intrinsics.d(this.f63496e, eVar.f63496e);
    }

    public final int hashCode() {
        int hashCode = this.f63495d.hashCode() * 31;
        d dVar = this.f63496e;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "InterestResponseV3RemoveFatigueForInterestAfterFeedbackMutation(__typename=" + this.f63495d + ", data=" + this.f63496e + ")";
    }
}
