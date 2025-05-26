package ec0;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.component.board.view.LegoBoardRep;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ LegoBoardRep f58387i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(LegoBoardRep legoBoardRep) {
        super(0);
        this.f58387i = legoBoardRep;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LegoBoardRep legoBoardRep = this.f58387i;
        WebImageView webImageView = new WebImageView(legoBoardRep.getContext());
        webImageView.setId(View.generateViewId());
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.setLayoutParams(new ConstraintLayout.LayoutParams(0, 0));
        webImageView.a2(true);
        webImageView.f52564p = legoBoardRep.f44742z;
        return webImageView;
    }
}
