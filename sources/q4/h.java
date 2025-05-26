package q4;

import am2.c1;
import android.content.Context;
import android.graphics.PointF;
import android.net.ConnectivityManager;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.Size;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.boardpreview.view.ShareBoardUpsellView;
import com.pinterest.feature.onetap.view.OneTapPinCarouselView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.u0;
import io.embrace.android.embracesdk.internal.api.delegate.EmbraceInternalInterfaceImpl;
import io.embrace.android.embracesdk.internal.api.delegate.ReactNativeInternalInterfaceImpl;
import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kh2.b1;
import kh2.d1;
import kh2.d3;
import kh2.f1;
import kh2.f3;
import kh2.g2;
import kh2.h0;
import kh2.h1;
import kh2.h3;
import kh2.i1;
import kh2.j3;
import kh2.k2;
import kh2.l2;
import kh2.l3;
import kh2.m3;
import kh2.o2;
import kh2.q2;
import kh2.r0;
import kh2.s2;
import kh2.v2;
import kh2.y0;
import kh2.y2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import m60.f0;
import nx.d0;
import okhttp3.OkHttpClient;
import pc.n0;
import pc.o0;
import pd2.i0;
import pd2.p0;
import rf1.s0;
import rg0.m0;
import sf1.e1;
import sf1.k1;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102333i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f102334j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f102335k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f102336l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f102337m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f102338n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        super(0);
        this.f102333i = i13;
        this.f102334j = obj;
        this.f102335k = obj2;
        this.f102336l = obj3;
        this.f102337m = obj4;
        this.f102338n = obj5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Set set;
        vg2.b bVar;
        RemoteConfig remoteConfig;
        Boolean bool;
        Object iVar;
        String str;
        pg2.k c13;
        String str2;
        ah2.j jVar;
        ki2.g gVar = ki2.g.f79814f;
        int i13 = this.f102333i;
        int i14 = 29;
        boolean z13 = true;
        int i15 = 0;
        RemoteConfig remoteConfig2 = null;
        remoteConfig2 = null;
        Object obj = this.f102336l;
        Object obj2 = this.f102338n;
        Object obj3 = this.f102337m;
        Object obj4 = this.f102335k;
        Object obj5 = this.f102334j;
        switch (i13) {
            case 0:
                m236invoke();
                return Unit.f80348a;
            case 1:
                yc.q qVar = (yc.q) obj3;
                Map N0 = l0.N0((o0) obj5, (n0) obj4, (pc.v) obj, qVar.f138658a);
                return new Pair(N0, ((xc.e) qVar.f138662e.getValue()).c(CollectionsKt.F0(N0.values()), (wc.a) obj2));
            case 2:
                yc.q qVar2 = (yc.q) obj3;
                Collection<wc.m> values = l0.N0((o0) obj5, (n0) obj4, (pc.v) obj, qVar2.f138658a).values();
                UUID uuid = (UUID) obj2;
                ArrayList recordSet = new ArrayList(g0.q(values, 10));
                for (wc.m mVar : values) {
                    recordSet.add(new wc.m(mVar.f129093a, mVar.f129094b, uuid));
                }
                xc.e eVar = (xc.e) qVar2.f138662e.getValue();
                eVar.getClass();
                Intrinsics.checkNotNullParameter(recordSet, "recordSet");
                ArrayList arrayList = new ArrayList();
                Iterator it = recordSet.iterator();
                while (it.hasNext()) {
                    wc.m record = (wc.m) it.next();
                    Intrinsics.checkNotNullParameter(record, "record");
                    LinkedHashMap linkedHashMap = eVar.f134548b;
                    xc.d dVar = (xc.d) linkedHashMap.get(record.f129093a);
                    if (dVar == null) {
                        linkedHashMap.put(record.f129093a, new xc.d(record));
                        set = record.b();
                    } else {
                        Intrinsics.checkNotNullParameter(record, "record");
                        Pair c14 = dVar.f134546a.c(record);
                        wc.m mVar2 = (wc.m) c14.f80346a;
                        Set set2 = (Set) c14.f80347b;
                        dVar.f134546a = mVar2;
                        dVar.f134547b.add(record);
                        set = set2;
                    }
                    k0.u(set, arrayList);
                }
                return CollectionsKt.J0(arrayList);
            case 3:
                return ((tj0.b0) obj5).a((Context) obj4, (d0) obj, f0.i0(((qa2.n) obj2).f103320a), ((yq0.z) obj3).f139760f);
            case 4:
                m236invoke();
                return Unit.f80348a;
            case 5:
                return new OneTapPinCarouselView((Context) obj5, ((yq0.z) obj4).f139760f, (d0) obj, (uj2.q) obj3, (i91.u) obj2);
            case 6:
                m236invoke();
                return Unit.f80348a;
            case 7:
                m236invoke();
                return Unit.f80348a;
            case 8:
                m236invoke();
                return Unit.f80348a;
            case 9:
                m236invoke();
                return Unit.f80348a;
            case 10:
                m236invoke();
                return Unit.f80348a;
            case 11:
                m236invoke();
                return Unit.f80348a;
            case 12:
                q2 q2Var = (q2) obj5;
                kh2.a aVar = (kh2.a) obj4;
                th2.g gVar2 = (th2.g) obj;
                b1 b1Var = (b1) obj3;
                kh2.m mVar3 = (kh2.m) obj2;
                try {
                    c0.d.M2("config-service-init");
                    sh2.j c15 = ((s2) q2Var).c();
                    uh2.b a13 = ((kh2.c) aVar).a();
                    InstrumentedConfigImpl instrumentedConfigImpl = ((d1) b1Var).f79461g;
                    mVar3.getClass();
                    vg2.a aVar2 = (vg2.a) mVar3.f79609b.a(mVar3, kh2.m.f79607g[1]);
                    if (aVar2 != null && (bVar = (vg2.b) aVar2.f125792e.getValue()) != null) {
                        remoteConfig2 = bVar.f125793a;
                    }
                    return new sg2.b(c15, a13, gVar2, instrumentedConfigImpl, remoteConfig2);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 13:
                r0 r0Var = (r0) ((kh2.o0) obj5);
                d1 d1Var = (d1) ((b1) obj3);
                cg2.c cVar = new cg2.c(r0Var.f(), ((kh2.c) ((kh2.a) obj4)).a(), r0Var.b(), ((kh2.m) ((kh2.k) obj)).b(), d1Var.a(), d1Var.f79456b);
                cVar.g(xk2.m.b(new kh2.t((kh2.v) obj2, i15)));
                return cVar;
            case 14:
                kh2.a0 a0Var = (kh2.a0) obj5;
                a0Var.getClass();
                zf2.e uiLoadEventListener = (zf2.e) a0Var.f79425g.a(a0Var, kh2.a0.f79418i[6]);
                if (uiLoadEventListener == null) {
                    return null;
                }
                ii2.d versionChecker = (ii2.d) obj4;
                ii2.a aVar3 = (ii2.a) versionChecker;
                if (aVar3.a(29)) {
                    Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
                }
                tg2.e eVar2 = ((sg2.b) ((sg2.a) obj3)).f112877b;
                boolean z14 = eVar2.f117602c.isUiLoadTracingTraceAll() && (remoteConfig = eVar2.f117601b) != null && (bool = remoteConfig.f73063r) != null && bool.booleanValue();
                zi2.b clock = ((s2) ((q2) obj2)).f79688b;
                Intrinsics.checkNotNullParameter(uiLoadEventListener, "uiLoadEventListener");
                Intrinsics.checkNotNullParameter(clock, "clock");
                Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
                e2.g0 g0Var = new e2.g0(uiLoadEventListener, z14, clock);
                Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
                return aVar3.a(29) ? new zf2.a(g0Var) : new zf2.b(g0Var);
            case 15:
                s2 s2Var = (s2) ((q2) obj5);
                return new jg2.c(s2Var.f79688b, new nd2.a((kh2.a0) obj2, 25), s2Var.e(), ((m3) ((l3) obj4)).a(gVar), (ii2.d) obj, ((d1) ((b1) obj3)).f79456b);
            case 16:
                Function0 function0 = (Function0) obj4;
                if (function0 == null || (iVar = (qg2.d) function0.invoke()) == null) {
                    if (((sg2.b) ((kh2.m) ((kh2.k) obj5)).b()).a()) {
                        return null;
                    }
                    f3 f3Var = (f3) ((d3) obj);
                    f3Var.getClass();
                    qg2.c cVar2 = (qg2.c) f3Var.f79495c.a(f3Var, f3.f79492d[2]);
                    r0 r0Var2 = (r0) ((kh2.o0) obj3);
                    r0Var2.getClass();
                    pg2.j jVar2 = (pg2.j) r0Var2.f79676h.a(r0Var2, r0.f79668m[5]);
                    if (jVar2 == null) {
                        return null;
                    }
                    iVar = new qg2.i(cVar2, jVar2, ((d1) ((b1) obj2)).a());
                }
                return iVar;
            case 17:
                Function0 function02 = (Function0) obj4;
                if (function02 != null && (jVar = (ah2.j) function02.invoke()) != null) {
                    return jVar;
                }
                kh2.m mVar4 = (kh2.m) ((kh2.k) obj5);
                if (((sg2.b) mVar4.b()).a() || (str = ((sg2.b) mVar4.b()).f112889n) == null || (c13 = mVar4.c()) == null || (str2 = ((pg2.p) c13).f100145g) == null) {
                    return null;
                }
                xk2.v b13 = xk2.m.b(new kh2.k0(((kh2.c) ((kh2.a) obj)).a(), 0));
                if (!((Boolean) ((sg2.b) mVar4.b()).f112877b.f117604e.getValue()).booleanValue()) {
                    return new ah2.h(str2, b13, str, ((d1) ((b1) obj3)).f79456b);
                }
                OkHttpClient okHttpClient = (OkHttpClient) mVar4.f79608a.a(mVar4, kh2.m.f79607g[0]);
                lh2.b bVar2 = ((d1) ((b1) obj3)).f79456b;
                ((kh2.l0) obj2).getClass();
                return new ah2.i(okHttpClient, str2, b13, str, bVar2);
            case 18:
                Object obj6 = (bg2.c) ((Function0) obj4).invoke();
                if (obj6 == null) {
                    kh2.o oVar = (kh2.o) obj5;
                    l3 l3Var = (l3) obj;
                    b1 b1Var2 = (b1) obj3;
                    h3 h3Var = (h3) obj2;
                    try {
                        c0.d.M2("network-connectivity-service-init");
                        j3 j3Var = (j3) h3Var;
                        obj6 = new bg2.a(((kh2.q) oVar).b(), ((m3) l3Var).a(gVar), ((d1) b1Var2).f79456b, (ConnectivityManager) j3Var.f79579d.a(j3Var, j3.f79575g[2]));
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return obj6;
            case 19:
                d1 d1Var2 = (d1) ((b1) obj);
                return new hg2.c(((kh2.q) ((kh2.o) obj5)).b(), ((s2) ((q2) obj3)).e(), d1Var2.f79456b, ((m3) ((l3) obj4)).a(gVar), d1Var2.f79455a, new y0((h3) obj2, i15));
            case 20:
                i1 i1Var = (i1) ((h1) obj);
                i1Var.getClass();
                return new EmbraceInternalInterfaceImpl((lf2.i) obj5, (b1) obj4, (rh2.i) i1Var.f79532a.a(i1Var, i1.f79531h[0]), ((kh2.m) ((kh2.k) obj3)).b(), (ei2.p) ((s2) ((q2) obj2)).f79699m.getValue());
            case 21:
                lf2.i iVar2 = (lf2.i) obj5;
                nf2.g a14 = ((f1) obj4).a();
                kh2.v vVar = (kh2.v) ((kh2.s) obj);
                vVar.getClass();
                cg2.a aVar4 = (cg2.a) vVar.f79721b.a(vVar, kh2.v.f79719d[1]);
                y2 y2Var = (y2) ((v2) obj3);
                y2Var.getClass();
                return new ReactNativeInternalInterfaceImpl(iVar2, a14, aVar4, (gg2.f) y2Var.f79751a.a(y2Var, y2.f79750l[0]), y2Var.b(), ((d1) ((b1) obj2)).f79456b);
            case 22:
                ki2.a a15 = ((m3) ((l3) obj5)).a(ki2.g.f79813e);
                og2.a aVar5 = ((d1) ((b1) obj4)).f79455a;
                mh2.n nVar = (mh2.n) ((s2) ((q2) obj)).f79701o.getValue();
                di2.b b14 = ((kh2.l0) ((h0) obj3)).b();
                y2 y2Var2 = (y2) ((v2) obj2);
                y2Var2.getClass();
                return new mh2.k(a15, aVar5, nVar, b14, (eh2.a) y2Var2.f79755e.a(y2Var2, y2.f79750l[4]));
            case 23:
                kh2.m mVar5 = (kh2.m) ((kh2.k) obj);
                d1 d1Var3 = (d1) ((b1) obj3);
                return new rh2.d(((r0) ((kh2.o0) obj5)).e(), ((kh2.c) ((kh2.a) obj4)).a(), new nd2.a((i1) obj2, i14), mVar5.b(), mVar5.c(), d1Var3.a(), d1Var3.f79456b);
            case 24:
                kh2.m mVar6 = (kh2.m) ((kh2.k) obj5);
                if (!((sg2.b) mVar6.b()).f112877b.f117602c.isNativeCrashCaptureEnabled()) {
                    return null;
                }
                d1 d1Var4 = (d1) ((b1) obj2);
                return new oh2.b(((l2) ((k2) obj4)).f79604e, ((kh2.c) ((kh2.a) obj)).a(), ((r0) ((kh2.o0) obj3)).b(), mVar6.b(), d1Var4.a(), d1Var4.f79456b);
            case 25:
                o2 o2Var = (o2) obj5;
                kh2.k kVar = (kh2.k) obj4;
                l3 l3Var2 = (l3) obj;
                v2 v2Var = (v2) obj3;
                k2 k2Var = (k2) obj2;
                try {
                    c0.d.M2("native-thread-sampler-init");
                    kh2.m mVar7 = (kh2.m) kVar;
                    sg2.a b15 = mVar7.b();
                    rl2.u[] uVarArr = o2.f79631e;
                    o2Var.getClass();
                    return ((sg2.b) b15).f112877b.f117602c.isNativeCrashCaptureEnabled() ? new qf2.b(mVar7.b(), xk2.m.b(new g2(k2Var, z13 ? 1 : 0)), ((m3) l3Var2).a(gVar), ((y2) v2Var).a(), ((l2) k2Var).a()) : null;
                } finally {
                }
            case 26:
                Function0 function03 = (Function0) obj4;
                q2 q2Var2 = (q2) obj5;
                Function0 function04 = (Function0) obj;
                kh2.o0 o0Var = (kh2.o0) obj3;
                b1 b1Var3 = (b1) obj2;
                try {
                    c0.d.M2("session-payload-source");
                    s2 s2Var2 = (s2) q2Var2;
                    return new hh2.b(function03, (ei2.x) s2Var2.f79690d.getValue(), s2Var2.a(), s2Var2.d(), (eg2.a) function04.invoke(), ((r0) o0Var).d(), ((d1) b1Var3).f79455a, ((d1) b1Var3).f79456b);
                } finally {
                }
            default:
                pn2.f1 f1Var = (pn2.f1) ((com.google.firebase.messaging.q) obj5).f33806d;
                c1 c1Var = (c1) obj4;
                nm2.a aVar6 = (nm2.a) obj;
                am2.j b16 = ((pn2.b1) obj3).b();
                pn2.h0 j13 = b16 != null ? b16.j() : null;
                aVar6.getClass();
                return f1Var.b(c1Var, nm2.a.g(nm2.a.g(aVar6, null, false, null, j13, 31), null, ((gm2.s) ((pm2.i) obj2)).d(), null, null, 59));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Function0 function0, Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        super(0);
        this.f102333i = i13;
        this.f102335k = function0;
        this.f102334j = obj;
        this.f102336l = obj2;
        this.f102337m = obj3;
        this.f102338n = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xb1.j jVar, String str, HashMap hashMap, Function1 function1, Function1 function12) {
        super(0);
        this.f102333i = 7;
        this.f102334j = jVar;
        this.f102337m = str;
        this.f102335k = hashMap;
        this.f102336l = function1;
        this.f102338n = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(yk1.p pVar, dl1.s sVar, Enum r33, Object obj, String str, int i13) {
        super(0);
        this.f102333i = i13;
        this.f102334j = pVar;
        this.f102335k = sVar;
        this.f102336l = r33;
        this.f102338n = obj;
        this.f102337m = str;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m236invoke() {
        String uid;
        String uid2;
        wy0 wy0Var;
        k1 x33;
        int i13 = this.f102333i;
        Object obj = this.f102338n;
        Object obj2 = this.f102336l;
        Object obj3 = this.f102337m;
        Object obj4 = this.f102335k;
        Object obj5 = this.f102334j;
        switch (i13) {
            case 0:
                ((w) obj5).o((Function0) obj4, (z) obj2, (n4.k) obj);
                return;
            case 1:
            case 2:
            case 3:
            case 5:
            default:
                android.support.v4.media.a aVar = (android.support.v4.media.a) obj5;
                yd2.j jVar = (yd2.j) aVar.f15842f;
                ae2.d dVar = (ae2.d) obj4;
                jVar.b(new yd2.c(dVar));
                jVar.a();
                Size size = dVar.f15060e;
                GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
                com.pinterest.xrenderer.legacy.multipass_processing.e eVar = (com.pinterest.xrenderer.legacy.multipass_processing.e) obj2;
                ae2.d originalTexture = (ae2.d) obj3;
                ae2.d sourceTexture = (ae2.d) obj;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(originalTexture, "originalTexture");
                Intrinsics.checkNotNullParameter(sourceTexture, "sourceTexture");
                eVar.f52878c.a();
                originalTexture.f15064c = 0;
                originalTexture.a();
                com.pinterest.xrenderer.legacy.multipass_processing.d dVar2 = eVar.f52881f;
                dVar2.getClass();
                rl2.u[] uVarArr = com.pinterest.xrenderer.legacy.multipass_processing.d.f52873c;
                dVar2.f52874a.h(uVarArr[0]).j(originalTexture);
                sourceTexture.f15064c = 1;
                sourceTexture.a();
                dVar2.f52875b.h(uVarArr[1]).j(sourceTexture);
                Iterator it = eVar.f52880e.iterator();
                int i14 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i15 = i14 + 1;
                    if (i14 >= 0) {
                        com.pinterest.xrenderer.legacy.multipass_processing.f fVar = (com.pinterest.xrenderer.legacy.multipass_processing.f) next;
                        ae2.f fVar2 = fVar.f52882a;
                        fVar2.f15064c = i14 + 2;
                        fVar2.a();
                        fVar.f52883b.j(fVar.f52882a);
                        i14 = i15;
                    } else {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                }
                Iterator it2 = eVar.f52879d.iterator();
                while (it2.hasNext()) {
                    com.pinterest.xrenderer.legacy.multipass_processing.c cVar = (com.pinterest.xrenderer.legacy.multipass_processing.c) it2.next();
                    p0 d2 = eVar.f52876a.f117474c.d(cVar.f52872b);
                    boolean z13 = d2 instanceof i0;
                    androidx.appcompat.widget.a aVar2 = cVar.f52871a;
                    if (z13) {
                        aVar2.i(((i0) d2).f99845b);
                    } else if (d2 instanceof pd2.f0) {
                        aVar2.f(((pd2.f0) d2).f99839b);
                    } else if (d2 instanceof pd2.a0) {
                        aVar2.e(((pd2.a0) d2).f99825b);
                    } else if (d2 instanceof pd2.x) {
                        aVar2.c(((pd2.x) d2).f99879b);
                    } else if (d2 instanceof pd2.o0) {
                        PointF pointF = ((pd2.o0) d2).f99863b;
                        aVar2.g(pointF.x, pointF.y);
                    } else if (d2 instanceof pd2.l0) {
                        hd2.f fVar3 = ((pd2.l0) d2).f99854b;
                        PointF pointF2 = fVar3.f68922a;
                        float f13 = pointF2.x;
                        float f14 = pointF2.y;
                        PointF pointF3 = fVar3.f68923b;
                        aVar2.h(f13, f14, pointF3.x, pointF3.y);
                    }
                }
                GLES30.glClearBufferfv(6144, 0, new float[]{0.0f, 0.0f, 0.0f, 0.0f}, 0);
                GLES20.glDrawArrays(4, 0, ((q8.d) aVar.f15839c).f102897c);
                return;
            case 4:
                kl0.z zVar = (kl0.z) obj5;
                ConstraintLayout constraintLayout = zVar.S1;
                if (constraintLayout != null) {
                    constraintLayout.removeView((ShareBoardUpsellView) obj4);
                    ((rg0.n) obj2).a(null, (nx.d) obj3);
                    String str = ((m0) obj).f108058f;
                    if (str != null) {
                        g70.h hVar = zVar.f80142k1;
                        if (hVar != null) {
                            g70.h.g(hVar, str, g70.b.PUBLIC_BOARD, null, 4);
                            return;
                        } else {
                            Intrinsics.r("boardNavigator");
                            throw null;
                        }
                    }
                    wy0 f15 = ((b60.d) zVar.getActiveUserManager()).f();
                    if (f15 == null || (uid = f15.getUid()) == null) {
                        return;
                    }
                    NavigationImpl z03 = Navigation.z0((ScreenLocation) com.pinterest.screens.q.f51220j.getValue(), uid);
                    z03.m0("com.pinterest.EXTRA_PROFILE_TAB", "boards");
                    zVar.f7().d(z03);
                    return;
                }
                Intrinsics.r("boardContainer");
                throw null;
            case 6:
                ((xb1.f) obj5).t3((wb1.l) obj4, (bd1.b) obj2, obj, (String) obj3, true);
                return;
            case 7:
                xb1.j.w3((xb1.j) obj5, (String) obj3, (HashMap) obj4, (Function1) obj2, (Function1) obj, null, true, 16);
                return;
            case 8:
                ((xb1.j) obj5).B3((bd1.b) obj4, obj2, (String) obj3, true, (Function1) obj);
                return;
            case 9:
                rf1.p0 p0Var = (rf1.p0) obj5;
                p0Var.getClass();
                p0Var.f107845j.l(i32.y0.ANDROID_IDEA_STREAM_TAKEOVER, i32.l.ANDROID_FOLLOW_EDUCATION);
                wy0 wy0Var2 = (wy0) obj4;
                if (wy0Var2 != null && Intrinsics.d(wy0Var2.s2(), Boolean.TRUE)) {
                    s60.d dVar3 = p0Var.T;
                    if (dVar3 != null) {
                        String uid3 = wy0Var2.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                        dVar3.d(uid3).i().i(new i01.r0(9), new rf1.v(6, rf1.l.f107770n));
                        return;
                    }
                    return;
                }
                nk1.m mVar = p0Var.S;
                if (mVar != null) {
                    h32.g0 g0Var = (h32.g0) obj2;
                    u0 u0Var = (u0) obj;
                    String str2 = (String) obj3;
                    nk1.g gVar = mVar.f91145p;
                    gVar.f91128b = new h32.i0(null, null, null, g0Var != null ? g0Var : null, null, u0Var != null ? u0Var : null);
                    HashMap hashMap = ((s0) p0Var.f107826J.invoke()).f107899d;
                    bs1.c.G1("pin_id", p0Var.u4(), hashMap);
                    f30 f30Var = p0Var.Z;
                    String z43 = f30Var != null ? f30Var.z4() : null;
                    if (z43 != null && !kotlin.text.z.j(z43)) {
                        hashMap.put("image_signature", z43);
                    }
                    gVar.f91130d = hashMap;
                    if (str2 != null) {
                        gVar.f91129c = str2;
                    }
                    gVar.f91131e = p0Var.F3(p0Var.Z);
                    Intrinsics.checkNotNullParameter(gVar, "<set-?>");
                    mVar.f91145p = gVar;
                    mVar.f();
                    if (wy0Var2 == null || (uid2 = wy0Var2.getUid()) == null || !p0Var.isBound() || (wy0Var = (wy0) p0Var.f107835e.O(uid2)) == null || !c0.d.d2(wy0Var) || (x33 = p0Var.x3()) == null) {
                        return;
                    }
                    e1 e1Var = (e1) x33;
                    ig1.b.M0(true, e1Var, true, e1Var.getContext(), false, false, false);
                    return;
                }
                return;
            case 10:
                x52.n nVar = (x52.n) obj5;
                uk2.f progress = nVar.f133895e;
                x52.c onCancel = new x52.c(0, nVar, x52.n.class, "cancelVideoGeneration", "cancelVideoGeneration()V", 0);
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                m60.w wVar = m60.u.f85943a;
                wVar.d(new jc0.s());
                jc0.v vVar = new jc0.v(new ji0.b(progress, new x52.b(onCancel)), false, 0L, 30);
                if (wVar.b(jc0.v.class)) {
                    wVar.d(vVar);
                } else {
                    wVar.e(1L, vVar);
                }
                kotlin.jvm.internal.j.z(nVar.f133892b, null, null, new x52.d(nVar, (an0.g) obj4, (d0) obj2, (Function1) obj3, (Function1) obj, null), 3);
                return;
        }
    }
}
