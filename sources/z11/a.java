package z11;

/* loaded from: classes5.dex */
public interface a {
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void b1(z11.a r3, v32.c r4, java.lang.Boolean r5, int r6) {
        /*
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6 = r6 & 4
            if (r6 == 0) goto L8
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L8:
            com.pinterest.feature.pin.reactions.view.ReactionIconButton r3 = (com.pinterest.feature.pin.reactions.view.ReactionIconButton) r3
            r3.getClass()
            java.lang.String r6 = "reactionType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            v32.c r6 = r3.f47289h
            if (r6 != r4) goto L18
            goto Ldd
        L18:
            r3.f47289h = r4
            java.lang.Integer r6 = r3.f47291j
            if (r6 == 0) goto L2d
            int r6 = r6.intValue()
            v32.c r1 = v32.c.NONE
            if (r4 == r1) goto L2a
            r3.clearColorFilter()
            goto L2d
        L2a:
            r3.setColorFilter(r6)
        L2d:
            android.content.Context r6 = r3.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            java.lang.Integer r1 = r3.f47291j
            r2 = 0
            if (r1 == 0) goto L3d
        L3b:
            r1 = r2
            goto L63
        L3d:
            boolean r1 = r3.f47283b
            if (r1 == 0) goto L48
            int r1 = eo1.b.color_themed_text_default
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L63
        L48:
            boolean r1 = r3.f47287f
            if (r1 == 0) goto L59
            boolean r1 = hf0.b.n()
            if (r1 != 0) goto L59
            int r1 = eo1.b.color_white_0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L63
        L59:
            boolean r1 = r3.f47282a
            if (r1 == 0) goto L3b
            int r1 = eo1.b.color_themed_text_default
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L63:
            android.graphics.drawable.Drawable r6 = kh2.w.G(r6, r4, r1)
            r3.setImageDrawable(r6)
            boolean r6 = r3.f47293l
            if (r6 == 0) goto Lcb
            boolean r6 = r3.f47294m
            if (r6 != 0) goto L83
            boolean r6 = r3.f47288g
            if (r6 == 0) goto Lb8
            boolean r6 = hf0.b.q()
            if (r6 != 0) goto Lb8
            int r6 = cz1.b.button_circular_dark_gray
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto Lb8
        L83:
            int[] r6 = e21.q.f56985a
            int r1 = r4.ordinal()
            r6 = r6[r1]
            switch(r6) {
                case 1: goto Lb2;
                case 2: goto Lab;
                case 3: goto La4;
                case 4: goto L9d;
                case 5: goto L96;
                case 6: goto L8f;
                default: goto L8e;
            }
        L8e:
            goto Lb8
        L8f:
            int r6 = cz1.b.circle_wow_bg
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto Lb8
        L96:
            int r6 = cz1.b.circle_lightbulb_bg
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto Lb8
        L9d:
            int r6 = cz1.b.circle_thanks_bg
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto Lb8
        La4:
            int r6 = cz1.b.circle_laugh_bg
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto Lb8
        Lab:
            int r6 = cz1.b.circle_like_bg
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto Lb8
        Lb2:
            int r6 = m60.s0.lego_circle_gray
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
        Lb8:
            if (r2 == 0) goto Lcb
            int r6 = r2.intValue()
            android.content.Context r1 = r3.getContext()
            java.lang.Object r2 = d5.a.f53679a
            android.graphics.drawable.Drawable r6 = r1.getDrawable(r6)
            r3.setBackground(r6)
        Lcb:
            kotlin.jvm.internal.Intrinsics.d(r0, r0)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r0)
            if (r5 == 0) goto Ldd
            v32.c r5 = v32.c.NONE
            if (r4 == r5) goto Ldd
            kotlin.jvm.functions.Function1 r3 = r3.f47286e
            r3.invoke(r4)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z11.a.b1(z11.a, v32.c, java.lang.Boolean, int):void");
    }
}
