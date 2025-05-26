package rb2;

import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f107108b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f107109c;

    public /* synthetic */ b(d dVar, String str, int i13) {
        this.f107107a = i13;
        this.f107108b = dVar;
        this.f107109c = str;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f107107a;
        String boardId = this.f107109c;
        d this$0 = this.f107108b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(boardId, "$boardId");
                Intrinsics.checkNotNullParameter(it, "it");
                gi.m mVar = this$0.f107141n;
                if (mVar != null) {
                    mVar.b(boardId);
                    return;
                } else {
                    Intrinsics.r("boardInviteUtils");
                    throw null;
                }
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(boardId, "$boardId");
                Intrinsics.checkNotNullParameter(it, "it");
                gi.m mVar2 = this$0.f107141n;
                if (mVar2 != null) {
                    mVar2.C(this$0.getResources().getString(x0.board_invite_declined_msg), boardId);
                    return;
                } else {
                    Intrinsics.r("boardInviteUtils");
                    throw null;
                }
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(boardId, "$boardId");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.g(boardId);
                return;
        }
    }
}
