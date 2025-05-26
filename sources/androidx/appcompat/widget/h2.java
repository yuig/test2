package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* loaded from: classes2.dex */
public final class h2 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f16580a;

    public h2(SearchView searchView) {
        this.f16580a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        SearchView searchView = this.f16580a;
        TextUtils.isEmpty(searchView.f16425p.getText());
        searchView.f16430u.setVisibility(8);
        searchView.f16432w.setVisibility(8);
        searchView.x();
        searchView.f16428s.setVisibility(8);
        if (searchView.G != null && !TextUtils.equals(charSequence, searchView.N)) {
            searchView.G.a(charSequence.toString());
        }
        searchView.N = charSequence.toString();
    }
}
