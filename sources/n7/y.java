package n7;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes3.dex */
public final /* synthetic */ class y implements d7.r, r5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f89590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f89591c;

    public /* synthetic */ y(Object obj, int i13, int i14) {
        this.f89589a = i14;
        this.f89590b = obj;
        this.f89591c = i13;
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        int i13 = this.f89589a;
        int i14 = this.f89591c;
        b bVar = (b) this.f89590b;
        c cVar = (c) obj;
        switch (i13) {
            case 0:
                cVar.b(bVar, i14);
                break;
            default:
                cVar.getClass();
                cVar.S(bVar, i14);
                break;
        }
    }

    @Override // r5.p
    public final boolean l(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f89590b;
        int i13 = SideSheetBehavior.f33017x;
        sideSheetBehavior.C(this.f89591c);
        return true;
    }
}
