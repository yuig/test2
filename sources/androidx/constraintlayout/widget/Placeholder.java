package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public class Placeholder extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f17708a;

    /* renamed from: b, reason: collision with root package name */
    public View f17709b;

    /* renamed from: c, reason: collision with root package name */
    public int f17710c;

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17708a = -1;
        this.f17709b = null;
        this.f17710c = 4;
        b(attributeSet);
    }

    public final View a() {
        return this.f17709b;
    }

    public final void b(AttributeSet attributeSet) {
        super.setVisibility(this.f17710c);
        this.f17708a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.ConstraintLayout_placeholder_content) {
                    this.f17708a = obtainStyledAttributes.getResourceId(index, this.f17708a);
                } else if (index == s.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f17710c = obtainStyledAttributes.getInt(index, this.f17710c);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void c() {
        if (this.f17709b == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f17709b.getLayoutParams();
        u4.h hVar = layoutParams2.f17688q0;
        hVar.f120213i0 = 0;
        u4.h hVar2 = layoutParams.f17688q0;
        u4.g gVar = hVar2.U[0];
        u4.g gVar2 = u4.g.FIXED;
        if (gVar != gVar2) {
            hVar2.b0(hVar.y());
        }
        u4.h hVar3 = layoutParams.f17688q0;
        if (hVar3.U[1] != gVar2) {
            hVar3.W(layoutParams2.f17688q0.o());
        }
        layoutParams2.f17688q0.f120213i0 = 8;
    }

    public final void d(ConstraintLayout constraintLayout) {
        if (this.f17708a == -1 && !isInEditMode()) {
            setVisibility(this.f17710c);
        }
        View findViewById = constraintLayout.findViewById(this.f17708a);
        this.f17709b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).f17666f0 = true;
            this.f17709b.setVisibility(0);
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE, RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE, RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE);
            Paint paint = new Paint();
            paint.setARGB(255, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_RELATED_ARTICLES_HEADER, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_RELATED_ARTICLES_HEADER, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_RELATED_ARTICLES_HEADER);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17708a = -1;
        this.f17709b = null;
        this.f17710c = 4;
        b(attributeSet);
    }
}
