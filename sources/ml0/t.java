package ml0;

import android.graphics.Bitmap;
import com.pinterest.feature.board.headerimage.WashedWebImageView;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87501i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WashedWebImageView f87502j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(WashedWebImageView washedWebImageView, int i13) {
        super(0);
        this.f87501i = i13;
        this.f87502j = washedWebImageView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WashedWebImageView washedWebImageView = this.f87502j;
        int i13 = this.f87501i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        Bitmap c13 = washedWebImageView.getC();
                        if (c13 != null) {
                            washedWebImageView.b().setImageBitmap(k3.C(washedWebImageView.getContext(), c13, 0.0f, 0.0f, 12));
                            bs1.c.U1(washedWebImageView);
                            break;
                        }
                        break;
                    default:
                        Bitmap c14 = washedWebImageView.getC();
                        if (c14 != null) {
                            washedWebImageView.b().setImageBitmap(k3.C(washedWebImageView.getContext(), c14, 0.0f, 0.0f, 12));
                            bs1.c.U1(washedWebImageView);
                            break;
                        }
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        Bitmap c15 = washedWebImageView.getC();
                        if (c15 != null) {
                            washedWebImageView.b().setImageBitmap(k3.C(washedWebImageView.getContext(), c15, 0.0f, 0.0f, 12));
                            bs1.c.U1(washedWebImageView);
                            break;
                        }
                        break;
                    default:
                        Bitmap c16 = washedWebImageView.getC();
                        if (c16 != null) {
                            washedWebImageView.b().setImageBitmap(k3.C(washedWebImageView.getContext(), c16, 0.0f, 0.0f, 12));
                            bs1.c.U1(washedWebImageView);
                            break;
                        }
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
