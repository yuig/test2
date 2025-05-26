package r81;

import a.cb;
import android.content.Context;
import android.os.Looper;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.a0;
import com.pinterest.framework.multisection.datasource.pagedlist.c0;
import com.pinterest.framework.multisection.datasource.pagedlist.d0;
import com.pinterest.framework.multisection.datasource.pagedlist.e0;
import com.pinterest.framework.multisection.datasource.pagedlist.y;
import com.pinterest.framework.multisection.datasource.pagedlist.z;
import dl1.s;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jk2.a1;
import jk2.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.g1;
import kotlin.collections.q0;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;
import uj2.q;
import wt1.f0;
import wt1.v;

/* loaded from: classes5.dex */
public final class k implements wk1.e, nr0.j {

    /* renamed from: a, reason: collision with root package name */
    public final p f106776a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f106777b;

    /* renamed from: c, reason: collision with root package name */
    public int f106778c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f106779d;

    /* renamed from: e, reason: collision with root package name */
    public List f106780e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f106781f;

    /* renamed from: g, reason: collision with root package name */
    public n f106782g;

    /* renamed from: h, reason: collision with root package name */
    public final xj2.b f106783h;

    /* renamed from: i, reason: collision with root package name */
    public final uk2.f f106784i;

    /* renamed from: j, reason: collision with root package name */
    public String f106785j;

    public k(uk1.d presenterPinalytics, q networkStateStream, p localPhotoService, s81.c lensGalleryPhotoViewPresenterListener) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(localPhotoService, "localPhotoService");
        Intrinsics.checkNotNullParameter(lensGalleryPhotoViewPresenterListener, "lensGalleryPhotoViewPresenterListener");
        this.f106776a = localPhotoService;
        this.f106779d = new f0(this);
        this.f106780e = q0.f80391a;
        this.f106781f = new ArrayDeque();
        this.f106782g = c.f106757b;
        this.f106783h = new xj2.b();
        this.f106784i = cb.r("create(...)");
        this.f106785j = "";
        o(RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO, new v81.a(presenterPinalytics, networkStateStream, lensGalleryPhotoViewPresenterListener));
    }

    @Override // sq0.e0
    public final q K1() {
        d51.a aVar = new d51.a(18, g.f106763k);
        uk2.f fVar = this.f106784i;
        fVar.getClass();
        q t13 = new x(fVar, aVar, 2).t(new d51.a(27, g.f106764l));
        Intrinsics.checkNotNullExpressionValue(t13, "flatMap(...)");
        return t13;
    }

    @Override // yq0.a0
    public final yk1.m S(int i13) {
        return this.f106779d.S(i13);
    }

    @Override // vq0.f
    public final Set X1() {
        return this.f106779d.f131112c;
    }

    @Override // sq0.e0
    public final int a() {
        return this.f106780e.size();
    }

    @Override // vq0.f
    public final void clear() {
        this.f106784i.c(new v());
        this.f106782g = c.f106757b;
        this.f106783h.d();
        q0 itemsToSet = q0.f80391a;
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        r(new d0(itemsToSet, true));
        this.f106778c = 0;
    }

    @Override // vq0.e, qr0.d
    public final List d() {
        return CollectionsKt.F0(this.f106780e);
    }

    @Override // nr0.g
    public final boolean e(int i13) {
        return true;
    }

    @Override // nr0.g
    public final boolean f3(int i13) {
        return true;
    }

    public final void g(List list, Set set, Function1 function1) {
        b0 cVar = new kk2.c(new b(this.f106780e, list, set, 0), 0);
        Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            cVar = cVar.l(wj2.c.a());
        }
        xj2.c o13 = cVar.o(new a81.a(15, new rx0.f(this, list, function1, 18)), new a81.a(16, new f(this, 0)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        this.f106783h.a(o13);
    }

    @Override // vq0.e, nr0.a
    public final Object getItem(int i13) {
        return (s) CollectionsKt.U(i13, this.f106780e);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO;
    }

    @Override // nr0.g
    public final boolean h(int i13) {
        return true;
    }

    @Override // wt1.b
    public final boolean i() {
        return this.f106777b;
    }

    @Override // vq0.f
    public final void i2() {
        this.f106782g = e.f106759b;
        n();
    }

    @Override // vq0.f
    public final void j1() {
        if (t0()) {
            n();
        }
    }

    public final void k() {
        ArrayDeque arrayDeque = this.f106781f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        Object first = arrayDeque.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "getFirst(...)");
        com.pinterest.framework.multisection.datasource.pagedlist.f0 f0Var = (com.pinterest.framework.multisection.datasource.pagedlist.f0) first;
        if (f0Var instanceof e0) {
            int size = this.f106780e.size();
            e0 e0Var = (e0) f0Var;
            int i13 = e0Var.f49096b;
            if (i13 < 0 || i13 >= size) {
                arrayDeque.removeFirst();
                return;
            }
            ArrayList H0 = CollectionsKt.H0(this.f106780e);
            s sVar = e0Var.f49097c;
            int i14 = e0Var.f49096b;
            H0.set(i14, sVar);
            g(H0, e0Var.f49098d ? g1.b(Integer.valueOf(i14)) : s0.f80394a, new h(f0Var, 0));
            return;
        }
        if (f0Var instanceof d0) {
            List F0 = CollectionsKt.F0(((d0) f0Var).f49094b);
            g(F0, s0.f80394a, new w1.g(F0, 17));
            return;
        }
        if (f0Var instanceof a0) {
            ArrayList H02 = CollectionsKt.H0(this.f106780e);
            a0 a0Var = (a0) f0Var;
            s sVar2 = (s) H02.remove(a0Var.f49082b);
            H02.add(a0Var.f49083c, sVar2);
            g(H02, s0.f80394a, new i(sVar2, f0Var, 0));
            return;
        }
        if (f0Var instanceof y) {
            int size2 = this.f106780e.size();
            ArrayList H03 = CollectionsKt.H0(this.f106780e);
            List<s> list = ((y) f0Var).f49200b;
            ArrayList arrayList = new ArrayList(g0.q(list, 10));
            for (s sVar3 : list) {
                Intrinsics.g(sVar3, "null cannot be cast to non-null type com.pinterest.framework.repository.Model");
                arrayList.add(sVar3);
            }
            H03.addAll(size2, arrayList);
            g(H03, s0.f80394a, new j(f0Var, size2, 0));
            return;
        }
        if (!(f0Var instanceof z)) {
            if (f0Var instanceof com.pinterest.framework.multisection.datasource.pagedlist.b0) {
                ArrayList H04 = CollectionsKt.H0(this.f106780e);
                com.pinterest.framework.multisection.datasource.pagedlist.b0 b0Var = (com.pinterest.framework.multisection.datasource.pagedlist.b0) f0Var;
                H04.subList(b0Var.f49086b, b0Var.f49087c).clear();
                g(H04, s0.f80394a, new h(f0Var, 2));
                return;
            }
            if (f0Var instanceof c0) {
                List list2 = this.f106780e;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    if (!Intrinsics.d(((c0) f0Var).f49089b, ((s) obj).getUid())) {
                        arrayList2.add(obj);
                    }
                }
                g(arrayList2, s0.f80394a, new w1.g(arrayList2, 18));
                return;
            }
            return;
        }
        int size3 = this.f106780e.size();
        z zVar = (z) f0Var;
        int i15 = zVar.f49202c;
        vb0.j.f125466a.S(i15 >= 0 && i15 <= size3, "Insert index is out of range", new Object[0]);
        int size4 = this.f106780e.size();
        int i16 = zVar.f49202c;
        if (i16 < 0 || i16 > size4) {
            arrayDeque.removeFirst();
            return;
        }
        ArrayList H05 = CollectionsKt.H0(this.f106780e);
        List<s> list3 = zVar.f49201b;
        ArrayList arrayList3 = new ArrayList(g0.q(list3, 10));
        for (s sVar4 : list3) {
            Intrinsics.g(sVar4, "null cannot be cast to non-null type com.pinterest.framework.repository.Model");
            arrayList3.add(sVar4);
        }
        H05.addAll(i16, arrayList3);
        g(H05, s0.f80394a, new h(f0Var, 1));
    }

    @Override // nr0.g
    public final boolean k2(int i13) {
        return true;
    }

    @Override // wt1.d0
    public final q m() {
        uk2.f fVar = this.f106784i;
        fVar.getClass();
        a1 a1Var = new a1(fVar);
        Intrinsics.checkNotNullExpressionValue(a1Var, "hide(...)");
        return a1Var;
    }

    @Override // wt1.b
    public final void n() {
        final String directory;
        if (this.f106777b && (directory = this.f106785j) != null) {
            final int i13 = this.f106778c;
            this.f106778c = i13 + 1;
            p pVar = this.f106776a;
            pVar.getClass();
            Intrinsics.checkNotNullParameter(directory, "photoPath");
            final nx.d0 pinalytics = sh.f.a();
            Intrinsics.f(pinalytics);
            final sw0.y yVar = pVar.f106790c;
            yVar.getClass();
            final Context context = pVar.f106788a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(directory, "directory");
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            final yk1.v resources = pVar.f106789b;
            Intrinsics.checkNotNullParameter(resources, "resources");
            yVar.f(context);
            vb0.j.f125466a.R(true, "addVideosToMediaCache must be true when includeVideos is true", tb0.p.MEDIA_GALLERY, new Object[0]);
            ol1.d dVar = new ol1.d(new uj2.s() { // from class: sw0.r

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f115555d = false;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f115557f = 50;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f115559h = true;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ boolean f115561j = false;

                /* JADX WARN: Removed duplicated region for block: B:26:0x00df A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[SYNTHETIC] */
                @Override // uj2.s
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void o(fk2.f r12) {
                    /*
                        Method dump skipped, instructions count: 248
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: sw0.r.o(fk2.f):void");
                }
            }, 2);
            Intrinsics.checkNotNullExpressionValue(dVar, "create(...)");
            xj2.c F = dVar.H(tk2.e.f118016b).A(wj2.c.a()).F(new a81.a(17, new f(this, 1)), new a81.a(18, g.f106762j), ck2.i.f27923c, ck2.i.f27924d);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            this.f106783h.a(F);
        }
    }

    @Override // vq0.e
    public final void n3(int i13, int i14) {
        boolean z13 = i13 >= 0 && i13 < this.f106780e.size();
        m60.f0 f0Var = vb0.j.f125466a;
        f0Var.S(z13, a.a.e("fromPosition:", i13, " is out of range"), new Object[0]);
        f0Var.S(i14 >= 0 && i14 < this.f106780e.size(), a.a.e("toPosition:", i14, " is out of range"), new Object[0]);
        r(new a0(i13, i14));
    }

    @Override // vq0.f
    public final void o(int i13, vq0.h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        this.f106779d.o(i13, viewBinderInstance);
    }

    @Override // wk1.e
    public final void onUnbind() {
        this.f106781f.clear();
        this.f106783h.d();
    }

    @Override // yq0.a0
    public final void p(int i13, yk1.n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f106779d.p(i13, view);
    }

    public final void r(com.pinterest.framework.multisection.datasource.pagedlist.f0 f0Var) {
        ArrayDeque arrayDeque = this.f106781f;
        arrayDeque.addLast(f0Var);
        if (arrayDeque.size() == 1) {
            k();
        }
    }

    @Override // vq0.e
    public final void removeItem(int i13) {
        boolean z13 = i13 >= 0 && i13 < this.f106780e.size();
        m60.f0 f0Var = vb0.j.f125466a;
        f0Var.S(z13, i13 + " is out of range", new Object[0]);
        int i14 = i13 + 1;
        f0Var.S(i13 >= 0 && i13 < this.f106780e.size(), a.a.e("startIndex:", i13, " is out of range"), new Object[0]);
        f0Var.S(i14 >= 0 && i14 <= this.f106780e.size(), a.a.e("endIndex:", i14, " is out of range"), new Object[0]);
        r(new com.pinterest.framework.multisection.datasource.pagedlist.b0(i13, i14));
    }

    @Override // vq0.f
    public final boolean t0() {
        if (!this.f106777b) {
            return false;
        }
        n nVar = this.f106782g;
        if ((nVar instanceof c) || (nVar instanceof e)) {
            return true;
        }
        if (nVar instanceof d) {
            return ((d) nVar).f106758b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
