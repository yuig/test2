package au0;

import com.pinterest.feature.ideaPinCreation.closeup.view.h0;
import kotlin.jvm.internal.Intrinsics;
import kt0.x;
import lq0.f1;
import so.na;
import yk1.n;

/* loaded from: classes5.dex */
public final class g extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final wk2.a f20490a;

    /* renamed from: b, reason: collision with root package name */
    public final wk2.a f20491b;

    /* renamed from: c, reason: collision with root package name */
    public e f20492c;

    /* renamed from: d, reason: collision with root package name */
    public yt0.b f20493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(bf2.d ideaPinFontDataProvider, na crashReporting) {
        super(0);
        Intrinsics.checkNotNullParameter(ideaPinFontDataProvider, "ideaPinFontDataProvider");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f20490a = ideaPinFontDataProvider;
        this.f20491b = crashReporting;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        h0 view = (h0) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        xj2.c j13 = ((ee0.b) this.f20490a.get()).a().i(wj2.c.a()).j(new x(26, new f1(view, 29)), new x(27, new f(this, 0)));
        Intrinsics.checkNotNullExpressionValue(j13, "subscribe(...)");
        addDisposable(j13);
    }
}
