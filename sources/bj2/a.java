package bj2;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f22969c = new a(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, Integer.MAX_VALUE);

    /* renamed from: a, reason: collision with root package name */
    public final int f22970a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22971b;

    public a(int i13, int i14) {
        this.f22970a = i13;
        this.f22971b = i14;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f22970a == aVar.f22970a && this.f22971b == aVar.f22971b;
    }

    public final int hashCode() {
        return ((this.f22970a ^ 1000003) * 1000003) ^ this.f22971b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogLimits{maxNumberOfAttributes=");
        sb3.append(this.f22970a);
        sb3.append(", maxAttributeValueLength=");
        return a.a.n(sb3, this.f22971b, "}");
    }
}
