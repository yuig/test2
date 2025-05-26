package ads_mobile_sdk;

import a.l0;
import a.zb;
import android.content.Context;
import android.os.SystemClock;
import ao2.j0;
import ao2.m0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class mz0 implements a.d0 {

    /* renamed from: y, reason: collision with root package name */
    public static final a.hf f8432y = new a.hf();

    /* renamed from: a, reason: collision with root package name */
    public final Context f8433a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f8434b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineContext f8435c;

    /* renamed from: d, reason: collision with root package name */
    public final a.n5 f8436d;

    /* renamed from: e, reason: collision with root package name */
    public final a.n5 f8437e;

    /* renamed from: f, reason: collision with root package name */
    public final a.n5 f8438f;

    /* renamed from: g, reason: collision with root package name */
    public final sb2 f8439g;

    /* renamed from: h, reason: collision with root package name */
    public final kp f8440h;

    /* renamed from: i, reason: collision with root package name */
    public final z6 f8441i;

    /* renamed from: j, reason: collision with root package name */
    public final a.j3 f8442j;

    /* renamed from: k, reason: collision with root package name */
    public final yp0 f8443k;

    /* renamed from: l, reason: collision with root package name */
    public final oh0 f8444l;

    /* renamed from: m, reason: collision with root package name */
    public final zb f8445m;

    /* renamed from: n, reason: collision with root package name */
    public final a.n5 f8446n;

    /* renamed from: o, reason: collision with root package name */
    public final x f8447o;

    /* renamed from: p, reason: collision with root package name */
    public final p82 f8448p;

    /* renamed from: q, reason: collision with root package name */
    public final a.n5 f8449q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f8450r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f8451s;

    /* renamed from: t, reason: collision with root package name */
    public xy0 f8452t;

    /* renamed from: u, reason: collision with root package name */
    public final ao2.x f8453u;

    /* renamed from: v, reason: collision with root package name */
    public long f8454v;

    /* renamed from: w, reason: collision with root package name */
    public long f8455w;

    /* renamed from: x, reason: collision with root package name */
    public vy0 f8456x;

    public mz0(Context context, j0 backgroundScope, CoroutineContext backgroundContext, a.n5 initializationTasks, a.n5 dependencyInjectors, a.n5 postInitializationTasks, sb2 rootTraceCreator, kp concurrencyObjects, z6 adapterInitializer, a.j3 traceLogger, yp0 httpClient, oh0 flags, zb clock, a.n5 debugDialogManager, x activityTracker, p82 requestConfigurationWrapper, a.n5 inspectorManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(backgroundContext, "backgroundContext");
        Intrinsics.checkNotNullParameter(initializationTasks, "initializationTasks");
        Intrinsics.checkNotNullParameter(dependencyInjectors, "dependencyInjectors");
        Intrinsics.checkNotNullParameter(postInitializationTasks, "postInitializationTasks");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        Intrinsics.checkNotNullParameter(adapterInitializer, "adapterInitializer");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(debugDialogManager, "debugDialogManager");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        this.f8433a = context;
        this.f8434b = backgroundScope;
        this.f8435c = backgroundContext;
        this.f8436d = initializationTasks;
        this.f8437e = dependencyInjectors;
        this.f8438f = postInitializationTasks;
        this.f8439g = rootTraceCreator;
        this.f8440h = concurrencyObjects;
        this.f8441i = adapterInitializer;
        this.f8442j = traceLogger;
        this.f8443k = httpClient;
        this.f8444l = flags;
        this.f8445m = clock;
        this.f8446n = debugDialogManager;
        this.f8447o = activityTracker;
        this.f8448p = requestConfigurationWrapper;
        this.f8449q = inspectorManager;
        this.f8450r = new Object();
        this.f8451s = new ArrayList();
        this.f8452t = xy0.f13883a;
        this.f8453u = m0.b();
        zn2.b.f142311b.getClass();
        this.f8454v = 0L;
        this.f8455w = 0L;
        a.hf hfVar = f8432y;
        xi.a aVar = xi.a.NOT_STARTED;
        hfVar.getClass();
        this.f8456x = new vy0(aVar, "", 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(4:(2:3|(11:5|6|7|(1:(1:(1:(1:(1:(9:14|15|(3:39|(3:42|(3:44|45|46)(1:47)|40)|48)(0)|19|(2:22|20)|23|24|33e|32)(2:49|50))(5:51|52|(3:60|(3:63|(1:65)(1:66)|61)|67)|56|(1:58)(11:59|15|(1:17)|39|(1:40)|48|19|(1:20)|23|24|33e)))(22:68|69|70|(1:72)|74|(1:76)(1:119)|77|(2:79|(1:81)(1:82))|83|(1:85)(1:118)|(2:87|(1:89)(1:90))|91|(4:94|(3:100|101|102)(3:96|97|98)|99|92)|103|104|(2:107|105)|108|109|(2:112|110)|113|114|(1:116)(8:117|52|(1:54)|60|(1:61)|67|56|(0)(0))))(24:120|121|122|(1:124)|70|(0)|74|(0)(0)|77|(0)|83|(0)(0)|(0)|91|(1:92)|103|104|(1:105)|108|109|(1:110)|113|114|(0)(0)))(1:125))(1:169)|126|(3:129|(2:131|132)(1:133)|127)|134|135|136|137|(1:139)(23:140|122|(0)|70|(0)|74|(0)(0)|77|(0)|83|(0)(0)|(0)|91|(1:92)|103|104|(1:105)|108|109|(1:110)|113|114|(0)(0))))|136|137|(0)(0))|172|6|7|(0)(0)|126|(1:127)|134|135|(2:(0)|(1:165))) */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x005b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0385, code lost:
    
        r2 = r4;
        r4 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0259 A[LOOP:4: B:105:0x0253->B:107:0x0259, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0281 A[LOOP:5: B:110:0x027b->B:112:0x0281, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0315 A[LOOP:0: B:20:0x030f->B:22:0x0315, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x033f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #3 {all -> 0x005b, blocks: (B:69:0x0056, B:70:0x0119, B:72:0x0128, B:121:0x0066, B:122:0x00e0), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r17) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mz0.a(bl2.c):java.lang.Object");
    }

    public final void b() {
        if (this.f8448p.a().a(this.f8433a)) {
            gk0.b("This RequestConfiguration is configured as a test device.", null);
            return;
        }
        ok.e0 e0Var = gk0.f5596a;
        l0 l0Var = cm0.f3958f;
        gk0.b("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + l0.b(this.f8433a) + "\")) to get test ads on this device.", null);
    }

    public final void c() {
        synchronized (this.f8450r) {
            zn2.a aVar = zn2.b.f142311b;
            this.f8445m.getClass();
            this.f8455w = zn2.b.j(dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS), this.f8454v);
            Unit unit = Unit.f80348a;
        }
        j0 j0Var = this.f8434b;
        iz0 block = new iz0(this, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    public final yy0 a() {
        long e13;
        Set<Map.Entry> entrySet = this.f8441i.a().entrySet();
        int a13 = kotlin.collections.y0.a(g0.q(entrySet, 10));
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put((String) entry.getKey(), (xi.b) ((Pair) entry.getValue()).f80346a);
        }
        LinkedHashMap r13 = kotlin.collections.z0.r(linkedHashMap);
        synchronized (this.f8450r) {
            r13.put("com.google.android.libraries.ads.mobile.sdk.MobileAds", this.f8456x);
            Unit unit = Unit.f80348a;
        }
        synchronized (this.f8450r) {
            e13 = zn2.b.e(this.f8455w);
        }
        return new yy0((int) e13, r13);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0165 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:19:0x003b, B:20:0x015f, B:22:0x0165), top: B:18:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017d A[Catch: all -> 0x018d, TryCatch #7 {all -> 0x018d, blocks: (B:30:0x0176, B:32:0x017d, B:34:0x0184, B:36:0x0188, B:38:0x018c, B:39:0x018f, B:40:0x0194, B:41:0x0195, B:42:0x019c, B:43:0x019d, B:44:0x01a4, B:45:0x01a5), top: B:29:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a5 A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #7 {all -> 0x018d, blocks: (B:30:0x0176, B:32:0x017d, B:34:0x0184, B:36:0x0188, B:38:0x018c, B:39:0x018f, B:40:0x0194, B:41:0x0195, B:42:0x019c, B:43:0x019d, B:44:0x01a4, B:45:0x01a5), top: B:29:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #6 {all -> 0x004c, blocks: (B:56:0x0047, B:57:0x00ff, B:59:0x0105), top: B:55:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011e A[Catch: all -> 0x012e, TryCatch #8 {all -> 0x012e, blocks: (B:65:0x0117, B:67:0x011e, B:69:0x0125, B:71:0x0129, B:73:0x012d, B:74:0x0130, B:75:0x0135, B:76:0x0136, B:77:0x013d, B:78:0x013e, B:79:0x0145, B:80:0x0146), top: B:64:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0146 A[Catch: all -> 0x012e, TRY_LEAVE, TryCatch #8 {all -> 0x012e, blocks: (B:65:0x0117, B:67:0x011e, B:69:0x0125, B:71:0x0129, B:73:0x012d, B:74:0x0130, B:75:0x0135, B:76:0x0136, B:77:0x013d, B:78:0x013e, B:79:0x0145, B:80:0x0146), top: B:64:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(xi.d r13, bl2.c r14) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mz0.a(xi.d, bl2.c):java.lang.Object");
    }

    public final void a(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        j0 j0Var = this.f8434b;
        lz0 block2 = new lz0(this, block, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block2, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block2, null), 2);
    }
}
