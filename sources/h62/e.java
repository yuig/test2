package h62;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import r72.f2;
import r72.z1;

/* loaded from: classes4.dex */
public final class e extends h {

    /* renamed from: a, reason: collision with root package name */
    public final int f67828a;

    /* renamed from: b, reason: collision with root package name */
    public final z1 f67829b;

    /* renamed from: c, reason: collision with root package name */
    public final z1 f67830c;

    public e(int i13, z1 oldItem, z1 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        this.f67828a = i13;
        this.f67829b = oldItem;
        this.f67830c = newItem;
    }

    @Override // h62.h
    public final f2 a(f2 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int size = data.f106470b.size();
        int i13 = this.f67828a;
        if (i13 < 0 || i13 >= size) {
            return data;
        }
        ArrayList H0 = CollectionsKt.H0(data.f106470b);
        H0.set(i13, this.f67830c);
        Unit unit = Unit.f80348a;
        return f2.a(data, null, H0, null, null, null, 509);
    }

    @Override // h62.h
    public final Object b() {
        return new e(this.f67828a, this.f67830c, this.f67829b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f67828a == eVar.f67828a && Intrinsics.d(this.f67829b, eVar.f67829b) && Intrinsics.d(this.f67830c, eVar.f67830c);
    }

    public final int hashCode() {
        return this.f67830c.hashCode() + ((this.f67829b.hashCode() + (Integer.hashCode(this.f67828a) * 31)) * 31);
    }

    public final String toString() {
        return "Replace(position=" + this.f67828a + ", oldItem=" + this.f67829b + ", newItem=" + this.f67830c + ")";
    }
}
