package q5;

import android.view.ContentInfo;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class t0 {
    public static String[] a(@NonNull View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static g b(@NonNull View view, @NonNull g gVar) {
        ContentInfo c13 = gVar.f102435a.c();
        Objects.requireNonNull(c13);
        ContentInfo performReceiveContent = view.performReceiveContent(c13);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == c13 ? gVar : new g(new gc.c(performReceiveContent));
    }
}
