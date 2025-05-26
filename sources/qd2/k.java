package qd2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pd2.f0;
import pd2.p0;

@no2.g
/* loaded from: classes4.dex */
public final class k extends l {

    @NotNull
    public static final j Companion = new j();

    /* renamed from: d, reason: collision with root package name */
    public static final no2.b[] f103594d = {new qo2.d(qo2.z.f104669a, 0)};

    /* renamed from: c, reason: collision with root package name */
    public final List f103595c;

    public k(int i13, List list) {
        if (1 == (i13 & 1)) {
            this.f103595c = list;
        } else {
            kg.t.b1(i13, 1, i.f103593b);
            throw null;
        }
    }

    @Override // qd2.c
    public final boolean a(p0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof f0)) {
            throw new IllegalArgumentException("FloatValueOptions can't accept non-float argument".toString());
        }
        return this.f103595c.contains(Float.valueOf(((f0) value).f99839b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f103595c, ((k) obj).f103595c);
    }

    public final int hashCode() {
        return this.f103595c.hashCode();
    }

    public final String toString() {
        return d7.g.k(new StringBuilder("Options(options="), this.f103595c, ')');
    }

    public k(ArrayList options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f103595c = options;
    }
}
