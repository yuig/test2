package com.pinterest.feature.search.typeahead.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar0.b;
import k71.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o71.o;
import org.jetbrains.annotations.NotNull;
import xk2.v;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/search/typeahead/view/SearchTypeaheadHashtagCell;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lk71/e;", "Lar0/b;", "searchLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchTypeaheadHashtagCell extends ConstraintLayout implements e, b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f47850d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f47851a;

    /* renamed from: b, reason: collision with root package name */
    public final v f47852b;

    /* renamed from: c, reason: collision with root package name */
    public o f47853c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadHashtagCell(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ar0.b
    public final boolean b() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadHashtagCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, null, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SearchTypeaheadHashtagCell(android.content.Context r4, android.util.AttributeSet r5, int r6, vn1.c r7, int r8) {
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
            r3.<init>(r4, r5, r6)
            q71.z r5 = new q71.z
            r6 = 1
            r5.<init>(r3, r6)
            xk2.v r5 = xk2.m.b(r5)
            r3.f47851a = r5
            q71.z r6 = new q71.z
            r6.<init>(r3, r2)
            xk2.v r6 = xk2.m.b(r6)
            r3.f47852b = r6
            int r6 = k42.e.list_search_typeahead_hashtag_item
            android.view.View.inflate(r4, r6, r3)
            android.view.ViewGroup$MarginLayoutParams r6 = new android.view.ViewGroup$MarginLayoutParams
            r8 = -1
            r0 = -2
            r6.<init>(r8, r0)
            r3.setLayoutParams(r6)
            int r6 = k42.c.rounded_corners_pressed_state
            java.lang.Object r8 = d5.a.f53679a
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r6)
            r3.setBackground(r4)
            java.lang.Object r4 = r5.getValue()
            java.lang.String r5 = "getValue(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            com.pinterest.gestalt.text.GestaltText r4 = (com.pinterest.gestalt.text.GestaltText) r4
            q71.q r5 = q71.q.f102739k
            r4.i(r5)
            android.content.res.Resources r4 = r3.getResources()
            int r5 = eo1.c.space_200
            int r4 = r4.getDimensionPixelSize(r5)
            android.content.res.Resources r5 = r3.getResources()
            int r6 = eo1.c.space_400
            int r5 = r5.getDimensionPixelSize(r6)
            r3.setPaddingRelative(r5, r4, r5, r4)
            x61.e r4 = new x61.e
            r5 = 6
            r4.<init>(r3, r5)
            r3.setOnClickListener(r4)
            if (r7 == 0) goto La0
            int r4 = k42.d.cell_desc
            android.view.View r4 = r3.findViewById(r4)
            com.pinterest.gestalt.text.GestaltText r4 = (com.pinterest.gestalt.text.GestaltText) r4
            sp.a r5 = new sp.a
            r6 = 11
            r5.<init>(r6, r7)
            r4.i(r5)
            int r4 = k42.d.cell_title
            android.view.View r4 = r3.findViewById(r4)
            com.pinterest.gestalt.text.GestaltText r4 = (com.pinterest.gestalt.text.GestaltText) r4
            sp.a r5 = new sp.a
            r6 = 12
            r5.<init>(r6, r7)
            r4.i(r5)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.search.typeahead.view.SearchTypeaheadHashtagCell.<init>(android.content.Context, android.util.AttributeSet, int, vn1.c, int):void");
    }
}
