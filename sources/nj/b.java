package nj;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.z;
import me.o;

/* loaded from: classes3.dex */
public final class b extends o {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f90934p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f90935q;

    public /* synthetic */ b(Object obj, int i13) {
        this.f90934p = i13;
        this.f90935q = obj;
    }

    @Override // me.o
    public final void d(int i13) {
        switch (this.f90934p) {
            case 0:
                break;
            default:
                a0 a0Var = (a0) this.f90935q;
                a0Var.f32703e = true;
                z zVar = (z) a0Var.f32704f.get();
                if (zVar != null) {
                    zVar.a();
                    break;
                }
                break;
        }
    }

    @Override // me.o
    public final void e(Typeface typeface, boolean z13) {
        int i13 = this.f90934p;
        Object obj = this.f90935q;
        switch (i13) {
            case 0:
                Chip chip = (Chip) obj;
                f fVar = chip.f32443e;
                chip.setText(fVar.B0 ? fVar.F : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z13) {
                    a0 a0Var = (a0) obj;
                    a0Var.f32703e = true;
                    z zVar = (z) a0Var.f32704f.get();
                    if (zVar != null) {
                        zVar.a();
                        break;
                    }
                }
                break;
        }
    }
}
