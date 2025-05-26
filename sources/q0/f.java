package q0;

import android.content.Context;
import android.os.Trace;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.d0;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.f2;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.h0;
import androidx.camera.core.impl.j;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.p0;
import c0.q;
import c0.s;
import c0.s1;
import c0.w;
import f0.h;
import g0.m;
import g0.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import r4.l;
import sp2.i;
import v.h1;
import v.o;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    public static final f f101757h = new f();

    /* renamed from: a, reason: collision with root package name */
    public final Object f101758a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public l f101759b;

    /* renamed from: c, reason: collision with root package name */
    public final p f101760c;

    /* renamed from: d, reason: collision with root package name */
    public final j f101761d;

    /* renamed from: e, reason: collision with root package name */
    public w f101762e;

    /* renamed from: f, reason: collision with root package name */
    public Context f101763f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f101764g;

    public f() {
        p e13 = m.e(null);
        Intrinsics.checkNotNullExpressionValue(e13, "immediateFuture<Void>(null)");
        this.f101760c = e13;
        this.f101761d = new j(2);
        this.f101764g = new HashMap();
    }

    public static final c0 a(f fVar, s sVar) {
        fVar.getClass();
        Iterator it = sVar.f24332a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "cameraSelector.cameraFilterSet");
            ((q) next).getClass();
            g gVar = q.f24314a;
            if (!Intrinsics.d(gVar, gVar)) {
                synchronized (e1.f16825a) {
                }
                Intrinsics.f(fVar.f101763f);
            }
        }
        return d0.f16820a;
    }

    public static final void b(f fVar, int i13) {
        w wVar = fVar.f101762e;
        if (wVar == null) {
            return;
        }
        o oVar = wVar.f24365g;
        if (oVar == null) {
            throw new IllegalStateException("CameraX not initialized yet.");
        }
        a0.a aVar = oVar.f123579b;
        if (i13 != aVar.f202a) {
            for (p0 p0Var : (List) aVar.f204c) {
                int i14 = aVar.f202a;
                synchronized (p0Var.f16941b) {
                    boolean z13 = true;
                    p0Var.f16942c = i13 == 2 ? 2 : 1;
                    boolean z14 = i14 != 2 && i13 == 2;
                    if (i14 != 2 || i13 == 2) {
                        z13 = false;
                    }
                    if (z14 || z13) {
                        p0Var.b();
                    }
                }
            }
        }
        if (aVar.f202a == 2 && i13 != 2) {
            ((List) aVar.f205d).clear();
        }
        aVar.f202a = i13;
    }

    public final b c(nl1.d lifecycleOwner, s cameraSelector, s1... useCases) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Trace.beginSection(tb.f.k0("CX:bindToLifecycle"));
        try {
            w wVar = this.f101762e;
            if (wVar != null) {
                o oVar = wVar.f24365g;
                if (oVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                if (oVar.f123579b.f202a == 2) {
                    throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
                }
            }
            b(this, 1);
            c0.p0 DEFAULT = c0.p0.f24292f;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return d(lifecycleOwner, cameraSelector, q0.f80391a, (s1[]) Arrays.copyOf(useCases, useCases.length));
        } finally {
            Trace.endSection();
        }
    }

    public final b d(nl1.d lifecycleOwner, s primaryCameraSelector, q0 effects, s1... useCases) {
        b bVar;
        Collection unmodifiableCollection;
        boolean contains;
        c0.p0 secondaryLayoutSettings = c0.p0.f24292f;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(primaryCameraSelector, "primaryCameraSelector");
        Intrinsics.checkNotNullParameter(secondaryLayoutSettings, "primaryLayoutSettings");
        Intrinsics.checkNotNullParameter(secondaryLayoutSettings, "secondaryLayoutSettings");
        Intrinsics.checkNotNullParameter(effects, "effects");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Trace.beginSection(tb.f.k0("CX:bindToLifecycle-internal"));
        try {
            h.s();
            w wVar = this.f101762e;
            Intrinsics.f(wVar);
            j0 c13 = primaryCameraSelector.c(wVar.f24359a.o());
            Intrinsics.checkNotNullExpressionValue(c13, "primaryCameraSelector.se…cameraRepository.cameras)");
            c13.n(true);
            f2 e13 = e(primaryCameraSelector);
            j jVar = this.f101761d;
            h0.a s13 = h0.f.s(e13, null);
            synchronized (jVar.f16875b) {
                bVar = (b) ((Map) jVar.f16876c).get(new a(lifecycleOwner, s13));
            }
            j jVar2 = this.f101761d;
            synchronized (jVar2.f16875b) {
                unmodifiableCollection = Collections.unmodifiableCollection(((Map) jVar2.f16876c).values());
            }
            Iterator it = kotlin.collections.c0.A(useCases).iterator();
            while (it.hasNext()) {
                s1 s1Var = (s1) it.next();
                for (Object lifecycleCameras : unmodifiableCollection) {
                    Intrinsics.checkNotNullExpressionValue(lifecycleCameras, "lifecycleCameras");
                    b bVar2 = (b) lifecycleCameras;
                    synchronized (bVar2.f101747a) {
                        contains = ((ArrayList) bVar2.f101749c.v()).contains(s1Var);
                    }
                    if (contains && !Intrinsics.d(bVar2, bVar)) {
                        String format = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{s1Var}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                        throw new IllegalStateException(format);
                    }
                }
            }
            if (bVar == null) {
                j jVar3 = this.f101761d;
                w wVar2 = this.f101762e;
                Intrinsics.f(wVar2);
                o oVar = wVar2.f24365g;
                if (oVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                a0.a aVar = oVar.f123579b;
                w wVar3 = this.f101762e;
                Intrinsics.f(wVar3);
                i iVar = wVar3.f24366h;
                if (iVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                w wVar4 = this.f101762e;
                Intrinsics.f(wVar4);
                h1 h1Var = wVar4.f24367i;
                if (h1Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                bVar = jVar3.e(lifecycleOwner, new h0.f(c13, null, e13, null, aVar, iVar, h1Var));
            }
            if (useCases.length != 0) {
                j jVar4 = this.f101761d;
                List j13 = f0.j(Arrays.copyOf(useCases, useCases.length));
                w wVar5 = this.f101762e;
                Intrinsics.f(wVar5);
                o oVar2 = wVar5.f24365g;
                if (oVar2 == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                jVar4.a(bVar, effects, j13, oVar2.f123579b);
            }
            return bVar;
        } finally {
            Trace.endSection();
        }
    }

    public final f2 e(s cameraSelector) {
        Object obj;
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Trace.beginSection(tb.f.k0("CX:getCameraInfo"));
        try {
            w wVar = this.f101762e;
            Intrinsics.f(wVar);
            h0 g13 = cameraSelector.c(wVar.f24359a.o()).g();
            Intrinsics.checkNotNullExpressionValue(g13, "cameraSelector.select(mC…meras).cameraInfoInternal");
            c0 a13 = a(this, cameraSelector);
            h0.a aVar = new h0.a(g13.c(), a13.f16812a);
            Intrinsics.checkNotNullExpressionValue(aVar, "create(\n                …ilityId\n                )");
            synchronized (this.f101758a) {
                try {
                    obj = this.f101764g.get(aVar);
                    if (obj == null) {
                        obj = new f2(g13, a13);
                        this.f101764g.put(aVar, obj);
                    }
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return (f2) obj;
        } finally {
            Trace.endSection();
        }
    }
}
