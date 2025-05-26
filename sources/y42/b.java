package y42;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.pinterest.service.PinUploaderService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.b0;
import nx.d0;
import pq2.c1;
import so.d9;
import so.oa;
import ye2.l;

/* loaded from: classes4.dex */
public abstract class b extends Service implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f137703a;

    /* renamed from: c, reason: collision with root package name */
    public volatile l f137705c;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f137704b = new AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public final Object f137706d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f137707e = false;

    @Override // af2.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l componentManager() {
        if (this.f137705c == null) {
            synchronized (this.f137706d) {
                try {
                    if (this.f137705c == null) {
                        this.f137705c = new l(this);
                    }
                } finally {
                }
            }
        }
        return this.f137705c;
    }

    public final void b() {
        PinUploaderService pinUploaderService = (PinUploaderService) this;
        Runnable[] runnableArr = new Runnable[1];
        d0 d0Var = pinUploaderService.f51768f;
        if (d0Var == null) {
            Intrinsics.r("pinalytics");
            throw null;
        }
        w wVar = pinUploaderService.f51771i;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        f fVar = pinUploaderService.f51769g;
        if (fVar == null) {
            Intrinsics.r("pinUploadHelper");
            throw null;
        }
        t20.a aVar = pinUploaderService.f51770h;
        if (aVar == null) {
            Intrinsics.r("pinUploadService");
            throw null;
        }
        n20.a aVar2 = pinUploaderService.f51774l;
        if (aVar2 == null) {
            Intrinsics.r("logApi");
            throw null;
        }
        tz1.a aVar3 = pinUploaderService.f51772j;
        if (aVar3 == null) {
            Intrinsics.r("localNotificationHelper");
            throw null;
        }
        b0 b0Var = pinUploaderService.f51773k;
        if (b0Var == null) {
            Intrinsics.r("pinAuxHelper");
            throw null;
        }
        g gVar = new g(pinUploaderService, d0Var, wVar, fVar, aVar, aVar2, aVar3, b0Var);
        gVar.f137727j = g.a();
        runnableArr[0] = new Thread(new s81.g(gVar, 16));
        this.f137704b.set(1);
        new dp.b(runnableArr[0]).b();
    }

    @Override // android.app.Service
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onDestroy() {
        this.f137703a = false;
        this.f137704b.get();
        super.onDestroy();
        int i13 = at1.d.f20439o;
        nl.b.e();
        Intrinsics.checkNotNullParameter(this, "object");
    }

    public final int d(Intent intent, int i13, int i14) {
        if (this.f137703a) {
            return 2;
        }
        this.f137703a = true;
        return 2;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.Service
    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.f137707e) {
            this.f137707e = true;
            PinUploaderService pinUploaderService = (PinUploaderService) this;
            d9 d9Var = (d9) ((h) generatedComponent());
            oa oaVar = d9Var.f113387a;
            pinUploaderService.f51768f = (d0) oaVar.f113817n2.get();
            pinUploaderService.f51769g = (f) oaVar.P8.get();
            pinUploaderService.f51770h = (t20.a) d9Var.f113389c.get();
            pinUploaderService.f51771i = (w) oaVar.f113885r0.get();
            pinUploaderService.f51772j = oa.f1(oaVar);
            pinUploaderService.f51773k = (b0) oaVar.R8.get();
            c1 c1Var = (c1) oaVar.f113623c2.get();
            pinUploaderService.f51774l = a02.e.L2(a02.e.M2((rz.c) oaVar.f114011y1.get(), a02.e.y3(a02.e.s3(), new p00.d()), c1Var, oaVar.J2()));
        }
        b();
    }

    @Override // android.app.Service
    public final /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i13, int i14) {
        d(intent, i13, i14);
        return 2;
    }
}
