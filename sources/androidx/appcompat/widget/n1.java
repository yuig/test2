package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes2.dex */
public final class n1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16665b;

    public /* synthetic */ n1(Object obj, int i13) {
        this.f16664a = i13;
        this.f16665b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i13, long j13) {
        j1 j1Var;
        int i14 = this.f16664a;
        Object obj = this.f16665b;
        switch (i14) {
            case 0:
                if (i13 == -1 || (j1Var = ((ListPopupWindow) obj).f16374c) == null) {
                    return;
                }
                j1Var.f16611h = false;
                return;
            default:
                ((SearchView) obj).f16425p.getText();
                throw null;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
