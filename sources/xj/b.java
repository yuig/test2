package xj;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;

/* loaded from: classes3.dex */
public final class b extends va.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f135072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f135073c;

    public b(View view, int i13) {
        this.f135072b = i13;
        this.f135073c = view;
    }

    @Override // va.c
    public final void a(Drawable drawable) {
        int i13 = this.f135072b;
        View view = this.f135073c;
        switch (i13) {
            case 0:
                com.google.android.material.progressindicator.a aVar = (com.google.android.material.progressindicator.a) view;
                aVar.setIndeterminate(false);
                aVar.f(aVar.f32929b, aVar.f32930c);
                break;
            case 1:
                com.google.android.material.progressindicator.a aVar2 = (com.google.android.material.progressindicator.a) view;
                if (!aVar2.f32934g) {
                    aVar2.setVisibility(aVar2.f32935h);
                    break;
                }
                break;
            default:
                ColorStateList colorStateList = ((MaterialCheckBox) view).f32428n;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                    break;
                }
                break;
        }
    }

    @Override // va.c
    public final void b(Drawable drawable) {
        switch (this.f135072b) {
            case 2:
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) this.f135073c;
                ColorStateList colorStateList = materialCheckBox.f32428n;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(materialCheckBox.f32432r, colorStateList.getDefaultColor()));
                    break;
                }
                break;
        }
    }
}
