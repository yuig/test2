package ads_mobile_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class ra extends a.nb {

    /* renamed from: a, reason: collision with root package name */
    public final int f10556a;

    /* renamed from: b, reason: collision with root package name */
    public final qa f10557b;

    public ra(int i13, qa qaVar) {
        this.f10556a = i13;
        this.f10557b = qaVar;
    }

    @Override // a.p6
    public final boolean a() {
        return this.f10557b != qa.f9997d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        return raVar.f10556a == this.f10556a && raVar.f10557b == this.f10557b;
    }

    public final int hashCode() {
        return Objects.hash(ra.class, Integer.valueOf(this.f10556a), this.f10557b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb3.append(this.f10557b);
        sb3.append(", ");
        return a.a.n(sb3, this.f10556a, "-byte key)");
    }
}
