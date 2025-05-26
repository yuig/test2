package kl0;

import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.board.detail.view.BoardRefreshToastView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements ar0.y {

    /* renamed from: a, reason: collision with root package name */
    public int f80090a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f80091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f80092c;

    public i(z zVar) {
        this.f80092c = zVar;
    }

    public final void a(boolean z13) {
        this.f80091b = z13;
    }

    @Override // ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        z zVar = this.f80092c;
        com.pinterest.feature.board.detail.b bVar = zVar.f80145n1;
        if (bVar != null) {
            hl0.v vVar = (hl0.v) bVar;
            if (!vVar.Z) {
                u60.s sVar = vVar.f69526i0;
                if (!sVar.i0() || !sVar.f120803b0 || !sVar.h0() || !sVar.X) {
                    u60.m mVar = vVar.f69538o0;
                    if (mVar.S == null || !mVar.V) {
                        return;
                    }
                }
            }
            int i15 = this.f80090a + i14;
            this.f80090a = i15;
            int i16 = this.f80091b ? 0 : 500;
            if (i14 > 0 || i15 + i16 > 0) {
                BoardRefreshToastView boardRefreshToastView = zVar.U1;
                if (boardRefreshToastView != null) {
                    bs1.c.X0(boardRefreshToastView);
                    return;
                } else {
                    Intrinsics.r("refreshFeedPromptView");
                    throw null;
                }
            }
            BoardRefreshToastView boardRefreshToastView2 = zVar.U1;
            if (boardRefreshToastView2 == null) {
                Intrinsics.r("refreshFeedPromptView");
                throw null;
            }
            if (boardRefreshToastView2.getVisibility() != 0 && this.f80090a + i16 <= 0) {
                zVar.z9(this.f80091b);
            }
        }
    }

    @Override // ar0.y
    public final void d(RecyclerView recyclerView, int i13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }

    @Override // ar0.y
    public final void g(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }
}
