package sn1;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.i0;

/* loaded from: classes2.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f113312i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f113313j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(AppCompatTextView appCompatTextView, int i13) {
        super(1);
        this.f113312i = i13;
        this.f113313j = appCompatTextView;
    }

    public final void b(i0 text) {
        int i13 = this.f113312i;
        AppCompatTextView appCompatTextView = this.f113313j;
        switch (i13) {
            case 0:
                if (text != null) {
                    Context context = appCompatTextView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    appCompatTextView.setContentDescription(text.a(context));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(text, "text");
                Context context2 = appCompatTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                appCompatTextView.setText(text.a(context2));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AppCompatTextView appCompatTextView = this.f113313j;
        int i13 = this.f113312i;
        switch (i13) {
            case 0:
                b((i0) obj);
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                switch (i13) {
                    case 1:
                        appCompatTextView.setId(intValue);
                        break;
                    case 4:
                        appCompatTextView.setVisibility(intValue);
                        break;
                    default:
                        appCompatTextView.setMaxLines(intValue);
                        break;
                }
                break;
            case 2:
                Integer num = (Integer) obj;
                appCompatTextView.setLabelFor(num != null ? num.intValue() : -1);
                break;
            case 3:
                b((i0) obj);
                break;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                switch (i13) {
                    case 1:
                        appCompatTextView.setId(intValue2);
                        break;
                    case 4:
                        appCompatTextView.setVisibility(intValue2);
                        break;
                    default:
                        appCompatTextView.setMaxLines(intValue2);
                        break;
                }
                break;
            default:
                int intValue3 = ((Number) obj).intValue();
                switch (i13) {
                    case 1:
                        appCompatTextView.setId(intValue3);
                        break;
                    case 4:
                        appCompatTextView.setVisibility(intValue3);
                        break;
                    default:
                        appCompatTextView.setMaxLines(intValue3);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
