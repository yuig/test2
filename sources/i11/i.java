package i11;

import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class i implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f70975a;

    public i(m mVar) {
        this.f70975a = mVar;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull n e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        m mVar = this.f70975a;
        mVar.f71001g.i(e13);
        q0 q0Var = q0.f80391a;
        String str = e13.f71026a;
        String boardName = e13.f71027b;
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        if (boardName == null) {
            Intrinsics.r("boardName");
            throw null;
        }
        String str2 = e13.f71028c;
        if (str2 == null) {
            str2 = "";
        }
        mVar.U3(new h11.d(str, boardName, null, str2, false, false, e13.f71029d, e13.f71030e, q0Var));
    }
}
