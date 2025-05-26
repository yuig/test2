package ij1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o implements aj1.a {

    /* renamed from: a, reason: collision with root package name */
    public final h f72375a;

    /* renamed from: b, reason: collision with root package name */
    public final a f72376b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f72377c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f72378d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f72379e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f72380f;

    /* renamed from: g, reason: collision with root package name */
    public final g f72381g;

    public o(h metadataConfig, a avatar, boolean z13, boolean z14, boolean z15, boolean z16, g heightMode) {
        Intrinsics.checkNotNullParameter(metadataConfig, "metadataConfig");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        this.f72375a = metadataConfig;
        this.f72376b = avatar;
        this.f72377c = z13;
        this.f72378d = z14;
        this.f72379e = z15;
        this.f72380f = z16;
        this.f72381g = heightMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f72375a, oVar.f72375a) && Intrinsics.d(this.f72376b, oVar.f72376b) && this.f72377c == oVar.f72377c && this.f72378d == oVar.f72378d && this.f72379e == oVar.f72379e && this.f72380f == oVar.f72380f && Intrinsics.d(this.f72381g, oVar.f72381g);
    }

    public final int hashCode() {
        return this.f72381g.hashCode() + ep.b.e(this.f72380f, ep.b.e(this.f72379e, ep.b.e(this.f72378d, ep.b.e(this.f72377c, (this.f72376b.hashCode() + (this.f72375a.hashCode() * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "UserDrawableDS(metadataConfig=" + this.f72375a + ", avatar=" + this.f72376b + ", renderVerifiedMerchantBadge=" + this.f72377c + ", renderVerifiedUserBadge=" + this.f72378d + ", renderVerifiedFillBadge=" + this.f72379e + ", renderAvatar=" + this.f72380f + ", heightMode=" + this.f72381g + ")";
    }
}
