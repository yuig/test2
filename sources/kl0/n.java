package kl0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.feature.board.detail.moreboardsview.BoardMoreBoardsView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80102i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f80103j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z f80104k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Context context, z zVar, int i13) {
        super(0);
        this.f80102i = i13;
        this.f80103j = context;
        this.f80104k = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f80103j;
        int i13 = this.f80102i;
        z zVar = this.f80104k;
        switch (i13) {
            case 0:
                BoardMoreBoardsView boardMoreBoardsView = new BoardMoreBoardsView(6, context, (AttributeSet) null);
                boardMoreBoardsView.setPinalytics(zVar.s7());
                return boardMoreBoardsView;
            default:
                return new h01.k(context, zVar.s7());
        }
    }
}
