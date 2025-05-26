package com.pinterest.feature.modules.shopTheLookFocus.shopTheLookCarousel;

import af2.b;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import dx0.y;
import g01.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import nx.v;
import org.jetbrains.annotations.NotNull;
import so.ua;
import ye2.o;
import zy.q0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/modules/shopTheLookFocus/shopTheLookCarousel/ShopTheLookCarouselContainer;", "Landroid/widget/FrameLayout;", "Lnx/v;", "", "shoppinglibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ShopTheLookCarouselContainer extends FrameLayout implements v, c {

    /* renamed from: a, reason: collision with root package name */
    public o f46773a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46774b;

    /* renamed from: c, reason: collision with root package name */
    public final ua f46775c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f46776d;

    /* renamed from: e, reason: collision with root package name */
    public y f46777e;

    /* renamed from: f, reason: collision with root package name */
    public final a f46778f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ShopTheLookCarouselContainer(int r2, int r3, android.content.Context r4, android.util.AttributeSet r5) {
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
            boolean r2 = r1.f46774b
            if (r2 != 0) goto L33
            r2 = 1
            r1.f46774b = r2
            java.lang.Object r2 = r1.generatedComponent()
            dx0.e r2 = (dx0.e) r2
            so.jb r2 = (so.jb) r2
            bf2.d r3 = r2.f113505w
            java.lang.Object r3 = r3.get()
            so.ua r3 = (so.ua) r3
            r1.f46775c = r3
            so.oa r2 = r2.f113483a
            bf2.d r2 = r2.Nb
            java.lang.Object r2 = r2.get()
            zy.q0 r2 = (zy.q0) r2
            r1.f46776d = r2
        L33:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            g01.a r5 = new g01.a
            o82.i0 r0 = new o82.i0
            r0.<init>(r2, r4)
            mb0.a r2 = new mb0.a
            r2.<init>(r3)
            r5.<init>(r0, r2)
            r1.f46778f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.modules.shopTheLookFocus.shopTheLookCarousel.ShopTheLookCarouselContainer.<init>(int, int, android.content.Context, android.util.AttributeSet):void");
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f46773a == null) {
            this.f46773a = new o(this);
        }
        return this.f46773a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f46773a == null) {
            this.f46773a = new o(this);
        }
        return this.f46773a.generatedComponent();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        y yVar = this.f46777e;
        if (yVar == null) {
            return null;
        }
        Intrinsics.g(yVar, "null cannot be cast to non-null type android.view.View");
        return e0.b(yVar);
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
    public ShopTheLookCarouselContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShopTheLookCarouselContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
