package y9;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class j extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g jankStats, View view) {
        super(jankStats, view);
        Intrinsics.checkNotNullParameter(jankStats, "jankStats");
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
