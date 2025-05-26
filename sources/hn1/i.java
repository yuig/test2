package hn1;

import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.i0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final tm1.d f69653a;

    /* renamed from: b, reason: collision with root package name */
    public final tm1.a f69654b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f69655c;

    public i(tm1.d illustration, tm1.a ratio, f0 contentDescription) {
        Intrinsics.checkNotNullParameter(illustration, "illustration");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f69653a = illustration;
        this.f69654b = ratio;
        this.f69655c = contentDescription;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f69653a == iVar.f69653a && this.f69654b == iVar.f69654b && Intrinsics.d(this.f69655c, iVar.f69655c);
    }

    public final int hashCode() {
        return this.f69655c.hashCode() + ((this.f69654b.hashCode() + (this.f69653a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IllustrationConfig(illustration=");
        sb3.append(this.f69653a);
        sb3.append(", ratio=");
        sb3.append(this.f69654b);
        sb3.append(", contentDescription=");
        return jq.b.k(sb3, this.f69655c, ")");
    }
}
