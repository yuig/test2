package xb1;

import m60.t;

/* loaded from: classes5.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f134504a;

    public c(d dVar) {
        this.f134504a = dVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r4 == null) goto L11;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0017 A[SYNTHETIC] */
    @sp2.k(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull xb1.e r8) {
        /*
            r7 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.pinterest.api.model.qv r0 = r8.f134510a
            xb1.d r1 = r7.f134504a
            wb1.t r2 = r1.f134508d
            java.util.ArrayList r2 = r2.f135191h
            java.util.List r2 = kotlin.collections.CollectionsKt.F0(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc8
            java.lang.Object r3 = r2.next()
            dl1.s r3 = (dl1.s) r3
            boolean r4 = r3 instanceof wb1.j0
            if (r4 == 0) goto L17
            wb1.j0 r3 = (wb1.j0) r3
            java.lang.Integer r4 = r3.f125194a
            yk1.v r5 = r1.f134506b
            if (r4 == 0) goto L3e
            int r4 = r4.intValue()
            r6 = r5
            yk1.a r6 = (yk1.a) r6
            android.content.res.Resources r6 = r6.f139224a
            java.lang.String r4 = r6.getString(r4)
            if (r4 != 0) goto L44
        L3e:
            java.lang.String r4 = r3.f125195b
            if (r4 != 0) goto L44
            java.lang.String r4 = ""
        L44:
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r6)
            java.lang.String r6 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            if (r4 == 0) goto L89
            int r6 = r4.hashCode()
            switch(r6) {
                case -600094315: goto L7d;
                case -567451565: goto L71;
                case 765912085: goto L65;
                case 765915793: goto L59;
                default: goto L58;
            }
        L58:
            goto L89
        L59:
            java.lang.String r6 = "following"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L62
            goto L89
        L62:
            com.pinterest.api.model.qv$a r4 = com.pinterest.api.model.qv.a.FOLLOWEES
            goto L8b
        L65:
            java.lang.String r6 = "followers"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L6e
            goto L89
        L6e:
            com.pinterest.api.model.qv$a r4 = com.pinterest.api.model.qv.a.FOLLOWERS
            goto L8b
        L71:
            java.lang.String r6 = "contacts"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L7a
            goto L89
        L7a:
            com.pinterest.api.model.qv$a r4 = com.pinterest.api.model.qv.a.CONTACTS
            goto L8b
        L7d:
            java.lang.String r6 = "friends"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L86
            goto L89
        L86:
            com.pinterest.api.model.qv$a r4 = com.pinterest.api.model.qv.a.FRIENDS
            goto L8b
        L89:
            com.pinterest.api.model.qv$a r4 = com.pinterest.api.model.qv.a.OTHERS
        L8b:
            com.pinterest.api.model.qv$a r6 = r0.g()
            if (r4 != r6) goto L17
            z42.o r4 = r8.f134511b
            java.lang.String r6 = "level"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            int[] r6 = wb1.v.f129062c
            int r4 = r4.ordinal()
            r4 = r6[r4]
            r6 = 1
            if (r4 == r6) goto Lb5
            r6 = 2
            if (r4 == r6) goto Lb2
            r6 = 3
            if (r4 != r6) goto Lac
            int r4 = c52.e.dont_deliver
            goto Lb7
        Lac:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        Lb2:
            int r4 = c52.e.requests
            goto Lb7
        Lb5:
            int r4 = c52.e.inbox
        Lb7:
            yk1.a r5 = (yk1.a) r5
            android.content.res.Resources r5 = r5.f139224a
            java.lang.String r4 = r5.getString(r4)
            java.lang.String r5 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            r3.f129026g = r4
            goto L17
        Lc8:
            sq0.d0 r8 = r1.getAdapter()
            if (r8 == 0) goto Ld3
            androidx.recyclerview.widget.b2 r8 = (androidx.recyclerview.widget.b2) r8
            r8.h()
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xb1.c.onEventMainThread(xb1.e):void");
    }
}
