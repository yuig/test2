package br0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f23735a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23736b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23737c;

    public c(int i13, int i14, List actionButtons) {
        Intrinsics.checkNotNullParameter(actionButtons, "actionButtons");
        this.f23735a = actionButtons;
        this.f23736b = i13;
        this.f23737c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f23735a, cVar.f23735a) && this.f23736b == cVar.f23736b && this.f23737c == cVar.f23737c;
    }

    public final int hashCode() {
        return Integer.hashCode(3) + ep.b.b(this.f23737c, ep.b.b(this.f23736b, this.f23735a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActionButtonGridState(actionButtons=");
        sb3.append(this.f23735a);
        sb3.append(", horizontalSpacing=");
        sb3.append(this.f23736b);
        sb3.append(", verticalSpacing=");
        return a.a.n(sb3, this.f23737c, ", maxButtonsPerRow=3)");
    }
}
