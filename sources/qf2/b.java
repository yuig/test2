package qf2;

import io.embrace.android.embracesdk.internal.anr.ndk.NativeThreadSamplerNdkDelegate;
import io.embrace.android.embracesdk.internal.config.remote.AnrRemoteConfig;
import io.embrace.android.embracesdk.internal.payload.NativeThreadAnrSample;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nf2.n;
import th2.j;
import xk2.k;
import xk2.v;

/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final sg2.a f103784a;

    /* renamed from: b, reason: collision with root package name */
    public final k f103785b;

    /* renamed from: c, reason: collision with root package name */
    public final Random f103786c;

    /* renamed from: d, reason: collision with root package name */
    public final NativeThreadSamplerNdkDelegate f103787d;

    /* renamed from: e, reason: collision with root package name */
    public final ki2.a f103788e;

    /* renamed from: f, reason: collision with root package name */
    public final nf2.b f103789f;

    /* renamed from: g, reason: collision with root package name */
    public final n f103790g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f103791h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f103792i;

    /* renamed from: j, reason: collision with root package name */
    public int f103793j;

    /* renamed from: k, reason: collision with root package name */
    public int f103794k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f103795l;

    /* renamed from: m, reason: collision with root package name */
    public Thread f103796m;

    public b(sg2.a configService, v symbols, ki2.a worker, nf2.b deviceArchitecture, n sharedObjectLoader) {
        Random random = new Random();
        NativeThreadSamplerNdkDelegate delegate = new NativeThreadSamplerNdkDelegate();
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(deviceArchitecture, "deviceArchitecture");
        Intrinsics.checkNotNullParameter(sharedObjectLoader, "sharedObjectLoader");
        this.f103784a = configService;
        this.f103785b = symbols;
        this.f103786c = random;
        this.f103787d = delegate;
        this.f103788e = worker;
        this.f103789f = deviceArchitecture;
        this.f103790g = sharedObjectLoader;
        this.f103791h = true;
        this.f103793j = -1;
        this.f103794k = -1;
        this.f103795l = new ArrayList();
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread()");
        this.f103796m = currentThread;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // of2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Thread r17, long r18) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.b.a(java.lang.Thread, long):void");
    }

    public final void b() {
        List<NativeThreadAnrSample> finishSampling;
        List list;
        j jVar = (j) CollectionsKt.d0(this.f103795l);
        if (jVar == null || (finishSampling = this.f103787d.finishSampling()) == null || (list = jVar.f117675f) == null) {
            return;
        }
        list.clear();
        list.addAll(finishSampling);
    }

    @Override // yh2.b
    public final void c() {
        this.f103795l = new ArrayList();
    }

    @Override // of2.e
    public final void g(Thread thread, long j13) {
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(thread, "thread");
        sg2.b bVar = (sg2.b) this.f103784a;
        AnrRemoteConfig anrRemoteConfig = bVar.f112881f.f117594c;
        if (this.f103793j < ((anrRemoteConfig == null || (num2 = anrRemoteConfig.f72972c) == null) ? 80 : num2.intValue()) && !this.f103791h && bVar.f112881f.d()) {
            if (this.f103793j % this.f103794k == 0) {
                this.f103793j = 0;
                if (!this.f103792i) {
                    this.f103792i = true;
                    tg2.a aVar = bVar.f112881f;
                    ug2.a a13 = aVar.a();
                    long b13 = aVar.b();
                    AnrRemoteConfig anrRemoteConfig2 = aVar.f117594c;
                    long intValue = b13 * ((anrRemoteConfig2 == null || (num = anrRemoteConfig2.f72976g) == null) ? 5 : num.intValue());
                    this.f103787d.startSampling(a13.getCode(), intValue);
                    this.f103788e.a(new a(this, 1), intValue * 10, TimeUnit.MILLISECONDS);
                }
            }
            this.f103793j++;
        }
    }

    @Override // of2.e
    public final void h(Thread thread, long j13) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        if (this.f103792i) {
            this.f103788e.b(new a(this, 0));
        }
        this.f103791h = true;
        this.f103792i = false;
    }
}
