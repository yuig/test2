package com.pinterest.feature.ideaPinCreation.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import dl2.b;
import dq1.d;
import dq1.f;
import eo1.a;
import eo1.c;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import tt0.x0;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/camera/view/IdeaPinDraftsButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinDraftsButton extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final v f45940a;

    /* renamed from: b, reason: collision with root package name */
    public final v f45941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinDraftsButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        v b13 = m.b(new x0(this, 0));
        this.f45940a = b13;
        this.f45941b = m.b(new x0(this, 1));
        View.inflate(getContext(), d.view_idea_pin_creation_camera_drafts_button, this);
        Object value = b13.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        WebImageView webImageView = (WebImageView) value;
        Context context2 = webImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (b.T1(context2)) {
            webImageView.U1(c.lego_corner_radius_medium);
        } else {
            webImageView.U1(c.comp_iconbutton_lg_rounding_classic);
        }
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public final void a(int i13, String str) {
        Unit unit;
        Object value = this.f45940a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        WebImageView webImageView = (WebImageView) value;
        if (str != null) {
            webImageView.t2(new File(str));
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            webImageView.clear();
            Context context = webImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            webImageView.setBackgroundColor(b.x0(context, a.comp_iconbutton_light_gray_background_color));
        }
        Object value2 = this.f45941b.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        a0.p((GestaltText) value2, bs1.c.g2(this, f.idea_pin_page_count_label, Integer.valueOf(i13)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinDraftsButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        v b13 = m.b(new x0(this, 0));
        this.f45940a = b13;
        this.f45941b = m.b(new x0(this, 1));
        View.inflate(getContext(), d.view_idea_pin_creation_camera_drafts_button, this);
        Object value = b13.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        WebImageView webImageView = (WebImageView) value;
        Context context2 = webImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (b.T1(context2)) {
            webImageView.U1(c.lego_corner_radius_medium);
        } else {
            webImageView.U1(c.comp_iconbutton_lg_rounding_classic);
        }
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
