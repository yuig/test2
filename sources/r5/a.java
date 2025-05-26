package r5;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes3.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f106207a;

    /* renamed from: b, reason: collision with root package name */
    public final e f106208b;

    /* renamed from: c, reason: collision with root package name */
    public final int f106209c;

    public a(int i13, e eVar, int i14) {
        this.f106207a = i13;
        this.f106208b = eVar;
        this.f106209c = i14;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        kg.n.a(view);
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f106207a);
        this.f106208b.f106231a.performAction(this.f106209c, bundle);
    }
}
