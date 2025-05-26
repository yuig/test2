package nj;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import fj.k;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class d extends y5.b {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Chip f90938o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f90938o = chip;
    }

    @Override // y5.b
    public final void m(ArrayList arrayList) {
        arrayList.add(0);
        int i13 = Chip.f32439u;
        this.f90938o.b();
    }

    @Override // y5.b
    public final boolean p(int i13, int i14, Bundle bundle) {
        if (i14 == 16) {
            Chip chip = this.f90938o;
            if (i13 == 0) {
                return chip.performClick();
            }
            if (i13 == 1) {
                chip.playSoundEffect(0);
            }
        }
        return false;
    }

    @Override // y5.b
    public final void q(r5.e eVar) {
        Chip chip = this.f90938o;
        eVar.f106231a.setCheckable(chip.c());
        eVar.s(chip.isClickable());
        eVar.r(chip.getAccessibilityClassName());
        eVar.F(chip.getText());
    }

    @Override // y5.b
    public final void r(int i13, r5.e eVar) {
        if (i13 != 1) {
            eVar.v("");
            eVar.o(Chip.f32440v);
            return;
        }
        Chip chip = this.f90938o;
        f fVar = chip.f32443e;
        CharSequence text = chip.getText();
        Context context = chip.getContext();
        int i14 = k.mtrl_chip_close_icon_content_description;
        Object[] objArr = new Object[1];
        objArr[0] = TextUtils.isEmpty(text) ? "" : text;
        eVar.v(context.getString(i14, objArr).trim());
        RectF rectF = chip.f32457s;
        rectF.setEmpty();
        chip.b();
        int i15 = (int) rectF.left;
        int i16 = (int) rectF.top;
        int i17 = (int) rectF.right;
        int i18 = (int) rectF.bottom;
        Rect rect = chip.f32456r;
        rect.set(i15, i16, i17, i18);
        eVar.o(rect);
        eVar.b(r5.d.f106213g);
        eVar.f106231a.setEnabled(chip.isEnabled());
    }

    @Override // y5.b
    public final void s(int i13, boolean z13) {
        if (i13 == 1) {
            Chip chip = this.f90938o;
            chip.f32451m = z13;
            chip.refreshDrawableState();
        }
    }
}
