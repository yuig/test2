package ha2;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 implements c {

    /* renamed from: a, reason: collision with root package name */
    public final x f68409a;

    /* renamed from: b, reason: collision with root package name */
    public final List f68410b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f68411c;

    /* renamed from: d, reason: collision with root package name */
    public final List f68412d;

    public b0(x xVar, List selectionItems, Function1 actionHandler) {
        Intrinsics.checkNotNullParameter(selectionItems, "selectionItems");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.f68409a = xVar;
        this.f68410b = selectionItems;
        this.f68411c = actionHandler;
        this.f68412d = selectionItems;
    }

    @Override // ha2.c
    public final List d() {
        return this.f68412d;
    }

    @Override // ha2.c
    public final x e() {
        return this.f68409a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f68409a, b0Var.f68409a) && Intrinsics.d(this.f68410b, b0Var.f68410b) && Intrinsics.d(this.f68411c, b0Var.f68411c);
    }

    @Override // ha2.c
    public final Function1 f() {
        return this.f68411c;
    }

    public final int hashCode() {
        x xVar = this.f68409a;
        return this.f68411c.hashCode() + ep.b.c(this.f68410b, (xVar == null ? 0 : xVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "SelectionGroup(label=" + this.f68409a + ", selectionItems=" + this.f68410b + ", actionHandler=" + this.f68411c + ")";
    }
}
