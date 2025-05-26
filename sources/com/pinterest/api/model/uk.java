package com.pinterest.api.model;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class uk implements vk {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ uk[] $VALUES;
    public static final uk Collapse;
    public static final uk FadeOut;
    public static final uk Instant;
    public static final uk ScaleOutDown;
    public static final uk ScaleOutUp;
    public static final uk Shrink;
    public static final uk SlideOutDown;
    public static final uk SlideOutLeft;
    public static final uk SlideOutRight;
    public static final uk SlideOutUp;

    @NotNull
    private final wk type;

    private static final /* synthetic */ uk[] $values() {
        return new uk[]{Instant, FadeOut, SlideOutLeft, SlideOutRight, SlideOutUp, SlideOutDown, ScaleOutUp, ScaleOutDown, Collapse, Shrink};
    }

    static {
        final String str = "Instant";
        final int i13 = 0;
        Instant = new uk(str, i13) { // from class: com.pinterest.api.model.ik

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f38804a;

            /* renamed from: b, reason: collision with root package name */
            public final kotlin.collections.q0 f38805b;

            {
                wk wkVar = wk.Instant;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f38804a = new ValueAnimator();
                this.f38805b = kotlin.collections.q0.f80391a;
            }

            @Override // com.pinterest.api.model.uk
            public final ValueAnimator animation() {
                return new ValueAnimator();
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final ValueAnimator getDefaultAnimator() {
                return this.f38804a;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final List getProperties() {
                return this.f38805b;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void glTransformations(hn transformer, qw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                drawCallback.invoke(transformer.f38494a, Float.valueOf(1.0f));
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void viewTransformations(View view, qw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            }
        };
        final String str2 = "FadeOut";
        final int i14 = 1;
        FadeOut = new uk(str2, i14) { // from class: com.pinterest.api.model.hk

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f38471a;

            /* renamed from: b, reason: collision with root package name */
            public final List f38472b;

            {
                wk wkVar = wk.FadeOut;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f38471a = animation();
                this.f38472b = kotlin.collections.e0.b(sw0.Alpha);
            }

            @Override // com.pinterest.api.model.uk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final ValueAnimator getDefaultAnimator() {
                return this.f38471a;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final List getProperties() {
                return this.f38472b;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void glTransformations(hn transformer, qw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f38471a;
                valueAnimator.setCurrentFraction(f13);
                drawCallback.invoke(transformer.f38494a, (Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float"));
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void viewTransformations(View view, qw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f38471a;
                valueAnimator.setCurrentFraction(f13);
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        final String str3 = "SlideOutLeft";
        final int i15 = 2;
        SlideOutLeft = new uk(str3, i15) { // from class: com.pinterest.api.model.pk

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f41014a;

            /* renamed from: b, reason: collision with root package name */
            public final List f41015b;

            {
                wk wkVar = wk.SlideOutLeft;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f41014a = animation();
                this.f41015b = kotlin.collections.f0.j(sw0.TranslationX, sw0.Alpha);
            }

            @Override // com.pinterest.api.model.uk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, 0.0f, -200.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final ValueAnimator getDefaultAnimator() {
                return this.f41014a;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final List getProperties() {
                return this.f41015b;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void glTransformations(hn transformer, qw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f41014a;
                valueAnimator.setCurrentFraction(f13);
                hn.c(transformer, ((Float) pk2.f.d(View.TRANSLATION_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue(), 0.0f, new ok(drawCallback, ((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue()), 2);
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void viewTransformations(View view, qw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f41014a;
                valueAnimator.setCurrentFraction(f13);
                view.setTranslationX(((Float) pk2.f.d(View.TRANSLATION_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        final String str4 = "SlideOutRight";
        final int i16 = 3;
        SlideOutRight = new uk(str4, i16) { // from class: com.pinterest.api.model.rk

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f41617a;

            /* renamed from: b, reason: collision with root package name */
            public final List f41618b;

            {
                wk wkVar = wk.SlideOutRight;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f41617a = animation();
                this.f41618b = kotlin.collections.f0.j(sw0.TranslationX, sw0.Alpha);
            }

            @Override // com.pinterest.api.model.uk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, 0.0f, 200.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final ValueAnimator getDefaultAnimator() {
                return this.f41617a;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final List getProperties() {
                return this.f41618b;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void glTransformations(hn transformer, qw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f41617a;
                valueAnimator.setCurrentFraction(f13);
                hn.c(transformer, ((Float) pk2.f.d(View.TRANSLATION_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue(), 0.0f, new qk(drawCallback, ((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue()), 2);
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void viewTransformations(View view, qw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f41617a;
                valueAnimator.setCurrentFraction(f13);
                view.setTranslationX(((Float) pk2.f.d(View.TRANSLATION_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        final String str5 = "SlideOutUp";
        final int i17 = 4;
        SlideOutUp = new uk(str5, i17) { // from class: com.pinterest.api.model.tk

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f42227a;

            /* renamed from: b, reason: collision with root package name */
            public final List f42228b;

            {
                wk wkVar = wk.SlideOutUp;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f42227a = animation();
                this.f42228b = kotlin.collections.f0.j(sw0.TranslationY, sw0.Alpha);
            }

            @Override // com.pinterest.api.model.uk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f, -200.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final ValueAnimator getDefaultAnimator() {
                return this.f42227a;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final List getProperties() {
                return this.f42228b;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void glTransformations(hn transformer, qw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f42227a;
                valueAnimator.setCurrentFraction(f13);
                hn.c(transformer, 0.0f, ((Float) pk2.f.d(View.TRANSLATION_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue(), new sk(drawCallback, ((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue()), 1);
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void viewTransformations(View view, qw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f42227a;
                valueAnimator.setCurrentFraction(f13);
                view.setTranslationY(((Float) pk2.f.d(View.TRANSLATION_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        final String str6 = "SlideOutDown";
        final int i18 = 5;
        SlideOutDown = new uk(str6, i18) { // from class: com.pinterest.api.model.nk

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f40427a;

            /* renamed from: b, reason: collision with root package name */
            public final List f40428b;

            {
                wk wkVar = wk.SlideOutDown;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f40427a = animation();
                this.f40428b = kotlin.collections.f0.j(sw0.TranslationY, sw0.Alpha);
            }

            @Override // com.pinterest.api.model.uk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f, 200.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final ValueAnimator getDefaultAnimator() {
                return this.f40427a;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final List getProperties() {
                return this.f40428b;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void glTransformations(hn transformer, qw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f40427a;
                valueAnimator.setCurrentFraction(f13);
                hn.c(transformer, 0.0f, ((Float) pk2.f.d(View.TRANSLATION_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue(), new mk(drawCallback, ((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue()), 1);
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void viewTransformations(View view, qw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f40427a;
                valueAnimator.setCurrentFraction(f13);
                view.setTranslationY(((Float) pk2.f.d(View.TRANSLATION_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        final String str7 = "ScaleOutUp";
        final int i19 = 6;
        ScaleOutUp = new uk(str7, i19) { // from class: com.pinterest.api.model.kk

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f39482a;

            /* renamed from: b, reason: collision with root package name */
            public final List f39483b;

            {
                wk wkVar = wk.ScaleOutUp;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f39482a = animation();
                this.f39483b = kotlin.collections.f0.j(sw0.ScaleX, sw0.ScaleY, sw0.Alpha);
            }

            @Override // com.pinterest.api.model.uk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 2.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 2.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final ValueAnimator getDefaultAnimator() {
                return this.f39482a;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final List getProperties() {
                return this.f39483b;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void glTransformations(hn transformer, qw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f39482a;
                valueAnimator.setCurrentFraction(f13);
                float floatValue = ((Float) pk2.f.d(View.SCALE_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                float floatValue2 = ((Float) pk2.f.d(View.SCALE_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                drawCallback.invoke(transformer.a(floatValue, floatValue2), (Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float"));
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void viewTransformations(View view, qw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f39482a;
                valueAnimator.setCurrentFraction(f13);
                if (pointF != null) {
                    view.setPivotX(pointF.x);
                    view.setPivotY(pointF.y);
                }
                view.setScaleX(((Float) pk2.f.d(View.SCALE_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setScaleY(((Float) pk2.f.d(View.SCALE_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        final String str8 = "ScaleOutDown";
        final int i23 = 7;
        ScaleOutDown = new uk(str8, i23) { // from class: com.pinterest.api.model.jk

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f39078a;

            /* renamed from: b, reason: collision with root package name */
            public final List f39079b;

            {
                wk wkVar = wk.ScaleOutDown;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f39078a = animation();
                this.f39079b = kotlin.collections.f0.j(sw0.ScaleX, sw0.ScaleY, sw0.Alpha);
            }

            @Override // com.pinterest.api.model.uk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final ValueAnimator getDefaultAnimator() {
                return this.f39078a;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final List getProperties() {
                return this.f39079b;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void glTransformations(hn transformer, qw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f39078a;
                valueAnimator.setCurrentFraction(f13);
                float floatValue = ((Float) pk2.f.d(View.SCALE_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                float floatValue2 = ((Float) pk2.f.d(View.SCALE_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                drawCallback.invoke(transformer.a(floatValue, floatValue2), (Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float"));
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void viewTransformations(View view, qw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f39078a;
                valueAnimator.setCurrentFraction(f13);
                if (pointF != null) {
                    view.setPivotX(pointF.x);
                    view.setPivotY(pointF.y);
                }
                view.setScaleX(((Float) pk2.f.d(View.SCALE_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setScaleY(((Float) pk2.f.d(View.SCALE_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        final String str9 = "Collapse";
        final int i24 = 8;
        Collapse = new uk(str9, i24) { // from class: com.pinterest.api.model.gk

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f38080a;

            /* renamed from: b, reason: collision with root package name */
            public final List f38081b;

            {
                wk wkVar = wk.Collapse;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f38080a = animation();
                this.f38081b = kotlin.collections.f0.j(sw0.ScaleX, sw0.Alpha);
            }

            @Override // com.pinterest.api.model.uk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final ValueAnimator getDefaultAnimator() {
                return this.f38080a;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final List getProperties() {
                return this.f38081b;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void glTransformations(hn transformer, qw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f38080a;
                valueAnimator.setCurrentFraction(f13);
                float floatValue = ((Float) pk2.f.d(View.SCALE_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                drawCallback.invoke(hn.b(transformer, floatValue, 0.0f, 2), (Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float"));
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void viewTransformations(View view, qw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f38080a;
                valueAnimator.setCurrentFraction(f13);
                if (pointF != null) {
                    view.setPivotX(pointF.x);
                    view.setPivotY(pointF.y);
                }
                view.setScaleX(((Float) pk2.f.d(View.SCALE_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        final String str10 = "Shrink";
        final int i25 = 9;
        Shrink = new uk(str10, i25) { // from class: com.pinterest.api.model.lk

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f39810a;

            /* renamed from: b, reason: collision with root package name */
            public final List f39811b;

            {
                wk wkVar = wk.Shrink;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f39810a = animation();
                this.f39811b = kotlin.collections.f0.j(sw0.ScaleY, sw0.Alpha);
            }

            @Override // com.pinterest.api.model.uk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final ValueAnimator getDefaultAnimator() {
                return this.f39810a;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final List getProperties() {
                return this.f39811b;
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void glTransformations(hn transformer, qw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f39810a;
                valueAnimator.setCurrentFraction(f13);
                float floatValue = ((Float) pk2.f.d(View.SCALE_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                drawCallback.invoke(hn.b(transformer, 0.0f, floatValue, 1), (Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float"));
            }

            @Override // com.pinterest.api.model.uk, com.pinterest.api.model.vk
            public final void viewTransformations(View view, qw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41393a;
                ValueAnimator valueAnimator = this.f39810a;
                valueAnimator.setCurrentFraction(f13);
                if (pointF != null) {
                    view.setPivotX(pointF.x);
                    view.setPivotY(pointF.y);
                }
                view.setScaleY(((Float) pk2.f.d(View.SCALE_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        uk[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    public /* synthetic */ uk(String str, int i13, wk wkVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, wkVar);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static uk valueOf(String str) {
        return (uk) Enum.valueOf(uk.class, str);
    }

    public static uk[] values() {
        return (uk[]) $VALUES.clone();
    }

    @NotNull
    public abstract /* synthetic */ ValueAnimator animation();

    @NotNull
    public abstract /* synthetic */ ValueAnimator getDefaultAnimator();

    @NotNull
    public abstract /* synthetic */ List getProperties();

    @NotNull
    public wk getType() {
        return this.type;
    }

    public abstract /* synthetic */ void glTransformations(@NotNull hn hnVar, @NotNull qw0 qw0Var, @NotNull Function2 function2);

    public abstract /* synthetic */ void viewTransformations(@NotNull View view, @NotNull qw0 qw0Var, PointF pointF);

    private uk(String str, int i13, wk wkVar) {
        this.type = wkVar;
    }
}
