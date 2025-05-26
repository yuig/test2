package ua0;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import nm.q;
import nm.u;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import r72.j1;
import u50.r;

/* loaded from: classes5.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final o12.a f121405a;

    /* renamed from: b, reason: collision with root package name */
    public final a82.b f121406b;

    public d(o12.a collageService, a82.b collageRenderer) {
        Intrinsics.checkNotNullParameter(collageService, "collageService");
        Intrinsics.checkNotNullParameter(collageRenderer, "collageRenderer");
        this.f121405a = collageService;
        this.f121406b = collageRenderer;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(ua0.d r8, ua0.d r9, com.pinterest.api.adapter.coroutine.NetworkResponse r10, u50.r r11, boolean r12, bl2.c r13) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua0.d.j(ua0.d, ua0.d, com.pinterest.api.adapter.coroutine.NetworkResponse, u50.r, boolean, bl2.c):java.lang.Object");
    }

    public static RequestBody$Companion$toRequestBody$2 k(r72.a aVar) {
        RequestBody.Companion companion = RequestBody.f95711a;
        u uVar = new u();
        uVar.u("mask_image", aVar.f106432b);
        j1 j1Var = aVar.f106431a;
        float[][] fArr = {new float[]{j1Var.f106506a, j1Var.f106507b}, new float[]{j1Var.f106508c, j1Var.f106509d}};
        q qVar = new q();
        for (int i13 = 0; i13 < 2; i13++) {
            float[] fArr2 = fArr[i13];
            q qVar2 = new q();
            for (float f13 : fArr2) {
                qVar2.r(Float.valueOf(f13));
            }
            qVar.t(qVar2);
        }
        uVar.r("mask_bounds", qVar);
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        return RequestBody.Companion.c(companion, sVar);
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        ta0.g request = (ta0.g) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        j.z(scope, null, null, new c(request, eventIntake, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.String r6, android.graphics.Bitmap r7, bl2.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ua0.a
            if (r0 == 0) goto L13
            r0 = r8
            ua0.a r0 = (ua0.a) r0
            int r1 = r0.f121390t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121390t = r1
            goto L18
        L13:
            ua0.a r0 = new ua0.a
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f121388r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f121390t
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r8)
            goto L67
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            ue.c.H(r8)
            r8 = 90
            byte[] r7 = qb0.b.a(r8, r7)
            if (r7 == 0) goto L6b
            okhttp3.RequestBody$Companion r8 = okhttp3.RequestBody.f95711a
            okhttp3.MediaType$Companion r2 = okhttp3.MediaType.f95651d
            r2.getClass()
            java.lang.String r2 = "image/jpeg"
            okhttp3.MediaType r2 = okhttp3.MediaType.Companion.a(r2)
            r4 = 6
            okhttp3.RequestBody$Companion$toRequestBody$2 r7 = okhttp3.RequestBody.Companion.e(r8, r7, r2, r4)
            java.lang.String r8 = "myphoto.jpg"
            java.lang.String r2 = "image"
            java.lang.String r4 = "binary"
            okhttp3.MultipartBody$Part r7 = zh0.d.a(r7, r2, r4, r8)
            n00.c r8 = n00.c.PIN_CLOSEUP
            java.lang.String r8 = n00.b.a(r8)
            r0.f121390t = r3
            o12.a r2 = r5.f121405a
            java.lang.Object r8 = r2.h(r7, r6, r8, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            com.pinterest.api.adapter.coroutine.NetworkResponse r8 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r8
            if (r8 != 0) goto L77
        L6b:
            xz.a r8 = new xz.a
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r7 = "Failed to convert bitmap to byte array"
            r6.<init>(r7)
            r8.<init>(r6)
        L77:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ua0.d.l(java.lang.String, android.graphics.Bitmap, bl2.c):java.lang.Object");
    }
}
