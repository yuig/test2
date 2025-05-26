package se0;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes.dex */
public final class q extends AppCompatImageView implements p {

    /* renamed from: a, reason: collision with root package name */
    public final o f112418a;

    public q(Context context, int i13) {
        super(context, null);
        o oVar = new o(context, i13);
        this.f112418a = oVar;
        setImageDrawable(oVar);
    }

    @Override // android.view.View
    public final void setAlpha(float f13) {
        this.f112418a.setAlpha((int) (f13 * 255.0f));
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i13) {
        this.f112418a.f112404b = i13;
    }
}
