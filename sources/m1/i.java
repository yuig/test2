package m1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f85370a;

    /* renamed from: b, reason: collision with root package name */
    public final ao2.m f85371b;

    public i(t1.g gVar, ao2.o oVar) {
        this.f85370a = gVar;
        this.f85371b = oVar;
    }

    public final String toString() {
        String str;
        ao2.m mVar = this.f85371b;
        ao2.i0 i0Var = (ao2.i0) mVar.getContext().get(ao2.i0.f20162c);
        String str2 = i0Var != null ? i0Var.f20163b : null;
        StringBuilder sb3 = new StringBuilder("Request@");
        String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        sb3.append(num);
        if (str2 == null || (str = a.a.k("[", str2, "](")) == null) {
            str = "(";
        }
        sb3.append(str);
        sb3.append("currentBounds()=");
        sb3.append(this.f85370a.invoke());
        sb3.append(", continuation=");
        sb3.append(mVar);
        sb3.append(')');
        return sb3.toString();
    }
}
