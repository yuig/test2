package pe0;

import android.view.View;
import com.pinterest.design.brio.widget.PinterestEditText;

/* loaded from: classes5.dex */
public final class c implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinterestEditText f99929a;

    public c(PinterestEditText pinterestEditText) {
        this.f99929a = pinterestEditText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z13) {
        PinterestEditText pinterestEditText = this.f99929a;
        if (z13) {
            pinterestEditText.setCompoundDrawablesRelative(null, null, pinterestEditText.f44838j ? pinterestEditText.f44840l : null, null);
            if (pinterestEditText.f44839k != null) {
                int[] iArr = pinterestEditText.f44841m;
                pinterestEditText.setPaddingRelative(iArr[0], iArr[1], iArr[2], iArr[3]);
                return;
            }
            return;
        }
        pinterestEditText.setCompoundDrawablesRelative(pinterestEditText.f44839k, null, null, null);
        if (pinterestEditText.f44839k != null) {
            int[] iArr2 = pinterestEditText.f44841m;
            pinterestEditText.setPaddingRelative(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
        }
    }
}
