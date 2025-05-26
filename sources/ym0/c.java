package ym0;

import com.pinterest.api.model.v7;
import hk2.u;
import kotlin.jvm.internal.Intrinsics;
import uj2.l;
import x02.r0;
import x02.x0;

/* loaded from: classes5.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f139400a;

    /* renamed from: b, reason: collision with root package name */
    public final v7 f139401b;

    public c(x0 boardRepository, v7 board) {
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(board, "board");
        this.f139400a = boardRepository;
        this.f139401b = board;
    }

    @Override // ym0.e
    public final u a(a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String movedPinId = result.f139397a;
        Intrinsics.checkNotNullExpressionValue(movedPinId, "getReorderedModelId(...)");
        x0 x0Var = this.f139400a;
        x0Var.getClass();
        v7 movedPinParentBoard = this.f139401b;
        Intrinsics.checkNotNullParameter(movedPinParentBoard, "movedPinParentBoard");
        Intrinsics.checkNotNullParameter(movedPinId, "movedPinId");
        String uid = movedPinParentBoard.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        l G = x0Var.G(new r0(uid, movedPinId, result.f139398b, result.f139399c), movedPinParentBoard);
        G.getClass();
        u uVar = new u(G);
        Intrinsics.checkNotNullExpressionValue(uVar, "ignoreElement(...)");
        return uVar;
    }
}
