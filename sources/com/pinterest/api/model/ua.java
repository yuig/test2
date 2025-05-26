package com.pinterest.api.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ua implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final List f42485a;

    public ua(@NotNull List<? extends ta> templates) {
        Intrinsics.checkNotNullParameter(templates, "templates");
        this.f42485a = templates;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        String simpleName = ua.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ua) && Intrinsics.d(this.f42485a, ((ua) obj).f42485a);
    }

    public final int hashCode() {
        return this.f42485a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("BoardVideoTemplateList(templates="), this.f42485a, ")");
    }
}
