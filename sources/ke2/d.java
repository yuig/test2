package ke2;

import android.util.SparseArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final i f79319a;

    /* renamed from: b, reason: collision with root package name */
    public b f79320b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f79321c;

    public d(i sticker, b layout) {
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f79321c = new SparseArray();
        this.f79319a = sticker;
        this.f79320b = layout;
    }
}
