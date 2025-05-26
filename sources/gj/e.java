package gj;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* loaded from: classes3.dex */
public final class e extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65175a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f65176b;

    public e() {
        super(Matrix.class, "imageMatrixProperty");
        this.f65176b = new Matrix();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        int i13 = this.f65175a;
        Object obj2 = this.f65176b;
        switch (i13) {
            case 0:
                Matrix matrix = (Matrix) obj2;
                matrix.set(((ImageView) obj).getImageMatrix());
                return matrix;
            default:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                return Float.valueOf(a.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.F.getColorForState(extendedFloatingActionButton.getDrawableState(), ((tj.a) obj2).f117764b.F.getDefaultColor()))));
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f65175a) {
            case 0:
                ((ImageView) obj).setImageMatrix((Matrix) obj2);
                break;
            default:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                Float f13 = (Float) obj2;
                int colorForState = extendedFloatingActionButton.F.getColorForState(extendedFloatingActionButton.getDrawableState(), ((tj.a) this.f65176b).f117764b.F.getDefaultColor());
                ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (a.a(0.0f, Color.alpha(colorForState) / 255.0f, f13.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                if (f13.floatValue() != 1.0f) {
                    extendedFloatingActionButton.u(valueOf);
                    break;
                } else {
                    extendedFloatingActionButton.u(extendedFloatingActionButton.F);
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tj.a aVar) {
        super(Float.class, "LABEL_OPACITY_PROPERTY");
        this.f65176b = aVar;
    }
}
