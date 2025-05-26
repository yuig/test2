package a81;

import a.cb;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.pinterest.api.model.vq;
import com.pinterest.feature.search.visual.collage.view.CollageInteractiveFrameLayout;
import dl1.l;
import java.util.ArrayList;
import java.util.Iterator;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import t71.i;
import tb0.h;
import uj2.b0;
import uj2.q;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class g extends t implements t71.e, i {

    /* renamed from: a, reason: collision with root package name */
    public final dl1.t f1513a;

    /* renamed from: b, reason: collision with root package name */
    public final cr1.c f1514b;

    /* renamed from: c, reason: collision with root package name */
    public final w f1515c;

    /* renamed from: d, reason: collision with root package name */
    public final h f1516d;

    /* renamed from: e, reason: collision with root package name */
    public z71.c f1517e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1518f;

    /* renamed from: g, reason: collision with root package name */
    public final c f1519g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(uk1.d presenterPinalytics, q networkStateStream, dl1.t collageLocalDataRepository, cr1.c collageComposeDataManager, w eventManager, h crashReporting) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(collageLocalDataRepository, "collageLocalDataRepository");
        Intrinsics.checkNotNullParameter(collageComposeDataManager, "collageComposeDataManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f1513a = collageLocalDataRepository;
        this.f1514b = collageComposeDataManager;
        this.f1515c = eventManager;
        this.f1516d = crashReporting;
        this.f1519g = new c(this);
    }

    @Override // yk1.b
    public final void onActivate() {
        this.f1515c.h(this.f1519g);
        this.f1518f = false;
    }

    @Override // yk1.b
    public final void onDeactivate() {
        this.f1515c.j(this.f1519g);
    }

    @Override // yk1.b
    public final void onDestroy() {
        z71.c cVar;
        if (!this.f1518f || (cVar = this.f1517e) == null) {
            return;
        }
        ek2.f r13 = nl.b.r(this.f1513a.d(cVar), null, null, 3);
        if (isBound()) {
            addDisposable(r13);
        }
    }

    public final int p3(String viewId) {
        z71.e localPage;
        Intrinsics.checkNotNullParameter(viewId, "viewId");
        z71.c cVar = this.f1517e;
        if (cVar == null || (localPage = cVar.getLocalPage()) == null) {
            return 0;
        }
        Iterator it = localPage.getOverlayItems().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            int i14 = i13 + 1;
            if (Intrinsics.d(((z71.i) it.next()).getConfig().getId(), viewId)) {
                return i13;
            }
            i13 = i14;
        }
        return 0;
    }

    public final void q3(z71.e page) {
        z71.c cVar = this.f1517e;
        if (cVar == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(page, "page");
        z71.c a13 = z71.c.a(cVar, page);
        this.f1517e = a13;
        ((l) this.f1513a).W(a13);
    }

    public final void r3(Matrix viewMatrix, RectF rectF, vq vqVar) {
        z71.e localPage;
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        z71.c cVar = this.f1517e;
        if (cVar == null || (localPage = cVar.getLocalPage()) == null) {
            return;
        }
        q3(localPage.h(new d(viewMatrix, rectF, vqVar, 0)));
    }

    @Override // yk1.p
    /* renamed from: s3, reason: merged with bridge method [inline-methods] */
    public final void r3(t71.f view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        e81.d dVar = (e81.d) view;
        dVar.G0 = this;
        dVar.H0 = this;
        cr1.c cVar = this.f1514b;
        String str = cVar.f53098a;
        if (str.length() == 0) {
            str = cb.g("toString(...)");
            cVar.f53098a = str;
        }
        addDisposable(((l) this.f1513a).S(str).A(wj2.c.a()).F(new a(1, new e(this, 0)), new a(2, new e(this, 1)), ck2.i.f27923c, ck2.i.f27924d));
    }

    public final void t3() {
        z71.c cVar = this.f1517e;
        if (cVar != null) {
            ek2.f r13 = nl.b.r(this.f1513a.d(cVar), null, null, 3);
            if (isBound()) {
                addDisposable(r13);
            }
        }
    }

    public final void u3(String viewId, z71.b overlayType) {
        z71.e localPage;
        Intrinsics.checkNotNullParameter(viewId, "viewId");
        Intrinsics.checkNotNullParameter(overlayType, "overlayType");
        z71.c cVar = this.f1517e;
        if (cVar == null || (localPage = cVar.getLocalPage()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (z71.i iVar : localPage.getOverlayItems()) {
            i13++;
            if (Intrinsics.d(iVar.getConfig().getId(), viewId)) {
                CollageInteractiveFrameLayout collageInteractiveFrameLayout = ((e81.d) ((t71.f) getView())).f57765l0;
                if (collageInteractiveFrameLayout == null) {
                    Intrinsics.r("contentContainer");
                    throw null;
                }
                collageInteractiveFrameLayout.removeViewAt(i13);
            } else {
                arrayList.add(iVar);
            }
        }
        q3(z71.e.a(localPage, null, arrayList, 3));
    }

    public final void v3(t71.h direction, String viewId) {
        z71.e localPage;
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(viewId, "viewId");
        z71.c cVar = this.f1517e;
        if (cVar == null || (localPage = cVar.getLocalPage()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = b.f1504a[direction.ordinal()];
        int i14 = 0;
        if (i13 == 1) {
            for (z71.i iVar : localPage.getOverlayItems()) {
                int i15 = i14 + 1;
                if (!Intrinsics.d(iVar.getConfig().getId(), viewId) || i14 <= 0) {
                    arrayList.add(iVar);
                } else {
                    ((e81.d) ((t71.f) getView())).g8(i15, i14);
                    arrayList.add(i14 - 1, iVar);
                }
                i14 = i15;
            }
        } else if (i13 == 2) {
            z71.i iVar2 = null;
            for (z71.i iVar3 : localPage.getOverlayItems()) {
                int i16 = i14 + 1;
                if (!Intrinsics.d(iVar3.getConfig().getId(), viewId) || i14 >= localPage.getOverlayItems().size() - 1) {
                    arrayList.add(iVar3);
                    if (iVar2 != null) {
                        arrayList.add(iVar2);
                        iVar2 = null;
                    }
                    i14 = i16;
                } else {
                    ((e81.d) ((t71.f) getView())).g8(i16, i14 + 2);
                    i14 = i16;
                    iVar2 = iVar3;
                }
            }
        }
        z71.c cVar2 = this.f1517e;
        this.f1517e = cVar2 != null ? z71.c.a(cVar2, z71.e.a(localPage, null, arrayList, 3)) : null;
    }

    public final void w3() {
        ((e81.d) ((t71.f) getView())).P7();
    }

    public final void x3(String viewId, Matrix viewMatrix, RectF rectF, vq vqVar) {
        z71.e localPage;
        Intrinsics.checkNotNullParameter(viewId, "viewId");
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        z71.c cVar = this.f1517e;
        if (cVar == null || (localPage = cVar.getLocalPage()) == null) {
            return;
        }
        q3(localPage.j(viewId, new d(viewMatrix, rectF, vqVar, 1)));
    }

    public final void z3() {
        b0 g13;
        e81.d dVar = (e81.d) ((t71.f) getView());
        CollageInteractiveFrameLayout collageInteractiveFrameLayout = dVar.f57765l0;
        Bitmap bitmap = null;
        if (collageInteractiveFrameLayout == null) {
            Intrinsics.r("contentContainer");
            throw null;
        }
        try {
            bitmap = Bitmap.createBitmap(collageInteractiveFrameLayout.getMeasuredWidth(), collageInteractiveFrameLayout.getMeasuredHeight(), Bitmap.Config.RGB_565);
            collageInteractiveFrameLayout.draw(new Canvas(bitmap));
        } catch (OutOfMemoryError unused) {
        }
        if (bitmap != null) {
            Context applicationContext = dVar.requireContext().getApplicationContext();
            Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
            g13 = u2.R0((Application) applicationContext, bitmap);
        } else {
            g13 = b0.g(new Throwable("Couldn't create Bitmap from contentContainer"));
            Intrinsics.checkNotNullExpressionValue(g13, "error(...)");
        }
        addDisposable(g13.l(wj2.c.a()).o(new u51.b(29, new e(this, 2)), new a(0, f.f1512i)));
    }
}
