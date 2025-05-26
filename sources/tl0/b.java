package tl0;

import com.pinterest.api.model.v7;
import com.pinterest.feature.board.grid.view.BoardGridCellImageView;
import com.pinterest.feature.board.grid.view.BoardGridCellLayout;
import g70.h;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ll0.g;
import yk1.n;

/* loaded from: classes5.dex */
public final class b extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final a f118058a;

    /* renamed from: b, reason: collision with root package name */
    public final g f118059b;

    /* renamed from: c, reason: collision with root package name */
    public final h f118060c;

    /* renamed from: d, reason: collision with root package name */
    public v7 f118061d;

    /* renamed from: e, reason: collision with root package name */
    public String f118062e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f118063f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f118064g;

    /* renamed from: h, reason: collision with root package name */
    public String f118065h;

    /* renamed from: i, reason: collision with root package name */
    public String f118066i;

    /* renamed from: j, reason: collision with root package name */
    public int f118067j;

    /* renamed from: k, reason: collision with root package name */
    public String f118068k;

    /* renamed from: l, reason: collision with root package name */
    public String f118069l;

    /* renamed from: m, reason: collision with root package name */
    public List f118070m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a boardGridCellImageViewPresenter, g multiUserAvatarLayoutPresenter, h boardNavigator) {
        super(0);
        Intrinsics.checkNotNullParameter(boardGridCellImageViewPresenter, "boardGridCellImageViewPresenter");
        Intrinsics.checkNotNullParameter(multiUserAvatarLayoutPresenter, "multiUserAvatarLayoutPresenter");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f118058a = boardGridCellImageViewPresenter;
        this.f118059b = multiUserAvatarLayoutPresenter;
        this.f118060c = boardNavigator;
        this.f118066i = "";
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        sl0.b view = (sl0.b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        BoardGridCellLayout boardGridCellLayout = (BoardGridCellLayout) view;
        boardGridCellLayout.f45267f = this;
        BoardGridCellImageView boardGridCellImageView = boardGridCellLayout.f45266e;
        Intrinsics.checkNotNullExpressionValue(boardGridCellImageView, "getCover(...)");
        this.f118058a.bind(boardGridCellImageView);
        this.f118059b.bind(boardGridCellLayout.f45265d);
    }

    @Override // yk1.b
    public final void onUnbind() {
        this.f118058a.unbind();
        this.f118059b.unbind();
        super.onUnbind();
    }
}
