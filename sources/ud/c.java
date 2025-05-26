package ud;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i13) {
        super(context, ParcelFileDescriptor.class);
        if (i13 != 1) {
        } else {
            super(context, InputStream.class);
        }
    }
}
