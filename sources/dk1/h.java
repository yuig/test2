package dk1;

import com.pinterest.api.model.f30;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import ni1.x2;
import wa2.m;
import zy.l0;

/* loaded from: classes2.dex */
public final class h implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f55166a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55167b;

    /* renamed from: c, reason: collision with root package name */
    public final m f55168c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f55169d;

    /* renamed from: e, reason: collision with root package name */
    public final x2 f55170e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f55171f;

    public h(f30 pinModel, int i13, m pinFeatureConfig, l0 pinalyticsVMState, x2 experimentConfigs, Map experimentsGroupInfo) {
        Intrinsics.checkNotNullParameter(pinModel, "pinModel");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        this.f55166a = pinModel;
        this.f55167b = i13;
        this.f55168c = pinFeatureConfig;
        this.f55169d = pinalyticsVMState;
        this.f55170e = experimentConfigs;
        this.f55171f = experimentsGroupInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f55166a, hVar.f55166a) && this.f55167b == hVar.f55167b && Intrinsics.d(this.f55168c, hVar.f55168c) && Intrinsics.d(this.f55169d, hVar.f55169d) && Intrinsics.d(this.f55170e, hVar.f55170e) && Intrinsics.d(this.f55171f, hVar.f55171f);
    }

    public final int hashCode() {
        return this.f55171f.hashCode() + ((this.f55170e.hashCode() + jq.b.a(this.f55169d, (this.f55168c.hashCode() + ep.b.b(this.f55167b, this.f55166a.hashCode() * 31, 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "HeaderZoneVMState(pinModel=" + this.f55166a + ", position=" + this.f55167b + ", pinFeatureConfig=" + this.f55168c + ", pinalyticsVMState=" + this.f55169d + ", experimentConfigs=" + this.f55170e + ", experimentsGroupInfo=" + this.f55171f + ")";
    }
}
