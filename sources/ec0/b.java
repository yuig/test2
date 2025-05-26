package ec0;

import android.view.View;
import com.pinterest.component.board.view.LegoBoardRep;
import kotlin.jvm.internal.Intrinsics;
import sl1.m;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f58369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LegoBoardRep f58370c;

    public /* synthetic */ b(View.OnClickListener onClickListener, LegoBoardRep legoBoardRep, int i13) {
        this.f58368a = i13;
        this.f58369b = onClickListener;
        this.f58370c = legoBoardRep;
    }

    @Override // gm1.a
    public final void h3(gm1.c e13) {
        int i13 = this.f58368a;
        View.OnClickListener onClickListener = this.f58369b;
        LegoBoardRep this$0 = this.f58370c;
        switch (i13) {
            case 0:
                int i14 = LegoBoardRep.E;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(e13, "e");
                if ((e13 instanceof m) && onClickListener != null) {
                    onClickListener.onClick(this$0.f44728l);
                    break;
                }
                break;
            default:
                int i15 = LegoBoardRep.E;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(e13, "e");
                if ((e13 instanceof rn1.f) && onClickListener != null) {
                    onClickListener.onClick(this$0.f44730n);
                    break;
                }
                break;
        }
    }
}
