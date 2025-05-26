package ok1;

import android.content.Context;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.v7;
import fk2.x;
import h32.f1;
import kk2.m;
import kk2.t;
import kotlin.jvm.internal.Intrinsics;
import nk1.g;
import qf1.f0;
import so.oa;
import x02.x0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final g f95456a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f95457b;

    /* renamed from: c, reason: collision with root package name */
    public final gw f95458c;

    public d(g loggingContext, x0 boardRepository, int i13) {
        if ((i13 & 2) != 0) {
            Context context = kb0.a.f79058b;
            boardRepository = (x0) ((oa) ((so1.b) ep.b.g(so1.b.class))).f113765k3.get();
        }
        gw modelHelper = fw.f37821a;
        Intrinsics.checkNotNullExpressionValue(modelHelper, "getInstance(...)");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        this.f95456a = loggingContext;
        this.f95457b = boardRepository;
        this.f95458c = modelHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(h32.f1 r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            nk1.g r1 = r0.f95456a
            h32.i0 r2 = r1.f91128b
            nx.d0 r3 = r1.f91127a
            r4 = 0
            if (r3 == 0) goto L10
            h32.i0 r3 = r3.p()
            goto L11
        L10:
            r3 = r4
        L11:
            if (r2 == 0) goto L17
            h32.u0 r5 = r2.f67086f
            if (r5 != 0) goto L1d
        L17:
            if (r3 == 0) goto L1c
            h32.u0 r5 = r3.f67086f
            goto L1d
        L1c:
            r5 = r4
        L1d:
            if (r2 == 0) goto L26
            h32.d0 r6 = r2.f67085e
            if (r6 != 0) goto L24
            goto L26
        L24:
            r13 = r6
            goto L2c
        L26:
            if (r3 == 0) goto L2b
            h32.d0 r6 = r3.f67085e
            goto L24
        L2b:
            r13 = r4
        L2c:
            if (r2 == 0) goto L35
            h32.g0 r2 = r2.f67084d
            if (r2 != 0) goto L33
            goto L35
        L33:
            r10 = r2
            goto L3a
        L35:
            if (r3 == 0) goto L39
            h32.g0 r4 = r3.f67084d
        L39:
            r10 = r4
        L3a:
            nx.d0 r7 = r1.f91127a
            if (r7 == 0) goto L56
            if (r5 != 0) goto L42
            h32.u0 r5 = h32.u0.FOLLOW_BOARDS_BUTTON
        L42:
            r9 = r5
            java.lang.String r2 = r1.f91129c
            if (r2 != 0) goto L4a
            r11 = r19
            goto L4b
        L4a:
            r11 = r2
        L4b:
            java.util.HashMap r12 = r1.f91130d
            r14 = 0
            r15 = 0
            r16 = 384(0x180, float:5.38E-43)
            r8 = r18
            nx.d0.D(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.d.a(h32.f1, java.lang.String):void");
    }

    public final t b(String str, boolean z13) {
        m mVar = new m(new kk2.b(new uv0.a(11, this, str), 0), new ic1.a(27, new f0(z13, this, 5)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return pk2.f.k(mVar.r(tk2.e.f118017c), "observeOn(...)");
    }

    public final x c(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        String uid = board.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        a(f1.BOARD_UNFOLLOW, uid);
        return this.f95457b.m0(board);
    }
}
