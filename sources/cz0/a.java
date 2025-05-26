package cz0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import y32.f;
import yk1.b;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends b implements bz0.a {

    /* renamed from: a, reason: collision with root package name */
    public final dz0.a f53473a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dz0.a oneTapPinPresenterListener) {
        super(0);
        Intrinsics.checkNotNullParameter(oneTapPinPresenterListener, "oneTapPinPresenterListener");
        this.f53473a = oneTapPinPresenterListener;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        bz0.b view = (bz0.b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        view.setOneTapButtonClickListener(this);
    }

    public final void p3(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        dz0.a aVar = this.f53473a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        aVar.f56649a.s(pin.getId(), 0, f.SEARCH_FEED_ONE_TAP.getValue(), pin);
    }
}
