package com.pinterest.feature.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import d5.a;
import gh1.e;
import kh2.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pt1.b;
import pw0.i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/video/view/IdeaPinVideoExportLoadingView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinVideoExportLoadingView extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f49010b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f49011a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinVideoExportLoadingView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_video_export_loading_view, this);
        setClickable(true);
        Context context2 = getContext();
        int i13 = eo1.b.color_black_900;
        Object obj = a.f53679a;
        setBackgroundColor(context2.getColor(i13));
        setAlpha(0.9f);
        GestaltSpinner gestaltSpinner = (GestaltSpinner) findViewById(pt1.a.loading_view);
        Intrinsics.f(gestaltSpinner);
        s0.w(gestaltSpinner, ei1.a.f58957i);
        View findViewById = findViewById(pt1.a.cancel_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49011a = (GestaltText) findViewById;
    }

    public final void L(i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f49011a.j(new e(listener, 2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinVideoExportLoadingView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_video_export_loading_view, this);
        setClickable(true);
        Context context2 = getContext();
        int i14 = eo1.b.color_black_900;
        Object obj = a.f53679a;
        setBackgroundColor(context2.getColor(i14));
        setAlpha(0.9f);
        GestaltSpinner gestaltSpinner = (GestaltSpinner) findViewById(pt1.a.loading_view);
        Intrinsics.f(gestaltSpinner);
        s0.w(gestaltSpinner, ei1.a.f58957i);
        View findViewById = findViewById(pt1.a.cancel_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49011a = (GestaltText) findViewById;
    }
}
