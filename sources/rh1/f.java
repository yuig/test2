package rh1;

import android.widget.HorizontalScrollView;
import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.textcomposer.GestaltTextComposer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108143i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f108144j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(k kVar, int i13) {
        super(1);
        this.f108143i = i13;
        this.f108144j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f108143i;
        k kVar = this.f108144j;
        switch (i13) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                HorizontalScrollView horizontalScrollView = kVar.N0;
                if (horizontalScrollView != null) {
                    bs1.c.R1(horizontalScrollView, !booleanValue);
                    return Unit.f80348a;
                }
                Intrinsics.r("commentStarterHscroll");
                throw null;
            default:
                String reply = (String) obj;
                Intrinsics.checkNotNullParameter(reply, "reply");
                f30 f30Var = kVar.X0;
                if (f30Var != null) {
                    if (((Boolean) kVar.W0.getValue()).booleanValue()) {
                        CommentComposerView Y8 = kVar.Y8();
                        String text = reply + " ";
                        Intrinsics.checkNotNullParameter(text, "text");
                        GestaltTextComposer gestaltTextComposer = Y8.f35086s;
                        gestaltTextComposer.X(new ba.s(23, gestaltTextComposer, text));
                        gestaltTextComposer.g0();
                    } else {
                        qh1.e a93 = kVar.a9();
                        nx.d0 s73 = kVar.s7();
                        String uid = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        a93.n(s73, uid, (r36 & 4) != 0 ? "" : b40.g(f30Var), (r36 & 8) != 0 ? null : null, (r36 & 16) != 0 ? null : null, null, null, (r36 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : null, (r36 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : reply, (r36 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : null, (r36 & 1024) != 0 ? false : false, (r36 & 2048) != 0 ? null : null, (r36 & 4096) != 0 ? null : null, (r36 & 8192) != 0 ? Boolean.FALSE : null, (r36 & 16384) != 0 ? false : false, (r36 & 32768) != 0 ? false : false, false);
                    }
                }
                return Unit.f80348a;
        }
    }
}
