package el2;

import java.io.Serializable;
import kotlin.collections.c0;
import kotlin.collections.e;
import kotlin.collections.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends h implements a, Serializable {

    /* renamed from: b */
    public final Enum[] f59567b;

    public b(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f59567b = entries;
    }

    private final Object writeReplace() {
        return new d(this.f59567b);
    }

    @Override // kotlin.collections.b
    public final int b() {
        return this.f59567b.length;
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) c0.J(element.ordinal(), this.f59567b)) == element;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        e eVar = h.f80373a;
        Enum[] enumArr = this.f59567b;
        int length = enumArr.length;
        eVar.getClass();
        e.b(i13, length);
        return enumArr[i13];
    }

    @Override // kotlin.collections.h, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) c0.J(ordinal, this.f59567b)) == element) {
            return ordinal;
        }
        return -1;
    }

    @Override // kotlin.collections.h, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }
}
