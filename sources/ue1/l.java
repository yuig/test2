package ue1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a */
    public final List f122026a;

    /* renamed from: b */
    public final ze0.a f122027b;

    /* renamed from: c */
    public final uk1.d f122028c;

    /* renamed from: d */
    public final int f122029d;

    /* renamed from: e */
    public final boolean f122030e;

    /* renamed from: f */
    public final int f122031f;

    /* renamed from: g */
    public final o f122032g;

    /* renamed from: h */
    public final String f122033h;

    public l(List storyItemRepModels, ze0.a userRepStyle, uk1.d presenterPinalytics, int i13, boolean z13, int i14, o itemPaddingSpec) {
        Intrinsics.checkNotNullParameter(storyItemRepModels, "storyItemRepModels");
        Intrinsics.checkNotNullParameter(userRepStyle, "userRepStyle");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(itemPaddingSpec, "itemPaddingSpec");
        this.f122026a = storyItemRepModels;
        this.f122027b = userRepStyle;
        this.f122028c = presenterPinalytics;
        this.f122029d = i13;
        this.f122030e = z13;
        this.f122031f = i14;
        this.f122032g = itemPaddingSpec;
        this.f122033h = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f122026a, lVar.f122026a) && this.f122027b == lVar.f122027b && Intrinsics.d(this.f122028c, lVar.f122028c) && this.f122029d == lVar.f122029d && this.f122030e == lVar.f122030e && this.f122031f == lVar.f122031f && Intrinsics.d(this.f122032g, lVar.f122032g) && Intrinsics.d(this.f122033h, lVar.f122033h);
    }

    public final int hashCode() {
        int hashCode = (this.f122032g.hashCode() + ep.b.b(this.f122031f, ep.b.e(this.f122030e, ep.b.b(this.f122029d, (this.f122028c.hashCode() + ((this.f122027b.hashCode() + (this.f122026a.hashCode() * 31)) * 31)) * 31, 31), 31), 31)) * 31;
        String str = this.f122033h;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContentItemRepData(storyItemRepModels=");
        sb3.append(this.f122026a);
        sb3.append(", userRepStyle=");
        sb3.append(this.f122027b);
        sb3.append(", presenterPinalytics=");
        sb3.append(this.f122028c);
        sb3.append(", itemWidth=");
        sb3.append(this.f122029d);
        sb3.append(", centerItems=");
        sb3.append(this.f122030e);
        sb3.append(", containerPadding=");
        sb3.append(this.f122031f);
        sb3.append(", itemPaddingSpec=");
        sb3.append(this.f122032g);
        sb3.append(", indicatorImageUrl=");
        return a.a.p(sb3, this.f122033h, ")");
    }
}
