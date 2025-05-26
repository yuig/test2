package com.pinterest.api.model;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class dk implements ek {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ dk[] $VALUES;
    public static final dk Expand;
    public static final dk FadeIn;
    public static final dk Instant;
    public static final dk ScaleInDown;
    public static final dk ScaleInUp;
    public static final dk SlideInDown;
    public static final dk SlideInLeft;
    public static final dk SlideInRight;
    public static final dk SlideInUp;
    public static final dk Spread;

    @NotNull
    private final fk type;

    private static final /* synthetic */ dk[] $values() {
        return new dk[]{Instant, FadeIn, SlideInLeft, SlideInRight, SlideInUp, SlideInDown, ScaleInUp, ScaleInDown, Spread, Expand};
    }

    static {
        final String str = "Instant";
        final int i13 = 0;
        Instant = new dk(str, i13) { // from class: com.pinterest.api.model.rj

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f41611a;

            /* renamed from: b, reason: collision with root package name */
            public final kotlin.collections.q0 f41612b;

            {
                fk fkVar = fk.Instant;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f41611a = new ValueAnimator();
                this.f41612b = kotlin.collections.q0.f80391a;
            }

            @Override // com.pinterest.api.model.dk
            public final ValueAnimator animation() {
                return new ValueAnimator();
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final ValueAnimator getDefaultAnimator() {
                return this.f41611a;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final List getProperties() {
                return this.f41612b;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void glTransformations(hn transformer, pw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                drawCallback.invoke(transformer.f38494a, Float.valueOf(1.0f));
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void viewTransformations(View view, pw0 progress, PointF pointF) {
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
        final String str2 = "FadeIn";
        final int i14 = 1;
        FadeIn = new dk(str2, i14) { // from class: com.pinterest.api.model.qj

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f41316a;

            /* renamed from: b, reason: collision with root package name */
            public final List f41317b;

            {
                fk fkVar = fk.FadeIn;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f41316a = animation();
                this.f41317b = kotlin.collections.e0.b(sw0.Alpha);
            }

            @Override // com.pinterest.api.model.dk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final ValueAnimator getDefaultAnimator() {
                return this.f41316a;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final List getProperties() {
                return this.f41317b;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void glTransformations(hn transformer, pw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f41316a;
                valueAnimator.setCurrentFraction(f13);
                drawCallback.invoke(transformer.f38494a, (Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float"));
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void viewTransformations(View view, pw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f41316a;
                valueAnimator.setCurrentFraction(f13);
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        final String str3 = "SlideInLeft";
        final int i15 = 2;
        SlideInLeft = new dk(str3, i15) { // from class: com.pinterest.api.model.xj

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f43707a;

            /* renamed from: b, reason: collision with root package name */
            public final List f43708b;

            {
                fk fkVar = fk.SlideInLeft;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f43707a = animation();
                this.f43708b = kotlin.collections.f0.j(sw0.Alpha, sw0.TranslationX);
            }

            @Override // com.pinterest.api.model.dk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, 200.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final ValueAnimator getDefaultAnimator() {
                return this.f43707a;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final List getProperties() {
                return this.f43708b;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void glTransformations(hn transformer, pw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f43707a;
                valueAnimator.setCurrentFraction(f13);
                hn.c(transformer, ((Float) pk2.f.d(View.TRANSLATION_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue(), 0.0f, new wj(drawCallback, ((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue()), 2);
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void viewTransformations(View view, pw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f43707a;
                valueAnimator.setCurrentFraction(f13);
                view.setTranslationX(((Float) pk2.f.d(View.TRANSLATION_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        final String str4 = "SlideInRight";
        final int i16 = 3;
        SlideInRight = new dk(str4, i16) { // from class: com.pinterest.api.model.zj

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f44341a;

            /* renamed from: b, reason: collision with root package name */
            public final List f44342b;

            {
                fk fkVar = fk.SlideInRight;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f44341a = animation();
                this.f44342b = kotlin.collections.f0.j(sw0.TranslationX, sw0.Alpha);
            }

            @Override // com.pinterest.api.model.dk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, -200.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final ValueAnimator getDefaultAnimator() {
                return this.f44341a;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final List getProperties() {
                return this.f44342b;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void glTransformations(hn transformer, pw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f44341a;
                valueAnimator.setCurrentFraction(f13);
                hn.c(transformer, ((Float) pk2.f.d(View.TRANSLATION_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue(), 0.0f, new yj(drawCallback, ((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue()), 2);
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void viewTransformations(View view, pw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f44341a;
                valueAnimator.setCurrentFraction(f13);
                view.setTranslationX(((Float) pk2.f.d(View.TRANSLATION_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        final String str5 = "SlideInUp";
        final int i17 = 4;
        SlideInUp = new dk(str5, i17) { // from class: com.pinterest.api.model.bk

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f36118a;

            /* renamed from: b, reason: collision with root package name */
            public final List f36119b;

            {
                fk fkVar = fk.SlideInUp;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f36118a = animation();
                this.f36119b = kotlin.collections.f0.j(sw0.Alpha, sw0.TranslationY);
            }

            @Override // com.pinterest.api.model.dk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 200.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final ValueAnimator getDefaultAnimator() {
                return this.f36118a;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final List getProperties() {
                return this.f36119b;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void glTransformations(hn transformer, pw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f36118a;
                valueAnimator.setCurrentFraction(f13);
                hn.c(transformer, 0.0f, ((Float) pk2.f.d(View.TRANSLATION_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue(), new ak(drawCallback, ((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue()), 1);
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void viewTransformations(View view, pw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f36118a;
                valueAnimator.setCurrentFraction(f13);
                view.setTranslationY(((Float) pk2.f.d(View.TRANSLATION_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        final String str6 = "SlideInDown";
        final int i18 = 5;
        SlideInDown = new dk(str6, i18) { // from class: com.pinterest.api.model.vj

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f42884a;

            /* renamed from: b, reason: collision with root package name */
            public final List f42885b;

            {
                fk fkVar = fk.SlideInDown;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f42884a = animation();
                this.f42885b = kotlin.collections.f0.j(sw0.Alpha, sw0.TranslationY);
            }

            @Override // com.pinterest.api.model.dk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, -200.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final ValueAnimator getDefaultAnimator() {
                return this.f42884a;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final List getProperties() {
                return this.f42885b;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void glTransformations(hn transformer, pw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f42884a;
                valueAnimator.setCurrentFraction(f13);
                hn.c(transformer, 0.0f, ((Float) pk2.f.d(View.TRANSLATION_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue(), new uj(drawCallback, ((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue()), 1);
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void viewTransformations(View view, pw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f42884a;
                valueAnimator.setCurrentFraction(f13);
                view.setTranslationY(((Float) pk2.f.d(View.TRANSLATION_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        final String str7 = "ScaleInUp";
        final int i19 = 6;
        ScaleInUp = new dk(str7, i19) { // from class: com.pinterest.api.model.tj

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f42225a;

            /* renamed from: b, reason: collision with root package name */
            public final List f42226b;

            {
                fk fkVar = fk.ScaleInUp;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f42225a = animation();
                this.f42226b = kotlin.collections.f0.j(sw0.ScaleX, sw0.ScaleY, sw0.Alpha);
            }

            @Override // com.pinterest.api.model.dk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final ValueAnimator getDefaultAnimator() {
                return this.f42225a;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final List getProperties() {
                return this.f42226b;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void glTransformations(hn transformer, pw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f42225a;
                valueAnimator.setCurrentFraction(f13);
                float floatValue = ((Float) pk2.f.d(View.SCALE_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                float floatValue2 = ((Float) pk2.f.d(View.SCALE_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                drawCallback.invoke(transformer.a(floatValue, floatValue2), (Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float"));
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void viewTransformations(View view, pw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f42225a;
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
        final String str8 = "ScaleInDown";
        final int i23 = 7;
        ScaleInDown = new dk(str8, i23) { // from class: com.pinterest.api.model.sj

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f41925a;

            /* renamed from: b, reason: collision with root package name */
            public final List f41926b;

            {
                fk fkVar = fk.ScaleInDown;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f41925a = animation();
                this.f41926b = kotlin.collections.f0.j(sw0.ScaleX, sw0.ScaleY, sw0.Alpha);
            }

            @Override // com.pinterest.api.model.dk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 2.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 2.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final ValueAnimator getDefaultAnimator() {
                return this.f41925a;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final List getProperties() {
                return this.f41926b;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void glTransformations(hn transformer, pw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f41925a;
                valueAnimator.setCurrentFraction(f13);
                float floatValue = ((Float) pk2.f.d(View.SCALE_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                float floatValue2 = ((Float) pk2.f.d(View.SCALE_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                drawCallback.invoke(transformer.a(floatValue, floatValue2), (Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float"));
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void viewTransformations(View view, pw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f41925a;
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
        final String str9 = "Spread";
        final int i24 = 8;
        Spread = new dk(str9, i24) { // from class: com.pinterest.api.model.ck

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f36442a;

            /* renamed from: b, reason: collision with root package name */
            public final List f36443b;

            {
                fk fkVar = fk.Spread;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f36442a = animation();
                this.f36443b = kotlin.collections.f0.j(sw0.ScaleX, sw0.Alpha);
            }

            @Override // com.pinterest.api.model.dk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final ValueAnimator getDefaultAnimator() {
                return this.f36442a;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final List getProperties() {
                return this.f36443b;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void glTransformations(hn transformer, pw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f36442a;
                valueAnimator.setCurrentFraction(f13);
                float floatValue = ((Float) pk2.f.d(View.SCALE_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                drawCallback.invoke(hn.b(transformer, floatValue, 0.0f, 2), (Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float"));
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void viewTransformations(View view, pw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f36442a;
                valueAnimator.setCurrentFraction(f13);
                if (pointF != null) {
                    view.setPivotX(pointF.x);
                    view.setPivotY(pointF.y);
                }
                view.setScaleX(((Float) pk2.f.d(View.SCALE_X, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        final String str10 = "Expand";
        final int i25 = 9;
        Expand = new dk(str10, i25) { // from class: com.pinterest.api.model.pj

            /* renamed from: a, reason: collision with root package name */
            public final ValueAnimator f41009a;

            /* renamed from: b, reason: collision with root package name */
            public final List f41010b;

            {
                fk fkVar = fk.Expand;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f41009a = animation();
                this.f41010b = kotlin.collections.f0.j(sw0.ScaleY, sw0.Alpha);
            }

            @Override // com.pinterest.api.model.dk
            public final ValueAnimator animation() {
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f));
                ofPropertyValuesHolder.setDuration(250L);
                ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
                return ofPropertyValuesHolder;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final ValueAnimator getDefaultAnimator() {
                return this.f41009a;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final List getProperties() {
                return this.f41010b;
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void glTransformations(hn transformer, pw0 progress, Function2 drawCallback) {
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f41009a;
                valueAnimator.setCurrentFraction(f13);
                float floatValue = ((Float) pk2.f.d(View.SCALE_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                drawCallback.invoke(hn.b(transformer, 0.0f, floatValue, 1), (Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float"));
            }

            @Override // com.pinterest.api.model.dk, com.pinterest.api.model.ek
            public final void viewTransformations(View view, pw0 progress, PointF pointF) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(progress, "progress");
                view.setVisibility(0);
                float f13 = progress.f41127a;
                ValueAnimator valueAnimator = this.f41009a;
                valueAnimator.setCurrentFraction(f13);
                if (pointF != null) {
                    view.setPivotX(pointF.x);
                    view.setPivotY(pointF.y);
                }
                view.setScaleY(((Float) pk2.f.d(View.SCALE_Y, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                view.setAlpha(((Float) pk2.f.d(View.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        };
        dk[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    public /* synthetic */ dk(String str, int i13, fk fkVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, fkVar);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static dk valueOf(String str) {
        return (dk) Enum.valueOf(dk.class, str);
    }

    public static dk[] values() {
        return (dk[]) $VALUES.clone();
    }

    @NotNull
    public abstract /* synthetic */ ValueAnimator animation();

    @NotNull
    public abstract /* synthetic */ ValueAnimator getDefaultAnimator();

    @NotNull
    public abstract /* synthetic */ List getProperties();

    @NotNull
    public fk getType() {
        return this.type;
    }

    public abstract /* synthetic */ void glTransformations(@NotNull hn hnVar, @NotNull pw0 pw0Var, @NotNull Function2 function2);

    public abstract /* synthetic */ void viewTransformations(@NotNull View view, @NotNull pw0 pw0Var, PointF pointF);

    private dk(String str, int i13, fk fkVar) {
        this.type = fkVar;
    }
}
