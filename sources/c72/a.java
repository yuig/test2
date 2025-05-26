package c72;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lc72/a;", "", "", "", "a", "Ljava/util/Map;", "effectData", "shuffles-pinterest_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("effect_data")
    @NotNull
    private final Map<String, Object> effectData;

    public a(Map effectData) {
        Intrinsics.checkNotNullParameter(effectData, "effectData");
        this.effectData = effectData;
    }
}
