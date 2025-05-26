package yw0;

import a.cb;
import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class m implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f140304a;

    /* renamed from: b, reason: collision with root package name */
    public final n f140305b;

    /* renamed from: c, reason: collision with root package name */
    public final String f140306c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f140307d;

    /* renamed from: e, reason: collision with root package name */
    public final l f140308e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f140309f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f140310g;

    /* renamed from: h, reason: collision with root package name */
    public final String f140311h;

    public m(vh dynamicStory, String clientTrackingParams, Integer num, l surface, boolean z13, boolean z14, int i13) {
        dynamicStory = (i13 & 1) != 0 ? new vh() : dynamicStory;
        n moduleVariant = n.DROPDOWN;
        clientTrackingParams = (i13 & 4) != 0 ? "" : clientTrackingParams;
        num = (i13 & 8) != 0 ? null : num;
        surface = (i13 & 16) != 0 ? l.CLOSEUP : surface;
        z13 = (i13 & 32) != 0 ? false : z13;
        z14 = (i13 & 64) != 0 ? false : z14;
        Intrinsics.checkNotNullParameter(dynamicStory, "dynamicStory");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter("", "pinBookmark");
        this.f140304a = dynamicStory;
        this.f140305b = moduleVariant;
        this.f140306c = clientTrackingParams;
        this.f140307d = num;
        this.f140308e = surface;
        this.f140309f = z13;
        this.f140310g = z14;
        this.f140311h = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f140304a, mVar.f140304a) && this.f140305b == mVar.f140305b && Intrinsics.d(this.f140306c, mVar.f140306c) && Intrinsics.d(this.f140307d, mVar.f140307d) && this.f140308e == mVar.f140308e && this.f140309f == mVar.f140309f && this.f140310g == mVar.f140310g && Intrinsics.d(this.f140311h, mVar.f140311h);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f140306c, (this.f140305b.hashCode() + (this.f140304a.hashCode() * 31)) * 31, 31);
        Integer num = this.f140307d;
        return this.f140311h.hashCode() + ep.b.e(this.f140310g, ep.b.e(this.f140309f, (this.f140308e.hashCode() + ((d2 + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SeeItStyledModuleVMState(dynamicStory=");
        sb3.append(this.f140304a);
        sb3.append(", moduleVariant=");
        sb3.append(this.f140305b);
        sb3.append(", clientTrackingParams=");
        sb3.append(this.f140306c);
        sb3.append(", position=");
        sb3.append(this.f140307d);
        sb3.append(", surface=");
        sb3.append(this.f140308e);
        sb3.append(", shouldUseStaticSubtitle=");
        sb3.append(this.f140309f);
        sb3.append(", isInEnabledCTAGroup=");
        sb3.append(this.f140310g);
        sb3.append(", pinBookmark=");
        return a.a.p(sb3, this.f140311h, ")");
    }
}
