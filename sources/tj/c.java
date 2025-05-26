package tj;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* loaded from: classes3.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f117786b;

    public /* synthetic */ c(ExtendedFloatingActionButton extendedFloatingActionButton, int i13) {
        this.f117785a = i13;
        this.f117786b = extendedFloatingActionButton;
    }

    @Override // tj.h
    public final int a() {
        int i13 = this.f117785a;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117786b;
        switch (i13) {
            case 0:
                return (extendedFloatingActionButton.t() - extendedFloatingActionButton.f32348k) / 2;
            default:
                return extendedFloatingActionButton.B;
        }
    }

    @Override // tj.h
    public final ViewGroup.LayoutParams d() {
        switch (this.f117785a) {
            case 0:
                return new ViewGroup.LayoutParams(j(), i());
            default:
                return new ViewGroup.LayoutParams(-2, -2);
        }
    }

    @Override // tj.h
    public final int e() {
        int i13 = this.f117785a;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117786b;
        switch (i13) {
            case 0:
                return (extendedFloatingActionButton.t() - extendedFloatingActionButton.f32348k) / 2;
            default:
                return extendedFloatingActionButton.A;
        }
    }

    @Override // tj.h
    public final int i() {
        int i13 = this.f117785a;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117786b;
        switch (i13) {
            case 0:
                return extendedFloatingActionButton.t();
            default:
                return extendedFloatingActionButton.getMeasuredHeight();
        }
    }

    @Override // tj.h
    public final int j() {
        int i13 = this.f117785a;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117786b;
        switch (i13) {
            case 0:
                return extendedFloatingActionButton.t();
            default:
                return (extendedFloatingActionButton.getMeasuredWidth() - (((extendedFloatingActionButton.t() - extendedFloatingActionButton.f32348k) / 2) * 2)) + extendedFloatingActionButton.A + extendedFloatingActionButton.B;
        }
    }
}
