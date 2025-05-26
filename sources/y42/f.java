package y42;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Application f137714a;

    /* renamed from: b, reason: collision with root package name */
    public final w f137715b;

    /* renamed from: c, reason: collision with root package name */
    public final lu1.b f137716c;

    /* renamed from: d, reason: collision with root package name */
    public final tz1.a f137717d;

    public f(Application application, w eventManager, lu1.b baseActivityHelper, tz1.a localNotificationHelper) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        Intrinsics.checkNotNullParameter(localNotificationHelper, "localNotificationHelper");
        this.f137714a = application;
        this.f137715b = eventManager;
        this.f137716c = baseActivityHelper;
        this.f137717d = localNotificationHelper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ba, code lost:
    
        if (r7 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r12, com.pinterest.api.model.f30 r13) {
        /*
            r11 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            android.content.res.Resources r0 = r12.getResources()
            int r1 = m60.x0.app_name
            java.lang.String r3 = r0.getString(r1)
            java.lang.String r0 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            long r5 = java.lang.System.currentTimeMillis()
            r1 = 0
            android.app.Application r8 = r11.f137714a
            if (r13 == 0) goto Lbc
            com.pinterest.api.model.v7 r2 = r13.D3()
            com.pinterest.api.model.ba r4 = r13.j6()
            r7 = 0
            if (r4 == 0) goto L2e
            java.lang.String r4 = r4.A()
            if (r4 != 0) goto L36
        L2e:
            if (r2 == 0) goto L35
            java.lang.String r4 = r2.j1()
            goto L36
        L35:
            r4 = r7
        L36:
            if (r4 == 0) goto Lba
            android.content.res.Resources r2 = r12.getResources()
            int r7 = m60.x0.notification_upload_success
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r2 = r2.getString(r7, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            xk2.v r4 = com.pinterest.screens.x3.f51568a
            java.lang.Object r4 = r4.getValue()
            com.pinterest.framework.screens.ScreenLocation r4 = (com.pinterest.framework.screens.ScreenLocation) r4
            com.pinterest.navigation.NavigationImpl r4 = com.pinterest.navigation.Navigation.r0(r4, r13)
            lu1.b r7 = r11.f137716c
            android.content.Intent r7 = lu1.b.a(r7, r8)
            java.lang.String r9 = "com.pinterest.EXTRA_PENDING_TASK"
            r7.putExtra(r9, r4)
            r4 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r4 = android.app.PendingIntent.getActivity(r12, r1, r7, r4)
            tz1.b.a()
            java.lang.String r7 = "03"
            c5.u r7 = tz1.b.b(r12, r7)
            java.lang.CharSequence r9 = c5.u.c(r3)
            r7.f25840e = r9
            java.lang.CharSequence r2 = c5.u.c(r2)
            r7.f25841f = r2
            r2 = 8
            r9 = 1
            r7.k(r2, r9)
            r7.f25842g = r4
            r2 = 16
            r7.k(r2, r9)
            java.lang.String r2 = "setAutoCancel(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            android.content.res.Resources r2 = r12.getResources()
            int r4 = pz1.a.push_notification_thumbnail_size
            float r2 = r2.getDimension(r4)
            int r2 = (int) r2
            hs1.q r4 = hs1.t.a()
            java.lang.String r9 = bs1.c.B0(r13)
            kotlin.jvm.internal.Intrinsics.f(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            hs1.m r4 = (hs1.m) r4
            android.graphics.Bitmap r2 = r4.l(r10, r2, r9)
            if (r2 == 0) goto Lb6
            r7.o(r2)
        Lb6:
            android.app.Notification r7 = r7.b()
        Lba:
            if (r7 != 0) goto Ld1
        Lbc:
            android.content.res.Resources r12 = r12.getResources()
            int r2 = m60.x0.pinned
            java.lang.String r4 = r12.getString(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            r7 = 8
            tz1.a r2 = r11.f137717d
            android.app.Notification r7 = tz1.a.b(r2, r3, r4, r5, r7)
        Ld1:
            java.lang.String r12 = "notification"
            java.lang.Object r12 = r8.getSystemService(r12)
            java.lang.String r0 = "null cannot be cast to non-null type android.app.NotificationManager"
            kotlin.jvm.internal.Intrinsics.g(r12, r0)
            android.app.NotificationManager r12 = (android.app.NotificationManager) r12
            r12.notify(r1, r7)
            pg0.s r12 = new pg0.s
            r12.<init>()
            if (r13 == 0) goto Le9
            goto Lee
        Le9:
            com.pinterest.api.model.f30 r13 = new com.pinterest.api.model.f30
            r13.<init>()
        Lee:
            r12.f100089a = r13
            m60.w r13 = r11.f137715b
            r13.f(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y42.f.a(android.content.Context, com.pinterest.api.model.f30):void");
    }
}
