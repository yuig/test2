package yb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements e, n, zb.a, cc.g {

    /* renamed from: a, reason: collision with root package name */
    public final xb.a f138342a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f138343b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f138344c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f138345d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f138346e;

    /* renamed from: f, reason: collision with root package name */
    public final String f138347f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f138348g;

    /* renamed from: h, reason: collision with root package name */
    public final List f138349h;

    /* renamed from: i, reason: collision with root package name */
    public final com.airbnb.lottie.v f138350i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f138351j;

    /* renamed from: k, reason: collision with root package name */
    public final zb.t f138352k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(com.airbnb.lottie.v r8, fc.c r9, ec.s r10, com.airbnb.lottie.h r11) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f58343a
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r0 = r10.f58344b
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = r1
        Lf:
            int r4 = r0.size()
            if (r2 >= r4) goto L27
            java.lang.Object r4 = r0.get(r2)
            ec.b r4 = (ec.b) r4
            yb.c r4 = r4.a(r8, r11, r9)
            if (r4 == 0) goto L24
            r5.add(r4)
        L24:
            int r2 = r2 + 1
            goto Lf
        L27:
            int r11 = r0.size()
            if (r1 >= r11) goto L3e
            java.lang.Object r11 = r0.get(r1)
            ec.b r11 = (ec.b) r11
            boolean r2 = r11 instanceof dc.e
            if (r2 == 0) goto L3b
            dc.e r11 = (dc.e) r11
        L39:
            r6 = r11
            goto L40
        L3b:
            int r1 = r1 + 1
            goto L27
        L3e:
            r11 = 0
            goto L39
        L40:
            boolean r4 = r10.f58345c
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.d.<init>(com.airbnb.lottie.v, fc.c, ec.s, com.airbnb.lottie.h):void");
    }

    @Override // zb.a
    public final void a() {
        this.f138350i.invalidateSelf();
    }

    @Override // yb.c
    public final void b(List list, List list2) {
        int size = list.size();
        List list3 = this.f138349h;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) list3.get(size2);
            cVar.b(arrayList, list3.subList(0, size2));
            arrayList.add(cVar);
        }
    }

    @Override // yb.e
    public final void c(RectF rectF, Matrix matrix, boolean z13) {
        Matrix matrix2 = this.f138344c;
        matrix2.set(matrix);
        zb.t tVar = this.f138352k;
        if (tVar != null) {
            matrix2.preConcat(tVar.e());
        }
        RectF rectF2 = this.f138346e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.f138349h;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof e) {
                ((e) cVar).c(rectF2, matrix2, z13);
                rectF.union(rectF2);
            }
        }
    }

    @Override // cc.g
    public final void d(androidx.appcompat.app.d dVar, Object obj) {
        zb.t tVar = this.f138352k;
        if (tVar != null) {
            tVar.c(dVar, obj);
        }
    }

    public final List e() {
        if (this.f138351j == null) {
            this.f138351j = new ArrayList();
            int i13 = 0;
            while (true) {
                List list = this.f138349h;
                if (i13 >= list.size()) {
                    break;
                }
                c cVar = (c) list.get(i13);
                if (cVar instanceof n) {
                    this.f138351j.add((n) cVar);
                }
                i13++;
            }
        }
        return this.f138351j;
    }

    @Override // yb.e
    public final void f(Canvas canvas, Matrix matrix, int i13) {
        if (this.f138348g) {
            return;
        }
        Matrix matrix2 = this.f138344c;
        matrix2.set(matrix);
        zb.t tVar = this.f138352k;
        if (tVar != null) {
            matrix2.preConcat(tVar.e());
            i13 = (int) (((((tVar.f141543j == null ? 100 : ((Integer) r7.g()).intValue()) / 100.0f) * i13) / 255.0f) * 255.0f);
        }
        boolean z13 = this.f138350i.f28464s && h() && i13 != 255;
        if (z13) {
            RectF rectF = this.f138343b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            c(rectF, matrix2, true);
            xb.a aVar = this.f138342a;
            aVar.setAlpha(i13);
            jc.g.f(canvas, rectF, aVar);
        }
        if (z13) {
            i13 = 255;
        }
        List list = this.f138349h;
        for (int size = list.size() - 1; size >= 0; size--) {
            Object obj = list.get(size);
            if (obj instanceof e) {
                ((e) obj).f(canvas, matrix2, i13);
            }
        }
        if (z13) {
            canvas.restore();
        }
    }

    @Override // cc.g
    public final void g(cc.f fVar, int i13, ArrayList arrayList, cc.f fVar2) {
        String str = this.f138347f;
        if (!fVar.d(i13, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            fVar2 = fVar2.a(str);
            if (fVar.b(i13, str)) {
                arrayList.add(fVar2.f(this));
            }
        }
        if (!fVar.e(i13, str)) {
            return;
        }
        int c13 = fVar.c(i13, str) + i13;
        int i14 = 0;
        while (true) {
            List list = this.f138349h;
            if (i14 >= list.size()) {
                return;
            }
            c cVar = (c) list.get(i14);
            if (cVar instanceof cc.g) {
                ((cc.g) cVar).g(fVar, c13, arrayList, fVar2);
            }
            i14++;
        }
    }

    @Override // yb.c
    public final String getName() {
        return this.f138347f;
    }

    public final boolean h() {
        int i13 = 0;
        int i14 = 0;
        while (true) {
            List list = this.f138349h;
            if (i13 >= list.size()) {
                return false;
            }
            if ((list.get(i13) instanceof e) && (i14 = i14 + 1) >= 2) {
                return true;
            }
            i13++;
        }
    }

    @Override // yb.n
    public final Path r() {
        Matrix matrix = this.f138344c;
        matrix.reset();
        zb.t tVar = this.f138352k;
        if (tVar != null) {
            matrix.set(tVar.e());
        }
        Path path = this.f138345d;
        path.reset();
        if (this.f138348g) {
            return path;
        }
        List list = this.f138349h;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof n) {
                path.addPath(((n) cVar).r(), matrix);
            }
        }
        return path;
    }

    public d(com.airbnb.lottie.v vVar, fc.c cVar, String str, boolean z13, ArrayList arrayList, dc.e eVar) {
        this.f138342a = new xb.a();
        this.f138343b = new RectF();
        this.f138344c = new Matrix();
        this.f138345d = new Path();
        this.f138346e = new RectF();
        this.f138347f = str;
        this.f138350i = vVar;
        this.f138348g = z13;
        this.f138349h = arrayList;
        if (eVar != null) {
            zb.t tVar = new zb.t(eVar);
            this.f138352k = tVar;
            tVar.a(cVar);
            tVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar2 = (c) arrayList.get(size);
            if (cVar2 instanceof j) {
                arrayList2.add((j) cVar2);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
        }
    }
}
