package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class aj implements qi {

    /* renamed from: a, reason: collision with root package name */
    public final String f131994a;

    /* renamed from: b, reason: collision with root package name */
    public final zi f131995b;

    public aj(String __typename, zi ziVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f131994a = __typename;
        this.f131995b = ziVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return Intrinsics.d(this.f131994a, ajVar.f131994a) && Intrinsics.d(this.f131995b, ajVar.f131995b);
    }

    public final int hashCode() {
        int hashCode = this.f131994a.hashCode() * 31;
        zi ziVar = this.f131995b;
        return hashCode + (ziVar == null ? 0 : ziVar.hashCode());
    }

    public final String toString() {
        return "UserFollowersConnectionContainerFollowers(__typename=" + this.f131994a + ", connection=" + this.f131995b + ")";
    }
}
