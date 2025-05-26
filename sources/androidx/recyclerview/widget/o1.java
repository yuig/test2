package androidx.recyclerview.widget;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19537a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19538b;

    /* renamed from: c, reason: collision with root package name */
    public final u1 f19539c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19540d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19541e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19542f;

    public o1(boolean z13, String str, u1 currentSpan, int i13, int i14, boolean z14) {
        Intrinsics.checkNotNullParameter(currentSpan, "currentSpan");
        this.f19537a = z13;
        this.f19538b = str;
        this.f19539c = currentSpan;
        this.f19540d = i13;
        this.f19541e = i14;
        this.f19542f = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f19537a == o1Var.f19537a && Intrinsics.d(this.f19538b, o1Var.f19538b) && Intrinsics.d(this.f19539c, o1Var.f19539c) && this.f19540d == o1Var.f19540d && this.f19541e == o1Var.f19541e && this.f19542f == o1Var.f19542f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f19537a) * 31;
        String str = this.f19538b;
        return Boolean.hashCode(this.f19542f) + ep.b.b(this.f19541e, ep.b.b(this.f19540d, (this.f19539c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinLevelingResult(didApplyLeveling=");
        sb3.append(this.f19537a);
        sb3.append(", curUid=");
        sb3.append(this.f19538b);
        sb3.append(", currentSpan=");
        sb3.append(this.f19539c);
        sb3.append(", start=");
        sb3.append(this.f19540d);
        sb3.append(", end=");
        sb3.append(this.f19541e);
        sb3.append(", itemWasMovedForGapFilling=");
        return a.a.r(sb3, this.f19542f, ")");
    }
}
