package uj;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import bk.i;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes3.dex */
public final class a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f122317a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShapeableImageView f122318b;

    public a(ShapeableImageView shapeableImageView) {
        this.f122318b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f122318b;
        if (shapeableImageView.f32651i == null) {
            return;
        }
        if (shapeableImageView.f32650h == null) {
            shapeableImageView.f32650h = new i(shapeableImageView.f32651i);
        }
        RectF rectF = shapeableImageView.f32644b;
        Rect rect = this.f122317a;
        rectF.round(rect);
        shapeableImageView.f32650h.setBounds(rect);
        shapeableImageView.f32650h.getOutline(outline);
    }
}
