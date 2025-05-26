package com.pinterest.feature.sharesheet.view;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.ViewGroup;
import cd1.e;
import com.pinterest.feature.boardpreview.view.BaseBoardPreviewContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ml2.c;
import org.jetbrains.annotations.NotNull;
import ql2.s;
import x72.j;
import xk2.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/sharesheet/view/SharesheetBoardPreviewContainer;", "Lcom/pinterest/feature/boardpreview/view/BaseBoardPreviewContainer;", "", "g4/u", "sharesheetLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SharesheetBoardPreviewContainer extends BaseBoardPreviewContainer {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f48407w = 0;

    /* renamed from: s, reason: collision with root package name */
    public e f48408s;

    /* renamed from: t, reason: collision with root package name */
    public final v f48409t;

    /* renamed from: u, reason: collision with root package name */
    public final v f48410u;

    /* renamed from: v, reason: collision with root package name */
    public float f48411v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharesheetBoardPreviewContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void e(float f13) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (this.f48411v == -1.0f) {
            this.f48411v = layoutParams.height;
        }
        float f14 = this.f48411v - (f13 / 3);
        this.f48411v = f14;
        v vVar = this.f48409t;
        float f15 = s.f(f14, ((Number) vVar.getValue()).intValue() * 0.75f, ((Number) vVar.getValue()).intValue());
        this.f48411v = f15;
        float f16 = s.f(f15 / ((Number) vVar.getValue()).intValue(), 0.75f, 1.0f);
        layoutParams.height = c.c(this.f48411v);
        layoutParams.width = c.c(((Number) this.f48410u.getValue()).intValue() * f16);
        j jVar = this.f45334h;
        if (jVar != null) {
            Matrix matrix = new Matrix();
            jVar.k().getTransform(matrix);
            matrix.setScale(f16, f16);
            jVar.k().setTransform(matrix);
        }
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharesheetBoardPreviewContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, null, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SharesheetBoardPreviewContainer(android.content.Context r4, android.util.AttributeSet r5, int r6, java.lang.Integer r7, int r8) {
        /*
            r3 = this;
            r0 = r8 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r5 = r1
        L6:
            r0 = r8 & 4
            r2 = 0
            if (r0 == 0) goto Lc
            r6 = r2
        Lc:
            r8 = r8 & 8
            if (r8 == 0) goto L11
            r7 = r1
        L11:
            java.lang.String r8 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r8)
            r3.<init>(r4, r5, r6, r7)
            fd1.l0 r5 = new fd1.l0
            r5.<init>(r3, r2)
            xk2.v r5 = xk2.m.b(r5)
            r3.f48409t = r5
            fd1.l0 r5 = new fd1.l0
            r6 = 1
            r5.<init>(r3, r6)
            xk2.v r5 = xk2.m.b(r5)
            r3.f48410u = r5
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f48411v = r5
            com.pinterest.gestalt.iconbutton.GestaltIconButton r5 = new com.pinterest.gestalt.iconbutton.GestaltIconButton
            r6 = 6
            r5.<init>(r6, r4, r1)
            fd1.i r4 = fd1.i.f61939v
            r5.t(r4)
            ca1.h r4 = new ca1.h
            r6 = 16
            r4.<init>(r3, r6)
            r5.u(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r6 = -2
            r4.<init>(r6, r6)
            r6 = 8388693(0x800055, float:1.1755063E-38)
            r4.gravity = r6
            int r6 = eo1.c.space_300
            int r6 = bs1.c.W(r5, r6)
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r7)
            pp2.a.P0(r4, r6, r6, r6, r6)
            r5.setLayoutParams(r4)
            r3.addView(r5)
            lc1.b r4 = new lc1.b
            r5 = 12
            r4.<init>(r3, r5)
            r3.setOnClickListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.sharesheet.view.SharesheetBoardPreviewContainer.<init>(android.content.Context, android.util.AttributeSet, int, java.lang.Integer, int):void");
    }
}
