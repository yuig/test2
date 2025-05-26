package me0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class a extends te0.a {

    /* renamed from: d, reason: collision with root package name */
    public final String f87038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Integer num, String id3) {
        super(context, num, 4);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f87038d = id3;
    }
}
