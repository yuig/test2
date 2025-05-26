package xl0;

import ck2.i;
import com.pinterest.api.model.v7;
import com.pinterest.feature.board.join.view.RequestToJoinButton;
import gm1.c;
import i92.k;
import kh2.w;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;
import x02.a2;
import x02.x0;
import xl0.d;
import yk1.n;
import yk1.v;

/* loaded from: classes5.dex */
public final class d extends yk1.b implements wl0.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f135253a;

    /* renamed from: b, reason: collision with root package name */
    public final String f135254b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f135255c;

    /* renamed from: d, reason: collision with root package name */
    public final v f135256d;

    /* renamed from: e, reason: collision with root package name */
    public final k f135257e;

    /* renamed from: f, reason: collision with root package name */
    public final no1.d f135258f;

    /* renamed from: g, reason: collision with root package name */
    public v7 f135259g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String userId, String boardId, x0 boardRepository, yk1.a viewResources, k toastUtils, no1.d graphQLBoardRemoteDataSource) {
        super(0);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(graphQLBoardRemoteDataSource, "graphQLBoardRemoteDataSource");
        this.f135253a = userId;
        this.f135254b = boardId;
        this.f135255c = boardRepository;
        this.f135256d = viewResources;
        this.f135257e = toastUtils;
        this.f135258f = graphQLBoardRemoteDataSource;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r2.booleanValue() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            com.pinterest.api.model.v7 r0 = r7.f135259g
            if (r0 != 0) goto L6
            goto L116
        L6:
            boolean r1 = kh2.w.i0(r0)
            if (r1 == 0) goto Le
            goto L116
        Le:
            java.lang.String r1 = "board"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            boolean r1 = kh2.w.i0(r0)
            com.pinterest.api.model.wy0 r2 = kh2.w.B(r0)
            i92.k r3 = r7.f135257e
            if (r2 == 0) goto L2f
            java.lang.Boolean r2 = r2.s2()
            java.lang.String r4 = "getBlockedByMe(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2f
            goto L31
        L2f:
            if (r1 == 0) goto L42
        L31:
            int r0 = y60.e.block_user_join_board_message
            yk1.v r1 = r7.f135256d
            yk1.a r1 = (yk1.a) r1
            android.content.res.Resources r1 = r1.f139224a
            java.lang.String r0 = r1.getString(r0)
            r3.i(r0)
            goto L116
        L42:
            java.lang.Boolean r1 = r0.D1()
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ 1
            com.pinterest.api.model.u7 r2 = r0.G1()
            java.lang.Boolean r4 = r0.D1()
            boolean r4 = r4.booleanValue()
            r4 = r4 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.Q(r4)
            com.pinterest.api.model.v7 r2 = r2.a()
            java.lang.String r4 = "build(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.lang.Boolean r4 = r2.D1()
            java.lang.String r5 = "getViewerCollaboratorJoinRequested(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L8e
            lr.h r4 = new lr.h
            java.lang.String r5 = r0.j1()
            java.lang.String r6 = "getName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r0 = r0.b1()
            r4.<init>(r5, r0)
            r3.c(r4)
        L8e:
            r7.p3(r2)
            java.lang.String r0 = "observeOn(...)"
            java.lang.String r3 = "getUid(...)"
            java.lang.String r4 = "updatedBoard"
            no1.d r5 = r7.f135258f
            if (r1 == 0) goto Lc7
            r5.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            x40.z5 r1 = new x40.z5
            java.lang.String r4 = r2.getUid()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            r1.<init>(r4)
            oc.c r3 = r5.f91666a
            oc.a r1 = r3.a(r1)
            gk2.f0 r1 = com.bumptech.glide.d.u0(r1)
            fk2.g r1 = r1.i()
            uj2.a0 r3 = wj2.c.a()
            fk2.l r1 = r1.h(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            goto Lf9
        Lc7:
            r5.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r1 = r7.f135253a
            java.lang.String r4 = "userId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            x40.x6 r4 = new x40.x6
            java.lang.String r6 = r2.getUid()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            r4.<init>(r6, r1)
            oc.c r1 = r5.f91666a
            oc.a r1 = r1.a(r4)
            gk2.f0 r1 = com.bumptech.glide.d.u0(r1)
            fk2.g r1 = r1.i()
            uj2.a0 r3 = wj2.c.a()
            fk2.l r1 = r1.h(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
        Lf9:
            uj2.a0 r0 = tk2.e.f118017c
            fk2.c r0 = r1.l(r0)
            xo.b r1 = new xo.b
            r3 = 17
            r1.<init>(r3)
            sk0.x r3 = new sk0.x
            r4 = 8
            r3.<init>(r4, r7, r2)
            xl0.a r2 = new xl0.a
            r4 = 2
            r2.<init>(r4, r3)
            r0.i(r1, r2)
        L116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xl0.d.b():void");
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        wl0.c view = (wl0.c) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        final RequestToJoinButton requestToJoinButton = (RequestToJoinButton) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        requestToJoinButton.f45280c = this;
        final int i13 = 0;
        requestToJoinButton.f45278a.e(new gm1.a() { // from class: yl0.a
            @Override // gm1.a
            public final void h3(c it) {
                int i14 = i13;
                RequestToJoinButton this$0 = requestToJoinButton;
                switch (i14) {
                    case 0:
                        int i15 = RequestToJoinButton.f45277d;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        wl0.b bVar = this$0.f45280c;
                        if (bVar != null) {
                            ((d) bVar).b();
                            break;
                        }
                        break;
                    default:
                        int i16 = RequestToJoinButton.f45277d;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        wl0.b bVar2 = this$0.f45280c;
                        if (bVar2 != null) {
                            ((d) bVar2).b();
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 1;
        requestToJoinButton.f45279b.e(new gm1.a() { // from class: yl0.a
            @Override // gm1.a
            public final void h3(c it) {
                int i142 = i14;
                RequestToJoinButton this$0 = requestToJoinButton;
                switch (i142) {
                    case 0:
                        int i15 = RequestToJoinButton.f45277d;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        wl0.b bVar = this$0.f45280c;
                        if (bVar != null) {
                            ((d) bVar).b();
                            break;
                        }
                        break;
                    default:
                        int i16 = RequestToJoinButton.f45277d;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        wl0.b bVar2 = this$0.f45280c;
                        if (bVar2 != null) {
                            ((d) bVar2).b();
                            break;
                        }
                        break;
                }
            }
        });
        x0 x0Var = this.f135255c;
        q B = x0Var.B();
        zk0.b bVar = new zk0.b(29, new b(this, 1));
        a2 a2Var = i.f27924d;
        xj2.c F = B.F(bVar, a2Var, i.f27923c, a2Var);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        xj2.c o13 = x0Var.Q(this.f135254b).s().o(new a(0, new b(this, 0)), new a(1, c.f135252i));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    public final void p3(v7 board) {
        v7 v7Var;
        Intrinsics.checkNotNullParameter(board, "board");
        this.f135259g = board;
        if (isBound()) {
            wl0.c cVar = (wl0.c) getView();
            v7 v7Var2 = this.f135259g;
            Intrinsics.f(v7Var2);
            if (!v7Var2.P0().booleanValue() || ((v7Var = this.f135259g) != null && w.i0(v7Var))) {
                RequestToJoinButton requestToJoinButton = (RequestToJoinButton) cVar;
                requestToJoinButton.f45278a.d(yl0.b.f139293l);
                requestToJoinButton.f45279b.d(yl0.b.f139294m);
                return;
            }
            RequestToJoinButton requestToJoinButton2 = (RequestToJoinButton) cVar;
            requestToJoinButton2.f45278a.d(yl0.b.f139295n);
            requestToJoinButton2.f45279b.d(yl0.b.f139296o);
            v7 v7Var3 = this.f135259g;
            Intrinsics.f(v7Var3);
            wl0.a joinState = !v7Var3.D1().booleanValue() ? wl0.a.Join : wl0.a.Cancel;
            Intrinsics.checkNotNullParameter(joinState, "joinState");
            String string = requestToJoinButton2.getResources().getString(joinState.getDisplayTextResId());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            requestToJoinButton2.f45278a.d(new kl0.c(string, 4));
            requestToJoinButton2.f45279b.d(new kl0.c(string, 5));
        }
    }
}
