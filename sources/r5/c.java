package r5;

import a8.v;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.search.SearchBar;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final b f106210a;

    public c(b bVar) {
        this.f106210a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f106210a.equals(((c) obj).f106210a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f106210a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z13) {
        v vVar = (v) this.f106210a;
        int i13 = vVar.f1464a;
        Object obj = vVar.f1465b;
        switch (i13) {
            case 16:
                int i14 = SearchBar.f32944m0;
                ((SearchBar) obj).setFocusableInTouchMode(z13);
                break;
            default:
                com.google.android.material.textfield.k kVar = (com.google.android.material.textfield.k) obj;
                AutoCompleteTextView autoCompleteTextView = kVar.f33237h;
                if (autoCompleteTextView != null && autoCompleteTextView.getInputType() == 0) {
                    int i15 = z13 ? 2 : 1;
                    WeakHashMap weakHashMap = v0.f102521a;
                    kVar.f33274d.setImportantForAccessibility(i15);
                    break;
                }
                break;
        }
    }
}
