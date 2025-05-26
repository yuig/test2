package xv1;

import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.k2;
import lh0.z0;
import lh0.z3;
import m60.w;

/* loaded from: classes4.dex */
public final class g extends l {

    /* renamed from: h, reason: collision with root package name */
    public final ov1.a f136043h;

    /* renamed from: i, reason: collision with root package name */
    public final z61.b f136044i;

    /* renamed from: j, reason: collision with root package name */
    public final uk1.d f136045j;

    /* renamed from: k, reason: collision with root package name */
    public final w f136046k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f136047l;

    /* renamed from: m, reason: collision with root package name */
    public final int f136048m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f136049n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f136050o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f136051p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f136052q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ov1.a oneBarInternalModuleListener, z61.b bVar, uk1.d presenterPinalytics, w eventManager, boolean z13, int i13, k2 oneBarLibraryExperiments) {
        super(presenterPinalytics, z13);
        boolean z14;
        g1 g1Var;
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(oneBarInternalModuleListener, "oneBarInternalModuleListener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(oneBarLibraryExperiments, "oneBarLibraryExperiments");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f136043h = oneBarInternalModuleListener;
        this.f136044i = bVar;
        this.f136045j = presenterPinalytics;
        this.f136046k = eventManager;
        this.f136047l = z13;
        this.f136048m = i13;
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        boolean z15 = true;
        this.f136050o = Intrinsics.d(f13 != null ? f13.G2() : null, "US") && !hf0.b.q();
        oneBarLibraryExperiments.getClass();
        z3 z3Var = a4.f83298b;
        z0 z0Var = oneBarLibraryExperiments.f83403a;
        g1 g1Var2 = (g1) z0Var;
        if ((g1Var2.o("android_search_sticky_guides_tablet", "enabled", z3Var) || g1Var2.l("android_search_sticky_guides_tablet")) && hf0.b.q()) {
            wy0 f14 = ((b60.d) com.bumptech.glide.d.E()).f();
            if (Intrinsics.d(f14 != null ? f14.G2() : null, "US")) {
                z14 = true;
                this.f136051p = z14;
                g1Var = (g1) z0Var;
                if (!g1Var.o("android_search_sticky_guides_iterated_entered_query", "enabled", z3Var) && !g1Var.l("android_search_sticky_guides_iterated_entered_query")) {
                    z15 = false;
                }
                this.f136052q = z15;
            }
        }
        z14 = false;
        this.f136051p = z14;
        g1Var = (g1) z0Var;
        if (!g1Var.o("android_search_sticky_guides_iterated_entered_query", "enabled", z3Var)) {
            z15 = false;
        }
        this.f136052q = z15;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x043d  */
    @Override // xv1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r3(boolean r66) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xv1.g.r3(boolean):void");
    }
}
