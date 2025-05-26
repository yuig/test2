package h62;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ql2.s;
import r72.f2;

/* loaded from: classes4.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final int f67823a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67824b;

    /* renamed from: c, reason: collision with root package name */
    public final int f67825c;

    public c(int i13, int i14, int i15) {
        this.f67823a = i13;
        this.f67824b = i14;
        this.f67825c = i15;
    }

    @Override // h62.h
    public final f2 a(f2 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int size = data.f106470b.size();
        int i13 = this.f67824b;
        if (i13 < 0 || i13 >= size) {
            return data;
        }
        List list = data.f106470b;
        int size2 = list.size();
        int i14 = this.f67825c;
        if (i14 < 0 || i14 >= size2) {
            return data;
        }
        ArrayList H0 = CollectionsKt.H0(list);
        H0.add(s.h(i14, s.q(0, H0.size())), H0.remove(i13));
        Unit unit = Unit.f80348a;
        return f2.a(data, null, H0, null, null, null, 509);
    }

    @Override // h62.h
    public final Object b() {
        int i13 = this.f67825c;
        return new c(i13, i13, this.f67823a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f67823a == cVar.f67823a && this.f67824b == cVar.f67824b && this.f67825c == cVar.f67825c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67825c) + ep.b.b(this.f67824b, Integer.hashCode(this.f67823a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Move(initialPosition=");
        sb3.append(this.f67823a);
        sb3.append(", fromPosition=");
        sb3.append(this.f67824b);
        sb3.append(", toPosition=");
        return a.a.n(sb3, this.f67825c, ")");
    }
}
