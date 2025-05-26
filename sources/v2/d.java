package v2;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d extends AutofillManager.AutofillCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final d f123850a = new d();

    public final void a(@NotNull a aVar) {
        aVar.f123847c.registerCallback(this);
    }

    public final void b(@NotNull a aVar) {
        aVar.f123847c.unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(View view, int i13, int i14) {
        super.onAutofillEvent(view, i13, i14);
        Log.d("Autofill Status", i14 != 1 ? i14 != 2 ? i14 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
