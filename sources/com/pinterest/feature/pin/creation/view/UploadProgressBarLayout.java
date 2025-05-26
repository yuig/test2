package com.pinterest.feature.pin.creation.view;

import ag1.b;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.media3.ui.c;
import com.pinterest.api.model.tp;
import com.pinterest.feature.video.model.d;
import com.pinterest.feature.video.model.e;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import i2.j2;
import java.util.HashMap;
import jc0.h;
import kb.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import p11.o;
import p11.q;
import p11.r;
import p11.s;
import pk.a0;
import ps0.k;
import qg1.f;
import qg1.i;
import ru1.w;
import wk2.a;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/pin/creation/view/UploadProgressBarLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ps0/y", "pinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UploadProgressBarLayout extends h {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f47125n;

    /* renamed from: d, reason: collision with root package name */
    public w f47126d;

    /* renamed from: e, reason: collision with root package name */
    public a f47127e;

    /* renamed from: f, reason: collision with root package name */
    public b f47128f;

    /* renamed from: g, reason: collision with root package name */
    public final v f47129g;

    /* renamed from: h, reason: collision with root package name */
    public final UploadPreviewView f47130h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f47131i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltIconButton f47132j;

    /* renamed from: k, reason: collision with root package name */
    public final UploadProgressTrackerView f47133k;

    /* renamed from: l, reason: collision with root package name */
    public d f47134l;

    /* renamed from: m, reason: collision with root package name */
    public final q f47135m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadProgressBarLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void e(UploadProgressBarLayout uploadProgressBarLayout) {
        d dVar = uploadProgressBarLayout.f47134l;
        String str = dVar != null ? dVar.f49005h : null;
        if (str == null) {
            str = "";
        }
        uploadProgressBarLayout.d(str, dVar != null ? dVar.f49008k : null);
    }

    public static void f(UploadProgressBarLayout uploadProgressBarLayout, boolean z13) {
        uploadProgressBarLayout.getClass();
        uploadProgressBarLayout.setVisibility(z13 ? 0 : 8);
        w wVar = uploadProgressBarLayout.f47126d;
        if (wVar != null) {
            wVar.a(z13, false);
        }
    }

    public final void d(String uniqueWorkName, String str) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        if (f47125n && Intrinsics.d(uniqueWorkName, "STORY_PIN_UPLOAD_WORK")) {
            d dVar = this.f47134l;
            if ((dVar != null ? dVar.f48998a : null) != e.FAILURE) {
                boolean equals = getResources().getString(uy1.b.upload_no_internet).equals(a0.R(this.f47131i));
                b bVar = this.f47128f;
                if (bVar == null) {
                    Intrinsics.r("ideaPinComposeDataManager");
                    throw null;
                }
                String str2 = equals ? "User cancel without internet" : null;
                bVar.f15140m = true;
                i iVar = bVar.f15134g;
                tp tpVar = bVar.f15133f;
                HashMap a13 = i.a(iVar, tpVar, null, iVar.f103843f, null, str2, null, null, null, null, null, null, null, null, null, str, bVar.f15130c, Boolean.valueOf(bVar.f15138k), null, 147434);
                if (iVar.f103842e) {
                    iVar.j(iVar.f103839b, tpVar, equals ? f1.STORY_PIN_CREATE_USER_FAILURE : f1.STORY_PIN_CREATE_CANCELLED, null, a13);
                } else {
                    i.f(iVar, f.CANCEL_WITH_NO_ATTEMPT, null, tpVar, a13, 6);
                }
                iVar.f103842e = false;
                iVar.f103843f = null;
                iVar.f103844g = false;
            }
        }
        ((w0) this.f47129g.getValue()).c(uniqueWorkName);
        f(this, false);
        UploadProgressTrackerView uploadProgressTrackerView = this.f47133k;
        uploadProgressTrackerView.f47137a = 0.0f;
        uploadProgressTrackerView.invalidate();
        AnimatorSet animatorSet = uploadProgressTrackerView.f47138b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        uploadProgressTrackerView.f47138b = null;
        f47125n = false;
    }

    public final a g() {
        a aVar = this.f47127e;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("eventManagerProvider");
        throw null;
    }

    public final void h(long j13, float f13, float f14) {
        f47125n = true;
        f(this, true);
        UploadProgressTrackerView uploadProgressTrackerView = this.f47133k;
        ValueAnimator b13 = UploadProgressTrackerView.b(uploadProgressTrackerView, f13, 5);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f14);
        ofFloat.addUpdateListener(new c(uploadProgressTrackerView, 14));
        ofFloat.setDuration(j13);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        uploadProgressTrackerView.a(b13, ofFloat);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((m60.w) g().get()).h(this.f47135m);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ((m60.w) g().get()).j(this.f47135m);
        super.onDetachedFromWindow();
    }

    public /* synthetic */ UploadProgressBarLayout(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadProgressBarLayout(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47129g = m.b(s.f98681i);
        UploadPreviewView uploadPreviewView = new UploadPreviewView(6, context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        int dimensionPixelSize = uploadPreviewView.getResources().getDimensionPixelSize(r0.margin_half);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        uploadPreviewView.setLayoutParams(layoutParams);
        this.f47130h = uploadPreviewView;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(new r(gestaltText, 0));
        gestaltText.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        dl2.b.y2(gestaltText);
        this.f47131i = gestaltText;
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context, (AttributeSet) null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388613;
        gestaltIconButton.setLayoutParams(layoutParams2);
        gestaltIconButton.t(o.f98676i);
        gestaltIconButton.u(new k(this, 1));
        this.f47132j = gestaltIconButton;
        UploadProgressTrackerView uploadProgressTrackerView = new UploadProgressTrackerView(6, context, (AttributeSet) null);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, uploadProgressTrackerView.getResources().getDimensionPixelSize(r0.uploader_progress_height));
        layoutParams3.gravity = 48;
        uploadProgressTrackerView.setLayoutParams(layoutParams3);
        this.f47133k = uploadProgressTrackerView;
        v b13 = m.b(new j2(6, context, this));
        this.f47135m = new q(this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(t70.b.uploader_bar_height)));
        setBackgroundResource(eo1.d.drawable_themed_background_elevation_floating);
        addView((LinearLayout) b13.getValue());
        addView(uploadProgressTrackerView);
    }
}
