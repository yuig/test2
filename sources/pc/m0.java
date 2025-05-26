package pc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m0 extends q {

    /* renamed from: h, reason: collision with root package name */
    public final List f99588h;

    /* renamed from: i, reason: collision with root package name */
    public final List f99589i;

    /* renamed from: j, reason: collision with root package name */
    public final List f99590j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(String name, kotlin.collections.q0 keyFields, List list, kotlin.collections.q0 embeddedFields) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(keyFields, "keyFields");
        Intrinsics.checkNotNullParameter(list, "implements");
        Intrinsics.checkNotNullParameter(embeddedFields, "embeddedFields");
        this.f99588h = keyFields;
        this.f99589i = list;
    }
}
