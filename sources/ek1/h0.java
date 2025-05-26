package ek1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h0 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f59238a;

    public h0(ArrayList adFormatsModularizationDiscrepancies) {
        Intrinsics.checkNotNullParameter(adFormatsModularizationDiscrepancies, "adFormatsModularizationDiscrepancies");
        this.f59238a = adFormatsModularizationDiscrepancies;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.d(this.f59238a, ((h0) obj).f59238a);
    }

    public final int hashCode() {
        return this.f59238a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("AdFormatsModularizationDiscrepancySideEffectRequest(adFormatsModularizationDiscrepancies="), this.f59238a, ")");
    }
}
