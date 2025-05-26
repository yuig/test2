package fd1;

import android.os.CountDownTimer;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.feature.sharesheet.view.SharesheetModalVerticalContactView;

/* loaded from: classes5.dex */
public final class w0 extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharesheetModalVerticalContactView f62012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TypeAheadItem f62013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(int i13, TypeAheadItem typeAheadItem, SharesheetModalVerticalContactView sharesheetModalVerticalContactView) {
        super(1000L, 1000L);
        this.f62011a = i13;
        this.f62012b = sharesheetModalVerticalContactView;
        this.f62013c = typeAheadItem;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        int value = y32.f.BOARD.value();
        int i13 = this.f62011a;
        SharesheetModalVerticalContactView sharesheetModalVerticalContactView = this.f62012b;
        if (i13 != value) {
            kg.a.h(sharesheetModalVerticalContactView.f48424a, i.G);
        } else if (this.f62013c.f35153n == er.d.SENT) {
            kg.a.h(sharesheetModalVerticalContactView.f48424a, i.E);
        } else {
            kg.a.h(sharesheetModalVerticalContactView.f48424a, i.F);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j13) {
        if (this.f62011a != y32.f.BOARD.value()) {
            kg.a.h(this.f62012b.f48424a, i.H);
        }
    }
}
