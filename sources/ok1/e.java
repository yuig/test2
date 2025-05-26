package ok1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import pc.h;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f95459i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ wy0 f95460j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f95461k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(wy0 wy0Var, f fVar, int i13) {
        super(1);
        this.f95459i = i13;
        this.f95460j = wy0Var;
        this.f95461k = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[Catch: ApolloException -> 0x00ae, TryCatch #1 {ApolloException -> 0x00ae, blocks: (B:24:0x0065, B:26:0x006f, B:28:0x0076, B:30:0x007c, B:31:0x0080, B:33:0x0086, B:34:0x008e, B:36:0x0097, B:37:0x0099), top: B:23:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[Catch: ApolloException -> 0x00ae, TryCatch #1 {ApolloException -> 0x00ae, blocks: (B:24:0x0065, B:26:0x006f, B:28:0x0076, B:30:0x007c, B:31:0x0080, B:33:0x0086, B:34:0x008e, B:36:0x0097, B:37:0x0099), top: B:23:0x0065 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final uj2.b0 b(pc.h r8) {
        /*
            r7 = this;
            int r0 = r7.f95459i
            ok1.f r1 = r7.f95461k
            r2 = 0
            com.pinterest.api.model.wy0 r3 = r7.f95460j
            java.lang.String r4 = "<this>"
            r5 = 0
            java.lang.String r6 = "response"
            switch(r0) {
                case 0: goto L62;
                default: goto Lf;
            }
        Lf:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r6)
            pc.n0 r0 = r8.a()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            v30.o r0 = (v30.o) r0     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            v30.l r0 = r0.f123945a     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            if (r0 == 0) goto L2b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            boolean r4 = r0 instanceof v30.n     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            if (r4 == 0) goto L26
            v30.n r0 = (v30.n) r0     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            goto L27
        L26:
            r0 = r5
        L27:
            if (r0 == 0) goto L2b
            v30.m r5 = r0.f123944e     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
        L2b:
            com.pinterest.api.model.vy0 r0 = com.pinterest.api.model.wy0.f2()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            if (r5 == 0) goto L39
            java.lang.Boolean r2 = r5.f123941d     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r4)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
        L39:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            r0.H(r2)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            com.pinterest.api.model.wy0 r0 = r0.a()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            com.pinterest.api.model.wy0 r0 = r3.G4(r0)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            x02.x2 r1 = r1.f95463b     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            r1.W(r0)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            kk2.b r8 = uj2.b0.j(r0)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L52
            goto L61
        L52:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.util.List r8 = r8.f99564d
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r0.<init>(r8)
            kk2.k r8 = uj2.b0.g(r0)
        L61:
            return r8
        L62:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r6)
            pc.n0 r0 = r8.a()     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            v30.g r0 = (v30.g) r0     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            v30.d r0 = r0.f123930a     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            if (r0 == 0) goto L7f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            boolean r4 = r0 instanceof v30.f     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            if (r4 == 0) goto L79
            v30.f r0 = (v30.f) r0     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            goto L7a
        L79:
            r0 = r5
        L7a:
            if (r0 == 0) goto L7f
            v30.e r0 = r0.f123929e     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            goto L80
        L7f:
            r0 = r5
        L80:
            com.pinterest.api.model.vy0 r4 = com.pinterest.api.model.wy0.f2()     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            if (r0 == 0) goto L8e
            java.lang.Boolean r2 = r0.f123926d     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r6)     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
        L8e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            r4.H(r2)     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            if (r0 == 0) goto L99
            java.lang.Integer r5 = r0.f123927e     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
        L99:
            r4.L(r5)     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            com.pinterest.api.model.wy0 r0 = r4.a()     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            com.pinterest.api.model.wy0 r0 = r3.G4(r0)     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            x02.x2 r1 = r1.f95463b     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            r1.W(r0)     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            kk2.b r8 = uj2.b0.j(r0)     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lae
            goto Lbd
        Lae:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.util.List r8 = r8.f99564d
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r0.<init>(r8)
            kk2.k r8 = uj2.b0.g(r0)
        Lbd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.e.b(pc.h):uj2.b0");
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f95459i) {
        }
        return b((h) obj);
    }
}
