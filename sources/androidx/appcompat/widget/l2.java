package androidx.appcompat.widget;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes2.dex */
public final class l2 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f16638a;

    public l2(SearchView searchView) {
        this.f16638a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kg.n.a(view);
        SearchView searchView = this.f16638a;
        ImageView imageView = searchView.f16429t;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f16425p;
        if (view == imageView) {
            searchView.A(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.a(true);
        } else {
            if (view == searchView.f16431v) {
                searchView.u();
                return;
            }
            if (view == searchView.f16430u) {
                searchView.v();
            } else if (view != searchView.f16432w && view == searchAutoComplete) {
                searchView.t();
            }
        }
    }
}
