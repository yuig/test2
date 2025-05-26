package pc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends s {

    /* renamed from: a, reason: collision with root package name */
    public final String f99591a;

    /* renamed from: b, reason: collision with root package name */
    public final List f99592b;

    /* renamed from: c, reason: collision with root package name */
    public final List f99593c;

    /* renamed from: d, reason: collision with root package name */
    public final List f99594d;

    public n(String typeCondition, List possibleTypes, kotlin.collections.q0 condition, List selections) {
        Intrinsics.checkNotNullParameter(typeCondition, "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes, "possibleTypes");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(selections, "selections");
        this.f99591a = typeCondition;
        this.f99592b = possibleTypes;
        this.f99594d = selections;
    }
}
