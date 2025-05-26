package am2;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y extends g1 {

    /* renamed from: a, reason: collision with root package name */
    public final ym2.g f15603a;

    /* renamed from: b, reason: collision with root package name */
    public final sn2.g f15604b;

    public y(ym2.g underlyingPropertyName, sn2.g underlyingType) {
        Intrinsics.checkNotNullParameter(underlyingPropertyName, "underlyingPropertyName");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        this.f15603a = underlyingPropertyName;
        this.f15604b = underlyingType;
    }

    @Override // am2.g1
    public final boolean a(ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.d(this.f15603a, name);
    }

    @Override // am2.g1
    public final List b() {
        return kotlin.collections.e0.b(new Pair(this.f15603a, this.f15604b));
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f15603a + ", underlyingType=" + this.f15604b + ')';
    }
}
