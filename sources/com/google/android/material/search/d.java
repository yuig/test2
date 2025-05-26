package com.google.android.material.search;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f32991b;

    public /* synthetic */ d(SearchView searchView, int i13) {
        this.f32990a = i13;
        this.f32991b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f32990a;
        SearchView searchView = this.f32991b;
        switch (i13) {
            case 0:
                searchView.l();
                break;
            case 1:
                EditText editText = searchView.f32968j;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                }
                Context context = editText.getContext();
                Object obj = d5.a.f53679a;
                ((InputMethodManager) context.getSystemService(InputMethodManager.class)).showSoftInput(editText, 1);
                break;
            case 2:
                EditText editText2 = searchView.f32968j;
                editText2.clearFocus();
                SearchBar searchBar = searchView.f32978t;
                if (searchBar != null) {
                    searchBar.requestFocus();
                }
                Context context2 = editText2.getContext();
                Object obj2 = d5.a.f53679a;
                InputMethodManager inputMethodManager = (InputMethodManager) context2.getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(editText2.getWindowToken(), 0);
                    break;
                }
                break;
            default:
                searchView.i();
                break;
        }
    }
}
