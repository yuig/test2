package com.pinterest.feature.home.viewpager;

import android.content.Context;
import com.pinterest.framework.screens.ScreenDescription;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes.dex */
public final class a extends jr.a {

    /* renamed from: n, reason: collision with root package name */
    public final Context f45882n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f45883o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(il1.b r8, android.content.Context r9, lh0.p1 r10) {
        /*
            r7 = this;
            java.lang.String r0 = "screenFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "experiments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            lh0.z3 r0 = lh0.a4.f83298b
            lh0.z0 r10 = r10.f83456a
            r1 = r10
            lh0.g1 r1 = (lh0.g1) r1
            java.lang.String r2 = "android_hf_computation_reduction"
            java.lang.String r3 = "enabled"
            boolean r4 = r1.o(r2, r3, r0)
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L2b
            boolean r1 = r1.l(r2)
            if (r1 == 0) goto L29
            goto L2b
        L29:
            r1 = r5
            goto L2c
        L2b:
            r1 = r6
        L2c:
            r1 = r1 ^ r6
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.<init>(r8, r1)
            r7.f45882n = r9
            lh0.g1 r10 = (lh0.g1) r10
            boolean r8 = r10.o(r2, r3, r0)
            if (r8 != 0) goto L44
            boolean r8 = r10.l(r2)
            if (r8 == 0) goto L45
        L44:
            r5 = r6
        L45:
            r7.f45883o = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.home.viewpager.a.<init>(il1.b, android.content.Context, lh0.p1):void");
    }

    public static boolean H(kl1.a aVar) {
        return kl1.a.HomeTabKey == aVar;
    }

    @Override // jr.a, xa.a
    public final int c(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        if (this.f77529f.isEmpty()) {
            return -1;
        }
        return super.c(object);
    }

    @Override // xa.a
    public final CharSequence d(int i13) {
        String string = this.f45882n.getResources().getString(i13 == 0 ? x0.home_tab_browse : x0.home_tab_watch);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // jr.a
    public final boolean z(ScreenDescription screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return Intrinsics.d(screen.getScreenClass(), ViewPagerLoadingFragment.class);
    }
}
