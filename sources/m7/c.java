package m7;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import com.pinterest.api.model.vh;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements he.h, ae.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86114a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f86115b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f86116c;

    /* renamed from: d, reason: collision with root package name */
    public Object f86117d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f86118e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(kd.d dVar, kd.c cVar, int i13) {
        this(dVar, cVar);
        this.f86114a = 4;
    }

    public final void a() {
        kd.d.a((kd.d) this.f86118e, this, false);
    }

    public final File b() {
        File file;
        synchronized (((kd.d) this.f86118e)) {
            try {
                Object obj = this.f86116c;
                if (((kd.c) obj).f79197f != this) {
                    throw new IllegalStateException();
                }
                if (!((kd.c) obj).f79196e) {
                    ((boolean[]) this.f86117d)[0] = true;
                }
                file = ((kd.c) obj).f79195d[0];
                ((kd.d) this.f86118e).f79200a.mkdirs();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return file;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0113, code lost:
    
        if (r8.intValue() != 1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0119, code lost:
    
        if (hf0.b.q() == false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(com.pinterest.api.model.vh r8) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.c.c(com.pinterest.api.model.vh):int");
    }

    public final void d() {
        switch (this.f86114a) {
            case 0:
                if (this.f86115b) {
                    final int i13 = 1;
                    ((d7.i0) ((d7.o) this.f86118e)).d(new Runnable(this) { // from class: m7.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ c f86070b;

                        {
                            this.f86070b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i14 = i13;
                            c cVar = this.f86070b;
                            switch (i14) {
                                case 0:
                                    ((Context) cVar.f86116c).registerReceiver((b) cVar.f86117d, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                                    break;
                                default:
                                    ((Context) cVar.f86116c).unregisterReceiver((b) cVar.f86117d);
                                    break;
                            }
                        }
                    });
                    this.f86115b = false;
                    break;
                }
                break;
            default:
                this.f86115b = false;
                break;
        }
    }

    public final void e(dl1.s sVar) {
        String str = "DynamicGridViewBinderDelegate No view type for " + (sVar != null ? sVar.getClass() : "null");
        vh vhVar = sVar instanceof vh ? (vh) sVar : null;
        if (vhVar != null) {
            List list = vhVar.f42865w;
            Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
            dl1.s sVar2 = (dl1.s) CollectionsKt.firstOrNull(list);
            Object obj = sVar2 != null ? sVar2.getClass() : "null";
            StringBuilder w13 = a.a.w("DynamicGridViewBinderDelegate No view type for DynamicStory id:", vhVar.getId(), " storyType:", vhVar.q(), " containedModel:");
            w13.append(obj);
            str = w13.toString();
        }
        if (!this.f86115b) {
            ((m60.d) ((m60.e) this.f86116c)).g();
            this.f86115b = true;
        }
        ((tb0.h) this.f86118e).i(str, Thread.currentThread().getStackTrace());
    }

    public final void f(int i13, zm2.i iVar) {
        while (true) {
            Map.Entry entry = (Map.Entry) this.f86117d;
            if (entry == null || ((zm2.r) entry.getKey()).f142247b >= i13) {
                return;
            }
            zm2.r rVar = (zm2.r) ((Map.Entry) this.f86117d).getKey();
            int i14 = 0;
            if (this.f86115b && rVar.f142248c.getJavaType() == zm2.r0.MESSAGE && !rVar.f142249d) {
                zm2.c cVar = (zm2.c) ((Map.Entry) this.f86117d).getValue();
                iVar.X(1, 3);
                iVar.X(2, 0);
                iVar.P(rVar.f142247b);
                iVar.I(3, cVar);
                iVar.X(1, 4);
            } else {
                Object value = ((Map.Entry) this.f86117d).getValue();
                zm2.m mVar = zm2.m.f142237d;
                zm2.q0 q0Var = rVar.f142248c;
                boolean z13 = rVar.f142249d;
                int i15 = rVar.f142247b;
                if (z13) {
                    List list = (List) value;
                    if (rVar.f142250e) {
                        iVar.X(i15, 2);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            i14 += zm2.m.c(q0Var, it.next());
                        }
                        iVar.P(i14);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            zm2.m.l(iVar, q0Var, it2.next());
                        }
                    } else {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            zm2.m.k(iVar, q0Var, i15, it3.next());
                        }
                    }
                } else {
                    zm2.m.k(iVar, q0Var, i15, value);
                }
            }
            Iterator it4 = (Iterator) this.f86116c;
            if (it4.hasNext()) {
                this.f86117d = (Map.Entry) it4.next();
            } else {
                this.f86117d = null;
            }
        }
    }

    @Override // he.h
    public final Object get() {
        if (this.f86115b) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection(tb.f.k0("Glide registry"));
        this.f86115b = true;
        try {
            return bf.b.y((com.bumptech.glide.b) this.f86116c, (List) this.f86117d, (kh2.w) this.f86118e);
        } finally {
            this.f86115b = false;
            Trace.endSection();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(zm2.q qVar) {
        this(qVar, 0);
        this.f86114a = 7;
    }

    public c(m60.e applicationInfoProvider, i92.k toastUtils, tb0.h crashReporting) {
        this.f86114a = 6;
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f86116c = applicationInfoProvider;
        this.f86117d = toastUtils;
        this.f86118e = crashReporting;
    }

    public c() {
        this.f86114a = 2;
        this.f86115b = false;
        this.f86116c = new g1.h();
        this.f86117d = new HashMap();
        this.f86118e = new com.airbnb.lottie.c0();
    }

    public c(Context context, Looper looper, Looper looper2, i0 i0Var, d7.e eVar) {
        this.f86114a = 0;
        this.f86116c = context.getApplicationContext();
        d7.g0 g0Var = (d7.g0) eVar;
        this.f86118e = g0Var.a(looper, null);
        this.f86117d = new b(this, g0Var.a(looper2, null), i0Var);
    }

    public c(com.bumptech.glide.b bVar, ArrayList arrayList, kh2.w wVar) {
        this.f86114a = 3;
        this.f86116c = bVar;
        this.f86117d = arrayList;
        this.f86118e = wVar;
    }

    public c(ih.g gVar, ae.o oVar) {
        this.f86114a = 5;
        this.f86118e = new rb.h(this, 1);
        this.f86117d = gVar;
        this.f86116c = oVar;
    }

    public c(zm2.q qVar, int i13) {
        Iterator it;
        this.f86114a = 7;
        this.f86118e = qVar;
        zm2.m mVar = qVar.f142245a;
        boolean z13 = mVar.f142240c;
        zm2.e0 e0Var = mVar.f142238a;
        if (z13) {
            it = new androidx.datastore.preferences.protobuf.l0(((g1.a) e0Var.entrySet()).iterator(), 4);
        } else {
            it = ((g1.a) e0Var.entrySet()).iterator();
        }
        this.f86116c = it;
        if (it.hasNext()) {
            this.f86117d = (Map.Entry) it.next();
        }
        this.f86115b = false;
    }

    public c(kd.d dVar, kd.c cVar) {
        this.f86114a = 4;
        this.f86118e = dVar;
        this.f86116c = cVar;
        this.f86117d = cVar.f79196e ? null : new boolean[dVar.f79206g];
    }

    public c(Context context, k8.q qVar) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        this.f86114a = 1;
        AudioManager s13 = context == null ? null : b7.c.s(context);
        if (s13 != null) {
            context.getClass();
            if (!d7.n0.U(context)) {
                spatializer = s13.getSpatializer();
                this.f86116c = spatializer;
                immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
                this.f86115b = immersiveAudioLevel != 0;
                k8.l lVar = new k8.l(qVar);
                this.f86118e = lVar;
                Looper myLooper = Looper.myLooper();
                bf.b.w(myLooper);
                Handler handler = new Handler(myLooper);
                this.f86117d = handler;
                spatializer.addOnSpatializerStateChangedListener(new d7.w(handler, 1), lVar);
                return;
            }
        }
        this.f86116c = null;
        this.f86115b = false;
        this.f86117d = null;
        this.f86118e = null;
    }
}
