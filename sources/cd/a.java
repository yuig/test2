package cd;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f27546i = new a(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SimpleDateFormat("HH:mm:ss.SSS", Locale.ROOT);
    }
}
