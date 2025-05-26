package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ss2 {

    /* renamed from: a */
    public final o52 f11215a;

    /* renamed from: b */
    public v01 f11216b;

    /* renamed from: c */
    public k72 f11217c;

    /* renamed from: d */
    public g5 f11218d;

    public ss2(o52 publisherRequestTraceMeta, v01 internalRequestTraceMeta, k72 renderTraceMeta, g5 adTraceMeta) {
        Intrinsics.checkNotNullParameter(publisherRequestTraceMeta, "publisherRequestTraceMeta");
        Intrinsics.checkNotNullParameter(internalRequestTraceMeta, "internalRequestTraceMeta");
        Intrinsics.checkNotNullParameter(renderTraceMeta, "renderTraceMeta");
        Intrinsics.checkNotNullParameter(adTraceMeta, "adTraceMeta");
        this.f11215a = publisherRequestTraceMeta;
        this.f11216b = internalRequestTraceMeta;
        this.f11217c = renderTraceMeta;
        this.f11218d = adTraceMeta;
    }

    public final void a(ss2 traceMetaSet) {
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        v01 v01Var = traceMetaSet.f11216b;
        v01 v01Var2 = this.f11216b;
        v01Var2.f12273b = v01Var.f12273b;
        v01Var2.f12272a = v01Var.f12272a;
        v01Var2.f12276e = v01Var.f12276e;
        v01Var2.f12275d = v01Var.f12275d;
        v01Var2.f12274c = v01Var.f12274c;
        k72 k72Var = traceMetaSet.f11217c;
        k72 k72Var2 = this.f11217c;
        k72Var2.f7150b = k72Var.f7150b;
        k72Var2.f7152d = k72Var.f7152d;
        k72Var2.f7153e = k72Var.f7153e;
        k72Var2.f7149a = k72Var.f7149a;
        k72Var2.f7151c = k72Var.f7151c;
        k72Var2.f7154f = k72Var.f7154f;
        g5 g5Var = traceMetaSet.f11218d;
        g5 g5Var2 = this.f11218d;
        g5Var2.f5405b = g5Var.f5405b;
        g5Var2.f5406c = g5Var.f5406c;
        g5Var2.f5404a = g5Var.f5404a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss2)) {
            return false;
        }
        ss2 ss2Var = (ss2) obj;
        return Intrinsics.d(this.f11215a, ss2Var.f11215a) && Intrinsics.d(this.f11216b, ss2Var.f11216b) && Intrinsics.d(this.f11217c, ss2Var.f11217c) && Intrinsics.d(this.f11218d, ss2Var.f11218d);
    }

    public final int hashCode() {
        return this.f11218d.hashCode() + ((this.f11217c.hashCode() + ((this.f11216b.hashCode() + (this.f11215a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TraceMetaSet(publisherRequestTraceMeta=" + this.f11215a + ", internalRequestTraceMeta=" + this.f11216b + ", renderTraceMeta=" + this.f11217c + ", adTraceMeta=" + this.f11218d + ")";
    }
}
