package ga0;

import kotlin.jvm.internal.Intrinsics;
import ra0.k;
import ra0.l;
import u50.f0;
import u50.o;

/* loaded from: classes5.dex */
public final class i implements o {

    /* renamed from: a, reason: collision with root package name */
    public final l f64610a;

    /* renamed from: b, reason: collision with root package name */
    public final ia0.b f64611b;

    public i(l source, ia0.b attribution) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        this.f64610a = source;
        this.f64611b = attribution;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f64610a, iVar.f64610a) && Intrinsics.d(this.f64611b, iVar.f64611b);
    }

    public final int hashCode() {
        return this.f64611b.hashCode() + (this.f64610a.hashCode() * 31);
    }

    public final String toString() {
        return "TemplateCollageState(source=" + this.f64610a + ", attribution=" + this.f64611b + ")";
    }

    public i() {
        this(k.f106951a, new ia0.b(g.f64609a, (f0) null, 6));
    }
}
