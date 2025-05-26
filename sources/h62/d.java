package h62;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import r72.f2;
import r72.z1;

/* loaded from: classes4.dex */
public final class d extends h {

    /* renamed from: a, reason: collision with root package name */
    public final int f67826a;

    /* renamed from: b, reason: collision with root package name */
    public final z1 f67827b;

    public d(int i13, z1 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f67826a = i13;
        this.f67827b = item;
    }

    @Override // h62.h
    public final f2 a(f2 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int size = data.f106470b.size();
        int i13 = this.f67826a;
        if (i13 < 0 || i13 >= size) {
            return data;
        }
        ArrayList H0 = CollectionsKt.H0(data.f106470b);
        H0.remove(i13);
        Unit unit = Unit.f80348a;
        return f2.a(data, null, H0, null, null, null, 509);
    }

    @Override // h62.h
    public final Object b() {
        return new a(this.f67826a, this.f67827b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f67826a == dVar.f67826a && Intrinsics.d(this.f67827b, dVar.f67827b);
    }

    public final int hashCode() {
        return this.f67827b.hashCode() + (Integer.hashCode(this.f67826a) * 31);
    }

    public final String toString() {
        return "Remove(position=" + this.f67826a + ", item=" + this.f67827b + ")";
    }
}
