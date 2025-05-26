package h62;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import ql2.s;
import r72.f2;
import r72.z1;

/* loaded from: classes4.dex */
public final class f extends h {

    /* renamed from: a, reason: collision with root package name */
    public final int f67831a;

    /* renamed from: b, reason: collision with root package name */
    public final z1 f67832b;

    /* renamed from: c, reason: collision with root package name */
    public final z1 f67833c;

    public f(int i13, z1 oldItem, z1 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        this.f67831a = i13;
        this.f67832b = oldItem;
        this.f67833c = newItem;
    }

    @Override // h62.h
    public final f2 a(f2 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int size = data.f106470b.size();
        int i13 = this.f67831a;
        if (i13 < 0 || i13 >= size) {
            return data;
        }
        ArrayList H0 = CollectionsKt.H0(data.f106470b);
        H0.set(s.h(i13, f0.h(H0)), this.f67833c);
        Unit unit = Unit.f80348a;
        return f2.a(data, null, H0, null, null, null, 509);
    }

    @Override // h62.h
    public final Object b() {
        return new f(this.f67831a, this.f67833c, this.f67832b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f67831a == fVar.f67831a && Intrinsics.d(this.f67832b, fVar.f67832b) && Intrinsics.d(this.f67833c, fVar.f67833c);
    }

    public final int hashCode() {
        return this.f67833c.hashCode() + ((this.f67832b.hashCode() + (Integer.hashCode(this.f67831a) * 31)) * 31);
    }

    public final String toString() {
        return "Update(position=" + this.f67831a + ", oldItem=" + this.f67832b + ", newItem=" + this.f67833c + ")";
    }
}
