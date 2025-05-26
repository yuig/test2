package v00;

import java.text.DateFormat;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import vb0.g;

/* loaded from: classes3.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f123767i = new b(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (g.f125463b == null) {
            g.f125463b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
        }
        return g.f125463b;
    }
}
