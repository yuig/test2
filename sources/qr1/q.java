package qr1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lqr1/q;", "", "", "a", "Z", "()Z", "isMigrationBackfilled", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("is_migration_backfilled")
    private final boolean isMigrationBackfilled;

    /* renamed from: a, reason: from getter */
    public final boolean getIsMigrationBackfilled() {
        return this.isMigrationBackfilled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.isMigrationBackfilled == ((q) obj).isMigrationBackfilled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isMigrationBackfilled);
    }

    public final String toString() {
        return "InstagramConnectResponse(isMigrationBackfilled=" + this.isMigrationBackfilled + ")";
    }
}
