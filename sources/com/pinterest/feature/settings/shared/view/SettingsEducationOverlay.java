package com.pinterest.feature.settings.shared.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import bs1.c;
import c52.d;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.List;
import kc1.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import la1.k;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rg0.n;
import xo.u;
import yc1.a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/settings/shared/view/SettingsEducationOverlay;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "settingsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SettingsEducationOverlay extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f48329c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final SettingsEducationTooltip f48330a;

    /* renamed from: b, reason: collision with root package name */
    public n f48331b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SettingsEducationOverlay(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        c.R1(this.f48330a, false);
        c.R1(this, false);
        n nVar = this.f48331b;
        if (nVar != null) {
            nVar.c(null, null);
        }
        this.f48331b = null;
    }

    public final void b(int i13, List list) {
        int size = list.size();
        SettingsEducationTooltip settingsEducationTooltip = this.f48330a;
        if (i13 >= size) {
            c.R1(settingsEducationTooltip, false);
            c.R1(this, false);
            n nVar = this.f48331b;
            if (nVar != null) {
                nVar.a(null, null);
            }
            this.f48331b = null;
            return;
        }
        a step = (a) list.get(i13);
        u uVar = new u(this, list, i13, 5);
        int i14 = 2;
        int[] iArr = new int[2];
        step.f138697a.getLocationOnScreen(iArr);
        int measuredHeight = (iArr[1] - step.f138697a.getMeasuredHeight()) + settingsEducationTooltip.f48333f;
        c.R1(settingsEducationTooltip, true);
        Intrinsics.checkNotNullParameter(step, "step");
        GestaltText gestaltText = settingsEducationTooltip.f48334g;
        if (gestaltText == null) {
            Intrinsics.r("messageView");
            throw null;
        }
        a0.p(gestaltText, step.f138698b);
        GestaltButton gestaltButton = settingsEducationTooltip.f48335h;
        if (gestaltButton == null) {
            Intrinsics.r("actionButton");
            throw null;
        }
        gestaltButton.d(new w(step, 9));
        GestaltButton gestaltButton2 = settingsEducationTooltip.f48335h;
        if (gestaltButton2 == null) {
            Intrinsics.r("actionButton");
            throw null;
        }
        gestaltButton2.e(new k(i14, uVar, settingsEducationTooltip));
        float f13 = measuredHeight;
        settingsEducationTooltip.setAlpha(0.0f);
        settingsEducationTooltip.setTranslationY(settingsEducationTooltip.f48337j + f13);
        settingsEducationTooltip.animate().alpha(1.0f).translationY(f13).setDuration(settingsEducationTooltip.f48336i);
    }

    public final void c(n experience, ArrayList educationSteps) {
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(educationSteps, "educationSteps");
        if (educationSteps.isEmpty()) {
            return;
        }
        this.f48331b = experience;
        if (experience != null) {
            experience.g();
        }
        c.R1(this, true);
        b(0, educationSteps);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        Rect rect = new Rect();
        SettingsEducationTooltip settingsEducationTooltip = this.f48330a;
        settingsEducationTooltip.getDrawingRect(rect);
        int i13 = rect.left;
        int i14 = settingsEducationTooltip.f48333f;
        rect.left = Math.max(0, i13 - i14);
        rect.top = Math.max(0, rect.top - i14);
        rect.right += i14;
        rect.bottom += i14;
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        a();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsEducationOverlay(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, d.view_settings_education_overlay, this);
        View findViewById = findViewById(c52.c.tooltip);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48330a = (SettingsEducationTooltip) findViewById;
    }
}
