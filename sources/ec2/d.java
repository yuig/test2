package ec2;

import ac2.c1;
import com.pinterest.video.core.view.PinCloseupVideoEndFrameLayout;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58442i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ PinCloseupVideoEndFrameLayout f58443j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(PinCloseupVideoEndFrameLayout pinCloseupVideoEndFrameLayout, int i13) {
        super(1);
        this.f58442i = i13;
        this.f58443j = pinCloseupVideoEndFrameLayout;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f58442i;
        PinCloseupVideoEndFrameLayout pinCloseupVideoEndFrameLayout = this.f58443j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, d7.g.q(pinCloseupVideoEndFrameLayout.getResources(), c1.video_end_frame_watch_again, "getString(...)"), vn1.c.LIGHT, e0.b(vn1.b.CENTER), null, vn1.g.HEADING_700, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097128);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, d7.g.q(pinCloseupVideoEndFrameLayout.getResources(), c1.send, "getString(...)"), vn1.c.LIGHT, null, null, vn1.g.HEADING_700, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097132);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f58442i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            default:
                super/*android.view.View*/.setVisibility(((Number) obj).intValue());
                return Unit.f80348a;
        }
    }
}
