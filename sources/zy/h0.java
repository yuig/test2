package zy;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f143078a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f143079b;

    public h0(String objectId, HashMap auxData) {
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f143078a = objectId;
        this.f143079b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.d(this.f143078a, h0Var.f143078a) && Intrinsics.d(this.f143079b, h0Var.f143079b);
    }

    public final HashMap getAuxData() {
        return this.f143079b;
    }

    public final int hashCode() {
        return this.f143079b.hashCode() + (this.f143078a.hashCode() * 31);
    }

    public final String j() {
        return this.f143078a;
    }

    public final String toString() {
        return "StartScreenMetricSideEffectRequest(objectId=" + this.f143078a + ", auxData=" + this.f143079b + ")";
    }
}
