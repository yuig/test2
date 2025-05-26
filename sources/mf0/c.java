package mf0;

import android.app.Dialog;
import android.content.Context;

/* loaded from: classes.dex */
public final class c extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f87091a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Context context, int i13) {
        super(context, i13);
        this.f87091a = fVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        this.f87091a.b7();
    }
}
