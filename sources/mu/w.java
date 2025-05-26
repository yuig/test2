package mu;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.kh;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import om0.m1;

/* loaded from: classes3.dex */
public final class w extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f88246b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f88247c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f88248d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f88249e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f88250f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f88251g;

    public w(l82.d dVar, lt.j jVar, m1 actionLoggingCallback) {
        Intrinsics.checkNotNullParameter(actionLoggingCallback, "actionLoggingCallback");
        this.f88247c = dVar;
        this.f88248d = jVar;
        this.f88249e = actionLoggingCallback;
        this.f88250f = dVar != null ? b(dVar, new kotlin.jvm.internal.d0() { // from class: dx0.s
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((f) obj).f56429c;
            }
        }, new kotlin.jvm.internal.d0() { // from class: dx0.t
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((u) obj).f56455c;
            }
        }, dx0.q.f56448k) : null;
        this.f88251g = jVar != null ? b(jVar, new kotlin.jvm.internal.d0() { // from class: dx0.o
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((f) obj).f56432f;
            }
        }, new kotlin.jvm.internal.d0() { // from class: dx0.p
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((u) obj).f56457e;
            }
        }, dx0.q.f56447j) : null;
    }

    public static qp1.m0 g(zy.a aVar) {
        return new qp1.m0(new zy.e0(aVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x02c5, code lost:
    
        if (r9.booleanValue() != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private l82.c0 h(u50.s r80, u50.o r81, l82.i0 r82, l82.e r83) {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.w.h(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        List b13;
        l82.h0 h0Var;
        dx0.a aVar;
        f30 f30Var;
        ue1.z zVar;
        o82.a0 a0Var;
        int i13 = this.f88246b;
        Object obj = this.f88247c;
        Object obj2 = this.f88249e;
        switch (i13) {
            case 0:
                x vmState = (x) i0Var;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                l82.c0 c13 = ((l82.d) obj).c(vmState.f88256e);
                h0 h0Var2 = vmState.f88252a;
                if (h0Var2 instanceof f0) {
                    b13 = kotlin.collections.e0.b(new o(((f0) h0Var2).f88201a));
                } else {
                    if (!(h0Var2 instanceof g0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b13 = kotlin.collections.e0.b(new p(h0Var2.getPinId(), ((g0) h0Var2).f88204b));
                }
                a aVar2 = new a((zy.a0) c13.f82212a, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
                x b14 = x.b(vmState, null, 0L, null, 0, (zy.l0) c13.f82213b, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL);
                List list = b13;
                List list2 = c13.f82214c;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new u((zy.k0) it.next()));
                }
                return new l82.c0(aVar2, b14, CollectionsKt.l0(arrayList, list));
            case 1:
                dx0.u vmState2 = (dx0.u) i0Var;
                Intrinsics.checkNotNullParameter(vmState2, "vmState");
                boolean z13 = vmState2.f56454b;
                vh vhVar = vmState2.f56453a;
                if (z13) {
                    l82.d dVar = (l82.d) obj;
                    l82.c0 c14 = dVar != null ? dVar.c(vmState2.f56459g) : null;
                    kj kjVar = vhVar.f42855m;
                    String b15 = kjVar != null ? kjVar.b() : null;
                    String str = b15 == null ? "" : b15;
                    if (c14 == null || (a0Var = (o82.a0) c14.f82212a) == null) {
                        a0Var = new o82.a0();
                    }
                    dx0.f fVar = new dx0.f(str, null, null, a0Var, true, vmState2.f56460h, (int) (hf0.b.c().widthPixels / 2.6d), 1070);
                    Intrinsics.f(c14);
                    dx0.u b16 = dx0.u.b(vmState2, (o82.j0) c14.f82213b);
                    ArrayList arrayList2 = new ArrayList();
                    List list3 = c14.f82214c;
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(new dx0.j((o82.h0) it2.next()));
                    }
                    arrayList2.addAll(arrayList3);
                    Unit unit = Unit.f80348a;
                    return new l82.c0(fVar, b16, arrayList2);
                }
                ArrayList arrayList4 = new ArrayList();
                List list4 = vhVar.f42865w;
                Intrinsics.checkNotNullExpressionValue(list4, "getObjects(...)");
                List list5 = list4;
                ArrayList arrayList5 = new ArrayList(kotlin.collections.g0.q(list5, 10));
                int i14 = 0;
                for (Object obj3 : list5) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    dl1.s sVar = (dl1.s) obj3;
                    Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.Pin");
                    f30 f30Var2 = (f30) sVar;
                    kh khVar = vhVar.f42858p;
                    arrayList5.add(Boolean.valueOf(arrayList4.add(new dx0.a(f30Var2, null, i14, vmState2.f56456d, khVar != null ? khVar.n() : null, 18))));
                    i14 = i15;
                }
                re1.e O2 = c0.d.O2(vhVar, new uv0.f(8, (Function0) obj2), dx0.r.f56450i);
                int i16 = 1;
                if (O2 != null && (aVar = (dx0.a) CollectionsKt.d0(arrayList4)) != null && (f30Var = aVar.f56413a) != null) {
                    xe1.f a13 = xe1.d.a(O2, 1.0f, new xe1.a(j1.U0(bs1.c.y0(f30Var)) ? bs1.c.y0(f30Var) : f30Var.y4(), xe1.v.f134804s, xe1.v.f134786c, false, 1.0f));
                    if (a13 != null) {
                        String uid = vhVar.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        zVar = new ue1.z(uid, a13);
                    } else {
                        zVar = null;
                    }
                    if (zVar != null) {
                        dx0.a aVar3 = new dx0.a(f30Var, zVar, 0, vmState2.f56456d, null, 52);
                        int i17 = dx0.n.f56444a[O2.f107575c.ordinal()];
                        if (i17 == 1 || i17 == 2) {
                            arrayList4.add(aVar3);
                        } else {
                            arrayList4.remove(aVar);
                            arrayList4.add(aVar3);
                        }
                    }
                }
                kj kjVar2 = vhVar.f42855m;
                String b17 = kjVar2 != null ? kjVar2.b() : null;
                String str2 = b17 == null ? "" : b17;
                ArrayList arrayList6 = new ArrayList(kotlin.collections.g0.q(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    dx0.a aVar4 = (dx0.a) it3.next();
                    ue1.z zVar2 = aVar4.f56414b;
                    int i18 = zVar2 != null ? RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL : 2024;
                    String uid2 = zVar2 != null ? "" : aVar4.f56413a.getUid();
                    Intrinsics.f(uid2);
                    arrayList6.add(new o82.u0(aVar4, i18, uid2));
                }
                String q13 = vhVar.q();
                Intrinsics.checkNotNullExpressionValue(q13, "getStoryType(...)");
                dx0.f fVar2 = new dx0.f(str2, arrayList6, q13, null, false, vmState2.f56460h, (int) (hf0.b.c().widthPixels / 2.6d), 1252);
                l82.e d2 = l82.d.d(fVar2, vmState2);
                if (vmState2.f56456d != bx0.z.DROPDOWN || (h0Var = (l82.h0) this.f88250f) == null) {
                    return new l82.c0(fVar2, vmState2, kotlin.collections.q0.f80391a);
                }
                d2.h(new zw0.l(vhVar, i16));
                com.google.firebase.messaging.a0 transformation = h0Var.e();
                Intrinsics.checkNotNullParameter(d2, "<this>");
                Intrinsics.checkNotNullParameter(transformation, "transformation");
                transformation.i(d2);
                return d2.e();
            default:
                qp1.s0 vmState3 = (qp1.s0) i0Var;
                Intrinsics.checkNotNullParameter(vmState3, "vmState");
                pp1.v vVar = vmState3.f104833g;
                ((lt.j) obj2).getClass();
                l82.c0 h10 = lt.j.h(vVar);
                return new l82.c0(new qp1.k(new ArrayList(), qp1.a.None, (pp1.n) h10.f82212a), qp1.s0.b(vmState3, null, 0L, 0L, null, null, null, (pp1.v) h10.f82213b, null, null, 8127), kotlin.collections.q0.f80391a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ec  */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r80, u50.o r81, l82.i0 r82, l82.e r83) {
        /*
            Method dump skipped, instructions count: 2308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.w.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }

    public w(lt.j lifecycleEventHandler, es.a adFormats, nx.b0 pinAuxHelper, es.h adsCommonDisplay, vr.a adsCommonAnalytics) {
        Intrinsics.checkNotNullParameter(lifecycleEventHandler, "lifecycleEventHandler");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adsCommonAnalytics, "adsCommonAnalytics");
        this.f88247c = lifecycleEventHandler;
        this.f88248d = adFormats;
        this.f88249e = pinAuxHelper;
        this.f88250f = adsCommonDisplay;
        this.f88251g = adsCommonAnalytics;
    }

    public w(np1.b handshakeHeaderManager, mp1.c handshakeEventGenerator, lt.j handshakeBottomSheetStateTransformer, np1.j handshakeManager, es.h adsCommonDisplay) {
        Intrinsics.checkNotNullParameter(handshakeHeaderManager, "handshakeHeaderManager");
        Intrinsics.checkNotNullParameter(handshakeEventGenerator, "handshakeEventGenerator");
        Intrinsics.checkNotNullParameter(handshakeBottomSheetStateTransformer, "handshakeBottomSheetStateTransformer");
        Intrinsics.checkNotNullParameter(handshakeManager, "handshakeManager");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f88247c = handshakeHeaderManager;
        this.f88248d = handshakeEventGenerator;
        this.f88249e = handshakeBottomSheetStateTransformer;
        this.f88251g = handshakeManager;
        this.f88250f = adsCommonDisplay;
    }

    public /* synthetic */ w(o82.i0 i0Var, m1 m1Var) {
        this(i0Var, null, m1Var);
    }
}
