package je;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class m1 extends o1 implements n1, l1 {

    /* renamed from: i */
    public List f75696i = new ArrayList();

    /* renamed from: j */
    public Set f75697j = null;

    /* renamed from: k */
    public String f75698k = null;

    /* renamed from: l */
    public Set f75699l = null;

    /* renamed from: m */
    public Set f75700m = null;

    @Override // je.l1
    public final Set a() {
        return null;
    }

    @Override // je.l1
    public final String b() {
        return this.f75698k;
    }

    @Override // je.l1
    public final void d(HashSet hashSet) {
        this.f75697j = hashSet;
    }

    @Override // je.l1
    public final Set e() {
        return this.f75697j;
    }

    @Override // je.l1
    public final void f(HashSet hashSet) {
    }

    public void g(r1 r1Var) {
        this.f75696i.add(r1Var);
    }

    @Override // je.n1
    public final List getChildren() {
        return this.f75696i;
    }

    @Override // je.l1
    public final void h(HashSet hashSet) {
        this.f75700m = hashSet;
    }

    @Override // je.l1
    public final void i(String str) {
        this.f75698k = str;
    }

    @Override // je.l1
    public final void j(HashSet hashSet) {
        this.f75699l = hashSet;
    }

    @Override // je.l1
    public final Set l() {
        return this.f75699l;
    }

    @Override // je.l1
    public final Set m() {
        return this.f75700m;
    }
}
