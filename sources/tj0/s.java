package tj0;

import h32.a4;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s extends uk1.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f117887g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(nx.f0 pinalyticsFactory, int i13) {
        super(pinalyticsFactory);
        this.f117887g = i13;
        if (i13 != 1) {
        } else {
            Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
            super(pinalyticsFactory);
        }
    }

    @Override // uk1.d, nx.i1
    public final h32.g0 b2() {
        switch (this.f117887g) {
            case 1:
                return h32.g0.IDEA_PIN_BOARD_STICKER_PICKER;
            default:
                return null;
        }
    }

    @Override // uk1.d
    public final a4 i() {
        switch (this.f117887g) {
            case 1:
                return a4.STORY_PIN_CREATE;
            default:
                return super.i();
        }
    }

    @Override // uk1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        switch (this.f117887g) {
            case 0:
                HashMap f63135d0 = super.getF63135d0();
                if (f63135d0 == null) {
                    f63135d0 = new HashMap();
                }
                f63135d0.put("referrer", String.valueOf(x22.c.HOME_FEED_SWIPE.getValue()));
                return f63135d0;
            default:
                return super.getF63135d0();
        }
    }
}
