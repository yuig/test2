package mm2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final pn2.b0 f87738a;

    /* renamed from: b, reason: collision with root package name */
    public final List f87739b;

    /* renamed from: c, reason: collision with root package name */
    public final List f87740c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f87741d;

    /* renamed from: e, reason: collision with root package name */
    public final List f87742e;

    public x(List valueParameters, List typeParameters, List errors, pn2.b0 returnType, boolean z13) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f87738a = returnType;
        this.f87739b = valueParameters;
        this.f87740c = typeParameters;
        this.f87741d = z13;
        this.f87742e = errors;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f87738a, xVar.f87738a) && Intrinsics.d(null, null) && Intrinsics.d(this.f87739b, xVar.f87739b) && Intrinsics.d(this.f87740c, xVar.f87740c) && this.f87741d == xVar.f87741d && Intrinsics.d(this.f87742e, xVar.f87742e);
    }

    public final int hashCode() {
        return this.f87742e.hashCode() + ep.b.e(this.f87741d, ep.b.c(this.f87740c, ep.b.c(this.f87739b, this.f87738a.hashCode() * 961, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MethodSignatureData(returnType=");
        sb3.append(this.f87738a);
        sb3.append(", receiverType=null, valueParameters=");
        sb3.append(this.f87739b);
        sb3.append(", typeParameters=");
        sb3.append(this.f87740c);
        sb3.append(", hasStableParameterNames=");
        sb3.append(this.f87741d);
        sb3.append(", errors=");
        return d7.g.k(sb3, this.f87742e, ')');
    }
}
