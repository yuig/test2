package oe;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f94203a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94204b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94205c;

    public o(String datasetID, String cloudBridgeURL, String accessKey) {
        Intrinsics.checkNotNullParameter(datasetID, "datasetID");
        Intrinsics.checkNotNullParameter(cloudBridgeURL, "cloudBridgeURL");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        this.f94203a = datasetID;
        this.f94204b = cloudBridgeURL;
        this.f94205c = accessKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f94203a, oVar.f94203a) && Intrinsics.d(this.f94204b, oVar.f94204b) && Intrinsics.d(this.f94205c, oVar.f94205c);
    }

    public final int hashCode() {
        return this.f94205c.hashCode() + cb.d(this.f94204b, this.f94203a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CloudBridgeCredentials(datasetID=");
        sb3.append(this.f94203a);
        sb3.append(", cloudBridgeURL=");
        sb3.append(this.f94204b);
        sb3.append(", accessKey=");
        return ep.b.k(sb3, this.f94205c, ')');
    }
}
