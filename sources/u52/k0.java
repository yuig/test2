package u52;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f120708a;

    public k0(ArrayList templates) {
        Intrinsics.checkNotNullParameter(templates, "templates");
        this.f120708a = templates;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.d(this.f120708a, ((k0) obj).f120708a);
    }

    public final int hashCode() {
        return this.f120708a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("TemplatesLoaded(templates="), this.f120708a, ")");
    }
}
