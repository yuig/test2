package s21;

import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f110715a;

    /* renamed from: b, reason: collision with root package name */
    public final wy0 f110716b;

    /* renamed from: c, reason: collision with root package name */
    public final List f110717c;

    public a(String id3, wy0 user, ArrayList pins) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f110715a = id3;
        this.f110716b = user;
        this.f110717c = pins;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f110715a, aVar.f110715a) && Intrinsics.d(this.f110716b, aVar.f110716b) && Intrinsics.d(this.f110717c, aVar.f110717c);
    }

    public final int hashCode() {
        return this.f110717c.hashCode() + ((this.f110716b.hashCode() + (this.f110715a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinnerAuthorityModel(id=");
        sb3.append(this.f110715a);
        sb3.append(", user=");
        sb3.append(this.f110716b);
        sb3.append(", pins=");
        return a.c.j(sb3, this.f110717c, ")");
    }
}
