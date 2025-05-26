package li1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f83536a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83537b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f83538c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f83539d;

    public a(int i13, int i14, i0 actionMenuSubtitle, boolean z13) {
        Intrinsics.checkNotNullParameter(actionMenuSubtitle, "actionMenuSubtitle");
        this.f83536a = i13;
        this.f83537b = i14;
        this.f83538c = actionMenuSubtitle;
        this.f83539d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f83536a == aVar.f83536a && this.f83537b == aVar.f83537b && Intrinsics.d(this.f83538c, aVar.f83538c) && this.f83539d == aVar.f83539d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83539d) + ep.b.d(this.f83538c, ep.b.b(this.f83537b, Integer.hashCode(this.f83536a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WeightLossOptOutDisplayState(messageResId=");
        sb3.append(this.f83536a);
        sb3.append(", messageArgResId=");
        sb3.append(this.f83537b);
        sb3.append(", actionMenuSubtitle=");
        sb3.append(this.f83538c);
        sb3.append(", seeFewerButtonEnabled=");
        return a.a.r(sb3, this.f83539d, ")");
    }
}
