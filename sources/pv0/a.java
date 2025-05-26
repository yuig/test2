package pv0;

import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.screens.d2;
import java.util.List;
import jc0.v;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.w;
import nv0.n;
import qv0.g;
import qz.f0;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101430i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f101431j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i13) {
        super(1);
        this.f101430i = i13;
        this.f101431j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f101430i;
        d dVar = this.f101431j;
        switch (i13) {
            case 0:
                BoardFeed boardFeed = (BoardFeed) obj;
                dVar.f101456o = boardFeed != null ? (v7) CollectionsKt.firstOrNull(boardFeed.q()) : null;
                dVar.w3();
                return Unit.f80348a;
            case 1:
                dVar.f101451j = (ln0) obj;
                return Unit.f80348a;
            case 2:
                List stickerIds = (List) obj;
                ov0.b bVar = dVar.f101455n;
                Intrinsics.f(stickerIds);
                bVar.getClass();
                Intrinsics.checkNotNullParameter(stickerIds, "stickerIds");
                f0 f0Var = bVar.f49121k;
                if (f0Var == null) {
                    f0Var = new f0();
                }
                f0Var.e("recently_used_sticker_ids", CollectionsKt.Z(stickerIds, ",", null, null, 0, null, null, 62));
                bVar.f49121k = f0Var;
                return Unit.f80348a;
            default:
                wy0 wy0Var = (wy0) obj;
                Boolean c33 = wy0Var.c3();
                Intrinsics.checkNotNullExpressionValue(c33, "getHasConfirmedEmail(...)");
                if (c33.booleanValue()) {
                    ((b60.d) dVar.f101450i).k(wy0Var);
                    if (dVar.isBound()) {
                        g gVar = (g) ((n) dVar.getView());
                        gVar.getClass();
                        gVar.M1(gVar.U8(d2.p()));
                    }
                } else if (dVar.isBound()) {
                    g gVar2 = (g) ((n) dVar.getView());
                    w f73 = gVar2.f7();
                    wk2.a aVar = gVar2.A0;
                    if (aVar == null) {
                        Intrinsics.r("settingsApiProvider");
                        throw null;
                    }
                    Object obj2 = aVar.get();
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    f73.d(new v(new jv0.g((yt0.a) null, (x10.d) obj2, gVar2.getActiveUserManager()), false, 0L, 30));
                }
                return Unit.f80348a;
        }
    }
}
