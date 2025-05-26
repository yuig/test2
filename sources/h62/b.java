package h62;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d1;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import r72.f2;

/* loaded from: classes4.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    public final List f67822a;

    public b(ArrayList commands) {
        Intrinsics.checkNotNullParameter(commands, "commands");
        this.f67822a = commands;
    }

    @Override // h62.h
    public final f2 a(f2 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        List list = this.f67822a;
        f2 a13 = f2.a(data, null, null, null, null, null, 511);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a13 = ((h) it.next()).a(a13);
        }
        return a13;
    }

    @Override // h62.h
    public final Object b() {
        List list = this.f67822a;
        Intrinsics.checkNotNullParameter(list, "<this>");
        d1 d1Var = new d1(list);
        ArrayList arrayList = new ArrayList(g0.q(d1Var, 10));
        Iterator it = d1Var.iterator();
        while (it.hasNext()) {
            arrayList.add((h) ((h) it.next()).b());
        }
        return new b(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f67822a, ((b) obj).f67822a);
    }

    public final int hashCode() {
        return this.f67822a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("BatchCommand(commands="), this.f67822a, ")");
    }
}
