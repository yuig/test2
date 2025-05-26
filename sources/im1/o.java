package im1;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.firebase.messaging.q;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class o implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f72677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kl2.m f72678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kl2.l f72679c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.m f72680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f72681e;

    public o(q qVar, kl2.m mVar, kl2.l lVar, kl2.m mVar2, Function1 function1) {
        this.f72677a = qVar;
        this.f72678b = mVar;
        this.f72679c = lVar;
        this.f72680d = mVar2;
        this.f72681e = function1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f72677a.s((gm1.c) this.f72681e.invoke(editable));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        this.f72677a.s((gm1.c) this.f72678b.c(charSequence, Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15)));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        this.f72679c.invoke(charSequence, Integer.valueOf(i13), Integer.valueOf(i15));
        this.f72677a.s((gm1.c) this.f72680d.c(charSequence, Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15)));
    }
}
