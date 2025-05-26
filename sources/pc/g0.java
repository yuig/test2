package pc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g0 extends q {

    /* renamed from: h, reason: collision with root package name */
    public final List f99558h;

    /* renamed from: i, reason: collision with root package name */
    public final List f99559i;

    /* renamed from: j, reason: collision with root package name */
    public final List f99560j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(String name, List keyFields, List list, List embeddedFields) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(keyFields, "keyFields");
        Intrinsics.checkNotNullParameter(list, "implements");
        Intrinsics.checkNotNullParameter(embeddedFields, "embeddedFields");
        this.f99558h = keyFields;
        this.f99559i = list;
        this.f99560j = embeddedFields;
    }
}
