package zw0;

import a.cb;
import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import o82.j0;
import zy.l0;

/* loaded from: classes5.dex */
public final class s implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f142922a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f142923b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f142924c;

    /* renamed from: d, reason: collision with root package name */
    public final yw0.n f142925d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f142926e;

    /* renamed from: f, reason: collision with root package name */
    public final String f142927f;

    /* renamed from: g, reason: collision with root package name */
    public final j0 f142928g;

    public s(vh dynamicStory, boolean z13, j0 listVMState, yw0.n moduleVariant, l0 pinalyticsVMState, String clientTrackingParams, j0 pinListVMState) {
        Intrinsics.checkNotNullParameter(dynamicStory, "dynamicStory");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        Intrinsics.checkNotNullParameter(pinListVMState, "pinListVMState");
        this.f142922a = dynamicStory;
        this.f142923b = z13;
        this.f142924c = listVMState;
        this.f142925d = moduleVariant;
        this.f142926e = pinalyticsVMState;
        this.f142927f = clientTrackingParams;
        this.f142928g = pinListVMState;
    }

    public static s b(s sVar, j0 listVMState) {
        vh dynamicStory = sVar.f142922a;
        boolean z13 = sVar.f142923b;
        yw0.n moduleVariant = sVar.f142925d;
        l0 pinalyticsVMState = sVar.f142926e;
        String clientTrackingParams = sVar.f142927f;
        j0 pinListVMState = sVar.f142928g;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(dynamicStory, "dynamicStory");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        Intrinsics.checkNotNullParameter(pinListVMState, "pinListVMState");
        return new s(dynamicStory, z13, listVMState, moduleVariant, pinalyticsVMState, clientTrackingParams, pinListVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f142922a, sVar.f142922a) && this.f142923b == sVar.f142923b && Intrinsics.d(this.f142924c, sVar.f142924c) && this.f142925d == sVar.f142925d && Intrinsics.d(this.f142926e, sVar.f142926e) && Intrinsics.d(this.f142927f, sVar.f142927f) && Intrinsics.d(this.f142928g, sVar.f142928g);
    }

    public final int hashCode() {
        return this.f142928g.f93634a.hashCode() + cb.d(this.f142927f, jq.b.a(this.f142926e, (this.f142925d.hashCode() + ep.b.c(this.f142924c.f93634a, ep.b.e(this.f142923b, this.f142922a.hashCode() * 31, 31), 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "CompleteTheLookCarouselVMState(dynamicStory=" + this.f142922a + ", shouldLoadStory=" + this.f142923b + ", listVMState=" + this.f142924c + ", moduleVariant=" + this.f142925d + ", pinalyticsVMState=" + this.f142926e + ", clientTrackingParams=" + this.f142927f + ", pinListVMState=" + this.f142928g + ")";
    }
}
