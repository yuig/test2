package q71;

import ao2.o1;
import com.pinterest.ui.imageview.WebImageView;
import java.util.concurrent.CancellationException;
import so.jb;

/* loaded from: classes5.dex */
public final class m extends WebImageView implements k71.a {
    public static final /* synthetic */ int N = 0;

    /* renamed from: J, reason: collision with root package name */
    public boolean f102726J;
    public o71.v K;
    public o1 L;
    public int M;

    @Override // com.pinterest.ui.imageview.GenericWebImageView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        o1 o1Var = this.L;
        if (o1Var != null) {
            o1Var.cancel((CancellationException) null);
        }
        super.onDetachedFromWindow();
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView
    public final void s2() {
        if (this.f102726J) {
            return;
        }
        this.f102726J = true;
        this.f52566r = (hs1.q) ((jb) ((n) generatedComponent())).f113483a.f113875q7.get();
    }
}
