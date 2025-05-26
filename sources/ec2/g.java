package ec2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes2.dex */
public final class g extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f58446a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58447b;

    /* renamed from: c, reason: collision with root package name */
    public final bc2.j f58448c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58449d;

    /* renamed from: e, reason: collision with root package name */
    public final int f58450e;

    /* renamed from: f, reason: collision with root package name */
    public final int f58451f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f58452g;

    public g(int i13, bc2.j contentType, boolean z13, int i14) {
        i13 = (i14 & 1) != 0 ? 0 : i13;
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        int i15 = f.f58445a[contentType.ordinal()] == 1 ? 540 : RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM;
        z13 = (i14 & 64) != 0 ? false : z13;
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f58446a = i13;
        this.f58447b = 0;
        this.f58448c = contentType;
        this.f58449d = i15;
        this.f58450e = 1440;
        this.f58451f = 2500000;
        this.f58452g = z13;
    }

    @Override // pk.a0
    public final int X() {
        return this.f58450e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f58446a == gVar.f58446a && this.f58447b == gVar.f58447b && this.f58448c == gVar.f58448c && this.f58449d == gVar.f58449d && this.f58450e == gVar.f58450e && this.f58451f == gVar.f58451f && this.f58452g == gVar.f58452g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58452g) + ep.b.b(this.f58451f, ep.b.b(this.f58450e, ep.b.b(this.f58449d, (this.f58448c.hashCode() + ep.b.b(this.f58447b, Integer.hashCode(this.f58446a) * 31, 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinterestRenderMetadata(maxResolutionWidth=");
        sb3.append(this.f58446a);
        sb3.append(", maxResolutionHeight=");
        sb3.append(this.f58447b);
        sb3.append(", contentType=");
        sb3.append(this.f58448c);
        sb3.append(", minResolution=");
        sb3.append(this.f58449d);
        sb3.append(", maxResolution=");
        sb3.append(this.f58450e);
        sb3.append(", maxBitrate=");
        sb3.append(this.f58451f);
        sb3.append(", enforceConstraints=");
        return a.a.r(sb3, this.f58452g, ")");
    }
}
