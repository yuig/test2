package ff0;

import com.pinterest.component.modal.ModalContainer;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final ModalContainer f62100a;

    public c(ModalContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f62100a = container;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull d e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        a.a(this.f62100a);
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull g e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        throw null;
    }
}
