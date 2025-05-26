package com.pinterest.api.model;

import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d30 extends pu {

    /* renamed from: c, reason: collision with root package name */
    public final String f36647c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f36648d;

    public d30() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.pinterest.api.model.pu
    public final boolean g() {
        return ((Number) h().f80346a).intValue() > 0 && ((Number) h().f80347b).intValue() > 0;
    }

    public final Pair h() {
        return (Pair) this.f36648d.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d30(@NotNull String path, @NotNull String title) {
        super(path);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f36647c = title;
        this.f36648d = xk2.m.b(new c30(path));
    }

    public /* synthetic */ d30(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2);
    }
}
