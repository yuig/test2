package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class n2 implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f16666a;

    public n2(SearchView searchView) {
        this.f16666a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
        this.f16666a.v();
        return true;
    }
}
