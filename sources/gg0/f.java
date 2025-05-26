package gg0;

import com.pinterest.education.view.EducationActionPromptView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64928i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ EducationActionPromptView f64929j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(EducationActionPromptView educationActionPromptView, int i13) {
        super(1);
        this.f64928i = i13;
        this.f64929j = educationActionPromptView;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f64928i;
        EducationActionPromptView educationActionPromptView = this.f64929j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = EducationActionPromptView.f44977y;
                return rn1.a.y(it, bs1.c.h2(educationActionPromptView.k().f58870m), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 1:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, d7.g.q(educationActionPromptView.getResources(), vb2.c.wrong_email, "getString(...)"), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, d7.g.q(educationActionPromptView.getResources(), jg0.e.go_to_phone_settings, "getString(...)"), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f64928i) {
            case 1:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = EducationActionPromptView.f44977y;
                break;
        }
        return b((rn1.a) obj);
    }
}
