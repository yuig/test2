package com.pinterest.feature.ideaPinCreation.camera.view;

import a.cb;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import aq1.c;
import aq1.d;
import com.google.android.material.navigation.b;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import tt0.a;
import uk2.f;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/camera/view/IdeaPinCameraToggle;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinCameraToggle extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f45906a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45907b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f45908c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f45909d;

    /* renamed from: e, reason: collision with root package name */
    public Pair f45910e;

    /* renamed from: f, reason: collision with root package name */
    public Float f45911f;

    /* renamed from: g, reason: collision with root package name */
    public final f f45912g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f45913h;

    public IdeaPinCameraToggle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean a() {
        Float f13 = this.f45911f;
        if (f13 == null) {
            return false;
        }
        float floatValue = f13.floatValue();
        int[] iArr = new int[2];
        FrameLayout frameLayout = this.f45909d;
        if (frameLayout == null) {
            Intrinsics.r("photoTextViewContainer");
            throw null;
        }
        frameLayout.getLocationOnScreen(iArr);
        int i13 = iArr[0];
        if (floatValue < i13) {
            return false;
        }
        FrameLayout frameLayout2 = this.f45909d;
        if (frameLayout2 != null) {
            return floatValue <= ((float) (frameLayout2.getWidth() + i13));
        }
        Intrinsics.r("photoTextViewContainer");
        throw null;
    }

    public final void b() {
        FrameLayout frameLayout = this.f45909d;
        if (frameLayout == null) {
            Intrinsics.r("photoTextViewContainer");
            throw null;
        }
        frameLayout.setBackground(getContext().getDrawable(c.rounded_corner_lego_white_always));
        GestaltText gestaltText = this.f45907b;
        if (gestaltText == null) {
            Intrinsics.r("photoTextView");
            throw null;
        }
        gestaltText.i(a.f119051k);
        GestaltText gestaltText2 = this.f45906a;
        if (gestaltText2 == null) {
            Intrinsics.r("videoTextView");
            throw null;
        }
        gestaltText2.i(a.f119052l);
        FrameLayout frameLayout2 = this.f45908c;
        if (frameLayout2 != null) {
            frameLayout2.setBackground(null);
        } else {
            Intrinsics.r("videoTextViewContainer");
            throw null;
        }
    }

    public final void c() {
        FrameLayout frameLayout = this.f45908c;
        if (frameLayout == null) {
            Intrinsics.r("videoTextViewContainer");
            throw null;
        }
        frameLayout.setBackground(getContext().getDrawable(c.rounded_corner_lego_white_always));
        GestaltText gestaltText = this.f45906a;
        if (gestaltText == null) {
            Intrinsics.r("videoTextView");
            throw null;
        }
        gestaltText.i(a.f119053m);
        GestaltText gestaltText2 = this.f45907b;
        if (gestaltText2 == null) {
            Intrinsics.r("photoTextView");
            throw null;
        }
        gestaltText2.i(a.f119054n);
        FrameLayout frameLayout2 = this.f45909d;
        if (frameLayout2 != null) {
            frameLayout2.setBackground(null);
        } else {
            Intrinsics.r("photoTextViewContainer");
            throw null;
        }
    }

    public final void d() {
        Pair pair = this.f45910e;
        if (pair != null) {
            setX(((Number) pair.f80347b).floatValue());
            this.f45912g.c(rt0.a.VIDEO);
        }
    }

    /* renamed from: e, reason: from getter */
    public final f getF45912g() {
        return this.f45912g;
    }

    public IdeaPinCameraToggle(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f45912g = cb.r("create(...)");
        setOrientation(0);
        View.inflate(context, aq1.f.idea_pin_camera_toggle, this);
        View findViewById = findViewById(d.video_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45906a = (GestaltText) findViewById;
        View findViewById2 = findViewById(d.video_text_view_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45908c = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(d.photo_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45907b = (GestaltText) findViewById3;
        View findViewById4 = findViewById(d.photo_text_view_container);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45909d = (FrameLayout) findViewById4;
        addOnLayoutChangeListener(new b(this, 14));
    }
}
