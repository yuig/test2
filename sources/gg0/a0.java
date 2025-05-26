package gg0;

import com.pinterest.education.view.EducationToolTipView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64911i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ EducationToolTipView f64912j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(EducationToolTipView educationToolTipView, int i13) {
        super(0);
        this.f64911i = i13;
        this.f64912j = educationToolTipView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EducationToolTipView educationToolTipView = this.f64912j;
        int i13 = this.f64911i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        int i14 = EducationToolTipView.f45022m;
                        educationToolTipView.c();
                        break;
                    default:
                        int i15 = EducationToolTipView.f45022m;
                        educationToolTipView.b();
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        int i16 = EducationToolTipView.f45022m;
                        educationToolTipView.c();
                        break;
                    default:
                        int i17 = EducationToolTipView.f45022m;
                        educationToolTipView.b();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
