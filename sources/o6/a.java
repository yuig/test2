package o6;

import android.view.View;

/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f92914e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(0);
        this.f92914e = i13;
    }

    @Override // o6.d
    public final int e(View view, int i13, int i14) {
        switch (this.f92914e) {
            case 1:
                return 0;
            case 2:
                return i13;
            case 3:
                return i13 >> 1;
            case 4:
                if (view.getVisibility() == 8) {
                    return 0;
                }
                int baseline = view.getBaseline();
                if (baseline == -1) {
                    return Integer.MIN_VALUE;
                }
                return baseline;
            default:
                return Integer.MIN_VALUE;
        }
    }

    @Override // o6.d
    public final h f() {
        switch (this.f92914e) {
            case 4:
                return new c();
            default:
                return new h();
        }
    }

    @Override // o6.d
    public final String g() {
        switch (this.f92914e) {
            case 0:
                return "UNDEFINED";
            case 1:
                return "LEADING";
            case 2:
                return "TRAILING";
            case 3:
                return "CENTER";
            case 4:
                return "BASELINE";
            default:
                return "FILL";
        }
    }

    @Override // o6.d
    public final int i(View view, int i13) {
        switch (this.f92914e) {
            case 0:
                return Integer.MIN_VALUE;
            case 1:
            default:
                return 0;
            case 2:
                return i13;
            case 3:
                return i13 >> 1;
        }
    }

    @Override // o6.d
    public final int j(int i13, int i14) {
        switch (this.f92914e) {
            case 5:
                return i14;
            default:
                return i13;
        }
    }
}
