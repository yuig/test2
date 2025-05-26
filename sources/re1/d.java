package re1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a */
    public final wy0 f107568a;

    /* renamed from: b */
    public final oa2.l f107569b;

    /* renamed from: c */
    public final yl1.b f107570c;

    /* renamed from: d */
    public final boolean f107571d;

    /* renamed from: e */
    public final boolean f107572e;

    public d(wy0 user, xe1.a0 userRepActionListener, yl1.b bVar, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(userRepActionListener, "userRepActionListener");
        this.f107568a = user;
        this.f107569b = userRepActionListener;
        this.f107570c = bVar;
        this.f107571d = z13;
        this.f107572e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f107568a, dVar.f107568a) && Intrinsics.d(this.f107569b, dVar.f107569b) && Intrinsics.d(this.f107570c, dVar.f107570c) && this.f107571d == dVar.f107571d && this.f107572e == dVar.f107572e;
    }

    public final int hashCode() {
        int hashCode = (this.f107569b.hashCode() + (this.f107568a.hashCode() * 31)) * 31;
        yl1.b bVar = this.f107570c;
        return Boolean.hashCode(this.f107572e) + ep.b.e(this.f107571d, (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HeaderUserViewModel(user=");
        sb3.append(this.f107568a);
        sb3.append(", userRepActionListener=");
        sb3.append(this.f107569b);
        sb3.append(", actionButtonState=");
        sb3.append(this.f107570c);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f107571d);
        sb3.append(", isPartner=");
        return a.a.r(sb3, this.f107572e, ")");
    }
}
