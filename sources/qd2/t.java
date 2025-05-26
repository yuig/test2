package qd2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pd2.i0;
import pd2.p0;
import qo2.f0;

@no2.g
/* loaded from: classes4.dex */
public final class t extends u {

    @NotNull
    public static final s Companion = new s();

    /* renamed from: d, reason: collision with root package name */
    public static final no2.b[] f103604d = {new qo2.d(f0.f104550a, 0)};

    /* renamed from: c, reason: collision with root package name */
    public final List f103605c;

    public t(int i13, List list) {
        if (1 == (i13 & 1)) {
            this.f103605c = list;
        } else {
            kg.t.b1(i13, 1, r.f103603b);
            throw null;
        }
    }

    @Override // qd2.c
    public final boolean a(p0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof i0)) {
            throw new IllegalArgumentException("IntValueOptions can't accept non-int argument".toString());
        }
        return this.f103605c.contains(Integer.valueOf(((i0) value).f99845b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f103605c, ((t) obj).f103605c);
    }

    public final int hashCode() {
        return this.f103605c.hashCode();
    }

    public final String toString() {
        return d7.g.k(new StringBuilder("Options(options="), this.f103605c, ')');
    }

    public t(ArrayList options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f103605c = options;
    }
}
