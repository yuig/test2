package hr0;

import android.content.Context;
import android.widget.FrameLayout;
import com.pinterest.feature.board.grid.view.BoardGridCellLayout;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes5.dex */
public final class b extends FrameLayout implements yk1.d {

    /* renamed from: a, reason: collision with root package name */
    public final BoardGridCellLayout f69980a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.f(context2);
        BoardGridCellLayout boardGridCellLayout = new BoardGridCellLayout(context2, null);
        addView(boardGridCellLayout);
        this.f69980a = boardGridCellLayout;
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin_half);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }
}
