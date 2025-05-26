package ev;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.api.model.e40;
import com.pinterest.feature.conversation.view.ConversationSystemMessageBoardPinItemView;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lq0.z0;
import qa2.s1;
import rm1.q;
import rq.t0;

/* loaded from: classes3.dex */
public final class c extends s1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f60199d;

    /* renamed from: e, reason: collision with root package name */
    public final List f60200e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f60201f;

    public c(ArrayList pinImages, Function0 navigateToBoard, int i13) {
        this.f60199d = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(pinImages, "reasons");
            Intrinsics.checkNotNullParameter(navigateToBoard, "action");
            this.f60200e = pinImages;
            this.f60201f = navigateToBoard;
            return;
        }
        Intrinsics.checkNotNullParameter(pinImages, "pinImages");
        Intrinsics.checkNotNullParameter(navigateToBoard, "navigateToBoard");
        this.f60200e = pinImages;
        this.f60201f = navigateToBoard;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        switch (this.f60199d) {
            case 0:
                break;
            default:
                if (this.f60200e.size() <= 4) {
                    break;
                }
                break;
        }
        return this.f60200e.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        switch (this.f60199d) {
            case 0:
                b holder = (b) y2Var;
                Intrinsics.checkNotNullParameter(holder, "holder");
                cv.a reason = (cv.a) this.f60200e.get(i13);
                Intrinsics.checkNotNullParameter(reason, "reason");
                q qVar = reason.f53255b;
                int i14 = a.f60192f;
                rm1.i size = rm1.i.SM;
                a aVar = holder.f60198u;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(size, "size");
                if (qVar != null) {
                    ((GestaltIcon) aVar.f60196d).g2(new e.f(qVar, size, reason.f53256c, 28));
                }
                CharSequence description = reason.f53254a;
                Intrinsics.checkNotNullParameter(description, "description");
                aVar.f60194b.i(new ip.d(7, description));
                if (reason.f53257d) {
                    ((ViewGroup) aVar.f60197e).setVisibility(8);
                    aVar.f60195c.setVisibility(0);
                    break;
                }
                break;
            default:
                z0 holder2 = (z0) y2Var;
                Intrinsics.checkNotNullParameter(holder2, "holder");
                e40 pinImage = (e40) this.f60200e.get(i13);
                Intrinsics.checkNotNullParameter(pinImage, "pinImage");
                Function0 navigateToBoard = this.f60201f;
                Intrinsics.checkNotNullParameter(navigateToBoard, "navigateToBoard");
                ConversationSystemMessageBoardPinItemView conversationSystemMessageBoardPinItemView = holder2.f84462u;
                conversationSystemMessageBoardPinItemView.getClass();
                Intrinsics.checkNotNullParameter(pinImage, "pinImage");
                Intrinsics.checkNotNullParameter(navigateToBoard, "navigateToBoard");
                String c13 = pinImage.c();
                WebImageView webImageView = conversationSystemMessageBoardPinItemView.f45622a;
                webImageView.loadUrl(c13);
                conversationSystemMessageBoardPinItemView.setOnClickListener(new t0(12, navigateToBoard));
                if (i13 == 3 && this.f60200e.size() > 4) {
                    String d2 = a.a.d("+", this.f60200e.size() - 4);
                    GestaltText gestaltText = conversationSystemMessageBoardPinItemView.f45623b;
                    gestaltText.setText(d2);
                    bs1.c.R1(gestaltText, true);
                    webImageView.setColorFilter(dl2.b.y0(conversationSystemMessageBoardPinItemView, eo1.a.color_background_dark_opacity_300));
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        switch (this.f60199d) {
            case 0:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new b(new a(context, this.f60201f, 0));
            default:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new z0(new ConversationSystemMessageBoardPinItemView(context2, null));
        }
    }
}
