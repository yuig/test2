package ij0;

import android.os.Handler;
import android.os.Looper;
import com.pinterest.api.model.v7;
import com.pinterest.feature.board.collab.service.BoardActionService;
import com.pinterest.pushnotification.f;
import com.pinterest.pushnotification.h;
import go0.l;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import k11.d;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import m7.h0;
import pz1.e;
import tb0.g;
import tb0.k;
import uj2.d0;
import x02.d2;
import x02.i2;
import xj2.c;

/* loaded from: classes5.dex */
public final class a implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72338a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f72339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f72340c;

    public a(BoardActionService boardActionService, f fVar) {
        this.f72339b = boardActionService;
        this.f72340c = fVar;
    }

    @Override // uj2.d0
    public final void b(c d2) {
        switch (this.f72338a) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                break;
        }
    }

    @Override // uj2.d0
    public final void onError(Throwable error) {
        int i13 = this.f72338a;
        Object obj = this.f72340c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(error, "error");
                h.a("BoardFetch", error);
                Intrinsics.checkNotNullParameter("BoardFetch", "failureValue");
                HashSet hashSet = tb0.h.f117076w;
                tb0.h hVar = g.f117075a;
                k kVar = new k();
                kVar.c("Failure", "BoardFetch");
                hVar.k("BoardNotificationAccept", kVar.f117102a);
                BoardActionService boardActionService = (BoardActionService) this.f72339b;
                int i14 = BoardActionService.f45114b;
                String string = boardActionService.getString(e.board_notification_toast_success_message_generic);
                Intrinsics.f(string);
                new Handler(Looper.getMainLooper()).post(new dp.a(13, boardActionService, string));
                boardActionService.a((f) obj, null, null);
                break;
            default:
                d dVar = (d) obj;
                if (dVar.f78120a.get() != null) {
                    WeakReference weakReference = dVar.f78120a;
                    if (((k11.e) weakReference.get()).isBound()) {
                        ((k11.e) weakReference.get()).g0(x0.notification_upload_cant);
                        break;
                    }
                }
                break;
        }
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        int i13 = this.f72338a;
        Object obj2 = this.f72340c;
        Object obj3 = this.f72339b;
        switch (i13) {
            case 0:
                v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(board, "board");
                BoardActionService boardActionService = (BoardActionService) obj3;
                String j13 = board.j1();
                int i14 = BoardActionService.f45114b;
                String string = j13 == null ? boardActionService.getString(e.board_notification_toast_success_message_generic) : boardActionService.getString(e.board_notification_toast_success_message_board, j13);
                Intrinsics.f(string);
                new Handler(Looper.getMainLooper()).post(new dp.a(13, boardActionService, string));
                boardActionService.a((f) obj2, board.j1(), board.c1());
                break;
            default:
                String str = (String) obj;
                d2 params = (d2) obj3;
                params.f131325f = str;
                String substring = str.substring(str.lastIndexOf(File.separator) + 1, str.lastIndexOf(".jpg"));
                Intrinsics.checkNotNullParameter(substring, "<set-?>");
                params.f131330k = substring;
                d dVar = (d) obj2;
                i2 i2Var = dVar.f78122c;
                Intrinsics.checkNotNullParameter(i2Var, "<this>");
                Intrinsics.checkNotNullParameter(params, "params");
                List paramsList = Collections.singletonList(params);
                Intrinsics.checkNotNullExpressionValue(paramsList, "singletonList(...)");
                Intrinsics.checkNotNullParameter(i2Var, "<this>");
                Intrinsics.checkNotNullParameter(paramsList, "paramsList");
                fk2.g gVar = new fk2.g(new h0(paramsList), 0);
                Intrinsics.checkNotNullExpressionValue(gVar, "create(...)");
                gVar.j(new l(dVar, params));
                break;
        }
    }

    public a(d dVar, d2 d2Var) {
        this.f72340c = dVar;
        this.f72339b = d2Var;
    }
}
