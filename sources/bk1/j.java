package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements n {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23239a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23240b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f23241c;

    /* renamed from: d, reason: collision with root package name */
    public final g2 f23242d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23243e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23244f;

    public j(f30 pin, boolean z13, Integer num, g2 source) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f23239a = pin;
        this.f23240b = z13;
        this.f23241c = num;
        this.f23242d = source;
        this.f23243e = false;
        this.f23244f = false;
    }

    public final Integer a() {
        return this.f23241c;
    }

    public final f30 b() {
        return this.f23239a;
    }

    public final boolean c() {
        return this.f23240b;
    }

    public final g2 d() {
        return this.f23242d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f23239a, jVar.f23239a) && this.f23240b == jVar.f23240b && Intrinsics.d(this.f23241c, jVar.f23241c) && this.f23242d == jVar.f23242d && this.f23243e == jVar.f23243e && this.f23244f == jVar.f23244f;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f23240b, this.f23239a.hashCode() * 31, 31);
        Integer num = this.f23241c;
        return Boolean.hashCode(this.f23244f) + ep.b.e(this.f23243e, (this.f23242d.hashCode() + ((e13 + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NavigateToCloseupDirectly(pin=");
        sb3.append(this.f23239a);
        sb3.append(", shouldLog=");
        sb3.append(this.f23240b);
        sb3.append(", collectionSelectedPosition=");
        sb3.append(this.f23241c);
        sb3.append(", source=");
        sb3.append(this.f23242d);
        sb3.append(", shouldLogPrice=");
        sb3.append(this.f23243e);
        sb3.append(", shouldLogRating=");
        return a.a.r(sb3, this.f23244f, ")");
    }
}
