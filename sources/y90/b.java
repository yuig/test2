package y90;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class b implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f138129b;

    public /* synthetic */ b(int i13, Function1 function1) {
        this.f138128a = i13;
        this.f138129b = function1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i13 = this.f138128a;
        Function1 function1 = this.f138129b;
        switch (i13) {
            case 0:
                function1.invoke(editable != null ? editable.toString() : null);
                break;
            default:
                function1.invoke(editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
    }
}
