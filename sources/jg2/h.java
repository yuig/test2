package jg2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.logging.Logger;
import kh2.a0;
import kh2.b1;
import kh2.d1;
import kh2.d3;
import kh2.f3;
import kh2.h0;
import kh2.k2;
import kh2.l0;
import kh2.l2;
import kh2.l3;
import kh2.m;
import kh2.m3;
import kh2.o;
import kh2.o0;
import kh2.o2;
import kh2.p2;
import kh2.q;
import kh2.q2;
import kh2.r0;
import kh2.s2;
import kh2.t0;
import kh2.v0;
import kh2.v2;
import kh2.y;
import kh2.y2;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;
import kv0.p;
import ln2.e0;
import pg2.k;
import pn2.b0;
import qg2.j;
import rl2.u;
import sh2.l;
import ul2.c0;
import ul2.c2;
import ul2.u1;

/* loaded from: classes4.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f76126i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f76127j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f76128k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f76129l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i13) {
        super(0);
        this.f76126i = i13;
        this.f76127j = obj;
        this.f76128k = obj2;
        this.f76129l = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        String str2;
        RemoteConfig remoteConfig;
        Boolean bool;
        int i13 = this.f76126i;
        ki2.g gVar = ki2.g.f79812d;
        Object obj = this.f76129l;
        Object obj2 = this.f76128k;
        Object obj3 = this.f76127j;
        int i14 = 1;
        switch (i13) {
            case 0:
                m164invoke();
                return Unit.f80348a;
            case 1:
                k kVar = (k) obj3;
                xk2.k kVar2 = (xk2.k) obj2;
                String str3 = (String) obj;
                try {
                    c0.d.M2("api-request-mapper-init");
                    return new pg2.b(kVar, kVar2, str3);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 2:
                m164invoke();
                return Unit.f80348a;
            case 3:
                m164invoke();
                return Unit.f80348a;
            case 4:
                try {
                    File filesDir = ((Context) obj3).getFilesDir();
                    str2 = ((dh2.f) obj2).dir;
                    File file = new File(filesDir, str2);
                    file.mkdirs();
                    return file;
                } catch (Throwable th3) {
                    ((lh2.e) ((lh2.b) obj)).b(lh2.g.PAYLOAD_STORAGE_FAIL, th3);
                    File cacheDir = ((Context) obj3).getCacheDir();
                    str = ((dh2.f) obj2).dir;
                    File file2 = new File(cacheDir, str);
                    file2.mkdirs();
                    return file2;
                }
            case 5:
                m mVar = (m) obj3;
                if (m.a(mVar, (b1) obj2)) {
                    return null;
                }
                return new vg2.a((wg2.a) mVar.f79612e.a(mVar, m.f79607g[4]), xk2.m.b(new nd2.a(mVar, 24)), ((m3) ((l3) obj)).a(gVar));
            case 6:
                a0 a0Var = (a0) obj3;
                a0Var.getClass();
                u[] uVarArr = a0.f79418i;
                a aVar = (a) a0Var.f79423e.a(a0Var, uVarArr[4]);
                bi2.a aVar2 = (bi2.a) a0Var.f79426h.a(a0Var, uVarArr[7]);
                ii2.d versionChecker = (ii2.d) obj2;
                Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
                return new i(aVar, aVar2, ((ii2.a) versionChecker).a(29) ? new hi2.f(((d1) ((b1) obj)).f79456b) : null);
            case 7:
                tg2.e eVar = ((sg2.b) ((sg2.a) obj3)).f112877b;
                if (!eVar.f117602c.isUiLoadTracingEnabled() || (remoteConfig = eVar.f117601b) == null || (bool = remoteConfig.f73063r) == null || !bool.booleanValue()) {
                    return null;
                }
                return new zf2.i(((s2) ((q2) obj2)).e(), (ii2.d) obj);
            case 8:
                d1 d1Var = (d1) ((b1) obj2);
                return new ng2.b((sg2.a) obj3, d1Var.a(), d1Var.f79456b, new y((t0) obj, 2));
            case 9:
                if (((sg2.b) ((m) ((kh2.k) obj3)).b()).a()) {
                    return null;
                }
                l0 l0Var = (l0) obj2;
                l0Var.getClass();
                u[] uVarArr2 = l0.f79585m;
                dh2.e eVar2 = (dh2.e) l0Var.f79593h.a(l0Var, uVarArr2[6]);
                if (eVar2 == null) {
                    return null;
                }
                ch2.a aVar3 = (ch2.a) l0Var.f79597l.a(l0Var, uVarArr2[10]);
                if (aVar3 == null) {
                    return null;
                }
                dh2.e eVar3 = (dh2.e) l0Var.f79594i.a(l0Var, uVarArr2[7]);
                if (eVar3 == null) {
                    return null;
                }
                d1 d1Var2 = (d1) ((b1) obj);
                return new bh2.b(aVar3, eVar2, eVar3, d1Var2.f79456b, d1Var2.a(), l0.a(l0Var));
            case 10:
                r0 r0Var = (r0) obj2;
                return new vf2.b((si2.d) ((s2) ((q2) obj3)).f79700n.getValue(), r0Var.e(), r0Var.d(), ((d1) ((b1) obj)).f79455a);
            case 11:
                l3 l3Var = (l3) obj3;
                d3 d3Var = (d3) obj2;
                b1 b1Var = (b1) obj;
                try {
                    c0.d.M2("pending-call-sender-init");
                    ki2.a a13 = ((m3) l3Var).a(gVar);
                    f3 f3Var = (f3) d3Var;
                    f3Var.getClass();
                    return new j(a13, (qg2.c) f3Var.f79495c.a(f3Var, f3.f79492d[2]), ((d1) b1Var).f79455a);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 12:
                kh2.a aVar4 = (kh2.a) obj3;
                r0 r0Var2 = (r0) obj2;
                q2 q2Var = (q2) obj;
                try {
                    c0.d.M2("session-properties-init");
                    return new ig2.c(((kh2.c) aVar4).a(), (sg2.a) r0Var2.f79669a.getValue(), ((s2) q2Var).a());
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 13:
                return new uf2.d(new fe2.a(14, (vf2.b) obj3, (b1) obj2), new v0((sg2.a) obj, i14), 12);
            case 14:
                d1 d1Var3 = (d1) ((b1) obj2);
                return new fg2.b(((q) ((o) obj3)).a(), d1Var3.f79455a, ((s2) ((q2) obj)).a(), d1Var3.f79456b);
            case 15:
                r0 r0Var3 = (r0) ((o0) obj3);
                return new mh2.h(r0Var3.b(), ((m) ((kh2.k) obj2)).b(), r0Var3.f(), ((l0) ((h0) obj)).b());
            case 16:
                String markerFilePath = ((f3) ((d3) obj3)).a().b("embrace_crash_marker").getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(markerFilePath, "markerFilePath");
                String str4 = ((bi2.e) ((r0) ((o0) obj2)).d()).f22899g ? "background" : "foreground";
                String x13 = kh2.d.x();
                int i15 = Build.VERSION.SDK_INT;
                ((y2) ((v2) obj)).a().getClass();
                Intrinsics.checkNotNullExpressionValue(TextUtils.join(", ", Build.SUPPORTED_ABIS), "join(\n            \", \",\n….SUPPORTED_ABIS\n        )");
                return new oh2.g(markerFilePath, str4, i15, x13, !StringsKt.E(r2, "64", false));
            case 17:
                o2 o2Var = (o2) obj3;
                kh2.k kVar3 = (kh2.k) obj2;
                k2 k2Var = (k2) obj;
                try {
                    c0.d.M2("native-thread-sampler-installer-init");
                    sg2.a b13 = ((m) kVar3).b();
                    u[] uVarArr3 = o2.f79631e;
                    o2Var.getClass();
                    return ((sg2.b) b13).f112877b.f117602c.isNativeCrashCaptureEnabled() ? new qf2.d(((l2) k2Var).a()) : null;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 18:
                l0 l0Var2 = (l0) ((h0) obj3);
                l0Var2.getClass();
                u[] uVarArr4 = l0.f79585m;
                bh2.a aVar5 = (bh2.a) l0Var2.f79590e.a(l0Var2, uVarArr4[3]);
                dh2.e eVar4 = (dh2.e) l0Var2.f79594i.a(l0Var2, uVarArr4[7]);
                dh2.a aVar6 = (dh2.a) l0Var2.f79595j.a(l0Var2, uVarArr4[8]);
                if (!((Boolean) ((sg2.b) ((m) ((kh2.k) obj2)).b()).f112877b.f117603d.getValue()).booleanValue() || aVar5 == null || eVar4 == null || aVar6 == null) {
                    return null;
                }
                d1 d1Var4 = (d1) ((b1) obj);
                return new wh2.c(aVar5, eVar4, aVar6, d1Var4.f79456b, d1Var4.a());
            case 19:
                l lVar = (l) obj3;
                sh2.j jVar = (sh2.j) obj2;
                zi2.b bVar = (zi2.b) obj;
                try {
                    c0.d.M2("otel-sdk-init");
                    Logger logger = yi2.d.f139176f;
                    dv0.q qVar = new dv0.q(9);
                    Object value = lVar.f112988a.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "<get-sdkTracerProvider>(...)");
                    qVar.f56382c = (nj2.m) value;
                    Logger logger2 = bj2.k.f23003e;
                    ArrayList arrayList = new ArrayList();
                    mj2.a aVar7 = mj2.a.f87281e;
                    bg.b bVar2 = new bg.b(2);
                    p q13 = aj2.h.q();
                    mj2.a aVar8 = jVar.f112977b;
                    Objects.requireNonNull(aVar8, "resource");
                    mj2.a b14 = aVar7.b(aVar8);
                    bj2.c cVar = (bj2.c) jVar.f112984i.getValue();
                    Objects.requireNonNull(cVar, "processor");
                    arrayList.add(cVar);
                    Objects.requireNonNull(bVar, "clock");
                    qVar.f56384e = new bj2.k(b14, bVar2, arrayList, bVar, new aj2.i(q13));
                    return qVar.a();
                } finally {
                }
            case 20:
                sh2.j jVar2 = (sh2.j) obj3;
                OtelLimitsConfig otelLimitsConfig = (OtelLimitsConfig) obj2;
                zi2.b bVar3 = (zi2.b) obj;
                try {
                    c0.d.M2("otel-tracer-provider-init");
                    Logger logger3 = nj2.m.f91035d;
                    nj2.o oVar = new nj2.o();
                    mj2.a aVar9 = jVar2.f112977b;
                    Objects.requireNonNull(aVar9, "resource");
                    oVar.f91044d = oVar.f91044d.b(aVar9);
                    oVar.f91041a.add((nj2.q) jVar2.f112983h.getValue());
                    n9.b a14 = nj2.p.f91048a.a();
                    int maxTotalEventCount = otelLimitsConfig.getMaxTotalEventCount();
                    p2.T("maxNumberOfEvents must be greater than 0", maxTotalEventCount > 0);
                    a14.f89942b = maxTotalEventCount;
                    int maxTotalAttributeCount = otelLimitsConfig.getMaxTotalAttributeCount();
                    p2.T("maxNumberOfAttributes must be greater than 0", maxTotalAttributeCount > 0);
                    a14.f89941a = maxTotalAttributeCount;
                    final nj2.a aVar10 = new nj2.a(maxTotalAttributeCount, a14.f89942b, a14.f89943c, a14.f89944d, a14.f89945e, a14.f89946f);
                    oVar.f91045e = new Supplier() { // from class: nj2.n
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return aVar10;
                        }
                    };
                    Objects.requireNonNull(bVar3, "clock");
                    oVar.f91042b = bVar3;
                    zi2.b bVar4 = oVar.f91042b;
                    nj2.f fVar = oVar.f91043c;
                    mj2.a aVar11 = oVar.f91044d;
                    Supplier supplier = oVar.f91045e;
                    rj2.d dVar = oVar.f91046f;
                    ArrayList arrayList2 = oVar.f91041a;
                    p pVar = oVar.f91047g;
                    pVar.getClass();
                    return new nj2.m(bVar4, fVar, aVar11, supplier, dVar, arrayList2, new aj2.i(pVar));
                } finally {
                }
            case 21:
                return ((xh2.b) obj3).f134988a.f((Class) obj, (String) obj2);
            case 22:
                return ((xh2.b) obj3).f134988a.g((InputStream) obj2, (Class) obj);
            case 23:
                return ((xh2.b) obj3).f134988a.a((InputStream) obj2, (Type) obj);
            case 24:
                switch (i13) {
                    case 24:
                        return ((xh2.b) obj3).f134988a.c((Class) obj, obj2);
                    default:
                        return ((xh2.b) obj3).f134988a.b(obj2, (Type) obj);
                }
            case 25:
                switch (i13) {
                    case 24:
                        return ((xh2.b) obj3).f134988a.c((Class) obj, obj2);
                    default:
                        return ((xh2.b) obj3).f134988a.b(obj2, (Type) obj);
                }
            case 26:
                m164invoke();
                return Unit.f80348a;
            case 27:
                am2.j b15 = ((b0) obj3).w0().b();
                if (!(b15 instanceof am2.g)) {
                    throw new u1("Supertype not a class: " + b15);
                }
                Class k13 = c2.k((am2.g) b15);
                if (k13 == null) {
                    throw new u1("Unsupported superclass of " + ((ul2.y) obj2) + ": " + b15);
                }
                c0 c0Var = (c0) obj;
                boolean d2 = Intrinsics.d(c0Var.f122502b.getSuperclass(), k13);
                Class cls = c0Var.f122502b;
                if (d2) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    Intrinsics.f(genericSuperclass);
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
                int K = kotlin.collections.c0.K(interfaces, k13);
                if (K >= 0) {
                    Type type = cls.getGenericInterfaces()[K];
                    Intrinsics.f(type);
                    return type;
                }
                throw new u1("No superclass of " + ((ul2.y) obj2) + " in Java reflection for " + b15);
            default:
                ln2.a0 a0Var2 = (ln2.a0) obj3;
                e0 a15 = a0Var2.a((am2.m) a0Var2.f84059a.f82655d);
                List d13 = a15 != null ? ((ln2.o) a0Var2.f84059a.f82653b).f84112e.d(a15, (zm2.c) obj2, (ln2.b) obj) : null;
                return d13 == null ? q0.f80391a : d13;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m164invoke() {
        switch (this.f76126i) {
            case 0:
                a aVar = ((i) this.f76127j).f76130a;
                String activityName = ((Activity) this.f76128k).getLocalClassName();
                Intrinsics.checkNotNullExpressionValue(activityName, "activity.localClassName");
                g gVar = new g((i) this.f76127j, (Application) this.f76129l, 0);
                c cVar = (c) aVar;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(activityName, "activityName");
                cVar.f76103l = activityName;
                cVar.f76110s = Long.valueOf(cVar.c());
                if (cVar.f76115x) {
                    cVar.b(gVar);
                    break;
                }
                break;
            case 1:
            default:
                ei2.u uVar = (ei2.u) this.f76127j;
                String str = (String) this.f76128k;
                if (uVar.f59037a.get(str) == null && uVar.f59038b.get(str) == null) {
                    ei2.q qVar = (ei2.q) this.f76129l;
                    if (((ei2.k) qVar).b()) {
                        uVar.f59037a.put(str, qVar);
                        break;
                    } else {
                        uVar.f59038b.put(str, qVar);
                        break;
                    }
                }
                break;
            case 2:
                qg2.a aVar2 = ((qg2.g) this.f76127j).f103862a;
                String name = (String) this.f76128k;
                Function1 action = (Function1) this.f76129l;
                qg2.e eVar = (qg2.e) aVar2;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(action, "action");
                eVar.g(name, new al1.j(16, action));
                break;
            case 3:
                ((dh2.d) this.f76127j).c((yg2.d) this.f76128k);
                ((Function0) this.f76129l).invoke();
                break;
        }
    }
}
