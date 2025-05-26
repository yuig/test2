package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes2.dex */
public final class k extends l1 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f16618j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f16619k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f16620l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(View view, View view2, Object obj, int i13) {
        super(view2);
        this.f16618j = i13;
        this.f16620l = view;
        this.f16619k = obj;
    }

    @Override // androidx.appcompat.widget.l1
    public final n.e0 b() {
        switch (this.f16618j) {
            case 0:
                h hVar = ((l) this.f16620l).f16624a.f16658r;
                if (hVar == null) {
                    return null;
                }
                return hVar.a();
            default:
                return (h0) this.f16619k;
        }
    }

    @Override // androidx.appcompat.widget.l1
    public final boolean c() {
        int i13 = this.f16618j;
        View view = this.f16620l;
        switch (i13) {
            case 0:
                ((l) view).f16624a.n();
                break;
            default:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) view;
                if (!appCompatSpinner.f16324f.a()) {
                    appCompatSpinner.f16324f.h(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.l1
    public final boolean d() {
        switch (this.f16618j) {
            case 0:
                n nVar = ((l) this.f16620l).f16624a;
                if (nVar.f16660t == null) {
                    nVar.k();
                    break;
                }
                break;
            default:
                n.e0 b13 = b();
                if (b13 != null && b13.a()) {
                    b13.dismiss();
                    break;
                }
                break;
        }
        return true;
    }
}
