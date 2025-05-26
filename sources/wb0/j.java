package wb0;

import a.cb;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f129000a;

    /* renamed from: b, reason: collision with root package name */
    public final String f129001b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f129002c;

    public j(int i13, String labelText, Function0 tapAction) {
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Intrinsics.checkNotNullParameter(tapAction, "tapAction");
        this.f129000a = i13;
        this.f129001b = labelText;
        this.f129002c = tapAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f129000a == jVar.f129000a && Intrinsics.d(this.f129001b, jVar.f129001b) && Intrinsics.d(this.f129002c, jVar.f129002c);
    }

    public final int hashCode() {
        return this.f129002c.hashCode() + cb.d(this.f129001b, Integer.hashCode(this.f129000a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActionButtonViewModel(iconResId=");
        sb3.append(this.f129000a);
        sb3.append(", labelText=");
        sb3.append(this.f129001b);
        sb3.append(", tapAction=");
        return pk2.f.i(sb3, this.f129002c, ")");
    }
}
