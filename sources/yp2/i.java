package yp2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: classes4.dex */
public final class i extends e implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public Vector f139625a = new Vector();

    /* renamed from: b, reason: collision with root package name */
    public int f139626b;

    public i(d dVar) {
        for (int i13 = 0; i13 != ((Vector) dVar.f139620a).size(); i13++) {
            this.f139625a.addElement((b) ((Vector) dVar.f139620a).elementAt(i13));
        }
        this.f139626b = -1;
    }

    @Override // yp2.e
    public final boolean c(e eVar) {
        if (!(eVar instanceof i)) {
            return false;
        }
        i iVar = (i) eVar;
        if (this.f139625a.size() != iVar.f139625a.size()) {
            return false;
        }
        Enumeration elements = this.f139625a.elements();
        Enumeration elements2 = iVar.f139625a.elements();
        while (elements.hasMoreElements()) {
            b bVar = (b) elements.nextElement();
            b bVar2 = (b) elements2.nextElement();
            e b13 = bVar.b();
            e b14 = bVar2.b();
            if (b13 != b14 && !b13.equals(b14)) {
                return false;
            }
        }
        return true;
    }

    @Override // yp2.e
    public final void d(d dVar) {
        h b13 = dVar.b();
        int i13 = i();
        dVar.c(48);
        dVar.d(i13);
        Enumeration elements = this.f139625a.elements();
        while (elements.hasMoreElements()) {
            b13.e((b) elements.nextElement());
        }
    }

    @Override // yp2.e
    public final int e() {
        int i13 = i();
        return j.a(i13) + 1 + i13;
    }

    @Override // yp2.e
    public final e f() {
        i iVar = new i();
        iVar.f139625a = new Vector();
        iVar.f139626b = -1;
        iVar.f139625a = this.f139625a;
        return iVar;
    }

    public final int i() {
        if (this.f139626b < 0) {
            Enumeration elements = this.f139625a.elements();
            int i13 = 0;
            while (elements.hasMoreElements()) {
                i13 += ((b) elements.nextElement()).b().f().e();
            }
            this.f139626b = i13;
        }
        return this.f139626b;
    }

    @Override // yp2.e, yp2.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        Enumeration elements = this.f139625a.elements();
        int size = this.f139625a.size();
        while (elements.hasMoreElements()) {
            size = (size * 17) ^ ((b) elements.nextElement()).hashCode();
        }
        return size;
    }

    @Override // java.lang.Iterable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Iterator iterator() {
        b[] bVarArr = new b[this.f139625a.size()];
        for (int i13 = 0; i13 != this.f139625a.size(); i13++) {
            bVarArr[i13] = (b) this.f139625a.elementAt(i13);
        }
        return new ri2.h(bVarArr, 2);
    }

    public final String toString() {
        return this.f139625a.toString();
    }
}
