package ads_mobile_sdk;

import android.content.Context;
import android.content.res.Resources;
import bj.n;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import nm.s;

/* loaded from: classes2.dex */
public final class uf1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12062a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f12063b;

    /* renamed from: c, reason: collision with root package name */
    public final dj1 f12064c;

    /* renamed from: d, reason: collision with root package name */
    public final oj1 f12065d;

    /* renamed from: e, reason: collision with root package name */
    public final n f12066e;

    public uf1(Context context, CoroutineContext backgroundContext, dj1 nativeAssetsLoader, oj1 nativeCustomAssetsLoader, n nativeRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundContext, "backgroundContext");
        Intrinsics.checkNotNullParameter(nativeAssetsLoader, "nativeAssetsLoader");
        Intrinsics.checkNotNullParameter(nativeCustomAssetsLoader, "nativeCustomAssetsLoader");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        this.f12062a = context;
        this.f12063b = backgroundContext;
        this.f12064c = nativeAssetsLoader;
        this.f12065d = nativeCustomAssetsLoader;
        this.f12066e = nativeRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #2 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x0052, B:14:0x0058), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[Catch: all -> 0x007e, TryCatch #3 {all -> 0x007e, blocks: (B:21:0x0067, B:23:0x006e, B:25:0x0075, B:27:0x0079, B:29:0x007d, B:30:0x0080, B:31:0x0085, B:32:0x0086, B:33:0x008d, B:34:0x008e, B:35:0x0095, B:36:0x0096), top: B:20:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #3 {all -> 0x007e, blocks: (B:21:0x0067, B:23:0x006e, B:25:0x0075, B:27:0x0079, B:29:0x007d, B:30:0x0080, B:31:0x0085, B:32:0x0086, B:33:0x008d, B:34:0x008e, B:35:0x0095, B:36:0x0096), top: B:20:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.r0 r5, nm.u r6, bl2.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.jf1
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.jf1 r0 = (ads_mobile_sdk.jf1) r0
            int r1 = r0.f6783e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6783e = r1
            goto L18
        L13:
            ads_mobile_sdk.jf1 r0 = new ads_mobile_sdk.jf1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f6781c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6783e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            ads_mobile_sdk.cs2 r5 = r0.f6780b
            ads_mobile_sdk.cs2 r6 = r0.f6779a
            ue.c.H(r7)     // Catch: java.lang.Throwable -> L2b
            goto L52
        L2b:
            r7 = move-exception
            goto L67
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            ue.c.H(r7)
            ads_mobile_sdk.il0 r7 = ads_mobile_sdk.il0.CUI_NAME_LOAD_NATIVE_ASSETS
            java.util.WeakHashMap r2 = ads_mobile_sdk.qs2.f10249a
            kotlin.collections.q0 r2 = kotlin.collections.q0.f80391a
            ads_mobile_sdk.cs2 r7 = ads_mobile_sdk.qs2.a(r7, r2, r3)
            r0.f6779a = r7     // Catch: java.lang.Throwable -> L63
            r0.f6780b = r7     // Catch: java.lang.Throwable -> L63
            r0.f6783e = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r5 = r4.b(r5, r6, r0)     // Catch: java.lang.Throwable -> L63
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r6 = r7
            r7 = r5
            r5 = r6
        L52:
            a.ad r7 = (a.ad) r7     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r7 instanceof ads_mobile_sdk.jk0     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L5e
            r0 = r7
            ads_mobile_sdk.jk0 r0 = (ads_mobile_sdk.jk0) r0     // Catch: java.lang.Throwable -> L2b
            ads_mobile_sdk.ft2.a(r0)     // Catch: java.lang.Throwable -> L2b
        L5e:
            r6 = 0
            dl2.b.J(r5, r6)
            return r7
        L63:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r6
        L67:
            r6.b(r7)     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r7 instanceof a.jf     // Catch: java.lang.Throwable -> L7e
            if (r0 != 0) goto L96
            r6.a(r7)     // Catch: java.lang.Throwable -> L7e
            boolean r6 = r7 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L8e
            boolean r6 = r7 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L86
            boolean r6 = r7 instanceof ads_mobile_sdk.uk0     // Catch: java.lang.Throwable -> L7e
            if (r6 == 0) goto L80
            throw r7     // Catch: java.lang.Throwable -> L7e
        L7e:
            r6 = move-exception
            goto L97
        L80:
            ads_mobile_sdk.dk0 r6 = new ads_mobile_sdk.dk0     // Catch: java.lang.Throwable -> L7e
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L7e
            throw r6     // Catch: java.lang.Throwable -> L7e
        L86:
            ads_mobile_sdk.yj0 r6 = new ads_mobile_sdk.yj0     // Catch: java.lang.Throwable -> L7e
            java.util.concurrent.CancellationException r7 = (java.util.concurrent.CancellationException) r7     // Catch: java.lang.Throwable -> L7e
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L7e
            throw r6     // Catch: java.lang.Throwable -> L7e
        L8e:
            ads_mobile_sdk.xl0 r6 = new ads_mobile_sdk.xl0     // Catch: java.lang.Throwable -> L7e
            kotlinx.coroutines.TimeoutCancellationException r7 = (kotlinx.coroutines.TimeoutCancellationException) r7     // Catch: java.lang.Throwable -> L7e
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L7e
            throw r6     // Catch: java.lang.Throwable -> L7e
        L96:
            throw r7     // Catch: java.lang.Throwable -> L7e
        L97:
            throw r6     // Catch: java.lang.Throwable -> L98
        L98:
            r7 = move-exception
            dl2.b.J(r5, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.uf1.a(ads_mobile_sdk.r0, nm.u, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ads_mobile_sdk.r0 r5, nm.u r6, bl2.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.kf1
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.kf1 r0 = (ads_mobile_sdk.kf1) r0
            int r1 = r0.f7286d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7286d = r1
            goto L18
        L13:
            ads_mobile_sdk.kf1 r0 = new ads_mobile_sdk.kf1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f7284b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f7286d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ads_mobile_sdk.if1 r5 = r0.f7283a
            ue.c.H(r7)     // Catch: ads_mobile_sdk.uk0 -> L29
            goto L61
        L29:
            r5 = move-exception
            goto L67
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ue.c.H(r7)
            ads_mobile_sdk.if1 r7 = new ads_mobile_sdk.if1
            r7.<init>()
            android.content.Context r2 = r4.f12062a
            a.ad r5 = r4.a(r2, r7, r5, r6)
            boolean r2 = r5 instanceof ads_mobile_sdk.jk0
            if (r2 == 0) goto L48
            ads_mobile_sdk.jk0 r5 = (ads_mobile_sdk.jk0) r5
            return r5
        L48:
            java.lang.String r2 = "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>"
            kotlin.jvm.internal.Intrinsics.g(r5, r2)
            ads_mobile_sdk.pk0 r5 = (ads_mobile_sdk.pk0) r5
            ads_mobile_sdk.tf1 r5 = new ads_mobile_sdk.tf1     // Catch: ads_mobile_sdk.uk0 -> L29
            r2 = 0
            r5.<init>(r7, r4, r6, r2)     // Catch: ads_mobile_sdk.uk0 -> L29
            r0.f7283a = r7     // Catch: ads_mobile_sdk.uk0 -> L29
            r0.f7286d = r3     // Catch: ads_mobile_sdk.uk0 -> L29
            java.lang.Object r5 = dl2.b.O(r5, r0)     // Catch: ads_mobile_sdk.uk0 -> L29
            if (r5 != r1) goto L60
            return r1
        L60:
            r5 = r7
        L61:
            ads_mobile_sdk.pk0 r6 = new ads_mobile_sdk.pk0
            r6.<init>(r5)
            return r6
        L67:
            ads_mobile_sdk.jk0 r5 = r5.f12098a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.uf1.b(ads_mobile_sdk.r0, nm.u, bl2.c):java.lang.Object");
    }

    public final a.ad a(Context context, if1 if1Var, r0 r0Var, nm.u uVar) {
        String p13;
        String p14;
        String p15;
        String p16;
        String p17;
        String str;
        int a13 = k41.a(uVar, "template_id", -1);
        if1Var.f6368a = a13;
        if (a13 == 3) {
            if1Var.f6369b = gf1.f5555b;
        } else {
            if (a13 != 6) {
                return new nk0("Invalid native ad template id!");
            }
            if1Var.f6369b = gf1.f5554a;
        }
        s v13 = uVar.v("custom_template_id");
        String p18 = v13 != null ? v13.p() : null;
        if1Var.f6370c = p18;
        if (if1Var.f6369b == gf1.f5555b && p18 == null) {
            return new nk0("No custom template id for custom template ad response.");
        }
        if1Var.f6372e = Double.valueOf(Double.parseDouble(k41.a(uVar, "rating", "-1.0")));
        s v14 = uVar.v("headline");
        String p19 = v14 != null ? v14.p() : null;
        if (r0Var.Y) {
            int i13 = io2.f6511a;
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                str = context.getResources().getString(ui.a.test_ad);
                Intrinsics.f(str);
            } catch (Resources.NotFoundException unused) {
                str = "Test Ad";
            }
            p19 = a.a.D(str, ": ", p19);
        }
        if (p19 != null) {
            if1Var.f6371d.put("headline", p19);
        }
        s v15 = uVar.v("body");
        if (v15 != null && (p17 = v15.p()) != null) {
            if1Var.f6371d.put("body", p17);
        }
        s v16 = uVar.v("call_to_action");
        if (v16 != null && (p16 = v16.p()) != null) {
            if1Var.f6371d.put("call_to_action", p16);
        }
        s v17 = uVar.v("store");
        if (v17 != null && (p15 = v17.p()) != null) {
            if1Var.f6371d.put("store", p15);
        }
        s v18 = uVar.v("price");
        if (v18 != null && (p14 = v18.p()) != null) {
            if1Var.f6371d.put("price", p14);
        }
        s v19 = uVar.v("advertiser");
        if (v19 != null && (p13 = v19.p()) != null) {
            if1Var.f6371d.put("advertiser", p13);
        }
        if1Var.f6388u = this.f12066e.e();
        return new pk0(Unit.f80348a);
    }
}
