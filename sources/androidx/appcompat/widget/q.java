package androidx.appcompat.widget;

import a.a4;
import a.l9;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.Surface;
import android.view.textclassifier.TextClassifier;
import android.widget.ImageButton;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.pinterest.activity.create.CameraActivity;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hi0;
import com.pinterest.api.model.pi0;
import com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadFilterCell;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q implements n.m, androidx.recyclerview.widget.g1, ap.c, uj2.m, u61.b, ak2.f, fb2.c, ca2.c, hs1.o, n8.j0, fa2.a, yb0.h, o82.r, w1.c1, qa2.x0, yq0.f0, aq.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16668a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16669b;

    public q() {
        this.f16668a = 1;
    }

    @Override // fb2.c
    public void A(int i13) {
        hi0 F;
        yw0.a aVar;
        int i14 = this.f16668a;
        Object obj = this.f16669b;
        switch (i14) {
            case 0:
                k90.c cVar = (k90.c) obj;
                cVar.C9();
                cVar.f78737u1 = System.currentTimeMillis();
                f90.b bVar = cVar.f78733q1;
                if (bVar == null) {
                    Intrinsics.r("presenter");
                    throw null;
                }
                bVar.v3(i13);
                boolean z13 = bVar.f61442d;
                if (z13 && i13 != bVar.f61445g) {
                    nx.d0 d0Var = bVar.getPresenterPinalytics().f122379a;
                    h32.f1 f1Var = i13 > bVar.f61445g ? h32.f1.COLLAGE_CUTOUT_ITEM_SWIPE_LEFT : h32.f1.COLLAGE_CUTOUT_ITEM_SWIPE_RIGHT;
                    String str = bVar.f61446h;
                    String str2 = bVar.f61443e;
                    String str3 = bVar.f61439a;
                    h32.c1 B = kh2.g3.B(str3, str2, str);
                    Intrinsics.f(d0Var);
                    d0Var.o(f1Var, (r19 & 2) != 0 ? null : null, (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : str3, (r19 & 32) != 0 ? null : null, null, B, null, false);
                }
                bVar.f61445g = i13;
                if (z13 || (F = ((pi0) bVar.f61444f.get(i13)).F()) == null) {
                    return;
                }
                e90.b bVar2 = bVar.f61448j;
                if (bVar2 != null) {
                    String uid = F.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    Intrinsics.checkNotNullParameter(uid, "<set-?>");
                    bVar2.L = uid;
                }
                if (bVar2 != null) {
                    bVar2.i2();
                    return;
                }
                return;
            case 1:
                bx0.i iVar = (bx0.i) obj;
                u50.r rVar = iVar.f24056m;
                if (rVar != null) {
                    rVar.a(new bx0.p(i13));
                }
                if (iVar.f24061r && (aVar = iVar.f24062s) != null) {
                    switch (aVar.f140265j) {
                        case 0:
                            aVar.f140266k = true;
                            break;
                        default:
                            aVar.f140266k = true;
                            break;
                    }
                }
                iVar.f24061r = true;
                return;
            default:
                fb2.d dVar = ((fb2.b) obj).f61617e;
                if (dVar != null) {
                    ((y81.i) dVar).F3(i13);
                    return;
                }
                return;
        }
    }

    public void B() {
        int i13 = this.f16668a;
        Object obj = this.f16669b;
        switch (i13) {
            case 0:
                zp.d1 d1Var = (zp.d1) obj;
                nx.d0.v(d1Var.t0(), h32.f1.PIN_DELETE, d1Var.L.B(), false, 12);
                d1Var.r0().m(d1Var.getResources().getString(r80.f.pin_deleted));
                d1Var.getEventManager().d(new hv0.a(hv0.b.DELETED, d1Var.L.B()));
                break;
            default:
                t11.f fVar = (t11.f) obj;
                nx.d0 pinalytics = fVar.getPinalytics();
                h32.f1 f1Var = h32.f1.PIN_DELETE;
                aq.j jVar = fVar.f115801a;
                nx.d0.v(pinalytics, f1Var, jVar.B(), false, 12);
                if (fVar.isBound()) {
                    ((u11.c) ((q11.d) fVar.getView())).T8(r80.f.pin_deleted);
                    ((nl1.d) ((q11.d) fVar.getView())).Y6(t11.e.f115799m);
                }
                fVar.f115802b.d(new hv0.a(hv0.b.DELETED, jVar.B()));
                break;
        }
    }

    public void C() {
        Drawable drawable;
        int color;
        int color2;
        m81.e eVar;
        int i13 = this.f16668a;
        int i14 = 0;
        boolean z13 = true;
        Object obj = this.f16669b;
        switch (i13) {
            case 0:
                CameraActivity cameraActivity = (CameraActivity) obj;
                cameraActivity.f34909t = 0;
                fa2.c.l(cameraActivity.f34903n, 0, false);
                fa2.c.l(cameraActivity.f34906q, cameraActivity.f34909t, true);
                cameraActivity.f34900k.setClickable(true);
                cameraActivity.f34901l.setClickable(true);
                cameraActivity.f34903n.setClickable(true);
                cameraActivity.f34895f.setClickable(true);
                ImageButton imageButton = cameraActivity.f34901l;
                Context context = imageButton.getContext();
                Drawable drawable2 = cameraActivity.f34901l.getDrawable();
                int i15 = eo1.b.color_white_0;
                Intrinsics.checkNotNullParameter(context, "context");
                Drawable drawable3 = null;
                if (drawable2 != null) {
                    if (i15 == 0) {
                        int i16 = df0.a.f54892a;
                        Object obj2 = d5.a.f53679a;
                        color2 = context.getColor(i16);
                    } else {
                        Object obj3 = d5.a.f53679a;
                        color2 = context.getColor(i15);
                    }
                    Intrinsics.checkNotNullParameter(context, "context");
                    if (color2 == 0) {
                        color2 = context.getColor(df0.a.f54892a);
                    }
                    drawable = drawable2.mutate();
                    drawable.setTint(color2);
                } else {
                    drawable = null;
                }
                imageButton.setImageDrawable(drawable);
                ImageButton imageButton2 = cameraActivity.f34902m;
                Context context2 = imageButton2.getContext();
                Drawable drawable4 = cameraActivity.f34902m.getDrawable();
                int i17 = eo1.b.color_white_0;
                Intrinsics.checkNotNullParameter(context2, "context");
                if (drawable4 != null) {
                    if (i17 == 0) {
                        int i18 = df0.a.f54892a;
                        Object obj4 = d5.a.f53679a;
                        color = context2.getColor(i18);
                    } else {
                        Object obj5 = d5.a.f53679a;
                        color = context2.getColor(i17);
                    }
                    Intrinsics.checkNotNullParameter(context2, "context");
                    if (color == 0) {
                        color = context2.getColor(df0.a.f54892a);
                    }
                    drawable3 = drawable4.mutate();
                    drawable3.setTint(color);
                }
                imageButton2.setImageDrawable(drawable3);
                break;
            default:
                u81.i iVar = (u81.i) obj;
                int i19 = u81.i.f121029o;
                iVar.getClass();
                Camera camera = fa2.c.f61593a;
                if (camera != null && (eVar = iVar.f121040k) != null) {
                    s81.b bVar = (s81.b) eVar;
                    bVar.f111891g = true;
                    bVar.f111889e = 0;
                    fa2.c.k(bVar.f111888d, camera);
                    Camera.Parameters parameters = camera.getParameters();
                    Intrinsics.f(parameters);
                    List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                    ArrayList arrayList = bVar.f111890f;
                    if (arrayList.isEmpty() && supportedFlashModes != null) {
                        if (supportedFlashModes.contains("on")) {
                            arrayList.add("on");
                        }
                        if (supportedFlashModes.contains("off")) {
                            arrayList.add("off");
                        }
                        if (supportedFlashModes.contains("auto")) {
                            arrayList.add("auto");
                        }
                    }
                    u81.i iVar2 = (u81.i) ((m81.f) bVar.getView());
                    iVar2.getClass();
                    iVar2.f121032c.t(new u81.h(z13, i14));
                    iVar2.f121034e.f52246f = true;
                    if (bVar.f111888d == 0) {
                        if (arrayList.contains("auto")) {
                            bVar.f111887c = "auto";
                            parameters.setFlashMode("auto");
                            iVar2.k("auto");
                        }
                        iVar2.m(rm1.q.FLASH_AUTOMATIC);
                        iVar2.l(true);
                    } else {
                        iVar2.l(false);
                        iVar2.m(rm1.q.FLASH);
                        iVar2.f121031b.setAlpha(0.5f);
                    }
                    ((hf0.b) bVar.f111885a).getClass();
                    kg.t.V0(parameters, 1200.0f, hf0.b.f69002b / hf0.b.f69003c);
                    camera.setParameters(parameters);
                    camera.startPreview();
                    break;
                }
                break;
        }
    }

    public void D(TextClassifier textClassifier) {
        super/*android.widget.TextView*/.setTextClassifier(textClassifier);
    }

    public void E(ArrayList arrayList) {
        e7.t tVar;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (((e7.s) arrayList.get(i13)).f57595a == 1) {
                try {
                    tVar = new e7.t((e7.s) arrayList.get(i13));
                } catch (e7.r unused) {
                    tVar = null;
                }
                this.f16669b = tVar;
            }
        }
    }

    @Override // yb0.h
    public void G6() {
    }

    @Override // yb0.h
    public void H0(boolean z13) {
    }

    @Override // uj2.m
    public void a() {
        switch (this.f16668a) {
            case 0:
                break;
            default:
                ((uj2.m) ((hk2.b) this.f16669b).f69388b).a();
                break;
        }
    }

    @Override // ak2.f
    public Object apply(Object obj) {
        int i13 = this.f16668a;
        Object obj2 = this.f16669b;
        switch (i13) {
            case 0:
                return (uj2.l) obj2;
            case 1:
                Object[] objArr = (Object[]) obj;
                if (objArr.length != 3) {
                    throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
                }
                Object p03 = objArr[0];
                Object p13 = objArr[1];
                Object p23 = objArr[2];
                kl2.l tmp0 = (kl2.l) ((a.z0) obj2).f196b;
                List list = va1.w.f125256x;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                Intrinsics.checkNotNullParameter(p23, "p2");
                return (xk2.w) tmp0.invoke(p03, p13, p23);
            case 2:
                List list2 = (List) obj;
                Collections.sort(list2, (Comparator) obj2);
                return list2;
            default:
                Object apply = ((ak2.f) ((hk2.o) obj2).f69430c).apply(new Object[]{obj});
                ck2.i.b(apply, "The zipper returned a null value");
                return apply;
        }
    }

    @Override // uj2.m
    public void b(xj2.c d2) {
        switch (this.f16668a) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                break;
            default:
                bk2.c.setOnce((hk2.b) this.f16669b, d2);
                break;
        }
    }

    @Override // n8.j0
    public void c() {
        switch (this.f16668a) {
            case 0:
                Iterator it = ((n8.s) this.f16669b).f89881j.iterator();
                while (it.hasNext()) {
                    n8.o oVar = (n8.o) it.next();
                    oVar.f89867j.execute(new n8.n(oVar, oVar.f89866i, 0));
                }
                break;
            default:
                n8.i iVar = (n8.i) this.f16669b;
                Surface surface = iVar.U0;
                if (surface != null) {
                    tb.c cVar = iVar.G0;
                    if (((Handler) cVar.f116959a) != null) {
                        ((Handler) cVar.f116959a).post(new n8.e0(cVar, surface, SystemClock.elapsedRealtime()));
                    }
                    iVar.X0 = true;
                    break;
                }
                break;
        }
    }

    @Override // hs1.o
    public void d() {
        int i13 = this.f16668a;
        Object obj = this.f16669b;
        switch (i13) {
            case 0:
                ((hs1.o) obj).d();
                break;
            case 1:
                ((xi1.i) obj).F = xi1.e.f135048b;
                break;
            case 2:
                break;
            default:
                ((wa2.g) obj).F = wa2.c.f128682b;
                break;
        }
    }

    @Override // n8.j0
    public void e(a7.o1 o1Var) {
        switch (this.f16668a) {
            case 0:
                Iterator it = ((n8.s) this.f16669b).f89881j.iterator();
                while (it.hasNext()) {
                    n8.o oVar = (n8.o) it.next();
                    oVar.f89867j.execute(new a4(oVar, oVar.f89866i, o1Var, 27));
                }
                break;
        }
    }

    @Override // u61.b
    public void f() {
        switch (this.f16668a) {
            case 0:
                h61.j jVar = ((SearchGridMultiSectionFragment) this.f16669b).U1;
                if (jVar != null) {
                    jVar.S0();
                    break;
                }
                break;
        }
    }

    @Override // u61.b
    public void g() {
        switch (this.f16668a) {
            case 0:
                SearchGridMultiSectionFragment searchGridMultiSectionFragment = (SearchGridMultiSectionFragment) this.f16669b;
                h61.j jVar = searchGridMultiSectionFragment.U1;
                if (jVar != null) {
                    jVar.g();
                }
                searchGridMultiSectionFragment.X1 = null;
                searchGridMultiSectionFragment.S1 = null;
                if (searchGridMultiSectionFragment.l9().l()) {
                    return;
                }
                c71.b0 b0Var = searchGridMultiSectionFragment.P1;
                if (b0Var != null) {
                    searchGridMultiSectionFragment.P1 = c71.b0.a(b0Var, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 2097151);
                    return;
                } else {
                    Intrinsics.r("searchParameters");
                    throw null;
                }
            default:
                return;
        }
    }

    @Override // n.m
    public boolean h(n.o oVar, MenuItem menuItem) {
        androidx.appcompat.app.w0 w0Var;
        int i13 = this.f16668a;
        Object obj = this.f16669b;
        switch (i13) {
            case 0:
                c3 c3Var = ((ActionMenuView) obj).A;
                if (c3Var == null) {
                    return false;
                }
                Toolbar toolbar = c3Var.f16537a;
                return toolbar.G.a(menuItem) || ((w0Var = toolbar.I) != null && w0Var.f16144a.f16152b.onMenuItemSelected(0, menuItem));
            default:
                b2 b2Var = (b2) ((c2) obj).f16535f;
                if (b2Var != null) {
                    return ((a.z0) b2Var).s(menuItem);
                }
                return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0200 A[Catch: Exception -> 0x025f, TryCatch #0 {Exception -> 0x025f, blocks: (B:60:0x01de, B:61:0x01fc, B:63:0x0200, B:64:0x020f, B:66:0x0215, B:68:0x024d, B:71:0x0253, B:75:0x01eb), top: B:57:0x01da }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0253 A[Catch: Exception -> 0x025f, TRY_LEAVE, TryCatch #0 {Exception -> 0x025f, blocks: (B:60:0x01de, B:61:0x01fc, B:63:0x0200, B:64:0x020f, B:66:0x0215, B:68:0x024d, B:71:0x0253, B:75:0x01eb), top: B:57:0x01da }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029b  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.DefaultConstructorMarker, va1.k1] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.String] */
    @Override // o82.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(java.lang.Object r22, bl2.c r23) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q.i(java.lang.Object, bl2.c):java.lang.Object");
    }

    @Override // androidx.recyclerview.widget.g1
    public void j(int i13, int i14) {
        int i15 = this.f16668a;
        Object obj = this.f16669b;
        switch (i15) {
            case 0:
                ((androidx.recyclerview.widget.b2) obj).n(i13, i14);
                break;
            default:
                Object adapter = ((vq0.c) obj).getAdapter();
                if (adapter != null) {
                    ((androidx.recyclerview.widget.b2) adapter).n(i13, i14);
                    break;
                }
                break;
        }
    }

    @Override // hs1.o
    public void k(Bitmap bitmap) {
        int i13 = this.f16668a;
        Object obj = this.f16669b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                ((hs1.o) obj).k(bitmap);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                xi1.i iVar = (xi1.i) obj;
                int i14 = xi1.i.I;
                iVar.getClass();
                iVar.F = (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) ? xi1.e.f135048b : new xi1.d(bitmap);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                ((sa2.c) obj).f121492a.invalidate();
                break;
            default:
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                wa2.g gVar = (wa2.g) obj;
                int i15 = wa2.g.I;
                gVar.getClass();
                gVar.F = (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) ? wa2.c.f128682b : new wa2.b(bitmap);
                break;
        }
    }

    @Override // n8.j0
    public void l(VideoSink$VideoSinkException videoSink$VideoSinkException) {
        switch (this.f16668a) {
            case 0:
                Iterator it = ((n8.s) this.f16669b).f89881j.iterator();
                while (it.hasNext()) {
                    n8.o oVar = (n8.o) it.next();
                    VideoFrameProcessingException a13 = VideoFrameProcessingException.a(videoSink$VideoSinkException);
                    oVar.f89867j.execute(new a4(oVar, oVar.f89866i, a13, 28));
                }
                break;
            default:
                n8.i iVar = (n8.i) this.f16669b;
                iVar.f134096x0 = iVar.g(7001, videoSink$VideoSinkException.f18856a, videoSink$VideoSinkException, false);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.g1
    public void m(int i13, int i14) {
        int i15 = this.f16668a;
        Object obj = this.f16669b;
        switch (i15) {
            case 0:
                ((androidx.recyclerview.widget.b2) obj).o(i13, i14);
                break;
            default:
                Object adapter = ((vq0.c) obj).getAdapter();
                if (adapter != null) {
                    ((androidx.recyclerview.widget.b2) adapter).o(i13, i14);
                    break;
                }
                break;
        }
    }

    @Override // u61.b
    public void n(v61.a hairPattern, int i13) {
        int i14 = this.f16668a;
        Object obj = this.f16669b;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(hairPattern, "hairPattern");
                SearchGridMultiSectionFragment searchGridMultiSectionFragment = (SearchGridMultiSectionFragment) obj;
                Integer num = searchGridMultiSectionFragment.X1;
                if (num != null && num.intValue() == i13) {
                    g();
                    return;
                }
                searchGridMultiSectionFragment.X1 = Integer.valueOf(i13);
                searchGridMultiSectionFragment.S1 = null;
                if (!searchGridMultiSectionFragment.l9().l()) {
                    c71.b0 b0Var = searchGridMultiSectionFragment.P1;
                    if (b0Var == null) {
                        Intrinsics.r("searchParameters");
                        throw null;
                    }
                    searchGridMultiSectionFragment.P1 = c71.b0.a(b0Var, null, null, null, null, null, null, false, null, hairPattern.a(), null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 2097151);
                }
                h61.j jVar = searchGridMultiSectionFragment.U1;
                if (jVar != null) {
                    jVar.v(hairPattern);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(hairPattern, "hairPattern");
                o71.n nVar = ((SearchTypeaheadFilterCell) obj).f47849d;
                if (nVar != null) {
                    nVar.r3(hairPattern.a());
                    return;
                }
                return;
        }
    }

    @Override // ap.c
    public void o() {
        int i13 = this.f16668a;
        Object obj = this.f16669b;
        switch (i13) {
            case 0:
                ap.g gVar = (ap.g) obj;
                vy.m mVar = (vy.m) ((bf2.b) gVar.f20265h0).get();
                mVar.getClass();
                Intrinsics.checkNotNullParameter("permissions_contact_accept", "event");
                mVar.l("permissions_contact_accept", kotlin.collections.z0.d());
                int i14 = 1;
                gVar.f20263f0.a(gVar.f20267j0.h().i(new xo.b(i14), new xo.l(i14)));
                break;
            case 1:
                ap.g gVar2 = (ap.g) obj;
                vy.m mVar2 = (vy.m) ((bf2.b) gVar2.f20265h0).get();
                mVar2.getClass();
                Intrinsics.checkNotNullParameter("permissions_contact_accept", "event");
                mVar2.l("permissions_contact_accept", kotlin.collections.z0.d());
                gVar2.f20264g0.o();
                break;
            default:
                nl.b.k(((ap.o) obj).h(), "Error during postContactUploadNavigation permissions", ap.l.f20273j);
                break;
        }
    }

    @Override // uj2.m
    public void onError(Throwable e13) {
        int i13 = this.f16668a;
        Object obj = this.f16669b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(e13, "e");
                ((aq.h) obj).onError(e13);
                break;
            default:
                ((uj2.m) ((hk2.b) obj).f69388b).onError(e13);
                break;
        }
    }

    @Override // uj2.m
    public void onSuccess(Object obj) {
        int i13 = this.f16668a;
        Object obj2 = this.f16669b;
        switch (i13) {
            case 0:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                String uid = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                ((aq.h) obj2).a(uid);
                break;
            default:
                ((uj2.m) ((hk2.b) obj2).f69388b).onSuccess(obj);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.g1
    public void p(int i13, Object obj, int i14) {
        int i15 = this.f16668a;
        Object obj2 = this.f16669b;
        switch (i15) {
            case 0:
                ((androidx.recyclerview.widget.b2) obj2).m(i13, obj, i14);
                break;
            default:
                Object adapter = ((vq0.c) obj2).getAdapter();
                if (adapter != null) {
                    ((androidx.recyclerview.widget.b2) adapter).l(i13, i14);
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.g1
    public void q(int i13, int i14) {
        int i15 = this.f16668a;
        Object obj = this.f16669b;
        switch (i15) {
            case 0:
                ((androidx.recyclerview.widget.b2) obj).k(i13, i14);
                break;
            default:
                Object adapter = ((vq0.c) obj).getAdapter();
                if (adapter != null) {
                    ((androidx.recyclerview.widget.b2) adapter).k(i13, i14);
                    break;
                }
                break;
        }
    }

    @Override // ap.c
    public boolean r() {
        switch (this.f16668a) {
            case 0:
                u();
                return false;
            case 1:
                ap.g gVar = (ap.g) this.f16669b;
                int i13 = ap.g.f20259k0;
                gVar.getClass();
                m60.u.f85943a.d(new ap.k());
                return gVar.f20264g0.r();
            default:
                return false;
        }
    }

    @Override // w1.c1
    public w1.b1 t(KeyEvent keyEvent) {
        int i13 = this.f16668a;
        Object obj = this.f16669b;
        w1.b1 b1Var = null;
        switch (i13) {
            case 0:
                Function1 function1 = (Function1) obj;
                if (((Boolean) function1.invoke(new l3.b(keyEvent))).booleanValue() && keyEvent.isShiftPressed()) {
                    if (l3.a.a(l9.a(keyEvent.getKeyCode()), w1.u1.f127528g)) {
                        return w1.b1.REDO;
                    }
                    return null;
                }
                if (((Boolean) function1.invoke(new l3.b(keyEvent))).booleanValue()) {
                    long a13 = l9.a(keyEvent.getKeyCode());
                    if (l3.a.a(a13, w1.u1.f127523b) || l3.a.a(a13, w1.u1.f127538q)) {
                        return w1.b1.COPY;
                    }
                    if (l3.a.a(a13, w1.u1.f127525d)) {
                        return w1.b1.PASTE;
                    }
                    if (l3.a.a(a13, w1.u1.f127527f)) {
                        return w1.b1.CUT;
                    }
                    if (l3.a.a(a13, w1.u1.f127522a)) {
                        return w1.b1.SELECT_ALL;
                    }
                    if (l3.a.a(a13, w1.u1.f127526e)) {
                        return w1.b1.REDO;
                    }
                    if (l3.a.a(a13, w1.u1.f127528g)) {
                        return w1.b1.UNDO;
                    }
                    return null;
                }
                if (keyEvent.isCtrlPressed()) {
                    return null;
                }
                if (keyEvent.isShiftPressed()) {
                    long a14 = l9.a(keyEvent.getKeyCode());
                    if (l3.a.a(a14, w1.u1.f127530i)) {
                        return w1.b1.SELECT_LEFT_CHAR;
                    }
                    if (l3.a.a(a14, w1.u1.f127531j)) {
                        return w1.b1.SELECT_RIGHT_CHAR;
                    }
                    if (l3.a.a(a14, w1.u1.f127532k)) {
                        return w1.b1.SELECT_UP;
                    }
                    if (l3.a.a(a14, w1.u1.f127533l)) {
                        return w1.b1.SELECT_DOWN;
                    }
                    if (l3.a.a(a14, w1.u1.f127534m)) {
                        return w1.b1.SELECT_PAGE_UP;
                    }
                    if (l3.a.a(a14, w1.u1.f127535n)) {
                        return w1.b1.SELECT_PAGE_DOWN;
                    }
                    if (l3.a.a(a14, w1.u1.f127536o)) {
                        return w1.b1.SELECT_LINE_START;
                    }
                    if (l3.a.a(a14, w1.u1.f127537p)) {
                        return w1.b1.SELECT_LINE_END;
                    }
                    if (l3.a.a(a14, w1.u1.f127538q)) {
                        return w1.b1.PASTE;
                    }
                    return null;
                }
                long a15 = l9.a(keyEvent.getKeyCode());
                if (l3.a.a(a15, w1.u1.f127530i)) {
                    return w1.b1.LEFT_CHAR;
                }
                if (l3.a.a(a15, w1.u1.f127531j)) {
                    return w1.b1.RIGHT_CHAR;
                }
                if (l3.a.a(a15, w1.u1.f127532k)) {
                    return w1.b1.UP;
                }
                if (l3.a.a(a15, w1.u1.f127533l)) {
                    return w1.b1.DOWN;
                }
                if (l3.a.a(a15, w1.u1.f127534m)) {
                    return w1.b1.PAGE_UP;
                }
                if (l3.a.a(a15, w1.u1.f127535n)) {
                    return w1.b1.PAGE_DOWN;
                }
                if (l3.a.a(a15, w1.u1.f127536o)) {
                    return w1.b1.LINE_START;
                }
                if (l3.a.a(a15, w1.u1.f127537p)) {
                    return w1.b1.LINE_END;
                }
                if (l3.a.a(a15, w1.u1.f127539r)) {
                    return w1.b1.NEW_LINE;
                }
                if (l3.a.a(a15, w1.u1.f127540s)) {
                    return w1.b1.DELETE_PREV_CHAR;
                }
                if (l3.a.a(a15, w1.u1.f127541t)) {
                    return w1.b1.DELETE_NEXT_CHAR;
                }
                if (l3.a.a(a15, w1.u1.f127542u)) {
                    return w1.b1.PASTE;
                }
                if (l3.a.a(a15, w1.u1.f127543v)) {
                    return w1.b1.CUT;
                }
                if (l3.a.a(a15, w1.u1.f127544w)) {
                    return w1.b1.COPY;
                }
                if (l3.a.a(a15, w1.u1.f127545x)) {
                    return w1.b1.TAB;
                }
                return null;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                    long a16 = l9.a(keyEvent.getKeyCode());
                    if (l3.a.a(a16, w1.u1.f127530i)) {
                        b1Var = w1.b1.SELECT_LEFT_WORD;
                    } else if (l3.a.a(a16, w1.u1.f127531j)) {
                        b1Var = w1.b1.SELECT_RIGHT_WORD;
                    } else if (l3.a.a(a16, w1.u1.f127532k)) {
                        b1Var = w1.b1.SELECT_PREV_PARAGRAPH;
                    } else if (l3.a.a(a16, w1.u1.f127533l)) {
                        b1Var = w1.b1.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (keyEvent.isCtrlPressed()) {
                    long a17 = l9.a(keyEvent.getKeyCode());
                    if (l3.a.a(a17, w1.u1.f127530i)) {
                        b1Var = w1.b1.LEFT_WORD;
                    } else if (l3.a.a(a17, w1.u1.f127531j)) {
                        b1Var = w1.b1.RIGHT_WORD;
                    } else if (l3.a.a(a17, w1.u1.f127532k)) {
                        b1Var = w1.b1.PREV_PARAGRAPH;
                    } else if (l3.a.a(a17, w1.u1.f127533l)) {
                        b1Var = w1.b1.NEXT_PARAGRAPH;
                    } else if (l3.a.a(a17, w1.u1.f127524c)) {
                        b1Var = w1.b1.DELETE_PREV_CHAR;
                    } else if (l3.a.a(a17, w1.u1.f127541t)) {
                        b1Var = w1.b1.DELETE_NEXT_WORD;
                    } else if (l3.a.a(a17, w1.u1.f127540s)) {
                        b1Var = w1.b1.DELETE_PREV_WORD;
                    } else if (l3.a.a(a17, w1.u1.f127529h)) {
                        b1Var = w1.b1.DESELECT;
                    }
                } else if (keyEvent.isShiftPressed()) {
                    long a18 = l9.a(keyEvent.getKeyCode());
                    if (l3.a.a(a18, w1.u1.f127536o)) {
                        b1Var = w1.b1.SELECT_LINE_LEFT;
                    } else if (l3.a.a(a18, w1.u1.f127537p)) {
                        b1Var = w1.b1.SELECT_LINE_RIGHT;
                    }
                } else if (keyEvent.isAltPressed()) {
                    long a19 = l9.a(keyEvent.getKeyCode());
                    if (l3.a.a(a19, w1.u1.f127540s)) {
                        b1Var = w1.b1.DELETE_FROM_LINE_START;
                    } else if (l3.a.a(a19, w1.u1.f127541t)) {
                        b1Var = w1.b1.DELETE_TO_LINE_END;
                    }
                }
                return b1Var == null ? ((w1.c1) obj).t(keyEvent) : b1Var;
        }
    }

    @Override // yb0.h
    public void t2() {
        int i13 = this.f16668a;
        Object obj = this.f16669b;
        switch (i13) {
            case 0:
                q91.u uVar = (q91.u) obj;
                lb2.n nVar = uVar.B0;
                if (nVar == null) {
                    Intrinsics.r("accountSwitcher");
                    throw null;
                }
                FragmentActivity requireActivity = uVar.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                nVar.d(requireActivity, "user_account_deactivated", "");
                return;
            default:
                ((Function0) obj).invoke();
                return;
        }
    }

    @Override // ap.c
    public void u() {
        int i13 = this.f16668a;
        Object obj = this.f16669b;
        switch (i13) {
            case 0:
                int i14 = ap.g.f20259k0;
                ((ap.g) obj).getClass();
                m60.u.f85943a.d(new ap.k());
                break;
            case 1:
                ap.g gVar = (ap.g) obj;
                int i15 = ap.g.f20259k0;
                gVar.getClass();
                m60.u.f85943a.d(new ap.k());
                gVar.f20264g0.u();
                break;
        }
    }

    @Override // n8.j0
    public void v() {
        int i13 = 1;
        switch (this.f16668a) {
            case 0:
                Iterator it = ((n8.s) this.f16669b).f89881j.iterator();
                while (it.hasNext()) {
                    n8.o oVar = (n8.o) it.next();
                    oVar.f89867j.execute(new n8.n(oVar, oVar.f89866i, i13));
                }
                break;
            default:
                n8.i iVar = (n8.i) this.f16669b;
                if (iVar.U0 != null) {
                    iVar.g1(0, 1);
                    break;
                }
                break;
        }
    }

    @Override // n.m
    public void w(n.o oVar) {
        switch (this.f16668a) {
            case 0:
                n.m mVar = ((ActionMenuView) this.f16669b).f16256v;
                if (mVar != null) {
                    mVar.w(oVar);
                    break;
                }
                break;
        }
    }

    @Override // ca2.c
    public void x() {
        int i13 = this.f16668a;
        Object obj = this.f16669b;
        switch (i13) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            default:
                super/*nl1.d*/.P7();
                break;
        }
    }

    public Object y(m1.m1 m1Var, float f13, float f14, n1.d dVar, n1.g gVar) {
        int i13 = this.f16668a;
        Object obj = this.f16669b;
        switch (i13) {
            case 0:
                Object a13 = n1.l.a(m1Var, f13, j1.e.b(0.0f, f14), (j1.a0) obj, dVar, gVar);
                return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : (n1.a) a13;
            default:
                Object b13 = n1.l.b(m1Var, Math.signum(f14) * Math.abs(f13), f13, j1.e.b(0.0f, f14), (j1.n) obj, dVar, gVar);
                return b13 == cl2.a.COROUTINE_SUSPENDED ? b13 : (n1.a) b13;
        }
    }

    public TextClassifier z() {
        TextClassifier textClassifier;
        textClassifier = super/*android.widget.TextView*/.getTextClassifier();
        return textClassifier;
    }

    public /* synthetic */ q(Object obj, int i13) {
        this.f16668a = i13;
        this.f16669b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(n8.s sVar) {
        this(sVar, 0);
        this.f16668a = 0;
    }
}
