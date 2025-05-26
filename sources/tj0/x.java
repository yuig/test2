package tj0;

import android.view.View;
import com.pinterest.feature.board.common.newideas.view.OneTapSaveCarouselPinView;
import com.pinterest.feature.board.common.newideas.view.OneTapSavePinVideoGridCell;

/* loaded from: classes5.dex */
public final /* synthetic */ class x implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117906a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f117907b;

    public /* synthetic */ x(e0 e0Var, int i13) {
        this.f117906a = i13;
        this.f117907b = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f117906a;
        e0 e0Var = this.f117907b;
        switch (i13) {
            case 0:
                OneTapSaveCarouselPinView.setOneTapButtonClickLister$lambda$0(e0Var, view);
                break;
            default:
                OneTapSavePinVideoGridCell.setOneTapButtonClickLister$lambda$0(e0Var, view);
                break;
        }
    }
}
