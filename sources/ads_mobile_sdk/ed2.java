package ads_mobile_sdk;

import a.df;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ed2 implements a.q6, a.k8 {

    /* renamed from: a, reason: collision with root package name */
    public final yp0 f4819a;

    /* renamed from: b, reason: collision with root package name */
    public final h92 f4820b;

    /* renamed from: c, reason: collision with root package name */
    public final ad2 f4821c;

    /* renamed from: d, reason: collision with root package name */
    public final mo2.a f4822d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f4823e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f4824f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f4825g;

    /* renamed from: h, reason: collision with root package name */
    public final a.pe f4826h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f4827i;

    public ed2(String afmaVersion, r0 adConfiguration, cm0 gmaUtil, yp0 httpClient, h92 requestType) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String str;
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        this.f4819a = httpClient;
        this.f4820b = requestType;
        ad2 ad2Var = adConfiguration.f10374j0;
        this.f4821c = ad2Var;
        this.f4822d = mo2.d.a();
        this.f4823e = new AtomicBoolean(false);
        this.f4824f = new AtomicBoolean(false);
        this.f4825g = new AtomicBoolean(false);
        a.pe r13 = fy.r();
        r13.b();
        fy fyVar = (fy) r13.f10110b;
        fyVar.getClass();
        fyVar.type_ = 8;
        i13 = fyVar.bitField0_;
        fyVar.bitField0_ = i13 | 1;
        fs0 fs0Var = adConfiguration.H;
        String str2 = "";
        String str3 = (fs0Var == null || (str3 = fs0Var.f5265b) == null) ? "" : str3;
        r13.b();
        fy fyVar2 = (fy) r13.f10110b;
        fyVar2.getClass();
        i14 = fyVar2.bitField0_;
        fyVar2.bitField0_ = i14 | 4;
        fyVar2.url_ = str3;
        fs0 fs0Var2 = adConfiguration.H;
        if (fs0Var2 != null && (str = fs0Var2.f5265b) != null) {
            str2 = str;
        }
        r13.b();
        fy fyVar3 = (fy) r13.f10110b;
        fyVar3.getClass();
        i15 = fyVar3.bitField0_;
        fyVar3.bitField0_ = i15 | 8;
        fyVar3.pageUrl_ = str2;
        df builder = xv.r();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        pn pnVar = new pn(builder);
        pnVar.a(ad2Var.f2368a);
        Unit unit = Unit.f80348a;
        xv a13 = pnVar.a();
        r13.b();
        fy fyVar4 = (fy) r13.f10110b;
        fyVar4.getClass();
        fyVar4.creativeProperties_ = a13;
        i16 = fyVar4.bitField0_;
        fyVar4.bitField0_ = i16 | 32;
        a.fc builder2 = tx.r();
        Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder2, "builder");
        rn rnVar = new rn(builder2);
        rnVar.a(afmaVersion);
        rnVar.a(gmaUtil.c());
        tx a14 = rnVar.a();
        r13.b();
        fy fyVar5 = (fy) r13.f10110b;
        fyVar5.getClass();
        fyVar5.clientProperties_ = a14;
        i17 = fyVar5.bitField0_;
        fyVar5.bitField0_ = i17 | 8192;
        this.f4826h = r13;
        this.f4827i = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[Catch: all -> 0x009c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x009c, blocks: (B:11:0x006e, B:14:0x007c, B:15:0x0094, B:19:0x009f, B:22:0x0105, B:23:0x010d, B:25:0x0113, B:27:0x0144, B:29:0x01ce, B:30:0x01d5, B:36:0x01f0), top: B:10:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r21, ads_mobile_sdk.px r22, java.util.Map r23, bl2.c r24) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ed2.a(java.lang.String, ads_mobile_sdk.px, java.util.Map, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:18:0x007b, B:19:0x0085, B:21:0x008b, B:23:0x00b4, B:25:0x00bb, B:28:0x00c5), top: B:17:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r11) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ed2.b(bl2.c):java.lang.Object");
    }

    public final Object b(String str, bl2.c cVar) {
        this.f4825g.set(true);
        Object a13 = a(str, px.AD_RESOURCE_AUTO_CLICK_DESTINATION, kotlin.collections.z0.d(), cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // a.q6
    public final Object a(bl2.c cVar) {
        Object b13 = b(cVar);
        return b13 == cl2.a.COROUTINE_SUSPENDED ? b13 : Unit.f80348a;
    }

    public final Object a(String str, vt1 vt1Var) {
        return a(this, str, vt1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ed2 r5, java.lang.String r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.dd2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.dd2 r0 = (ads_mobile_sdk.dd2) r0
            int r1 = r0.f4244f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4244f = r1
            goto L18
        L13:
            ads_mobile_sdk.dd2 r0 = new ads_mobile_sdk.dd2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f4242d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4244f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            mo2.a r5 = r0.f4241c
            java.lang.String r6 = r0.f4240b
            ads_mobile_sdk.ed2 r0 = r0.f4239a
            ue.c.H(r7)
            goto L4e
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            ue.c.H(r7)
            mo2.a r7 = r5.f4822d
            r0.f4239a = r5
            r0.f4240b = r6
            r0.f4241c = r7
            r0.f4244f = r3
            mo2.c r7 = (mo2.c) r7
            java.lang.Object r0 = r7.f(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r5 = r7
        L4e:
            a.pe r7 = r0.f4826h     // Catch: java.lang.Throwable -> L71
            r7.b()     // Catch: java.lang.Throwable -> L71
            ads_mobile_sdk.sj0 r7 = r7.f10110b     // Catch: java.lang.Throwable -> L71
            ads_mobile_sdk.fy r7 = (ads_mobile_sdk.fy) r7     // Catch: java.lang.Throwable -> L71
            r7.getClass()     // Catch: java.lang.Throwable -> L71
            r6.getClass()     // Catch: java.lang.Throwable -> L71
            int r0 = ads_mobile_sdk.fy.r(r7)     // Catch: java.lang.Throwable -> L71
            r0 = r0 | 64
            ads_mobile_sdk.fy.t(r7, r0)     // Catch: java.lang.Throwable -> L71
            ads_mobile_sdk.fy.u(r7, r6)     // Catch: java.lang.Throwable -> L71
            mo2.c r5 = (mo2.c) r5
            r5.i(r4)
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        L71:
            r6 = move-exception
            mo2.c r5 = (mo2.c) r5
            r5.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ed2.a(ads_mobile_sdk.ed2, java.lang.String, bl2.c):java.lang.Object");
    }

    public final boolean a() {
        h92 h92Var = this.f4820b;
        return h92Var == h92.f5903i || h92Var == h92.f5901g || !this.f4821c.f2371d || this.f4824f.get();
    }
}
