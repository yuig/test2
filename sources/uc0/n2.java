package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n2 extends p2 {

    /* renamed from: c, reason: collision with root package name */
    public final String f121835c;

    /* renamed from: d, reason: collision with root package name */
    public final int f121836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(String title, String dimension, int i13) {
        super(title, null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(dimension, "dimension");
        this.f121835c = dimension;
        this.f121836d = i13;
    }
}
