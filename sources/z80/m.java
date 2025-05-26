package z80;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Size;
import ao2.j0;
import ao2.k2;
import ao2.o1;
import ao2.v0;
import c72.b0;
import com.pinterest.api.model.fi0;
import com.pinterest.shuffles.scene.composer.a1;
import com.pinterest.shuffles.scene.composer.z;
import do2.r2;
import do2.t2;
import do2.y1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.k0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l62.c0;
import l62.d0;
import l62.f0;
import l62.g0;
import l62.h0;
import l62.n0;
import lb.l0;
import pk.a0;
import r72.a2;
import r72.f2;
import r72.l2;
import r72.m1;
import r72.q1;
import r72.t1;
import r72.u1;
import r72.w1;
import r72.x0;
import r72.y0;
import r72.z1;
import s80.a5;
import s80.b5;
import s80.h4;
import s80.i4;
import s80.j4;
import s80.k4;
import s80.l4;
import s80.m4;
import s80.n4;
import s80.o4;
import s80.p4;
import s80.q4;
import s80.r4;
import s80.s4;
import s80.t4;
import s80.u4;
import s80.v4;
import s80.w4;
import s80.x4;
import s80.y4;
import s80.z4;

/* loaded from: classes5.dex */
public final class m implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f141066a;

    /* renamed from: b, reason: collision with root package name */
    public final h62.k f141067b;

    /* renamed from: c, reason: collision with root package name */
    public final vh.a f141068c;

    /* renamed from: d, reason: collision with root package name */
    public final o72.a f141069d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f141070e;

    /* renamed from: f, reason: collision with root package name */
    public final dv0.q f141071f;

    /* renamed from: g, reason: collision with root package name */
    public final ob0.a f141072g;

    public m(Context context, h62.k composerProject, vh.a composerViewModelDelegate, o72.a fontInteractor, b0 shufflesEntityMapper, dv0.q shufflesEffectDataBridge, ob0.a crashReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(composerProject, "composerProject");
        Intrinsics.checkNotNullParameter(composerViewModelDelegate, "composerViewModelDelegate");
        Intrinsics.checkNotNullParameter(fontInteractor, "fontInteractor");
        Intrinsics.checkNotNullParameter(shufflesEntityMapper, "shufflesEntityMapper");
        Intrinsics.checkNotNullParameter(shufflesEffectDataBridge, "shufflesEffectDataBridge");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        this.f141066a = context;
        this.f141067b = composerProject;
        this.f141068c = composerViewModelDelegate;
        this.f141069d = fontInteractor;
        this.f141070e = shufflesEntityMapper;
        this.f141071f = shufflesEffectDataBridge;
        this.f141072g = crashReporter;
    }

    @Override // l82.g
    public final void e(j0 coroutineScope, l82.h hVar, u50.r eventIntake) {
        t2 t2Var;
        Object value;
        t2 t2Var2;
        Object value2;
        t2 t2Var3;
        Object value3;
        Object obj;
        t2 t2Var4;
        Object value4;
        k2 z13;
        z1 z1Var;
        t2 t2Var5;
        Object value5;
        b5 request = (b5) hVar;
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z14 = request instanceof p4;
        int i13 = 6;
        boolean z15 = false;
        z15 = false;
        boolean z16 = true;
        int i14 = 2;
        vh.a aVar = this.f141068c;
        if (z14) {
            boolean z17 = !((p4) request).f111754a;
            a1 stickerRenderConfig = new a1((5 & 1) != 0, (5 & 2) != 0, false, (5 & 8) == 0);
            f onLayerActionPerformed = f.f141053i;
            g onLayersReordered = g.f141054j;
            h onLayerChanged = h.f141057i;
            g onSaveBegin = g.f141055k;
            t80.r onSuccess = new t80.r(i13, eventIntake, this);
            p70.a onError = new p70.a(eventIntake, i14);
            aVar.getClass();
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(stickerRenderConfig, "stickerRenderConfig");
            Intrinsics.checkNotNullParameter(onLayerActionPerformed, "onLayerActionPerformed");
            Intrinsics.checkNotNullParameter(onLayersReordered, "onLayersReordered");
            Intrinsics.checkNotNullParameter(onLayerChanged, "onLayerChanged");
            Intrinsics.checkNotNullParameter(onSaveBegin, "onSaveShuffleBegin");
            Intrinsics.checkNotNullParameter(onSuccess, "onSaveShuffleSuccess");
            Intrinsics.checkNotNullParameter(onError, "onSaveShuffleError");
            aVar.f125806h = coroutineScope;
            aVar.f125807i = onLayerChanged;
            aVar.f125808j = onLayersReordered;
            g01.a aVar2 = (g01.a) aVar.f125800b;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(onLayerActionPerformed, "onLayerActionPerformed");
            aVar2.f63225b = onLayerActionPerformed;
            n0 n0Var = (n0) aVar.f125801c;
            n0Var.getClass();
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(stickerRenderConfig, "stickerRenderConfig");
            Intrinsics.checkNotNullParameter(onSaveBegin, "onSaveBegin");
            Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
            Intrinsics.checkNotNullParameter(onError, "onError");
            n0Var.f81675i = coroutineScope;
            n0Var.f81676j = z17;
            n0Var.f81677k = new com.pinterest.shuffles.scene.composer.q(n0Var.f81672f, stickerRenderConfig, n0Var.f81673g, n0Var.f81670d);
            n0Var.f81678l = onSaveBegin;
            n0Var.f81679m = onSuccess;
            n0Var.f81680n = onError;
            l0.J0(l0.Q0(new d0(aVar, null), ((h62.k) aVar.f125799a).f67841c), coroutineScope);
            l0.J0(l0.Q0(new i(eventIntake, null), (r2) aVar.f125804f), coroutineScope);
            l0.J0(l0.Q0(new j(eventIntake, null), (do2.i) aVar.f125805g), coroutineScope);
            return;
        }
        if (request instanceof r4) {
            kotlin.jvm.internal.j.z(coroutineScope, new e(this), null, new k(this, null), 2);
            return;
        }
        boolean z18 = request instanceof a5;
        h62.k kVar = this.f141067b;
        if (z18) {
            fi0 fi0Var = ((a5) request).f111466a;
            if (fi0Var.N() != null) {
                String f39332b = fi0Var.getF39332b();
                int i15 = t1.f106663a;
                if (Intrinsics.d(f39332b, "-1")) {
                    z15 = true;
                }
            }
            try {
                kVar.e(j(fi0Var), z15);
            } catch (IllegalStateException e13) {
                ((tb0.h) this.f141072g).q(e13, "Error trying to initialize Collage composer with draft with remix status: " + z15, tb0.p.COLLAGES);
            }
            String value6 = fi0Var.getF39332b();
            Intrinsics.checkNotNullExpressionValue(value6, "getUid(...)");
            int i16 = t1.f106663a;
            Intrinsics.checkNotNullParameter(value6, "value");
            kVar.i(value6);
            fi0 N = fi0Var.N();
            if (N != null) {
                String parentId = N.getF39332b();
                Intrinsics.checkNotNullExpressionValue(parentId, "getUid(...)");
                Intrinsics.checkNotNullParameter(parentId, "value");
                Intrinsics.checkNotNullParameter(parentId, "parentId");
                do {
                    t2Var5 = kVar.f67840b;
                    value5 = t2Var5.getValue();
                } while (!t2Var5.h(value5, f2.a((f2) value5, null, null, parentId, null, null, 507)));
                return;
            }
            return;
        }
        if (request instanceof o4) {
            l62.w event = ((o4) request).f111738a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            if (Intrinsics.d(event, l62.g.f81638a) || (event instanceof l62.h)) {
                return;
            }
            if (event instanceof l62.m) {
                String str = ((l62.m) event).f81661a;
                return;
            }
            if (event instanceof l62.l) {
                l62.l lVar = (l62.l) event;
                String str2 = lVar.f81652a;
                EnumSet noneOf = EnumSet.noneOf(l62.b0.class);
                ((h62.k) aVar.f125799a).k(str2, true, new c0(lVar.f81653b, noneOf, lVar.f81654c, lVar.f81655d));
                if (noneOf.isEmpty()) {
                    return;
                }
                ((Function2) aVar.f125807i).invoke(new a2(str2), noneOf);
                return;
            }
            if ((event instanceof l62.n) || (event instanceof l62.o)) {
                return;
            }
            if (event instanceof l62.q) {
                aVar.f125809k = Integer.valueOf(((l62.q) event).f81685b);
                return;
            }
            if (event instanceof l62.p) {
                l62.p pVar = (l62.p) event;
                String str3 = pVar.f81682a;
                Integer num = (Integer) aVar.f125809k;
                if (num != null) {
                    ((h62.k) aVar.f125799a).g(str3, num.intValue(), pVar.f81683b, false);
                    return;
                }
                return;
            }
            if (event instanceof l62.r) {
                l62.r rVar = (l62.r) event;
                String str4 = rVar.f81686a;
                Integer num2 = (Integer) aVar.f125809k;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    h62.k kVar2 = (h62.k) aVar.f125799a;
                    int i17 = rVar.f81687b;
                    kVar2.g(str4, intValue, i17, true);
                    if (intValue != i17) {
                        ((Function1) aVar.f125808j).invoke(Integer.valueOf(((h62.k) aVar.f125799a).c()));
                    }
                }
                aVar.f125809k = null;
                return;
            }
            if (event instanceof l62.s) {
                ((g01.a) aVar.f125800b).d(((l62.s) event).f81688a);
                return;
            }
            if (event instanceof l62.j) {
                IndexedValue b13 = ((h62.k) aVar.f125799a).b(((l62.j) event).f81644a);
                if (b13 == null || (z1Var = (z1) b13.f80350b) == null) {
                    return;
                }
                ((g01.a) aVar.f125800b).c(z1Var);
                return;
            }
            if (event instanceof l62.i) {
                ((g01.a) aVar.f125800b).b(((l62.i) event).f81642a);
                return;
            }
            if (event instanceof l62.k) {
                String id3 = ((l62.k) event).f81649a;
                g01.a aVar3 = (g01.a) aVar.f125800b;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(id3, "id");
                h62.k kVar3 = (h62.k) aVar3.f63224a;
                IndexedValue b14 = kVar3.b(id3);
                if (b14 == null) {
                    return;
                }
                ((kl2.l) aVar3.f63225b).invoke(Integer.valueOf(b14.f80349a), Integer.valueOf(kVar3.c()), h0.HIDE);
                kVar3.k(id3, true, f0.f81633k);
                return;
            }
            if (event instanceof l62.t) {
                return;
            }
            if (event instanceof l62.u) {
                Throwable th3 = ((l62.u) event).f81691a;
                return;
            }
            if (event instanceof l62.v) {
                Bitmap bitmap = ((l62.v) event).f81692a;
                y1 y1Var = (y1) aVar.f125803e;
                do {
                    t2Var4 = (t2) y1Var;
                    value4 = t2Var4.getValue();
                } while (!t2Var4.h(value4, l62.a.a((l62.a) value4, null, false, false, null, false, null, 47)));
                n0 n0Var2 = (n0) aVar.f125801c;
                n72.m mVar = n0Var2.f81670d;
                mVar.b("SaveShuffleView: Save shuffle invoked.", n72.l.VERBOSE);
                k2 k2Var = n0Var2.f81674h;
                if (k2Var == null || !k2Var.isActive()) {
                    mVar.b("SaveShuffleView: Save job started.", n72.l.VERBOSE);
                    j0 j0Var = n0Var2.f81675i;
                    if (j0Var == null) {
                        Intrinsics.r("coroutineScope");
                        throw null;
                    }
                    z13 = kotlin.jvm.internal.j.z(j0Var, n0Var2.f81671e.f89707c, null, new l62.l0(n0Var2, bitmap, null), 2);
                    n0Var2.f81674h = z13;
                } else {
                    mVar.d(new IllegalStateException("Save job is already active"), l62.j0.f81645j);
                    z13 = n0Var2.f81674h;
                }
                aVar.f125810l = z13;
                return;
            }
            return;
        }
        if (request instanceof h4) {
            u1 n13 = pe.i.n(((h4) request).f111569a);
            aVar.a(n13, true);
            if (n13.f106676h == null) {
                aVar.c(n13.f106669a);
                return;
            }
            return;
        }
        if (request instanceof t4) {
            t4 t4Var = (t4) request;
            u1 newItem = pe.i.n(t4Var.f111803a);
            aVar.getClass();
            String id4 = t4Var.f111804b;
            Intrinsics.checkNotNullParameter(id4, "id");
            Intrinsics.checkNotNullParameter(newItem, "item");
            h62.k kVar4 = (h62.k) aVar.f125799a;
            kVar4.getClass();
            Intrinsics.checkNotNullParameter(id4, "id");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            IndexedValue b15 = kVar4.b(id4);
            if (b15 != null) {
                kVar4.a(new h62.e(b15.f80349a, (z1) b15.f80350b, newItem), true);
            }
            if (newItem.f106676h == null) {
                aVar.c(newItem.f106669a);
                return;
            }
            return;
        }
        boolean z19 = request instanceof i4;
        Context context = this.f141066a;
        if (z19) {
            i4 i4Var = (i4) request;
            Bitmap bitmap2 = i4Var.f111587a;
            int i18 = a2.f106437b;
            String c03 = gi2.b.c0();
            String k13 = a.a.k("shuffleItemDrawing-", c03, ".png");
            File file = new File(context.getFilesDir(), "captured_photo");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, k13);
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
            try {
                xk2.q qVar = xk2.s.f135225b;
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    boolean compress = bitmap2.compress(compressFormat, 90, fileOutputStream);
                    dl2.b.J(fileOutputStream, null);
                    obj = Boolean.valueOf(compress);
                } finally {
                }
            } catch (Throwable th4) {
                xk2.q qVar2 = xk2.s.f135225b;
                obj = ue.c.m(th4);
            }
            Throwable a13 = xk2.s.a(obj);
            Object obj2 = obj;
            if (a13 != null) {
                obj2 = Boolean.FALSE;
            }
            int i19 = z.f52181a;
            int width = bitmap2.getWidth();
            float height = bitmap2.getHeight();
            int i23 = z.f52181a;
            Size n14 = ig1.b.n1(z.a(width, height, i23, Integer.MAX_VALUE));
            x0 x0Var = x0.f106703e;
            String uri = Uri.fromFile(file2).toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            y0 y0Var = new y0(uri, bitmap2.getWidth(), bitmap2.getHeight(), bitmap2.getWidth());
            String uri2 = Uri.fromFile(file2).toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            u1 f13 = u1.f(u1.f106668t, c03, i4Var.f111589c, i4Var.f111588b, 0.0d, null, x0.a(x0Var, new y0(uri2, n14.getWidth(), n14.getHeight(), i23), y0Var, 6), null, null, null, w1.DRAWING, null, null, null, 261592);
            ko2.f fVar = v0.f20219a;
            kotlin.jvm.internal.j.z(coroutineScope, ho2.q.f69782a, null, new l(this, f13, null), 2);
            return;
        }
        if (request instanceof j4) {
            r72.y1 y1Var2 = r72.y1.f106720g;
            int i24 = a2.f106437b;
            String c04 = gi2.b.c0();
            String str5 = va0.a.f125102a;
            r72.y1 f14 = r72.y1.f(y1Var2, c04, null, 0.0d, 0.0d, null, l2.a(l2.f106537h, null, va0.a.f125102a, null, 30.0f, va0.a.f125103b, va0.a.f125104c, a0.q0(context), 5), 30);
            aVar.a(f14, false);
            eventIntake.a(new s80.w(f14));
            return;
        }
        if (request instanceof z4) {
            h62.k kVar5 = (h62.k) aVar.f125799a;
            kVar5.getClass();
            kVar5.f67845g.m(new h62.j(kVar5, z16 ? 1 : 0));
            kVar5.f67844f = null;
            return;
        }
        if (request instanceof s4) {
            h62.k kVar6 = (h62.k) aVar.f125799a;
            kVar6.getClass();
            h62.j block = new h62.j(kVar6, z15 ? 1 : 0);
            kv0.p pVar2 = kVar6.f67845g;
            pVar2.getClass();
            Intrinsics.checkNotNullParameter(block, "block");
            h62.h hVar2 = (h62.h) ((LinkedList) pVar2.f80996c).poll();
            if (hVar2 != null) {
                block.invoke(hVar2);
                ((LinkedList) pVar2.f80995b).push(hVar2.b());
                pVar2.i();
            }
            kVar6.f67844f = null;
            return;
        }
        if (request instanceof m4) {
            h62.k kVar7 = (h62.k) aVar.f125799a;
            kVar7.f67839a.b("ComposerProject: clear()", n72.l.VERBOSE);
            t2 t2Var6 = kVar7.f67840b;
            List list = ((f2) t2Var6.getValue()).f106470b;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof u1) {
                    arrayList.add(obj3);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                h62.k.f((u1) it.next());
            }
            kv0.p pVar3 = kVar7.f67845g;
            ArrayList l03 = CollectionsKt.l0(CollectionsKt.F0((LinkedList) pVar3.f80996c), CollectionsKt.F0((LinkedList) pVar3.f80995b));
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = l03.iterator();
            while (it2.hasNext()) {
                k0.u(h62.k.d((h62.h) it2.next()), arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (next instanceof u1) {
                    arrayList3.add(next);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                h62.k.f((u1) it4.next());
            }
            t2Var6.i(f2.f106468j);
            ((LinkedList) pVar3.f80995b).clear();
            ((LinkedList) pVar3.f80996c).clear();
            pVar3.i();
            kVar7.f67839a.b("ComposerProject: thumbnail accessed", n72.l.VERBOSE);
            Bitmap bitmap3 = kVar7.f67846h;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
            kVar7.f67846h = null;
            kVar7.f67847i = null;
            kVar7.f67844f = null;
            return;
        }
        if (request instanceof u4) {
            int i25 = t1.f106663a;
            kVar.i("-1");
            eventIntake.a(s80.u.f111807a);
            return;
        }
        if (request instanceof v4) {
            o1 o1Var = (o1) aVar.f125810l;
            if (o1Var == null || !o1Var.isActive()) {
                y1 y1Var3 = (y1) aVar.f125803e;
                do {
                    t2Var3 = (t2) y1Var3;
                    value3 = t2Var3.getValue();
                } while (!t2Var3.h(value3, l62.a.a((l62.a) value3, null, false, false, null, true, null, 47)));
                return;
            }
            return;
        }
        if (request instanceof k4) {
            n0 n0Var3 = (n0) aVar.f125801c;
            k2 k2Var2 = n0Var3.f81674h;
            if (k2Var2 != null) {
                k2Var2.cancel((CancellationException) null);
            }
            n0Var3.f81674h = null;
            n0Var3.f81670d.b("SaveShuffleView: Save job cancelled.", n72.l.VERBOSE);
            return;
        }
        if (request instanceof n4) {
            String id5 = ((n4) request).f111707a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(id5, "id");
            ((h62.k) aVar.f125799a).h(id5, true);
            return;
        }
        if (request instanceof y4) {
            boolean z23 = ((y4) request).f111857a;
            y1 y1Var4 = (y1) aVar.f125803e;
            do {
                t2Var2 = (t2) y1Var4;
                value2 = t2Var2.getValue();
            } while (!t2Var2.h(value2, l62.a.a((l62.a) value2, null, z23, false, null, false, null, 61)));
            return;
        }
        if (request instanceof x4) {
            boolean z24 = ((x4) request).f111847a;
            y1 y1Var5 = (y1) aVar.f125803e;
            do {
                t2Var = (t2) y1Var5;
                value = t2Var.getValue();
            } while (!t2Var.h(value, l62.a.a((l62.a) value, null, false, z24, null, false, null, 59)));
            return;
        }
        if (request instanceof w4) {
            ((h62.k) aVar.f125799a).j(new kw1.c(((w4) request).f111838a, 9));
            return;
        }
        if (request instanceof l4) {
            ClipDescription primaryClipDescription = ((i62.b) ((j62.a) aVar.f125802d)).f71632c.getPrimaryClipDescription();
            if ((primaryClipDescription != null ? primaryClipDescription.filterMimeTypes("image/*") : null) != null) {
                eventIntake.a(s80.r.f111777a);
                return;
            }
            return;
        }
        if (request instanceof q4) {
            j0 j0Var2 = (j0) aVar.f125806h;
            if (j0Var2 == null) {
                Intrinsics.r("coroutineScope");
                throw null;
            }
            kotlin.jvm.internal.j.z(j0Var2, null, null, new g0(aVar, null), 3);
        }
    }

    public final m1 j(fi0 fi0Var) {
        String value = fi0Var.getF39332b();
        Intrinsics.checkNotNullExpressionValue(value, "getUid(...)");
        int i13 = t1.f106663a;
        Intrinsics.checkNotNullParameter(value, "value");
        List M = fi0Var.M();
        if (M == null) {
            M = q0.f80391a;
        }
        b0 b0Var = this.f141070e;
        ArrayList h10 = b0.h(b0Var, M, null, false, 6);
        q1 k13 = this.f141071f.k(fi0Var.G());
        Map H = fi0Var.H();
        b0Var.getClass();
        return new m1(value, Boolean.TRUE, b0.e(H), 0, false, null, null, 0, null, null, "", 0, h10, null, "", Boolean.FALSE, 0, 0, p72.a.f99092w, k13, null, null, null, 0L, null);
    }
}
