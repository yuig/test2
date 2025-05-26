package com.pinterest.ui.components.sections;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.ui.components.sections.LegoSectionRepPinPreview;
import d70.a;
import d70.h;
import dc0.q;
import fk2.f;
import fn1.k;
import ha2.i;
import hs1.m;
import hs1.t;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import la2.d;
import la2.e;
import m60.r0;
import na2.c;
import org.jetbrains.annotations.NotNull;
import uj2.s;
import xj2.b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/ui/components/sections/LegoSectionRepPinPreview;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "na2/c", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LegoSectionRepPinPreview extends View {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f52329l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f52330a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f52331b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f52332c;

    /* renamed from: d, reason: collision with root package name */
    public final int f52333d;

    /* renamed from: e, reason: collision with root package name */
    public final int f52334e;

    /* renamed from: f, reason: collision with root package name */
    public float f52335f;

    /* renamed from: g, reason: collision with root package name */
    public float f52336g;

    /* renamed from: h, reason: collision with root package name */
    public q f52337h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f52338i;

    /* renamed from: j, reason: collision with root package name */
    public final hs1.q f52339j;

    /* renamed from: k, reason: collision with root package name */
    public final b f52340k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoSectionRepPinPreview(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        d dVar = d.f82554a;
        this.f52330a = f0.l(dVar, dVar, dVar);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.f52331b = paint;
        Paint paint2 = new Paint();
        Context context2 = getContext();
        int i13 = a.color_empty_state_gray;
        Object obj = d5.a.f53679a;
        paint2.setColor(context2.getColor(i13));
        this.f52332c = paint2;
        this.f52333d = getResources().getDimensionPixelSize(r0.lego_section_rep_pin_preview_corner_radius);
        this.f52334e = getResources().getDimensionPixelOffset(r0.lego_section_rep_pin_preview_spacer);
        this.f52337h = q.Default;
        this.f52338i = new Path();
        this.f52339j = t.a();
        this.f52340k = new b();
        b(context, attrs, 0);
    }

    public static c e(int i13) {
        c cVar = c.Left;
        if (i13 != cVar.getIndex()) {
            cVar = c.Center;
            if (i13 != cVar.getIndex()) {
                cVar = c.Right;
                if (i13 != cVar.getIndex()) {
                    throw new IndexOutOfBoundsException(a.a.e("Int ", i13, " does not correspond to a known image location"));
                }
            }
        }
        return cVar;
    }

    public final void a(Canvas canvas, e eVar, float f13) {
        if (eVar instanceof la2.b) {
            canvas.drawBitmap(((la2.b) eVar).f82550b, f13, 0.0f, this.f52331b);
        } else {
            canvas.drawRect(f13, 0.0f, f13 + this.f52336g, this.f52335f, this.f52332c);
        }
    }

    public final void b(Context context, AttributeSet attributeSet, int i13) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h.LegoRepSize, i13, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(h.LegoRepSize_repSize, -1);
            if (integer >= 0 && integer < q.values().length) {
                this.f52337h = q.values()[integer];
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void c(final String str, c cVar, final int i13, final int i14) {
        this.f52330a.set(cVar.getIndex(), new la2.c(str, i13, i14));
        this.f52340k.a(new ol1.d(new s() { // from class: na2.b
            @Override // uj2.s
            public final void o(f it) {
                int i15 = i13;
                int i16 = i14;
                int i17 = LegoSectionRepPinPreview.f52329l;
                LegoSectionRepPinPreview this$0 = LegoSectionRepPinPreview.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String imgUrl = str;
                Intrinsics.checkNotNullParameter(imgUrl, "$imgUrl");
                Intrinsics.checkNotNullParameter(it, "it");
                try {
                    Bitmap l13 = ((m) this$0.f52339j).l(Integer.valueOf(i15), Integer.valueOf(i16), imgUrl);
                    if (l13 != null) {
                        it.c(l13);
                    } else {
                        it.a(new Exception("Bitmap with url " + imgUrl + " failed to load"));
                    }
                } finally {
                    it.b();
                }
            }
        }, 2).H(tk2.e.f118017c).A(wj2.c.a()).F(new e82.b(15, new k(this, str, cVar, 17)), new e82.b(16, new i(4, this, cVar)), ck2.i.f27923c, ck2.i.f27924d));
    }

    public final void d(String str, c cVar) {
        String str2;
        d dVar = d.f82554a;
        ArrayList arrayList = this.f52330a;
        if (str == null) {
            if (((e) arrayList.get(cVar.getIndex())) instanceof la2.b) {
                invalidate();
            }
            arrayList.set(cVar.getIndex(), dVar);
            return;
        }
        e eVar = (e) arrayList.get(cVar.getIndex());
        if (eVar instanceof la2.a) {
            str2 = ((la2.a) eVar).f82548a;
        } else if (eVar instanceof la2.c) {
            str2 = ((la2.c) eVar).f82551a;
        } else if (eVar instanceof la2.b) {
            str2 = ((la2.b) eVar).f82549a;
        } else {
            if (!Intrinsics.d(eVar, dVar)) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = null;
        }
        if (Intrinsics.d(str2, str)) {
            return;
        }
        if (str2 != null) {
            invalidate();
        }
        float f13 = this.f52336g;
        if (f13 > 0.0f) {
            float f14 = this.f52335f;
            if (f14 > 0.0f) {
                c(str, cVar, (int) f13, (int) f14);
                return;
            }
        }
        arrayList.set(cVar.getIndex(), new la2.a(str));
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        char c13;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.clipPath(this.f52338i);
        super.draw(canvas);
        q qVar = this.f52337h;
        q qVar2 = q.List;
        ArrayList arrayList = this.f52330a;
        if (qVar == qVar2) {
            e eVar = (e) arrayList.get(c.Left.getIndex());
            if (eVar instanceof la2.b) {
                canvas.drawBitmap(((la2.b) eVar).f82550b, 0.0f, 0.0f, this.f52331b);
                return;
            }
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            float f13 = this.f52333d;
            canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, f13, f13, this.f52332c);
            return;
        }
        int i13 = na2.d.f90103a[qVar.ordinal()];
        if (i13 == 1) {
            c13 = 3;
        } else if (i13 == 2) {
            c13 = 2;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c13 = 1;
        }
        e eVar2 = (e) arrayList.get(c.Left.getIndex());
        e eVar3 = (e) arrayList.get(c.Center.getIndex());
        e eVar4 = (e) arrayList.get(c.Right.getIndex());
        if (c13 == 1) {
            a(canvas, eVar2, 0.0f);
            return;
        }
        int i14 = this.f52334e;
        if (c13 == 2) {
            float f14 = this.f52336g + i14;
            a(canvas, eVar2, 0.0f);
            a(canvas, eVar3, f14);
        } else {
            if (c13 != 3) {
                return;
            }
            float f15 = this.f52336g;
            a(canvas, eVar2, 0.0f);
            a(canvas, eVar3, i14 + f15);
            a(canvas, eVar4, (2 * f15) + (i14 * 2));
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int i15 = na2.d.f90103a[this.f52337h.ordinal()];
        int i16 = this.f52334e;
        if (i15 == 1) {
            setMeasuredDimension(getMeasuredWidth(), getResources().getDimensionPixelSize(r0.lego_section_rep_pin_preview_default_size));
            this.f52335f = getMeasuredHeight();
            this.f52336g = (getMeasuredWidth() - (i16 * 2)) / 3.0f;
        } else if (i15 == 2) {
            setMeasuredDimension(getMeasuredWidth(), (int) (getMeasuredWidth() * 0.6666667f));
            this.f52335f = getMeasuredHeight();
            this.f52336g = (getMeasuredWidth() - i16) / 2.0f;
        } else if (i15 == 3) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(r0.lego_section_rep_pin_preview_list_size);
            setMeasuredDimension(dimensionPixelSize, dimensionPixelSize);
            this.f52335f = getMeasuredHeight();
            this.f52336g = getMeasuredWidth();
        }
        int i17 = 0;
        for (Object obj : this.f52330a) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                f0.p();
                throw null;
            }
            e eVar = (e) obj;
            if (eVar instanceof la2.a) {
                c(((la2.a) eVar).f82548a, e(i17), (int) this.f52336g, (int) this.f52335f);
            } else if (eVar instanceof la2.c) {
                la2.c cVar = (la2.c) eVar;
                if (cVar.f82552b == ((int) this.f52336g)) {
                    if (cVar.f82553c == ((int) this.f52335f)) {
                    }
                }
                c(cVar.f82551a, e(i17), (int) this.f52336g, (int) this.f52335f);
            } else if (eVar instanceof la2.b) {
                la2.b bVar = (la2.b) eVar;
                if (bVar.f82550b.getWidth() != ((int) this.f52336g) || bVar.f82550b.getHeight() != ((int) this.f52335f)) {
                    c(bVar.f82549a, e(i17), (int) this.f52336g, (int) this.f52335f);
                }
            }
            i17 = i18;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        this.f52338i.reset();
        int i17 = this.f52333d;
        this.f52338i.addRoundRect(0.0f, 0.0f, i13, i14, i17, i17, Path.Direction.CW);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoSectionRepPinPreview(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        d dVar = d.f82554a;
        this.f52330a = f0.l(dVar, dVar, dVar);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.f52331b = paint;
        Paint paint2 = new Paint();
        Context context2 = getContext();
        int i14 = a.color_empty_state_gray;
        Object obj = d5.a.f53679a;
        paint2.setColor(context2.getColor(i14));
        this.f52332c = paint2;
        this.f52333d = getResources().getDimensionPixelSize(r0.lego_section_rep_pin_preview_corner_radius);
        this.f52334e = getResources().getDimensionPixelOffset(r0.lego_section_rep_pin_preview_spacer);
        this.f52337h = q.Default;
        this.f52338i = new Path();
        this.f52339j = t.a();
        this.f52340k = new b();
        b(context, attrs, i13);
    }
}
