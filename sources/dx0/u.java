package dx0;

import a.cb;
import bx0.z;
import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import o82.j0;
import zy.l0;

/* loaded from: classes5.dex */
public final class u implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f56453a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f56454b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f56455c;

    /* renamed from: d, reason: collision with root package name */
    public final z f56456d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f56457e;

    /* renamed from: f, reason: collision with root package name */
    public final String f56458f;

    /* renamed from: g, reason: collision with root package name */
    public final j0 f56459g;

    /* renamed from: h, reason: collision with root package name */
    public final mj0.g f56460h;

    public u(vh dynamicStory, boolean z13, j0 listVMState, z moduleVariant, l0 pinalyticsVMState, String clientTrackingParams, j0 pinListVMState, mj0.g oneTapSaveListener) {
        Intrinsics.checkNotNullParameter(dynamicStory, "dynamicStory");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        Intrinsics.checkNotNullParameter(pinListVMState, "pinListVMState");
        Intrinsics.checkNotNullParameter(oneTapSaveListener, "oneTapSaveListener");
        this.f56453a = dynamicStory;
        this.f56454b = z13;
        this.f56455c = listVMState;
        this.f56456d = moduleVariant;
        this.f56457e = pinalyticsVMState;
        this.f56458f = clientTrackingParams;
        this.f56459g = pinListVMState;
        this.f56460h = oneTapSaveListener;
    }

    public static u b(u uVar, j0 listVMState) {
        vh dynamicStory = uVar.f56453a;
        boolean z13 = uVar.f56454b;
        z moduleVariant = uVar.f56456d;
        l0 pinalyticsVMState = uVar.f56457e;
        String clientTrackingParams = uVar.f56458f;
        j0 pinListVMState = uVar.f56459g;
        mj0.g oneTapSaveListener = uVar.f56460h;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(dynamicStory, "dynamicStory");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        Intrinsics.checkNotNullParameter(pinListVMState, "pinListVMState");
        Intrinsics.checkNotNullParameter(oneTapSaveListener, "oneTapSaveListener");
        return new u(dynamicStory, z13, listVMState, moduleVariant, pinalyticsVMState, clientTrackingParams, pinListVMState, oneTapSaveListener);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f56453a, uVar.f56453a) && this.f56454b == uVar.f56454b && Intrinsics.d(this.f56455c, uVar.f56455c) && this.f56456d == uVar.f56456d && Intrinsics.d(this.f56457e, uVar.f56457e) && Intrinsics.d(this.f56458f, uVar.f56458f) && Intrinsics.d(this.f56459g, uVar.f56459g) && Intrinsics.d(this.f56460h, uVar.f56460h);
    }

    public final int hashCode() {
        return this.f56460h.hashCode() + ep.b.c(this.f56459g.f93634a, cb.d(this.f56458f, jq.b.a(this.f56457e, (this.f56456d.hashCode() + ep.b.c(this.f56455c.f93634a, ep.b.e(this.f56454b, this.f56453a.hashCode() * 31, 31), 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ShopTheLookCarouselVMState(dynamicStory=" + this.f56453a + ", shouldLoadStory=" + this.f56454b + ", listVMState=" + this.f56455c + ", moduleVariant=" + this.f56456d + ", pinalyticsVMState=" + this.f56457e + ", clientTrackingParams=" + this.f56458f + ", pinListVMState=" + this.f56459g + ", oneTapSaveListener=" + this.f56460h + ")";
    }
}
