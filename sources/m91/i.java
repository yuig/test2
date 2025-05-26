package m91;

import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class i extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String initialText, int i13) {
        super(b52.c.contact_name, bd1.b.CONTACT_NAME_FIELD, x0.add, initialText);
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(initialText, "initialText");
            super(b52.c.preferred_gender, bd1.b.CUSTOM_GENDER_FIELD, x0.add, initialText);
        } else if (i13 != 2) {
            Intrinsics.checkNotNullParameter(initialText, "initialText");
        } else {
            Intrinsics.checkNotNullParameter(initialText, "initialText");
            super(x0.email, bd1.b.EMAIL_FIELD, x0.add, initialText);
        }
    }
}
