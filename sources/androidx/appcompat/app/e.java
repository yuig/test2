package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;

/* loaded from: classes2.dex */
public final class e implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15997c;

    public /* synthetic */ e(int i13, Object obj, Object obj2) {
        this.f15995a = i13;
        this.f15997c = obj;
        this.f15996b = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        int i14 = this.f15995a;
        Object obj = this.f15997c;
        switch (i14) {
            case 0:
                f fVar = (f) obj;
                DialogInterface.OnClickListener onClickListener = fVar.f16011l;
                i iVar = (i) this.f15996b;
                onClickListener.onClick(iVar.f16027b, i13);
                if (!fVar.f16013n) {
                    iVar.f16027b.dismiss();
                    break;
                }
                break;
            default:
                androidx.appcompat.widget.h0 h0Var = (androidx.appcompat.widget.h0) obj;
                h0Var.G.setSelection(i13);
                AppCompatSpinner appCompatSpinner = h0Var.G;
                if (appCompatSpinner.getOnItemClickListener() != null) {
                    appCompatSpinner.performItemClick(view, i13, h0Var.D.getItemId(i13));
                }
                h0Var.dismiss();
                break;
        }
    }
}
