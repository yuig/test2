package com.pinterest.feature.mediagallery.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import d5.a;
import dt1.b;
import dt1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import pw0.k;
import yk1.d;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/mediagallery/view/MediaDirectoryView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mediaGalleryLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MediaDirectoryView extends LinearLayout implements d {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f46734f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f46735a;

    /* renamed from: b, reason: collision with root package name */
    public final ProportionalImageView f46736b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f46737c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f46738d;

    /* renamed from: e, reason: collision with root package name */
    public k f46739e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaDirectoryView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MediaDirectoryView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaDirectoryView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46735a = getResources().getDimensionPixelSize(r0.thumbnail_large_size);
        View.inflate(context, c.media_directory_view, this);
        View findViewById = findViewById(b.media_thumbnail);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ProportionalImageView proportionalImageView = (ProportionalImageView) findViewById;
        this.f46736b = proportionalImageView;
        int i14 = eo1.b.color_themed_background_dark_opacity_200;
        Object obj = a.f53679a;
        proportionalImageView.setForeground(new ColorDrawable(context.getColor(i14)));
        View findViewById2 = findViewById(b.media_folder);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46737c = (GestaltText) findViewById2;
        View findViewById3 = findViewById(b.media_count);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f46738d = (GestaltText) findViewById3;
    }
}
