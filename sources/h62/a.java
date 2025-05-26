package h62;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ql2.s;
import r72.f2;
import r72.z1;

/* loaded from: classes4.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final int f67820a;

    /* renamed from: b, reason: collision with root package name */
    public final z1 f67821b;

    public a(int i13, z1 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f67820a = i13;
        this.f67821b = item;
    }

    @Override // h62.h
    public final f2 a(f2 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ArrayList H0 = CollectionsKt.H0(data.f106470b);
        H0.add(s.h(this.f67820a, new IntRange(0, H0.size(), 1)), this.f67821b);
        Unit unit = Unit.f80348a;
        return f2.a(data, null, H0, null, null, null, 509);
    }

    @Override // h62.h
    public final Object b() {
        return new d(this.f67820a, this.f67821b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f67820a == aVar.f67820a && Intrinsics.d(this.f67821b, aVar.f67821b);
    }

    public final int hashCode() {
        return this.f67821b.hashCode() + (Integer.hashCode(this.f67820a) * 31);
    }

    public final String toString() {
        return "Add(position=" + this.f67820a + ", item=" + this.f67821b + ")";
    }
}
