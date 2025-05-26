package ae0;

import a.cb;
import dl1.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f15049a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15050b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15051c;

    /* renamed from: d, reason: collision with root package name */
    public final cw0.e f15052d;

    public f(@NotNull String contentId, @NotNull String userId, long j13, @NotNull cw0.e contentType) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f15049a = contentId;
        this.f15050b = userId;
        this.f15051c = j13;
        this.f15052d = contentType;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f15050b + "_" + this.f15049a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f15049a, fVar.f15049a) && Intrinsics.d(this.f15050b, fVar.f15050b) && this.f15051c == fVar.f15051c && this.f15052d == fVar.f15052d;
    }

    public final int hashCode() {
        return this.f15052d.hashCode() + a.a.c(this.f15051c, cb.d(this.f15050b, this.f15049a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "IdeaPinRecentlyUsedContentEntity(contentId=" + this.f15049a + ", userId=" + this.f15050b + ", lastUsedTimestamp=" + this.f15051c + ", contentType=" + this.f15052d + ")";
    }
}
