package z70;

import android.graphics.Bitmap;
import android.util.Pair;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import lh0.s0;
import so.r5;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.n f141001a;

    /* renamed from: b, reason: collision with root package name */
    public final f f141002b;

    /* renamed from: c, reason: collision with root package name */
    public final p f141003c;

    /* renamed from: d, reason: collision with root package name */
    public final r5 f141004d;

    /* renamed from: e, reason: collision with root package name */
    public final k f141005e;

    /* renamed from: f, reason: collision with root package name */
    public final wk2.a f141006f;

    /* renamed from: g, reason: collision with root package name */
    public final y70.e f141007g;

    /* renamed from: h, reason: collision with root package name */
    public final s0 f141008h;

    /* renamed from: i, reason: collision with root package name */
    public final o f141009i;

    /* renamed from: j, reason: collision with root package name */
    public Bitmap f141010j;

    public m(androidx.appcompat.app.n context, f chromeLifecycleSettings, p chromeTabSupportedCheck, r5 clickThroughSessionFactory, k chromeTabBottomBarHelper, bf2.d chromeSessionManagerProvider, y70.e chromeEventLogger, s0 experiments, o chromeTabStatus) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(chromeLifecycleSettings, "chromeLifecycleSettings");
        Intrinsics.checkNotNullParameter(chromeTabSupportedCheck, "chromeTabSupportedCheck");
        Intrinsics.checkNotNullParameter(clickThroughSessionFactory, "clickThroughSessionFactory");
        Intrinsics.checkNotNullParameter(chromeTabBottomBarHelper, "chromeTabBottomBarHelper");
        Intrinsics.checkNotNullParameter(chromeSessionManagerProvider, "chromeSessionManagerProvider");
        Intrinsics.checkNotNullParameter(chromeEventLogger, "chromeEventLogger");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(chromeTabStatus, "chromeTabStatus");
        this.f141001a = context;
        this.f141002b = chromeLifecycleSettings;
        this.f141003c = chromeTabSupportedCheck;
        this.f141004d = clickThroughSessionFactory;
        this.f141005e = chromeTabBottomBarHelper;
        this.f141006f = chromeSessionManagerProvider;
        this.f141007g = chromeEventLogger;
        this.f141008h = experiments;
        this.f141009i = chromeTabStatus;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0575 A[Catch: SecurityException -> 0x058f, ActivityNotFoundException -> 0x0591, TryCatch #2 {ActivityNotFoundException -> 0x0591, SecurityException -> 0x058f, blocks: (B:89:0x054c, B:91:0x0575, B:92:0x0593), top: B:88:0x054c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(z70.m r92, java.lang.String r93, java.lang.String r94, java.lang.String r95, java.lang.String r96, boolean r97, java.util.HashMap r98, java.lang.String r99, boolean r100, h32.c1 r101, boolean r102, boolean r103, h32.c1 r104, boolean r105, pu.f0 r106, kotlin.jvm.functions.Function0 r107, int r108) {
        /*
            Method dump skipped, instructions count: 1459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z70.m.f(z70.m, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.HashMap, java.lang.String, boolean, h32.c1, boolean, boolean, h32.c1, boolean, pu.f0, kotlin.jvm.functions.Function0, int):void");
    }

    public final void a() {
        boolean z13 = this.f141002b.f140992a;
    }

    public final void b() {
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.l(new Pair("ChromeTabHelper", "end"));
        this.f141009i.f141017a = false;
    }

    public final void c() {
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.l(new Pair("ChromeTabHelper", "start"));
        this.f141009i.f141017a = true;
    }

    public final boolean d() {
        return this.f141003c.f141018a.f140992a;
    }

    public final boolean e() {
        return this.f141009i.f141017a;
    }
}
