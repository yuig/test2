package ck;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import o6.d;

/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f27895e;

    /* renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior f27896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i13) {
        super(1);
        this.f27895e = i13;
        this.f27896f = sideSheetBehavior;
    }

    public final boolean A(float f13) {
        switch (this.f27895e) {
            case 0:
                if (f13 > 0.0f) {
                    break;
                }
                break;
            default:
                if (f13 < 0.0f) {
                    break;
                }
                break;
        }
        return true;
    }

    public final boolean B(View view) {
        switch (this.f27895e) {
            case 0:
                if (view.getRight() < (y() - z()) / 2) {
                    break;
                }
                break;
            default:
                if (view.getLeft() > (y() + z()) / 2) {
                    break;
                }
                break;
        }
        return true;
    }

    public final boolean C(float f13, float f14) {
        int i13 = this.f27895e;
        SideSheetBehavior sideSheetBehavior = this.f27896f;
        switch (i13) {
            case 0:
                if (Math.abs(f13) > Math.abs(f14)) {
                    float abs = Math.abs(f13);
                    sideSheetBehavior.getClass();
                    if (abs > 500) {
                        break;
                    }
                }
                break;
            default:
                if (Math.abs(f13) > Math.abs(f14)) {
                    float abs2 = Math.abs(f13);
                    sideSheetBehavior.getClass();
                    if (abs2 > 500) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public final boolean D(View view, float f13) {
        int i13 = this.f27895e;
        SideSheetBehavior sideSheetBehavior = this.f27896f;
        switch (i13) {
            case 0:
                if (Math.abs((f13 * sideSheetBehavior.f33029k) + view.getLeft()) > 0.5f) {
                    break;
                }
                break;
            default:
                if (Math.abs((f13 * sideSheetBehavior.f33029k) + view.getRight()) > 0.5f) {
                    break;
                }
                break;
        }
        return true;
    }

    public final float x(int i13) {
        switch (this.f27895e) {
            case 0:
                float z13 = z();
                return (i13 - z13) / (y() - z13);
            default:
                float z14 = z();
                return (z14 - i13) / (z14 - y());
        }
    }

    public final int y() {
        int i13 = this.f27895e;
        SideSheetBehavior sideSheetBehavior = this.f27896f;
        switch (i13) {
            case 0:
                return Math.max(0, sideSheetBehavior.f33032n + sideSheetBehavior.f33033o);
            default:
                return Math.max(0, (z() - sideSheetBehavior.f33030l) - sideSheetBehavior.f33033o);
        }
    }

    public final int z() {
        int i13 = this.f27895e;
        SideSheetBehavior sideSheetBehavior = this.f27896f;
        switch (i13) {
            case 0:
                return (-sideSheetBehavior.f33030l) - sideSheetBehavior.f33033o;
            default:
                return sideSheetBehavior.f33031m;
        }
    }
}
