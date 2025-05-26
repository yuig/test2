package com.pinterest.api.model;

import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class uo {

    /* renamed from: a, reason: collision with root package name */
    public final String f42598a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f42599b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42600c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42601d;

    /* renamed from: e, reason: collision with root package name */
    public final long f42602e;

    /* renamed from: f, reason: collision with root package name */
    public final Date f42603f;

    /* renamed from: g, reason: collision with root package name */
    public final List f42604g;

    /* renamed from: h, reason: collision with root package name */
    public final Date f42605h;

    public uo(@NotNull String id3, boolean z13, String str, int i13, long j13, @NotNull Date lastUpdatedAt, @NotNull List<String> exportedMedia, @NotNull Date createdAt) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(lastUpdatedAt, "lastUpdatedAt");
        Intrinsics.checkNotNullParameter(exportedMedia, "exportedMedia");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f42598a = id3;
        this.f42599b = z13;
        this.f42600c = str;
        this.f42601d = i13;
        this.f42602e = j13;
        this.f42603f = lastUpdatedAt;
        this.f42604g = exportedMedia;
        this.f42605h = createdAt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        return Intrinsics.d(this.f42598a, uoVar.f42598a) && this.f42599b == uoVar.f42599b && Intrinsics.d(this.f42600c, uoVar.f42600c) && this.f42601d == uoVar.f42601d && this.f42602e == uoVar.f42602e && Intrinsics.d(this.f42603f, uoVar.f42603f) && Intrinsics.d(this.f42604g, uoVar.f42604g) && Intrinsics.d(this.f42605h, uoVar.f42605h);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f42599b, this.f42598a.hashCode() * 31, 31);
        String str = this.f42600c;
        return this.f42605h.hashCode() + ep.b.c(this.f42604g, (this.f42603f.hashCode() + a.a.c(this.f42602e, ep.b.b(this.f42601d, (e13 + (str == null ? 0 : str.hashCode())) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        return "IdeaPinDraftMetadata(id=" + this.f42598a + ", isBroken=" + this.f42599b + ", coverImagePath=" + this.f42600c + ", pageCount=" + this.f42601d + ", duration=" + this.f42602e + ", lastUpdatedAt=" + this.f42603f + ", exportedMedia=" + this.f42604g + ", createdAt=" + this.f42605h + ")";
    }
}
