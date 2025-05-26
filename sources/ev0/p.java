package ev0;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes5.dex */
public final class p implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f60269a;

    public p(s sVar) {
        this.f60269a = sVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
        if (i13 != 6) {
            return false;
        }
        s sVar = this.f60269a;
        hf0.b.k(sVar.L());
        sVar.Z();
        return true;
    }
}
