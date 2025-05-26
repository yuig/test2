package ha2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y implements c {

    /* renamed from: a, reason: collision with root package name */
    public final List f68482a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f68483b;

    /* renamed from: c, reason: collision with root package name */
    public final List f68484c;

    public y(ArrayList selectionItems, cl0.b actionHandler) {
        Intrinsics.checkNotNullParameter(selectionItems, "selectionItems");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.f68482a = selectionItems;
        this.f68483b = actionHandler;
        this.f68484c = selectionItems;
    }

    @Override // ha2.c
    public final List d() {
        return this.f68484c;
    }

    @Override // ha2.c
    public final x e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        yVar.getClass();
        return Intrinsics.d(null, null) && Intrinsics.d(this.f68482a, yVar.f68482a) && Intrinsics.d(this.f68483b, yVar.f68483b);
    }

    @Override // ha2.c
    public final Function1 f() {
        return this.f68483b;
    }

    public final int hashCode() {
        return this.f68483b.hashCode() + (this.f68482a.hashCode() * 31);
    }

    public final String toString() {
        return "MultiSelectionGroup(label=null, selectionItems=" + this.f68482a + ", actionHandler=" + this.f68483b + ")";
    }
}
