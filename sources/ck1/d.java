package ck1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import wa2.m;
import zy.l0;

/* loaded from: classes2.dex */
public final class d implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f27908a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27909b;

    /* renamed from: c, reason: collision with root package name */
    public final m f27910c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f27911d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27912e;

    public d(f30 pinModel, int i13, m pinFeatureConfig, l0 pinalyticsVMState, boolean z13) {
        Intrinsics.checkNotNullParameter(pinModel, "pinModel");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f27908a = pinModel;
        this.f27909b = i13;
        this.f27910c = pinFeatureConfig;
        this.f27911d = pinalyticsVMState;
        this.f27912e = z13;
    }

    public static d b(d dVar, l0 l0Var, boolean z13, int i13) {
        f30 pinModel = dVar.f27908a;
        int i14 = dVar.f27909b;
        m pinFeatureConfig = dVar.f27910c;
        if ((i13 & 8) != 0) {
            l0Var = dVar.f27911d;
        }
        l0 pinalyticsVMState = l0Var;
        if ((i13 & 16) != 0) {
            z13 = dVar.f27912e;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(pinModel, "pinModel");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new d(pinModel, i14, pinFeatureConfig, pinalyticsVMState, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f27908a, dVar.f27908a) && this.f27909b == dVar.f27909b && Intrinsics.d(this.f27910c, dVar.f27910c) && Intrinsics.d(this.f27911d, dVar.f27911d) && this.f27912e == dVar.f27912e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27912e) + jq.b.a(this.f27911d, (this.f27910c.hashCode() + ep.b.b(this.f27909b, this.f27908a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FooterZoneVMState(pinModel=");
        sb3.append(this.f27908a);
        sb3.append(", position=");
        sb3.append(this.f27909b);
        sb3.append(", pinFeatureConfig=");
        sb3.append(this.f27910c);
        sb3.append(", pinalyticsVMState=");
        sb3.append(this.f27911d);
        sb3.append(", shouldNotRenderFooter=");
        return a.a.r(sb3, this.f27912e, ")");
    }
}
