package ads_mobile_sdk;

import a.zb;
import android.content.Context;
import ao2.j0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class z6 {

    /* renamed from: n, reason: collision with root package name */
    public static final List f14642n = kotlin.collections.f0.j("com.google.ads.mediation.admob.AdMobAdapter", "com.google.ads.mediation.admob.AdMobCustomTabsAdapter");

    /* renamed from: a, reason: collision with root package name */
    public final j0 f14643a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f14644b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f14645c;

    /* renamed from: d, reason: collision with root package name */
    public final a.fe f14646d;

    /* renamed from: e, reason: collision with root package name */
    public final a.j1 f14647e;

    /* renamed from: f, reason: collision with root package name */
    public final x f14648f;

    /* renamed from: g, reason: collision with root package name */
    public final eg f14649g;

    /* renamed from: h, reason: collision with root package name */
    public final zb f14650h;

    /* renamed from: i, reason: collision with root package name */
    public final oh0 f14651i;

    /* renamed from: j, reason: collision with root package name */
    public final sb2 f14652j;

    /* renamed from: k, reason: collision with root package name */
    public a.d0 f14653k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14654l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f14655m;

    public z6(j0 backgroundScope, CoroutineContext uiContext, Context applicationContext, a.fe mediationAdapterProxyFactory, a.j1 adapterStatusMapUpdater, x activityTracker, eg appState, zb clock, oh0 flags, sb2 rootTraceCreator) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(mediationAdapterProxyFactory, "mediationAdapterProxyFactory");
        Intrinsics.checkNotNullParameter(adapterStatusMapUpdater, "adapterStatusMapUpdater");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.f14643a = backgroundScope;
        this.f14644b = uiContext;
        this.f14645c = applicationContext;
        this.f14646d = mediationAdapterProxyFactory;
        this.f14647e = adapterStatusMapUpdater;
        this.f14648f = activityTracker;
        this.f14649g = appState;
        this.f14650h = clock;
        this.f14651i = flags;
        this.f14652j = rootTraceCreator;
        this.f14655m = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bb A[Catch: all -> 0x003c, TryCatch #4 {all -> 0x003c, blocks: (B:11:0x0037, B:12:0x00b5, B:14:0x00bb, B:15:0x00c1, B:17:0x00c5, B:23:0x0119, B:29:0x011b, B:30:0x011c, B:32:0x011d, B:34:0x0121, B:19:0x00c6, B:21:0x00d0, B:22:0x00d8), top: B:10:0x0037, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c5 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #4 {all -> 0x003c, blocks: (B:11:0x0037, B:12:0x00b5, B:14:0x00bb, B:15:0x00c1, B:17:0x00c5, B:23:0x0119, B:29:0x011b, B:30:0x011c, B:32:0x011d, B:34:0x0121, B:19:0x00c6, B:21:0x00d0, B:22:0x00d8), top: B:10:0x0037, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0121 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #4 {all -> 0x003c, blocks: (B:11:0x0037, B:12:0x00b5, B:14:0x00bb, B:15:0x00c1, B:17:0x00c5, B:23:0x0119, B:29:0x011b, B:30:0x011c, B:32:0x011d, B:34:0x0121, B:19:0x00c6, B:21:0x00d0, B:22:0x00d8), top: B:10:0x0037, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0136 A[Catch: all -> 0x0146, TryCatch #2 {all -> 0x0146, blocks: (B:39:0x012f, B:41:0x0136, B:43:0x013d, B:45:0x0141, B:47:0x0145, B:48:0x0149, B:49:0x014e, B:50:0x014f, B:51:0x0156, B:52:0x0157, B:53:0x015e, B:54:0x015f), top: B:38:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f A[Catch: all -> 0x0146, TRY_LEAVE, TryCatch #2 {all -> 0x0146, blocks: (B:39:0x012f, B:41:0x0136, B:43:0x013d, B:45:0x0141, B:47:0x0145, B:48:0x0149, B:49:0x014e, B:50:0x014f, B:51:0x0156, B:52:0x0157, B:53:0x015e, B:54:0x015f), top: B:38:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.z6 r16, java.lang.String r17, ads_mobile_sdk.n6 r18, bl2.c r19) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.z6.a(ads_mobile_sdk.z6, java.lang.String, ads_mobile_sdk.n6, bl2.c):java.lang.Object");
    }

    public final Map a() {
        Map B;
        synchronized (this) {
            B = Util.B(this.f14655m);
        }
        return B;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0128 A[Catch: all -> 0x0138, TryCatch #4 {all -> 0x0138, blocks: (B:98:0x0121, B:100:0x0128, B:102:0x012f, B:104:0x0133, B:106:0x0137, B:107:0x013a, B:108:0x013f, B:109:0x0140, B:110:0x0147, B:111:0x0148, B:112:0x014f, B:113:0x0150), top: B:97:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0150 A[Catch: all -> 0x0138, TRY_LEAVE, TryCatch #4 {all -> 0x0138, blocks: (B:98:0x0121, B:100:0x0128, B:102:0x012f, B:104:0x0133, B:106:0x0137, B:107:0x013a, B:108:0x013f, B:109:0x0140, B:110:0x0147, B:111:0x0148, B:112:0x014f, B:113:0x0150), top: B:97:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cc A[Catch: all -> 0x011b, LOOP:1: B:126:0x00c6->B:128:0x00cc, LOOP_END, TryCatch #8 {all -> 0x011b, blocks: (B:124:0x0062, B:125:0x00ac, B:126:0x00c6, B:128:0x00cc, B:130:0x00e1), top: B:123:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ee A[Catch: all -> 0x01fe, TryCatch #11 {all -> 0x01fe, blocks: (B:36:0x01e7, B:38:0x01ee, B:40:0x01f5, B:42:0x01f9, B:44:0x01fd, B:45:0x0200, B:46:0x0205, B:47:0x0206, B:48:0x020d, B:49:0x020e, B:50:0x0215, B:51:0x0216), top: B:35:0x01e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0216 A[Catch: all -> 0x01fe, TRY_LEAVE, TryCatch #11 {all -> 0x01fe, blocks: (B:36:0x01e7, B:38:0x01ee, B:40:0x01f5, B:42:0x01f9, B:44:0x01fd, B:45:0x0200, B:46:0x0205, B:47:0x0206, B:48:0x020d, B:49:0x020e, B:50:0x0215, B:51:0x0216), top: B:35:0x01e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0193 A[Catch: all -> 0x01e1, LOOP:0: B:66:0x018d->B:68:0x0193, LOOP_END, TryCatch #0 {all -> 0x01e1, blocks: (B:64:0x0049, B:65:0x0173, B:66:0x018d, B:68:0x0193, B:70:0x01a8), top: B:63:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.z6 r14, bl2.c r15) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.z6.a(ads_mobile_sdk.z6, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(a.w0 r11, java.lang.String r12, ads_mobile_sdk.n6 r13, bl2.c r14) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.z6.a(a.w0, java.lang.String, ads_mobile_sdk.n6, bl2.c):java.lang.Object");
    }
}
