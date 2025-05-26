package com.pinterest.musicsheet.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/musicsheet/view/MusicSheetItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "musicsheet_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MusicSheetItemView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f49889a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f49890b;

    /* renamed from: c, reason: collision with root package name */
    public final WebImageView f49891c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MusicSheetItemView(int r2, int r3, android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r1 = this;
            r0 = r3 & 2
            if (r0 == 0) goto L5
            r5 = 0
        L5:
            r3 = r3 & 4
            r0 = 0
            if (r3 == 0) goto Lb
            r2 = r0
        Lb:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            r1.<init>(r4, r5, r2, r0)
            int r2 = yt1.c.view_music_attribution_list_item
            android.view.View.inflate(r4, r2, r1)
            android.content.res.Resources r2 = r1.getResources()
            int r3 = eo1.c.space_100
            int r2 = r2.getDimensionPixelSize(r3)
            r1.setPadding(r0, r2, r0, r2)
            int r2 = yt1.b.music_attribution_title
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r3 = "findViewById(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.pinterest.gestalt.text.GestaltText r2 = (com.pinterest.gestalt.text.GestaltText) r2
            r1.f49889a = r2
            int r2 = yt1.b.music_attribution_artist
            android.view.View r2 = r1.findViewById(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.pinterest.gestalt.text.GestaltText r2 = (com.pinterest.gestalt.text.GestaltText) r2
            r1.f49890b = r2
            int r2 = yt1.b.music_attribution_icon
            android.view.View r2 = r1.findViewById(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.pinterest.ui.imageview.WebImageView r2 = (com.pinterest.ui.imageview.WebImageView) r2
            r1.f49891c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.musicsheet.view.MusicSheetItemView.<init>(int, int, android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicSheetItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicSheetItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
