package qo2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 extends y0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f104533l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(String name, c0 generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.f104533l = true;
    }

    @Override // qo2.y0
    public final boolean equals(Object obj) {
        int i13;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            oo2.g gVar = (oo2.g) obj;
            if (Intrinsics.d(this.f104656a, gVar.i())) {
                b0 b0Var = (b0) obj;
                if (b0Var.f104533l && Arrays.equals((oo2.g[]) this.f104665j.getValue(), (oo2.g[]) b0Var.f104665j.getValue())) {
                    int e13 = gVar.e();
                    int i14 = this.f104658c;
                    if (i14 == e13) {
                        for (0; i13 < i14; i13 + 1) {
                            i13 = (Intrinsics.d(h(i13).i(), gVar.h(i13).i()) && Intrinsics.d(h(i13).c(), gVar.h(i13).c())) ? i13 + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // qo2.y0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // qo2.y0, oo2.g
    public final boolean isInline() {
        return this.f104533l;
    }
}
