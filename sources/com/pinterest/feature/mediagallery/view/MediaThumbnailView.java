package com.pinterest.feature.mediagallery.view;

import ac2.d;
import ac2.e1;
import ac2.q1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bs1.c;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.pu;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import d5.a;
import java.io.File;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.p0;
import m60.r0;
import m60.w0;
import m60.x0;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import pw0.r;
import pw0.s;
import pw0.u;
import pw0.y;
import pw0.z;
import qw0.j;
import rw0.e;
import rw0.f;
import sw0.b;
import sw0.o0;
import sw0.q0;
import xk2.m;
import xk2.v;
import xo0.i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\fB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/mediagallery/view/MediaThumbnailView;", "Landroid/widget/FrameLayout;", "Lpw0/s;", "Lpw0/z;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vt1/a", "mediaGalleryLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"RtlHardcoded"})
/* loaded from: classes5.dex */
public final class MediaThumbnailView extends FrameLayout implements s, z {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f46740s = 0;

    /* renamed from: a, reason: collision with root package name */
    public y f46741a;

    /* renamed from: b, reason: collision with root package name */
    public r f46742b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46743c;

    /* renamed from: d, reason: collision with root package name */
    public int f46744d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46745e;

    /* renamed from: f, reason: collision with root package name */
    public final Path f46746f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f46747g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f46748h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f46749i;

    /* renamed from: j, reason: collision with root package name */
    public final float f46750j;

    /* renamed from: k, reason: collision with root package name */
    public final v f46751k;

    /* renamed from: l, reason: collision with root package name */
    public k01 f46752l;

    /* renamed from: m, reason: collision with root package name */
    public final v f46753m;

    /* renamed from: n, reason: collision with root package name */
    public final v f46754n;

    /* renamed from: o, reason: collision with root package name */
    public final v f46755o;

    /* renamed from: p, reason: collision with root package name */
    public final v f46756p;

    /* renamed from: q, reason: collision with root package name */
    public final v f46757q;

    /* renamed from: r, reason: collision with root package name */
    public final v f46758r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaThumbnailView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // pw0.z
    public final void B(y listener, pu mediaItem) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        this.f46741a = listener;
        b(listener, mediaItem);
        setOnClickListener(new o0(this, mediaItem, 0));
    }

    @Override // pw0.z
    public final void R(long j13, String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        int i13 = (int) (j13 / 1000);
        setContentDescription(getResources().getQuantityString(w0.accessibility_video_cell_content_description_with_duration, i13, Integer.valueOf(i13), path));
    }

    @Override // pw0.s
    public final void W1(r listener, pu mediaItem) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        this.f46742b = listener;
        b(listener, mediaItem);
        setOnClickListener(new o0(this, mediaItem, 1));
    }

    public final void a(String str) {
        WebImageView webImageView = (WebImageView) this.f46753m.getValue();
        webImageView.w1();
        HashMap hashMap = f.f110112b;
        f fVar = e.f110110a;
        int[] intArray = webImageView.getResources().getIntArray(p0.default_primary_colors);
        fVar.getClass();
        webImageView.setBackgroundColor(intArray[Math.abs(str.hashCode() % intArray.length)]);
        Drawable background = webImageView.getBackground();
        if (background == null) {
            return;
        }
        background.setAlpha(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
    }

    public final void b(u uVar, pu puVar) {
        int indexOf = ((j) uVar).f105294p.indexOf(puVar);
        setSelected(indexOf != -1);
        if (this.f46743c) {
            String valueOf = indexOf == -1 ? null : String.valueOf(indexOf + this.f46744d);
            v vVar = this.f46756p;
            v vVar2 = this.f46758r;
            if (valueOf == null) {
                ((GestaltText) vVar2.getValue()).i(b.f115414t);
                c.X0((LinearLayout) vVar.getValue());
            } else {
                ((GestaltText) vVar2.getValue()).i(b.f115413s);
                c.U1((LinearLayout) vVar.getValue());
                a0.p((GestaltText) vVar2.getValue(), valueOf);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.clipPath(this.f46746f);
        super.dispatchDraw(canvas);
        if (isSelected()) {
            canvas.drawPath(this.f46747g, this.f46749i);
        }
    }

    @Override // pw0.q
    public final void e1(boolean z13) {
        this.f46743c = z13;
        this.f46744d = 1;
    }

    @Override // pw0.z
    public final void g5(k01 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f46752l = item;
        String path = item.e();
        long j13 = item.f39242e;
        Intrinsics.checkNotNullParameter(path, "path");
        a(path);
        GestaltText gestaltText = (GestaltText) this.f46754n.getValue();
        String b13 = d.b(j13, q1.VIDEO_HOME_FEED, e1.ROUND);
        Intrinsics.checkNotNullExpressionValue(b13, "formatTimeInMs(...)");
        a0.p(gestaltText, b13);
        c.U1((LinearLayout) this.f46755o.getValue());
        WebImageView webImageView = (WebImageView) this.f46753m.getValue();
        File file = new File(path);
        int i13 = this.f46745e;
        webImageView.P0(file, i13, i13);
    }

    @Override // pw0.z
    public final void j5(boolean z13) {
        c.R1((LinearLayout) this.f46757q.getValue(), !z13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i13);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        RectF rectF = this.f46748h;
        float f13 = i13;
        float f14 = i14;
        rectF.set(0.0f, 0.0f, f13, f14);
        Path path = this.f46746f;
        path.reset();
        Path.Direction direction = Path.Direction.CW;
        path.addRect(rectF, direction);
        path.close();
        Path path2 = this.f46747g;
        path2.reset();
        path2.addRect(rectF, direction);
        float f15 = this.f46750j;
        path2.addRect(new RectF(f15, f15, f13 - f15, f14 - f15), direction);
        path2.setFillType(Path.FillType.EVEN_ODD);
        path2.close();
    }

    @Override // pw0.s
    public final void q5(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        setContentDescription(getResources().getString(x0.accessibility_photo_cell_content_description, path));
    }

    @Override // pw0.s
    public final void t4(d30 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String path = item.e();
        Intrinsics.checkNotNullParameter(path, "path");
        a(path);
        c.X0((LinearLayout) this.f46755o.getValue());
        WebImageView webImageView = (WebImageView) this.f46753m.getValue();
        File file = new File(path);
        int i13 = this.f46745e;
        webImageView.P0(file, i13, i13);
    }

    public /* synthetic */ MediaThumbnailView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaThumbnailView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46744d = 1;
        this.f46745e = (int) (hf0.b.f69002b / 4);
        this.f46746f = new Path();
        this.f46747g = new Path();
        this.f46748h = new RectF();
        Paint paint = new Paint();
        int i14 = eo1.b.color_themed_base_red_300;
        Object obj = a.f53679a;
        paint.setColor(context.getColor(i14));
        this.f46749i = paint;
        this.f46750j = getResources().getDimensionPixelSize(r0.margin_extra_small);
        this.f46751k = m.b(new sw0.p0(context, this, 2));
        int i15 = 0;
        v b13 = m.b(new sw0.p0(context, this, i15));
        this.f46753m = b13;
        this.f46754n = m.b(new q0(context, 1));
        v b14 = m.b(new sw0.p0(context, this, 3));
        this.f46755o = b14;
        v b15 = m.b(new q0(context, i15));
        this.f46756p = b15;
        v b16 = m.b(new i(context, 29));
        this.f46757q = b16;
        v b17 = m.b(new sw0.p0(this, context));
        this.f46758r = b17;
        WebImageView webImageView = (WebImageView) b13.getValue();
        Intrinsics.g(webImageView, "null cannot be cast to non-null type android.view.View");
        addView(webImageView);
        addView((LinearLayout) b14.getValue());
        addView((LinearLayout) b15.getValue());
        addView((GestaltText) b17.getValue());
        addView((LinearLayout) b16.getValue());
    }
}
