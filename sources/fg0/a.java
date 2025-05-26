package fg0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.education.ActionPromptView;
import com.pinterest.education.user.signals.UserSignalsActionPromptView;
import m60.w;
import so.jb;
import so.oa;

/* loaded from: classes5.dex */
public abstract class a extends ActionPromptView {

    /* renamed from: n, reason: collision with root package name */
    public boolean f62110n;

    public a(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        e();
    }

    @Override // lu.a0
    public final void e() {
        if (this.f62110n) {
            return;
        }
        this.f62110n = true;
        UserSignalsActionPromptView userSignalsActionPromptView = (UserSignalsActionPromptView) this;
        jb jbVar = (jb) ((h) generatedComponent());
        oa oaVar = jbVar.f113483a;
        userSignalsActionPromptView.f44952e = (w) oaVar.f113885r0.get();
        userSignalsActionPromptView.f44953f = (zf0.f) oaVar.f113723hd.get();
        userSignalsActionPromptView.f44966t = (r20.a) jbVar.f113485c.f114273e3.get();
        userSignalsActionPromptView.f44967u = (b60.b) oaVar.f113850p0.get();
    }
}
