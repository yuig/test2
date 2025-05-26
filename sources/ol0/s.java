package ol0;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.component.modal.BaseModalViewWrapper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import x02.x0;

/* loaded from: classes5.dex */
public final class s extends yk1.l {

    /* renamed from: a, reason: collision with root package name */
    public final String f96423a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f96424b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f96425c;

    /* renamed from: d, reason: collision with root package name */
    public final pb0.d f96426d;

    /* renamed from: e, reason: collision with root package name */
    public u f96427e;

    /* renamed from: f, reason: collision with root package name */
    public Function0 f96428f;

    public s(String boardId, b60.b activeUserManager, x0 boardRepository, pb0.d fuzzyDateFormatter) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        this.f96423a = boardId;
        this.f96424b = activeUserManager;
        this.f96425c = boardRepository;
        this.f96426d = fuzzyDateFormatter;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        u uVar = new u(((b60.d) this.f96424b).f(), this.f96426d, context);
        Function0 action = this.f96428f;
        if (action == null) {
            Intrinsics.r("confirmBtnListener");
            throw null;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        uVar.f96439h = action;
        this.f96427e = uVar;
        jc0.n nVar = new jc0.n(context);
        nVar.x(uVar);
        nVar.T(false);
        return nVar;
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        return new ll0.g(this.f96423a, this.f96425c);
    }

    @Override // yk1.l
    public final yk1.n getView() {
        u uVar = this.f96427e;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.r("boardSoftDeletionView");
        throw null;
    }
}
