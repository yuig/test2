package fn1;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.pinterest.gestalt.selectList.GestaltSelectList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62692i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSelectList f62693j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(GestaltSelectList gestaltSelectList, int i13) {
        super(0);
        this.f62692i = i13;
        this.f62693j = gestaltSelectList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f62692i;
        GestaltSelectList gestaltSelectList = this.f62693j;
        switch (i13) {
            case 0:
                return (TextInputLayout) gestaltSelectList.findViewById(q.text_input_layout);
            default:
                return (AutoCompleteTextView) gestaltSelectList.findViewById(q.select_list_field);
        }
    }
}
