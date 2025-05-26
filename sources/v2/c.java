package v2;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f123849a = new c();

    public final AutofillId a(@NotNull ViewStructure viewStructure) {
        return viewStructure.getAutofillId();
    }

    public final boolean b(@NotNull AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    public final boolean c(@NotNull AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public final boolean d(@NotNull AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    public final boolean e(@NotNull AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public final void f(@NotNull ViewStructure viewStructure, @NotNull String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public final void g(@NotNull ViewStructure viewStructure, @NotNull AutofillId autofillId, int i13) {
        viewStructure.setAutofillId(autofillId, i13);
    }

    public final void h(@NotNull ViewStructure viewStructure, int i13) {
        viewStructure.setAutofillType(i13);
    }

    @NotNull
    public final CharSequence i(@NotNull AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
