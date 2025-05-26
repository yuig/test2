package androidx.compose.foundation.lazy.layout;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r extends u2.p implements s3.r {

    /* renamed from: n, reason: collision with root package name */
    public u f17279n;

    @Override // u2.p
    public final void D0() {
        this.f17279n.getClass();
    }

    @Override // u2.p
    public final void E0() {
        this.f17279n.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f17279n, ((r) obj).f17279n);
    }

    @Override // s3.r
    public final void f(d3.e eVar) {
        ArrayList arrayList = this.f17279n.f17300h;
        if (arrayList.size() <= 0) {
            ((s3.m0) eVar).a();
        } else {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(0));
            throw null;
        }
    }

    public final int hashCode() {
        return this.f17279n.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f17279n + ')';
    }
}
