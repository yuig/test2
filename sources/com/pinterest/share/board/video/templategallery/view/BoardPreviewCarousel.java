package com.pinterest.share.board.video.templategallery.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n1;
import androidx.recyclerview.widget.q2;
import androidx.recyclerview.widget.w2;
import cr.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o52.c;
import o52.d;
import org.jetbrains.annotations.NotNull;
import ql2.s;
import u52.b;
import zt1.e;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/pinterest/share/board/video/templategallery/view/BoardPreviewCarousel;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "zt1/e", "CenterZoomLayoutManager", "ko0/b", "u52/b", "shareBoardVideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BoardPreviewCarousel extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f51846f = 0;

    /* renamed from: a, reason: collision with root package name */
    public b f51847a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f51848b;

    /* renamed from: c, reason: collision with root package name */
    public final f f51849c;

    /* renamed from: d, reason: collision with root package name */
    public final n1 f51850d;

    /* renamed from: e, reason: collision with root package name */
    public final CenterZoomLayoutManager f51851e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/share/board/video/templategallery/view/BoardPreviewCarousel$CenterZoomLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "shareBoardVideo_release"}, k = 1, mv = {1, 9, 0})
    public static final class CenterZoomLayoutManager extends LinearLayoutManager {
        public final float E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CenterZoomLayoutManager(Context context) {
            super(0, false);
            Intrinsics.checkNotNullParameter(context, "context");
            this.E = 0.1f;
        }

        public final void I1() {
            float f13 = this.f19506n / 2.0f;
            int E = E();
            float f14 = 0.0f;
            for (int i13 = 0; i13 < E; i13++) {
                View D = D(i13);
                Intrinsics.f(D);
                float right = (D.getRight() + D.getLeft()) / 2.0f;
                float c13 = 1.0f - (this.E * s.c(Math.abs(right - f13) / f13, 1.0f));
                float width = ((1 - c13) * (D.getWidth() * (right > f13 ? -1 : 1))) / 2.0f;
                D.setScaleX(c13);
                D.setScaleY(c13);
                D.setTranslationX(f14 + width);
                if (width > 0.0f && i13 >= 1) {
                    View D2 = D(i13 - 1);
                    if (D2 != null) {
                        D2.setTranslationX((2 * width) + D2.getTranslationX());
                    }
                } else if (width < 0.0f) {
                    f14 = 2 * width;
                }
                f14 = 0.0f;
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
        public final int L0(int i13, q2 recycler, w2 state) {
            Intrinsics.checkNotNullParameter(recycler, "recycler");
            Intrinsics.checkNotNullParameter(state, "state");
            int L0 = super.L0(i13, recycler, state);
            if (this.f19157p == 0) {
                I1();
            }
            return L0;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
        public final void y0(w2 w2Var) {
            super.y0(w2Var);
            Unit unit = Unit.f80348a;
            I1();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardPreviewCarousel(@NotNull Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public final void a(List pins) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        f fVar = this.f51849c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(pins, "pins");
        if (Intrinsics.d((List) fVar.f53075f, pins)) {
            return;
        }
        fVar.f53075f = pins;
        fVar.h();
    }

    public final void b(String boardName, String userName, List templates) {
        Intrinsics.checkNotNullParameter(templates, "items");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(userName, "userName");
        f fVar = this.f51849c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(templates, "templates");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(userName, "userName");
        if (!Intrinsics.d(fVar.f53074e, templates)) {
            fVar.f53074e = templates;
            fVar.h();
        }
        fVar.f53076g = boardName;
        fVar.f53077h = userName;
    }

    public final void c(b bVar) {
        this.f51847a = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardPreviewCarousel(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        f fVar = new f();
        this.f51849c = fVar;
        n1 n1Var = new n1();
        this.f51850d = n1Var;
        CenterZoomLayoutManager centerZoomLayoutManager = new CenterZoomLayoutManager(context);
        this.f51851e = centerZoomLayoutManager;
        a aVar = new a(this);
        View.inflate(context, d.view_board_preview_carousel, this);
        View findViewById = findViewById(c.board_preview_carousel_rv);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        recyclerView.H2(fVar);
        recyclerView.R2(centerZoomLayoutManager);
        recyclerView.o(aVar);
        recyclerView.m(new e(1));
        recyclerView.m(new ko0.b(recyclerView.getResources().getDimensionPixelOffset(eo1.c.space_800), 4));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f51848b = recyclerView;
        n1Var.b(recyclerView);
    }
}
