package ek;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public final class a extends com.google.android.gms.common.api.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f59118c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(9);
        this.f59118c = i13;
    }

    @Override // com.google.android.gms.common.api.d
    public final void e(TabLayout tabLayout, View view, View view2, float f13, Drawable drawable) {
        float cos;
        float f14;
        switch (this.f59118c) {
            case 0:
                RectF c13 = com.google.android.gms.common.api.d.c(view, tabLayout);
                RectF c14 = com.google.android.gms.common.api.d.c(view2, tabLayout);
                if (c13.left < c14.left) {
                    double d2 = (f13 * 3.141592653589793d) / 2.0d;
                    f14 = (float) (1.0d - Math.cos(d2));
                    cos = (float) Math.sin(d2);
                } else {
                    double d13 = (f13 * 3.141592653589793d) / 2.0d;
                    float sin = (float) Math.sin(d13);
                    cos = (float) (1.0d - Math.cos(d13));
                    f14 = sin;
                }
                drawable.setBounds(gj.a.c((int) c13.left, f14, (int) c14.left), drawable.getBounds().top, gj.a.c((int) c13.right, cos, (int) c14.right), drawable.getBounds().bottom);
                break;
            default:
                if (f13 >= 0.5f) {
                    view = view2;
                }
                RectF c15 = com.google.android.gms.common.api.d.c(view, tabLayout);
                float b13 = f13 < 0.5f ? gj.a.b(1.0f, 0.0f, 0.0f, 0.5f, f13) : gj.a.b(0.0f, 1.0f, 0.5f, 1.0f, f13);
                drawable.setBounds((int) c15.left, drawable.getBounds().top, (int) c15.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b13 * 255.0f));
                break;
        }
    }
}
