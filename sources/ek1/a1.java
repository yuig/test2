package ek1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f59209a;

    /* renamed from: b, reason: collision with root package name */
    public final f30 f59210b;

    public a1(int i13, f30 chip) {
        Intrinsics.checkNotNullParameter(chip, "chip");
        this.f59209a = i13;
        this.f59210b = chip;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f59209a == a1Var.f59209a && Intrinsics.d(this.f59210b, a1Var.f59210b);
    }

    public final int hashCode() {
        return this.f59210b.hashCode() + (Integer.hashCode(this.f59209a) * 31);
    }

    public final f30 j() {
        return this.f59210b;
    }

    public final int k() {
        return this.f59209a;
    }

    public final String toString() {
        return "SetCurrentlyViewedChip(currentlyViewedChipIndex=" + this.f59209a + ", chip=" + this.f59210b + ")";
    }
}
