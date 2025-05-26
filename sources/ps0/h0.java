package ps0;

/* loaded from: classes.dex */
public final class h0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f101269a;

    public h0(r0 r0Var) {
        this.f101269a = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    @sp2.k(sticky = true, threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull pg0.t r11) {
        /*
            r10 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            ps0.r0 r0 = r10.f101269a
            r0.Q3(r11)
            java.lang.String r11 = r0.U
            r1 = 0
            if (r11 == 0) goto Lc5
            ps0.e r2 = r0.W3()
            if (r2 == 0) goto Lc5
            com.pinterest.feature.home.mainfeed.HomeFeedFragment r2 = (com.pinterest.feature.home.mainfeed.HomeFeedFragment) r2
            java.lang.String r3 = "pinUid"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
            se2.a r3 = r2.P0
            if (r3 == 0) goto Lbf
            bf2.b r3 = (bf2.b) r3
            java.lang.Object r3 = r3.get()
            zf0.f r3 = (zf0.f) r3
            r3.getClass()
            i32.y0 r4 = i32.y0.ANDROID_HOME_FEED_TAKEOVER
            i32.l r5 = i32.l.ANDROID_HOMEFEED_CONTROL_OVERFLOW_TOOLTIP
            boolean r5 = df.j1.D0(r4, r5)
            if (r5 == 0) goto L3e
            rg0.s r3 = r3.f141904a
            dh0.d r3 = (dh0.d) r3
            rg0.n r3 = r3.b(r4)
            goto L3f
        L3e:
            r3 = r1
        L3f:
            if (r3 != 0) goto L43
            goto Lc5
        L43:
            androidx.recyclerview.widget.RecyclerView r4 = r2.g8()
            r5 = 0
            if (r4 == 0) goto L4f
            androidx.recyclerview.widget.y2 r4 = r4.S0(r5)
            goto L50
        L4f:
            r4 = r1
        L50:
            if (r4 == 0) goto L55
            android.view.View r4 = r4.f19717a
            goto L56
        L55:
            r4 = r1
        L56:
            boolean r6 = r4 instanceof qa2.f0
            if (r6 == 0) goto L5d
            qa2.f0 r4 = (qa2.f0) r4
            goto L5e
        L5d:
            r4 = r1
        L5e:
            if (r4 == 0) goto L65
            qa2.h0 r4 = r4.getInternalCell()
            goto L66
        L65:
            r4 = r1
        L66:
            java.lang.String r6 = "<this>"
            if (r4 == 0) goto L78
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            com.pinterest.api.model.f30 r7 = r4.getC0()
            if (r7 == 0) goto L78
            java.lang.String r7 = r7.getUid()
            goto L79
        L78:
            r7 = r1
        L79:
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r7, r11)
            if (r11 == 0) goto Lc5
            r11 = 2
            int[] r11 = new int[r11]
            r4.getLocationOnScreen(r11)
            android.graphics.Rect r7 = new android.graphics.Rect
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            android.graphics.Rect r4 = r4.getOverflowIconRect()
            r7.<init>(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            r6 = r11[r5]
            int r8 = r7.centerX()
            int r8 = r8 + r6
            r6 = 1
            r6 = r11[r6]
            int r9 = r7.top
            int r9 = r9 + r6
            r11 = r11[r5]
            int r5 = r7.right
            int r11 = r11 + r5
            int r5 = r7.bottom
            int r6 = r6 + r5
            r4.<init>(r8, r9, r11, r6)
            m60.w r11 = r2.f7()
            dg0.a r2 = new dg0.a
            m.h r3 = r3.f108071m
            java.lang.String r5 = "educationNew"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            r2.<init>(r3, r4)
            r11.d(r2)
            goto Lc5
        Lbf:
            java.lang.String r11 = "educationHelper"
            kotlin.jvm.internal.Intrinsics.r(r11)
            throw r1
        Lc5:
            r0.U = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ps0.h0.onEventMainThread(pg0.t):void");
    }
}
