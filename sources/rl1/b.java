package rl1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f108524a = new b();

    @Override // rl1.c
    public final int a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return dl2.b.v0(eo1.a.comp_avatar_is_vr, context) ? eo1.b.comp_avatar_background_color_5 : eo1.b.color_themed_background_secondary_base;
    }
}
