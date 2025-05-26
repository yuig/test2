package u4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kh2.g3;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public int f120185b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f120186c;

    /* renamed from: d, reason: collision with root package name */
    public final h f120187d;

    /* renamed from: e, reason: collision with root package name */
    public final d f120188e;

    /* renamed from: f, reason: collision with root package name */
    public e f120189f;

    /* renamed from: i, reason: collision with root package name */
    public s4.j f120192i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f120184a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f120190g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f120191h = Integer.MIN_VALUE;

    public e(h hVar, d dVar) {
        this.f120187d = hVar;
        this.f120188e = dVar;
    }

    public final void a(e eVar, int i13) {
        b(eVar, i13, Integer.MIN_VALUE, false);
    }

    public final boolean b(e eVar, int i13, int i14, boolean z13) {
        if (eVar == null) {
            l();
            return true;
        }
        if (!z13 && !k(eVar)) {
            return false;
        }
        this.f120189f = eVar;
        if (eVar.f120184a == null) {
            eVar.f120184a = new HashSet();
        }
        HashSet hashSet = this.f120189f.f120184a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f120190g = i13;
        this.f120191h = i14;
        return true;
    }

    public final void c(int i13, v4.r rVar, ArrayList arrayList) {
        HashSet hashSet = this.f120184a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                g3.W(((e) it.next()).f120187d, i13, arrayList, rVar);
            }
        }
    }

    public final int d() {
        if (this.f120186c) {
            return this.f120185b;
        }
        return 0;
    }

    public final int e() {
        e eVar;
        if (this.f120187d.f120213i0 == 8) {
            return 0;
        }
        int i13 = this.f120191h;
        return (i13 == Integer.MIN_VALUE || (eVar = this.f120189f) == null || eVar.f120187d.f120213i0 != 8) ? this.f120190g : i13;
    }

    public final e f() {
        int[] iArr = c.f120183a;
        d dVar = this.f120188e;
        int i13 = iArr[dVar.ordinal()];
        h hVar = this.f120187d;
        switch (i13) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return hVar.L;
            case 3:
                return hVar.f120195J;
            case 4:
                return hVar.M;
            case 5:
                return hVar.K;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    public final h g() {
        return this.f120187d;
    }

    public final d h() {
        return this.f120188e;
    }

    public final boolean i() {
        HashSet hashSet = this.f120184a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((e) it.next()).f().j()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        return this.f120189f != null;
    }

    public final boolean k(e eVar) {
        if (eVar == null) {
            return false;
        }
        d dVar = this.f120188e;
        h hVar = eVar.f120187d;
        d dVar2 = eVar.f120188e;
        if (dVar2 == dVar) {
            return dVar != d.BASELINE || (hVar.E && this.f120187d.E);
        }
        switch (c.f120183a[dVar.ordinal()]) {
            case 1:
                return (dVar2 == d.BASELINE || dVar2 == d.CENTER_X || dVar2 == d.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z13 = dVar2 == d.LEFT || dVar2 == d.RIGHT;
                if (hVar instanceof m) {
                    return z13 || dVar2 == d.CENTER_X;
                }
                return z13;
            case 4:
            case 5:
                boolean z14 = dVar2 == d.TOP || dVar2 == d.BOTTOM;
                if (hVar instanceof m) {
                    return z14 || dVar2 == d.CENTER_Y;
                }
                return z14;
            case 6:
                return (dVar2 == d.LEFT || dVar2 == d.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    public final void l() {
        HashSet hashSet;
        e eVar = this.f120189f;
        if (eVar != null && (hashSet = eVar.f120184a) != null) {
            hashSet.remove(this);
            if (this.f120189f.f120184a.size() == 0) {
                this.f120189f.f120184a = null;
            }
        }
        this.f120184a = null;
        this.f120189f = null;
        this.f120190g = 0;
        this.f120191h = Integer.MIN_VALUE;
        this.f120186c = false;
        this.f120185b = 0;
    }

    public final void m() {
        s4.j jVar = this.f120192i;
        if (jVar == null) {
            this.f120192i = new s4.j(s4.i.UNRESTRICTED);
        } else {
            jVar.c();
        }
    }

    public final void n(int i13) {
        this.f120185b = i13;
        this.f120186c = true;
    }

    public final String toString() {
        return this.f120187d.f120217k0 + ":" + this.f120188e.toString();
    }
}
