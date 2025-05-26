package ml0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f87435a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f87436b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f87437c;

    public a(f30 f30Var, Integer num, Integer num2) {
        this.f87435a = f30Var;
        this.f87436b = num;
        this.f87437c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f87435a, aVar.f87435a) && Intrinsics.d(this.f87436b, aVar.f87436b) && Intrinsics.d(this.f87437c, aVar.f87437c);
    }

    public final int hashCode() {
        f30 f30Var = this.f87435a;
        int hashCode = (f30Var == null ? 0 : f30Var.hashCode()) * 31;
        Integer num = this.f87436b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f87437c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardHeaderImageDisplayState(pin=");
        sb3.append(this.f87435a);
        sb3.append(", cropX=");
        sb3.append(this.f87436b);
        sb3.append(", cropY=");
        return a.c.i(sb3, this.f87437c, ")");
    }
}
