package yd0;

import dl1.s;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ou1.c;

/* loaded from: classes5.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f138772a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f138773b;

    /* renamed from: c, reason: collision with root package name */
    public final String f138774c;

    /* renamed from: d, reason: collision with root package name */
    public final int f138775d;

    /* renamed from: e, reason: collision with root package name */
    public final long f138776e;

    /* renamed from: f, reason: collision with root package name */
    public final Date f138777f;

    /* renamed from: g, reason: collision with root package name */
    public final List f138778g;

    /* renamed from: h, reason: collision with root package name */
    public final Date f138779h;

    public b(@NotNull String id3, boolean z13, String str, int i13, long j13, @NotNull Date lastUpdatedAt, @NotNull List<String> exportedMedia, c cVar, @NotNull Date createdAt) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(lastUpdatedAt, "lastUpdatedAt");
        Intrinsics.checkNotNullParameter(exportedMedia, "exportedMedia");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f138772a = id3;
        this.f138773b = z13;
        this.f138774c = str;
        this.f138775d = i13;
        this.f138776e = j13;
        this.f138777f = lastUpdatedAt;
        this.f138778g = exportedMedia;
        this.f138779h = createdAt;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f138772a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f138772a, bVar.f138772a) && this.f138773b == bVar.f138773b && Intrinsics.d(this.f138774c, bVar.f138774c) && this.f138775d == bVar.f138775d && this.f138776e == bVar.f138776e && Intrinsics.d(this.f138777f, bVar.f138777f) && Intrinsics.d(this.f138778g, bVar.f138778g) && Intrinsics.d(null, null) && Intrinsics.d(this.f138779h, bVar.f138779h);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f138773b, this.f138772a.hashCode() * 31, 31);
        String str = this.f138774c;
        return this.f138779h.hashCode() + ep.b.c(this.f138778g, (this.f138777f.hashCode() + a.a.c(this.f138776e, ep.b.b(this.f138775d, (e13 + (str == null ? 0 : str.hashCode())) * 31, 31), 31)) * 31, 961);
    }

    public final String toString() {
        return "IdeaPinDraftEntityMetadata(id=" + this.f138772a + ", isBroken=" + this.f138773b + ", coverImagePath=" + this.f138774c + ", pageCount=" + this.f138775d + ", duration=" + this.f138776e + ", lastUpdatedAt=" + this.f138777f + ", exportedMedia=" + this.f138778g + ", commentReplyData=null, createdAt=" + this.f138779h + ")";
    }
}
