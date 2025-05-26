package a;

import ads_mobile_sdk.g12;
import ads_mobile_sdk.jf2;
import ads_mobile_sdk.o51;
import ads_mobile_sdk.xp0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Range;
import android.view.Surface;
import android.view.View;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.pinterest.activity.user.UserSetImageActivity;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.pq;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;

/* loaded from: classes2.dex */
public final /* synthetic */ class o3 implements n4, r4.j, c0.o1, d7.r, ue.h, df.z0, uj2.s, uj2.e0, uj2.e, OnCompleteListener, g0.a, qa2.d0 {

    /* renamed from: a */
    public final /* synthetic */ int f129a;

    /* renamed from: b */
    public final /* synthetic */ Object f130b;

    /* renamed from: c */
    public final /* synthetic */ Object f131c;

    public /* synthetic */ o3(int i13, Object obj, Object obj2) {
        this.f129a = i13;
        this.f130b = obj;
        this.f131c = obj2;
    }

    @Override // r4.j
    public Object C(r4.i completer) {
        int i13 = 1;
        int i14 = 2;
        switch (this.f129a) {
            case 1:
                return ads_mobile_sdk.jd.a((Context) this.f130b, (ads_mobile_sdk.i4) this.f131c, completer);
            case 2:
                return ((xp0) this.f130b).a((Request) this.f131c, completer);
            case 3:
                v.s0 s0Var = (v.s0) this.f130b;
                v.c1 c1Var = (v.c1) this.f131c;
                int i15 = v.s0.f123649l;
                s0Var.getClass();
                c1Var.b(new v.l(s0Var, completer));
                return "submitStillCapture";
            case 4:
                v.z0 z0Var = (v.z0) this.f130b;
                AtomicReference atomicReference = (AtomicReference) this.f131c;
                int i16 = v.z0.f123750g;
                z0Var.getClass();
                l3.c.H0().execute(new a4(z0Var, atomicReference, completer, i14));
                return "OnScreenFlashStart";
            case 5:
                v.d3 d3Var = (v.d3) this.f130b;
                ((Executor) d3Var.f123428d).execute(new a4(d3Var, completer, (c0.t1) this.f131c, 3));
                return "setLinearZoom";
            case 6:
            case 9:
            default:
                ao2.p0 this_asListenableFuture = (ao2.p0) this.f130b;
                Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
                Intrinsics.checkNotNullParameter(completer, "completer");
                this_asListenableFuture.invokeOnCompletion(new ba.s(i14, completer, this_asListenableFuture));
                return this.f131c;
            case 7:
                c0.w wVar = (c0.w) this.f130b;
                Context context = (Context) this.f131c;
                Object obj = c0.w.f24357m;
                wVar.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Executor executor = wVar.f24362d;
                executor.execute(new c0.u(wVar, context, executor, 1, completer, elapsedRealtime));
                return "CameraX initInternal";
            case 8:
                c0.p1 p1Var = (c0.p1) this.f130b;
                AtomicReference atomicReference2 = (AtomicReference) this.f131c;
                Range range = c0.p1.f24298p;
                p1Var.getClass();
                atomicReference2.set(completer);
                return "SurfaceRequest-surface-recreation(" + p1Var.hashCode() + ")";
            case 10:
                androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) this.f130b;
                l0.k kVar = (l0.k) this.f131c;
                ((Executor) dVar.f15966b).execute(new a4(dVar, kVar, completer, 8));
                return "InternalImageProcessor#process " + kVar.hashCode();
            case 11:
                q0.f this$0 = (q0.f) this.f130b;
                c0.w cameraX = (c0.w) this.f131c;
                q0.f fVar = q0.f.f101757h;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(cameraX, "$cameraX");
                Intrinsics.checkNotNullParameter(completer, "completer");
                synchronized (this$0.f101758a) {
                    g0.d a13 = g0.d.a(this$0.f101760c);
                    z0 z0Var2 = new z0(new q0.e(cameraX, 0), 1);
                    f0.d s13 = l3.c.s();
                    a13.getClass();
                    g0.b j13 = g0.m.j(a13, z0Var2, s13);
                    Intrinsics.checkNotNullExpressionValue(j13, "cameraX = CameraX(contex…                        )");
                    g0.m.a(j13, new c0.m1(completer, cameraX, 6), l3.c.s());
                    Unit unit = Unit.f80348a;
                }
                return "ProcessCameraProvider-initializeCameraX";
            case 12:
                r0.v0 v0Var = (r0.v0) this.f130b;
                androidx.camera.core.impl.i2 i2Var = (androidx.camera.core.impl.i2) this.f131c;
                r0.t0 t0Var = r0.v0.C;
                v0Var.getClass();
                ((androidx.camera.core.impl.s1) i2Var.f16863b.f123390g).f16977a.put("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(completer.hashCode()));
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                r0.q0 q0Var = new r0.q0(atomicBoolean, completer, i2Var);
                completer.a(new a4(atomicBoolean, i2Var, q0Var, 13), l3.c.s());
                i2Var.f16863b.b(q0Var);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(completer.hashCode()));
            case 13:
                b1.v vVar = (b1.v) this.f130b;
                Surface surface = (Surface) this.f131c;
                vVar.getClass();
                kh2.m0.p("TextureViewImpl", "Surface set on Preview.");
                vVar.f20835h.b(surface, l3.c.s(), new b1.r(completer, i13));
                return "provideSurface[request=" + vVar.f20835h + " surface=" + surface + "]";
        }
    }

    @Override // ue.h
    public void a(File file) {
        ve.e slave = (ve.e) this.f130b;
        ve.b bVar = (ve.b) this.f131c;
        Intrinsics.checkNotNullParameter(slave, "$slave");
        Intrinsics.checkNotNullParameter(file, "file");
        slave.f125668g = bVar;
        slave.f125667f = file;
        Runnable runnable = slave.f125669h;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    @Override // g0.a
    public com.google.common.util.concurrent.c0 apply(Object obj) {
        int i13 = this.f129a;
        Object obj2 = this.f131c;
        Object obj3 = this.f130b;
        switch (i13) {
            case 0:
                v.t1 t1Var = (v.t1) obj3;
                t1Var.a();
                ((androidx.camera.core.impl.z0) obj2).a();
                return t1Var.k();
            case 1:
                v.z0 z0Var = (v.z0) obj3;
                int i14 = v.z0.f123750g;
                z0Var.getClass();
                return com.bumptech.glide.d.L(new g0.i(TimeUnit.SECONDS.toMillis(3L), (com.google.common.util.concurrent.c0) obj2, z0Var.f123753c));
            case 2:
                v.v2 v2Var = (v.v2) obj3;
                List list = (List) obj2;
                List list2 = (List) obj;
                v2Var.getClass();
                kh2.m0.p("SyncCaptureSessionBase", "[" + v2Var + "] getSurface done with results: " + list2);
                return list2.isEmpty() ? new g0.n(new IllegalArgumentException("Unable to open capture session without surfaces")) : list2.contains(null) ? new g0.n(new DeferrableSurface$SurfaceClosedException((androidx.camera.core.impl.z0) list.get(list2.indexOf(null)), "Surface closed")) : g0.m.e(list2);
            default:
                p0.i iVar = (p0.i) obj3;
                List list3 = (List) obj2;
                iVar.getClass();
                Integer num = (Integer) ((androidx.camera.core.impl.s0) list3.get(0)).f16968b.j(androidx.camera.core.impl.s0.f16965j, 100);
                Objects.requireNonNull(num);
                int intValue = num.intValue();
                Integer num2 = (Integer) ((androidx.camera.core.impl.s0) list3.get(0)).f16968b.j(androidx.camera.core.impl.s0.f16964i, 0);
                Objects.requireNonNull(num2);
                int intValue2 = num2.intValue();
                m.h hVar = ((p0.d) iVar.f98343c.f196b).f98314s;
                return hVar != null ? ((l0.u) hVar.f85197b).c(intValue, intValue2) : new g0.n(new Exception("Failed to take picture: pipeline is not ready."));
        }
    }

    @Override // df.z0
    public void b(Bundle result) {
        GetTokenLoginMethodHandler this$0 = (GetTokenLoginMethodHandler) this.f130b;
        LoginClient.Request request = (LoginClient.Request) this.f131c;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        this$0.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        com.facebook.login.h hVar = this$0.f29949c;
        if (hVar != null) {
            hVar.f54704c = null;
        }
        this$0.f29949c = null;
        com.facebook.login.p pVar = this$0.e().f29958e;
        if (pVar != null) {
            View view = pVar.f30029a.f30035e;
            if (view == null) {
                Intrinsics.r("progressBar");
                throw null;
            }
            view.setVisibility(8);
        }
        if (result != null) {
            List stringArrayList = result.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = kotlin.collections.q0.f80391a;
            }
            Set<String> set = request.f29967b;
            if (set == null) {
                set = kotlin.collections.s0.f80394a;
            }
            String string = result.getString("com.facebook.platform.extra.ID_TOKEN");
            if (set.contains("openid") && (string == null || string.length() == 0)) {
                this$0.e().k();
                return;
            }
            if (stringArrayList.containsAll(set)) {
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(result, "result");
                String string2 = result.getString("com.facebook.platform.extra.USER_ID");
                if (string2 != null && string2.length() != 0) {
                    this$0.m(result, request);
                    return;
                }
                com.facebook.login.p pVar2 = this$0.e().f29958e;
                if (pVar2 != null) {
                    View view2 = pVar2.f30029a.f30035e;
                    if (view2 == null) {
                        Intrinsics.r("progressBar");
                        throw null;
                    }
                    view2.setVisibility(0);
                }
                String string3 = result.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                if (string3 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                df.j1.m0(new com.facebook.login.i(result, this$0, request), string3);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                this$0.a(TextUtils.join(",", hashSet), "new_permissions");
            }
            Intrinsics.checkNotNullParameter(hashSet, "<set-?>");
            request.f29967b = hashSet;
        }
        this$0.e().k();
    }

    public Object c(o51 o51Var) {
        return ((g12) this.f130b).a((i5) this.f131c, o51Var);
    }

    public void d() {
        df.c0 c0Var = (df.c0) this.f130b;
        String appId = (String) this.f131c;
        pe.d dVar = pe.d.f99893a;
        if (p001if.a.b(pe.d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(appId, "$appId");
            boolean z13 = false;
            boolean z14 = c0Var != null && c0Var.f54733j;
            le.v vVar = le.v.f83104a;
            le.o0 o0Var = le.o0.f83080a;
            if (!p001if.a.b(le.o0.class)) {
                try {
                    le.o0.f83080a.d();
                    z13 = le.o0.f83087h.b();
                } catch (Throwable th3) {
                    p001if.a.a(le.o0.class, th3);
                }
            }
            if (z14 && z13) {
                pe.d dVar2 = pe.d.f99893a;
                if (p001if.a.b(dVar2)) {
                    return;
                }
                try {
                    if (pe.d.f99900h) {
                        return;
                    }
                    pe.d.f99900h = true;
                    le.v.d().execute(new com.airbnb.lottie.k(appId, 8));
                } catch (Throwable th4) {
                    p001if.a.a(dVar2, th4);
                }
            }
        } catch (Throwable th5) {
            p001if.a.a(pe.d.class, th5);
        }
    }

    @Override // uj2.e0
    public void g(kk2.a emitter) {
        s60.d this$0 = (s60.d) this.f130b;
        String userId = (String) this.f131c;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(userId, "$userId");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this$0.f111225b.P(userId).F(new dv.a(28, new mz.c(emitter, 9)), new dv.a(29, new hs.a(25, emitter, userId)), ck2.i.f27923c, ck2.i.f27924d);
    }

    @Override // c0.o1
    public void i(c0.k kVar) {
        l0.i iVar = (l0.i) this.f130b;
        c0.p1 p1Var = (c0.p1) this.f131c;
        iVar.getClass();
        n0.g gVar = n0.g.DEFAULT;
        if (p1Var.f24301c.a() && kVar.f24274d) {
            gVar = n0.g.YUV;
        }
        l0.l lVar = iVar.f81221a;
        n0.j.d(lVar.f81237a, true);
        n0.j.c(lVar.f81239c);
        if (lVar.f81248l != gVar) {
            lVar.f81248l = gVar;
            lVar.k(lVar.f81249m);
        }
    }

    @Override // d7.r
    /* renamed from: invoke */
    public void mo0invoke(Object obj) {
        int i13 = this.f129a;
        Object obj2 = this.f131c;
        Object obj3 = this.f130b;
        switch (i13) {
            case 14:
                ((n7.c) obj).c((n7.b) obj3, (a7.p0) obj2);
                break;
            case 15:
                ((n7.c) obj).getClass();
                break;
            case 16:
                ((n7.c) obj).getClass();
                break;
            case 17:
                ((n7.c) obj).r((n7.b) obj3, (a7.n0) obj2);
                break;
            case 18:
                ((n7.c) obj).getClass();
                break;
            case 19:
                ((n7.c) obj).getClass();
                break;
            case 20:
                ((n7.c) obj).getClass();
                break;
            default:
                ((n7.c) obj).y((n7.b) obj3, (g8.a0) obj2);
                break;
        }
    }

    @Override // uj2.e
    public void n(fk2.f emitter) {
        com.pinterest.feature.ideaPinCreation.closeup.view.f0 pageView = (com.pinterest.feature.ideaPinCreation.closeup.view.f0) this.f130b;
        pq overlayBlock = (pq) this.f131c;
        Intrinsics.checkNotNullParameter(pageView, "$pageView");
        Intrinsics.checkNotNullParameter(overlayBlock, "$overlayBlock");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        pageView.s1(overlayBlock, new uv0.d(emitter, 10), new uv0.d(emitter, 11));
    }

    @Override // uj2.s
    public void o(fk2.f emitter) {
        UserSetImageActivity this$0 = (UserSetImageActivity) this.f130b;
        String trackingId = (String) this.f131c;
        int i13 = UserSetImageActivity.f35226j;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(trackingId, "$trackingId");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        xj2.b bVar = this$0.f35227b;
        e12.e eVar = this$0.f35230e;
        if (eVar == null) {
            Intrinsics.r("myUserService");
            throw null;
        }
        int i14 = 0;
        kk2.m mVar = new kk2.m(eVar.h(trackingId).r(tk2.e.f118017c).l(wj2.c.a()), new ep.a(8, new nr.k(this$0, trackingId, i14)), 0);
        bVar.a(new gk2.p2(new gk2.f1(mVar.s(), new ep.a(9, nr.l.f91856j), 1)).o(new ir.h(10, new nr.m(emitter, i14)), new ir.h(11, nr.l.f91857k)));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i13 = this.f129a;
        Object obj = this.f131c;
        Object obj2 = this.f130b;
        switch (i13) {
            case 0:
                ((jf2) obj2).a((TaskCompletionSource) obj, task);
                break;
            default:
                int i14 = com.google.firebase.messaging.g.f33779a;
                ((com.google.firebase.messaging.g) obj2).a((Intent) obj);
                break;
        }
    }

    @Override // qa2.d0
    public void onOpenPinCloseup(f30 it) {
        int i13 = this.f129a;
        Object obj = this.f131c;
        Object obj2 = this.f130b;
        switch (i13) {
            case 0:
                w01.f0 this$0 = (w01.f0) obj2;
                List pinList = (List) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(pinList, "$pinList");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.f127032y.a(it, pinList, null, ((is1.t) this$0.f127020m).a(it));
                break;
            case 1:
                i21.b this$02 = (i21.b) obj2;
                is1.s pinSwipePreferences = (is1.s) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(pinSwipePreferences, "$pinSwipePreferences");
                Intrinsics.checkNotNullParameter(it, "pin");
                List d2 = this$02.d();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : d2) {
                    if (obj3 instanceof h21.b) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h21.b) it2.next()).f66546a);
                }
                this$02.f71432e.a(it, arrayList2, null, ((is1.t) pinSwipePreferences).a(it));
                break;
            case 2:
                me1.a this$03 = (me1.a) obj2;
                kotlin.jvm.internal.j0 pinList2 = (kotlin.jvm.internal.j0) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(pinList2, "$pinList");
                Intrinsics.checkNotNullParameter(it, "it");
                this$03.f87045g.a(it, (List) pinList2.f80434a, this$03.f87039a, ((is1.t) this$03.f87042d).a(it));
                break;
            default:
                we1.h0 this$04 = (we1.h0) obj2;
                String url = (String) obj;
                int i14 = we1.h0.f129376w;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(url, "$url");
                Intrinsics.checkNotNullParameter(it, "it");
                this$04.f129393t.invoke(url, new HashMap());
                break;
        }
    }
}
