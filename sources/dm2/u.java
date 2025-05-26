package dm2;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class u extends in2.o {

    /* renamed from: b, reason: collision with root package name */
    public final on2.n f55529b;

    /* renamed from: c, reason: collision with root package name */
    public final on2.n f55530c;

    /* renamed from: d, reason: collision with root package name */
    public final on2.l f55531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f55532e;

    public u(v vVar, on2.u uVar) {
        int i13 = 0;
        if (uVar == null) {
            h(0);
            throw null;
        }
        this.f55532e = vVar;
        on2.q qVar = (on2.q) uVar;
        this.f55529b = qVar.d(new r(this, vVar, i13));
        this.f55530c = qVar.d(new r(this, vVar, 1));
        this.f55531d = new on2.l(qVar, new s(i13, this, vVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void h(int r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dm2.u.h(int):void");
    }

    @Override // in2.o, in2.n
    public final Collection a(ym2.g gVar, hm2.e eVar) {
        if (gVar == null) {
            h(5);
            throw null;
        }
        if (eVar == null) {
            h(6);
            throw null;
        }
        Collection collection = (Collection) this.f55529b.invoke(gVar);
        if (collection != null) {
            return collection;
        }
        h(7);
        throw null;
    }

    @Override // in2.o, in2.n
    public final Set b() {
        Set set = (Set) this.f55532e.f55535j.invoke();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // in2.o, in2.n
    public final Set c() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        h(18);
        throw null;
    }

    @Override // in2.o, in2.n
    public final Collection d(ym2.g gVar, hm2.e eVar) {
        if (gVar == null) {
            h(1);
            throw null;
        }
        if (eVar == null) {
            h(2);
            throw null;
        }
        Collection collection = (Collection) this.f55530c.invoke(gVar);
        if (collection != null) {
            return collection;
        }
        h(3);
        throw null;
    }

    @Override // in2.o, in2.n
    public final Set f() {
        Set set = (Set) this.f55532e.f55535j.invoke();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    @Override // in2.o, in2.p
    public final Collection g(in2.g gVar, Function1 function1) {
        if (gVar == null) {
            h(13);
            throw null;
        }
        if (function1 == null) {
            h(14);
            throw null;
        }
        Collection collection = (Collection) this.f55531d.invoke();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    public final in2.n i() {
        in2.n w13 = ((pn2.b0) ((pn2.l) this.f55532e.e()).c().iterator().next()).w();
        if (w13 != null) {
            return w13;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(Collection collection, ym2.g gVar) {
        if (gVar == null) {
            h(10);
            throw null;
        }
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        bn2.o.f23590d.i(gVar, collection, Collections.emptySet(), this.f55532e, new t(this, linkedHashSet));
        return linkedHashSet;
    }
}
