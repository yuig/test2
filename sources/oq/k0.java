package oq;

import android.view.View;
import com.pinterest.gestalt.text.GestaltText;

/* loaded from: classes3.dex */
public final class k0 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f97075b;

    public /* synthetic */ k0(m0 m0Var, int i13) {
        this.f97074a = i13;
        this.f97075b = m0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        CharSequence text;
        int i24 = this.f97074a;
        m0 m0Var = this.f97075b;
        switch (i24) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                GestaltText gestaltText = m0Var.f97087h;
                ((x0) m0Var.f97081b).P0((gestaltText == null || (text = gestaltText.getText()) == null || text.length() <= 0) ? false : true);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                GestaltText gestaltText2 = m0Var.f97086g;
                ((x0) m0Var.f97081b).P0((gestaltText2 != null ? gestaltText2.getLineCount() : 0) > m0.a(m0Var));
                break;
        }
    }
}
