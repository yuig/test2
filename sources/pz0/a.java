package pz0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a extends b {

    /* renamed from: c, reason: collision with root package name */
    public final String f101739c;

    /* renamed from: d, reason: collision with root package name */
    public final String f101740d;

    /* renamed from: e, reason: collision with root package name */
    public final List f101741e;

    /* renamed from: f, reason: collision with root package name */
    public final List f101742f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull String subtitle, @NotNull String description, @NotNull List<String> primaryStyles, @NotNull List<String> secondaryStyles) {
        super(0, null);
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryStyles, "primaryStyles");
        Intrinsics.checkNotNullParameter(secondaryStyles, "secondaryStyles");
        this.f101739c = subtitle;
        this.f101740d = description;
        this.f101741e = primaryStyles;
        this.f101742f = secondaryStyles;
    }
}
