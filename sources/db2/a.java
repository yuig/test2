package db2;

import android.view.View;
import bs1.c;
import kg.n;

/* loaded from: classes4.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f54302a;

    public a(boolean z13) {
        this.f54302a = z13;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n.a(view);
        if (this.f54302a) {
            c.m0(view).onBackPressed();
        }
    }
}
