package qj;

import android.graphics.Outline;
import android.graphics.Path;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public abstract class a {
    public static void a(@NonNull Outline outline, @NonNull Path path) {
        outline.setConvexPath(path);
    }
}
