package com.pinterest.api.model;

import android.graphics.Matrix;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fr {

    /* renamed from: a, reason: collision with root package name */
    public final List f37755a;

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f37756b;

    /* renamed from: c, reason: collision with root package name */
    public final float f37757c;

    /* renamed from: d, reason: collision with root package name */
    public final float f37758d;

    /* renamed from: e, reason: collision with root package name */
    public final long f37759e;

    /* renamed from: f, reason: collision with root package name */
    public final long f37760f;

    /* renamed from: g, reason: collision with root package name */
    public final ek f37761g;

    /* renamed from: h, reason: collision with root package name */
    public final vk f37762h;

    public fr(@NotNull List<dw0.a> bitmaps, @NotNull Matrix matrix, float f13, float f14, long j13, long j14, @NotNull ek enterTransition, @NotNull vk exitTransition) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(enterTransition, "enterTransition");
        Intrinsics.checkNotNullParameter(exitTransition, "exitTransition");
        this.f37755a = bitmaps;
        this.f37756b = matrix;
        this.f37757c = f13;
        this.f37758d = f14;
        this.f37759e = j13;
        this.f37760f = j14;
        this.f37761g = enterTransition;
        this.f37762h = exitTransition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr)) {
            return false;
        }
        fr frVar = (fr) obj;
        return Intrinsics.d(this.f37755a, frVar.f37755a) && Intrinsics.d(this.f37756b, frVar.f37756b) && Float.compare(this.f37757c, frVar.f37757c) == 0 && Float.compare(this.f37758d, frVar.f37758d) == 0 && this.f37759e == frVar.f37759e && this.f37760f == frVar.f37760f && Intrinsics.d(this.f37761g, frVar.f37761g) && Intrinsics.d(this.f37762h, frVar.f37762h);
    }

    public final int hashCode() {
        return this.f37762h.hashCode() + ((this.f37761g.hashCode() + a.a.c(this.f37760f, a.a.c(this.f37759e, a.a.a(this.f37758d, a.a.a(this.f37757c, (this.f37756b.hashCode() + (this.f37755a.hashCode() * 31)) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "IdeaPinVideoExportBitmapConfig(bitmaps=" + this.f37755a + ", matrix=" + this.f37756b + ", coordSystemWidth=" + this.f37757c + ", coordSystemHeight=" + this.f37758d + ", startTimeUs=" + this.f37759e + ", endTimeUs=" + this.f37760f + ", enterTransition=" + this.f37761g + ", exitTransition=" + this.f37762h + ")";
    }

    public /* synthetic */ fr(List list, Matrix matrix, float f13, float f14, long j13, long j14, ek ekVar, vk vkVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, matrix, (i13 & 4) != 0 ? 1.0f : f13, (i13 & 8) != 0 ? 1.0f : f14, (i13 & 16) != 0 ? 0L : j13, (i13 & 32) != 0 ? 0L : j14, (i13 & 64) != 0 ? dk.Instant : ekVar, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? uk.Instant : vkVar);
    }
}
