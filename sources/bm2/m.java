package bm2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pn2.m1;

/* loaded from: classes2.dex */
public final class m implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i f23548a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f23549b;

    public m(i delegate, m1 fqNameFilter) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
        this.f23548a = delegate;
        this.f23549b = fqNameFilter;
    }

    @Override // bm2.i
    public final boolean Q(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (((Boolean) this.f23549b.invoke(fqName)).booleanValue()) {
            return this.f23548a.Q(fqName);
        }
        return false;
    }

    @Override // bm2.i
    public final c a(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (((Boolean) this.f23549b.invoke(fqName)).booleanValue()) {
            return this.f23548a.a(fqName);
        }
        return null;
    }

    @Override // bm2.i
    public final boolean isEmpty() {
        i iVar = this.f23548a;
        if ((iVar instanceof Collection) && ((Collection) iVar).isEmpty()) {
            return false;
        }
        Iterator it = iVar.iterator();
        while (it.hasNext()) {
            ym2.c c13 = ((c) it.next()).c();
            if (c13 != null && ((Boolean) this.f23549b.invoke(c13)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f23548a) {
            ym2.c c13 = ((c) obj).c();
            if (c13 != null && ((Boolean) this.f23549b.invoke(c13)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}
