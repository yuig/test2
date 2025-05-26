package gg0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.education.ActionPromptView;
import com.pinterest.education.view.EducationActionPromptView;
import so.jb;
import so.oa;
import x02.x2;

/* loaded from: classes5.dex */
public abstract class m0 extends ActionPromptView {

    /* renamed from: n, reason: collision with root package name */
    public boolean f64951n;

    public m0(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        e();
    }

    @Override // lu.a0
    public final void e() {
        if (this.f64951n) {
            return;
        }
        this.f64951n = true;
        EducationActionPromptView educationActionPromptView = (EducationActionPromptView) this;
        jb jbVar = (jb) ((g) generatedComponent());
        oa oaVar = jbVar.f113483a;
        educationActionPromptView.f44952e = (m60.w) oaVar.f113885r0.get();
        educationActionPromptView.f44953f = (zf0.f) oaVar.f113723hd.get();
        educationActionPromptView.f44984u = (lu1.b) oaVar.f113961v5.get();
        educationActionPromptView.f44985v = (x2) oaVar.f113800m3.get();
        educationActionPromptView.f44986w = (r20.a) jbVar.f113485c.f114273e3.get();
        educationActionPromptView.f44987x = (b60.b) oaVar.f113850p0.get();
    }
}
