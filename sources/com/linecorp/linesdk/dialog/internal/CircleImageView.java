package com.linecorp.linesdk.dialog.internal;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import g5.a;

/* loaded from: classes3.dex */
public class CircleImageView extends AppCompatImageView {
    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setImageDrawable(null);
            return;
        }
        a aVar = new a(getContext().getResources(), ((BitmapDrawable) drawable).getBitmap());
        aVar.f63547k = true;
        aVar.f63546j = true;
        aVar.f63543g = Math.min(aVar.f63549m, aVar.f63548l) / 2;
        Paint paint = aVar.f63540d;
        BitmapShader bitmapShader = aVar.f63541e;
        paint.setShader(bitmapShader);
        aVar.invalidateSelf();
        float max = Math.max(r8.getWidth(), r8.getHeight()) / 2.0f;
        if (aVar.f63543g != max) {
            aVar.f63547k = false;
            if (max > 0.05f) {
                paint.setShader(bitmapShader);
            } else {
                paint.setShader(null);
            }
            aVar.f63543g = max;
            aVar.invalidateSelf();
        }
        super.setImageDrawable(aVar);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
