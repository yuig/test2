package o71;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f93331a;

    /* renamed from: b, reason: collision with root package name */
    public final vy.m f93332b;

    public l0(uk1.d _presenterPinalytics, vy.m _analyticsApi) {
        Intrinsics.checkNotNullParameter(_presenterPinalytics, "_presenterPinalytics");
        Intrinsics.checkNotNullParameter(_analyticsApi, "_analyticsApi");
        this.f93331a = _presenterPinalytics;
        this.f93332b = _analyticsApi;
    }

    public static /* synthetic */ void c(l0 l0Var, String str, String str2, int i13, String str3, String str4, int i14) {
        if ((i14 & 16) != 0) {
            str4 = null;
        }
        l0Var.b(i13, str, str2, str3, str4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(br.d r5) {
        /*
            r4 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            br.c r0 = r5.f23707e
            if (r0 != 0) goto Lb
            r0 = -1
            goto L13
        Lb:
            int[] r1 = o71.k0.f93328a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L13:
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L22
            r5 = 2
            if (r0 == r5) goto L1c
            r5 = r2
            goto L45
        L1c:
            h32.u0 r5 = h32.u0.RECOMMENDED_QUERY
        L1e:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L45
        L22:
            java.lang.String r5 = r5.f23717o
            if (r5 == 0) goto L42
            java.lang.String r5 = dl2.b.R0(r5)
            if (r5 == 0) goto L42
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            vy.m r1 = r4.f93332b
            java.lang.String r2 = "themed_trending_query_selected"
            r1.k(r2, r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r0 = "theme"
            r2.put(r0, r5)
        L42:
            h32.u0 r5 = h32.u0.TRENDING_QUERY
            goto L1e
        L45:
            if (r2 == 0) goto L55
            uk1.d r0 = r4.f93331a
            nx.d0 r0 = r0.f122379a
            java.lang.String r1 = "getPinalytics(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            h32.g0 r1 = h32.g0.TYPEAHEAD_SUGGESTIONS
            r0.h(r1, r2, r5)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o71.l0.a(br.d):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.equals("more_users") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        r1.put("suggested_queries_count", java.lang.String.valueOf(0));
        r1.put("suggested_users_count", java.lang.String.valueOf(0));
        r1.put("suggested_boards_count", java.lang.String.valueOf(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r7.equals("query") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r7.equals("board") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r7.equals("user") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r7.equals("more_boards") == false) goto L30;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r3 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r1 = "selectedQuery"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            if (r7 == 0) goto L16
            java.lang.String r2 = "autocomplete_type"
            r1.put(r2, r7)
        L16:
            java.lang.String r2 = "result_index"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.put(r2, r4)
            java.lang.String r4 = "entered_query"
            r1.put(r4, r5)
            java.lang.String r4 = "selected_query"
            r1.put(r4, r6)
            if (r8 == 0) goto L30
            java.lang.String r4 = "ac_suggestion_id"
            r1.put(r4, r8)
        L30:
            if (r9 == 0) goto L37
            java.lang.String r4 = "user_id"
            r1.put(r4, r9)
        L37:
            if (r7 == 0) goto L88
            int r4 = r7.hashCode()
            switch(r4) {
                case -1568852361: goto L63;
                case 3599307: goto L5a;
                case 93908710: goto L51;
                case 107944136: goto L4a;
                case 382703774: goto L41;
                default: goto L40;
            }
        L40:
            goto L88
        L41:
            java.lang.String r4 = "more_users"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L6c
            goto L88
        L4a:
            boolean r4 = r7.equals(r0)
            if (r4 != 0) goto L6c
            goto L88
        L51:
            java.lang.String r4 = "board"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L88
            goto L6c
        L5a:
            java.lang.String r4 = "user"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L6c
            goto L88
        L63:
            java.lang.String r4 = "more_boards"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L6c
            goto L88
        L6c:
            r4 = 0
            java.lang.String r8 = java.lang.String.valueOf(r4)
            java.lang.String r9 = "suggested_queries_count"
            r1.put(r9, r8)
            java.lang.String r8 = "suggested_users_count"
            java.lang.String r9 = java.lang.String.valueOf(r4)
            r1.put(r8, r9)
            java.lang.String r8 = "suggested_boards_count"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.put(r8, r4)
        L88:
            uk1.d r4 = r3.f93331a
            nx.d0 r4 = r4.f122379a
            java.lang.String r8 = "getPinalytics(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r8)
            h32.u0 r8 = h32.u0.AUTOCOMPLETE_SUGGESTION
            h32.g0 r9 = h32.g0.TYPEAHEAD_SUGGESTIONS
            r4.h(r9, r8, r1)
            java.util.HashSet r4 = tb0.h.f117076w
            tb0.h r4 = tb0.g.f117075a
            java.lang.String r8 = "Autocomplete query "
            java.lang.String r9 = ", selected query "
            java.lang.String r0 = ", autoCompleteType "
            java.lang.StringBuilder r5 = a.a.w(r8, r5, r9, r6, r0)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r4.h(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o71.l0.b(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
