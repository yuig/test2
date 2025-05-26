package i11;

import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70966i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f70967j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(m mVar, int i13) {
        super(1);
        this.f70966i = i13;
        this.f70967j = mVar;
    }

    public final uj2.q b(BoardFeed feed) {
        String uid;
        String uid2;
        int i13 = this.f70966i;
        String str = "";
        m mVar = this.f70967j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(feed, "feed");
                if (feed.v()) {
                    return uj2.q.y(feed);
                }
                wy0 f13 = ((b60.d) mVar.f70999f).f();
                if (f13 != null && (uid = f13.getUid()) != null) {
                    str = uid;
                }
                return m22.a.e(mVar.f70993c, str, mVar.W);
            default:
                Intrinsics.checkNotNullParameter(feed, "feed");
                if (feed.v()) {
                    return uj2.q.y(feed);
                }
                wy0 f14 = ((b60.d) mVar.f70999f).f();
                if (f14 != null && (uid2 = f14.getUid()) != null) {
                    str = uid2;
                }
                return m22.a.e(mVar.f70993c, str, mVar.W);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (r0.booleanValue() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.pinterest.api.model.f30 r12) {
        /*
            r11 = this;
            int r0 = r11.f70966i
            i11.m r1 = r11.f70967j
            java.lang.String r2 = "pin"
            switch(r0) {
                case 1: goto L3d;
                default: goto L9;
            }
        L9:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            g11.a r0 = r1.N
            java.lang.String r6 = r1.L
            java.util.ArrayList r2 = r1.S
            com.pinterest.api.model.BoardFeed r1 = r1.R
            java.lang.String r12 = r12.z4()
            r0.getClass()
            java.lang.String r3 = "suggestedBoards"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.util.HashMap r7 = r0.getF63135d0()
            java.lang.String r3 = "board_component"
            java.lang.String r4 = "BOARD_PICKER_TOP_CHOICES"
            r7.put(r3, r4)
            g11.a.p(r7, r6, r2, r1, r12)
            h32.f1 r3 = h32.f1.VIEW
            h32.u0 r4 = h32.u0.RECOMMENDATION_SECTION
            h32.g0 r5 = h32.g0.MODAL_ADD_PIN
            nx.d0 r2 = r0.f122379a
            r8 = 0
            r9 = 0
            r10 = 0
            r2.h0(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L3d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            r1.K = r12
            uk2.f r0 = r1.f70998e0
            r0.c(r12)
            com.pinterest.api.model.f30 r12 = r1.K
            if (r12 == 0) goto Lcd
            boolean r0 = r1.O
            if (r0 == 0) goto Lcd
            boolean r0 = rl2.g0.U(r12)
            if (r0 == 0) goto Lcd
            com.pinterest.api.model.v7 r0 = r12.G5()
            if (r0 != 0) goto L6a
            java.lang.Boolean r0 = r12.H5()
            java.lang.String r2 = "getPinnedToProfile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lcd
        L6a:
            yk1.n r0 = r1.getView()
            f11.d r0 = (f11.d) r0
            com.pinterest.api.model.v7 r12 = r12.G5()
            if (r12 == 0) goto L7c
            java.lang.String r12 = r12.j1()
            if (r12 != 0) goto L7e
        L7c:
            java.lang.String r12 = ""
        L7e:
            l11.j r0 = (l11.j) r0
            r0.getClass()
            java.lang.String r2 = "boardName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            boolean r2 = r0.f81439r1
            if (r2 == 0) goto L8d
            goto Lcd
        L8d:
            jl0.b r2 = r0.C0
            if (r2 == 0) goto Lc6
            java.lang.String r12 = jl0.b.c(r12)
            kotlin.jvm.internal.Intrinsics.f(r12)
            int r2 = r12.length()
            if (r2 != 0) goto La5
            int r12 = e02.e.duplicate_pin_repin
            java.lang.String r12 = r0.getString(r12)
            goto Laf
        La5:
            int r2 = e02.e.duplicate_pin_repin_with_board_name
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r12 = r0.getString(r2, r12)
        Laf:
            kotlin.jvm.internal.Intrinsics.f(r12)
            android.content.Context r0 = kb0.a.f79058b
            java.lang.Class<j92.a> r0 = j92.a.class
            java.lang.Object r0 = ep.b.g(r0)
            j92.a r0 = (j92.a) r0
            so.oa r0 = (so.oa) r0
            i92.k r0 = r0.E2()
            r0.o(r12)
            goto Lcd
        Lc6:
            java.lang.String r12 = "boardUtils"
            kotlin.jvm.internal.Intrinsics.r(r12)
            r12 = 0
            throw r12
        Lcd:
            zf0.f r12 = r1.f71011l
            r12.getClass()
            i32.y0 r12 = i32.y0.ANDROID_REPIN_DIALOG_TAKEOVER
            i32.l r0 = i32.l.ANDROID_QUICKSAVE_BOARD_CREATE_EDU
            boolean r12 = df.j1.D0(r12, r0)
            if (r12 == 0) goto Lf1
            yk1.n r12 = r1.getView()
            f11.d r12 = (f11.d) r12
            java.lang.String r0 = r1.I3()
            l11.j r12 = (l11.j) r12
            mf.i r12 = r12.Y0
            if (r12 == 0) goto Lf1
            if (r0 == 0) goto Lf1
            r12.b(r0)
        Lf1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i11.d.e(com.pinterest.api.model.f30):void");
    }

    public final void f(Throwable throwable) {
        int i13 = this.f70966i;
        m mVar = this.f70967j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                String message = throwable.getMessage();
                if (message != null) {
                    ((l11.j) ((f11.d) mVar.getView())).w3(message);
                }
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(throwable, "Duplicate pin warning or board create edu is not working", tb0.p.REPIN);
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "error");
                f11.d dVar = (f11.d) mVar.getViewIfBound();
                if (dVar != null) {
                    String message2 = throwable.getMessage();
                    if (message2 == null) {
                        message2 = "";
                    }
                    ((l11.j) dVar).w3(message2);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f70966i;
        m mVar = this.f70967j;
        switch (i13) {
            case 0:
                return mVar.H3(((Number) obj).intValue());
            case 1:
                e((f30) obj);
                return Unit.f80348a;
            case 2:
                f((Throwable) obj);
                return Unit.f80348a;
            case 3:
                return b((BoardFeed) obj);
            case 4:
                return b((BoardFeed) obj);
            case 5:
                v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(board, "board");
                mVar.getClass();
                q0 q0Var = q0.f80391a;
                String uid = board.getUid();
                String boardName = board.j1();
                Intrinsics.checkNotNullExpressionValue(boardName, "getName(...)");
                Intrinsics.checkNotNullParameter(boardName, "boardName");
                String repinPreviewImageUrl = mVar.getRepinPreviewImageUrl();
                String q13 = b40.q(mVar.K);
                if (boardName != null) {
                    mVar.U3(new h11.d(uid, boardName, repinPreviewImageUrl, q13, false, true, 0, null, q0Var));
                    return Unit.f80348a;
                }
                Intrinsics.r("boardName");
                throw null;
            case 6:
                f((Throwable) obj);
                return Unit.f80348a;
            default:
                e((f30) obj);
                return Unit.f80348a;
        }
    }
}
