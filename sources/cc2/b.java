package cc2;

import a.cb;
import ac2.o1;
import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ey.j3;
import h32.i0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.h1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import lb0.q;
import n7.m0;
import n7.o0;
import nx.z0;

/* loaded from: classes2.dex */
public final class b {
    public static boolean C;
    public static Long D;
    public static String E;
    public static int F;
    public static short G;
    public static final LinkedHashMap H = new LinkedHashMap();
    public a A;
    public final Long B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f27482a;

    /* renamed from: b, reason: collision with root package name */
    public final ac2.m f27483b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f27484c;

    /* renamed from: d, reason: collision with root package name */
    public final oc2.f f27485d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27486e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27487f;

    /* renamed from: g, reason: collision with root package name */
    public final float f27488g;

    /* renamed from: h, reason: collision with root package name */
    public final qc2.f f27489h;

    /* renamed from: i, reason: collision with root package name */
    public final bc2.k f27490i;

    /* renamed from: j, reason: collision with root package name */
    public final bc2.m f27491j;

    /* renamed from: k, reason: collision with root package name */
    public final z0 f27492k;

    /* renamed from: l, reason: collision with root package name */
    public final b60.a f27493l;

    /* renamed from: m, reason: collision with root package name */
    public final hc2.p f27494m;

    /* renamed from: n, reason: collision with root package name */
    public final vb0.f f27495n;

    /* renamed from: o, reason: collision with root package name */
    public final int f27496o;

    /* renamed from: p, reason: collision with root package name */
    public final kc2.a f27497p;

    /* renamed from: q, reason: collision with root package name */
    public final l5.i f27498q;

    /* renamed from: r, reason: collision with root package name */
    public final Function0 f27499r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f27500s;

    /* renamed from: t, reason: collision with root package name */
    public String f27501t;

    /* renamed from: u, reason: collision with root package name */
    public final Set f27502u;

    /* renamed from: v, reason: collision with root package name */
    public int f27503v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27504w;

    /* renamed from: x, reason: collision with root package name */
    public gc2.c f27505x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f27506y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f27507z;

    public b(Context androidContext, o1 videoManager, o0 playbackStatsListener, oc2.f fVar, String pinId, String trackerId, float f13, qc2.f viewabilityConfig, bc2.k metadata, bc2.m surface, z0 auxData, b60.a aVar, hc2.p prefetchTracker, vb0.f connectivityUtils, int i13, Long l13, double d2, q prefsManagerPersisted, kc2.a videoPreferences, l5.i devicePerformance, Function0 uidGenerator) {
        qb0.e networkUtils = qb0.d.f103396a;
        Intrinsics.checkNotNullParameter(androidContext, "androidContext");
        Intrinsics.checkNotNullParameter(videoManager, "videoManager");
        Intrinsics.checkNotNullParameter(playbackStatsListener, "playbackStatsListener");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(trackerId, "trackerId");
        Intrinsics.checkNotNullParameter(viewabilityConfig, "viewabilityConfig");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(prefetchTracker, "prefetchTracker");
        Intrinsics.checkNotNullParameter(connectivityUtils, "connectivityUtils");
        Intrinsics.checkNotNullParameter(networkUtils, "networkUtils");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(videoPreferences, "videoPreferences");
        Intrinsics.checkNotNullParameter(devicePerformance, "devicePerformance");
        Intrinsics.checkNotNullParameter(uidGenerator, "uidGenerator");
        this.f27482a = androidContext;
        this.f27483b = videoManager;
        this.f27484c = playbackStatsListener;
        this.f27485d = fVar;
        this.f27486e = pinId;
        this.f27487f = trackerId;
        this.f27488g = f13;
        this.f27489h = viewabilityConfig;
        this.f27490i = metadata;
        this.f27491j = surface;
        this.f27492k = auxData;
        this.f27493l = aVar;
        this.f27494m = prefetchTracker;
        this.f27495n = connectivityUtils;
        this.f27496o = i13;
        this.f27497p = videoPreferences;
        this.f27498q = devicePerformance;
        this.f27499r = uidGenerator;
        this.f27501t = trackerId;
        this.f27502u = h1.f(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER), Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR), Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE));
        gc2.c cVar = new gc2.c(prefsManagerPersisted);
        this.f27505x = cVar;
        this.A = new a(pinId, metadata.f22663g, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, null, 0, 0L, 0.0f, false, null, null, l13, cVar, i13, -4, 131071);
        j3 j3Var = j3.f60510a;
        String pinUid = metadata.f22657a;
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        LinkedHashMap linkedHashMap = j3.f60514e;
        Long l14 = (Long) linkedHashMap.get(pinUid);
        linkedHashMap.remove(pinUid);
        this.B = l14;
        LinkedHashMap linkedHashMap2 = H;
        linkedHashMap2.put(Integer.valueOf(i13), Integer.valueOf(((Number) linkedHashMap2.getOrDefault(Integer.valueOf(i13), 0)).intValue() + 1));
        vb0.j.f125466a.P("init", tb0.p.VIDEO_PLAYER);
        if (!C) {
            C = true;
            new fk2.g(new f00.c(this, 4), 1).l(tk2.e.f118017c).i(new vy.c(11), new e82.o(10, new e82.l(this, 7)));
        }
        this.A.f27457c = d2;
        if (fVar == null) {
            return;
        }
        fVar.c((long) d2);
    }

    public final long a(o0 o0Var, long j13) {
        long max = Long.max(0L, j13) * this.A.N;
        m0 c03 = o0Var.c0();
        return max + (c03 != null ? c03.N[3] : 0L);
    }

    public final a b() {
        return this.A;
    }

    public final hc2.q c() {
        return this.A.V;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(h32.i0 r74, cc2.c r75, long r76, int r78, boolean r79, long r80, long r82) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cc2.b.d(h32.i0, cc2.c, long, int, boolean, long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x01a8, code lost:
    
        if (r8 > 0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x054b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(h32.i0 r99, cc2.c r100, long r101) {
        /*
            Method dump skipped, instructions count: 2020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cc2.b.e(h32.i0, cc2.c, long):void");
    }

    public final void f(i0 i0Var, c cVar, long j13, long j14, long j15) {
        if (this.A.e()) {
            a aVar = this.A;
            if (aVar.f27481z) {
                aVar.f27460e = j13;
                aVar.g(j13);
                a aVar2 = this.A;
                aVar2.f(aVar2.f27460e);
                e(i0Var, cVar, j14);
                return;
            }
            aVar.f27460e = j13;
            a.j(this.A, a(this.f27484c, j14), j15, null, null, 12);
            a aVar3 = this.A;
            long j16 = aVar3.f27459d;
            boolean z13 = j16 <= 0 || aVar3.f27460e <= j16;
            String str = this.f27486e;
            if (z13) {
                g(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER, "", "Session timestamps were invalid", e0.b(t.b("\n                    " + str + " Bad Timestamps: \n                    ST" + j16 + ",\n                    ET" + aVar3.f27460e + "\n                    ")));
            }
            a aVar4 = this.A;
            aVar4.g(aVar4.f27460e);
            a aVar5 = this.A;
            aVar5.f(aVar5.f27460e);
            a aVar6 = this.A;
            aVar6.getClass();
            if (a.b(aVar6) < 0) {
                a aVar7 = this.A;
                long j17 = aVar7.f27460e - aVar7.f27459d;
                long j18 = aVar7.f27472q;
                long c13 = aVar7.c();
                long d2 = this.A.d();
                StringBuilder sb3 = new StringBuilder("\n                    ");
                sb3.append(str);
                sb3.append(" Bad Watch Time: \n                    TT");
                sb3.append(j17);
                cb.v(sb3, ", \n                    SL", j18, ", \n                    BD");
                sb3.append(c13);
                sb3.append(", \n                    PD");
                sb3.append(d2);
                sb3.append("\n                    ");
                g(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR, "", "Session watch time calculated is invalid", e0.b(t.b(sb3.toString())));
            }
            e(i0Var, cVar, j14);
        }
    }

    public final void g(int i13, String str, String str2, List list) {
        CollectionsKt.Z(list, null, null, null, 0, null, null, 63);
        if (this.A.f27481z) {
            return;
        }
        boolean z13 = !this.f27502u.contains(Integer.valueOf(i13));
        a aVar = this.A;
        aVar.f27481z = z13;
        aVar.A = i13;
        aVar.B = str;
        aVar.C.addAll(0, list);
        this.A.D = str2;
    }

    public final void h(hc2.q prefetchTrigger, long j13) {
        Intrinsics.checkNotNullParameter(prefetchTrigger, "prefetchTrigger");
        Objects.toString(prefetchTrigger);
        a aVar = this.A;
        aVar.V = prefetchTrigger;
        aVar.W = Long.valueOf(j13);
        oc2.f fVar = this.f27485d;
        if (fVar != null) {
            fVar.i(prefetchTrigger);
        }
        if (fVar == null) {
            return;
        }
        fVar.h(j13);
    }
}
