package rr;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Handler;
import android.webkit.MimeTypeMap;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.lo;
import com.pinterest.api.model.so;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.vn0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0 extends d0 implements lg1.e {

    /* renamed from: g, reason: collision with root package name */
    public final ps0.m f109791g;

    /* renamed from: h, reason: collision with root package name */
    public final nx.d0 f109792h;

    /* renamed from: i, reason: collision with root package name */
    public final ag1.b f109793i;

    /* renamed from: j, reason: collision with root package name */
    public final dl1.t f109794j;

    /* renamed from: k, reason: collision with root package name */
    public final wk2.a f109795k;

    /* renamed from: l, reason: collision with root package name */
    public final i92.k f109796l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.v f109797m;

    /* renamed from: n, reason: collision with root package name */
    public tp f109798n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f109799o;

    /* renamed from: p, reason: collision with root package name */
    public String f109800p;

    /* renamed from: q, reason: collision with root package name */
    public String f109801q;

    /* renamed from: r, reason: collision with root package name */
    public so f109802r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f109803s;

    /* renamed from: t, reason: collision with root package name */
    public final lg1.h f109804t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(qr.h webhookDeeplinkUtil, ps0.m ideaPinUriPathUtil, nx.d0 pinalytics, ag1.b ideaPinComposeDataManager, dl1.t storyPinLocalDataRepository, wk2.a ideaPinWorkUtilsProvider, i92.k toastUtils) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(ideaPinUriPathUtil, "ideaPinUriPathUtil");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(ideaPinComposeDataManager, "ideaPinComposeDataManager");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(ideaPinWorkUtilsProvider, "ideaPinWorkUtilsProvider");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f109791g = ideaPinUriPathUtil;
        this.f109792h = pinalytics;
        this.f109793i = ideaPinComposeDataManager;
        this.f109794j = storyPinLocalDataRepository;
        this.f109795k = ideaPinWorkUtilsProvider;
        this.f109796l = toastUtils;
        this.f109797m = xk2.m.b(a0.f109698k);
        xk2.v b13 = xk2.m.b(a0.f109699l);
        this.f109800p = "";
        this.f109802r = lo.f39845e;
        this.f109803s = true;
        HashSet hashSet = tb0.h.f117076w;
        tb0.h hVar = tb0.g.f117075a;
        Intrinsics.checkNotNullExpressionValue(hVar, "getInstance(...)");
        this.f109804t = new lg1.h(pinalytics, hVar, (Handler) b13.getValue(), this);
    }

    public static final String g(o0 o0Var, int i13) {
        String string = o0Var.f109723a.f104940a.getContext().getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // lg1.e
    public final void D0(boolean z13) {
        qr.h hVar;
        tp tpVar;
        if (z13) {
            LinkedHashMap linkedHashMap = this.f109804t.f83267e;
            tp tpVar2 = this.f109798n;
            qr.h hVar2 = this.f109723a;
            if (tpVar2 != null) {
                for (bo0 bo0Var : tpVar2.getMediaList().getItems()) {
                    d30 photoItem = bo0Var.getPhotoItem();
                    if (photoItem != null) {
                        k01 k01Var = (k01) linkedHashMap.get(photoItem.e());
                        xk2.w Z = k01Var != null ? ig1.b.Z(hVar2.f104940a.getContext(), (float) this.f109802r.d(), ((Number) k01Var.h().f135234a).intValue(), ((Number) k01Var.h().f135235b).intValue()) : new xk2.w(null, null, null);
                        hVar = hVar2;
                        tpVar = tpVar2;
                        this.f109798n = tp.e(tpVar2, null, null, vn0.a(tpVar2.getMediaList(), kotlin.collections.e0.b(bo0.a(bo0Var, k01Var, 0L, 5000L, (Matrix) Z.f135235b, (Matrix) Z.f135236c, 0.0f, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_HERO)), 0, 0L, 0, 5000L, 14), null, null, null, null, null, null, null, null, null, 4091);
                    } else {
                        hVar = hVar2;
                        tpVar = tpVar2;
                    }
                    hVar2 = hVar;
                    tpVar2 = tpVar;
                }
            }
            qr.h hVar3 = hVar2;
            j();
            String source = this.f109800p;
            boolean z14 = this.f109799o;
            hVar3.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            sr.g gVar = hVar3.f104949j;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            us1.a aVar = gVar.f115056a;
            Activity context = aVar.getContext();
            lu1.c cVar = (lu1.c) gVar.f115058c;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intent b13 = cVar.f84972b.b(context, lu1.a.CREATION_ACTIVITY);
            b13.setFlags(603979776);
            b13.putExtra("com.pinterest.EXTRA_IS_DEEPLINK", true);
            b13.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", "story_pin_from_deep_link");
            b13.putExtra("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE", "3rd_party_deeplink");
            b13.putExtra("com.pintrest.EXTRA_DEEPLINK_SOURCE", source);
            b13.putExtra("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED", z14);
            aVar.startActivity(b13);
            aVar.g();
        }
    }

    @Override // rr.d0
    public final String a() {
        return "idea-pin-external-create";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        ((bw0.b) this.f109795k.get()).a().l(wj2.c.a()).o(new ir.h(29, new ba.s(28, uri, this)), new n0(0, new tq.a0(this, 10)));
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!Intrinsics.d(uri.getScheme(), "pinterest")) {
            Intrinsics.checkNotNullExpressionValue(uri.getPathSegments(), "getPathSegments(...)");
            if ((!r0.isEmpty()) && (n60.o.x(uri, 0, "idea-pin-external-create") || n60.o.x(uri, 0, "pin-external-create"))) {
                return true;
            }
        } else if (Intrinsics.d(uri.getHost(), "idea-pin-external-create") || Intrinsics.d(uri.getHost(), "pin-external-create")) {
            return true;
        }
        return false;
    }

    public final HashMap h() {
        return (HashMap) this.f109797m.getValue();
    }

    public final String i(Uri uri) {
        if (Intrinsics.d("content", uri.getScheme())) {
            return this.f109723a.f104940a.getContext().getContentResolver().getType(uri);
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        Intrinsics.f(fileExtensionFromUrl);
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x001f, code lost:
    
        if (r1.compareTo(r2) > 0) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r34 = this;
            r0 = r34
            java.lang.String r1 = "toString(...)"
            java.lang.String r3 = a.cb.g(r1)
            com.pinterest.api.model.so r1 = r0.f109802r
            java.lang.String r2 = "aspectRatio"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.pinterest.api.model.lo r2 = com.pinterest.api.model.lo.f39845e
            int r4 = r1.compareTo(r2)
            if (r4 >= 0) goto L19
        L17:
            r1 = r2
            goto L22
        L19:
            com.pinterest.api.model.no r2 = com.pinterest.api.model.no.f40447e
            int r4 = r1.compareTo(r2)
            if (r4 <= 0) goto L22
            goto L17
        L22:
            ag1.b r2 = r0.f109793i
            r2.a()
            java.lang.String r4 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            r2.f15136i = r3
            com.pinterest.api.model.ln0 r4 = new com.pinterest.api.model.ln0
            com.pinterest.api.model.wn0 r19 = new com.pinterest.api.model.wn0
            java.lang.String r7 = r0.f109801q
            r11 = 0
            r12 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r14 = 125(0x7d, float:1.75E-43)
            r15 = 0
            r5 = r19
            r13 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.pinterest.api.model.tp r2 = r0.f109798n
            if (r2 == 0) goto L83
            java.lang.Boolean r5 = r2.getContentModified()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r6)
            if (r5 != 0) goto L5e
            com.pinterest.api.model.so r5 = r0.f109802r
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r5)
            if (r1 != 0) goto L5c
            goto L5e
        L5c:
            r1 = 0
            goto L5f
        L5e:
            r1 = 1
        L5f:
            java.lang.Boolean r32 = java.lang.Boolean.valueOf(r1)
            r30 = 0
            r31 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r33 = 2047(0x7ff, float:2.868E-42)
            r20 = r2
            com.pinterest.api.model.tp r1 = com.pinterest.api.model.tp.e(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L81:
            r5 = r1
            goto L85
        L83:
            r1 = 0
            goto L81
        L85:
            r15 = 0
            r16 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r17 = 16376(0x3ff8, float:2.2948E-41)
            r18 = 0
            r2 = r4
            r1 = r4
            r4 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            dl1.t r2 = r0.f109794j
            dl1.l r2 = (dl1.l) r2
            r2.W(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rr.o0.j():void");
    }

    @Override // lg1.e
    public final boolean m1() {
        return this.f109803s;
    }

    @Override // lg1.e
    public final void w(boolean z13, String error, d30 mediaItem) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        this.f109804t.a();
        this.f109796l.h(z13 ? dq1.f.story_pin_creation_error_no_space_left : dq1.f.image_to_video_conversion_error);
    }
}
