package lr;

import android.content.Context;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.lv;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.wy0;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.toast.GestaltToast;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.w1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final f30 f84541d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f84542e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84543f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84544g;

    /* renamed from: h, reason: collision with root package name */
    public PinterestToastContainer f84545h;

    /* renamed from: i, reason: collision with root package name */
    public final wy0 f84546i;

    /* renamed from: j, reason: collision with root package name */
    public GestaltToast f84547j;

    public s(wy0 wy0Var, String str, String str2, f30 f30Var, Function0 shouldShowThreadEntryPoint) {
        Intrinsics.checkNotNullParameter(shouldShowThreadEntryPoint, "shouldShowThreadEntryPoint");
        this.f84541d = f30Var;
        this.f84542e = shouldShowThreadEntryPoint;
        if (str != null) {
            this.f84543f = str;
            if (str2 != null) {
                this.f84544g = str2;
            }
            if (wy0Var != null) {
                this.f84546i = wy0Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r5 == null) goto L33;
     */
    @Override // we0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.pinterest.gestalt.toast.GestaltToast a(com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r0.f84545h = r1
            com.pinterest.api.model.wy0 r2 = r0.f84546i
            r3 = 0
            if (r2 == 0) goto L15
            java.lang.String r4 = r2.U2()
            goto L16
        L15:
            r4 = r3
        L16:
            if (r4 == 0) goto L28
            int r4 = r4.length()
            if (r4 != 0) goto L1f
            goto L28
        L1f:
            if (r2 == 0) goto L26
            java.lang.String r4 = r2.U2()
            goto L2e
        L26:
            r4 = r3
            goto L2e
        L28:
            if (r2 == 0) goto L26
            java.lang.String r4 = r2.Z2()
        L2e:
            if (r4 == 0) goto L36
            int r5 = r4.length()
            if (r5 != 0) goto L3d
        L36:
            if (r2 == 0) goto L3c
            java.lang.String r3 = r2.z4()
        L3c:
            r4 = r3
        L3d:
            java.lang.String r3 = ""
            if (r2 == 0) goto L5f
            java.lang.String r5 = r2.l3()
            if (r5 == 0) goto L51
            int r6 = r5.length()
            if (r6 != 0) goto L51
            java.lang.String r5 = r2.k3()
        L51:
            if (r5 == 0) goto L5d
            int r6 = r5.length()
            if (r6 != 0) goto L5d
            java.lang.String r5 = r2.n3()
        L5d:
            if (r5 != 0) goto L60
        L5f:
            r5 = r3
        L60:
            com.pinterest.gestalt.toast.GestaltToast r2 = new com.pinterest.gestalt.toast.GestaltToast
            android.content.Context r6 = r19.getContext()
            java.lang.String r7 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            android.content.Context r8 = r19.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            android.content.Context r1 = r19.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r7 = m60.x0.reply_to_toast
            java.lang.String r1 = r1.getString(r7)
            java.lang.String r7 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r7)
            if (r4 != 0) goto L89
            r7 = r3
            goto L8a
        L89:
            r7 = r4
        L8a:
            android.text.SpannableStringBuilder r1 = f0.h.D(r8, r1, r7)
            u50.f0 r8 = bs1.c.p2(r1)
            do1.b r10 = new do1.b
            int r1 = m60.x0.reply
            r7 = 0
            java.lang.String[] r9 = new java.lang.String[r7]
            java.lang.String r11 = "formatArgs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r11)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r7)
            u50.k0 r7 = new u50.k0
            r7.<init>(r1, r9)
            db.m r1 = new db.m
            r9 = 28
            r1.<init>(r0, r9)
            r10.<init>(r7, r1)
            do1.e r9 = new do1.e
            if (r4 != 0) goto Lb7
            r4 = r3
        Lb7:
            r9.<init>(r5, r4)
            do1.d r1 = new do1.d
            r14 = 0
            r17 = 472(0x1d8, float:6.61E-43)
            r11 = 0
            r12 = 0
            r13 = 7000(0x1b58, float:9.809E-42)
            r15 = 0
            r16 = 0
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.<init>(r6, r1)
            r0.f84547j = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.s.a(com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer):com.pinterest.gestalt.toast.GestaltToast");
    }

    @Override // we0.a
    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f84541d == null || !((Boolean) this.f84542e.invoke()).booleanValue()) {
            e();
        } else {
            oo1.j jVar = oo1.j.f96854a;
            String str = this.f84543f;
            if (str == null) {
                Intrinsics.r("_conversationId");
                throw null;
            }
            oo1.j.o(str, d());
        }
        super.b(context);
    }

    public final mv d() {
        lv C = mv.C();
        C.i("");
        C.e(this.f84541d);
        C.g(((b60.d) com.bumptech.glide.d.E()).f());
        mv a13 = C.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final void e() {
        ScreenLocation screenLocation = (ScreenLocation) w1.f51510v.getValue();
        String str = this.f84543f;
        if (str == null) {
            Intrinsics.r("_conversationId");
            throw null;
        }
        NavigationImpl z03 = Navigation.z0(screenLocation, str);
        z03.m0("com.pinterest.EXTRA_PIN_ID", this.f84544g);
        m60.u.f85943a.d(z03);
    }
}
