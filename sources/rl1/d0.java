package rl1;

import android.content.Context;
import android.graphics.Paint;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108540i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e0 f108541j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i13) {
        super(0);
        this.f108540i = i13;
        this.f108541j = e0Var;
    }

    public final Paint b() {
        int i13 = this.f108540i;
        e0 e0Var = this.f108541j;
        switch (i13) {
            case 0:
                Paint paint = new Paint(1);
                int i14 = e0Var.K;
                int i15 = l.f108624a;
                if (i14 == -1) {
                    i14 = i15;
                }
                paint.setColor(e0Var.c(i14));
                return paint;
            case 1:
                Paint paint2 = new Paint(1);
                int i16 = e0Var.f108563s;
                int i17 = l.f108625b;
                if (i16 == -1) {
                    i16 = i17;
                }
                paint2.setColor(e0Var.c(i16));
                return paint2;
            case 8:
                Paint paint3 = new Paint(1);
                int i18 = e0Var.D;
                int i19 = l.f108627d;
                if (i18 == -1) {
                    i18 = i19;
                }
                paint3.setColor(e0Var.c(i18));
                return paint3;
            default:
                Paint paint4 = new Paint(1);
                int i23 = e0Var.B;
                paint4.setColor(e0Var.c(i23 != -1 ? i23 : -1));
                return paint4;
        }
    }

    public final Integer e() {
        int i13 = this.f108540i;
        e0 e0Var = this.f108541j;
        switch (i13) {
            case 3:
                Context d2 = e0Var.d();
                Intrinsics.checkNotNullExpressionValue(d2, "access$getContext(...)");
                return Integer.valueOf(dl2.b.F0(d2, eo1.a.comp_avatar_border_weight));
            default:
                Context d13 = e0Var.d();
                Intrinsics.checkNotNullExpressionValue(d13, "access$getContext(...)");
                return Integer.valueOf(dl2.b.F0(d13, eo1.a.comp_avatar_lg_non_image_text_size));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if ((r1 instanceof com.pinterest.gestalt.avatar.LegacyGestaltAvatar) != false) goto L30;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            r6 = this;
            r0 = 0
            int r1 = r6.f108540i
            java.lang.String r2 = "access$getContext(...)"
            r3 = 1
            java.lang.String r4 = "avatarView"
            rl1.e0 r5 = r6.f108541j
            switch(r1) {
                case 0: goto L91;
                case 1: goto L8c;
                case 2: goto L7f;
                case 3: goto L7a;
                case 4: goto L75;
                case 5: goto L53;
                case 6: goto L24;
                case 7: goto L17;
                case 8: goto L12;
                default: goto Ld;
            }
        Ld:
            android.graphics.Paint r0 = r6.b()
            return r0
        L12:
            android.graphics.Paint r0 = r6.b()
            return r0
        L17:
            com.pinterest.ui.imageview.WebImageView r1 = r5.f108545a
            if (r1 == 0) goto L20
            android.content.res.Resources r0 = r1.getResources()
            return r0
        L20:
            kotlin.jvm.internal.Intrinsics.r(r4)
            throw r0
        L24:
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r3)
            android.content.Context r1 = r5.d()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            rl1.m r2 = r5.f108547c
            lm1.g r2 = r2.getFont()
            android.graphics.Typeface r1 = bs1.c.u0(r1, r2)
            r0.setTypeface(r1)
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            int r1 = r5.I
            int r2 = rl1.l.f108628e
            r3 = -1
            if (r1 == r3) goto L4a
            goto L4b
        L4a:
            r1 = r2
        L4b:
            int r1 = r5.c(r1)
            r0.setColor(r1)
            return r0
        L53:
            android.content.Context r1 = r5.d()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            int r2 = eo1.a.comp_avatar_is_vr
            boolean r1 = dl2.b.v0(r2, r1)
            if (r1 == 0) goto L6f
            com.pinterest.ui.imageview.WebImageView r1 = r5.f108545a
            if (r1 == 0) goto L6b
            boolean r0 = r1 instanceof com.pinterest.gestalt.avatar.LegacyGestaltAvatar
            if (r0 == 0) goto L6f
            goto L70
        L6b:
            kotlin.jvm.internal.Intrinsics.r(r4)
            throw r0
        L6f:
            r3 = 0
        L70:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L75:
            java.lang.Integer r0 = r6.e()
            return r0
        L7a:
            java.lang.Integer r0 = r6.e()
            return r0
        L7f:
            com.pinterest.ui.imageview.WebImageView r1 = r5.f108545a
            if (r1 == 0) goto L88
            android.content.Context r0 = r1.getContext()
            return r0
        L88:
            kotlin.jvm.internal.Intrinsics.r(r4)
            throw r0
        L8c:
            android.graphics.Paint r0 = r6.b()
            return r0
        L91:
            android.graphics.Paint r0 = r6.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rl1.d0.invoke():java.lang.Object");
    }
}
