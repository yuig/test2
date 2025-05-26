package am2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e0 extends g1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f15548a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f15549b;

    public e0(ArrayList underlyingPropertyNamesToTypes) {
        Intrinsics.checkNotNullParameter(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f15548a = underlyingPropertyNamesToTypes;
        Map m13 = kotlin.collections.z0.m(underlyingPropertyNamesToTypes);
        if (m13.size() != underlyingPropertyNamesToTypes.size()) {
            throw new IllegalArgumentException("Some properties have the same names".toString());
        }
        this.f15549b = m13;
    }

    @Override // am2.g1
    public final boolean a(ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f15549b.containsKey(name);
    }

    @Override // am2.g1
    public final List b() {
        return this.f15548a;
    }

    public final String toString() {
        return d7.g.k(new StringBuilder("MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes="), this.f15548a, ')');
    }
}
