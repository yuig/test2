package i2;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class q extends w {

    /* renamed from: a, reason: collision with root package name */
    public final int f71239a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f71240b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f71241c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f71242d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f71243e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f71244f = bs1.c.u1(q2.l.f102116g, p2.f71234a);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f71245g;

    public q(s sVar, int i13, boolean z13, boolean z14, en.b bVar) {
        this.f71245g = sVar;
        this.f71239a = i13;
        this.f71240b = z13;
        this.f71241c = z14;
    }

    @Override // i2.w
    public final void a(i0 i0Var, q2.h hVar) {
        this.f71245g.f71266b.a(i0Var, hVar);
    }

    @Override // i2.w
    public final void b() {
        s sVar = this.f71245g;
        sVar.f71290z--;
    }

    @Override // i2.w
    public final boolean c() {
        return this.f71245g.f71266b.c();
    }

    @Override // i2.w
    public final boolean d() {
        return this.f71240b;
    }

    @Override // i2.w
    public final boolean e() {
        return this.f71241c;
    }

    @Override // i2.w
    public final z1 f() {
        return (z1) this.f71244f.getValue();
    }

    @Override // i2.w
    public final int g() {
        return this.f71239a;
    }

    @Override // i2.w
    public final CoroutineContext h() {
        return this.f71245g.f71266b.h();
    }

    @Override // i2.w
    public final void i(i0 i0Var) {
        s sVar = this.f71245g;
        sVar.f71266b.i(sVar.f71271g);
        sVar.f71266b.i(i0Var);
    }

    @Override // i2.w
    public final j1 j(k1 k1Var) {
        return this.f71245g.f71266b.j(k1Var);
    }

    @Override // i2.w
    public final void k(Set set) {
        HashSet hashSet = this.f71242d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f71242d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // i2.w
    public final void l(s sVar) {
        this.f71243e.add(sVar);
    }

    @Override // i2.w
    public final void m(i0 i0Var) {
        this.f71245g.f71266b.m(i0Var);
    }

    @Override // i2.w
    public final void n() {
        this.f71245g.f71290z++;
    }

    @Override // i2.w
    public final void o(s sVar) {
        HashSet hashSet = this.f71242d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(sVar.f71267c);
            }
        }
        dl2.b.s(this.f71243e).remove(sVar);
    }

    @Override // i2.w
    public final void p(i0 i0Var) {
        this.f71245g.f71266b.p(i0Var);
    }

    public final void q() {
        LinkedHashSet<s> linkedHashSet = this.f71243e;
        if (!linkedHashSet.isEmpty()) {
            HashSet hashSet = this.f71242d;
            if (hashSet != null) {
                for (s sVar : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(sVar.f71267c);
                    }
                }
            }
            linkedHashSet.clear();
        }
    }
}
