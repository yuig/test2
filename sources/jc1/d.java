package jc1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75454i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f75455j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, int i13) {
        super(1);
        this.f75454i = i13;
        this.f75455j = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f75454i
            jc1.g r1 = r5.f75455j
            switch(r0) {
                case 0: goto Lac;
                case 1: goto L4f;
                case 2: goto L47;
                default: goto L7;
            }
        L7:
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            boolean r0 = r1.isBound()
            if (r0 == 0) goto L44
            kotlin.jvm.internal.Intrinsics.f(r6)
            boolean r0 = r6 instanceof com.apollographql.apollo3.exception.ApolloException
            if (r0 == 0) goto L2d
            boolean r0 = r6 instanceof jc1.c
            if (r0 == 0) goto L22
            r0 = r6
            jc1.c r0 = (jc1.c) r0
            java.lang.Throwable r0 = r0.f75453b
            if (r0 != 0) goto L22
            goto L2d
        L22:
            java.util.HashSet r0 = tb0.h.f117076w
            tb0.h r0 = tb0.g.f117075a
            java.lang.String r2 = "There was an error with the API in a GraphQL Profile mutation"
            tb0.p r3 = tb0.p.PLATFORM
            r0.q(r6, r2, r3)
        L2d:
            yk1.n r6 = r1.getView()
            gc1.b r6 = (gc1.b) r6
            int r0 = j52.c.profile_update_error
            yk1.v r1 = r1.f75459b
            yk1.a r1 = (yk1.a) r1
            android.content.res.Resources r1 = r1.f139224a
            java.lang.String r0 = r1.getString(r0)
            hc1.n r6 = (hc1.n) r6
            r6.U8(r0)
        L44:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L47:
            u40.m r6 = (u40.m) r6
            r1.x3()
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L4f:
            pc.h r6 = (pc.h) r6
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            pc.n0 r6 = r6.a()
            u40.o r6 = (u40.o) r6
            java.lang.String r0 = "<this>"
            r2 = 0
            u40.n r6 = r6.f120409a
            if (r6 == 0) goto L71
            u40.f r3 = r6.f120391a
            if (r3 == 0) goto L71
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r4 = r3 instanceof u40.m
            if (r4 == 0) goto L71
            u40.m r3 = (u40.m) r3
            goto L72
        L71:
            r3 = r2
        L72:
            if (r6 == 0) goto L77
            u40.e r6 = r6.f120392b
            goto L78
        L77:
            r6 = r2
        L78:
            r1.getClass()
            if (r6 == 0) goto L87
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r6 instanceof z40.b
            if (r0 == 0) goto L87
            z40.b r6 = (z40.b) r6
            goto L88
        L87:
            r6 = r2
        L88:
            if (r6 != 0) goto L8d
            if (r3 == 0) goto L8d
            return r3
        L8d:
            if (r6 == 0) goto L9d
            jc1.c r0 = new jc1.c
            z40.a r6 = r6.a()
            java.lang.String r6 = r6.getMessage()
            r0.<init>(r6, r2)
            goto Lab
        L9d:
            jc1.c r0 = new jc1.c
            java.lang.Error r6 = new java.lang.Error
            java.lang.String r1 = "There was an error updating the profile, parse if we need specifics."
            r6.<init>(r1)
            java.lang.String r1 = "GraphQL returned a successful response for a mutation without a hydrated profile response."
            r0.<init>(r1, r6)
        Lab:
            throw r0
        Lac:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r1.f75472o = r6
            boolean r0 = r1.isBound()
            if (r0 == 0) goto Lcc
            yk1.n r0 = r1.getView()
            gc1.b r0 = (gc1.b) r0
            boolean r1 = r1.f75471n
            if (r6 == r1) goto Lc6
            r6 = 1
            goto Lc7
        Lc6:
            r6 = 0
        Lc7:
            hc1.n r0 = (hc1.n) r0
            r0.V8(r6)
        Lcc:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jc1.d.invoke(java.lang.Object):java.lang.Object");
    }
}
