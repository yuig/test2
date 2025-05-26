package bm2;

import am2.l0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import yn2.c0;

/* loaded from: classes2.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23541a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23542b;

    public j(List delegates, int i13) {
        this.f23541a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(delegates, "annotations");
            this.f23542b = delegates;
        } else {
            Intrinsics.checkNotNullParameter(delegates, "delegates");
            this.f23542b = delegates;
        }
    }

    @Override // bm2.i
    public final boolean Q(ym2.c fqName) {
        switch (this.f23541a) {
            case 1:
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                Iterator it = CollectionsKt.K((List) this.f23542b).iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).Q(fqName)) {
                        break;
                    }
                }
                break;
        }
        return kotlin.jvm.internal.j.s(this, fqName);
    }

    @Override // bm2.i
    public final c a(ym2.c fqName) {
        int i13 = this.f23541a;
        Object obj = this.f23542b;
        switch (i13) {
            case 0:
                return kotlin.jvm.internal.j.l(this, fqName);
            case 1:
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                return (c) c0.l(c0.q(CollectionsKt.K((List) obj), new l0(fqName, 1)));
            default:
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                if (Intrinsics.d(fqName, (ym2.c) obj)) {
                    return qm2.b.f104412a;
                }
                return null;
        }
    }

    @Override // bm2.i
    public final boolean isEmpty() {
        int i13 = this.f23541a;
        Object obj = this.f23542b;
        switch (i13) {
            case 0:
                return ((List) obj).isEmpty();
            case 1:
                List list = (List) obj;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((i) it.next()).isEmpty()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i13 = this.f23541a;
        Object obj = this.f23542b;
        switch (i13) {
            case 0:
                return ((List) obj).iterator();
            case 1:
                return new yn2.j(c0.m(CollectionsKt.K((List) obj), l.f23547i));
            default:
                q0.f80391a.getClass();
                return p0.f80390a;
        }
    }

    public final String toString() {
        switch (this.f23541a) {
            case 0:
                return ((List) this.f23542b).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(i[] delegates) {
        this(kotlin.collections.c0.b0(delegates), 1);
        this.f23541a = 1;
        Intrinsics.checkNotNullParameter(delegates, "delegates");
    }

    public j(ym2.c fqNameToMatch) {
        this.f23541a = 2;
        Intrinsics.checkNotNullParameter(fqNameToMatch, "fqNameToMatch");
        this.f23542b = fqNameToMatch;
    }
}
