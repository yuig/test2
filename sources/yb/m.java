package yb;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class m implements n, j {

    /* renamed from: a, reason: collision with root package name */
    public final Path f138405a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f138406b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f138407c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f138408d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ec.l f138409e;

    public m(ec.l lVar) {
        lVar.getClass();
        this.f138409e = lVar;
    }

    public final void a(Path.Op op3) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.f138406b;
        path.reset();
        Path path2 = this.f138405a;
        path2.reset();
        ArrayList arrayList = this.f138408d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar instanceof d) {
                d dVar = (d) nVar;
                ArrayList arrayList2 = (ArrayList) dVar.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path r13 = ((n) arrayList2.get(size2)).r();
                    zb.t tVar = dVar.f138352k;
                    if (tVar != null) {
                        matrix2 = tVar.e();
                    } else {
                        matrix2 = dVar.f138344c;
                        matrix2.reset();
                    }
                    r13.transform(matrix2);
                    path.addPath(r13);
                }
            } else {
                path.addPath(nVar.r());
            }
        }
        int i13 = 0;
        n nVar2 = (n) arrayList.get(0);
        if (nVar2 instanceof d) {
            d dVar2 = (d) nVar2;
            List e13 = dVar2.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) e13;
                if (i13 >= arrayList3.size()) {
                    break;
                }
                Path r14 = ((n) arrayList3.get(i13)).r();
                zb.t tVar2 = dVar2.f138352k;
                if (tVar2 != null) {
                    matrix = tVar2.e();
                } else {
                    matrix = dVar2.f138344c;
                    matrix.reset();
                }
                r14.transform(matrix);
                path2.addPath(r14);
                i13++;
            }
        } else {
            path2.set(nVar2.r());
        }
        this.f138407c.op(path2, path, op3);
    }

    @Override // yb.c
    public final void b(List list, List list2) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f138408d;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i13)).b(list, list2);
            i13++;
        }
    }

    @Override // yb.j
    public final void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof n) {
                this.f138408d.add((n) cVar);
                listIterator.remove();
            }
        }
    }

    @Override // yb.n
    public final Path r() {
        Path path = this.f138407c;
        path.reset();
        ec.l lVar = this.f138409e;
        if (lVar.f58315b) {
            return path;
        }
        int i13 = l.f138404a[lVar.f58314a.ordinal()];
        if (i13 == 1) {
            int i14 = 0;
            while (true) {
                ArrayList arrayList = this.f138408d;
                if (i14 >= arrayList.size()) {
                    break;
                }
                path.addPath(((n) arrayList.get(i14)).r());
                i14++;
            }
        } else if (i13 == 2) {
            a(Path.Op.UNION);
        } else if (i13 == 3) {
            a(Path.Op.REVERSE_DIFFERENCE);
        } else if (i13 == 4) {
            a(Path.Op.INTERSECT);
        } else if (i13 == 5) {
            a(Path.Op.XOR);
        }
        return path;
    }
}
