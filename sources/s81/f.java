package s81;

import com.pinterest.api.model.xt;
import kotlin.jvm.internal.Intrinsics;
import u81.u;
import uj2.q;
import yk1.r;

/* loaded from: classes5.dex */
public final class f extends yk1.c implements m81.o {

    /* renamed from: a, reason: collision with root package name */
    public final e f111898a;

    /* renamed from: b, reason: collision with root package name */
    public xt f111899b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(uk1.d presenterPinalytics, q networkStateStream, e listener) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f111898a = listener;
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(m81.n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        xt xtVar = this.f111899b;
        if (xtVar != null) {
            String imageUrl = xtVar.f44120a;
            Intrinsics.checkNotNullExpressionValue(imageUrl, "getImageUrl(...)");
            u uVar = (u) view;
            uVar.getClass();
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            uVar.f121098b.loadUrl(imageUrl);
            Intrinsics.checkNotNullParameter(this, "listener");
            ((u) view).f121097a = this;
        }
    }
}
