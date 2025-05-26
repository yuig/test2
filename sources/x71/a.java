package x71;

import a.cb;
import dl1.s;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f134111a;

    /* renamed from: b, reason: collision with root package name */
    public final String f134112b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f134113c;

    public a(@NotNull String id3, @NotNull String userId, @NotNull Date lastUpdatedAt) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(lastUpdatedAt, "lastUpdatedAt");
        this.f134111a = id3;
        this.f134112b = userId;
        this.f134113c = lastUpdatedAt;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f134111a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f134111a, aVar.f134111a) && Intrinsics.d(this.f134112b, aVar.f134112b) && Intrinsics.d(this.f134113c, aVar.f134113c);
    }

    public final int hashCode() {
        return this.f134113c.hashCode() + cb.d(this.f134112b, this.f134111a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CollageDraftEntity(id=" + this.f134111a + ", userId=" + this.f134112b + ", lastUpdatedAt=" + this.f134113c + ")";
    }
}
