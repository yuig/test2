package kj;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.appcompat.app.q0;
import fj.l;

/* loaded from: classes3.dex */
public class i extends q0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f79846q = 0;

    @Override // androidx.appcompat.app.q0, androidx.fragment.app.q
    public final Dialog O6(Bundle bundle) {
        Context context = getContext();
        int i13 = this.f18410f;
        if (i13 == 0) {
            TypedValue typedValue = new TypedValue();
            i13 = context.getTheme().resolveAttribute(fj.c.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : l.Theme_Design_Light_BottomSheetDialog;
        }
        h hVar = new h(context, i13);
        hVar.f79839j = true;
        hVar.f79840k = true;
        hVar.f79845p = new f(hVar, 0);
        hVar.d().j(1);
        hVar.f79843n = hVar.getContext().getTheme().obtainStyledAttributes(new int[]{fj.c.enableEdgeToEdge}).getBoolean(0, false);
        return hVar;
    }

    @Override // androidx.fragment.app.q
    public final void dismiss() {
        Dialog dialog = this.f18416l;
        if (dialog instanceof h) {
            h hVar = (h) dialog;
            if (hVar.f79835f == null) {
                hVar.g();
            }
            boolean z13 = hVar.f79835f.I;
        }
        N6(false, false);
    }
}
