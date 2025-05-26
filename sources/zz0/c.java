package zz0;

import com.pinterest.api.model.p20;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public final String f143150c;

    /* renamed from: d, reason: collision with root package name */
    public final int f143151d;

    /* renamed from: e, reason: collision with root package name */
    public final p20 f143152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull String insightId, int i13, @NotNull p20 style) {
        super(1, null);
        Intrinsics.checkNotNullParameter(insightId, "insightId");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f143150c = insightId;
        this.f143151d = i13;
        this.f143152e = style;
    }
}
