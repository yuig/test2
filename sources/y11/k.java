package y11;

import android.text.Editable;
import android.text.TextWatcher;
import com.pinterest.feature.pin.edit.view.AttributeInputTextViewLegacy;

/* loaded from: classes5.dex */
public final class k implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AttributeInputTextViewLegacy f136656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f136657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f136658c;

    public k(AttributeInputTextViewLegacy attributeInputTextViewLegacy, int i13, int i14) {
        this.f136656a = attributeInputTextViewLegacy;
        this.f136657b = i13;
        this.f136658c = i14;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        if (charSequence != null) {
            this.f136656a.L(charSequence.length() >= this.f136657b ? Integer.valueOf(this.f136658c) : null);
        }
    }
}
