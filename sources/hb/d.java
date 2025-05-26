package hb;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final d f68489i = new d(1);

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        Intrinsics.checkNotNullParameter(require, "$this$require");
        boolean z13 = true;
        if (require.getType() != 1 && require.getType() != 2) {
            z13 = false;
        }
        return Boolean.valueOf(z13);
    }
}
