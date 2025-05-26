package com.pinterest.feature.ideaPinCreation.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import aq1.f;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import np0.h;
import org.jetbrains.annotations.NotNull;
import tt0.o;
import tt0.p;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/camera/view/IdeaPinCreationCameraBottomBarControlsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tt0/o", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinCreationCameraBottomBarControlsView extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f45914h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f45915a;

    /* renamed from: b, reason: collision with root package name */
    public final v f45916b;

    /* renamed from: c, reason: collision with root package name */
    public final v f45917c;

    /* renamed from: d, reason: collision with root package name */
    public final v f45918d;

    /* renamed from: e, reason: collision with root package name */
    public final v f45919e;

    /* renamed from: f, reason: collision with root package name */
    public final v f45920f;

    /* renamed from: g, reason: collision with root package name */
    public o f45921g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationCameraBottomBarControlsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationCameraBottomBarControlsView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45915a = m.b(new p(this, 1));
        this.f45916b = m.b(new p(this, 2));
        this.f45917c = m.b(new p(this, 3));
        this.f45918d = m.b(new p(this, 5));
        this.f45919e = m.b(new p(this, 4));
        v b13 = m.b(new p(this, 0));
        this.f45920f = b13;
        View.inflate(context, f.idea_pin_creation_camera_controls_view, this);
        Object value = b13.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((GestaltText) value).j(new h(this, 8));
    }
}
