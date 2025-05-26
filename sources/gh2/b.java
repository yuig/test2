package gh2;

import android.os.Environment;
import android.os.StatFs;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f65023i = new b(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes());
    }
}
