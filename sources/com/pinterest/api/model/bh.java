package com.pinterest.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bh extends pu {

    /* renamed from: c, reason: collision with root package name */
    public final String f36103c;

    /* renamed from: d, reason: collision with root package name */
    public final String f36104d;

    /* renamed from: e, reason: collision with root package name */
    public final int f36105e;

    public bh() {
        this(null, null, null, 0, 15, null);
    }

    public /* synthetic */ bh(String str, String str2, String str3, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? "" : str3, (i14 & 8) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(@NotNull String path, @NotNull String latestMediaPath, @NotNull String name, int i13) {
        super(path);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(latestMediaPath, "latestMediaPath");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f36103c = latestMediaPath;
        this.f36104d = name;
        this.f36105e = i13;
    }
}
