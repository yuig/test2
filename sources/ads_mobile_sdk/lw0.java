package ads_mobile_sdk;

import ao2.j0;
import java.util.Map;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class lw0 implements a.x5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8005a;

    /* renamed from: b, reason: collision with root package name */
    private final r0 f8006b;

    /* renamed from: c, reason: collision with root package name */
    private final ss2 f8007c;

    /* renamed from: d, reason: collision with root package name */
    private final Optional f8008d;

    /* renamed from: e, reason: collision with root package name */
    private final n1 f8009e;

    /* renamed from: f, reason: collision with root package name */
    private final f80 f8010f;

    /* renamed from: g, reason: collision with root package name */
    private final rw1 f8011g;

    /* renamed from: h, reason: collision with root package name */
    private final ed2 f8012h;

    /* renamed from: i, reason: collision with root package name */
    public wi.b0 f8013i;

    public lw0(String adId, r0 adConfiguration, vo commonConfiguration, ss2 traceMetaSet, Optional gmaWebView, n1 adEventEmitter, f80 delegatingAdEventListener, rw1 phantomReferences, ed2 safeBrowsingManager) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(delegatingAdEventListener, "delegatingAdEventListener");
        Intrinsics.checkNotNullParameter(phantomReferences, "phantomReferences");
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        this.f8005a = adId;
        this.f8006b = adConfiguration;
        this.f8007c = traceMetaSet;
        this.f8008d = gmaWebView;
        this.f8009e = adEventEmitter;
        this.f8010f = delegatingAdEventListener;
        this.f8011g = phantomReferences;
        this.f8012h = safeBrowsingManager;
        a().f11218d.f5405b = d();
        a().f11218d.f5406c = b().f10356a0;
    }

    @Override // a.x5
    public final ss2 a() {
        return this.f8007c;
    }

    @Override // a.x5
    public final r0 b() {
        return this.f8006b;
    }

    public final String d() {
        return this.f8005a;
    }

    public final void destroy() {
        n1 n1Var = this.f8009e;
        if (n1Var.f8495f.getAndSet(true)) {
            return;
        }
        for (Map.Entry entry : n1Var.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            j0 j0Var = n1Var.f12971a;
            b1 block = new b1("onAdDestroyed", str, value, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
    }

    public final f80 f() {
        return this.f8010f;
    }

    public final wi.b0 getResponseInfo() {
        wi.b0 b0Var = this.f8013i;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.r("responseInfo");
        throw null;
    }

    @Override // a.x5
    public Object a(bl2.c cVar) {
        return a(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.lw0 r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.kw0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.kw0 r0 = (ads_mobile_sdk.kw0) r0
            int r1 = r0.f7553d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7553d = r1
            goto L18
        L13:
            ads_mobile_sdk.kw0 r0 = new ads_mobile_sdk.kw0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f7551b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f7553d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r6)
            goto L58
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            ads_mobile_sdk.lw0 r5 = r0.f7550a
            ue.c.H(r6)
            goto L48
        L38:
            ue.c.H(r6)
            ads_mobile_sdk.n1 r6 = r5.f8009e
            r0.f7550a = r5
            r0.f7553d = r4
            java.lang.Object r6 = r6.i(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            ads_mobile_sdk.rw1 r6 = r5.f8011g
            ads_mobile_sdk.ed2 r2 = r5.f8012h
            r4 = 0
            r0.f7550a = r4
            r0.f7553d = r3
            java.lang.Object r5 = r6.a(r5, r2, r0)
            if (r5 != r1) goto L58
            return r1
        L58:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lw0.a(ads_mobile_sdk.lw0, bl2.c):java.lang.Object");
    }

    @Override // a.x5
    public final void a(wi.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        this.f8013i = b0Var;
    }
}
