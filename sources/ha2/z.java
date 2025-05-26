package ha2;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z implements c {

    /* renamed from: a, reason: collision with root package name */
    public final x f68485a;

    /* renamed from: b, reason: collision with root package name */
    public final List f68486b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f68487c;

    /* renamed from: d, reason: collision with root package name */
    public final List f68488d;

    public z(x xVar, List optionItems, Function1 actionHandler) {
        Intrinsics.checkNotNullParameter(optionItems, "optionItems");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.f68485a = xVar;
        this.f68486b = optionItems;
        this.f68487c = actionHandler;
        this.f68488d = optionItems;
    }

    @Override // ha2.c
    public final List d() {
        return this.f68488d;
    }

    @Override // ha2.c
    public final x e() {
        return this.f68485a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f68485a, zVar.f68485a) && Intrinsics.d(this.f68486b, zVar.f68486b) && Intrinsics.d(this.f68487c, zVar.f68487c);
    }

    @Override // ha2.c
    public final Function1 f() {
        return this.f68487c;
    }

    public final int hashCode() {
        x xVar = this.f68485a;
        return this.f68487c.hashCode() + ep.b.c(this.f68486b, (xVar == null ? 0 : xVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "OptionGroup(label=" + this.f68485a + ", optionItems=" + this.f68486b + ", actionHandler=" + this.f68487c + ")";
    }
}
