package h;

import android.content.Intent;
import androidx.activity.o;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends a {
    @Override // h.a
    public final Intent a(o context, Object obj) {
        Intent input = (Intent) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // h.a
    public final Object c(Intent intent, int i13) {
        return new ActivityResult(intent, i13);
    }
}
