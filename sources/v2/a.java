package v2;

import android.view.View;
import android.view.autofill.AutofillManager;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final View f123845a;

    /* renamed from: b, reason: collision with root package name */
    public final e f123846b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f123847c;

    public a(View view, e eVar) {
        this.f123845a = view;
        this.f123846b = eVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.".toString());
        }
        this.f123847c = autofillManager;
        view.setImportantForAutofill(1);
    }
}
