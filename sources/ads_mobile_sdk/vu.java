package ads_mobile_sdk;

import a.q2;
import android.content.Context;
import ao2.j0;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.chromium.net.CronetProvider;

/* loaded from: classes2.dex */
public final class vu extends a.l3 {

    /* renamed from: d, reason: collision with root package name */
    public final Context f12653d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f12654e;

    /* renamed from: f, reason: collision with root package name */
    public final oh0 f12655f;

    /* renamed from: g, reason: collision with root package name */
    public final yp0 f12656g;

    /* renamed from: h, reason: collision with root package name */
    public final sb2 f12657h;

    /* renamed from: i, reason: collision with root package name */
    public final q2 f12658i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu(Context context, j0 backgroundScope, oh0 flags, yp0 httpClient, sb2 rootTraceCreator, q2 userAgentProvider) {
        super(null, false, 4);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        this.f12653d = context;
        this.f12654e = backgroundScope;
        this.f12655f = flags;
        this.f12656g = httpClient;
        this.f12657h = rootTraceCreator;
        this.f12658i = userAgentProvider;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(14:5|6|7|(1:(3:10|11|12)(2:33|34))(3:35|36|(2:38|39))|13|(1:15)|16|(1:18)|19|(1:21)|22|(1:24)|25|(3:27|28|29)(2:31|32)))|43|6|7|(0)(0)|13|(0)|16|(0)|19|(0)|22|(0)|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015f, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0167, code lost:
    
        ((ao2.w) r12).Q(new ads_mobile_sdk.kk0(r10, r4, "Exception caught building cronet engine", 2));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2 A[Catch: all -> 0x015f, TryCatch #0 {all -> 0x015f, blocks: (B:11:0x0031, B:13:0x005c, B:15:0x00b2, B:16:0x00c6, B:18:0x00ec, B:19:0x00f1, B:21:0x0108, B:22:0x010b, B:24:0x011b, B:25:0x011e, B:27:0x0141, B:31:0x0161, B:32:0x0166, B:36:0x0044), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec A[Catch: all -> 0x015f, TryCatch #0 {all -> 0x015f, blocks: (B:11:0x0031, B:13:0x005c, B:15:0x00b2, B:16:0x00c6, B:18:0x00ec, B:19:0x00f1, B:21:0x0108, B:22:0x010b, B:24:0x011b, B:25:0x011e, B:27:0x0141, B:31:0x0161, B:32:0x0166, B:36:0x0044), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0108 A[Catch: all -> 0x015f, TryCatch #0 {all -> 0x015f, blocks: (B:11:0x0031, B:13:0x005c, B:15:0x00b2, B:16:0x00c6, B:18:0x00ec, B:19:0x00f1, B:21:0x0108, B:22:0x010b, B:24:0x011b, B:25:0x011e, B:27:0x0141, B:31:0x0161, B:32:0x0166, B:36:0x0044), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011b A[Catch: all -> 0x015f, TryCatch #0 {all -> 0x015f, blocks: (B:11:0x0031, B:13:0x005c, B:15:0x00b2, B:16:0x00c6, B:18:0x00ec, B:19:0x00f1, B:21:0x0108, B:22:0x010b, B:24:0x011b, B:25:0x011e, B:27:0x0141, B:31:0x0161, B:32:0x0166, B:36:0x0044), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0141 A[Catch: all -> 0x015f, TryCatch #0 {all -> 0x015f, blocks: (B:11:0x0031, B:13:0x005c, B:15:0x00b2, B:16:0x00c6, B:18:0x00ec, B:19:0x00f1, B:21:0x0108, B:22:0x010b, B:24:0x011b, B:25:0x011e, B:27:0x0141, B:31:0x0161, B:32:0x0166, B:36:0x0044), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0161 A[Catch: all -> 0x015f, TryCatch #0 {all -> 0x015f, blocks: (B:11:0x0031, B:13:0x005c, B:15:0x00b2, B:16:0x00c6, B:18:0x00ec, B:19:0x00f1, B:21:0x0108, B:22:0x010b, B:24:0x011b, B:25:0x011e, B:27:0x0141, B:31:0x0161, B:32:0x0166, B:36:0x0044), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.vu r10, org.chromium.net.CronetProvider r11, ao2.v r12, bl2.c r13) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vu.a(ads_mobile_sdk.vu, org.chromium.net.CronetProvider, ao2.v, bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.yr0
    public final Object e(bl2.c cVar) {
        return a(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x012d A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002b, B:13:0x0127, B:15:0x012d, B:16:0x0147, B:18:0x014d, B:24:0x013e, B:26:0x0142), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014d A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002b, B:13:0x0127, B:15:0x012d, B:16:0x0147, B:18:0x014d, B:24:0x013e, B:26:0x0142), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013e A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002b, B:13:0x0127, B:15:0x012d, B:16:0x0147, B:18:0x014d, B:24:0x013e, B:26:0x0142), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0163 A[Catch: all -> 0x0173, TryCatch #3 {all -> 0x0173, blocks: (B:29:0x015c, B:31:0x0163, B:33:0x016a, B:35:0x016e, B:37:0x0172, B:38:0x0175, B:39:0x017a, B:40:0x017b, B:41:0x0182, B:42:0x0183, B:43:0x018a, B:44:0x018b), top: B:28:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018b A[Catch: all -> 0x0173, TRY_LEAVE, TryCatch #3 {all -> 0x0173, blocks: (B:29:0x015c, B:31:0x0163, B:33:0x016a, B:35:0x016e, B:37:0x0172, B:38:0x0175, B:39:0x017a, B:40:0x017b, B:41:0x0182, B:42:0x0183, B:43:0x018a, B:44:0x018b), top: B:28:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d A[Catch: all -> 0x0043, TryCatch #2 {all -> 0x0043, blocks: (B:57:0x003f, B:58:0x0097, B:60:0x009d, B:61:0x00b7, B:63:0x00bd, B:66:0x00ae, B:68:0x00b2), top: B:56:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #2 {all -> 0x0043, blocks: (B:57:0x003f, B:58:0x0097, B:60:0x009d, B:61:0x00b7, B:63:0x00bd, B:66:0x00ae, B:68:0x00b2), top: B:56:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae A[Catch: all -> 0x0043, TryCatch #2 {all -> 0x0043, blocks: (B:57:0x003f, B:58:0x0097, B:60:0x009d, B:61:0x00b7, B:63:0x00bd, B:66:0x00ae, B:68:0x00b2), top: B:56:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2 A[Catch: all -> 0x00e2, TryCatch #1 {all -> 0x00e2, blocks: (B:71:0x00cb, B:73:0x00d2, B:75:0x00d9, B:77:0x00dd, B:79:0x00e1, B:80:0x00e4, B:81:0x00e9, B:82:0x00ea, B:83:0x00f1, B:84:0x00f2, B:85:0x00f9, B:86:0x00fa), top: B:70:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa A[Catch: all -> 0x00e2, TRY_LEAVE, TryCatch #1 {all -> 0x00e2, blocks: (B:71:0x00cb, B:73:0x00d2, B:75:0x00d9, B:77:0x00dd, B:79:0x00e1, B:80:0x00e4, B:81:0x00e9, B:82:0x00ea, B:83:0x00f1, B:84:0x00f2, B:85:0x00f9, B:86:0x00fa), top: B:70:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(bl2.c r13) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vu.f(bl2.c):java.lang.Object");
    }

    public static final void a(ao2.v cronetDeferred, vu this$0, Task task) {
        Object obj;
        Intrinsics.checkNotNullParameter(cronetDeferred, "$cronetDeferred");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(task, "task");
        yx0 yx0Var = null;
        byte b13 = 0;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            if (exception != null) {
                ((ao2.w) cronetDeferred).Q(new kk0(exception, yx0Var, b13 == true ? 1 : 0, 6));
                return;
            } else {
                ((ao2.w) cronetDeferred).Q(new nk0("CronetProviderInstaller failed without an exception.", yx0.f14443a));
                return;
            }
        }
        List<CronetProvider> allProviders = CronetProvider.getAllProviders(this$0.f12653d);
        Intrinsics.checkNotNullExpressionValue(allProviders, "getAllProviders(...)");
        Iterator<T> it = allProviders.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            CronetProvider cronetProvider = (CronetProvider) obj;
            if (cronetProvider.isEnabled() && !Intrinsics.d(cronetProvider.getName(), CronetProvider.PROVIDER_NAME_FALLBACK)) {
                String name = cronetProvider.getName();
                oh0 oh0Var = this$0.f12655f;
                jh0 jh0Var = oh0.f9294r;
                if (Intrinsics.d(name, (String) oh0Var.a("gads:cronet_provider", "", jh0Var)) || z.j((String) this$0.f12655f.a("gads:cronet_provider", "", jh0Var))) {
                    break;
                }
            }
        }
        CronetProvider cronetProvider2 = (CronetProvider) obj;
        if (cronetProvider2 == null) {
            ((ao2.w) cronetDeferred).Q(new nk0("No available cronet provider", yx0.f14443a));
            return;
        }
        j0 j0Var = this$0.f12654e;
        su block = new su(this$0, cronetProvider2, cronetDeferred, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.vu r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.uu
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.uu r0 = (ads_mobile_sdk.uu) r0
            int r1 = r0.f12192d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12192d = r1
            goto L18
        L13:
            ads_mobile_sdk.uu r0 = new ads_mobile_sdk.uu
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f12190b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12192d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r8)
            goto L79
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            ads_mobile_sdk.vu r7 = r0.f12189a
            ue.c.H(r8)
            goto L6d
        L38:
            ue.c.H(r8)
            ads_mobile_sdk.oh0 r8 = r7.f12655f
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            ads_mobile_sdk.wg0 r5 = ads_mobile_sdk.oh0.f9281e
            java.lang.String r6 = "gads:use_cronet_if_available"
            java.lang.Object r8 = r8.a(r6, r2, r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L79
            ads_mobile_sdk.oh0 r8 = r7.f12655f
            r8.getClass()
            zn2.a r2 = zn2.b.f142311b
            zn2.d r2 = zn2.d.MINUTES
            long r5 = dl2.b.P2(r4, r2)
            java.lang.String r2 = "gads:cronet_install_delay_secs"
            long r5 = r8.b(r5, r2)
            r0.f12189a = r7
            r0.f12192d = r4
            java.lang.Object r8 = lb.l0.T(r5, r0)
            if (r8 != r1) goto L6d
            return r1
        L6d:
            r8 = 0
            r0.f12189a = r8
            r0.f12192d = r3
            java.lang.Object r7 = r7.f(r0)
            if (r7 != r1) goto L79
            return r1
        L79:
            ads_mobile_sdk.pk0 r7 = new ads_mobile_sdk.pk0
            kotlin.Unit r8 = kotlin.Unit.f80348a
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vu.a(ads_mobile_sdk.vu, bl2.c):java.lang.Object");
    }
}
