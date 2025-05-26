package ot1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f97530a;

    /* renamed from: b, reason: collision with root package name */
    public final r f97531b;

    /* renamed from: c, reason: collision with root package name */
    public final m f97532c;

    public a0(d colorPrimaries, r transferCharacteristics, m matrixCoefficients) {
        Intrinsics.checkNotNullParameter(colorPrimaries, "colorPrimaries");
        Intrinsics.checkNotNullParameter(transferCharacteristics, "transferCharacteristics");
        Intrinsics.checkNotNullParameter(matrixCoefficients, "matrixCoefficients");
        this.f97530a = colorPrimaries;
        this.f97531b = transferCharacteristics;
        this.f97532c = matrixCoefficients;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f97530a == a0Var.f97530a && this.f97531b == a0Var.f97531b && this.f97532c == a0Var.f97532c;
    }

    public final int hashCode() {
        return this.f97532c.hashCode() + ((this.f97531b.hashCode() + (this.f97530a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ColorDescription(colorPrimaries=" + this.f97530a + ", transferCharacteristics=" + this.f97531b + ", matrixCoefficients=" + this.f97532c + ")";
    }
}
