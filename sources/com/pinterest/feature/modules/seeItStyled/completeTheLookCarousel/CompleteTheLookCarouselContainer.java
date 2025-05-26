package com.pinterest.feature.modules.seeItStyled.completeTheLookCarousel;

import af2.b;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.v;
import org.jetbrains.annotations.NotNull;
import ye2.o;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/modules/seeItStyled/completeTheLookCarousel/CompleteTheLookCarouselContainer;", "Landroid/widget/FrameLayout;", "Lnx/v;", "", "shoppinglibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CompleteTheLookCarouselContainer extends FrameLayout implements v, c {

    /* renamed from: a, reason: collision with root package name */
    public o f46771a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46772b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CompleteTheLookCarouselContainer(int r2, int r3, android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r1 = this;
            r3 = r3 & 4
            r0 = 0
            if (r3 == 0) goto L6
            r2 = r0
        L6:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            r1.<init>(r4, r5, r2, r0)
            boolean r2 = r1.f46772b
            if (r2 != 0) goto L2f
            r2 = 1
            r1.f46772b = r2
            java.lang.Object r2 = r1.generatedComponent()
            zw0.a r2 = (zw0.a) r2
            so.jb r2 = (so.jb) r2
            bf2.d r3 = r2.f113504v
            java.lang.Object r3 = r3.get()
            so.ta r3 = (so.ta) r3
            so.oa r2 = r2.f113483a
            bf2.d r2 = r2.Nb
            java.lang.Object r2 = r2.get()
            zy.q0 r2 = (zy.q0) r2
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.modules.seeItStyled.completeTheLookCarousel.CompleteTheLookCarouselContainer.<init>(int, int, android.content.Context, android.util.AttributeSet):void");
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f46771a == null) {
            this.f46771a = new o(this);
        }
        return this.f46771a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f46771a == null) {
            this.f46771a = new o(this);
        }
        return this.f46771a.generatedComponent();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return null;
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionStart() {
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompleteTheLookCarouselContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompleteTheLookCarouselContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
