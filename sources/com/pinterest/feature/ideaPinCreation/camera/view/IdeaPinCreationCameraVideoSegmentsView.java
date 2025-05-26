package com.pinterest.feature.ideaPinCreation.camera.view;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.pinterest.api.model.bo0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pp2.a;
import rt0.b;
import rt0.d;
import tt0.a1;
import tt0.q0;
import tt0.r0;
import tt0.s0;
import tt0.y0;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/camera/view/IdeaPinCreationCameraVideoSegmentsView;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinCreationCameraVideoSegmentsView extends AppCompatSeekBar {

    /* renamed from: g, reason: collision with root package name */
    public static final float f45925g;

    /* renamed from: h, reason: collision with root package name */
    public static final float f45926h;

    /* renamed from: i, reason: collision with root package name */
    public static final float f45927i;

    /* renamed from: j, reason: collision with root package name */
    public static final float f45928j;

    /* renamed from: k, reason: collision with root package name */
    public static final float f45929k;

    /* renamed from: b, reason: collision with root package name */
    public b f45930b;

    /* renamed from: c, reason: collision with root package name */
    public final v f45931c;

    /* renamed from: d, reason: collision with root package name */
    public final v f45932d;

    /* renamed from: e, reason: collision with root package name */
    public qt0.b f45933e;

    /* renamed from: f, reason: collision with root package name */
    public final d f45934f;

    static {
        float f13 = hf0.b.f69001a;
        f45925g = 2.0f * f13;
        f45926h = 3.0f * f13;
        float f14 = 4.0f * f13;
        f45927i = f14;
        f45928j = 16.0f * f13;
        f45929k = f14;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationCameraVideoSegmentsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final b a() {
        b bVar = this.f45930b;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("model");
        throw null;
    }

    public final void b(int i13, int i14) {
        setProgress((int) (((Number) a().f109958j.get(i13)).longValue() + i14));
    }

    public final void c(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f45930b = bVar;
    }

    public final void d(qt0.b bVar) {
        this.f45933e = bVar;
    }

    public final void e() {
        v vVar = this.f45931c;
        ((a1) vVar.getValue()).f119072c.clear();
        Iterator it = a().f109957i.iterator();
        float f13 = 0.0f;
        while (it.hasNext()) {
            float u13 = ((bo0) it.next()).f36143i / (a().f109956h > 0 ? a().f109956h : a.u());
            if (u13 + f13 > 1.0f) {
                u13 = 1.0f - f13;
            }
            f13 += u13;
            ((a1) vVar.getValue()).f119072c.add(Float.valueOf(((a1) vVar.getValue()).getBounds().width() * u13));
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMax((int) (a().f109956h > 0 ? a().f109956h : a.u()));
        setSplitTrack(false);
        setOnSeekBarChangeListener(null);
        a().a(this.f45934f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{(a1) this.f45931c.getValue(), new ColorDrawable(0)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        setProgressDrawable(layerDrawable);
        setThumb((y0) this.f45932d.getValue());
        setLayoutDirection(0);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        e();
    }

    @Override // android.widget.SeekBar
    public final void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        super.setOnSeekBarChangeListener(new r0(onSeekBarChangeListener, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationCameraVideoSegmentsView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = 1;
        this.f45931c = m.b(new s0(context, this, i14));
        int i15 = 0;
        this.f45932d = m.b(new s0(context, this, i15));
        this.f45934f = new d(new q0(this, i15), null, null, new q0(this, i14), null, null, 54);
    }
}
