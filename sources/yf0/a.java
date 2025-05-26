package yf0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kl2.l;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import q5.a2;
import q5.y1;

/* loaded from: classes5.dex */
public final class a extends s implements l {

    /* renamed from: j, reason: collision with root package name */
    public static final a f138951j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f138952k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f138953l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f138954m = new a(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138955i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(3);
        this.f138955i = i13;
    }

    public final void b(View view, a2 windowInsetsCompat, g initialPadding) {
        switch (this.f138955i) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(windowInsetsCompat, "windowInsetsCompat");
                Intrinsics.checkNotNullParameter(initialPadding, "initialPadding");
                f5.e f13 = windowInsetsCompat.f102400a.f(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL);
                Intrinsics.checkNotNullExpressionValue(f13, "getInsets(...)");
                y1 y1Var = windowInsetsCompat.f102400a;
                int i13 = y1Var.o(8) ? y1Var.f(8).f61084d : f13.f61084d + initialPadding.f138962d;
                ((RecyclerView) view).setClipToPadding(false);
                view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), i13);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(windowInsetsCompat, "windowInsetsCompat");
                Intrinsics.checkNotNullParameter(initialPadding, "initialPadding");
                f5.e f14 = windowInsetsCompat.f102400a.f(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL);
                Intrinsics.checkNotNullExpressionValue(f14, "getInsets(...)");
                y1 y1Var2 = windowInsetsCompat.f102400a;
                view.setPaddingRelative(initialPadding.f138959a, initialPadding.f138960b, initialPadding.f138961c, y1Var2.o(8) ? y1Var2.f(8).f61084d : f14.f61084d + initialPadding.f138962d);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(windowInsetsCompat, "windowInsetsCompat");
                Intrinsics.checkNotNullParameter(initialPadding, "initialPadding");
                f5.e f15 = windowInsetsCompat.f102400a.f(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL);
                Intrinsics.checkNotNullExpressionValue(f15, "getInsets(...)");
                y1 y1Var3 = windowInsetsCompat.f102400a;
                view.setPaddingRelative(initialPadding.f138959a, f15.f61082b + initialPadding.f138960b, initialPadding.f138961c, y1Var3.o(8) ? y1Var3.f(8).f61084d : f15.f61084d + initialPadding.f138962d);
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(windowInsetsCompat, "windowInsetsCompat");
                Intrinsics.checkNotNullParameter(initialPadding, "initialPadding");
                f5.e f16 = windowInsetsCompat.f102400a.f(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL);
                Intrinsics.checkNotNullExpressionValue(f16, "getInsets(...)");
                view.setPaddingRelative(initialPadding.f138959a, initialPadding.f138960b + f16.f61082b, initialPadding.f138961c, initialPadding.f138962d);
                break;
        }
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f138955i) {
            case 0:
                b((View) obj, (a2) obj2, (g) obj3);
                break;
            case 1:
                b((View) obj, (a2) obj2, (g) obj3);
                break;
            case 2:
                b((View) obj, (a2) obj2, (g) obj3);
                break;
            default:
                b((View) obj, (a2) obj2, (g) obj3);
                break;
        }
        return Unit.f80348a;
    }
}
