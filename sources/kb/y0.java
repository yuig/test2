package kb;

import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f79054a;

    /* renamed from: b, reason: collision with root package name */
    public final tb.s f79055b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f79056c;

    public y0(UUID id3, tb.s workSpec, Set tags) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f79054a = id3;
        this.f79055b = workSpec;
        this.f79056c = tags;
    }
}
